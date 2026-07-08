package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822680WPa extends C0WPZ {
    public static volatile C822680WPa LLILLJJLI;
    public static BPEAHandler LLILLL;

    public static C822680WPa LIZ() {
        if (LLILLJJLI == null) {
            synchronized (C822680WPa.class) {
                try {
                    if (LLILLJJLI == null) {
                        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                        LLILLL = bPEAHandler;
                        LLILLJJLI = new C822680WPa(bPEAHandler);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLJJLI;
    }

    public C822680WPa(BPEAHandler bPEAHandler) {
        super(bPEAHandler);
    }

    @Override // X.C0WPZ, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (C786410Ut5.u3() == this.LL.getLooper().getThread()) {
            runnable.run();
            return;
        }
        BPEAHandler bPEAHandler = LLILLL;
        if (bPEAHandler == null) {
            return;
        }
        Message messageObtain = Message.obtain(bPEAHandler, runnable);
        messageObtain.setAsynchronous(true);
        C786410Ut5.LJLJJLL(LLILLL, messageObtain);
    }
}
