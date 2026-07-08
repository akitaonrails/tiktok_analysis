package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.07zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2045207zm<T> {
    public final InterfaceC1388720mF4 LIZ;
    public final Executor LIZIZ;
    public List<? extends T> LIZJ;

    public C2045207zm(C1388730mF5 c1388730mF5, C2045307zn c2045307zn) {
        this.LIZ = c1388730mF5;
        Executor executor = c2045307zn.LIZIZ;
        this.LIZIZ = executor == null ? new Executor() { // from class: X.07zl
            public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                if (runnable == null) {
                    return;
                }
                C786410Ut5.LJJZZIII(this.LL, runnable);
            }
        } : executor;
    }
}
