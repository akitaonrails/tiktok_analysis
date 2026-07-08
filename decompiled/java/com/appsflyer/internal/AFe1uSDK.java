package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum AFe1uSDK {
    TEXT("text/plain"),
    JSON("application/json"),
    OCTET_STREAM("application/octet-stream"),
    XML("application/xml"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    IMAGE_JPEG("image/jpeg"),
    IMAGE_PNG("image/png");

    public final String valueOf;

    public static AFe1uSDK valueOf(String str) {
        return (AFe1uSDK) C08FF.LIZ(AFe1uSDK.class, str);
    }

    AFe1uSDK(String str) {
        this.valueOf = str;
    }
}
