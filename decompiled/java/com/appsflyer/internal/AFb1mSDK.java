package com.appsflyer.internal;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1mSDK {
    public static String AFInAppEventParameterName;
    public static String AFKeystoreWrapper;

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null) {
            valueOf(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().i().AFLogger);
        }
    }

    public static void valueOf(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && i != str.length() - 1) {
                sb.append("*");
            } else {
                sb.append(str.charAt(i));
            }
        }
        AFInAppEventParameterName = sb.toString();
    }
}
