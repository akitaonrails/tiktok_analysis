package X;

import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.136c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class FutureC199556136c implements Future<Integer> {
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
        synchronized (C199557136d.LIZ) {
            if (C199557136d.LIZLLL == 0) {
                C199557136d.LIZLLL = SystemClock.elapsedRealtime();
                C199557136d.LJ = 3;
            }
        }
        this.LL.acquire();
        this.LL.release();
        return Integer.valueOf(this.LLILLJJLI.get() == 4 ? 0 : -2022);
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
