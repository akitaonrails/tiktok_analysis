package X;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WOd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C822450WOd extends C0WPC {
    public final ExecutorService LL;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.LL.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.LL.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.LL.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.LL.shutdownNow();
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.LL);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + strValueOf.length());
        sb.append(string);
        sb.append(e3.e);
        sb.append(strValueOf);
        sb.append(e3.f);
        return sb.toString();
    }

    public C822450WOd(ExecutorService executorService) {
        executorService.getClass();
        this.LL = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.LL.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.LL.awaitTermination(j, timeUnit);
    }
}
