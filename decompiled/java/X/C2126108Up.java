package X;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08Up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2126108Up {
    public static ExecutorService LIZ;
    public static final C2125908Un LIZIZ;
    public static final C2125908Un LIZJ;
    public static final ScheduledExecutorService LIZLLL;
    public static final C2125908Un LJ;
    public static final C2125908Un LJFF;
    public static final int LJI;
    public static final int LJII;
    public static final C08UG LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r10v0, types: [X.08UG] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.08Uo] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.08UG] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.08UG] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.08UG] */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors <= 0) {
            iAvailableProcessors = 1;
        }
        int i = iAvailableProcessors - 1;
        int iMax = Math.max(2, Math.min(i, 6)) * 2;
        LJI = iMax;
        int i2 = (iMax * 2) + 1;
        LJII = i2;
        int iMax2 = Math.max(2, Math.min(i, 3));
        int i3 = (iAvailableProcessors * 2) + 1;
        final String str = "TTDefaultExecutors";
        ?? r10 = new ThreadFactory(str) { // from class: X.08UG
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    this.LL = securityManager.getThreadGroup();
                } else {
                    this.LL = C786410Ut5.u3().getThreadGroup();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
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
        final String str2 = "TTCpuExecutors";
        ?? r1 = new ThreadFactory(str2) { // from class: X.08UG
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    this.LL = securityManager.getThreadGroup();
                } else {
                    this.LL = C786410Ut5.u3().getThreadGroup();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
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
        final String str3 = "TTScheduledExecutors";
        LJIIIIZZ = new ThreadFactory(str3) { // from class: X.08UG
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    this.LL = securityManager.getThreadGroup();
                } else {
                    this.LL = C786410Ut5.u3().getThreadGroup();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
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
        final String str4 = "TTDownLoadExecutors";
        ?? r3 = new ThreadFactory(str4) { // from class: X.08UG
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    this.LL = securityManager.getThreadGroup();
                } else {
                    this.LL = C786410Ut5.u3().getThreadGroup();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str4);
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
        final String str5 = "TTSerialExecutors";
        ThreadFactory threadFactory = new ThreadFactory(str5) { // from class: X.08UG
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                if (securityManager != null) {
                    this.LL = securityManager.getThreadGroup();
                } else {
                    this.LL = C786410Ut5.u3().getThreadGroup();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str5);
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
        ThreadFactory threadFactory2 = new ThreadFactory() { // from class: X.08UH
            public static final AtomicInteger LLILZ = new AtomicInteger(1);
            public final ThreadGroup LL;
            public final AtomicInteger LLILLJJLI = new AtomicInteger(1);
            public final String LLILLL;

            {
                SecurityManager securityManager = System.getSecurityManager();
                this.LL = securityManager != null ? securityManager.getThreadGroup() : C786410Ut5.u3().getThreadGroup();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTBackgroundExecutors");
                sbLIZ.append("-");
                sbLIZ.append(LLILZ.getAndIncrement());
                sbLIZ.append("-Thread-");
                this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                final ThreadGroup threadGroup = this.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(this.LLILLJJLI.getAndIncrement());
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                BPEAThread bPEAThread = new BPEAThread(threadGroup, runnable, strLIZIZ) { // from class: X.08UI
                    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("TTExecutors$BackgroundThreadFactory@c4a2.newThread$1");
                        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                        try {
                            Process.setThreadPriority(10);
                            super.run();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("TTExecutors$BackgroundThreadFactory@c4a2.newThread$1");
                    }
                };
                if (bPEAThread.isDaemon()) {
                    bPEAThread.setDaemon(false);
                }
                return bPEAThread;
            }
        };
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        ?? r11 = new RejectedExecutionHandler() { // from class: X.08Uo
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                C807400Vlq.LIZ().execute(runnable);
            }
        };
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C2125908Un c2125908Un = new C2125908Un(iMax, i2, timeUnit, linkedBlockingQueue, r10, r11);
        LIZ = c2125908Un;
        c2125908Un.allowCoreThreadTimeOut(true);
        C2125908Un c2125908Un2 = new C2125908Un(iMax2, i3, timeUnit, linkedBlockingQueue2, r1, r11);
        LIZIZ = c2125908Un2;
        c2125908Un2.allowCoreThreadTimeOut(true);
        LIZLLL = C786410Ut5.g4(3, LJIIIIZZ);
        C2125908Un c2125908Un3 = new C2125908Un(2, 2, timeUnit, linkedBlockingQueue3, r3, r11);
        LIZJ = c2125908Un3;
        c2125908Un3.allowCoreThreadTimeOut(true);
        C2125908Un c2125908Un4 = new C2125908Un(1, 1, timeUnit, new LinkedBlockingQueue(), threadFactory);
        LJ = c2125908Un4;
        c2125908Un4.allowCoreThreadTimeOut(true);
        C2125908Un c2125908Un5 = new C2125908Un(0, 3, timeUnit, new LinkedBlockingQueue(), threadFactory2);
        LJFF = c2125908Un5;
        c2125908Un5.allowCoreThreadTimeOut(true);
    }
}
