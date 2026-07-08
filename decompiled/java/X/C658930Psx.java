package X;

import android.os.Message;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Psx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658930Psx implements WeakHandler.IHandler, InterfaceC655620Pnc {
    public final InterfaceC648270Pbl LL;
    public final InterfaceC658970Pt1 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1316));

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC655620Pnc
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final WeakHandler LIZ() {
        return (WeakHandler) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            return interfaceC648270Pbl.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLJJJ() {
        LIZ().removeMessages(16);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        sbLIZ.append(interfaceC648270Pbl != null ? interfaceC648270Pbl.hashCode() : 0);
        sbLIZ.append("} pauseMedia");
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC648270Pbl interfaceC648270Pbl2 = this.LL;
        if (interfaceC648270Pbl2 != null) {
            interfaceC648270Pbl2.LLJJJ();
        }
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLLLLILLIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        sbLIZ.append(interfaceC648270Pbl != null ? interfaceC648270Pbl.hashCode() : 0);
        sbLIZ.append("} contextPause");
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ().removeMessages(16);
        InterfaceC648270Pbl interfaceC648270Pbl2 = this.LL;
        if (interfaceC648270Pbl2 != null) {
            interfaceC648270Pbl2.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC655620Pnc
    public final void onDestroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        sbLIZ.append(interfaceC648270Pbl != null ? interfaceC648270Pbl.hashCode() : 0);
        sbLIZ.append("} onDestroy");
        C2188811AlT.LIZIZ(sbLIZ);
        LIZ().removeCallbacksAndMessages(null);
        LIZ().removeMessages(16);
        InterfaceC648270Pbl interfaceC648270Pbl2 = this.LL;
        if (interfaceC648270Pbl2 != null) {
            interfaceC648270Pbl2.O4();
        }
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String aid;
        if (this.LLILLJJLI != null) {
            if (message.what == 16 && (HandlerHook.getMessageObj(message.obj) instanceof Aweme)) {
                String aid2 = ((Aweme) HandlerHook.getMessageObj(message.obj)).getAid();
                Aweme aweme = this.LLILLJJLI.getAweme();
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (!Intrinsics.LJFF(aid2, aid)) {
                    return;
                }
            } else {
                return;
            }
        }
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            C646200PWg.LIZIZ = new WeakReference<>(interfaceC648270Pbl);
            interfaceC648270Pbl.LLLLLIL();
        }
    }

    @Override // X.InterfaceC655620Pnc
    public final void u4(long j) {
        Aweme aweme;
        int iHashCode;
        LIZ().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        InterfaceC658970Pt1 interfaceC658970Pt1 = this.LLILLJJLI;
        if (interfaceC658970Pt1 != null) {
            aweme = interfaceC658970Pt1.getAweme();
        } else {
            aweme = null;
        }
        message.obj = aweme;
        LIZ().sendMessageDelayed(message, j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            iHashCode = interfaceC648270Pbl.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append("} playMedia delayed ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C658930Psx(C663070Pzd c663070Pzd, InterfaceC658970Pt1 interfaceC658970Pt1) {
        this.LL = c663070Pzd;
        this.LLILLJJLI = interfaceC658970Pt1;
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }
}
