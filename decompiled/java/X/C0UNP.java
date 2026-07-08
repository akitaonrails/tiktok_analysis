package X;

import Y.AObserverS216S0100000_12;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.broadcast.interaction.function.ToolbarCampaignCenterViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UNP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNP implements InterfaceViewOnClickListenerC1102800enu {
    public final LifecycleOwner LL;
    public View LLILLJJLI;
    public TextView LLILLL;
    public ToolbarCampaignCenterViewModel LLILZ;

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

    public C0UNP(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        if (C500260Jjc.LJJJJIZL(this.LLILLJJLI)) {
            RedDotExtensionKt.LIZ(C0UX6.LIVE_BROADCAST_CAMPAIGN_CENTER);
        }
        C500260Jjc.LJIILLIIL(this.LLILLL);
        ToolbarCampaignCenterViewModel toolbarCampaignCenterViewModel = this.LLILZ;
        if (toolbarCampaignCenterViewModel != null) {
            Context context = view.getContext();
            toolbarCampaignCenterViewModel.vQ2();
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, toolbarCampaignCenterViewModel.LLILZLL);
        }
        ToolbarCampaignCenterViewModel toolbarCampaignCenterViewModel2 = this.LLILZ;
        if (toolbarCampaignCenterViewModel2 != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_campaign_center_enter");
            c474500IjALIZ.LJIL();
            if (toolbarCampaignCenterViewModel2.LLILLL) {
                i = 3;
            } else {
                i = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "prompt_icon");
            c474500IjALIZ.LJJII(Integer.valueOf(toolbarCampaignCenterViewModel2.LLILZ ? 1 : 0), "prompt_api_return");
            c474500IjALIZ.LJJII("live_take_detail_campaign_center", "enter_from");
            c474500IjALIZ.LJJII(toolbarCampaignCenterViewModel2.LLILZLL, "next_page_url");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        ToolbarCampaignCenterViewModel toolbarCampaignCenterViewModel = this.LLILZ;
        if (toolbarCampaignCenterViewModel != null) {
            toolbarCampaignCenterViewModel.LL.removeObservers(this.LL);
            toolbarCampaignCenterViewModel.LLILLJJLI.removeObservers(this.LL);
            toolbarCampaignCenterViewModel.LLILZ = false;
            toolbarCampaignCenterViewModel.LLILLL = false;
            toolbarCampaignCenterViewModel.LLILZIL = false;
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLJJLI = interfaceC1103130eoR.findViewById(R.id.y7r);
        this.LLILLL = (TextView) interfaceC1103130eoR.findViewById(R.id.y73);
        LiveIconView liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
        if (liveIconView != null) {
            liveIconView.setIconTint(-16777216);
        }
        C0UX6 c0ux6 = C0UX6.LIVE_BROADCAST_CAMPAIGN_CENTER;
        RedDotExtensionKt.LJI(this.LLILLJJLI, this.LL, null, c0ux6, null);
        ToolbarCampaignCenterViewModel toolbarCampaignCenterViewModel = (ToolbarCampaignCenterViewModel) C0U61.LIZ(new C0UNS()).get(ToolbarCampaignCenterViewModel.class);
        toolbarCampaignCenterViewModel.LL.observe(this.LL, new AObserverS216S0100000_12(this, 66));
        toolbarCampaignCenterViewModel.LLILLJJLI.observe(this.LL, new AObserverS216S0100000_12(this, 67));
        this.LLILZ = toolbarCampaignCenterViewModel;
        toolbarCampaignCenterViewModel.wQ2();
    }
}
