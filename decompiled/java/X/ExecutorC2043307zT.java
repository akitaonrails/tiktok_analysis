package X;

import Y.ARunnableS103S0100000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.07zT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC2043307zT implements Executor {
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            C786410Ut5.LJJZZIII(this.LL, new ARunnableS103S0100000_3(runnable, 111));
        }
    }
}
