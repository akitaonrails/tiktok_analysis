package X;

import android.os.Handler;

/* JADX INFO: renamed from: X.0uO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class RunnableC1701800uO2 implements Runnable, InterfaceC420801kM {
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
        C1C7U.LIZ("SmartHandlerScheduler$ScheduledRunnable@dd3e.run");
        try {
            this.LLILLJJLI.run();
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("SmartHandlerScheduler$ScheduledRunnable@dd3e.run");
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    public RunnableC1701800uO2(Handler handler, Runnable runnable, boolean z) {
        this.LL = handler;
        this.LLILLJJLI = runnable;
        this.LLILLL = z;
    }
}
