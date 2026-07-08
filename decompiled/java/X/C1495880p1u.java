package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0p1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495880p1u implements InterfaceC1495590p1R {
    public final C1496690p3D LL = new C1496690p3D();
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ C1495890p1v LLILZ;

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LLILZ) {
            try {
                if (this.LLILLJJLI) {
                    return;
                }
                C1495890p1v c1495890p1v = this.LLILZ;
                if (!c1495890p1v.LJII.LLILLL) {
                    if (this.LL.LLILLJJLI <= 0) {
                        c1495890p1v.LIZLLL.LJIIZILJ(c1495890p1v.LIZJ, true, null, 0L);
                    } else {
                        while (this.LL.LLILLJJLI > 0) {
                            LIZ(true);
                        }
                    }
                }
                synchronized (this.LLILZ) {
                    try {
                        this.LLILLJJLI = true;
                    } finally {
                    }
                }
                this.LLILZ.LIZLLL.flush();
                this.LLILZ.LIZ();
            } finally {
            }
        }
    }

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() {
        synchronized (this.LLILZ) {
            try {
                this.LLILZ.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        while (this.LL.LLILLJJLI > 0) {
            LIZ(false);
            this.LLILZ.LIZLLL.flush();
        }
    }

    @Override // X.InterfaceC1495590p1R
    public final C1496250p2V timeout() {
        return this.LLILZ.LJIIIZ;
    }

    public C1495880p1u(C1495890p1v c1495890p1v) {
        this.LLILZ = c1495890p1v;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r10) {
        /*
            r9 = this;
            X.0p1v r4 = r9.LLILZ
            monitor-enter(r4)
            X.0p1v r0 = r9.LLILZ     // Catch: java.lang.Throwable -> L7f
            X.0p23 r0 = r0.LJIIIZ     // Catch: java.lang.Throwable -> L7f
            r0.LJIIIIZZ()     // Catch: java.lang.Throwable -> L7f
        La:
            X.0p1v r3 = r9.LLILZ     // Catch: java.lang.Throwable -> L73
            long r5 = r3.LIZIZ     // Catch: java.lang.Throwable -> L73
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L24
            boolean r0 = r9.LLILLL     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L24
            boolean r0 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L24
            X.0p2F r0 = r3.LJIIJ     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L24
            r3.LJIIJ()     // Catch: java.lang.Throwable -> L73
            goto La
        L24:
            X.0p23 r0 = r3.LJIIIZ     // Catch: java.lang.Throwable -> L7f
            r0.LJIILJJIL()     // Catch: java.lang.Throwable -> L7f
            X.0p1v r0 = r9.LLILZ     // Catch: java.lang.Throwable -> L7f
            r0.LIZIZ()     // Catch: java.lang.Throwable -> L7f
            X.0p1v r0 = r9.LLILZ     // Catch: java.lang.Throwable -> L7f
            long r2 = r0.LIZIZ     // Catch: java.lang.Throwable -> L7f
            X.0p3D r0 = r9.LL     // Catch: java.lang.Throwable -> L7f
            long r0 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L7f
            long r7 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L7f
            X.0p1v r2 = r9.LLILZ     // Catch: java.lang.Throwable -> L7f
            long r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L7f
            long r0 = r0 - r7
            r2.LIZIZ = r0     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7f
            X.0p23 r0 = r2.LJIIIZ
            r0.LJIIIIZZ()
            X.0p1v r0 = r9.LLILZ     // Catch: java.lang.Throwable -> L67
            X.0p1x r3 = r0.LIZLLL     // Catch: java.lang.Throwable -> L67
            int r4 = r0.LIZJ     // Catch: java.lang.Throwable -> L67
            if (r10 == 0) goto L59
            X.0p3D r0 = r9.LL     // Catch: java.lang.Throwable -> L67
            long r1 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L67
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L59
            r5 = 1
            goto L5a
        L59:
            r5 = 0
        L5a:
            X.0p3D r6 = r9.LL     // Catch: java.lang.Throwable -> L67
            r3.LJIIZILJ(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
            X.0p1v r0 = r9.LLILZ
            X.0p23 r0 = r0.LJIIIZ
            r0.LJIILJJIL()
            return
        L67:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L67
            X.0p1v r0 = r9.LLILZ
            X.0p23 r0 = r0.LJIIIZ
            r0.LJIILJJIL()
            throw r1
        L73:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L73
            X.0p1v r0 = r9.LLILZ     // Catch: java.lang.Throwable -> L7f
            X.0p23 r0 = r0.LJIIIZ     // Catch: java.lang.Throwable -> L7f
            r0.LJIILJJIL()     // Catch: java.lang.Throwable -> L7f
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495880p1u.LIZ(boolean):void");
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) {
        this.LL.LLFF(c1496690p3D, j);
        while (this.LL.LLILLJJLI >= 16384) {
            LIZ(false);
        }
    }
}
