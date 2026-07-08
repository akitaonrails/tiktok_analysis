package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.08Un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2125908Un extends C822650WOx {
    public static final RejectedExecutionHandler LL = new ThreadPoolExecutor.AbortPolicy();

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C2125908Un(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 30L, timeUnit, blockingQueue, threadFactory, LL);
    }

    public C2125908Un(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, C08UG c08ug, RejectedExecutionHandlerC2126008Uo rejectedExecutionHandlerC2126008Uo) {
        super(i, i2, 30L, timeUnit, blockingQueue, c08ug, rejectedExecutionHandlerC2126008Uo);
    }
}
