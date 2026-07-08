package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520930pgJ {
    public static EnumC1520910pgH LIZ(String str) {
        EnumC1520910pgH enumC1520910pgH = EnumC1520910pgH.WEB;
        if (!Intrinsics.LJFF(str, enumC1520910pgH.getType())) {
            EnumC1520910pgH enumC1520910pgH2 = EnumC1520910pgH.LYNX;
            if (!Intrinsics.LJFF(str, enumC1520910pgH2.getType())) {
                EnumC1520910pgH enumC1520910pgH3 = EnumC1520910pgH.SDUI;
                if (!Intrinsics.LJFF(str, enumC1520910pgH3.getType())) {
                    return EnumC1520910pgH.UNKNOWN;
                }
                return enumC1520910pgH3;
            }
            return enumC1520910pgH2;
        }
        return enumC1520910pgH;
    }
}
