package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.095K, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C095K implements Runnable, InterfaceC420801kM {
    public final Handler LL;
    public final Runnable LLILLJJLI;
    public final boolean LLILLL;
    public volatile boolean LLILZ;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (!this.LLILLL) {
            this.LL.removeCallbacks(this);
        }
        this.LLILZ = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SmartHandlerScheduler$ScheduledRunnable@ee6a.run");
        try {
            this.LLILLJJLI.run();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("SmartHandlerScheduler$ScheduledRunnable@ee6a.run");
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    public C095K(Handler handler, Runnable runnable, boolean z) {
        this.LL = handler;
        this.LLILLJJLI = runnable;
        this.LLILLL = z;
    }
}
