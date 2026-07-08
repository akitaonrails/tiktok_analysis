package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0qSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ExecutorC1551030qSr implements Executor {
    public static volatile ExecutorC1551030qSr LLILLJJLI;
    public final Executor LL = C786410Ut5.i4(new ThreadFactoryC1554430qYL(3));

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LL.execute(runnable);
    }
}
