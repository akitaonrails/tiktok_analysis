package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0N5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5Z implements Executor {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (C786410Ut5.u3() == this.LL.getLooper().getThread()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(this.LL, runnable);
        }
    }
}
