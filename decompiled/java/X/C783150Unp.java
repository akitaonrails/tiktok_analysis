package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestApplyCountChannel;
import com.bytedance.android.live.liveinteract.api.OpenMultiLivePanelEvent;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Unp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783150Unp implements InterfaceC773910UXl {
    public final ViewGroup LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public View LLILZIL;
    public View LLILZLL;
    public boolean LLIZLLLIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 914));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 913));

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131854915;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        Integer num;
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        DataChannel dataChannel = this.LLILLJJLI;
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).fI0((dataChannel == null || (num = (Integer) dataChannel.gg0(MultiGuestApplyCountChannel.class)) == null) ? 0 : num.intValue(), ((Boolean) this.LLIZ.getValue()).booleanValue() ? "more_panel" : "interaction_panel");
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        if (LiveHostSettingsUIConfig.v1()) {
            return R.attr.e16;
        }
        if (LiveHostSettingsUIConfig.v2()) {
            return R.attr.e17;
        }
        LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine();
        return R.attr.e4t;
    }

    public C783150Unp(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        if ((((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).co0() && (!LiveSdkMultiGuestEnableMixModeSetting.isEnable() || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xz0())) || ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).fI2(this.LLILLJJLI) || ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1()) {
            return;
        }
        if (this.LLIZLLLIL) {
            RedDotExtensionKt.LIZ(C0UX6.COHOST_WITH_MULTI_GUEST_GUIDE_REDDOT);
            InterfaceC934710aQn.Ic.LJFF(Boolean.TRUE);
        }
        if (((Boolean) this.LLIZ.getValue()).booleanValue()) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.LC0(OpenMultiLivePanelEvent.class, new C757730Tnv("more_panel", C2097608Jq.LJ()));
            }
        } else {
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null) {
                dataChannel2.LC0(OpenMultiLivePanelEvent.class, new C757730Tnv("interaction_panel", C2097608Jq.LJ()));
            }
        }
        DataChannel dataChannel3 = this.LLILLJJLI;
        if (dataChannel3 != null) {
            dataChannel3.zW(MultiGuestApplyCountChannel.class, 0);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C439101nJ.LJI(view2);
        }
        View view3 = this.LLILZLL;
        if (view3 != null) {
            C439101nJ.LJI(view3);
        }
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ls0(this.LLILLJJLI);
        DataChannel dataChannel4 = this.LLILLJJLI;
        if (dataChannel4 != null) {
            dataChannel4.zW(MultiGuestApplyCountChannel.class, 0);
        }
        DataChannel dataChannel5 = this.LLILLJJLI;
        if (dataChannel5 != null) {
            dataChannel5.FQ2(DismissToolbarPopEvent.class);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        View viewFindViewById;
        Integer num;
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.DQ2(BattleStateChannel.class, this, new AwS591S0100000_12(view, 1116));
            ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).AJ0(lifecycleOwner, dataChannel, new AwS626S0100000_12(view, 65));
        }
        if (((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).co0()) {
            if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT()) {
                if (view != null) {
                    C786410Ut5.T4(view, 0.34f);
                }
            } else if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xz0()) {
                if (view != null) {
                    C786410Ut5.T4(view, 0.34f);
                }
            } else if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
        } else if (!((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).Al1() && !((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).fI2(dataChannel)) {
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
        } else if (view != null) {
            C786410Ut5.T4(view, 0.34f);
        }
        View viewFindViewById2 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.t16);
        } else {
            viewFindViewById = null;
        }
        this.LLILZIL = viewFindViewById;
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.jd9);
        }
        this.LLILZLL = viewFindViewById2;
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(MultiGuestApplyCountChannel.class)) != null && num.intValue() > 0) {
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C12ES.LJIILL(0, view2);
            }
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ls0(this.LLILLJJLI);
        }
        View view3 = this.LLILZLL;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT() && Intrinsics.LJFF(InterfaceC934710aQn.Ic.LIZIZ(), Boolean.FALSE)) {
            RedDotExtensionKt.LJI(view3, lifecycleOwner, null, C0UX6.COHOST_WITH_MULTI_GUEST_GUIDE_REDDOT, new AwS591S0100000_12(this, 1115));
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
