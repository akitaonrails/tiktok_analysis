package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0iLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239240iLy {
    public static EnumC1239210iLv LIZ(String str) {
        for (EnumC1239210iLv enumC1239210iLv : EnumC1239210iLv.values()) {
            if (u.LJIJI(enumC1239210iLv.getPassportName(), str, true)) {
                return enumC1239210iLv;
            }
        }
        return null;
    }
}
