package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.AnchorClickMultiCoHostIconChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCreatorLeagueCoHostInviteEntranceShowEvent;
import com.bytedance.android.live.liveinteract.api.MultiCoHostApplyCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiCoHostInteractionShowChannel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780330UjH implements InterfaceC773910UXl, InterfaceC941900acO {
    public final ViewGroup LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public int LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 911));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 912));
    public boolean LLJI;

    @Override // X.InterfaceC773910UXl
    public final int LIZIZ() {
        return 2131854914;
    }

    @Override // X.InterfaceC773910UXl
    public final void onHide() {
    }

    @Override // X.InterfaceC773910UXl
    public final int LJ() {
        LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine();
        return R.attr.e4s;
    }

    @Override // X.InterfaceC773910UXl
    public final void onShow() {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("position", ((Boolean) this.LLIZLLLIL.getValue()).booleanValue() ? "more" : "interact");
            linkedHashMap.put("is_clickable", this.LLILZ ? CardStruct.IStatusCode.DEFAULT : "1");
            linkedHashMap.put("reservation_anchor_cnts", String.valueOf(this.LLIZ));
            linkedHashMap.put("enter_from", "connection_icon");
            dataChannel.LC0(LinkCreatorLeagueCoHostInviteEntranceShowEvent.class, new C500380Jjo(linkedHashMap));
        }
    }

    public final void LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisableStatus: disable ");
        sbLIZ.append(false);
        sbLIZ.append(", disableStatus ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LJIIIZ("InteractionMultiCohostView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = false;
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public C780330UjH(ViewGroup viewGroup) {
        this.LL = viewGroup;
    }

    @Override // X.InterfaceC773910UXl
    public final void LIZ(DataChannel dataChannel) {
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        C0GZA.LIZIZ((View) this.LLJ.getValue());
        this.LLIZ = 0;
        InterfaceC941720ac6 interfaceC941720ac6LI = ((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).LI();
        if (interfaceC941720ac6LI != null) {
            interfaceC941720ac6LI.LJIIJJI(this);
        }
    }

    @Override // X.InterfaceC773910UXl
    public final void onClick(View view) {
        DataChannel dataChannel;
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClick: disableStatus ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("InteractionMultiCohostView", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.zW(MultiCoHostApplyCountChannel.class, 0);
        }
        C0GZA.LIZIZ((View) this.LLJ.getValue());
        if (!this.LLILZ && (dataChannel = this.LLILLJJLI) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (((Boolean) this.LLIZLLLIL.getValue()).booleanValue()) {
                str = "more";
            } else {
                str = "interact";
            }
            linkedHashMap.put("position", str);
            linkedHashMap.put("reservation_anchor_cnts", String.valueOf(this.LLIZ));
            if (this.LLIZ > 0) {
                linkedHashMap.put("enter_from", "appointment_dot");
            } else {
                linkedHashMap.put("enter_from", "icon_during_mg");
            }
            dataChannel.zW(AnchorClickMultiCoHostIconChannel.class, linkedHashMap);
        }
        this.LLIZ = 0;
        if (this.LLJI) {
            RedDotExtensionKt.LIZ(C0UX6.COHOST_INVITATION_DURING_MULTI_GUEST_INTERACT_REDDOT);
            InterfaceC934710aQn.Jc.LJFF(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC941900acO
    public final void LIZJ(C01EL c01el, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateChange: ability ");
        sbLIZ.append(str);
        sbLIZ.append(", abilityState ");
        sbLIZ.append(c01el);
        C20441214yg.LIZIZ("InteractionMultiCohostView", C2188811AlT.LIZIZ(sbLIZ));
        LIZLLL();
    }

    @Override // X.InterfaceC773910UXl
    public final void LJI(View view, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        View viewFindViewById;
        Integer num;
        int iIntValue;
        this.LLILZIL = view;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.jd9);
        } else {
            viewFindViewById = null;
        }
        this.LLILZLL = viewFindViewById;
        this.LLILLJJLI = dataChannel;
        InterfaceC941720ac6 interfaceC941720ac6LI = ((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).LI();
        if (interfaceC941720ac6LI != null) {
            interfaceC941720ac6LI.LIZ(this);
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(MultiCoHostApplyCountChannel.class)) != null && (iIntValue = num.intValue()) > 0) {
            this.LLIZ = iIntValue;
            View view2 = (View) this.LLJ.getValue();
            C0GZA.LIZ(view2, iIntValue, 0.0f, 0.0f);
            ViewParent parent = view2.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).setClipChildren(false);
            }
        }
        View view3 = this.LLILZLL;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).G71() && Intrinsics.LJFF(InterfaceC934710aQn.Jc.LIZIZ(), Boolean.FALSE)) {
            RedDotExtensionKt.LJI(view3, lifecycleOwner, null, C0UX6.COHOST_INVITATION_DURING_MULTI_GUEST_INTERACT_REDDOT, new AwS591S0100000_12(this, 1114));
        }
        if (dataChannel != null) {
            dataChannel.zW(MultiCoHostInteractionShowChannel.class, Boolean.TRUE);
        }
        LIZLLL();
    }

    @Override // X.InterfaceC773910UXl
    public final void LJFF(View view, String str, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel, boolean z, int i) {
        onClick(view);
    }
}
