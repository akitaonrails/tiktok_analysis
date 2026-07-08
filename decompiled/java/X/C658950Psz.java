package X;

import android.os.Message;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS159S1100000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Psz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C658950Psz implements WeakHandler.IHandler, InterfaceC655620Pnc {
    public final InterfaceC648270Pbl LL;
    public final C661490Px5 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1274));

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
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

    public final WeakHandler LIZJ() {
        return (WeakHandler) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC655620Pnc
    public void LJJJJ() {
        if (((Boolean) C1822007Bq.LIZ.getValue()).booleanValue()) {
            LIZJ().removeMessages(16);
        }
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.LJJJJ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public boolean isPlaying() {
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            return interfaceC648270Pbl.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC655620Pnc
    public void LLJJJ() {
        LIZJ().removeMessages(16);
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.LLJJJ();
        }
    }

    @Override // X.InterfaceC655620Pnc
    public void LLLLLILLIL() {
        LIZJ().removeMessages(16);
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC655620Pnc
    public void onDestroy() {
        LIZJ().removeCallbacksAndMessages(null);
        LIZJ().removeMessages(16);
        InterfaceC648270Pbl interfaceC648270Pbl = this.LL;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.O4();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(X.C658950Psz r7) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C658950Psz.LIZIZ(X.0Psz):boolean");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String aid;
        InterfaceC648270Pbl interfaceC648270Pbl;
        Aweme aweme;
        boolean zLIZIZ = LIZIZ(this);
        if (message.what == 16 && (HandlerHook.getMessageObj(message.obj) instanceof Aweme)) {
            String aid2 = ((Aweme) HandlerHook.getMessageObj(message.obj)).getAid();
            C661490Px5 c661490Px5 = this.LLILLJJLI;
            if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && zLIZIZ && (interfaceC648270Pbl = this.LL) != null) {
                interfaceC648270Pbl.LLLLLIL();
            }
        }
    }

    @Override // X.InterfaceC655620Pnc
    public void u4(long j) {
        Aweme aweme;
        boolean z = true;
        if (((Number) C1822107Br.LIZ.getValue()).intValue() != 1) {
            z = false;
        }
        Aweme aweme2 = null;
        aid = null;
        String aid = null;
        if (z) {
            C661490Px5 c661490Px5 = this.LLILLJJLI;
            if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null) {
                aid = aweme.getAid();
            }
            C0CNO.LIZLLL(0L, new AwS159S1100000_10(aid, this, 6));
            return;
        }
        LIZJ().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        C661490Px5 c661490Px52 = this.LLILLJJLI;
        if (c661490Px52 != null) {
            aweme2 = c661490Px52.LIZJ;
        }
        message.obj = aweme2;
        LIZJ().sendMessageDelayed(message, j);
    }

    public C658950Psz(InterfaceC648270Pbl interfaceC648270Pbl, C661490Px5 c661490Px5) {
        this.LL = interfaceC648270Pbl;
        this.LLILLJJLI = c661490Px5;
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }
}
