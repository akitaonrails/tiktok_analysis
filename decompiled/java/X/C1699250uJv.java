package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699250uJv implements Handler.Callback {
    public static final C1699250uJv LLILLL = new C1699250uJv();
    public final BPEAHandler LL;
    public volatile long LLILLJJLI;

    public C1699250uJv() {
        new BPEAHandler(Looper.getMainLooper());
        this.LLILLJJLI = 2500L;
        C365090ETb.LIZIZ();
        this.LLILLJJLI = 2500L;
        this.LL = new BPEAHandler(C786410Ut5.W2(C0C2E.LIZ), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                if (C786410Ut5.u3().isInterrupted()) {
                    return false;
                }
                C786410Ut5.LJLJJI(0, this.LLILLJJLI, this.LL);
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
