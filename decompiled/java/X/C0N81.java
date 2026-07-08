package X;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0N81, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0N81 implements Runnable {
    public final /* synthetic */ Future LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    public /* synthetic */ C0N81(Future future, Runnable runnable) {
        this.LL = future;
        this.LLILLJJLI = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzbl@8a6e.run");
        try {
            Future future = this.LL;
            if (!future.isDone() && !future.isCancelled()) {
                Runnable runnable = this.LLILLJJLI;
                future.cancel(true);
                runnable.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzbl@8a6e.run");
    }
}
