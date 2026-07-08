package Y;

import X.C013C;
import X.C0U3O;
import X.C1161920gLG;
import X.C19GU;
import X.C2188811AlT;
import X.C259800zU;
import X.C497740JfY;
import X.C766270U4b;
import X.C785410UrT;
import X.C918080Zzy;
import X.C919310a1x;
import X.C920460a3o;
import X.C922430a6z;
import X.C922490a75;
import X.C922800a7a;
import X.C923810a9D;
import X.C924030a9Z;
import X.C924110a9h;
import X.C924790aAn;
import X.C931830aM9;
import X.C932050aMV;
import X.C935470aS1;
import X.C936270aTJ;
import X.C955400ayA;
import X.C955450ayF;
import X.C955590ayT;
import X.EnumC920250a3T;
import X.InterfaceC743640TFa;
import X.InterfaceC927510aFB;
import X.InterfaceC955990az7;
import X.RunnableC514501zT;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.KickOutAllMultiGuestGuestsEvent;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS112S0400000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: loaded from: classes16.dex */
public class AcS84S0400000_15 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS84S0400000_15 acS84S0400000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C931830aM9 c931830aM9 = (C931830aM9) acS84S0400000_15.l0;
        String strLJIILL = ((InterfaceC927510aFB) acS84S0400000_15.l1).LJIILL();
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        c931830aM9.w6(strLJIILL, (LinkPlayerInfo) acS84S0400000_15.l2, (EnumC920250a3T) acS84S0400000_15.l3);
    }

    public static final void LIZ$1(AcS84S0400000_15 acS84S0400000_15, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        C924110a9h c924110a9h = (C924110a9h) acS84S0400000_15.l0;
        LinkListUser linkListUser = (LinkListUser) acS84S0400000_15.l1;
        boolean z = ((C013C) acS84S0400000_15.l2).element;
        if (((C013C) acS84S0400000_15.l3).element) {
            str = "check_click";
        } else {
            str = "click";
        }
        c924110a9h.LIZ(linkListUser, z, str, true);
        if (!((C924110a9h) acS84S0400000_15.l0).LLILLL.LJIIJ) {
            if (((C013C) acS84S0400000_15.l3).element) {
                C924110a9h c924110a9h2 = (C924110a9h) acS84S0400000_15.l0;
                c924110a9h2.LLILLL.LJIIIZ = true;
                DataChannel dataChannel = c924110a9h2.LLILZIL;
                if (dataChannel != null) {
                    dataChannel.LC0(MultiLiveGuestMuteAudioEvent.class, new C922430a6z(((C924110a9h) acS84S0400000_15.l0).LLILLL.LJIIIZ, "business_mute_guest_confirm_host_invite"));
                }
            }
            C924110a9h c924110a9h3 = (C924110a9h) acS84S0400000_15.l0;
            DataChannel dataChannel2 = c924110a9h3.LLILZIL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C924030a9Z(new C923810a9D(true, c924110a9h3.LLILLL.LJIILL, C924790aAn.LIZLLL().LJ, C924790aAn.LIZLLL().LJFF), "anchor_invite", "anchor_invite_guest"));
            }
            MultiGuestDataHolder multiGuestDataHolder = ((C924110a9h) acS84S0400000_15.l0).LLILLL;
            C922490a75.LIZIZ("anchor_manage", multiGuestDataHolder.LJJLIIIJILLIZJL, Boolean.TRUE, true, multiGuestDataHolder.LJIILL);
        }
    }

    public static final void LIZ$2(AcS84S0400000_15 acS84S0400000_15, LiveDialog liveDialog) {
        String str;
        C924110a9h c924110a9h;
        DataChannel dataChannel;
        liveDialog.dismiss();
        C924110a9h c924110a9h2 = (C924110a9h) acS84S0400000_15.l0;
        LinkListUser linkListUser = (LinkListUser) acS84S0400000_15.l1;
        boolean z = ((C013C) acS84S0400000_15.l2).element;
        if (((C013C) acS84S0400000_15.l3).element) {
            str = "check_click";
        } else {
            str = "click";
        }
        c924110a9h2.LIZ(linkListUser, z, str, false);
        C924110a9h c924110a9h3 = (C924110a9h) acS84S0400000_15.l0;
        MultiGuestDataHolder multiGuestDataHolder = c924110a9h3.LLILLL;
        if (!multiGuestDataHolder.LJIIIZ) {
            multiGuestDataHolder.LJIIIZ = true;
            c924110a9h3.LLILZIL.LC0(MultiLiveGuestMuteAudioEvent.class, new C922430a6z(((C924110a9h) acS84S0400000_15.l0).LLILLL.LJIIIZ, "business_mute_guest_confirm_host_invite"));
            C920460a3o.LJFF("anchor invite");
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843456));
            MultiGuestDataHolder multiGuestDataHolder2 = ((C924110a9h) acS84S0400000_15.l0).LLILLL;
            C922800a7a.LJI(multiGuestDataHolder2.LJJJJJL, multiGuestDataHolder2.LJJLIIIJILLIZJL, "anchor_manage", false);
        }
        if (((C013C) acS84S0400000_15.l3).element && (dataChannel = (c924110a9h = (C924110a9h) acS84S0400000_15.l0).LLILZIL) != null) {
            dataChannel.LC0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C924030a9Z(new C923810a9D(true, c924110a9h.LLILLL.LJIILL, C924790aAn.LIZLLL().LJ, C924790aAn.LIZLLL().LJFF), "anchor_invite", "anchor_invite_guest"));
        }
    }

    public static final void LIZ$3(AcS84S0400000_15 acS84S0400000_15, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C932050aMV c932050aMV = (C932050aMV) acS84S0400000_15.l0;
        String strLJIILL = ((InterfaceC927510aFB) acS84S0400000_15.l1).LJIILL();
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        c932050aMV.s0(strLJIILL, (LinkPlayerInfo) acS84S0400000_15.l2, (EnumC920250a3T) acS84S0400000_15.l3);
    }

    public static final void LIZ$4(AcS84S0400000_15 acS84S0400000_15, LiveDialog liveDialog) {
        C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show quick apply dialog, click use btn");
        liveDialog.dismiss();
        if (!TextUtils.isEmpty(((LiveEffect) acS84S0400000_15.l0).LJJ())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show quick apply dialog, use cache image success, shareImagePath = ");
            sbLIZ.append(((LiveEffect) acS84S0400000_15.l0).LJJ());
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", C2188811AlT.LIZIZ(sbLIZ));
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).removeSoloBgEffect((DataChannel) acS84S0400000_15.l1);
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) acS84S0400000_15.l2;
            multiGuestSharedBgAnchorViewModel.DQ2((LiveEffect) acS84S0400000_15.l0, new AwS259S0300000_15(multiGuestSharedBgAnchorViewModel, (Context) acS84S0400000_15.l3, (DataChannel) acS84S0400000_15.l1, 30), new AwS259S0300000_15((MultiGuestSharedBgAnchorViewModel) acS84S0400000_15.l2, (Context) acS84S0400000_15.l3, (DataChannel) acS84S0400000_15.l1, 31), false);
        } else {
            C919310a1x.LIZLLL("anchor_shared_bg_viewmodel", "show quick apply dialog, start download image");
            String strLJJLIIIJLLLLLLLZ = ((LiveEffect) acS84S0400000_15.l0).LJJLIIIJLLLLLLLZ();
            String strLLJLLIL = ((LiveEffect) acS84S0400000_15.l0).LLJLLIL();
            final LiveEffect liveEffect = (LiveEffect) acS84S0400000_15.l0;
            final DataChannel dataChannel = (DataChannel) acS84S0400000_15.l1;
            final MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = (MultiGuestSharedBgAnchorViewModel) acS84S0400000_15.l2;
            final Context context = (Context) acS84S0400000_15.l3;
            C936270aTJ.LIZIZ(strLJJLIIIJLLLLLLLZ, strLLJLLIL, new Function1<C0U3O, Unit>() { // from class: X.0aSL
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(C0U3O c0u3o) {
                    C0U3O c0u3o2 = c0u3o;
                    c0u3o2.LIZLLL(AFwS250S0000000_15.get$arr$(120));
                    c0u3o2.LJFF(new AwS112S0400000_15(liveEffect, dataChannel, multiGuestSharedBgAnchorViewModel2, context, 3));
                    c0u3o2.LIZIZ(new AwS293S0300000_15(multiGuestSharedBgAnchorViewModel2, context, dataChannel, 15));
                    return Unit.LIZ;
                }
            });
        }
        C935470aS1.LJFF("grid_shared_panel_used", "confirm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$5(AcS84S0400000_15 acS84S0400000_15, LiveDialog liveDialog) {
        long j;
        RivalExtraInfo.ReserveInfo reserveInfo;
        C955400ayA c955400ayA = C955400ayA.LIZ;
        long ownerUserId = ((C955590ayT) acS84S0400000_15.l0).LJ.getOwnerUserId();
        RivalExtraInfo rivalExtraInfo = ((C955590ayT) acS84S0400000_15.l0).LJIIJ;
        if (rivalExtraInfo != null && (reserveInfo = rivalExtraInfo.reserveInfo) != null) {
            j = reserveInfo.reservationId;
        } else {
            j = 0;
        }
        c955400ayA.LLIIIL(ownerUserId, j, true);
        C955450ayF c955450ayF = C955450ayF.LIZ;
        InterfaceC955990az7 interfaceC955990az7 = (InterfaceC955990az7) acS84S0400000_15.l1;
        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(interfaceC955990az7, (InterfaceC955990az7) acS84S0400000_15.l3, (Function1<? super Boolean, Unit>) 80);
        c955450ayF.getClass();
        if (C955450ayF.LIZJ(interfaceC955990az7, awS416S0200000_15)) {
            C19GU c19gu = (C19GU) ((C259800zU) acS84S0400000_15.l2).element;
            if (c19gu != null) {
                c19gu.dismiss();
                C785410UrT.LIZ(c19gu);
                return;
            }
            return;
        }
        DataChannel dataChannel = ((InterfaceC955990az7) acS84S0400000_15.l1).getDataChannel();
        if (dataChannel == null) {
            return;
        }
        dataChannel.LC0(KickOutAllMultiGuestGuestsEvent.class, new C918080Zzy(true, (Runnable) new RunnableC514501zT((C259800zU) acS84S0400000_15.l2, (Function1) acS84S0400000_15.l3, 36), (Integer) null, 12));
    }

    public AcS84S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
