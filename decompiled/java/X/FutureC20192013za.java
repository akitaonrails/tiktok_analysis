package X;

import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.13za, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class FutureC20192013za implements Future<Integer> {
    public final String LL;
    public final Semaphore LLILLJJLI = new Semaphore(1);
    public final AtomicInteger LLILLL = new AtomicInteger(1);

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
        C20192213zc c20192213zc = C20192213zc.LIZ;
        String str = this.LL;
        synchronized (c20192213zc) {
            C20192313zd c20192313zdLIZ = C20192213zc.LIZ(str);
            if (c20192313zdLIZ.LIZJ == 0) {
                c20192313zdLIZ.LIZJ = SystemClock.elapsedRealtime();
                c20192313zdLIZ.LIZLLL = 3;
            }
        }
        this.LLILLJJLI.acquire();
        this.LLILLJJLI.release();
        return Integer.valueOf(this.LLILLL.get() == 4 ? 0 : -2022);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.LLILLL.get() == 3;
    }

    public FutureC20192013za(String str) {
        this.LL = str;
    }

    @Override // java.util.concurrent.Future
    public final Integer get(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
