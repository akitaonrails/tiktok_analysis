package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQJ {
    public static final C0WQH LIZ;
    public static final C0WQH LIZIZ;
    public static final C0WQH LIZJ;
    public static final C0WQH LIZLLL;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0WQH] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0WQH, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0WQH, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0WQH, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor] */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        final int i = 0;
        final int i2 = Integer.MAX_VALUE;
        final long j = 3;
        final TimeUnit timeUnit = TimeUnit.SECONDS;
        final SynchronousQueue synchronousQueue = new SynchronousQueue();
        final C0WQN c0wqn = new C0WQN("Account-IMMEDIATE", C0WQO.HIGH);
        final ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy = new ThreadPoolExecutor.DiscardOldestPolicy();
        LIZ = new C822650WOx(i, i2, j, timeUnit, synchronousQueue, c0wqn, discardOldestPolicy) { // from class: X.0WQH
            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    if (future.isDone() && !future.isCancelled()) {
                        try {
                            future.get();
                        } catch (ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                try {
                                    C0WQI.LIZ(6, "AccountThreadPoolExecutor", String.valueOf(cause));
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                }
            }
        };
        final int i3 = 1;
        final int i4 = (iAvailableProcessors * 2) + 1;
        final int i5 = 64;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(64);
        final C0WQN c0wqn2 = new C0WQN("Account-IO_BOUND");
        final ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy2 = new ThreadPoolExecutor.DiscardOldestPolicy();
        final long j2 = 30;
        ?? r3 = new C822650WOx(i4, i5, j2, timeUnit, linkedBlockingQueue, c0wqn2, discardOldestPolicy2) { // from class: X.0WQH
            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    if (future.isDone() && !future.isCancelled()) {
                        try {
                            future.get();
                        } catch (ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                try {
                                    C0WQI.LIZ(6, "AccountThreadPoolExecutor", String.valueOf(cause));
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                }
            }
        };
        r3.allowCoreThreadTimeOut(true);
        LIZIZ = r3;
        final int iMin = Math.min(iAvailableProcessors, 4);
        final LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue(64);
        final C0WQN c0wqn3 = new C0WQN("Account-CPU_BOUND");
        final ThreadPoolExecutor.DiscardOldestPolicy discardOldestPolicy3 = new ThreadPoolExecutor.DiscardOldestPolicy();
        ?? r9 = new C822650WOx(iMin, i4, j2, timeUnit, linkedBlockingQueue2, c0wqn3, discardOldestPolicy3) { // from class: X.0WQH
            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    if (future.isDone() && !future.isCancelled()) {
                        try {
                            future.get();
                        } catch (ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                try {
                                    C0WQI.LIZ(6, "AccountThreadPoolExecutor", String.valueOf(cause));
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                }
            }
        };
        r9.allowCoreThreadTimeOut(true);
        LIZJ = r9;
        final int i6 = 2;
        final long j3 = 15;
        final TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        final LinkedBlockingQueue linkedBlockingQueue3 = new LinkedBlockingQueue();
        final C0WQN c0wqn4 = new C0WQN("Account-BACKGROUND", C0WQO.LOW);
        final ThreadPoolExecutor.AbortPolicy abortPolicy = new ThreadPoolExecutor.AbortPolicy();
        ?? r4 = new C822650WOx(i3, i6, j3, timeUnit2, linkedBlockingQueue3, c0wqn4, abortPolicy) { // from class: X.0WQH
            @Override // java.util.concurrent.ThreadPoolExecutor
            public final void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    if (future.isDone() && !future.isCancelled()) {
                        try {
                            future.get();
                        } catch (ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                try {
                                    C0WQI.LIZ(6, "AccountThreadPoolExecutor", String.valueOf(cause));
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                }
            }
        };
        r4.allowCoreThreadTimeOut(true);
        LIZLLL = r4;
        ((ThreadPoolExecutor) C786410Ut5.f4(1)).allowCoreThreadTimeOut(true);
    }
}
