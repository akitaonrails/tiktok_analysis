package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.0UP4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UP4 implements Runnable {
    public final Handler LL;
    public final InterfaceC1162920gMs LLILLJJLI;
    public boolean LLILLL = true;
    public volatile boolean LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BroadcastEnterPerformanceHelper$EnterPeriodRunnable@5a61.run");
        try {
            if (this.LLILLL) {
                this.LLILLJJLI.start();
                this.LLILLL = false;
                C786410Ut5.LJLIIL(3000L, this.LL, this);
            } else {
                this.LLILLJJLI.stop();
                this.LLILLL = true;
                C786410Ut5.LJLIIL(500L, this.LL, this);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BroadcastEnterPerformanceHelper$EnterPeriodRunnable@5a61.run");
    }

    public C0UP4(Handler handler, C1300480jwk c1300480jwk) {
        this.LL = handler;
        this.LLILLJJLI = c1300480jwk;
    }
}
