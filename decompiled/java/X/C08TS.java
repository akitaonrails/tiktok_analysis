package X;

import Y.ARunnableS103S0100000_3;
import android.os.Process;
import com.bytedance.anr.boost.CpuSetManager;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.NewThreadPoolHelper;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08TS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08TS extends C09AY implements Function0<ExecutorService> {
    public C08TS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        boolean zLIZIZ;
        try {
            zLIZIZ = C1937307iN.LIZIZ(64, C1BWL.LIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            ThreadPoolExecutor threadPoolExecutorNewThreadPool = NewThreadPoolHelper.INSTANCE.newThreadPool(4, 4, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ((Number) C08TW.LIZ.getValue()).intValue() == 3 ? new ThreadFactory() { // from class: X.08TT
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(new ARunnableS103S0100000_3(runnable, 97));
                    ThreadMethodProxy.setName(bPEAThread, "homepage-main-preload-serial-t");
                    return bPEAThread;
                }
            } : new C08U6("homepage-main-preload-serial-t"), new ThreadPoolExecutor.AbortPolicy());
            threadPoolExecutorNewThreadPool.allowCoreThreadTimeOut(true);
            return threadPoolExecutorNewThreadPool;
        }
        C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
        c2123408To.LIZIZ = "homepage-main-preload-serial-t";
        c2123408To.LIZJ = 4;
        if (((Number) C08TW.LIZ.getValue()).intValue() == 3) {
            if ((((Number) C2118708Rt.LIZ.getValue()).intValue() & 2) == 2) {
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.08Rg
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MainPreloadExecutorKt@ebb1.getBuilder$1");
                        try {
                            CpuSetManager.init();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.getBuilder$1");
                    }
                });
            }
            c2123408To.LJI = new ThreadFactory() { // from class: X.08Rs
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(final Runnable runnable) {
                    BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.08Rr
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("MainPreloadExecutorKt@ebb1.getBuilder$2$1");
                            try {
                                try {
                                    if (!C0X35.LJ()) {
                                        C01GW c01gw = C2118708Rt.LIZ;
                                        if ((((Number) c01gw.getValue()).intValue() & 1) == 1) {
                                            Process.setThreadPriority(Process.myTid(), -20);
                                        }
                                        if ((((Number) c01gw.getValue()).intValue() & 2) == 2) {
                                            CpuSetManager.bindBigCore(Process.myTid());
                                        }
                                    }
                                } finally {
                                }
                                Runnable runnable2 = runnable;
                                if (runnable2 != null) {
                                    runnable2.run();
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (!C2179971ATj.LIZ(th2)) {
                                }
                            }
                            C1C7U.LIZIZ("MainPreloadExecutorKt@ebb1.getBuilder$2$1");
                        }
                    });
                    ThreadMethodProxy.setName(bPEAThread, "homepage-main-preload-serial-t");
                    return bPEAThread;
                }
            };
        }
        return C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }
}
