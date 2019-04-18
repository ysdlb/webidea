package com.all.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

// 标识该类是一个Spring MVC controller处理器，用来创建处理http请求的对象。
@Controller
@RequestMapping("/tests")
public class TestController {
    // 用来映射web请求（访问路径和参数），用于类和方法，可继承类上的路径
    // 有value,produces,method等，不过有GETMapping等可以直接使用
    // 还可以使用wildcards，“？ * **”，{变量}
    @RequestMapping("case1_map_input")
    // 该方法的返回不会被解析为跳转，而是直接写入http响应正文。
    @ResponseBody
    public Map<String, String> testcase1_map_input(){
        // LinkedHashMap 保持顺序
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("key", "value");
        map.put("method", "by_return_map");
        map.put("isFile", "No");
        map.put("isResponseBody", "yes");
        return map;
    }
}
