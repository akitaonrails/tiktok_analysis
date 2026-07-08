package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rpv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1603770rpv {
    public final Object LIZ = new Object();
    public final List<InterfaceC1603810rpz> LIZIZ = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:13:0x001d, B:15:0x0022), top: B:24:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C09Q3 r6, X.C09Q3 r7) {
        /*
            r5 = this;
            if (r6 != 0) goto L5
            if (r7 != 0) goto L5
            return
        L5:
            java.lang.Object r4 = r5.LIZ
            monitor-enter(r4)
            java.util.List<X.0rpz> r1 = r5.LIZIZ     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            X.0rpz[] r0 = new X.InterfaceC1603810rpz[r3]     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r2 = r1.toArray(r0)     // Catch: java.lang.Throwable -> L2e
            X.0rpz[] r2 = (X.InterfaceC1603810rpz[]) r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            int r1 = r2.length
        L17:
            if (r3 >= r1) goto L2d
            r0 = r2[r3]
            if (r6 == 0) goto L20
            r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> L26
        L20:
            if (r7 == 0) goto L2a
            r0.LIZ(r7)     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2a:
            int r3 = r3 + 1
            goto L17
        L2d:
            return
        L2e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1603770rpv.LIZ(X.09Q3, X.09Q3):void");
    }
}
