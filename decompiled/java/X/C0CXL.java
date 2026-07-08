package X;

/* JADX INFO: renamed from: X.0CXL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXL {
    public static Boolean LIZIZ;
    public static boolean LIZJ;
    public static final C0CXL LIZ = new C0CXL();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0CXK());
    public static final C01GW LJ = C452501pT.LIZIZ(new C294890Bh9());

    public static void LIZ() {
        if (C0A2J.LIZ == 1) {
            LIZJ = true;
        } else {
            LIZIZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            X.01GW r0 = X.C0CXL.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r3 = 0
            r0 = 1
            if (r1 != r0) goto L4a
            r2 = 1
        L11:
            java.lang.Boolean r0 = X.C0CXL.LIZIZ
            if (r0 == 0) goto L1f
            boolean r0 = r0.booleanValue()
        L19:
            if (r2 == 0) goto L1e
            if (r0 == 0) goto L1e
            r3 = 1
        L1e:
            return r3
        L1f:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.spi.HomePageCommonService> r0 = com.ss.android.ugc.aweme.spi.HomePageCommonService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.spi.HomePageCommonService r0 = (com.ss.android.ugc.aweme.spi.HomePageCommonService) r0
            boolean r0 = r0.LIZLLL()
            if (r0 == 0) goto L48
            X.0CUY r0 = X.C0CUY.LIZ
            r0.getClass()
            int r0 = X.C0CUY.LIZ()
            if (r0 == 0) goto L48
            r0 = 1
        L3d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C0CXL.LIZIZ = r0
            boolean r0 = r0.booleanValue()
            goto L19
        L48:
            r0 = 0
            goto L3d
        L4a:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CXL.LIZIZ():boolean");
    }

    public static boolean LIZJ() {
        return LIZIZ() && C315230CXh.LIZ() == 1;
    }
}
