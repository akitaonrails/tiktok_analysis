package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08UO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08UO {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final BlockingQueue<Runnable> LIZJ;
    public static final C08UF LIZLLL;
    public static final C08UN LJ;
    public static final C08UP LJFF;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.08UN] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.08UP] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.08UF] */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors <= 0) {
            iAvailableProcessors = 1;
        }
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 6)) * 2;
        LIZ = iMax;
        LIZIZ = (iMax * 2) + 1;
        LIZJ = new LinkedBlockingQueue();
        LIZLLL = new ThreadFactory() { // from class: X.08UF
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                this.LL = securityManager != null ? securityManager.getThreadGroup() : C786410Ut5.u3().getThreadGroup();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AppLogDefaultExecutors");
                sbLIZ.append("-");
                sbLIZ.append(LLILZ.getAndIncrement());
                sbLIZ.append("-Thread-");
                this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                ThreadGroup threadGroup = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(this.LLILLJJLI.getAndIncrement());
                BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, C2188811AlT.LIZIZ(sbLIZ), 0L);
                if (bPEAThread.isDaemon()) {
                    bPEAThread.setDaemon(false);
                }
                if (bPEAThread.getPriority() != 5) {
                    ThreadMethodProxy.setPriority(bPEAThread, 5);
                }
                return bPEAThread;
            }
        };
        LJ = new RejectedExecutionHandler() { // from class: X.08UN
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C807400Vlq.LIZ().execute(runnable);
            }
        };
        LJFF = new C08UT<C08UM>() { // from class: X.08UP
            @Override // X.C08UT
            public final Object LIZ() {
                C08UM c08um = new C08UM(1, C08UO.LIZIZ, 1L, TimeUnit.SECONDS, C08UO.LIZJ, C08UO.LIZLLL, C08UO.LJ);
                c08um.allowCoreThreadTimeOut(true);
                return c08um;
            }
        };
    }
}
