package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0YKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872370YKd {
    public volatile ExecutorService LIZ;
    public volatile ExecutorService LIZIZ;
    public volatile ExecutorService LIZJ;
    public volatile ExecutorService LIZLLL;
    public final Object LJ = new Object();
    public final Object LJFF = new Object();
    public final Object LJI = new Object();
    public final Object LJII = new Object();
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(1);
    public final InterfaceC863730XuV LJIIIZ;
    public final C0YLL LJIIJ;

    public final Executor LIZ() {
        if (this.LIZLLL == null) {
            synchronized (this.LJII) {
                try {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = C786410Ut5.i4(new C0YLN(this, "IM-EventSingle"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZLLL;
    }

    public final Executor LIZIZ() {
        if (this.LIZJ == null) {
            this.LJIIIZ.LJIIIZ().getClass();
            synchronized (this.LJI) {
                try {
                    if (this.LIZJ == null || this.LIZJ.isShutdown()) {
                        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                        if (iAvailableProcessors <= 1) {
                            iAvailableProcessors = 4;
                        }
                        this.LIZJ = C786410Ut5.e4(iAvailableProcessors, new C0YLN(this, "IM-Default"));
                    }
                } finally {
                }
            }
        }
        synchronized (this.LJI) {
            try {
                if (this.LIZJ.isShutdown()) {
                    int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
                    this.LIZJ = C786410Ut5.e4(iAvailableProcessors2 > 1 ? iAvailableProcessors2 : 4, new C0YLN(this, "IM-Default"));
                }
            } finally {
            }
        }
        return this.LIZJ;
    }

    public final Executor LIZJ() {
        this.LJIIIZ.LJIIIZ().getClass();
        if (this.LIZIZ == null) {
            synchronized (this.LJFF) {
                try {
                    if (this.LIZIZ == null) {
                        this.LIZIZ = C786410Ut5.i4(new C0YLN(this, "IM-ReceiveMsg"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    public final Executor LIZLLL() {
        if (this.LIZ == null) {
            synchronized (this.LJ) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = C786410Ut5.i4(new C0YLN(this, "IM-SendMsg"));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public final void LJ() {
        if (this.LIZ != null) {
            this.LIZ.shutdown();
            this.LIZ = null;
        }
        if (this.LIZIZ != null) {
            this.LIZIZ.shutdown();
            this.LIZIZ = null;
        }
        if (this.LIZJ != null) {
            this.LIZJ.shutdown();
            this.LIZJ = null;
        }
        if (this.LIZLLL != null) {
            this.LIZLLL.shutdown();
            this.LIZLLL = null;
        }
    }

    public C872370YKd(C0YF0 c0yf0, C0YLL c0yll) {
        this.LJIIIZ = c0yf0;
        this.LJIIJ = c0yll;
    }
}
