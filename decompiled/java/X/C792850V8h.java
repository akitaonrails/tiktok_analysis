package X;

import Y.ACallableS150S0000000_13;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0V8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792850V8h {
    public static Callable<Boolean> LIZ = new ACallableS150S0000000_13(0);
    public static Boolean LIZIZ = null;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0028, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000b, B:10:0x0015, B:11:0x001c, B:13:0x0020), top: B:20:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean LIZ() {
        /*
            java.lang.Class<X.0V8h> r1 = X.C792850V8h.class
            monitor-enter(r1)
            java.lang.Boolean r0 = X.C792850V8h.LIZIZ     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L1c
            java.util.concurrent.Callable<java.lang.Boolean> r0 = X.C792850V8h.LIZ     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L28
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L28
            X.C792850V8h.LIZIZ = r0     // Catch: java.lang.Exception -> L14 java.lang.Throwable -> L28
            goto L1c
        L14:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L28
            X.C792850V8h.LIZIZ = r0     // Catch: java.lang.Throwable -> L28
        L1c:
            java.lang.Boolean r0 = X.C792850V8h.LIZIZ     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L25
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L28
            goto L26
        L25:
            r0 = 0
        L26:
            monitor-exit(r1)
            return r0
        L28:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C792850V8h.LIZ():boolean");
    }
}
