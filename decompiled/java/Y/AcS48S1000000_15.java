package Y;

import X.C01N8;
import X.C924810aAp;
import X.C932160aMg;
import X.C943120aeM;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: loaded from: classes16.dex */
public class AcS48S1000000_15 implements InterfaceC743640TFa {
    public final int $t;
    public String s0;

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
            case 3:
                LIZ$3(this, liveDialog);
                break;
        }
    }

    public AcS48S1000000_15(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.s0 = str;
                break;
            default:
                this.s0 = str;
                break;
        }
    }

    public static final void LIZ$0(AcS48S1000000_15 acS48S1000000_15, LiveDialog liveDialog) {
        C943120aeM.LJIIJJI(acS48S1000000_15.s0, "click", "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS48S1000000_15 acS48S1000000_15, LiveDialog liveDialog) {
        C932160aMg.LIZ(C924810aAp.LJ().LJJII, acS48S1000000_15.s0, "click", "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS48S1000000_15 acS48S1000000_15, LiveDialog liveDialog) {
        C932160aMg.LIZ(C924810aAp.LJ().LJJII, acS48S1000000_15.s0, "click", "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS48S1000000_15 acS48S1000000_15, LiveDialog liveDialog) {
        C01N8.LIZ(0, "zoom", acS48S1000000_15.s0, 0L, "guest", "double_check_dialog_cancel", "");
        liveDialog.dismiss();
    }
}
