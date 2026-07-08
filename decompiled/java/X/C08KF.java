package X;

/* JADX INFO: renamed from: X.08KF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08KF {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(X.C0VSP r6) throws java.lang.Throwable {
        /*
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L40
            r3.<init>(r6)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L40
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L3a
        Lf:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L3a
            r0 = -1
            if (r0 == r1) goto L1b
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L3a
            goto Lf
        L1b:
            r3.close()     // Catch: java.io.IOException -> L1f
            goto L23
        L1f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L23:
            java.lang.String r0 = r5.toString()
            return r0
        L28:
            r0 = move-exception
            goto L2c
        L2a:
            r0 = move-exception
            r3 = r4
        L2c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L39
            r3.close()     // Catch: java.io.IOException -> L35
            return r4
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L39:
            return r4
        L3a:
            r1 = move-exception
            r4 = r3
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r1 = move-exception
            goto L3c
        L42:
            if (r4 == 0) goto L4c
            r4.close()     // Catch: java.io.IOException -> L48
            throw r1
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08KF.LIZ(X.0VSP):java.lang.String");
    }
}
