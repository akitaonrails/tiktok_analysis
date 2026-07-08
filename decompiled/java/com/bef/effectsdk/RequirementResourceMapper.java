package com.bef.effectsdk;

/* JADX INFO: loaded from: classes21.dex */
public final class RequirementResourceMapper {
    public static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    public static String[] peekResourcesNeededByRequirements(String[] strArr) {
        return nativePeekResourcesNeededByRequirements(strArr);
    }
}
