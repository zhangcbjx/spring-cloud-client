package com.learn.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController   
 * @Description: 
 * @author zhangcb  
 * @date 2018年11月7日 下午4:46:54 
 * @Copyright: 2018 www.yunqi.com Inc. All rights reserved.
 */
@RestController
@RequestMapping("/hello")
public class HelloAction {
	
	@RequestMapping (value = "get", method = RequestMethod.GET)
    public String get() {
	   System.out.println("服务提供端被调用");
       return "服务提供端调用后返回";
    }
}
