package X;

/* JADX INFO: renamed from: X.0LCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCZ {
    public static final boolean LIZ(EnumC1412640mre enumC1412640mre, Boolean bool, String str, String str2) {
        if (C0C0A.LIZ() && enumC1412640mre == EnumC1412640mre.CUT_SAME && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (bool == null) {
                if (!C123100dR.LIZ(str) && !C123100dR.LIZ(str2)) {
                    return false;
                }
                return true;
            }
            if (!bool.booleanValue() && C123100dR.LIZ(str)) {
                return true;
            }
            if (bool.booleanValue() && C123100dR.LIZ(str2)) {
                return true;
            }
        }
        return false;
    }
}
