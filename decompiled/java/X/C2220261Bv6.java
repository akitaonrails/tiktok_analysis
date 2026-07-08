package X;

/* JADX INFO: renamed from: X.1Bv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2220261Bv6 {
    public long LIZ;

    public static String LIZ(int i) {
        return i != 1 ? i != 2 ? i == 3 ? "stuck" : "good" : "bad" : "good";
    }

    public static String LIZIZ(EnumC804620VhM enumC804620VhM) {
        int i = C804640VhO.LIZ[enumC804620VhM.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "none";
                }
                return "wifi";
            }
            return "4g";
        }
        return "3g";
    }
}
