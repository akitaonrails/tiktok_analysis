package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.ApplyGuideManageMoreAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.follow.FollowSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageParams;
import com.bytedance.android.live.liveinteract.multilive.social.model.PanelStatisticsParams;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.SocialGameUserSpotExtra;

/* JADX INFO: renamed from: X.0bnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987100bnI implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
        }
    }

    public static final void run$0(C987100bnI c987100bnI) {
        C20441214yg.LJIIIZ("MultiGuestAnchorQuickConnectViewModel", "OnComplete");
        ((MultiGuestAnchorQuickConnectViewModel) c987100bnI.l0).vQ2("time_out");
        ((MultiGuestAnchorQuickConnectViewModel) c987100bnI.l0).LLILLJJLI.onNext(EnumC931540aLg.IDLE);
    }

    public static final void run$1(C987100bnI c987100bnI) {
        boolean z;
        String str;
        Object objRemove = ((HashMap) C960930b75.LIZ).remove((InterfaceC961690b8J) c987100bnI.l0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCacheAndNetworkObservable, remove request success = ");
        if (objRemove != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", section=");
        C961040b7G c961040b7GLIZ = ((InterfaceC961690b8J) c987100bnI.l0).LIZ();
        if (c961040b7GLIZ != null) {
            str = c961040b7GLIZ.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" Thread=");
        sbLIZ.append(C786410Ut5.u3());
        C20441214yg.LIZIZ("CoHostNetworkCacheObservable", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$10(C987100bnI c987100bnI) {
        if (((C953770avX) c987100bnI.l0) != null) {
            C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
            C953770avX c953770avXLJIIIIZZ = c915050Zv5.LIZ().LJIIIIZZ();
            if (c953770avXLJIIIIZZ != null && Intrinsics.LJFF((C953770avX) c987100bnI.l0, c953770avXLJIIIIZZ)) {
                C20441214yg.LJIIIZ("TemplateManager_noticeboard", "found fake preview draft and clear");
                c915050Zv5.LIZ().LJIILIIL(c953770avXLJIIIIZZ.LIZIZ());
            }
        }
    }

    public static final void run$11(C987100bnI c987100bnI) {
        ((MultiCoHostBeInvitedFragment) c987100bnI.l0).LLLJ.dispose();
    }

    public static final void run$12(C987100bnI c987100bnI) {
        ((Function0) c987100bnI.l0).invoke();
    }

    public static final void run$13(C987100bnI c987100bnI) {
        ((MultiGuestCreateAvatarFragment) c987100bnI.l0).LLJJJIL = null;
    }

    public static final void run$14(C987100bnI c987100bnI) {
        ((C918150a05) c987100bnI.l0).LIZIZ = null;
    }

    public static final void run$15(C987100bnI c987100bnI) {
        ((Runnable) c987100bnI.l0).run();
    }

    public static final void run$16(C987100bnI c987100bnI) {
        ((C11NJ) ((AbstractC959650b51) c987100bnI.l0).LIZLLL.getValue()).dispose();
    }

    public static final void run$17(C987100bnI c987100bnI) {
        ((C946820akK) c987100bnI.l0).LLILZ.j0(R.style.a7a);
        ((C946820akK) c987100bnI.l0).LLILZ.setRadius(C497740JfY.LIZIZ(999));
        ((C946820akK) c987100bnI.l0).LLILZ.setText(C497740JfY.LJIJI(2131843264));
        ((C946820akK) c987100bnI.l0).LLILZ.setClickable(false);
    }

    public static final void run$18(C987100bnI c987100bnI) {
        C946690ak7 c946690ak7 = (C946690ak7) c987100bnI.l0;
        EnumC946760akE enumC946760akE = EnumC946760akE.FOLLOW_GUIDE_NORMAL;
        EnumC946710ak9 enumC946710ak9 = EnumC946710ak9.SHARE;
        C13BV c13bv = C13BV.INSTANCE;
        c946690ak7.LJIIIZ(enumC946760akE, enumC946710ak9, 3, c13bv, c13bv, null);
    }

    public static final void run$19(C987100bnI c987100bnI) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("zoom position complete ");
        sbLIZ.append((EnlargeScreenManageParams) c987100bnI.l0);
        C20441214yg.LJIIIZ("ZoomAnchorPresenterV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$2(C987100bnI c987100bnI) {
        ((Function0) c987100bnI.l0).invoke();
    }

    public static final void run$20(C987100bnI c987100bnI) {
        InterfaceC914470Zu9 interfaceC914470Zu9 = (InterfaceC914470Zu9) c987100bnI.l0;
        if (interfaceC914470Zu9 != null) {
            interfaceC914470Zu9.onSuccess();
        }
    }

    public static final void run$21(C987100bnI c987100bnI) {
        C20441214yg.LIZIZ("NoticeboardUtils", "trigger onComplete");
        ((Function0) c987100bnI.l0).invoke();
    }

    public static final void run$22(C987100bnI c987100bnI) {
        long jLongValue;
        C936410aTX c936410aTX = (C936410aTX) c987100bnI.l0;
        c936410aTX.LLJILLL = null;
        c936410aTX.LLJI = false;
        Long l = c936410aTX.LLJIJIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c936410aTX.LJIIJJI(jLongValue);
    }

    public static final void run$23(C987100bnI c987100bnI) {
        String str;
        SocialGameUserSpotExtra socialGameUserSpotExtra;
        C20441214yg.LIZIZ("NicknameBizViewElement", "switch enlarge complete");
        C945730aiZ c945730aiZ = C945730aiZ.LIZ;
        DataChannel dataChannel = ((C940120aZW) c987100bnI.l0).getDataChannel();
        MultiGuestSpotExtra multiGuestExtra = ((C940120aZW) c987100bnI.l0).getWindow().getMultiGuestExtra();
        if (multiGuestExtra != null && (socialGameUserSpotExtra = multiGuestExtra.socialGameUser) != null && socialGameUserSpotExtra.isEnlarged) {
            str = "exit_preview";
        } else {
            str = "preview";
        }
        c945730aiZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", str);
        linkedHashMap.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        C945730aiZ.LJII(dataChannel, "livesdk_multi_guest_dance_preview_status_change", linkedHashMap);
    }

    public static final void run$24(C987100bnI c987100bnI) {
        C20441214yg.LIZIZ("TeamMatchInviteeCoordinator", "fallbacktimeout, back to NONE");
        ((Function1) c987100bnI.l0).invoke(EnumC976390bW1.TIME_OUT);
    }

    public static final void run$25(C987100bnI c987100bnI) {
        long jLongValue;
        C939710aYr c939710aYr = (C939710aYr) c987100bnI.l0;
        c939710aYr.LLLJL = null;
        c939710aYr.LLLILZ = false;
        Long l = c939710aYr.LLLILZLLLI;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c939710aYr.LJJIJLIJ(jLongValue);
    }

    public static final void run$26(C987100bnI c987100bnI) {
        ((C971040bNO) c987100bnI.l0).LJIIJ = false;
    }

    public static final void run$27(C987100bnI c987100bnI) {
        ((C971040bNO) c987100bnI.l0).LJIIJ = false;
    }

    public static final void run$3(C987100bnI c987100bnI) {
        ((C971050bNP) c987100bnI.l0).LJIIIZ = false;
    }

    public static final void run$4(C987100bnI c987100bnI) {
        ((Runnable) c987100bnI.l0).run();
    }

    public static final void run$5(C987100bnI c987100bnI) {
        long id;
        ((ApplyGuideManageMoreAbilityImpl) c987100bnI.l0).LLILLJJLI = null;
        if (!((ArrayList) r1.LLILZ).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((ApplyGuideManageMoreAbilityImpl) c987100bnI.l0).LLILZ);
            ((ArrayList) ((ApplyGuideManageMoreAbilityImpl) c987100bnI.l0).LLILZ).clear();
            Room room = (Room) ((ApplyGuideManageMoreAbilityImpl) c987100bnI.l0).LL.gg0(RoomChannel.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C11JL c11jl = ((ApplyGuideManageMoreAbilityImpl) c987100bnI.l0).LLILLL;
            if (c11jl != null) {
                c11jl.dispose();
            }
            ApplyGuideManageMoreAbilityImpl applyGuideManageMoreAbilityImpl = (ApplyGuideManageMoreAbilityImpl) c987100bnI.l0;
            C480460Ism.LIZ().getClass();
            MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
            PanelStatisticsParams panelStatisticsParams = new PanelStatisticsParams();
            panelStatisticsParams.roomId = id;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                PanelStatisticsParams.ReqParam reqParam = new PanelStatisticsParams.ReqParam();
                reqParam.userId = jLongValue;
                arrayList2.add(reqParam);
            }
            panelStatisticsParams.data = arrayList2;
            applyGuideManageMoreAbilityImpl.LLILLL = (C11JL) multiLiveApi.panelStatistics(panelStatisticsParams).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0aFb
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ApplyGuideManageMoreAbilityImpl@b43e.onExpose$1$1$2");
                    C1C7U.LIZIZ("ApplyGuideManageMoreAbilityImpl@b43e.onExpose$1$1$2");
                }
            }, new AfS151S0200000_15((ApplyGuideManageMoreAbilityImpl) c987100bnI.l0, arrayList, 20));
        }
    }

    public static final void run$6(C987100bnI c987100bnI) {
        FollowSheetFragment followSheetFragment = (FollowSheetFragment) c987100bnI.l0;
        followSheetFragment.LLJZIJLIL = "timeout";
        followSheetFragment.close(1);
    }

    public static final void run$7(C987100bnI c987100bnI) {
        LiveActionSheetDialog liveActionSheetDialog = (LiveActionSheetDialog) c987100bnI.l0;
        liveActionSheetDialog.dismiss();
        C785410UrT.LIZ(liveActionSheetDialog);
    }

    public static final void run$8(C987100bnI c987100bnI) {
        LiveActionSheetDialog liveActionSheetDialog = (LiveActionSheetDialog) c987100bnI.l0;
        liveActionSheetDialog.dismiss();
        C785410UrT.LIZ(liveActionSheetDialog);
    }

    public static final void run$9(C987100bnI c987100bnI) {
        ((MultiGuestCreateAvatarFragment) c987100bnI.l0).LLJJJ = null;
    }

    public C987100bnI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
