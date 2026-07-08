package X;

import Y.ARunnableS76S0200000_7;
import Y.AfS176S0100000_7;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.BlockMessageEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveResetMessagePanelState;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Igy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473140Igy implements InterfaceViewOnClickListenerC1102800enu {
    public final RecyclableWidgetManager LL;
    public InterfaceC1103130eoR LLILLJJLI;
    public LiveIconView LLILLL;
    public View LLILZ;
    public DataChannel LLILZIL;

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

    public C473140Igy(RecyclableWidgetManager recyclableWidgetManager) {
        this.LL = recyclableWidgetManager;
        Integer numLIZIZ = InterfaceC465670INx.LJLJI.LIZIZ();
        if (numLIZIZ != null && numLIZIZ.intValue() != 0) {
            numLIZIZ.intValue();
        }
    }

    public final void LIZ(boolean z) {
        int i;
        int i2;
        int iIntValue;
        if (LandscapeWatchLiveResetMessagePanelState.INSTANCE.isBlockMessageIconChangedToV2InLandscapeMode()) {
            LiveIconView liveIconView = this.LLILLL;
            if (liveIconView != null) {
                if (!z) {
                    i2 = R.drawable.eyy;
                } else {
                    i2 = R.drawable.etb;
                }
                liveIconView.setIcon(i2);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, liveIconView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                liveIconView.setIconTint(iIntValue);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LLILLL;
        if (liveIconView2 == null) {
            return;
        }
        if (!z) {
            i = R.drawable.eyx;
        } else {
            i = R.drawable.eta;
        }
        liveIconView2.setIcon(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.FQ2(BlockMessageEvent.class);
        }
        DataChannel dataChannel2 = this.LLILZIL;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(ResetSilentTimerEvent.class);
        }
        C0IMP.LIZ(this.LLILZIL, true);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        View viewFindViewById;
        this.LLILLJJLI = interfaceC1103130eoR;
        this.LLILZIL = dataChannel;
        this.LLILLL = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILLJJLI;
        if (interfaceC1103130eoR2 != null) {
            viewFindViewById = interfaceC1103130eoR2.findViewById(R.id.y7a);
        } else {
            viewFindViewById = null;
        }
        this.LLILZ = viewFindViewById;
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            liveIconView.setId(View.generateViewId());
        }
        C486790J7d.LIZJ(new ARunnableS76S0200000_7(this, dataChannel, 44));
        ((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this.LL))).LIZJ(new AfS176S0100000_7(this, 179));
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, KeyboardStatusChannel.class, new AwS586S0100000_7(this, 395));
        }
        LIZ(C1080800eEQ.LIZ());
        C0IMP.LIZIZ(dataChannel);
    }
}
