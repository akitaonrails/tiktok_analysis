package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.12jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19837112jR extends AbstractC19810712fB {
    public static final AtomicLong LJIIJ = new AtomicLong(Long.MIN_VALUE);
    public C19837312jT LIZJ;
    public C19837312jT LIZLLL;
    public final PriorityBlockingQueue<C19837212jS<?>> LJ;
    public final BlockingQueue<C19837212jS<?>> LJFF;
    public final C19837012jQ LJI;
    public final C19837012jQ LJII;
    public final Object LJIIIIZZ;
    public final Semaphore LJIIIZ;

    @Override // X.AbstractC19810712fB
    public final boolean LJII() {
        return false;
    }

    @Override // X.C19791712c7
    public final void LJ() {
        if (C786410Ut5.u3() != this.LIZJ) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean LJIIZILJ() {
        return C786410Ut5.u3() == this.LIZJ;
    }

    public final void LJIJI() {
        if (C786410Ut5.u3() != this.LIZLLL) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.12jQ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.12jQ] */
    public C19837112jR(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LJIIIIZZ = new Object();
        this.LJIIIZ = new Semaphore(2);
        this.LJ = new PriorityBlockingQueue<>();
        this.LJFF = new LinkedBlockingQueue();
        final String str = "Thread death: Uncaught exception on worker thread";
        this.LJI = new Thread.UncaughtExceptionHandler(str) { // from class: X.12jQ
            public final String LIZ;

            {
                this.LIZ = str;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final synchronized void uncaughtException(Thread thread, Throwable th) {
                this.LIZIZ.LJIILJJIL().LJFF.LIZ(th, this.LIZ);
            }
        };
        final String str2 = "Thread death: Uncaught exception on network thread";
        this.LJII = new Thread.UncaughtExceptionHandler(str2) { // from class: X.12jQ
            public final String LIZ;

            {
                this.LIZ = str2;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final synchronized void uncaughtException(Thread thread, Throwable th) {
                this.LIZIZ.LJIILJJIL().LJFF.LIZ(th, this.LIZ);
            }
        };
    }

    public final C19837212jS LJIIIZ(Callable callable) {
        LJFF();
        C19837212jS<?> c19837212jS = new C19837212jS<>(this, callable, false);
        if (C786410Ut5.u3() == this.LIZJ) {
            if (!this.LJ.isEmpty()) {
                LJIILJJIL().LJIIIIZZ.LIZJ("Callable skipped the worker queue.");
            }
            c19837212jS.run();
            return c19837212jS;
        }
        LJIIJJI(c19837212jS);
        return c19837212jS;
    }

    public final void LJIIJ(Runnable runnable) {
        LJFF();
        C19837212jS<?> c19837212jS = new C19837212jS<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.LJIIIIZZ) {
            try {
                this.LJFF.add(c19837212jS);
                C19837312jT c19837312jT = this.LIZLLL;
                if (c19837312jT == null) {
                    C19837312jT c19837312jT2 = new C19837312jT(this, "Measurement Network", this.LJFF);
                    this.LIZLLL = c19837312jT2;
                    c19837312jT2.setUncaughtExceptionHandler(this.LJII);
                    this.LIZLLL.start();
                } else {
                    c19837312jT.LJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI(C19837212jS<?> c19837212jS) {
        synchronized (this.LJIIIIZZ) {
            try {
                this.LJ.add(c19837212jS);
                C19837312jT c19837312jT = this.LIZJ;
                if (c19837312jT == null) {
                    C19837312jT c19837312jT2 = new C19837312jT(this, "Measurement Worker", this.LJ);
                    this.LIZJ = c19837312jT2;
                    c19837312jT2.setUncaughtExceptionHandler(this.LJI);
                    this.LIZJ.start();
                } else {
                    c19837312jT.LJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C19837212jS LJIILIIL(Callable callable) {
        LJFF();
        C19837212jS<?> c19837212jS = new C19837212jS<>(this, callable, true);
        if (C786410Ut5.u3() == this.LIZJ) {
            c19837212jS.run();
            return c19837212jS;
        }
        LJIIJJI(c19837212jS);
        return c19837212jS;
    }

    public final void LJIILL(Runnable runnable) {
        LJFF();
        C0W3J.LJIIIIZZ(runnable);
        LJIIJJI(new C19837212jS<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void LJIILLIIL(Runnable runnable) {
        LJFF();
        LJIIJJI(new C19837212jS<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final <T> T LJIIIIZZ(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            try {
                LJIIL().LJIILL(runnable);
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LJIILJJIL().LJIIIIZZ.LIZJ("Interrupted waiting for ".concat(str));
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            LJIILJJIL().LJIIIIZZ.LIZJ("Timed out waiting for ".concat(str));
        }
        return t;
    }
}
