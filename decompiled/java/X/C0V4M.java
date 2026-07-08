package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V4M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V4M {
    public static C0V4M LIZIZ;
    public final Object LIZ = new Object();

    public final void LIZ() {
        synchronized (this.LIZ) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0V4M() {
        new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0V4L
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != 0) {
                    return false;
                }
                C0V4M c0v4m = this.LL;
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                synchronized (c0v4m.LIZ) {
                    try {
                        if (messageObj == null) {
                            throw new NullPointerException("getClass");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return true;
            }
        });
    }
}
