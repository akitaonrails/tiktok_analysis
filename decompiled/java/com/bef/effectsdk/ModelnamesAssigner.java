package com.bef.effectsdk;

/* JADX INFO: loaded from: classes.dex */
public class ModelnamesAssigner {
    public static native int nativeSetAssignedModelNames(long j, String[] strArr, String[] strArr2);

    public static native int nativeSetAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr);

    public static int setAssignedModelNames(long j, String[] strArr, String[] strArr2) {
        return nativeSetAssignedModelNames(j, strArr, strArr2);
    }

    public static int setAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr) {
        return nativeSetAssignedModelNamesWithPriority(j, strArr, strArr2, iArr);
    }
}
