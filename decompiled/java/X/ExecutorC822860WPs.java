package X;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: X.0WPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ExecutorC822860WPs implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C786410Ut5.LJJZZIII(null, runnable)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) null);
        sbLIZ.append(" is shutting down");
        throw new RejectedExecutionException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
