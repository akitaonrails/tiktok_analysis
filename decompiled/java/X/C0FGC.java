package X;

/* JADX INFO: renamed from: X.0FGC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGC {
    public static boolean LIZ;
    public static boolean LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {all -> 0x0026, blocks: (B:12:0x001a, B:14:0x001e), top: B:30:0x001a, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized boolean LIZ(int r11) {
        /*
            java.lang.Class<X.0FGC> r4 = X.C0FGC.class
            monitor-enter(r4)
            r8 = 0
            if (r11 >= 0) goto L8
            monitor-exit(r4)
            return r8
        L8:
            r6 = 1
            boolean r0 = X.C0FGC.LIZ     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L1a
            com.bytedance.ies.nleeditor.NLE r5 = com.bytedance.ies.nleeditor.NLE.INSTANCE     // Catch: java.lang.Throwable -> L49
            boolean r7 = X.C293550Bez.LIZ()     // Catch: java.lang.Throwable -> L49
            r9 = 4
            r10 = 0
            com.bytedance.ies.nleeditor.NLE.loadNLELibrary$default(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L49
            X.C0FGC.LIZ = r6     // Catch: java.lang.Throwable -> L49
        L1a:
            boolean r0 = X.C0FGC.LIZIZ     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L47
            X.0n3E r0 = X.C1419820n3E.LIZ     // Catch: java.lang.Throwable -> L26
            r0.LIZ()     // Catch: java.lang.Throwable -> L26
            X.C0FGC.LIZIZ = r6     // Catch: java.lang.Throwable -> L26
            goto L47
        L26:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L86
            X.0oCT r2 = X.C2219091BtD.LIZLLL()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "NLESoLoader load NLEMediaPublic failed, "
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = android.util.Log.getStackTraceString(r3)     // Catch: java.lang.Throwable -> L86
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> L86
            X.C0FGC.LIZIZ = r8     // Catch: java.lang.Throwable -> L86
        L47:
            monitor-exit(r4)
            return r6
        L49:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L86
            if (r11 == 0) goto L85
            X.0oCT r2 = X.C2219091BtD.LIZLLL()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "NLESoLoader loadNLESo error: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L86
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            r0 = 32
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = android.util.Log.getStackTraceString(r3)     // Catch: java.lang.Throwable -> L86
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = " remaining retry count: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            r1.append(r11)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
            r2.LIZ(r0)     // Catch: java.lang.Throwable -> L86
            int r11 = r11 - r6
            boolean r0 = LIZ(r11)     // Catch: java.lang.Throwable -> L86
            monitor-exit(r4)
            return r0
        L85:
            throw r3     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FGC.LIZ(int):boolean");
    }
}
