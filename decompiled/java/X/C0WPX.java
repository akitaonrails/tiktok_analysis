package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WPX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPX extends C0WPA {
    public final Object LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C822650WOx, com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor, java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.LLILLJJLI) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (this.LLILLL) {
                    long jCurrentTimeMillis2 = 2000 - (System.currentTimeMillis() - jCurrentTimeMillis);
                    if (jCurrentTimeMillis2 <= 0) {
                        break;
                    }
                    try {
                        this.LLILLJJLI.wait(jCurrentTimeMillis2);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.u3().interrupt();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        super.execute(runnable);
    }

    public C0WPX(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, C086B c086b, C0WTT c0wtt) {
        super(i, i2, j, timeUnit, blockingQueue, c086b, c0wtt);
        this.LLILLJJLI = new Object();
    }
}
