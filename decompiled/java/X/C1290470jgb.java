package X;

import Y.ARunnableS120S0100000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.0jgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290470jgb<T> {
    public final Executor LIZ;
    public C1290460jga LIZIZ;
    public final Set<InterfaceC1290060jfw<T>> LIZJ;
    public final Set<InterfaceC1290060jfw<Throwable>> LIZLLL;
    public final BPEAHandler LJ;
    public final FutureTask<C1290450jgZ<T>> LJFF;
    public volatile C1290450jgZ<T> LJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0jga, com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread] */
    public final synchronized void LIZJ() {
        C1290460jga c1290460jga = this.LIZIZ;
        if ((c1290460jga == null || !ThreadMethodProxy.isAlive(c1290460jga)) && this.LJI == null) {
            ?? r0 = new BPEAThread() { // from class: X.0jga
                public boolean LL;

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("TaskManager@b990.startTaskObserverIfNeeded$1");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        LIZJ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("TaskManager@b990.startTaskObserverIfNeeded$1");
                }

                public final void LIZJ() {
                    while (!isInterrupted() && !this.LL) {
                        if (this.LLILLJJLI.LJFF.isDone()) {
                            try {
                                C1290470jgb c1290470jgb = this.LLILLJJLI;
                                C1290450jgZ<T> c1290450jgZ = (C1290450jgZ) c1290470jgb.LJFF.get();
                                if (c1290470jgb.LJI != null) {
                                    throw new IllegalStateException("A task may only be set once.");
                                }
                                c1290470jgb.LJI = c1290450jgZ;
                                C786410Ut5.LJJZZIII(c1290470jgb.LJ, new ARunnableS120S0100000_20(c1290470jgb, 463));
                            } catch (InterruptedException | ExecutionException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1290470jgb c1290470jgb2 = this.LLILLJJLI;
                                C1290450jgZ<T> c1290450jgZ2 = new C1290450jgZ<>(e);
                                if (c1290470jgb2.LJI != null) {
                                    throw new IllegalStateException("A task may only be set once.");
                                }
                                c1290470jgb2.LJI = c1290450jgZ2;
                                C786410Ut5.LJJZZIII(c1290470jgb2.LJ, new ARunnableS120S0100000_20(c1290470jgb2, 463));
                            }
                            this.LL = true;
                            C1290470jgb c1290470jgb3 = this.LLILLJJLI;
                            synchronized (c1290470jgb3) {
                                C1290460jga c1290460jga2 = c1290470jgb3.LIZIZ;
                                if (c1290460jga2 != null && ThreadMethodProxy.isAlive(c1290460jga2)) {
                                    if (c1290470jgb3.LIZJ.isEmpty() || c1290470jgb3.LJI != null) {
                                        c1290470jgb3.LIZIZ.interrupt();
                                        c1290470jgb3.LIZIZ = null;
                                    }
                                }
                            }
                        }
                    }
                }

                {
                    super("LynxLottieTaskObserver");
                }
            };
            this.LIZIZ = r0;
            r0.start();
        }
    }

    public C1290470jgb(Callable<C1290450jgZ<T>> callable) {
        ExecutorService executorServiceLIZ = C807400Vlq.LIZ();
        this.LIZ = executorServiceLIZ;
        this.LIZJ = new LinkedHashSet(1);
        this.LIZLLL = new LinkedHashSet(1);
        this.LJ = new BPEAHandler(Looper.getMainLooper());
        this.LJI = null;
        FutureTask<C1290450jgZ<T>> futureTask = new FutureTask<>(callable);
        this.LJFF = futureTask;
        executorServiceLIZ.execute(futureTask);
        LIZJ();
    }

    public final synchronized void LIZ(InterfaceC1290060jfw interfaceC1290060jfw) {
        if (this.LJI != null && this.LJI.LIZIZ != null) {
            interfaceC1290060jfw.onResult(this.LJI.LIZIZ);
        }
        this.LIZLLL.add(interfaceC1290060jfw);
        LIZJ();
    }

    public final synchronized void LIZIZ(InterfaceC1290060jfw interfaceC1290060jfw) {
        if (this.LJI != null && this.LJI.LIZ != null) {
            interfaceC1290060jfw.onResult(this.LJI.LIZ);
        }
        this.LIZJ.add(interfaceC1290060jfw);
        LIZJ();
    }
}
