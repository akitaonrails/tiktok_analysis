package Y;

import X.C09JN;
import X.C0IF8;
import X.C0IIR;
import X.C0IKG;
import X.C0IKQ;
import X.C0IL2;
import X.C0ITM;
import X.C0IXW;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C464680IKc;
import X.C464950ILd;
import X.C467800IWc;
import X.C470760Id8;
import X.C471340Ie4;
import X.C501520Jle;
import X.C784440Upu;
import android.util.Log;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.Event;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class AfS132S0000000_7 implements C09JN {
    public final int $t;

    public static final void accept$26(AfS132S0000000_7 afS132S0000000_7, Object obj) {
    }

    public static final void accept$44(AfS132S0000000_7 afS132S0000000_7, Object obj) {
    }

    public static final void accept$45(AfS132S0000000_7 afS132S0000000_7, Object obj) {
    }

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
        }
    }

    public AfS132S0000000_7(int i) {
        this.$t = i;
    }

    public AfS132S0000000_7(long j, int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("SkylightController@4636.initTopLivesSkylight$4L");
        C20441214yg.LJFF(SkylightController.LLJJI, "followStateChanged error", (Throwable) obj);
        C1C7U.LIZIZ("SkylightController@4636.initTopLivesSkylight$4L");
    }

    public static final void accept$1(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("UserPermissionCheckWidget@d53a.checkPermission$1L");
        if (LiveEnterRoomClickPerfOptSetting.optAabCheckOnEnterRoom()) {
            C464950ILd.LJI.LIZIZ();
        }
        C1C7U.LIZIZ("UserPermissionCheckWidget@d53a.checkPermission$1L");
    }

    public static final void accept$10(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        Room room;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) obj;
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.onActivityCreated$1L");
        if (C0IXW.LJFF(absAudienceInteractionFragment.LLJIJIL) && (room = absAudienceInteractionFragment.LLJILJIL) != null && room.author() != null) {
            HashMap map = new HashMap();
            map.put("anchor_id", String.valueOf(absAudienceInteractionFragment.LLJILJIL.author().getId()));
            map.put("room_id", String.valueOf(absAudienceInteractionFragment.LLJILJIL.getId()));
            map.put("duration", String.valueOf(absAudienceInteractionFragment.LLLFZ.LJFF()));
            C0IXW c0ixw = C0IXW.LIZ;
            C0IXW.LIZ("live_ad", "live_watch_onemin", null, map);
        }
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.onActivityCreated$1L");
    }

    public static final void accept$11(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        C1C7U.LIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$2L");
        C20441214yg.LIZLLL(Log.getStackTraceString((Throwable) obj));
        C1C7U.LIZIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$2L");
    }

    public static final void accept$12(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        String str = LivePlayFragment._pnsPageId;
        C1C7U.LIZ("LivePlayFragment@afba.fetchColdStartCoverNetworkBitmap$2L");
        C1C7U.LIZIZ("LivePlayFragment@afba.fetchColdStartCoverNetworkBitmap$2L");
    }

    public static final void accept$13(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedUrlService@38bc.requestTabInNetWorkState$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("there is error");
        sbLIZ.append(((Throwable) obj).toString());
        C20441214yg.LJIIIZ("LiveIconGeneratorLog", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("FeedUrlService@38bc.requestTabInNetWorkState$2L");
    }

    public static final void accept$14(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedUrlService@38bc.delayInit$1L");
        C1C7U.LIZIZ("FeedUrlService@38bc.delayInit$1L");
    }

    public static final void accept$15(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedUrlService@38bc.requestTabListForyouPage$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("there is error");
        sbLIZ.append(((Throwable) obj).toString());
        C20441214yg.LJIIIZ("LiveIconGeneratorLog", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("FeedUrlService@38bc.requestTabListForyouPage$2L");
    }

    public static final void accept$16(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedTabRepository@2822.initLocalForyouTab$1L");
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).notifyShowLiveIconEntrance(((Boolean) obj).booleanValue());
        C1C7U.LIZIZ("FeedTabRepository@2822.initLocalForyouTab$1L");
    }

    public static final /* bridge */ /* synthetic */ void accept$17(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("RoomStatusControllerV2@20d0.reportDeleteRoom$1");
        C1C7U.LIZIZ("RoomStatusControllerV2@20d0.reportDeleteRoom$1");
    }

    public static final void accept$18(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        RoomStatusController.lambda$refreshRoomRecommendStats$11((Throwable) obj);
    }

    public static final void accept$19(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        RoomStatusController.lambda$refreshRoomStats$7((Throwable) obj);
    }

    public static final void accept$2(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C0IF8 c0if8;
        C464680IKc c464680IKc = (C464680IKc) obj;
        int i = LiveRoomNotifyWidget.LLJZIJLIL;
        C1C7U.LIZ("LiveRoomNotifyWidget@7138.registerJumpEvent$1L");
        if (c464680IKc != null && (c0if8 = c464680IKc.LIZ) != null) {
            C0IL2.LIZ.LIZ().LIZIZ(new Event("live_room_notify_widget", 1280, C0IIR.MessageReceived));
            c0if8.LJ.mRoomsData.enterLiveSource = "live_detail";
            C784440Upu.LIZ().LIZIZ(new C0IF8(c0if8.LJ, c0if8.LIZJ));
        }
        C1C7U.LIZIZ("LiveRoomNotifyWidget@7138.registerJumpEvent$1L");
    }

    public static final void accept$20(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        RoomStatusController.lambda$checkRoom$13((Throwable) obj);
    }

    public static final void accept$21(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        RoomStatusController.lambda$refreshAllRoomStatus$3((Throwable) obj);
    }

    public static final /* bridge */ /* synthetic */ void accept$22(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LivePlayFullLinkManager@5935.onPerformanceCollectStart$1$2");
        C1C7U.LIZIZ("LivePlayFullLinkManager@5935.onPerformanceCollectStart$1$2");
    }

    public static final void accept$23(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("DrawerSmallLiveViewHolder@3368.bind$2L");
        C1C7U.LIZIZ("DrawerSmallLiveViewHolder@3368.bind$2L");
    }

    public static final void accept$24(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("RoomManager@6c79.preEnterRoom$2L");
        C1C7U.LIZIZ("RoomManager@6c79.preEnterRoom$2L");
    }

    public static final void accept$25(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("MultiRoomIdListProvider@e61e.<init>$2L");
        C20441214yg.LJI("MultiRoomIdListProvider", (Throwable) obj);
        C1C7U.LIZIZ("MultiRoomIdListProvider@e61e.<init>$2L");
    }

    public static final void accept$27(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("BaseFeedAdapter@cd27.<init>$2L");
        C1C7U.LIZIZ("BaseFeedAdapter@cd27.<init>$2L");
    }

    public static final void accept$28(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedOwnerAdapter@fa07.init$2L");
        C1C7U.LIZIZ("FeedOwnerAdapter@fa07.init$2L");
    }

    public static final void accept$29(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedOwnerAdapter@fa07.init$4L");
        C1C7U.LIZIZ("FeedOwnerAdapter@fa07.init$4L");
    }

    public static final void accept$3(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveStateManager@a4a7.refreshSingleUser$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResult:");
        sbLIZ.append(Log.getStackTraceString((Throwable) obj));
        C2344809Gs.LJFF("LiveStateManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveStateManager@a4a7.refreshSingleUser$2L");
    }

    public static final void accept$30(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("RxCacheDataSource@388c.<init>$4L");
        C1C7U.LIZIZ("RxCacheDataSource@388c.<init>$4L");
    }

    public static final void accept$31(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        String str = LiveRoomUserInfoWidget.Q;
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.onLoginEvent$2L");
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.onLoginEvent$2L");
    }

    public static final void accept$32(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        Object obj2;
        Pair pair = (Pair) obj;
        C1C7U.LIZ("FeedRepository@ae97.<init>$1L");
        if (pair != null && (obj2 = pair.second) != null) {
            C470760Id8 c470760Id8 = (C470760Id8) obj2;
            if (c470760Id8.LIZ == 1) {
                ((AbstractCollection) C467800IWc.LJIJ.LJIIZILJ.getValue()).addAll(c470760Id8.LIZIZ);
            }
        }
        C1C7U.LIZIZ("FeedRepository@ae97.<init>$1L");
    }

    public static final void accept$33(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedRepository@ae97.feeds$1L");
        C467800IWc.LJIJ.LIZIZ = (FeedExtra) obj;
        C1C7U.LIZIZ("FeedRepository@ae97.feeds$1L");
    }

    public static final void accept$34(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        Object obj2;
        Pair pair = (Pair) obj;
        C1C7U.LIZ("FeedRepository@ae97.<init>$2L");
        if (pair != null && (obj2 = pair.second) != null) {
            C470760Id8 c470760Id8 = (C470760Id8) obj2;
            if (c470760Id8.LIZ == 1) {
                ((AbstractCollection) C467800IWc.LJIJ.LJIIZILJ.getValue()).addAll(c470760Id8.LIZIZ);
            }
        }
        C1C7U.LIZIZ("FeedRepository@ae97.<init>$2L");
    }

    public static final void accept$35(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("FeedRepository$DefaultPagingLoadCallback@834b.<init>$2L");
        C1C7U.LIZIZ("FeedRepository$DefaultPagingLoadCallback@834b.<init>$2L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$36(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        Pair pair = (Pair) ((C0ITM) obj).LIZ;
        if (pair != null && !C0IKQ.LIZ((List) pair.first)) {
            for (FeedItem feedItem : (List) pair.first) {
                if (((FeedExtra) pair.second).getLogPb() != null) {
                    feedItem.logPb = ((FeedExtra) pair.second).getLogPb().toString();
                }
            }
        }
    }

    public static final /* bridge */ /* synthetic */ void accept$37(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("ToolbarShareBehavior@28ff.showRepostButtonAnimation$2");
        C1C7U.LIZIZ("ToolbarShareBehavior@28ff.showRepostButtonAnimation$2");
    }

    public static final void accept$38(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveDrawerHelper@85f9.initDrawer$1L");
        C0IKG.LIZIZ = new ArrayList(((BaseListResponse) obj).data);
        C1C7U.LIZIZ("LiveDrawerHelper@85f9.initDrawer$1L");
    }

    public static final void accept$39(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveDrawerHelper@85f9.initDrawer$2L");
        C0IKG.LIZIZ = new ArrayList();
        C1C7U.LIZIZ("LiveDrawerHelper@85f9.initDrawer$2L");
    }

    public static final void accept$4(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveStateManager@a4a7.refreshUserList$2L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResult:");
        sbLIZ.append(Log.getStackTraceString((Throwable) obj));
        C2344809Gs.LJFF("LiveStateManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveStateManager@a4a7.refreshUserList$2L");
    }

    public static final void accept$40(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveDrawerHelper@85f9.tryUpdateDrawerTabs$1L");
        C0IKG.LIZIZ = new ArrayList(((BaseListResponse) obj).data);
        C1C7U.LIZIZ("LiveDrawerHelper@85f9.tryUpdateDrawerTabs$1L");
    }

    public static final void accept$41(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveDrawerHelper@85f9.tryUpdateDrawerTabs$2L");
        C1C7U.LIZIZ("LiveDrawerHelper@85f9.tryUpdateDrawerTabs$2L");
    }

    public static final void accept$42(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveNewAudienceEndMonitor@da9f.logLiveShow$2L");
        C1C7U.LIZIZ("LiveNewAudienceEndMonitor@da9f.logLiveShow$2L");
    }

    public static final /* bridge */ /* synthetic */ void accept$43(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LiveNewAudienceEndFragmentV2@97bd.registerUserFollowStatus$4");
        C1C7U.LIZIZ("LiveNewAudienceEndFragmentV2@97bd.registerUserFollowStatus$4");
    }

    public static final void accept$46(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("DrawerFeedLiveAdapterProviderV2$DrawerFollowingViewHolder@3b55.registerScrollEvent$1L");
        if (C471340Ie4.LJJIIJ) {
            C471340Ie4.LIZ();
            C471340Ie4.LIZIZ();
        }
        C1C7U.LIZIZ("DrawerFeedLiveAdapterProviderV2$DrawerFollowingViewHolder@3b55.registerScrollEvent$1L");
    }

    public static final void accept$47(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("DrawerFeedLiveAdapterProviderV2$DrawerFollowingViewHolder@3b55.registerScrollEvent$2L");
        C1C7U.LIZIZ("DrawerFeedLiveAdapterProviderV2$DrawerFollowingViewHolder@3b55.registerScrollEvent$2L");
    }

    public static final /* bridge */ /* synthetic */ void accept$48(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("TTLiveSDK@e12b.updateLiveSettings$1");
        C1C7U.LIZIZ("TTLiveSDK@e12b.updateLiveSettings$1");
    }

    public static final void accept$49(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        Throwable th = (Throwable) obj;
        C1C7U.LIZ("WalletCenter@6213.syncExchangeInfo$2L");
        if (th instanceof C501520Jle) {
            ((C501520Jle) th).getErrorCode();
        }
        C1C7U.LIZIZ("WalletCenter@6213.syncExchangeInfo$2L");
    }

    public static final void accept$5(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$2L");
        C1C7U.LIZIZ("SlideUpGuideManager@27ba.startPlayCustomizedSlideGuide$2L");
    }

    public static final void accept$50(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("TabFeedViewModel@444c.realStart$6L");
        C1C7U.LIZIZ("TabFeedViewModel@444c.realStart$6L");
    }

    public static final void accept$51(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("VideoGiftEligibilityActivity@1c90.fetchEligibilityInfo$disposable$2");
        ((Throwable) obj).getMessage();
        C1C7U.LIZIZ("VideoGiftEligibilityActivity@1c90.fetchEligibilityInfo$disposable$2");
    }

    public static final void accept$6(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("SlideUpGuideManager@27ba.updateCustomizedFrequencyControl$1L");
        C1C7U.LIZIZ("SlideUpGuideManager@27ba.updateCustomizedFrequencyControl$1L");
    }

    public static final void accept$7(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("SlideUpGuideManager@27ba.updateCustomizedFrequencyControl$2L");
        C1C7U.LIZIZ("SlideUpGuideManager@27ba.updateCustomizedFrequencyControl$2L");
    }

    public static final /* bridge */ /* synthetic */ void accept$8(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        C1C7U.LIZ("LivePlayFragment@afba.registerRxBus$2");
        C1C7U.LIZIZ("LivePlayFragment@afba.registerRxBus$2");
    }

    public static final void accept$9(AfS132S0000000_7 afS132S0000000_7, Object obj) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        C1C7U.LIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$1L$2L");
        C20441214yg.LIZLLL(Log.getStackTraceString((Throwable) obj));
        C1C7U.LIZIZ("LandscapeAudienceInteractionFragment@c63d.loadPollEffectWidget$1L$2L");
    }

    public AfS132S0000000_7(VideoGiftEligibilityActivity videoGiftEligibilityActivity, int i) {
        this.$t = i;
    }
}
