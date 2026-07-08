package Y;

import X.C0IIG;
import X.C0KFS;
import X.C1108110ewT;
import X.C1161920gLG;
import X.C1239450iMJ;
import X.C1440005kM;
import X.C465900IOu;
import X.C466430IQv;
import X.C477110InN;
import X.C721340SRg;
import X.C784440Upu;
import com.bytedance.android.feed.api.TopLiveSkylightEntranceEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndAnimWidget;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget;
import com.bytedance.android.livesdk.chatroom.widget.LockScreenWidget;
import com.bytedance.android.livesdk.chatroom.widget.WatchLiveBackBtnWidget;
import com.bytedance.android.livesdk.chatroom.widget.skylight.SkylightSwitchWidget;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.function.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePushGuideToFypExperiment;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceCollapseWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceLandscapeWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.widget.LiveNearbyReturnBackWidget;
import com.bytedance.android.livesdk.widget.LiveSlideUpGuideWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeOptWidget;
import com.bytedance.android.livesdk.widget.preload.LivePreloadUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS60S0000000_7 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            default:
                return null;
        }
    }

    public AObjectS60S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new LivePreloadUserInfoWidget();
    }

    public static final Object invoke$1(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new LiveEndCardWidget();
    }

    public static final Object invoke$10(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return new LockScreenWidget();
    }

    public static final Object invoke$11(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new CloseWidget();
    }

    public static final Object invoke$12(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return new DefinitionSelectionWidget();
    }

    public static final Object invoke$13(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return Boolean.TRUE;
    }

    public static final Object invoke$14(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new CloseWidget();
    }

    public static final Object invoke$15(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new UserPermissionCheckWidget();
    }

    public static final Object invoke$16(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new SkylightSwitchWidget();
    }

    public static final Object invoke$17(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new LiveEndAnimWidget();
    }

    public static final Object invoke$18(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new LiveSlideUpGuideWidget();
    }

    public static final Object invoke$19(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        C784440Upu.LIZ().LIZIZ(new C465900IOu(6));
        if (LivePushGuideToFypExperiment.autoSwipeToNext()) {
            C1440005kM.LIZ(new C466430IQv());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new LiveNearbyReturnBackWidget();
    }

    public static final Object invoke$20(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LiveRoomUserInfoWidget.Q;
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).pa();
        return C1108110ewT.LIZ(C0KFS.LIVE_ROOM);
    }

    public static final Object invoke$21(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new ProgrammedLiveOnlineAudienceCollapseWidget();
    }

    public static final Object invoke$22(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new ProgrammedLiveOnlineAudienceLandscapeWidget();
    }

    public static final Object invoke$23(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        DataChannelGlobal.LLILZ.FQ2(TopLiveSkylightEntranceEvent.class, new C477110InN(false, "topTab", "topTab", true));
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new C1239450iMJ();
    }

    public static final Object invoke$25(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return new C721340SRg(true);
    }

    public static final Object invoke$26(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return Boolean.valueOf(((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS());
    }

    public static final Object invoke$3(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        return Boolean.valueOf(C0IIG.LIZ);
    }

    public static final Object invoke$4(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return new WatchLiveBackBtnWidget();
    }

    public static final Object invoke$5(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new RecommendSwipeOptWidget();
    }

    public static final Object invoke$6(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId());
    }

    public static final Object invoke$7(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LivePlayFragment._pnsPageId;
        return new RecommendSwipeNewWidget();
    }

    public static final Object invoke$8(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId());
    }

    public static final Object invoke$9(AObjectS60S0000000_7 aObjectS60S0000000_7) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        return String.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId());
    }
}
