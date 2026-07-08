package X;

import android.os.Handler;
import android.os.Message;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1Bxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222031Bxx implements InterfaceC2222281ByM {
    public final InterfaceC2222101By4 LIZ;
    public final C2222001Bxu LIZIZ;
    public Handler LIZJ;
    public Handler LIZLLL;
    public final List<IMessage> LJ = new CopyOnWriteArrayList();
    public final List<MessageSEI> LJFF = new CopyOnWriteArrayList();
    public final List<MessageSEI> LJI = new CopyOnWriteArrayList();

    @Override // X.InterfaceC2222281ByM
    public final int LIZJ() {
        return 4;
    }

    @Override // X.InterfaceC2222281ByM
    public final List<IMessage> LJI() {
        return null;
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222281ByM
    public final int LJIIJJI() {
        return 0;
    }

    @Override // X.InterfaceC2222281ByM
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        this.LIZJ = this.LIZ.LJI(new C1D12(this, 2));
        this.LIZLLL = this.LIZ.LJFF(new C1D12(this, 3));
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJFF).clear();
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.LIZLLL;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.LIZLLL;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final void LIZIZ(List<? extends IMessage> list) {
        Message messageObtainMessage;
        MessageMonitor messageMonitorLIZIZ = this.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleFeatureMessageDispatch size=");
        sbLIZ.append(((ArrayList) list).size());
        messageMonitorLIZIZ.log("MessagePortal", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LIZJ;
        if (handler != null && (messageObtainMessage = handler.obtainMessage(251, list)) != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (c2222371ByV.LIZ) {
            ((CopyOnWriteArrayList) this.LJ).clear();
            ((CopyOnWriteArrayList) this.LJFF).clear();
            ((CopyOnWriteArrayList) this.LJI).clear();
        }
    }

    public C2222031Bxx(InterfaceC2222101By4 interfaceC2222101By4, C2222001Bxu c2222001Bxu) {
        this.LIZ = interfaceC2222101By4;
        this.LIZIZ = c2222001Bxu;
    }

    @Override // X.InterfaceC2222281ByM
    public final void LJII(long j, List list) {
        Handler handler = this.LIZLLL;
        if (handler != null) {
            C786410Ut5.LJLJLJ(handler, handler.obtainMessage(152, list), j);
        }
    }
}
