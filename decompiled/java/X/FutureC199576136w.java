package X;

import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.136w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class FutureC199576136w implements Future<Integer> {
    public final Semaphore LL = new Semaphore(1);
    public final AtomicInteger LLILLJJLI = new AtomicInteger(1);

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Integer get() throws InterruptedException {
        C199578136y.LIZ.LIZ(3);
        this.LL.acquire();
        this.LL.release();
        return Integer.valueOf(this.LLILLJJLI.get() != 4 ? -2022 : 0);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LLILLJJLI.get() == 3;
    }

    @Override // java.util.concurrent.Future
    public final Integer get(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
