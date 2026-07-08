package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.0jgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290520jgg<T> {
    public static final Executor LJI = C807400Vlq.LIZ();
    public C1290530jgh LIZ;
    public final Set<InterfaceC1290510jgf<T>> LIZIZ;
    public final Set<InterfaceC1290510jgf<Throwable>> LIZJ;
    public final BPEAHandler LIZLLL;
    public final FutureTask<C1290500jge<T>> LJ;
    public volatile C1290500jge<T> LJFF;

    public C1290520jgg() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0jgh, com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread] */
    public final synchronized void LJFF() {
        C1290530jgh c1290530jgh = this.LIZ;
        if ((c1290530jgh == null || !ThreadMethodProxy.isAlive(c1290530jgh)) && this.LJFF == null) {
            ?? r0 = new BPEAThread() { // from class: X.0jgh
                public boolean LL;

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("LottieTask@72a5.startTaskObserverIfNeeded$1");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        LIZJ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("LottieTask@72a5.startTaskObserverIfNeeded$1");
                }

                public final void LIZJ() {
                    while (!isInterrupted() && !this.LL) {
                        if (this.LLILLJJLI.LJ.isDone()) {
                            try {
                                C1290520jgg c1290520jgg = this.LLILLJJLI;
                                c1290520jgg.LJ((C1290500jge) c1290520jgg.LJ.get());
                            } catch (InterruptedException | ExecutionException e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LLILLJJLI.LJ(new C1290500jge(e));
                            }
                            this.LL = true;
                            this.LLILLJJLI.LJI();
                        }
                    }
                }

                {
                    super("LottieTaskObserver");
                }
            };
            this.LIZ = r0;
            r0.start();
        }
    }

    public final synchronized void LJI() {
        C1290530jgh c1290530jgh = this.LIZ;
        if (c1290530jgh == null || !ThreadMethodProxy.isAlive(c1290530jgh)) {
            return;
        }
        if (this.LIZIZ.isEmpty() || this.LJFF != null) {
            interrupt();
            this.LIZ = null;
        }
    }

    public C1290520jgg(Callable<C1290500jge<T>> callable) {
        this.LIZIZ = new LinkedHashSet(1);
        this.LIZJ = new LinkedHashSet(1);
        this.LIZLLL = new BPEAHandler(Looper.getMainLooper());
        this.LJFF = null;
        FutureTask<C1290500jge<T>> futureTask = new FutureTask<>(callable);
        this.LJ = futureTask;
        LJI.execute(futureTask);
        LJFF();
    }

    public final synchronized void LIZ(InterfaceC1290510jgf interfaceC1290510jgf) {
        if (this.LJFF != null && this.LJFF.LIZIZ != null) {
            interfaceC1290510jgf.onResult(this.LJFF.LIZIZ);
        }
        this.LIZJ.add(interfaceC1290510jgf);
        if (this.LJ != null) {
            LJFF();
        }
    }

    public final synchronized void LIZIZ(InterfaceC1290510jgf interfaceC1290510jgf) {
        if (this.LJFF != null && this.LJFF.LIZ != null) {
            interfaceC1290510jgf.onResult(this.LJFF.LIZ);
        }
        this.LIZIZ.add(interfaceC1290510jgf);
        if (this.LJ != null) {
            LJFF();
        }
    }

    public final synchronized void LIZJ(T t) {
        Iterator it2 = new ArrayList(this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1290510jgf) it2.next()).onResult(t);
        }
    }

    public final synchronized void LIZLLL(C1291310jhx c1291310jhx) {
        this.LIZJ.remove(c1291310jhx);
        if (this.LJ != null) {
            LJI();
        }
    }

    public final void LJ(C1290500jge<T> c1290500jge) {
        if (this.LJFF == null) {
            this.LJFF = c1290500jge;
            C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS120S0100000_20(this, 35));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
