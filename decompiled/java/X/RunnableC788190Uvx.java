package X;

import android.os.Process;

/* JADX INFO: renamed from: X.0Uvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC788190Uvx implements Runnable {
    public final Runnable LL;
    public final int LLILLJJLI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GlobalLiveThreadPool$InnerRunnable@2a2.run");
        try {
            Process.setThreadPriority(this.LLILLJJLI);
            Runnable runnable = this.LL;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GlobalLiveThreadPool$InnerRunnable@2a2.run");
    }

    public RunnableC788190Uvx(Runnable runnable, int i) {
        this.LL = runnable;
        this.LLILLJJLI = i;
    }
}
