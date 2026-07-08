package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Uae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ExecutorC774980Uae implements Executor {
    public static final /* synthetic */ int LL = 0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
