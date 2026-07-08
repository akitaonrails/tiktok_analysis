package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Klv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ExecutorC527170Klv implements Executor {
    public static final ExecutorC527170Klv LLILLJJLI = new ExecutorC527170Klv();
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LL, runnable);
    }

    public final void LIZ(long j, Runnable runnable) {
        C786410Ut5.LJLIIL(j, this.LL, runnable);
    }
}
