package Y;

import X.C0IJT;
import X.C12OY;
import X.C1AHJ;
import X.C1AHK;
import X.C474500IjA;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import tikcast.api.boost.Card;

/* JADX INFO: loaded from: classes34.dex */
public class AcS357S0200000_33 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS357S0200000_33 acS357S0200000_33, LiveDialog liveDialog) {
        C12OY.LIZ.LJIIJJI(((C1AHJ) acS357S0200000_33.l0).LL.getDataChannel(), ((C1AHK) acS357S0200000_33.l1).LJ, "start");
        liveDialog.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(Y.AcS357S0200000_33 r9, com.bytedance.android.live.design.app.LiveDialog r10) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AcS357S0200000_33.LIZ$1(Y.AcS357S0200000_33, com.bytedance.android.live.design.app.LiveDialog):void");
    }

    public static final void LIZ$2(AcS357S0200000_33 acS357S0200000_33, LiveDialog liveDialog) {
        DataChannel dataChannel = ((C1AHJ) acS357S0200000_33.l0).LL.getDataChannel();
        Card card = ((C1AHK) acS357S0200000_33.l1).LJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_boost_card_fail_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        C12OY.LJIIIZ(c474500IjALIZ, card);
        c474500IjALIZ.LJJII("errorMessage", "fail_reason");
        c474500IjALIZ.LIZ();
        liveDialog.dismiss();
    }

    public AcS357S0200000_33(C1AHJ c1ahj, C1AHK c1ahk, int i) {
        this.$t = i;
        this.l0 = c1ahj;
        this.l1 = c1ahk;
    }
}
