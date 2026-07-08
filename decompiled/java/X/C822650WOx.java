package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WOx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C822650WOx extends PThreadPoolExecutor {
    private final Runnable findWrappedRunnable(Runnable runnable) {
        if (runnable == null) {
            return null;
        }
        for (Runnable runnable2 : getQueue()) {
            if ((runnable2 instanceof C0T5I) && Intrinsics.LJFF(((C0T5I) runnable2).LIZJ(), runnable)) {
                return runnable2;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Runnable runnableLIZ;
        if (runnable == null) {
            super.execute(runnable);
            return;
        }
        if (C0WP5.LIZJ()) {
            runnableLIZ = C0T5C.LIZ(runnable);
        } else {
            runnableLIZ = runnable;
        }
        if (runnable instanceof Comparable) {
            super.execute(new C0T5H((Comparable) runnable, runnableLIZ));
        } else {
            super.execute(runnableLIZ);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public boolean remove(Runnable runnable) {
        Runnable runnableFindWrappedRunnable = findWrappedRunnable(runnable);
        if (runnableFindWrappedRunnable != null) {
            runnable = runnableFindWrappedRunnable;
        }
        return super.remove(runnable);
    }

    public C822650WOx(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        super(i, i2, j, timeUnit, blockingQueue, new DefaultThreadFactory("BPEAThreadPoolExecutor"));
    }

    public C822650WOx(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, new DefaultThreadFactory("BPEAThreadPoolExecutor"), rejectedExecutionHandler);
    }

    public C822650WOx(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    public C822650WOx(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
    }
}
