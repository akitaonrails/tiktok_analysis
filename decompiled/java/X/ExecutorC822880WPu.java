package X;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: X.0WPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ExecutorC822880WPu implements Executor {
    public final Handler LL;

    public ExecutorC822880WPu(Looper looper) {
        this.LL = new BPEAHandler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C786410Ut5.LJJZZIII(this.LL, runnable)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" is shutting down");
        throw new RejectedExecutionException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public ExecutorC822880WPu(BPEAHandler bPEAHandler) {
        this.LL = bPEAHandler;
    }
}
