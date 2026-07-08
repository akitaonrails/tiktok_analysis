package Y;

import X.C931740aM0;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: loaded from: classes16.dex */
public class AcS4S0002000_15 implements InterfaceC743640TFa {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f291i0;
    public int i1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS4S0002000_15 acS4S0002000_15, LiveDialog liveDialog) {
        C931740aM0.LJII(acS4S0002000_15.f291i0, acS4S0002000_15.i1, "guidance", "click", "cancel", "live_take_detail");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS4S0002000_15 acS4S0002000_15, LiveDialog liveDialog) {
        C931740aM0.LJII(acS4S0002000_15.f291i0, acS4S0002000_15.i1 - 1, "guidance", "click", "cancel", "live_take_detail");
        liveDialog.dismiss();
    }

    public AcS4S0002000_15(int i, int i2, int i3) {
        this.$t = i3;
        this.f291i0 = i;
        this.i1 = i2;
    }
}
