package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0J9R, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9R implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public long LL = -1;
    public DataChannel LLILLJJLI;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public final void LIZ(DataChannel dataChannel) {
        Long lValueOf;
        Room room;
        this.LLILLJJLI = dataChannel;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_commercial_icon_show");
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        c474500IjALIZ.LJIILJJIL("live_take_detail");
        c474500IjALIZ.LIZ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        if (C464790IKn.LIZ.LIZIZ(this.LL)) {
            return;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
        } else {
            fragmentManager = null;
        }
        this.LL = C19322110iZ.LIZLLL(fragmentManager, ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).iM(), "live_commercial_content_toggle", null, null);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LIZ(dataChannel);
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        View view = c499640Jic.LIZ;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        LIZ(dataChannel);
        View view2 = c499640Jic.LIZ;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS111S0200000_7(this, dataChannel, 25), view2);
        }
    }
}
