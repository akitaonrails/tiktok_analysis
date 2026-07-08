package Y;

import X.AbstractC1273900jFs;
import X.C09JN;
import X.C0IJT;
import X.C0IPN;
import X.C0UVC;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1338270kvh;
import X.C15438062q;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C410901il;
import X.C465520INi;
import X.C474500IjA;
import X.C774940Uaa;
import X.C919610a2R;
import X.C923190a8D;
import X.C923790a9B;
import X.C924790aAn;
import X.C927570aFH;
import X.C941300abQ;
import X.C970280bMA;
import X.C974540bT2;
import X.InterfaceC769940UIe;
import X.InterfaceC934710aQn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestHasMoreSuggestGuestChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAugurMockPerfScore;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAugurMockThermalScore;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestAnchorPanelOptimizedSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.performance.RealtimeGameHostPerfScoreSettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class AfS57S0110000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowCoHostSuggestionsFromAudienceStatus$1");
        InterfaceC934710aQn.ob.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.PR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowCoHostSuggestionsFromAudienceStatus$1");
    }

    public static final void accept$1(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowCoHostSuggestionsFromAudienceStatus$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.PR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowCoHostSuggestionsFromAudienceStatus$2");
    }

    public static final void accept$10(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostApplication$1");
        InterfaceC934710aQn.eb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.WR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostApplication$1");
    }

    public static final void accept$11(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostApplication$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.WR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostApplication$2");
    }

    public static final void accept$12(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostInvites$1");
        InterfaceC934710aQn.db.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.ZR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostInvites$1");
    }

    public static final void accept$13(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostInvites$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.ZR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveFriendMultiHostInvites$2");
    }

    public static final void accept$14(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostApplication$1");
        InterfaceC934710aQn.gb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.aS(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostApplication$1");
    }

    public static final void accept$15(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostApplication$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.aS(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostApplication$2");
    }

    public static final void accept$16(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostInvites$1");
        InterfaceC934710aQn.fb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.bS(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostInvites$1");
    }

    public static final void accept$17(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostInvites$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.bS(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateReceiveNotFriendMultiHostInvites$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        boolean z;
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        List<LinkPlayerInfo> list;
        MultiLiveGuestInfoList multiLiveGuestInfoList2;
        List<LinkPlayerInfo> list2;
        DataChannel dataChannel;
        boolean z2;
        MultiLiveGuestInfoList multiLiveGuestInfoList3;
        C1C7U.LIZ("MultiLiveAsAnchorListDialogV2@77b0.requestRefreshSuggestUser$disposable$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "onSuggestRefreshClicked --> getListByType suc");
        if (afS57S0110000_15.z1) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_suggested_shuffle_click");
            c474500IjALIZ.LJJIIZI(C923190a8D.LIZ());
            c474500IjALIZ.LIZ();
            C20441214yg.LIZIZ("MultiGuestSuggestUserReporter", "livesdk_multi_anchor_guest_suggested_shuffle_click");
        }
        if (LiveSdkMultiGuestAnchorPanelOptimizedSetting.INSTANCE.getConfig().suggestListInRealTime && (dataChannel = ((MultiLiveAsAnchorListDialogV2) afS57S0110000_15.l0).LLJI) != null) {
            if (baseResponse != null && (multiLiveGuestInfoList3 = (MultiLiveGuestInfoList) baseResponse.data) != null) {
                z2 = multiLiveGuestInfoList3.hasMoreSuggestGuest;
            } else {
                z2 = true;
            }
            dataChannel.zW(MultiGuestHasMoreSuggestGuestChannel.class, Boolean.valueOf(z2));
        }
        ArrayList arrayList = null;
        if (baseResponse != null && (multiLiveGuestInfoList2 = (MultiLiveGuestInfoList) baseResponse.data) != null && (list2 = multiLiveGuestInfoList2.suggestedUsers) != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "onSuggestRefreshClicked --> show empty ui");
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) afS57S0110000_15.l0;
            multiLiveAsAnchorListDialogV2.getClass();
            C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", "showSuggestUserLoadingView");
            multiLiveAsAnchorListDialogV2.K = true;
            multiLiveAsAnchorListDialogV2.L = true;
            boolean zLIZ = C919610a2R.LIZ();
            C410901il c410901il = multiLiveAsAnchorListDialogV2.LLLLLJIL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c410901il, 10));
            Iterator<Object> it2 = c410901il.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next());
            }
            C410901il c410901il2 = multiLiveAsAnchorListDialogV2.LLLLJ;
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(c410901il2, 10));
            Iterator<Object> it3 = c410901il2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next());
            }
            C410901il c410901il3 = multiLiveAsAnchorListDialogV2.LLLLL;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(c410901il3, 10));
            Iterator<Object> it4 = c410901il3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(it4.next());
            }
            List<? extends LinkPlayerInfo> list3 = multiLiveAsAnchorListDialogV2.LLJLLIL;
            List<? extends LinkPlayerInfo> list4 = multiLiveAsAnchorListDialogV2.LLJLLL;
            C410901il c410901il4 = multiLiveAsAnchorListDialogV2.LLLLJI;
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(c410901il4, 10));
            Iterator<Object> it5 = c410901il4.iterator();
            while (it5.hasNext()) {
                arrayList5.add(it5.next());
            }
            C410901il c410901il5 = multiLiveAsAnchorListDialogV2.LLLLLIL;
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(c410901il5, 10));
            Iterator<Object> it6 = c410901il5.iterator();
            while (it6.hasNext()) {
                arrayList6.add(it6.next());
            }
            List<ListByTypeResponse.ChatGroupInfo> list5 = multiLiveAsAnchorListDialogV2.LLJZ;
            if (list5 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list5, 10));
                Iterator<ListByTypeResponse.ChatGroupInfo> it7 = list5.iterator();
                while (it7.hasNext()) {
                    arrayList.add(it7.next());
                }
            }
            C410901il c410901il6 = multiLiveAsAnchorListDialogV2.LLLLLLJ;
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(c410901il6, 10));
            Iterator<Object> it8 = c410901il6.iterator();
            while (it8.hasNext()) {
                arrayList7.add(it8.next());
            }
            multiLiveAsAnchorListDialogV2.LLJJL(zLIZ, arrayList2, arrayList3, arrayList4, list3, list4, arrayList5, arrayList6, arrayList, arrayList7, multiLiveAsAnchorListDialogV2.LLJZIJLIL);
        } else if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null && (list = multiLiveGuestInfoList.suggestedUsers) != null) {
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = (MultiLiveAsAnchorListDialogV2) afS57S0110000_15.l0;
            multiLiveAsAnchorListDialogV22.LLLLLLJ.clear();
            multiLiveAsAnchorListDialogV22.LLLLLLJ.addAll(list);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSuggestRefreshClicked --> updateUserInfo, suggestListSize = ");
            sbLIZ.append(list.size());
            C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
            boolean zLIZ2 = C919610a2R.LIZ();
            C410901il c410901il7 = multiLiveAsAnchorListDialogV22.LLLLLJIL;
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(c410901il7, 10));
            Iterator<Object> it9 = c410901il7.iterator();
            while (it9.hasNext()) {
                arrayList8.add(it9.next());
            }
            C410901il c410901il8 = multiLiveAsAnchorListDialogV22.LLLLJ;
            ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(c410901il8, 10));
            Iterator<Object> it10 = c410901il8.iterator();
            while (it10.hasNext()) {
                arrayList9.add(it10.next());
            }
            C410901il c410901il9 = multiLiveAsAnchorListDialogV22.LLLLL;
            ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(c410901il9, 10));
            Iterator<Object> it11 = c410901il9.iterator();
            while (it11.hasNext()) {
                arrayList10.add(it11.next());
            }
            List<? extends LinkPlayerInfo> list6 = multiLiveAsAnchorListDialogV22.LLJLLIL;
            List<? extends LinkPlayerInfo> list7 = multiLiveAsAnchorListDialogV22.LLJLLL;
            C410901il c410901il10 = multiLiveAsAnchorListDialogV22.LLLLJI;
            ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(c410901il10, 10));
            Iterator<Object> it12 = c410901il10.iterator();
            while (it12.hasNext()) {
                arrayList11.add(it12.next());
            }
            C410901il c410901il11 = multiLiveAsAnchorListDialogV22.LLLLLIL;
            ArrayList arrayList12 = new ArrayList(C15438062q.LJIJJ(c410901il11, 10));
            Iterator<Object> it13 = c410901il11.iterator();
            while (it13.hasNext()) {
                arrayList12.add(it13.next());
            }
            C410901il c410901il12 = multiLiveAsAnchorListDialogV22.LLLLLLIL;
            ArrayList arrayList13 = new ArrayList(C15438062q.LJIJJ(c410901il12, 10));
            Iterator<Object> it14 = c410901il12.iterator();
            while (it14.hasNext()) {
                arrayList13.add(it14.next());
            }
            C410901il c410901il13 = multiLiveAsAnchorListDialogV22.LLLLLLJ;
            ArrayList arrayList14 = new ArrayList(C15438062q.LJIJJ(c410901il13, 10));
            Iterator<Object> it15 = c410901il13.iterator();
            while (it15.hasNext()) {
                arrayList14.add(it15.next());
            }
            multiLiveAsAnchorListDialogV22.LLJJL(zLIZ2, arrayList8, arrayList9, arrayList10, list6, list7, arrayList11, arrayList12, arrayList13, arrayList14, multiLiveAsAnchorListDialogV22.LLJZIJLIL);
        }
        C1C7U.LIZIZ("MultiLiveAsAnchorListDialogV2@77b0.requestRefreshSuggestUser$disposable$1");
    }

    public static final void accept$19(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        Float f;
        AbstractC1273900jFs liveCore;
        C1C7U.LIZ("GameBroadcastFragment@2a83.onStreamStart$3");
        try {
            JSONObject jSONObjectJR = C465520INi.LIZ.JR();
            Map<String, Object> map = C1338270kvh.LIZ;
            C923790a9B c923790a9B = new C923790a9B();
            c923790a9B.LJIIIIZZ = Float.valueOf(CastFloatProtector.parseFloat(jSONObjectJR.get("cpu_rate_android").toString()));
            c923790a9B.LJIIIZ = Float.valueOf(CastFloatProtector.parseFloat(jSONObjectJR.get("single_cores_cpu_speed").toString()));
            c923790a9B.LIZLLL = (int) CastFloatProtector.parseFloat(jSONObjectJR.get("realtime_thermal_score").toString());
            if ((!GameDualDeviceAdaptiveSetting.INSTANCE.isExperimentGroup() || !afS57S0110000_15.z1) && RealtimeGameHostPerfScoreSettings.isEnabled()) {
                c923790a9B.LIZLLL = (int) CastFloatProtector.parseFloat(jSONObjectJR.get("realtime_thermal_score_host").toString());
            }
            c923790a9B.LJ = Float.valueOf(CastFloatProtector.parseFloat(jSONObjectJR.get("game_performance_score_host").toString()));
            c923790a9B.LJIIJ = Float.valueOf(CastFloatProtector.parseFloat(jSONObjectJR.get("thermal_value").toString()));
            c923790a9B.LIZ = (int) CastFloatProtector.parseFloat(jSONObjectJR.get("realtime_performance_score").toString());
            c923790a9B.LIZIZ = (int) CastFloatProtector.parseFloat(jSONObjectJR.get("realtime_drop3_score").toString());
            c923790a9B.LIZJ = (int) CastFloatProtector.parseFloat(jSONObjectJR.get("realtime_fps_score").toString());
            Object obj2 = jSONObjectJR.get("ui_fps");
            C774940Uaa c774940Uaa = null;
            if (obj2 instanceof Float) {
                f = (Float) obj2;
            } else {
                f = null;
            }
            c923790a9B.LJI = f;
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                LiveAugurMockPerfScore liveAugurMockPerfScore = LiveAugurMockPerfScore.INSTANCE;
                if (liveAugurMockPerfScore.getValue() > 0) {
                    c923790a9B.LIZ = liveAugurMockPerfScore.getValue();
                }
                LiveAugurMockThermalScore liveAugurMockThermalScore = LiveAugurMockThermalScore.INSTANCE;
                if (liveAugurMockThermalScore.getValue() > 0) {
                    c923790a9B.LIZLLL = liveAugurMockThermalScore.getValue();
                }
            }
            C774940Uaa c774940Uaa2 = ((GameBroadcastFragment) afS57S0110000_15.l0).LLJJIJIIJIL;
            if (c774940Uaa2 != null) {
                c774940Uaa = c774940Uaa2;
            }
            InterfaceC769940UIe interfaceC769940UIe = c774940Uaa.LLILZ;
            if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
                liveCore.LLLIZZ(c923790a9B);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
        C1C7U.LIZIZ("GameBroadcastFragment@2a83.onStreamStart$3");
    }

    public static final void accept$2(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowFriendsConnectionStatus$1");
        InterfaceC934710aQn.kb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.RR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowFriendsConnectionStatus$1");
    }

    public static final void accept$20(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiLiveSettingPresenter@3c87.updateResetPointAfterLeaveSetting$2");
        MultiLiveSettingDialogContract$AbsView multiLiveSettingDialogContract$AbsView = (MultiLiveSettingDialogContract$AbsView) ((C927570aFH) afS57S0110000_15.l0).LL;
        if (multiLiveSettingDialogContract$AbsView != null) {
            multiLiveSettingDialogContract$AbsView.RR(afS57S0110000_15.z1);
        }
        C1C7U.LIZIZ("MultiLiveSettingPresenter@3c87.updateResetPointAfterLeaveSetting$2");
    }

    public static final void accept$21(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MatchMatchingCoordinator@f28c.requestPunishFinishApi$1$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJZ(th, afS57S0110000_15.z1);
        C20441214yg.LJ("MatchMatchingCoordinator", "punish, failed");
        C0UVC.LIZIZ(th);
        Function1 function1 = (Function1) afS57S0110000_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("MatchMatchingCoordinator@f28c.requestPunishFinishApi$1$2");
    }

    public static final void accept$22(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        ImageModel avatarThumb;
        C1C7U.LIZ("GameLinkMicMaskGuestItemView@26e.loadAvatarImage$2");
        if (afS57S0110000_15.z1) {
            C1143680frq.LIZLLL(((C941300abQ) afS57S0110000_15.l0).getOnlinePlayerAvatarFromXml(), C0IPN.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_pause_coffee_icon_land.png");
        } else {
            User user = ((C941300abQ) afS57S0110000_15.l0).LLJILJIL;
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C941300abQ.LIZ(((C941300abQ) afS57S0110000_15.l0).getOnlinePlayerAvatarFromXml(), avatarThumb);
        }
        C1C7U.LIZIZ("GameLinkMicMaskGuestItemView@26e.loadAvatarImage$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$23(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        Integer num;
        MultiGuestV3GuestWidget multiGuestV3GuestWidget;
        MultiGuestV3GuestPresenter multiGuestV3GuestPresenter;
        C1C7U.LIZ("MultiGuestAsGuestModeratorsWidget@f512.showListDialog$1$1$1$1");
        Long l = (Long) obj;
        MultiGuestV3GuestWidget multiGuestV3GuestWidget2 = ((MultiGuestAsGuestModeratorsWidget) afS57S0110000_15.l0).LLILLJJLI;
        if (multiGuestV3GuestWidget2 != null && (multiGuestV3GuestPresenter = multiGuestV3GuestWidget2.LLJJIJIIJIL) != null) {
            multiGuestV3GuestPresenter.updateSelfGift2AnchorScore(l.longValue());
        }
        if (afS57S0110000_15.z1 && (num = (Integer) C924790aAn.LIZLLL().LIZIZ) != null && num.intValue() == 1 && (multiGuestV3GuestWidget = ((MultiGuestAsGuestModeratorsWidget) afS57S0110000_15.l0).LLILLJJLI) != null) {
            multiGuestV3GuestWidget.LLILZ = true;
        }
        MultiGuestV3GuestWidget multiGuestV3GuestWidget3 = ((MultiGuestAsGuestModeratorsWidget) afS57S0110000_15.l0).LLILLJJLI;
        if (multiGuestV3GuestWidget3 != null) {
            multiGuestV3GuestWidget3.i2();
        }
        C1C7U.LIZIZ("MultiGuestAsGuestModeratorsWidget@f512.showListDialog$1$1$1$1");
    }

    public static final void accept$24(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("TwoMatchMatchingCoordinator@caf2.requestPunishFinishApi$1$2");
        Throwable th = (Throwable) obj;
        C974540bT2.LIZ.LJJZ(th, afS57S0110000_15.z1);
        C20441214yg.LJ("TwoMatchMatchingCoordinator", "punish, failed");
        C0UVC.LIZIZ(th);
        Function1 function1 = (Function1) afS57S0110000_15.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("TwoMatchMatchingCoordinator@caf2.requestPunishFinishApi$1$2");
    }

    public static final void accept$3(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowFriendsConnectionStatus$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.RR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowFriendsConnectionStatus$2");
    }

    public static final void accept$4(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowMultiHostInfos$1");
        InterfaceC934710aQn.jb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.SR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowMultiHostInfos$1");
    }

    public static final void accept$5(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowMultiHostInfos$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.SR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowMultiHostInfos$2");
    }

    public static final void accept$6(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowOffliveFriendsConnectionStatus$1");
        InterfaceC934710aQn.mb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.UR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowOffliveFriendsConnectionStatus$1");
    }

    public static final void accept$7(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowOffliveFriendsConnectionStatus$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.UR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowOffliveFriendsConnectionStatus$2");
    }

    public static final void accept$8(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowSuggestedConnectionStatus$1");
        InterfaceC934710aQn.nb.LJFF(Boolean.valueOf(afS57S0110000_15.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.VR(null, !afS57S0110000_15.z1, true);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowSuggestedConnectionStatus$1");
    }

    public static final void accept$9(AfS57S0110000_15 afS57S0110000_15, Object obj) {
        C1C7U.LIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowSuggestedConnectionStatus$2");
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C970280bMA) afS57S0110000_15.l0).LL;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.VR(th, !afS57S0110000_15.z1, false);
        }
        C1C7U.LIZIZ("MultiCoHostSettingDialogPresenter@e7c6.updateAllowSuggestedConnectionStatus$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS57S0110000_15(X.C970280bMA r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                case 1: goto L5;
                case 2: goto Le;
                case 3: goto L5;
                case 4: goto Le;
                case 5: goto L5;
                case 6: goto Le;
                case 7: goto L5;
                case 8: goto Le;
                case 9: goto L5;
                case 10: goto Le;
                case 11: goto L5;
                case 12: goto Le;
                case 13: goto L5;
                case 14: goto Le;
                case 15: goto L5;
                case 16: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS57S0110000_15.<init>(X.0bMA, boolean, int):void");
    }

    public AfS57S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
