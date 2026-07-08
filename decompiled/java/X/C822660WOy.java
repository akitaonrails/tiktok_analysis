package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C822660WOy extends PThreadScheduledThreadPoolExecutor {
    public C822660WOy(int i) {
        super(i, new DefaultThreadFactory("BPEAScheduledThreadPoolExecutor"));
    }

    private final <V> Callable<V> wrapCallable(final Callable<V> callable) {
        if (C0WP5.LIZJ()) {
            if (callable == null) {
                return null;
            }
            final C0W9T c0w9tLIZIZ = C0W9U.LIZIZ();
            if (c0w9tLIZIZ == null || (callable instanceof C08QX)) {
                return callable;
            }
            return new Callable<V>(callable, c0w9tLIZIZ) { // from class: X.08QX
                public static final /* synthetic */ int LLILLL = 0;
                public final Callable<V> LL;
                public final C0W9T LLILLJJLI;

                @Override // java.util.concurrent.Callable
                public final V call() {
                    C1C7U.LIZ("DelegateCallable@d57e.call");
                    boolean zLJ = C0W9U.LJ(this.LLILLJJLI);
                    try {
                        V vCall = this.LL.call();
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("DelegateCallable@d57e.call");
                        return vCall;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        throw th;
                    }
                }

                {
                    this.LL = callable;
                    this.LLILLJJLI = c0w9tLIZIZ;
                }
            };
        }
        return callable;
    }

    private final Runnable wrapRunnable(Runnable runnable) {
        if (C0WP5.LIZJ()) {
            if (runnable == null) {
                return null;
            }
            return C0T5C.LIZ(runnable);
        }
        return runnable;
    }

    public C822660WOy(int i, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, new DefaultThreadFactory("BPEAScheduledThreadPoolExecutor"), rejectedExecutionHandler);
    }

    public C822660WOy(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    public C822660WOy(int i, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, threadFactory, rejectedExecutionHandler);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return super.schedule(wrapRunnable(runnable), j, timeUnit);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return super.schedule(wrapCallable(callable), j, timeUnit);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleAtFixedRate(wrapRunnable(runnable), j, j2, timeUnit);
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return super.scheduleWithFixedDelay(wrapRunnable(runnable), j, j2, timeUnit);
    }
}
