package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import xlp.c;

/* JADX INFO: renamed from: X.0p1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495890p1v {
    public long LIZ;
    public long LIZIZ;
    public final int LIZJ;
    public final C1495910p1x LIZLLL;
    public final Deque<C0X1V> LJ;
    public boolean LJFF;
    public final C1495900p1w LJI;
    public final C1495880p1u LJII;
    public final C1495970p23 LJIIIIZZ;
    public final C1495970p23 LJIIIZ;
    public EnumC1496090p2F LJIIJ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.0p1w r1 = r2.LJI     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r1.LLILZIL     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L17
            boolean r0 = r1.LLILZ     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
            X.0p1u r1 = r2.LJII     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r1.LLILLL     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L15
            boolean r0 = r1.LLILLJJLI     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
        L15:
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            boolean r0 = r2.LJI()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L25
            X.0p2F r0 = X.EnumC1496090p2F.CANCEL
            r2.LIZJ(r0)
        L24:
            return
        L25:
            if (r0 != 0) goto L24
            X.0p1x r1 = r2.LIZLLL
            int r0 = r2.LIZJ
            r1.LJII(r0)
            return
        L2f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495890p1v.LIZ():void");
    }

    public final C1495880p1u LJ() {
        synchronized (this) {
            try {
                if (!this.LJFF && !LJFF()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return this.LJII;
    }

    public final synchronized boolean LJI() {
        if (this.LJIIJ != null) {
            return false;
        }
        C1495900p1w c1495900p1w = this.LJI;
        if (c1495900p1w.LLILZIL || c1495900p1w.LLILZ) {
            C1495880p1u c1495880p1u = this.LJII;
            if (c1495880p1u.LLILLL || c1495880p1u.LLILLJJLI) {
                if (this.LJFF) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJII() {
        boolean zLJI;
        synchronized (this) {
            try {
                this.LJI.LLILZIL = true;
                zLJI = LJI();
                notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zLJI) {
            return;
        }
        this.LIZLLL.LJII(this.LIZJ);
    }

    public final void LIZIZ() throws IOException {
        C1495880p1u c1495880p1u = this.LJII;
        if (c1495880p1u.LLILLJJLI) {
            throw new IOException("stream closed");
        }
        if (c1495880p1u.LLILLL) {
            throw new IOException("stream finished");
        }
        if (this.LJIIJ != null) {
            throw new C1495470p1F(this.LJIIJ);
        }
    }

    public final boolean LJFF() {
        return this.LIZLLL.LL == ((this.LIZJ & 1) == 1);
    }

    public final void LJIIJ() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void LIZJ(EnumC1496090p2F enumC1496090p2F) {
        if (!LIZLLL(enumC1496090p2F)) {
            return;
        }
        C1495910p1x c1495910p1x = this.LIZLLL;
        c1495910p1x.LLJJJ.LJIILL(this.LIZJ, enumC1496090p2F);
    }

    public final boolean LIZLLL(EnumC1496090p2F enumC1496090p2F) {
        synchronized (this) {
            try {
                if (this.LJIIJ != null) {
                    return false;
                }
                if (this.LJI.LLILZIL && this.LJII.LLILLL) {
                    return false;
                }
                this.LJIIJ = enumC1496090p2F;
                notifyAll();
                this.LIZLLL.LJII(this.LIZJ);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIIZZ(List<C1495840p1q> list) {
        boolean zLJI;
        synchronized (this) {
            try {
                this.LJFF = true;
                ((ArrayDeque) this.LJ).add(c.LJIJJLI(list));
                zLJI = LJI();
                notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!zLJI) {
            this.LIZLLL.LJII(this.LIZJ);
        }
    }

    public final synchronized void LJIIIZ(EnumC1496090p2F enumC1496090p2F) {
        if (this.LJIIJ == null) {
            this.LJIIJ = enumC1496090p2F;
            notifyAll();
        }
    }

    public C1495890p1v(int i, C1495910p1x c1495910p1x, boolean z, boolean z2, C0X1V c0x1v) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.LJ = arrayDeque;
        this.LJIIIIZZ = new C1495970p23(this);
        this.LJIIIZ = new C1495970p23(this);
        this.LJIIJ = null;
        if (c1495910p1x != null) {
            this.LIZJ = i;
            this.LIZLLL = c1495910p1x;
            this.LIZIZ = c1495910p1x.LLJJIJIIJIL.LIZ();
            C1495900p1w c1495900p1w = new C1495900p1w(this, c1495910p1x.LLJJIJI.LIZ());
            this.LJI = c1495900p1w;
            C1495880p1u c1495880p1u = new C1495880p1u(this);
            this.LJII = c1495880p1u;
            c1495900p1w.LLILZIL = z2;
            c1495880p1u.LLILLL = z;
            if (c0x1v != null) {
                arrayDeque.add(c0x1v);
            }
            if (LJFF() && c0x1v != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            if (!LJFF() && c0x1v == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new NullPointerException("connection == null");
    }
}
