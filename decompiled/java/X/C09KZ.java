package X;

/* JADX INFO: renamed from: X.09KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09KZ {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(X.C1304160k2g r3) {
        /*
            X.09Ka r0 = r3.LJIIIZ
            com.bytedance.amg.minigameruntime.api.GameDirectoryConfig r0 = r0.LIZIZ
            java.lang.String r0 = r0.path
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            int r0 = r1.length()
            if (r0 <= 0) goto L1d
            r0 = 1
        L15:
            if (r0 != 0) goto L18
            r1 = 0
        L18:
            java.lang.String r3 = ""
            if (r1 == 0) goto L54
            goto L1f
        L1d:
            r0 = 0
            goto L15
        L1f:
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Throwable -> L30
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L30
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L30
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L30
            goto L3c
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L3c:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r0 == 0) goto L4f
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r1)
            java.io.File r0 = r0.getAbsoluteFile()
            java.lang.String r2 = r0.getPath()
        L4f:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L54
            goto L55
        L54:
            r2 = r3
        L55:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r0 = r2.getBytes(r0)
            byte[] r2 = r1.digest(r0)
            Y.AObjectS109S0000000_3 r1 = new Y.AObjectS109S0000000_3
            r0 = 4
            r1.<init>(r0)
            java.lang.String r0 = X.C13LQ.LJJIJIL(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09KZ.LIZ(X.0k2g):java.lang.String");
    }
}
