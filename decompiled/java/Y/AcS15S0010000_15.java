package Y;

import X.C1AI0;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;

/* JADX INFO: loaded from: classes16.dex */
public class AcS15S0010000_15 implements InterfaceC743640TFa {
    public final int $t;
    public boolean z0;

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

    public AcS15S0010000_15(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final void LIZ$0(AcS15S0010000_15 acS15S0010000_15, LiveDialog liveDialog) {
        if (acS15S0010000_15.z0) {
            C1AI0.LJIIIIZZ("click", "exit_vw_to_multiguest_find_guests", "cancel");
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS15S0010000_15 acS15S0010000_15, LiveDialog liveDialog) {
        MultiCoHostBeInvitedFragment.wS(acS15S0010000_15.z0);
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS15S0010000_15 acS15S0010000_15, LiveDialog liveDialog) {
        MultiCoHostBeInvitedFragment.wS(acS15S0010000_15.z0);
        liveDialog.dismiss();
    }
}
