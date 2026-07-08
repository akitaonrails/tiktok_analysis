package X;

import android.os.Build;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WPM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPM extends C822650WOx {
    public static volatile Field LLILLJJLI;
    public final C0WQX LL;

    public static void LIZ() {
        try {
            if (LLILLJJLI == null) {
                synchronized (C0WPM.class) {
                    try {
                        if (LLILLJJLI == null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                LLILLJJLI = Thread.class.getDeclaredField("threadLocals");
                            } else {
                                LLILLJJLI = Thread.class.getDeclaredField("localValues");
                            }
                            LLILLJJLI.setAccessible(true);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            LLILLJJLI.set(C786410Ut5.u3(), null);
        } catch (Exception th) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
        if (C823050WQl.LJII(this)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return C823050WQl.LJII(this) ? Collections.emptyList() : super.shutdownNow();
    }

    @Override // X.C822650WOx, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C823050WQl.LIZ.LIZIZ.contains(this.LL)) {
            super.execute(new RunnableC822970WQd(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        try {
            if (Looper.myLooper() != null) {
                LIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C0WPM(C0WQX c0wqx, int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, C0WQU c0wqu) {
        super(i, i2, 30L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, c0wqu);
        this.LL = c0wqx;
    }

    public C0WPM(C0WQX c0wqx, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.LL = c0wqx;
    }
}
