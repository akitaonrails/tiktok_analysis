package X;

import Y.ARunnableS110S0100000_10;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0QxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687060QxE implements InterfaceC687110QxJ {
    public final Long LIZ;
    public final InterfaceC687080QxG LIZIZ;
    public HandlerThread LIZJ;
    public BPEAHandler LIZLLL;
    public long LJ;
    public final ARunnableS110S0100000_10 LJFF;

    @Override // X.InterfaceC687110QxJ
    public final void LIZ() {
        this.LIZIZ.L5();
    }

    public final Handler LIZIZ() {
        Looper looperW2;
        if (this.LIZJ == null) {
            HandlerThread handlerThread = new HandlerThread("user_act_detect_thread");
            handlerThread.start();
            this.LIZJ = handlerThread;
        }
        if (this.LIZLLL == null) {
            HandlerThread handlerThread2 = this.LIZJ;
            this.LIZLLL = (handlerThread2 == null || (looperW2 = C786410Ut5.W2(handlerThread2)) == null) ? null : new BPEAHandler(looperW2);
        }
        return this.LIZLLL;
    }

    public C687060QxE(Long l, InterfaceC687080QxG interfaceC687080QxG) {
        long jLongValue;
        this.LIZ = l;
        this.LIZIZ = interfaceC687080QxG;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 3;
        }
        this.LJ = jLongValue;
        this.LJFF = new ARunnableS110S0100000_10(this, 165);
    }
}
