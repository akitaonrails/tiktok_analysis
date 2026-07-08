package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0T5D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T5D implements Executor {
    public final Executor LL;

    public C0T5D(Executor executor) {
        this.LL = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            this.LL.execute(C0T5C.LIZ(runnable));
        } else {
            this.LL.execute(runnable);
        }
    }
}
