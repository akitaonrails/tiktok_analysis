package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0waI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786280waI {
    public static EnumC1786290waJ LIZ(String str) {
        if (str == null) {
            return EnumC1786290waJ.UNKNOWN;
        }
        for (EnumC1786290waJ enumC1786290waJ : EnumC1786290waJ.values()) {
            if (Intrinsics.LJFF(enumC1786290waJ.getEntranceValue(), str)) {
                return enumC1786290waJ;
            }
        }
        return EnumC1786290waJ.UNKNOWN;
    }
}
