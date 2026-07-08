package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.gamelink.utils.DisableGuestCameraSettingChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0aQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934550aQX implements InterfaceViewOnClickListenerC1102800enu {
    public final LifecycleOwner LL;
    public DataChannel LLILLJJLI;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mMultiGuestDataHolder;

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

    public C934550aQX(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.live.design.view.icon.LiveIconView r3) {
        /*
            r2 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r2.mMultiGuestDataHolder
            r1 = 0
            if (r0 != 0) goto L6
            r0 = r1
        L6:
            boolean r0 = r0.LJIIJ
            if (r0 != 0) goto L27
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r2.mMultiGuestDataHolder
            if (r0 != 0) goto Lf
            r0 = r1
        Lf:
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LIZIZ()
            if (r0 == 0) goto L1b
            int r0 = r0.disableGuestOpenCamera
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L1b:
            boolean r0 = X.C932270aMr.LIZJ(r1)
            if (r0 == 0) goto L27
            r0 = 1056964608(0x3f000000, float:0.5)
        L23:
            X.C786410Ut5.i5(r3, r0)
            return
        L27:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C934550aQX.LIZ(com.bytedance.android.live.design.view.icon.LiveIconView):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C924490aAJ c924490aAJ = C924490aAJ.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        c924490aAJ.getClass();
        C924490aAJ.LIZIZ(multiGuestDataHolder, dataChannel, false, null, true);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C948450amx.LIZIZ.LIZJ(this);
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this.LL, MultiLiveGuestMuteVideoEvent.class, new AwS224S0300000_15(interfaceC1103130eoR, dataChannel, this, 64));
            dataChannel.EQ2(this.LL, DisableGuestCameraSettingChangeChannel.class, new AwS381S0200000_15(interfaceC1103130eoR, this, 191));
        }
        LiveIconView liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        if (liveIconView != null) {
            MultiGuestDataHolder multiGuestDataHolder = null;
            if (C934560aQY.LIZ[C1102950eo9.LIZIZ(dataChannel).ordinal()] == 1) {
                MultiGuestDataHolder multiGuestDataHolder2 = this.mMultiGuestDataHolder;
                if (multiGuestDataHolder2 != null) {
                    multiGuestDataHolder = multiGuestDataHolder2;
                }
                if (multiGuestDataHolder.LJIIJ) {
                    liveIconView.setIconAttr(R.attr.emc);
                } else {
                    liveIconView.setIconAttr(R.attr.emt);
                }
                LIZ(liveIconView);
                return;
            }
            MultiGuestDataHolder multiGuestDataHolder3 = this.mMultiGuestDataHolder;
            if (multiGuestDataHolder3 != null) {
                multiGuestDataHolder = multiGuestDataHolder3;
            }
            if (multiGuestDataHolder.LJIIJ) {
                liveIconView.setIconAttr(R.attr.emd);
            } else {
                liveIconView.setIconAttr(R.attr.emu);
            }
            LIZ(liveIconView);
        }
    }
}
