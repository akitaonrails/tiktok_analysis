package X;

import Y.AObjectS309S0200000_7;
import android.view.View;
import com.bytedance.android.live.OpenSharePanelChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Iu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481250Iu3 implements InterfaceViewOnClickListenerC1102800enu {
    public boolean LL;
    public Room LLILLJJLI;
    public InterfaceC481170Itv LLILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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
    public final /* synthetic */ boolean dj() {
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room;
        if (this.LL && (room = this.LLILLJJLI) != null && room.getOwner() != null && this.LLILLJJLI.getOwner().getSecret() == 1) {
            C766270U4b.LIZLLL(2131844074);
            InterfaceC481170Itv interfaceC481170Itv = this.LLILLL;
            if (interfaceC481170Itv != null) {
                interfaceC481170Itv.LIZIZ();
            }
            this.LLILLL = null;
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7t);
        if (viewFindViewById != null) {
            C786410Ut5.T4(viewFindViewById, 0.5f);
        }
        View viewFindViewById2 = interfaceC1103130eoR.findViewById(R.id.y7s);
        if (viewFindViewById2 != null) {
            C786410Ut5.T4(viewFindViewById2, 0.3f);
        }
        View viewFindViewById3 = interfaceC1103130eoR.findViewById(R.id.y74);
        if (viewFindViewById3 != null) {
            C786410Ut5.T4(viewFindViewById3, 0.5f);
        }
        this.LL = Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class));
        this.LLILLJJLI = (Room) dataChannel.gg0(RoomChannel.class);
        dataChannel.BQ2(null, OpenSharePanelChannel.class, new AObjectS309S0200000_7(this, interfaceC1103130eoR, 7));
    }
}
