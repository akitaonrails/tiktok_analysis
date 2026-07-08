package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1736960vIk {
    public static EnumC1737230vJB LIZ(EnumC1736950vIj enumC1736950vIj) {
        int i = C1736970vIl.LIZ[enumC1736950vIj.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC1737230vJB.ICON_EDIT;
                }
                throw new C1954807lC();
            }
            return EnumC1737230vJB.MALE;
        }
        return EnumC1737230vJB.FEMALE;
    }

    public static EnumC1736950vIj LIZIZ(String str) {
        EnumC1736950vIj enumC1736950vIj = EnumC1736950vIj.EFFECT_ICON_FEMALE;
        if (!Intrinsics.LJFF(str, enumC1736950vIj.getTypeVal())) {
            EnumC1736950vIj enumC1736950vIj2 = EnumC1736950vIj.EFFECT_ICON_MALE;
            if (!Intrinsics.LJFF(str, enumC1736950vIj2.getTypeVal())) {
                return EnumC1736950vIj.NONE;
            }
            return enumC1736950vIj2;
        }
        return enumC1736950vIj;
    }
}
