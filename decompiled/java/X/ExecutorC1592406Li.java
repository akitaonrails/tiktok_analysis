package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.06Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC1592406Li implements Executor {
    public static final ExecutorC1592406Li LLILLJJLI = new ExecutorC1592406Li();
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LL, runnable);
    }

    public final void LIZ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, this.LL, runnable);
    }
}
