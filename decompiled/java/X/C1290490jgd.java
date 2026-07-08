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

/* JADX INFO: renamed from: X.0jgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290490jgd<T> {
    public final Executor LIZ;
    public C1290480jgc LIZIZ;
    public final Set<InterfaceC1290510jgf<T>> LIZJ;
    public final Set<InterfaceC1290510jgf<Throwable>> LIZLLL;
    public final BPEAHandler LJ;
    public final FutureTask<C1290500jge<T>> LJFF;
    public volatile C1290500jge<T> LJI;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0jgc, com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread] */
    public C1290490jgd(Callable<C1290500jge<T>> callable) {
        ExecutorService executorServiceLIZ = C807400Vlq.LIZ();
        this.LIZ = executorServiceLIZ;
        this.LIZJ = new LinkedHashSet(1);
        this.LIZLLL = new LinkedHashSet(1);
        this.LJ = new BPEAHandler(Looper.getMainLooper());
        this.LJI = null;
        FutureTask<C1290500jge<T>> futureTask = new FutureTask<>(callable);
        this.LJFF = futureTask;
        executorServiceLIZ.execute(futureTask);
        synchronized (this) {
            C1290480jgc c1290480jgc = this.LIZIZ;
            if ((c1290480jgc == null || !ThreadMethodProxy.isAlive(c1290480jgc)) && this.LJI == null) {
                ?? r0 = new BPEAThread() { // from class: X.0jgc
                    public boolean LL;

                    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("TaskManager@979f.startTaskObserverIfNeeded$1");
                        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                        try {
                            LIZJ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("TaskManager@979f.startTaskObserverIfNeeded$1");
                    }

                    public final void LIZJ() {
                        while (!isInterrupted() && !this.LL) {
                            if (this.LLILLJJLI.LJFF.isDone()) {
                                try {
                                    C1290490jgd c1290490jgd = this.LLILLJJLI;
                                    C1290500jge<T> c1290500jge = (C1290500jge) c1290490jgd.LJFF.get();
                                    if (c1290490jgd.LJI != null) {
                                        throw new IllegalStateException("A task may only be set once.");
                                    }
                                    c1290490jgd.LJI = c1290500jge;
                                    C786410Ut5.LJJZZIII(c1290490jgd.LJ, new ARunnableS120S0100000_20(c1290490jgd, 197));
                                } catch (InterruptedException | ExecutionException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1290490jgd c1290490jgd2 = this.LLILLJJLI;
                                    C1290500jge<T> c1290500jge2 = new C1290500jge<>(e);
                                    if (c1290490jgd2.LJI != null) {
                                        throw new IllegalStateException("A task may only be set once.");
                                    }
                                    c1290490jgd2.LJI = c1290500jge2;
                                    C786410Ut5.LJJZZIII(c1290490jgd2.LJ, new ARunnableS120S0100000_20(c1290490jgd2, 197));
                                }
                                this.LL = true;
                                C1290490jgd c1290490jgd3 = this.LLILLJJLI;
                                synchronized (c1290490jgd3) {
                                    C1290480jgc c1290480jgc2 = c1290490jgd3.LIZIZ;
                                    if (c1290480jgc2 != null && ThreadMethodProxy.isAlive(c1290480jgc2)) {
                                        if (c1290490jgd3.LIZJ.isEmpty() || c1290490jgd3.LJI != null) {
                                            c1290490jgd3.LIZIZ.interrupt();
                                            c1290490jgd3.LIZIZ = null;
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
    }
}
