package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0W4M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4M {
    public static final C1264404x8 LIZIZ = new C1264404x8("LibraryVersion");
    public static final C0W4M LIZJ = new C0W4M();
    public final ConcurrentHashMap LIZ = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "Please provide a valid libraryName"
            X.C0W3J.LJFF(r0, r6)
            java.util.concurrent.ConcurrentHashMap r0 = r5.LIZ
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L16
            java.util.concurrent.ConcurrentHashMap r0 = r5.LIZ
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L16:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r0 = 1
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L52
            r0 = 0
            r3[r0] = r6     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L52
            java.lang.Class<X.0W4M> r1 = X.C0W4M.class
            java.lang.String r0 = "/%s.properties"
            java.lang.String r0 = X.C786410Ut5.j4(r0, r3)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L52
            java.io.InputStream r1 = X.C786410Ut5.LJLLI(r1, r0)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L52
            if (r1 == 0) goto L40
            r4.load(r1)     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7c
            java.lang.String r0 = "version"
            java.lang.String r2 = r4.getProperty(r0, r2)     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7c
            X.04x8 r0 = X.C0W4M.LIZIZ     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7c
            goto L63
        L40:
            X.04x8 r0 = X.C0W4M.LIZIZ     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7c
            goto L63
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = r2
            r2 = r1
            goto L57
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L81
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = r2
        L57:
            X.04x8 r0 = X.C0W4M.LIZIZ     // Catch: java.lang.Throwable -> L77
            r0.getClass()     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L61
            X.C0W4L.LIZ(r2)
        L61:
            r2 = r3
            goto L68
        L63:
            if (r1 == 0) goto L68
            X.C0W4L.LIZ(r1)
        L68:
            if (r2 != 0) goto L71
            X.04x8 r0 = X.C0W4M.LIZIZ
            r0.getClass()
            java.lang.String r2 = "UNKNOWN"
        L71:
            java.util.concurrent.ConcurrentHashMap r0 = r5.LIZ
            r0.put(r6, r2)
            return r2
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L81
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = r1
        L81:
            if (r2 == 0) goto L86
            X.C0W4L.LIZ(r2)
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W4M.LIZ(java.lang.String):java.lang.String");
    }
}
