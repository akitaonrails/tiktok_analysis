package X;

import Y.ARunnableS11S0201000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.09Eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2339809Eu {
    public static final C2340009Ew LIZLLL = new InterfaceC2339709Et() { // from class: X.09Ew
    };
    public static volatile C2339809Eu LJ;
    public volatile boolean LIZ;
    public Executor LIZIZ;
    public BPEAHandler LIZJ;

    public static C2339809Eu LIZJ() {
        if (LJ == null) {
            synchronized (C2339809Eu.class) {
                try {
                    if (LJ == null) {
                        LJ = new C2339809Eu();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public C2339809Eu() {
        C2340009Ew c2340009Ew = LIZLLL;
        synchronized (this) {
            C2339909Ev c2339909Ev = new C2339909Ev();
            c2339909Ev.LIZ = 64;
            c2339909Ev.LIZJ = "LiveTaskManager-Thread";
            c2339909Ev.LIZIZ = c2340009Ew;
            LIZIZ(new ExecutorC2339509Er(c2339909Ev.LIZ, new ThreadFactoryC2124708Ub(c2339909Ev.LIZJ), c2339909Ev.LIZIZ));
        }
    }

    public final void LIZ(Callable callable) {
        if (this.LIZ) {
            this.LIZIZ.execute(new ARunnableS11S0201000_3(callable, 2));
            return;
        }
        throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
    }

    public final synchronized void LIZIZ(ExecutorC2339509Er executorC2339509Er) {
        if (this.LIZ) {
            return;
        }
        this.LIZIZ = executorC2339509Er;
        this.LIZJ = new BPEAHandler(Looper.getMainLooper());
        this.LIZ = true;
    }
}
