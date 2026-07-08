package Y;

import X.C942580adU;
import X.C955400ayA;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: loaded from: classes16.dex */
public class AcS17S0000100_15 implements InterfaceC743640TFa {
    public final int $t;
    public long j0;

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

    public AcS17S0000100_15(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void LIZ$0(AcS17S0000100_15 acS17S0000100_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C942580adU.LJIIIZ(acS17S0000100_15.j0, "cancel");
    }

    public static final void LIZ$1(AcS17S0000100_15 acS17S0000100_15, LiveDialog liveDialog) {
        C942580adU.LJIIIIZZ(acS17S0000100_15.j0, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS17S0000100_15 acS17S0000100_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LJL(acS17S0000100_15.j0, "not_now");
    }
}
