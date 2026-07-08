package com.appsflyer.internal;

import X.C08FF;

/* JADX INFO: loaded from: classes31.dex */
public enum AFg1aSDK {
    PRIVACY_SANDBOX("Privacy Sandbox"),
    OTHER("Other"),
    HTTP_CLIENT("HTTP Client"),
    QUEUE("Queue"),
    CACHE("Cache"),
    REMOTE_CONTROL("CFG"),
    DDL("DDL"),
    REFERRER("Referrer"),
    CROSS_PROMOTION("Cross Promotion"),
    EXCEPTION_MANAGER("Exception Manager"),
    ATTRIBUTION("Attribution"),
    RD("RD"),
    ENGAGEMENT("Engagement"),
    ANTI_FRAUD("Anti Fraud"),
    PUBLIC_API("Public API"),
    AD_REVENUE("Ad Revenue"),
    SDK_SETTERS("Setter"),
    PREDICT("Predict"),
    DEVICE_DATA("Device Data"),
    SECURITY("Security"),
    GENERAL("General"),
    PREINSTALL("Preinstall"),
    UNINSTALL("Uninstall"),
    PURCHASE_VALIDATION("Purchase Validation"),
    DMA("DMA"),
    PROXY("PROXY");

    public final String AFInAppEventParameterName;

    public static AFg1aSDK valueOf(String str) {
        return (AFg1aSDK) C08FF.LIZ(AFg1aSDK.class, str);
    }

    AFg1aSDK(String str) {
        this.AFInAppEventParameterName = str;
    }
}
