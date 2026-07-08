package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.08UM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08UM extends C822650WOx {
    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    static {
        new ThreadPoolExecutor.AbortPolicy();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return new ArrayList();
    }

    public C08UM(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, C08UF c08uf, C08UN c08un) {
        super(i, i2, j, timeUnit, blockingQueue, c08uf, c08un);
    }
}
