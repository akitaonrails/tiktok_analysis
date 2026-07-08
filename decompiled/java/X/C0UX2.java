package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveInfoParams;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.LiveTitleApi;
import com.bytedance.android.livesdk.broadcast.interaction.toolbar.LiveTitleEditDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UX2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UX2 implements InterfaceViewOnClickListenerC1102800enu {
    public DataChannel LL;
    public View LLILLJJLI;

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

    public final void LIZ(String str) {
        String strW30;
        int panelLayoutType;
        HashMap map = new HashMap();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).RA0(map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_live_title_setting");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII(str, "action_type");
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService == null || (strW30 = iInteractService.w30()) == null) {
            strW30 = "";
        }
        c474500IjALIZ.LJJII(strW30, "layout_id");
        InterfaceC769410UGd interfaceC769410UGdM70 = C781270Ukn.LJIILJJIL().M70();
        if (interfaceC769410UGdM70 != null) {
            panelLayoutType = interfaceC769410UGdM70.getPanelLayoutType();
        } else {
            panelLayoutType = 1;
        }
        c474500IjALIZ.LJJII(String.valueOf(panelLayoutType), "panel_layout_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        long id;
        Room room;
        RedDotExtensionKt.LIZ(C0UX6.LIVE_TITLE);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            String str = C771680UOw.LJIIJ;
            if (str == null) {
                str = "";
            }
            LiveTitleEditDialogFragment liveTitleEditDialogFragment = new LiveTitleEditDialogFragment(str, "live_setting", null);
            liveTitleEditDialogFragment.show(fragmentManager, "LiveTitleEditDialog");
            GetLiveInfoParams getLiveInfoParams = new GetLiveInfoParams();
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                id = room.getId();
            } else {
                Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room2 != null) {
                    id = room2.getId();
                } else {
                    id = 0;
                }
            }
            getLiveInfoParams.roomId = id;
            C480460Ism.LIZ().getClass();
            ((LiveTitleApi) C480460Ism.LIZLLL(LiveTitleApi.class)).requestGetLiveTitle(getLiveInfoParams).LJFF(new C0UO0()).LJJIIZ(new AfS181S0100000_12(liveTitleEditDialogFragment, 157), new C09JN() { // from class: X.00YU
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ToolbarLiveTitleBehavior@2781.onClick$1$2");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestGetLiveTitle failed: ");
                    sbLIZ.append(((Throwable) obj).getMessage());
                    C20441214yg.LJ("ToolbarLiveTitleBehavior", C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("ToolbarLiveTitleBehavior@2781.onClick$1$2");
                }
            });
        }
        LIZ("click");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LifecycleOwner lifecycleOwnerLJJIFFI;
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC1103130eoR.findViewById(R.id.y7r);
        Context context = interfaceC1103130eoR.getContext();
        if (context != null && (lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(context, false)) != null) {
            RedDotExtensionKt.LJI(this.LLILLJJLI, lifecycleOwnerLJJIFFI, null, C0UX6.LIVE_TITLE, new AwS591S0100000_12(dataChannel, 733));
        }
        LIZ("show");
    }
}
