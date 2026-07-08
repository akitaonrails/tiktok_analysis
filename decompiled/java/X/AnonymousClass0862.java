package X;

import android.os.Process;

/* JADX INFO: renamed from: X.0862, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0862 implements Runnable {
    public final Runnable LL;

    public AnonymousClass0862(Runnable runnable) {
        this.LL = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zza@6171.run");
        try {
            Process.setThreadPriority(0);
            this.LL.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zza@6171.run");
    }
}
