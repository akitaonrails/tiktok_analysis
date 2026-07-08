package X;

/* JADX INFO: renamed from: X.10ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19361410ou {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.Double r10, X.EnumC19360410ok r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19361410ou.LIZIZ(java.lang.Double, X.10ok):java.lang.String");
    }

    public static EnumC984900bjk LIZ(double d, Double d2, EnumC19360610om enumC19360610om) {
        if (d2 == null) {
            return EnumC984900bjk.WIN;
        }
        if (d == d2.doubleValue()) {
            return null;
        }
        int i = C19360510ol.LIZIZ[enumC19360610om.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (d < d2.doubleValue()) {
                        return EnumC984900bjk.WIN;
                    }
                    return EnumC984900bjk.LOSE;
                }
                throw new C1954807lC();
            }
            if (d > d2.doubleValue()) {
                return EnumC984900bjk.WIN;
            }
            return EnumC984900bjk.LOSE;
        }
        return EnumC984900bjk.WIN;
    }
}
