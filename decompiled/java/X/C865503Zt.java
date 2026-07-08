package X;

/* JADX INFO: renamed from: X.03Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C865503Zt {
    public static String LIZ(EnumC865103Zp enumC865103Zp) {
        if (enumC865103Zp != null) {
            int i = C865403Zs.LIZ[enumC865103Zp.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "SELECT_INSTALLMENT_PLAN";
                        }
                        return "";
                    }
                    return "ADD_NEW_CCI_BR";
                }
                return "ADD_NEW_CCI_US";
            }
            return "ADD_NEW_CCI_SEA";
        }
        return "";
    }
}
