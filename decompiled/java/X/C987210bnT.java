package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestBubbleShowEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Pair;
import qo2.w;

/* JADX INFO: renamed from: X.0bnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987210bnT implements InterfaceC254600ye {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC254600ye
    public final void onShow() {
        switch (this.$t) {
            case 0:
                onShow$0(this);
                break;
            case 1:
                onShow$1(this);
                break;
            case 2:
                onShow$2(this);
                break;
            case 3:
                onShow$3(this);
                break;
            case 4:
                onShow$4(this);
                break;
            case 5:
                onShow$5(this);
                break;
            case 6:
                onShow$6(this);
                break;
            case 7:
                onShow$7(this);
                break;
            case 8:
                onShow$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onShow$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onShow$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onShow$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onShow$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onShow$13(this);
                break;
        }
    }

    public static final void onShow$0(C987210bnT c987210bnT) {
        ((C973600bRW) c987210bnT.l0).LIZLLL = EnumC1120860fH2.ANCHOR_CATCH_BEANS_NEW_MODE;
        C973690bRf.LIZ.LJJIJ("catch_bean_guide");
        InterfaceC1106030et7.R4.LJFF(1);
    }

    public static final void onShow$1(C987210bnT c987210bnT) {
        ((C973600bRW) c987210bnT.l0).LIZLLL = EnumC1120860fH2.ANCHOR_TAKE_THE_STAGE_NEW_MODE_V2;
        C973690bRf.LIZ.LJJIJ("take_stage_guide_v2");
        InterfaceC960800b6s.LLL.LJFF(1);
    }

    public static final void onShow$10(C987210bnT c987210bnT) {
        InterfaceC934710aQn.Mc.LJFF(Boolean.TRUE);
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = ((C935380aRs) c987210bnT.l0).LL;
        c945730aiZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "show");
        C945730aiZ.LJII(dataChannel, "livesdk_multi_dance_bubble_show", linkedHashMap);
    }

    public static final void onShow$11(C987210bnT c987210bnT) {
        ((C934320aQA) c987210bnT.l0).LLJLIL = true;
        C923190a8D.LJFF("show");
        InterfaceC934710aQn.yc.LIZJ(Boolean.TRUE);
    }

    public static final void onShow$12(C987210bnT c987210bnT) {
        ((C934320aQA) c987210bnT.l0).LLJLILLLLZIIL = true;
        InterfaceC1106030et7.A8.LJFF(Boolean.TRUE);
    }

    public static final void onShow$13(C987210bnT c987210bnT) {
        ((C934320aQA) c987210bnT.l0).LLJLLIL = true;
        C20441214yg.LJIIIZ("ToolbarMultiGuestBehavior", "[QC_BATCH_INVITE_V1] toolbar bubbleShown");
        C924660aAa.LJFF("show", "quick_connect_invite", C2097908Jt.LIZJ(new Pair("event_position", "room_mg_icon")));
        DataChannel dataChannel = ((C934320aQA) c987210bnT.l0).LLJJIJIIJIL;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestBubbleShowEvent.class, "quick_connect_invite");
        }
    }

    public static final void onShow$2(C987210bnT c987210bnT) {
        String string;
        ((C973600bRW) c987210bnT.l0).LIZLLL = EnumC1120860fH2.ANCHOR_TAKE_THE_STAGE_ROTATE;
        C973690bRf c973690bRf = C973690bRf.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("pk_id", string);
        C973690bRf.LJJIJIIJIL(12, c973690bRf, "livesdk_switch_guide_popup", linkedHashMap, false);
        InterfaceC960800b6s.LLLF.LJFF(1);
    }

    public static final void onShow$3(C987210bnT c987210bnT) {
        InterfaceC934710aQn.Za.LJFF(Boolean.FALSE);
        ((MultiHostInviteListFragmentV2) c987210bnT.l0).LLJZ = true;
    }

    public static final void onShow$4(C987210bnT c987210bnT) {
        ((C934330aQB) c987210bnT.l0).LLJJJJ = true;
        InterfaceC1106030et7.A8.LJFF(Boolean.TRUE);
    }

    public static final void onShow$5(C987210bnT c987210bnT) {
        C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "ANCHOR_INTERACTIVE_SETTING_ICON show");
        InterfaceC934710aQn.rc.LJFF(Boolean.TRUE);
        ((MultiLiveAsAnchorListDialogV2) c987210bnT.l0).m = true;
    }

    public static final void onShow$6(C987210bnT c987210bnT) {
        ((MultiLiveAsAnchorListDialogV2) c987210bnT.l0).o = true;
        InterfaceC934710aQn.sc.LJFF(Boolean.TRUE);
        C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "showAutoApprovalBubble show");
    }

    public static final void onShow$7(C987210bnT c987210bnT) {
        ((MultiLiveAsAnchorListDialogV2) c987210bnT.l0).LLLLIILL = true;
        InterfaceC934710aQn.Tc.LJFF(Boolean.TRUE);
    }

    public static final void onShow$8(C987210bnT c987210bnT) {
        int iIntValue;
        DataChannel dataChannel = (DataChannel) c987210bnT.l0;
        C0JT6<Integer> c0jt6 = InterfaceC980390bcT.Ta;
        Integer numLIZ = c0jt6.LIZ();
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        c0jt6.LIZJ(Integer.valueOf(iIntValue + 1));
        C500450Jjv.LIZ(dataChannel, null, "livesdk_pk_guide_show", "playbook_guide_icon");
        C918210a0B.LIZLLL = true;
    }

    public static final void onShow$9(C987210bnT c987210bnT) {
        String str;
        RtcUserInfo rtcUserInfoG0;
        DataChannel dataChannel = ((C934320aQA) c987210bnT.l0).LLJJIJIIJIL;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestBubbleShowEvent.class, "apply_pre_accepted");
        }
        HashMap map = new HashMap();
        map.put("event_action_type", "show");
        w.LIZ.getClass();
        map.put("enter_method", w.LJIIL());
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("action_type", w.LIZLLL());
        map.put("room_id", String.valueOf(C930540aK4.LJIIJ()));
        map.put("anchor_id", String.valueOf(C930540aK4.LJII()));
        map.put("guest_cnt", String.valueOf(Math.max(C924810aAp.LJ().LJJII, C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()))));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null || (str = rtcUserInfoG0.linkMicId) == null) {
            str = "";
        }
        map.put("link_id", str);
        C924660aAa.LJFF("show", "apply_pre_accepted", map);
    }

    public C987210bnT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
