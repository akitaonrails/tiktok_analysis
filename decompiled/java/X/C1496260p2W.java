package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1496260p2W extends C1496250p2V {
    public static final long LJII;
    public static final long LJIIIIZZ;
    public static C1496260p2W LJIIIZ;
    public boolean LJ;
    public C1496260p2W LJFF;
    public long LJI;

    public void LJIILIIL() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        LJII = millis;
        LJIIIIZZ = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void LJIIIIZZ() {
        C1496260p2W c1496260p2W;
        if (!(!this.LJ)) {
            "Unbalanced enter/exit".toString();
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long j = this.LIZJ;
        boolean z = this.LIZ;
        if (j != 0 || z) {
            this.LJ = true;
            synchronized (C1496260p2W.class) {
                try {
                    if (LJIIIZ == null) {
                        LJIIIZ = new C1496260p2W();
                        new BPEAThread() { // from class: X.0p2Y
                            {
                                setDaemon(true);
                            }

                            public static void LIZJ() {
                                C1496260p2W c1496260p2WLIZ;
                                while (true) {
                                    try {
                                        synchronized (C1496260p2W.class) {
                                            try {
                                                C1496260p2W c1496260p2W2 = C1496260p2W.LJIIIZ;
                                                c1496260p2WLIZ = C1496290p2Z.LIZ();
                                                if (c1496260p2WLIZ == C1496260p2W.LJIIIZ) {
                                                    C1496260p2W.LJIIIZ = null;
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        }
                                        if (c1496260p2WLIZ != null) {
                                            c1496260p2WLIZ.LJIILIIL();
                                        }
                                    } catch (InterruptedException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }

                            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                            public final void run() {
                                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                                try {
                                    LIZJ();
                                } finally {
                                }
                                if (zLJ) {
                                    C0W9U.LJFF();
                                }
                            }
                        }.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j != 0) {
                        if (z) {
                            this.LJI = Math.min(j, LIZJ() - jNanoTime) + jNanoTime;
                        } else {
                            this.LJI = j + jNanoTime;
                        }
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.LJI = LIZJ();
                    }
                    long j2 = this.LJI - jNanoTime;
                    C1496260p2W c1496260p2W2 = LJIIIZ;
                    if (c1496260p2W2 == null) {
                        Intrinsics.LJIIL();
                    }
                    while (true) {
                        c1496260p2W = c1496260p2W2.LJFF;
                        if (c1496260p2W == null || j2 < c1496260p2W.LJI - jNanoTime) {
                            break;
                        } else {
                            c1496260p2W2 = c1496260p2W;
                        }
                    }
                    this.LJFF = c1496260p2W;
                    c1496260p2W2.LJFF = this;
                    if (c1496260p2W2 == LJIIIZ) {
                        C1496260p2W.class.notify();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final boolean LJIIIZ() {
        if (!this.LJ) {
            return false;
        }
        this.LJ = false;
        synchronized (C1496260p2W.class) {
            try {
                C1496260p2W c1496260p2W = LJIIIZ;
                while (c1496260p2W != null) {
                    C1496260p2W c1496260p2W2 = c1496260p2W.LJFF;
                    if (c1496260p2W2 == this) {
                        c1496260p2W.LJFF = this.LJFF;
                        this.LJFF = null;
                        return false;
                    }
                    c1496260p2W = c1496260p2W2;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final IOException LJIIJ(IOException iOException) {
        if (LJIIIZ()) {
            return LJIIL(iOException);
        }
        return iOException;
    }

    public final void LJIIJJI(boolean z) throws IOException {
        if (LJIIIZ() && z) {
            throw LJIIL(null);
        }
    }

    public IOException LJIIL(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
