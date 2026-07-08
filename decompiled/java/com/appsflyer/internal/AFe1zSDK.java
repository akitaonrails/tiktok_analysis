package com.appsflyer.internal;

import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class AFe1zSDK {
    public static boolean AFInAppEventType(String str, String str2) {
        int iValueOf = AFc1rSDK.valueOf(str);
        int iValueOf2 = AFc1rSDK.valueOf(str2);
        Pair<Integer, Integer> pairValues = AFe1vSDK.values(str2);
        Pair<Integer, Integer> pairValueOf = AFe1vSDK.valueOf(str2);
        if (iValueOf2 != -1 && pairValues == null) {
            if (iValueOf2 == iValueOf) {
                return true;
            }
            return false;
        }
        if (pairValueOf != null) {
            if (pairValueOf.getFirst().intValue() <= iValueOf && iValueOf <= pairValueOf.getSecond().intValue()) {
                return true;
            }
            return false;
        }
        if (pairValues != null && pairValues.getFirst().intValue() <= iValueOf && iValueOf <= pairValues.getSecond().intValue()) {
            return true;
        }
        return false;
    }
}
