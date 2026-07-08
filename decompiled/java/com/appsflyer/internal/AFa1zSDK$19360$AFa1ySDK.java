package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes.dex */
public enum AFa1zSDK$19360$AFa1ySDK {
    XPOSED("xps"),
    FRIDA("frd");

    public String AFInAppEventParameterName;

    public static AFa1zSDK$19360$AFa1ySDK valueOf(String str) {
        return (AFa1zSDK$19360$AFa1ySDK) C08FF.LIZ(AFa1zSDK$19360$AFa1ySDK.class, str);
    }

    AFa1zSDK$19360$AFa1ySDK(String str) {
        this.AFInAppEventParameterName = str;
    }
}
