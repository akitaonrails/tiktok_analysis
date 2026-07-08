package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700040uLC implements Handler.Callback {
    public volatile BPEAHandler LL = new BPEAHandler(C1700030uLB.LIZ, this);

    public final void LIZIZ() {
        BPEAHandler bPEAHandler = this.LL;
        if (bPEAHandler == null) {
            return;
        }
        this.LL = null;
        bPEAHandler.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                InterfaceC1700050uLD interfaceC1700050uLD = (InterfaceC1700050uLD) HandlerHook.getMessageObj(message.obj);
                long jLIZ = interfaceC1700050uLD.LIZ();
                if (jLIZ > 0) {
                    LIZ(interfaceC1700050uLD, jLIZ);
                    return true;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return true;
            }
        }
        return true;
    }

    public final void LIZ(InterfaceC1700050uLD interfaceC1700050uLD, long j) {
        BPEAHandler bPEAHandler = this.LL;
        if (bPEAHandler == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = interfaceC1700050uLD;
        C786410Ut5.LJLJLJ(bPEAHandler, messageObtain, j);
    }
}
