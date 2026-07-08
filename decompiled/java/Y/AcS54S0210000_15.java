package Y;

import X.C1AI0;
import X.C924660aAa;
import X.C931490aLb;
import X.C956870b0X;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesRequestEndChannel;
import com.bytedance.android.livesdk.watch.OrientationChangeEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AcS54S0210000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void LIZ$0(AcS54S0210000_15 acS54S0210000_15, LiveDialog liveDialog) {
        if (acS54S0210000_15.z2) {
            C1AI0.LJIIIIZZ("click", "exit_vw_to_multiguest_find_guests", "confirm");
            DataChannel dataChannel = ((C931490aLb) acS54S0210000_15.l0).LL;
            if (dataChannel != null) {
                dataChannel.LC0(ViewerWishesRequestEndChannel.class, new AwS559S0100000_15((Function0) acS54S0210000_15.l1, (Function0<Unit>) 74));
            }
        } else {
            ((Function0) acS54S0210000_15.l1).invoke();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS54S0210000_15 acS54S0210000_15, LiveDialog liveDialog) {
        DataChannel dataChannel = ((MultiGuestV3GuestWidget) acS54S0210000_15.l0).dataChannel;
        if (dataChannel != null) {
            Room room = (Room) acS54S0210000_15.l1;
            boolean z = acS54S0210000_15.z2;
            C924660aAa.LJIIL(room, "switch");
            dataChannel.SX0(C956870b0X.class, Boolean.valueOf(z));
            dataChannel.FQ2(OrientationChangeEvent.class);
            dataChannel.FQ2(ResetSilentTimerEvent.class);
        }
        liveDialog.dismiss();
    }

    public AcS54S0210000_15(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
