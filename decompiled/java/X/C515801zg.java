package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multihost.datamanager.MatchSettingRepository;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookCreateInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordGetResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInviteResp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceQRCodeFragment;
import com.bytedance.android.livesdk.gift.model.GiftActivityCreator;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAnchorListCacheSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.PlaybookRepublishSuccessEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidSurveyResp;
import com.ss.android.ugc.aweme.compliance.protection.timelock.api.SleepHourSettingResponse;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.g;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.battle.BattlePlaybookInfoResponse;
import webcast.api.linkmic_multi_guest.LayoutUpdateResponse;
import webcast.api.partnership.AnchorCheckPartnershipJumpResponse;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: renamed from: X.01zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515801zg implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
            case 37:
                accept$37(this, obj);
                break;
            case 38:
                accept$38(this, obj);
                break;
            case 39:
                accept$39(this, obj);
                break;
            case 40:
                accept$40(this, obj);
                break;
            case 41:
                accept$41(this, obj);
                break;
            case 42:
                accept$42(this, obj);
                break;
            case 43:
                accept$43(this, obj);
                break;
            case 44:
                accept$44(this, obj);
                break;
            case 45:
                accept$45(this, obj);
                break;
            case 46:
                accept$46(this, obj);
                break;
            case 47:
                accept$47(this, obj);
                break;
            case 48:
                accept$48(this, obj);
                break;
            case 49:
                accept$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                accept$50(this, obj);
                break;
            case 51:
                accept$51(this, obj);
                break;
            case 52:
                accept$52(this, obj);
                break;
            case 53:
                accept$53(this, obj);
                break;
            case 54:
                accept$54(this, obj);
                break;
            case 55:
                accept$55(this, obj);
                break;
            case 56:
                accept$56(this, obj);
                break;
            case 57:
                accept$57(this, obj);
                break;
            case 58:
                accept$58(this, obj);
                break;
            case 59:
                accept$59(this, obj);
                break;
            case 60:
                accept$60(this, obj);
                break;
            case 61:
                accept$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                break;
            case 63:
                accept$63(this, obj);
                break;
            case 64:
                accept$64(this, obj);
                break;
            case 65:
                accept$65(this, obj);
                break;
            case 66:
                accept$66(this, obj);
                break;
            case 67:
                accept$67(this, obj);
                break;
            case 68:
                accept$68(this, obj);
                break;
            case 69:
                accept$69(this, obj);
                break;
            case 70:
                accept$70(this, obj);
                break;
            case 71:
                accept$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                accept$72(this, obj);
                break;
            case 73:
                accept$73(this, obj);
                break;
            case 74:
                accept$74(this, obj);
                break;
            case 75:
                accept$75(this, obj);
                break;
            case 76:
                accept$76(this, obj);
                break;
        }
    }

    public C515801zg(BasePlaybookEditorViewModel basePlaybookEditorViewModel, int i) {
        this.$t = i;
        this.l0 = basePlaybookEditorViewModel;
        this.l1 = null;
    }

    public static final void accept$0(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView$2$5");
        TextView textView = (TextView) c515801zg.l0;
        GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment = (GameDualDeviceQRCodeFragment) c515801zg.l1;
        gameDualDeviceQRCodeFragment.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C786410Ut5.j4(gameDualDeviceQRCodeFragment.getString(2131842987), Arrays.copyOf(new Object[]{gameDualDeviceQRCodeFragment.getString(2131842993)}, 1)));
        stringBuffer.append(gameDualDeviceQRCodeFragment.getString(2131842991));
        textView.setText(stringBuffer.toString());
        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView$2$5");
    }

    public static final void accept$1(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView2$2$3");
        ((TextView) c515801zg.l0).setText(((GameDualDeviceQRCodeFragment) c515801zg.l1).OR());
        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView2$2$3");
    }

    public static final void accept$10(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestStartPlay$callStartPlay$2");
        ((GuestShowdownAnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestStartPlay failure");
        Function1 function1 = (Function1) c515801zg.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestStartPlay$callStartPlay$2");
    }

    public static final void accept$11(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.reviewPlaybook$2");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "review successfully");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(obj);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.reviewPlaybook$2");
    }

    public static final void accept$12(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.reviewPlaybook$3");
        Throwable th = (Throwable) obj;
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "review failure");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.reviewPlaybook$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$13(C515801zg c515801zg, Object obj) {
        List<ShowListUser> list;
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.finishGuest$1");
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) c515801zg.l0;
        ShowContent showContent = ((FinishShowingGuestResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        liveShowAnchorViewModel.AQ2(list, list2, false);
        Function0 function0 = (Function0) c515801zg.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "finish guest successful");
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.finishGuest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$14(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("LiveShowAudienceViewModel@fa2e.getShowList$1");
        C20441214yg.LIZIZ("LiveShowAudienceViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) c515801zg.l0;
            InterfaceC302801Fi interfaceC302801Fi = (InterfaceC302801Fi) c515801zg.l1;
            liveShowAudienceViewModel.AQ2(showContent.showingAndReadyList, showContent.finishedList, false);
            if (interfaceC302801Fi != null) {
                interfaceC302801Fi.LIZ(C01HA.LIZ(showContent.showingAndReadyList, showContent.finishedList, false));
            }
            liveShowAudienceViewModel.BQ2(showContent.showConfig);
        }
        C1C7U.LIZIZ("LiveShowAudienceViewModel@fa2e.getShowList$1");
    }

    public static final void accept$15(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.createRecord$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((Function1) c515801zg.l0).invoke(c470590Icr.data);
        } else {
            ((Function0) c515801zg.l1).invoke();
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.createRecord$2");
    }

    public static final void accept$16(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.endPlay$2");
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
            ((Function0) c515801zg.l0).invoke();
            C766270U4b.LIZLLL(2131854326);
        } else {
            ((Function0) c515801zg.l1).invoke();
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.endPlay$2");
    }

    public static final void accept$17(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.updateRecord$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            Function1 function1 = (Function1) c515801zg.l0;
            if (function1 != null) {
                function1.invoke(c470590Icr.data);
            }
        } else {
            Function0 function0 = (Function0) c515801zg.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.updateRecord$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(C515801zg c515801zg, Object obj) {
        List<GiftMode> list;
        C1C7U.LIZ("MatchSettingRepository@eb2c.fetchAvailableGifts$1");
        BattlePlaybookInfoResponse.ResponseData responseData = (BattlePlaybookInfoResponse.ResponseData) ((BaseResponse) obj).data;
        Integer numValueOf = null;
        if (responseData != null) {
            list = responseData.giftMode;
        } else {
            list = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fetch gift list success, size ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("MatchSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
        ((MatchSettingRepository) c515801zg.l0).LJFF = list;
        Function1 function1 = (Function1) c515801zg.l1;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        function1.invoke(list);
        C1C7U.LIZIZ("MatchSettingRepository@eb2c.fetchAvailableGifts$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(C515801zg c515801zg, Object obj) {
        Object objLJJJLL;
        C1C7U.LIZ("GiftServiceKt@f898.fetchGiftAnchorPanelActivityInfo$disposable$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        String eSVersion = null;
        if (baseResponse != null && baseResponse.data != 0) {
            ((DataChannel) c515801zg.l0).SX0(C1083140eIC.class, ((GiftListByCreatorResponse.Data) baseResponse.data).activity);
            DataChannel dataChannel = (DataChannel) c515801zg.l0;
            List<GiftActivityCreator> list = ((GiftListByCreatorResponse.Data) baseResponse.data).recommendationActivities;
            if (list != null) {
                objLJJJLL = C13LP.LJJJLL(list);
            } else {
                objLJJJLL = null;
            }
            dataChannel.SX0(C1083150eID.class, objLJJJLL);
            if (LiveGiftAnchorListCacheSetting.INSTANCE.enable()) {
                long id = ((Room) c515801zg.l1).getId();
                boolean z = !C1128450fTH.LJJIJIIJIL();
                IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                if (iGiftService != null) {
                    eSVersion = iGiftService.getESVersion();
                }
                C11S5.LIZ().LIZIZ(new RunnableC514501zT(new C096600Ya(id, z, eSVersion), (GiftListByCreatorResponse.Data) baseResponse.data, 7));
            }
        }
        C1C7U.LIZIZ("GiftServiceKt@f898.fetchGiftAnchorPanelActivityInfo$disposable$1");
    }

    public static final void accept$2(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("GameDualDeviceQRCodeFragment@4acc.initView$1$5");
        ((TextView) c515801zg.l0).setText(((GameDualDeviceQRCodeFragment) c515801zg.l1).OR());
        C20441214yg.LJ("GameDualDeviceQRCodeFragment", Log.getStackTraceString((Throwable) obj));
        C1C7U.LIZIZ("GameDualDeviceQRCodeFragment@4acc.initView$1$5");
    }

    public static final void accept$20(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("NightScreenTimeApiManager@ca0a.updateSleepHourSettings$1");
        SleepHourSettingResponse sleepHourSettingResponse = (SleepHourSettingResponse) obj;
        if (sleepHourSettingResponse.status_code != 0) {
            ((Function0) c515801zg.l0).invoke();
        } else {
            ((Function1) c515801zg.l1).invoke(Long.valueOf(sleepHourSettingResponse.nextTimeStamps));
        }
        C1C7U.LIZIZ("NightScreenTimeApiManager@ca0a.updateSleepHourSettings$1");
    }

    public static final void accept$21(C515801zg c515801zg, Object obj) {
        long jLongValue;
        Long l;
        C1C7U.LIZ("LiveCheckStateService@a608.fetchStatus$1");
        Map map = (Map) obj;
        HashMap map2 = new HashMap(((Set) c515801zg.l0).size());
        for (String str : (Set) c515801zg.l0) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null && (l = (Long) map.get(Long.valueOf(lLJIILIIL.longValue()))) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            map2.put(str, Long.valueOf(jLongValue));
        }
        C018E c018e = (C018E) c515801zg.l1;
        if (c018e != null) {
            c018e.LIZ(map2);
        }
        C1C7U.LIZIZ("LiveCheckStateService@a608.fetchStatus$1");
    }

    public static final void accept$22(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("FullWidthCarouselBottomComponent@d6b5.observeBottomWidgetVisibility$2");
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((g) c515801zg.l0), null, null, new C01ZV((InterfaceC332260D0u) c515801zg.l1, (Boolean) obj, null), 3);
        C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeBottomWidgetVisibility$2");
    }

    public static final void accept$23(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("FansClubEmotePresenter@7db8.openJoinFansClubPage$1");
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle((Context) c515801zg.l0, (Uri) c515801zg.l1);
        }
        C1C7U.LIZIZ("FansClubEmotePresenter@7db8.openJoinFansClubPage$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$24(C515801zg c515801zg, Object obj) {
        String str;
        C1C7U.LIZ("GameLivePartnershipAnchorRouter@f60a.checkWithAnchorPartnershipTasks$1");
        AnchorCheckPartnershipJumpResponse.ResponseData responseData = (AnchorCheckPartnershipJumpResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData == null || (str = responseData.jumpUrl) == null) {
            str = "";
        }
        if (str.length() != 0) {
            InterfaceC772390URp.LLZZZIL.LJFF(Boolean.TRUE);
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
            c760370TsBLIZ.LJJII((Map) c515801zg.l0);
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1((Context) c515801zg.l1, c760370TsBLIZ.LIZ().toString(), null);
        }
        C1C7U.LIZIZ("GameLivePartnershipAnchorRouter@f60a.checkWithAnchorPartnershipTasks$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$25(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountdownAudienceModel@9cd3.endOneCountdownPlay$1");
        if (((CountdownEndResponse.ResponseData) ((BaseResponse) obj).data).success) {
            C1AZW c1azw = C1AZW.LIZ;
            ((C01E2) c515801zg.l0).getClass();
            c1azw.getClass();
            C1AZW.LIZ("CountdownAudienceModel", "moderator endOneCountdownPlay", null, null);
            if (((CountdownEndParams) c515801zg.l1).endReason != 0) {
                C766270U4b.LIZLLL(2131843236);
            }
        } else {
            C1AZW c1azw2 = C1AZW.LIZ;
            ((C01E2) c515801zg.l0).getClass();
            c1azw2.getClass();
            C1AZW.LIZ("CountdownAudienceModel", "guest has been ended", null, null);
        }
        C1C7U.LIZIZ("CountdownAudienceModel@9cd3.endOneCountdownPlay$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$26(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BaseLayoutAction@e477.switchLayout$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        Function0 function0 = (Function0) c515801zg.l0;
        if (function0 != null) {
            function0.invoke();
        }
        Function1 function1 = (Function1) c515801zg.l1;
        if (function1 != null) {
            function1.invoke(((LayoutUpdateResponse.ResponseData) baseResponse.data).layout);
        }
        C1C7U.LIZIZ("BaseLayoutAction@e477.switchLayout$1");
    }

    public static final void accept$27(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BaseLayoutAction@e477.switchLayout$2");
        AbstractC920180a3M abstractC920180a3M = (AbstractC920180a3M) c515801zg.l0;
        Function1 function1 = (Function1) c515801zg.l1;
        abstractC920180a3M.getClass();
        AbstractC920180a3M.LJIIJJI((Throwable) obj, function1);
        C1C7U.LIZIZ("BaseLayoutAction@e477.switchLayout$2");
    }

    public static final void accept$28(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BaseLayoutAction@e477.switchSpot$2");
        AbstractC920180a3M abstractC920180a3M = (AbstractC920180a3M) c515801zg.l0;
        Function1 function1 = (Function1) c515801zg.l1;
        abstractC920180a3M.getClass();
        AbstractC920180a3M.LJIIJJI((Throwable) obj, function1);
        C1C7U.LIZIZ("BaseLayoutAction@e477.switchSpot$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$29(C515801zg c515801zg, Object obj) {
        long jLongValue;
        boolean z;
        C1C7U.LIZ("BaseCountdownModel@e342.getUserPlaySettings$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        CountdownConfig countdownConfig = new CountdownConfig();
        Long l = ((GetUserPlaySettingsResponse.ResponseData) baseResponse.data).settingsMap.get("countdown_duration");
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        countdownConfig.duration = jLongValue;
        Long l2 = ((GetUserPlaySettingsResponse.ResponseData) baseResponse.data).settingsMap.get("countdown_auto_expand");
        if (l2 != null && l2.longValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        countdownConfig.autoExpand = z;
        Long l3 = ((GetUserPlaySettingsResponse.ResponseData) baseResponse.data).settingsMap.get("countdown_target_score");
        if (l3 != null) {
            jLongValue2 = l3.longValue();
        }
        countdownConfig.targetScore = jLongValue2;
        ((Function1) c515801zg.l0).invoke(countdownConfig);
        String strLJJ = ((C01E7) c515801zg.l1).LJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserPlaySettings config= ");
        sbLIZ.append(countdownConfig);
        C1AZW.LJIIJ(12, strLJJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C1C7U.LIZIZ("BaseCountdownModel@e342.getUserPlaySettings$1");
    }

    public static final void accept$3(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("SearchAidSurveyApiManager@cf3.getSearchAidSurveyInfo$1");
        SearchAidSurveyResp searchAidSurveyResp = (SearchAidSurveyResp) obj;
        if (searchAidSurveyResp.status_code == 0) {
            ((Function1) c515801zg.l0).invoke(searchAidSurveyResp.getSurveyData());
        } else {
            ((Function0) c515801zg.l1).invoke();
        }
        C1C7U.LIZIZ("SearchAidSurveyApiManager@cf3.getSearchAidSurveyInfo$1");
    }

    public static final void accept$30(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.getLiveEventUser$3");
        Throwable th = (Throwable) obj;
        Function0 function0 = (Function0) c515801zg.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C501540Jlg.LIZJ((Context) c515801zg.l1, th);
        C20441214yg.LJFF("getLiveEventUser", "request get_live_event_user, failed", th);
        C1C7U.LIZIZ("MultiLiveUtil@5147.getLiveEventUser$3");
    }

    public static final void accept$31(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.inviteLiveEventUser$5");
        Throwable th = (Throwable) obj;
        Function0 function0 = (Function0) c515801zg.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C501540Jlg.LIZJ((Context) c515801zg.l1, th);
        C20441214yg.LJFF("inviteLiveEventUser", "request invite_live_event_user, failed", th);
        C1C7U.LIZIZ("MultiLiveUtil@5147.inviteLiveEventUser$5");
    }

    public static final void accept$32(C515801zg c515801zg, Object obj) {
        String strLIZ;
        User user;
        C1C7U.LIZ("MultiGuestUtil@525a.realAnchorMuteGuestOp$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realAnchorMuteGuestOp-> exception: exception = ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJIIIZ("anchorMuteGuest/anchor", C2188811AlT.LIZIZ(sbLIZ));
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 4004269) {
            Object[] objArr = new Object[1];
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) c515801zg.l0;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                strLIZ = C0KVU.LIZ(user);
            } else {
                strLIZ = null;
            }
            objArr[0] = strLIZ;
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843402, objArr));
        } else {
            C930480aJy.LJIIZILJ(C930480aJy.LIZ, (Context) c515801zg.l1, th);
        }
        C1C7U.LIZIZ("MultiGuestUtil@525a.realAnchorMuteGuestOp$2");
    }

    public static final void accept$33(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("DrawRoomListProvider@3742.uploadUnreadForHotRefresh$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Collecting unread room result (pre-loadmore), statusCode: ");
        sbLIZ.append(((BaseResponse) obj).statusCode);
        sbLIZ.append('.');
        C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) c515801zg.l1).invoke();
        C1C7U.LIZIZ("DrawRoomListProvider@3742.uploadUnreadForHotRefresh$1");
    }

    public static final void accept$34(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookModel@464b.require$2");
        C20441214yg.LIZIZ(((AbstractC20384214pU) c515801zg.l0).LJIJJ(), "[require] getActiveContent failure");
        ((Function0) c515801zg.l1).invoke();
        C1C7U.LIZIZ("BasePlaybookModel@464b.require$2");
    }

    public static final void accept$35(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.getActiveContent$1");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "getActiveContent successfully");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(obj);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.getActiveContent$1");
    }

    public static final void accept$36(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.getActiveContent$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "getActiveContent failure");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.getActiveContent$2");
    }

    public static final void accept$37(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.populate$1");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "populate successfully");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(obj);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.populate$1");
    }

    public static final void accept$38(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.removePlaybook$2");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "removePlaybook successfully");
        ((InterfaceC170900l9) c515801zg.l1).LIZ(Boolean.TRUE);
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.removePlaybook$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$39(C515801zg c515801zg, Object obj) {
        ActivePlaybook activePlaybook;
        C1C7U.LIZ("BasePlaybookModel@464b.getActiveContent$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((AbstractC20384214pU) c515801zg.l0).LJIILL = false;
            Function1 function1 = (Function1) c515801zg.l1;
            if (function1 != null) {
                PlaybookGetActiveContentResponse.ResponseData responseData = (PlaybookGetActiveContentResponse.ResponseData) c470590Icr.data;
                if (responseData != null) {
                    activePlaybook = responseData.activePlaybook;
                } else {
                    activePlaybook = null;
                }
                function1.invoke(activePlaybook);
            }
        }
        C1C7U.LIZIZ("BasePlaybookModel@464b.getActiveContent$2");
    }

    public static final void accept$4(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("PopupActionProcessHelper@132b.doSmsConsent$disposable$1");
        com.ss.android.ugc.aweme.base.api.BaseResponse baseResponse = (com.ss.android.ugc.aweme.base.api.BaseResponse) obj;
        if (baseResponse != null) {
            Function1 function1 = (Function1) c515801zg.l0;
            Activity activity = (Activity) c515801zg.l1;
            if (baseResponse.status_code == 0) {
                int i = C2187451AjH.LIZ;
                IPopupInfoService iPopupInfoService = (IPopupInfoService) PluggableExtentionKt.pluggableSpi$default(IPopupInfoService.class, false, false, false, 14, null);
                if (iPopupInfoService != null) {
                    iPopupInfoService.LJIIJJI(false);
                }
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(activity, 25));
                if (function1 != null) {
                    function1.invoke(null);
                }
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("SMS_consent", "updateSmsConsentStatus(1) fail!!!");
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(activity, 26));
                if (function1 != null) {
                    function1.invoke(String.valueOf(baseResponse.status_code));
                }
            }
        }
        C1C7U.LIZIZ("PopupActionProcessHelper@132b.doSmsConsent$disposable$1");
    }

    public static final void accept$40(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.removePlaybook$3");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "removePlaybook failure");
        ((InterfaceC170900l9) c515801zg.l1).onFailed(null);
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.removePlaybook$3");
    }

    public static final void accept$41(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.unFavorite$1");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "unFavorite successfully");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(obj);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.unFavorite$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$42(C515801zg c515801zg, Object obj) {
        PlaybookPopulateResponse.ResponseData responseData;
        Playbook playbook;
        C1C7U.LIZ("BasePlaybookModel@464b.populate$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (PlaybookPopulateResponse.ResponseData) c470590Icr.data) != null && (playbook = responseData.playbook) != null) {
            AbstractC20384214pU.LJJ((AbstractC20384214pU) c515801zg.l0, playbook, "populate", false, ((PlaybookPopulateParams) c515801zg.l1).functionNameToParamsMap, 20);
        }
        C1C7U.LIZIZ("BasePlaybookModel@464b.populate$1");
    }

    public static final void accept$43(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.unFavorite$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "unFavorite failure");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.unFavorite$2");
    }

    public static final void accept$44(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.favorite$1");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "favorite successfully");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(obj);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.favorite$1");
    }

    public static final void accept$45(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.favorite$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "favorite failure");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.favorite$2");
    }

    public static final void accept$46(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookViewModel@9898.fetchDetail$1");
        C20441214yg.LJIIIZ(((BasePlaybookViewModel) c515801zg.l0).xQ2(), "fetchDetail successfully");
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(obj);
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.fetchDetail$1");
    }

    public static final void accept$47(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("PlaylistManageRepo@fa57.getPlaylistDetail$2");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) c515801zg.l0;
        if (function1 != null) {
            function1.invoke(new Exception(th));
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) c515801zg.l1).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PlaylistManageRepo@fa57.getPlaylistDetail$2");
    }

    public static final void accept$48(C515801zg c515801zg, Object obj) {
        Context context;
        C1C7U.LIZ("VoiceManager@67c9.manageGuestAudio$2");
        Throwable th = (Throwable) obj;
        C01GD c01gd = (C01GD) c515801zg.l0;
        User user = (User) c515801zg.l1;
        c01gd.getClass();
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 4004269) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843402, C0KVU.LIZ(user)));
        } else if (th != null && (context = c01gd.LIZ) != null) {
            C501540Jlg.LIZJ(context, th);
        }
        C1C7U.LIZIZ("VoiceManager@67c9.manageGuestAudio$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$49(X.C515801zg r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C515801zg.accept$49(X.01zg, java.lang.Object):void");
    }

    public static final void accept$5(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("PopupActionProcessHelper@132b.doSmsConsent$disposable$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSmsConsentStatus(1) - error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW((Activity) c515801zg.l1, 27));
        Function1 function1 = (Function1) c515801zg.l0;
        if (function1 != null) {
            function1.invoke(th.toString());
        }
        C1C7U.LIZIZ("PopupActionProcessHelper@132b.doSmsConsent$disposable$2");
    }

    public static final void accept$50(C515801zg c515801zg, Object obj) {
        Object objValueOf;
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.initLayoutSettingFromServer$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((MultiGuestPreviewLiveSettingViewModel) c515801zg.l0).xQ2((Context) c515801zg.l1);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initLayoutSettingFromServer fail, statusCode: ");
            if (c470590Icr != null) {
                objValueOf = Integer.valueOf(c470590Icr.statusCode);
            } else {
                objValueOf = "null";
            }
            sbLIZ.append(objValueOf);
            C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
            ((MultiGuestPreviewLiveSettingViewModel) c515801zg.l0).xQ2((Context) c515801zg.l1);
        }
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.initLayoutSettingFromServer$1");
    }

    public static final void accept$51(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("MultiGuestPreviewLiveSettingViewModel@4186.initLayoutSettingFromServer$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initLayoutSettingFromServer error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MultiGuestPreviewLiveSettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
        ((MultiGuestPreviewLiveSettingViewModel) c515801zg.l0).xQ2((Context) c515801zg.l1);
        C1C7U.LIZIZ("MultiGuestPreviewLiveSettingViewModel@4186.initLayoutSettingFromServer$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$52(C515801zg c515801zg, Object obj) {
        ShowConfig showConfig;
        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.updateShowConfig$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "updateShowList successful");
        Function0 function0 = (Function0) c515801zg.l0;
        if (function0 != null) {
            function0.invoke();
        }
        MutableLiveData<ShowConfig> mutableLiveData = ((LiveShowModeratorViewModel) c515801zg.l1).LLILZ;
        ShowContent showContent = ((UpdateShowContentResponse.ResponseData) baseResponse.data).showContent;
        if (showContent != null) {
            showConfig = showContent.showConfig;
        } else {
            showConfig = null;
        }
        mutableLiveData.setValue(showConfig);
        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.updateShowConfig$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$53(C515801zg c515801zg, Object obj) {
        List<ShowListUser> list;
        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.updateShowList$1");
        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "updateShowList successful");
        LiveShowModeratorViewModel liveShowModeratorViewModel = (LiveShowModeratorViewModel) c515801zg.l0;
        ShowContent showContent = ((UpdateShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        liveShowModeratorViewModel.AQ2(list, list2, false);
        Function0 function0 = (Function0) c515801zg.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.updateShowList$1");
    }

    public static final void accept$54(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("GuardianAutographPresenter@8ef9.editGuardianAutographWithUri$3");
        C20441214yg.LJFF("GuardianAutographPresenter", "editGuardianAutograph: request failed", (Throwable) obj);
        ((Function0) c515801zg.l0).invoke();
        C143P c143p = (C143P) c515801zg.l1;
        if (c143p != null) {
            c143p.LIZ();
        }
        C1C7U.LIZIZ("GuardianAutographPresenter@8ef9.editGuardianAutographWithUri$3");
    }

    public static final void accept$55(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CaptureVideoUploadController@4a9d.uploadFile$1");
        ((Function0) c515801zg.l0).invoke();
        ((File) c515801zg.l1).delete();
        C1C7U.LIZIZ("CaptureVideoUploadController@4a9d.uploadFile$1");
    }

    public static final void accept$56(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$2");
        if (((Boolean) ((Function1) c515801zg.l0).invoke(obj)).booleanValue()) {
            ((Function0) c515801zg.l1).invoke();
        }
        C1C7U.LIZIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$57(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.getCreateInfo$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        ((BasePlaybookEditorViewModel) c515801zg.l0).LLILLL.LIZ.setValue(Boolean.valueOf(((PlaybookCreateInfoResponse.ResponseData) baseResponse.data).alertAiGenPlaybookTips));
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.LIZ(Boolean.valueOf(((PlaybookCreateInfoResponse.ResponseData) baseResponse.data).alertAiGenPlaybookTips));
        }
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.getCreateInfo$1");
    }

    public static final void accept$58(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("PlaybookEditorUtilsKt@e840.quickRePublishRequest$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C20441214yg.LJIIIZ("quickPublish", "end successfully");
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((DataChannel) c515801zg.l0).FQ2(PlaybookRepublishSuccessEvent.class);
            InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c515801zg.l1;
            if (interfaceC170900l9 != null) {
                interfaceC170900l9.LIZ(c470590Icr);
            }
        } else {
            InterfaceC170900l9 interfaceC170900l92 = (InterfaceC170900l9) c515801zg.l1;
            if (interfaceC170900l92 != null) {
                interfaceC170900l92.onFailed(new Throwable(c470590Icr.LJ.message));
            }
        }
        C1C7U.LIZIZ("PlaybookEditorUtilsKt@e840.quickRePublishRequest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$59(C515801zg c515801zg, Object obj) {
        List<GiftMode> list;
        C1C7U.LIZ("DesignatedGiftRepository@4e7c.fetchAvailableGifts$1");
        BattlePlaybookInfoResponse.ResponseData responseData = (BattlePlaybookInfoResponse.ResponseData) ((BaseResponse) obj).data;
        Integer numValueOf = null;
        if (responseData != null) {
            list = responseData.giftMode;
        } else {
            list = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fetch gift list success, size ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("DesignatedGiftRepository", C2188811AlT.LIZIZ(sbLIZ));
        ((C156800is) c515801zg.l0).LIZ = list;
        Function1 function1 = (Function1) c515801zg.l1;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        function1.invoke(list);
        C1C7U.LIZIZ("DesignatedGiftRepository@4e7c.fetchAvailableGifts$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(C515801zg c515801zg, Object obj) {
        Boolean boolValueOf;
        boolean z;
        C1C7U.LIZ("GuestInviteViewModel@bc2f.guestInvite$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("guestInvite, rsp = user inRoom = ");
            GuestInviteResp.ResponseData responseData = (GuestInviteResp.ResponseData) c470590Icr.data;
            if (responseData != null) {
                boolValueOf = Boolean.valueOf(responseData.inRoom);
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            C20441214yg.LIZIZ("GuestInviteViewModel", C2188811AlT.LIZIZ(sbLIZ));
            Function1 function1 = (Function1) c515801zg.l0;
            GuestInviteResp.ResponseData responseData2 = (GuestInviteResp.ResponseData) c470590Icr.data;
            if (responseData2 != null) {
                z = responseData2.inRoom;
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        } else {
            Function0 function0 = (Function0) c515801zg.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
        C1C7U.LIZIZ("GuestInviteViewModel@bc2f.guestInvite$1");
    }

    public static final void accept$60(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("LsPrePageShowToastMethodIDL@67bd.handle$1");
        C786410Ut5.LJJZZIII((Handler) c515801zg.l0, new RunnableC514801zW((Function0) c515801zg.l1, (Function0<Unit>) 155));
        C1C7U.LIZIZ("LsPrePageShowToastMethodIDL@67bd.handle$1");
    }

    public static final void accept$61(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("MultiGuestGiftContributeRankPresenter@6828.getRankUserListData$2");
        ((InterfaceC058300Jh) c515801zg.l0).Ps();
        ((C01EH) c515801zg.l1).getClass();
        C1AZW.LJFF(C01EH.LIZIZ(85), "getFanTicketRankList exception,", ((Throwable) obj).getMessage(), null);
        C1C7U.LIZIZ("MultiGuestGiftContributeRankPresenter@6828.getRankUserListData$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$62(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("BaseTextHeaderViewModel@d64a.getRecord$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((Function1) c515801zg.l0).invoke(((TextHeaderRecordGetResponse.ResponseData) c470590Icr.data).textHeaderRecordInfo);
        } else {
            Function1 function1 = (Function1) c515801zg.l1;
            if (function1 != null) {
                function1.invoke(new Throwable("code isn't zero"));
            }
        }
        C1C7U.LIZIZ("BaseTextHeaderViewModel@d64a.getRecord$2");
    }

    public static final void accept$63(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("UserLevelViewModel@cee4.updateUserLevelAttr$dispose$1");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((BaseResponse) obj).statusCode == 0) {
            ((Function1) c515801zg.l0).invoke(Long.valueOf(jCurrentTimeMillis));
        } else {
            ((Function1) c515801zg.l1).invoke(Long.valueOf(jCurrentTimeMillis));
        }
        C1C7U.LIZIZ("UserLevelViewModel@cee4.updateUserLevelAttr$dispose$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$64(X.C515801zg r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C515801zg.accept$64(X.01zg, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$65(X.C515801zg r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C515801zg.accept$65(X.01zg, java.lang.Object):void");
    }

    public static final void accept$66(C515801zg c515801zg, Object obj) {
        String strLIZ;
        User user;
        C1C7U.LIZ("MultiGuestModeratorMuteGuestManager@34bb.realModeratorMuteGuestOp$2");
        Throwable th = (Throwable) obj;
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realModeratorMuteGuestOp-> exception: exception = ");
        sbLIZ.append(th.getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LJI("MultiGuestModeratorMuteGuestManager", strLIZIZ);
        if ((th instanceof C501470JlZ) && ((C501520Jle) th).getErrorCode() == 4004269) {
            Object[] objArr = new Object[1];
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) c515801zg.l0;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                strLIZ = C0KVU.LIZ(user);
            } else {
                strLIZ = null;
            }
            objArr[0] = strLIZ;
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843402, objArr));
        } else {
            C930480aJy.LJIIZILJ(C930480aJy.LIZ, (Context) c515801zg.l1, th);
        }
        C1C7U.LIZIZ("MultiGuestModeratorMuteGuestManager@34bb.realModeratorMuteGuestOp$2");
    }

    public static final void accept$67(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.trigger$disposable$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trigger onNext=");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("NoticeboardUtils", C2188811AlT.LIZIZ(sbLIZ));
        Function0 function0 = (Function0) c515801zg.l0;
        Function2 function2 = (Function2) c515801zg.l1;
        Long l = (Long) function0.invoke();
        if (l != null) {
            long jLongValue = l.longValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getContent currentNoticeboardId=");
            sbLIZ2.append(jLongValue);
            C20441214yg.LIZIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ2));
            C480460Ism.LIZ().getClass();
            INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
            NoticeboardGetContentParams noticeboardGetContentParams = new NoticeboardGetContentParams();
            noticeboardGetContentParams.roomId = C954140aw8.LIZJ();
            noticeboardGetContentParams.channelId = C954140aw8.LIZIZ();
            noticeboardGetContentParams.noticeboardId = jLongValue;
            new C11QI(iNoticeboardApi.getNoticeboardContent(noticeboardGetContentParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(function2, 307)).LJIIL(new C09JN() { // from class: X.00Qq
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("NoticeboardUtils@5337.getContent$3");
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getContent, ");
                    sbLIZ3.append(obj2);
                    C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ3));
                    C1C7U.LIZIZ("NoticeboardUtils@5337.getContent$3");
                }
            })).LJIILL().LJIIZILJ();
        }
        C1C7U.LIZIZ("NoticeboardUtils@5337.trigger$disposable$1");
    }

    public static final void accept$68(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorCurrentPageDismissMs$1");
        WeakReference weakReference = (WeakReference) c515801zg.l1;
        C5182020e c5182020e = new C5182020e((C259800zU) c515801zg.l0, (C259800zU<JSONObject>) 599);
        if (Intrinsics.LJFF(weakReference.get(), obj)) {
            c5182020e.invoke();
        }
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorCurrentPageDismissMs$1");
    }

    public static final void accept$69(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorNextPageStayMs$2");
        C438101n9.LIZIZ((C259800zU) c515801zg.l1, (AbstractC1387200mCc) obj, new C5182020e((C259800zU) c515801zg.l0, (C259800zU<JSONObject>) 600));
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorNextPageStayMs$2");
    }

    public static final void accept$7(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.startCountDownForAll$1");
        ((CountDownForAllV2AnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "startCountDownForAll successfully");
        ((Function2) c515801zg.l1).invoke(Boolean.TRUE, 0);
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.startCountDownForAll$1");
    }

    public static final void accept$70(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorModel@1340.updateUserPlaySettings$2");
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
            ((C01IU) c515801zg.l0).LJIILL((CountdownForAllConfig) c515801zg.l1);
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorModel@1340.updateUserPlaySettings$2");
    }

    public static final void accept$71(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.updateCountDownForAll$1");
        ((CountDownForAllV2AnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "updateCountDownForAll successfully");
        C766270U4b.LIZLLL(2131851943);
        Function2 function2 = (Function2) c515801zg.l1;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, 0);
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.updateCountDownForAll$1");
    }

    public static final void accept$72(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.updateCountDownForAll$2");
        Throwable th = (Throwable) obj;
        ((CountDownForAllV2AnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJ("CountDownForAllV2AnchorViewModel", "updateCountDownForAll failure");
        Function2 function2 = (Function2) c515801zg.l1;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, Integer.valueOf(PlaybookUtilKt.LJIIL(th)));
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.updateCountDownForAll$2");
    }

    public static final void accept$73(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.updateUserPlaySettings$1");
        ((CountDownForAllV2AnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "updateUserPlaySettings successfully");
        ((Function2) c515801zg.l1).invoke(Boolean.TRUE, 0);
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.updateUserPlaySettings$1");
    }

    public static final void accept$74(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.updateUserPlaySettings$2");
        ((CountDownForAllV2AnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIL("CountDownForAllV2AnchorViewModel", "updateUserPlaySettings failure");
        ((Function2) c515801zg.l1).invoke(Boolean.FALSE, Integer.valueOf(PlaybookUtilKt.LJIIL((Throwable) obj)));
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.updateUserPlaySettings$2");
    }

    public static final void accept$75(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$2");
        if (((AtomicBoolean) c515801zg.l0).compareAndSet(false, true)) {
            ((Function1) c515801zg.l1).invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("AdAutofillPipoManager@24f6.fetchResolvedPipoPrerequisites$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$76(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("LandscapeOpenPageUtil@a5c.openPrivilegePage$1");
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (iActionHandlerService != null) {
            iActionHandlerService.handle((Context) c515801zg.l0, (String) ((C259800zU) c515801zg.l1).element);
        }
        C1C7U.LIZIZ("LandscapeOpenPageUtil@a5c.openPrivilegePage$1");
    }

    public static final void accept$8(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.startCountDownForAll$2");
        ((CountDownForAllV2AnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "startCountDownForAll failure");
        ((Function2) c515801zg.l1).invoke(Boolean.FALSE, Integer.valueOf(PlaybookUtilKt.LJIIL((Throwable) obj)));
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.startCountDownForAll$2");
    }

    public static final void accept$9(C515801zg c515801zg, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestStartPlay$callStartPlay$1");
        ((GuestShowdownAnchorViewModel) c515801zg.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestStartPlay successfully");
        Function1 function1 = (Function1) c515801zg.l1;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestStartPlay$callStartPlay$1");
    }

    public C515801zg(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
