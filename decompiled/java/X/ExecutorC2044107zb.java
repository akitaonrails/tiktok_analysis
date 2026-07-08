package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.07zb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC2044107zb implements Executor {
    public static final ExecutorC2044107zb LL = new ExecutorC2044107zb();
    public static final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        C786410Ut5.LJJZZIII(LLILLJJLI, runnable);
    }
}
