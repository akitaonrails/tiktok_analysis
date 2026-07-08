package com.appsflyer.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class AFj1iSDK {
    public int AFInAppEventParameterName;
    public int AFKeystoreWrapper;
    public int values;

    public static void valueOf(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        int[][] iArr = AFj1nSDK.AFInAppEventType.valueOf;
        return ((iArr[0][(i >>> 24) & 255] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
