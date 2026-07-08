package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ExecutorC822630WOv implements Executor {
    public final /* synthetic */ C822640WOw LL;

    public ExecutorC822630WOv(C822640WOw c822640WOw) {
        this.LL = c822640WOw;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LL.LL, runnable);
    }
}
