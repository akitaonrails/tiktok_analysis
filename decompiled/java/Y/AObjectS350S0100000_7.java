package Y;

import X.AbstractC476820Imu;
import X.C036E;
import X.C05P0;
import X.C09AJ;
import X.C0IEB;
import X.C0IEC;
import X.C0IEG;
import X.C0IET;
import X.C0IEU;
import X.C0IEW;
import X.C0IFE;
import X.C0IFO;
import X.C0IFP;
import X.C0IFQ;
import X.C0IFS;
import X.C0IFX;
import X.C0IG9;
import X.C0IGD;
import X.C0IGV;
import X.C0II0;
import X.C0II1;
import X.C0II2;
import X.C0II9;
import X.C0IIJ;
import X.C0IIM;
import X.C0IIR;
import X.C0IIS;
import X.C0IJ7;
import X.C0IJB;
import X.C0IJT;
import X.C0IJV;
import X.C0IK0;
import X.C0IKG;
import X.C0IKS;
import X.C0IKY;
import X.C0IKZ;
import X.C0IL2;
import X.C0IMF;
import X.C0IMR;
import X.C0IOL;
import X.C0ISJ;
import X.C0IX5;
import X.C0KBR;
import X.C0KVO;
import X.C0KVU;
import X.C0KX8;
import X.C0KXI;
import X.C0UFE;
import X.C1082850eHj;
import X.C1102070emj;
import X.C1106110etF;
import X.C1106200etO;
import X.C1106210etP;
import X.C1113800f5e;
import X.C1124870fNV;
import X.C1126540fQC;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C12ES;
import X.C1338270kvh;
import X.C13LP;
import X.C1701940uOG;
import X.C1766560w4U;
import X.C19EG;
import X.C19MB;
import X.C19ME;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2095008Iq;
import X.C21546719Ub;
import X.C21601619gM;
import X.C2177431AJp;
import X.C2188811AlT;
import X.C463250IEp;
import X.C463290IEt;
import X.C463420IFg;
import X.C463690IGh;
import X.C463710IGj;
import X.C464030IHp;
import X.C464130IHz;
import X.C464170IId;
import X.C464660IKa;
import X.C464800IKo;
import X.C465230IMf;
import X.C465900IOu;
import X.C466360IQo;
import X.C466500IRc;
import X.C467340IUi;
import X.C467650IVn;
import X.C467680IVq;
import X.C467800IWc;
import X.C469840Ibe;
import X.C472280Ifa;
import X.C472910Igb;
import X.C472950Igf;
import X.C473140Igy;
import X.C473190Ih3;
import X.C473410IhP;
import X.C474500IjA;
import X.C475530Ikp;
import X.C475540Ikq;
import X.C475550Ikr;
import X.C476830Imv;
import X.C477110InN;
import X.C477130InP;
import X.C477140InQ;
import X.C479680IrW;
import X.C479740Irc;
import X.C480130IsF;
import X.C480460Ism;
import X.C481220Iu0;
import X.C486790J7d;
import X.C494680Jac;
import X.C497410Jf1;
import X.C497420Jf2;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517110KPt;
import X.C519370KYl;
import X.C520010KaN;
import X.C520220Kai;
import X.C521990KdZ;
import X.C749240TaE;
import X.C760110Trl;
import X.C766270U4b;
import X.C781520UlC;
import X.C784440Upu;
import X.C786410Ut5;
import X.C924400aAA;
import X.C930810aKV;
import X.C931800aM6;
import X.C956380azk;
import X.EnumC1102750enp;
import X.EnumC1105670esX;
import X.EnumC464630IJx;
import X.EnumC471750Iej;
import X.EnumC473170Ih1;
import X.EnumC475520Iko;
import X.EnumC476910In3;
import X.EnumC476920In4;
import X.EnumC918990a1R;
import X.InterfaceC1085480eLy;
import X.InterfaceC1102120emo;
import X.InterfaceC1103130eoR;
import X.InterfaceC1372610lp5;
import X.InterfaceC463170IEh;
import X.InterfaceC466370IQp;
import X.InterfaceC481170Itv;
import X.InterfaceC481210Itz;
import X.InterfaceC500100JjM;
import X.InterfaceC772190UQv;
import Y.AfS176S0100000_7;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.TopLiveClearModelChannel;
import com.bytedance.android.live.CommentForceIconStyle;
import com.bytedance.android.live.LiveToStoryClickPublishEvent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.PanelStateEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceMultiGuestShareBgChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoViewRealSizeChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.IsVideoViewChangeForHostChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ScreenClearEvent;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WidgetAllLoadedEvent;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedTopliveTabEntranceSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveNearbyTabSetting;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameLiveEnterRoomDrawLoadOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNotUseOldArchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostRoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeAudienceResize;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizePlayerSize;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.SmoothClearScreenSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventPreviewRefreshSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightRefreshWhenBackFromLiveSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.share.LiveShareWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widget.GameLiveBillboardWidget;
import com.bytedance.android.livesdk.widget.LivePlayPauseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PartnershipInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredElementConfigSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AObjectS350S0100000_7 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            case 87:
                return invoke$87(this, obj);
            case 88:
                return invoke$88(this, obj);
            case 89:
                return invoke$89(this, obj);
            case 90:
                return invoke$90(this, obj);
            case 91:
                return invoke$91(this, obj);
            case 92:
                return invoke$92(this, obj);
            case 93:
                return invoke$93(this, obj);
            case 94:
                return invoke$94(this, obj);
            case 95:
                return invoke$95(this, obj);
            case 96:
                return invoke$96(this, obj);
            case 97:
                return invoke$97(this, obj);
            case 98:
                return invoke$98(this, obj);
            case 99:
                return invoke$99(this, obj);
            case 100:
                return invoke$100(this, obj);
            case 101:
                return invoke$101(this, obj);
            case 102:
                return invoke$102(this, obj);
            case 103:
                return invoke$103(this, obj);
            case 104:
                return invoke$104(this, obj);
            case 105:
                return invoke$105(this, obj);
            case 106:
                return invoke$106(this, obj);
            default:
                return null;
        }
    }

    public AObjectS350S0100000_7(LivePlayFragment livePlayFragment, int i) {
        this.$t = i;
        switch (i) {
            case 2:
            case 3:
                this.l0 = livePlayFragment;
                break;
            default:
                this.l0 = livePlayFragment;
                break;
        }
    }

    public static final Object invoke$0(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        SkylightController skylightController = (SkylightController) aObjectS350S0100000_7.l0;
        if (skylightController.LLILZ) {
            return Unit.LIZ;
        }
        skylightController.LLILZ = true;
        skylightController.LJ(EnumC471750Iej.DELAY_REQUEST);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static final Object invoke$1(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        ((SkylightController) aObjectS350S0100000_7.l0).LLJIJIL.invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        if (livePlayFragment.P == null) {
            livePlayFragment.P = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).e32().LIZIZ(livePlayFragment.y);
            livePlayFragment.getLifecycle().addObserver(livePlayFragment.P);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$100(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        ObjectAnimator objectAnimatorOfFloat;
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS350S0100000_7.l0;
        C519370KYl c519370KYl = (C519370KYl) obj;
        publicScreenWidget.getClass();
        float f = 0.0f;
        if (c519370KYl.LIZIZ) {
            if (LiveConflictAvoidInputAnimOpt.INSTANCE.enable()) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = publicScreenWidget.LLJI.animate();
                viewPropertyAnimatorAnimate.cancel();
                if (c519370KYl.LIZ) {
                    viewPropertyAnimatorAnimate.alpha(0.0f);
                } else {
                    viewPropertyAnimatorAnimate.alpha(1.0f);
                }
                viewPropertyAnimatorAnimate.setDuration(LayeredElementConfigSetting.getValue().getAnimationDuration());
                viewPropertyAnimatorAnimate.start();
            } else {
                boolean z = c519370KYl.LIZ;
                FrameLayout frameLayout = publicScreenWidget.LLJI;
                if (z) {
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.ALPHA, 1.0f, 0.0f);
                } else {
                    objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                }
                objectAnimatorOfFloat.setDuration(LayeredElementConfigSetting.getValue().getAnimationDuration());
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
        } else {
            FrameLayout frameLayout2 = publicScreenWidget.LLJI;
            if (!c519370KYl.LIZ) {
                f = 1.0f;
            }
            C786410Ut5.U4(frameLayout2, f);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$101(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C480130IsF c480130IsF;
        C479740Irc c479740Irc = (C479740Irc) aObjectS350S0100000_7.l0;
        C0IEG c0ieg = c479740Irc.LJFF;
        if (c0ieg != null && c479740Irc.LJIIJ != null && c479740Irc.LJIIL != null && c0ieg.getCurrentPosition() != 0 && c479740Irc.LJIIJ.getSelectedTabPosition() == 0 && (c480130IsF = c479740Irc.LJIIIZ) != null && !c480130IsF.LLJILLL) {
            C786410Ut5.i0(c479740Irc.LJIIL, 8);
            C20441214yg.LIZIZ(C479740Irc.LJJJLIIL, "LiveRoomPageChangeEvent mTopTabContainer gone");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$102(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C21546719Ub c21546719Ub;
        C480130IsF c480130IsF;
        C479740Irc c479740Irc = (C479740Irc) aObjectS350S0100000_7.l0;
        Boolean bool = (Boolean) obj;
        c479740Irc.getClass();
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        if (bool.booleanValue() && c479740Irc.LJIIL != null && (LiveInfeedTopliveTabEntranceSetting.matchEntrance(enterRoomConfig) || LiveInfeedSkylightEntranceSetting.isNearbyPage(enterRoomConfig) || LiveInfeedSkylightEntranceSetting.isHangoutRoomPage(enterRoomConfig))) {
            C786410Ut5.i0(c479740Irc.LJIIL, 0);
            if (HangoutRoomFeedEnableSetting.INSTANCE.isEnable() && c479740Irc.LJIILJJIL()) {
                TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(c479740Irc.LIZ.U6());
                tuxImmersionBarLJ.LJIIIZ(c479740Irc.LJJI());
                tuxImmersionBarLJ.LIZLLL();
            }
        } else if (!bool.booleanValue() && c479740Irc.LJIIL != null && (c21546719Ub = c479740Irc.LJIIJ) != null && ((c21546719Ub.getSelectedTabPosition() == 0 || "nearby".equals(c479740Irc.LIZIZ.H2(c479740Irc.LJIIJ.getSelectedTabPosition())) || "hangout".equals(c479740Irc.LIZIZ.H2(c479740Irc.LJIIJ.getSelectedTabPosition()))) && (c480130IsF = c479740Irc.LJIIIZ) != null && !c480130IsF.LLJILLL)) {
            C786410Ut5.i0(c479740Irc.LJIIL, 8);
            if (HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
                TuxImmersionBar tuxImmersionBarLJ2 = C1766560w4U.LJ(c479740Irc.LIZ.U6());
                tuxImmersionBarLJ2.LJIIIZ(-16777216);
                tuxImmersionBarLJ2.LIZLLL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$103(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C0IEG c0ieg;
        LiveWidget liveWidgetZb;
        C479680IrW c479680IrW;
        C479740Irc c479740Irc = (C479740Irc) aObjectS350S0100000_7.l0;
        c479740Irc.getClass();
        if (((Boolean) obj).booleanValue() && (c0ieg = c479740Irc.LJFF) != null && c0ieg.getCurrentFragment() != null && (liveWidgetZb = c479740Irc.LJFF.getCurrentFragment().zb()) != null && (c479680IrW = c479740Irc.LJIIJJI) != null) {
            c479680IrW.setCloseWidgetDelegate(liveWidgetZb);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$104(Y.AObjectS350S0100000_7 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS350S0100000_7.invoke$104(Y.AObjectS350S0100000_7, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$105(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        ((C479740Irc) aObjectS350S0100000_7.l0).LIZ.U6().onBackPressed();
        return Unit.LIZ;
    }

    public static final Object invoke$106(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        ((C05P0) aObjectS350S0100000_7.l0).setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        int i;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        Boolean bool = (Boolean) obj;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C464170IId.LIZ().LIZ = bool.booleanValue();
        if (C464660IKa.LIZ()) {
            C463690IGh.LIZ = bool.booleanValue();
        }
        if (bool.booleanValue()) {
            C1113800f5e.LJIIIIZZ = false;
        } else {
            int[] iArr = new int[2];
            C0IEB c0ieb = livePlayFragment.LLLFZ;
            if (c0ieb != null) {
                c0ieb.getVideoSize(iArr);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{");
            sbLIZ.append(iArr[0]);
            sbLIZ.append(",");
            sbLIZ.append(iArr[1]);
            sbLIZ.append("}");
            C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
            int i2 = iArr[0];
            if (i2 != 0 && (i = iArr[1]) != 0) {
                livePlayFragment.dV(i2, i, C12ES.LJIIJ(livePlayFragment.getContext()), "startRoom");
            }
            if (C500260Jjc.LJJIIJZLJL(livePlayFragment.LLILZ)) {
                C1113800f5e.LJIIIIZZ = true;
            }
            C464170IId.LIZ().LIZIZ = false;
            if (livePlayFragment.LLJJ == LiveMode.LIVE_STUDIO && !livePlayFragment.LLJLLIL) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) livePlayFragment.LLLLIILLL.LIZIZ();
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                livePlayFragment.LLLLIILLL.LIZLLL(layoutParams, "cohost_close_after_pip");
                if (livePlayFragment.LLJLILLLLZIIL) {
                    int[] iArr2 = new int[2];
                    if (livePlayFragment.LLLFZ != null) {
                        if (LinkmicRtcRatioOptimizePlayerSize.isEnable()) {
                            livePlayFragment.LLLFZ.getVideoSizeNoCache(iArr2);
                        } else {
                            livePlayFragment.LLLFZ.getVideoSize(iArr2);
                        }
                    }
                    livePlayFragment.dV(iArr2[0], iArr2[1], C12ES.LJIIJ(livePlayFragment.getContext()), "cohost_close_after_pip");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable()) {
            livePlayFragment.hS();
            C469840Ibe.LIZ(livePlayFragment.LLILLJJLI);
            C464800IKo.LIZ.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        Integer num = (Integer) obj;
        if (livePlayFragment.Y0 != null && livePlayFragment.LLLLLJLJLL != null && !TtliveGameLiveEnterRoomDrawLoadOptSetting.INSTANCE.isOpenLoadingOpt(livePlayFragment.LLJJ)) {
            livePlayFragment.LLJZIJLIL = num.intValue();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (livePlayFragment.LLJLL == 1) {
                layoutParams.topMargin = livePlayFragment.LLJZIJLIL;
                layoutParams.gravity = 1;
            } else {
                layoutParams.leftMargin = livePlayFragment.LLLLLJLJLL.getWidth() / 2;
                layoutParams.gravity = 16;
            }
            C786410Ut5.W5(livePlayFragment.Y0, layoutParams);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        livePlayFragment.OU((C0IEU) obj, (String) livePlayFragment.y.gg0(AudienceMultiGuestShareBgChannel.class), false);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        livePlayFragment.n1 = true;
        if (!livePlayFragment.b1 && !C781520UlC.LJFF(livePlayFragment.LLILZ) && livePlayFragment.f308o0 != EnumC464630IJx.MASK) {
            livePlayFragment.LJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        Pair pair = (Pair) obj;
        C467650IVn c467650IVn = ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLF;
        if (c467650IVn != null) {
            boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
            int iIntValue = ((Integer) pair.getSecond()).intValue();
            C467680IVq c467680IVq = c467650IVn.LJIIJ;
            if (c467680IVq != null) {
                c467680IVq.LJ = zBooleanValue;
                if (zBooleanValue) {
                    c467680IVq.LIZ(iIntValue, null);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C09AJ c09aj = (C09AJ) aObjectS350S0100000_7.l0;
        if (((Boolean) obj).booleanValue()) {
            c09aj.onNext(Boolean.TRUE);
            c09aj.onComplete();
            return null;
        }
        return null;
    }

    public static final Object invoke$18(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String str = LivePlayFragment._pnsPageId;
        ((LivePlayFragment) aObjectS350S0100000_7.l0).onEvent((C0IGV) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C472280Ifa c472280IfaLIZLLL;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0KVO c0kvo = (C0KVO) obj;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (SmoothClearScreenSetting.INSTANCE.smoothGesture() && c0kvo != null && (c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(livePlayFragment.getActivity()))) != null) {
            c472280IfaLIZLLL.LLILLJJLI.LJIIL = c0kvo.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C0IEU c0ieu = (C0IEU) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewerLayoutParamsChanged ");
        sbLIZ.append(c0ieu);
        C20441214yg.LIZIZ("InteractALogUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
            ((LivePlayFragment) aObjectS350S0100000_7.l0).eU(c0ieu);
        } else {
            LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
            livePlayFragment.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onAudienceVideoViewParams: ");
            sbLIZ2.append(c0ieu.toString());
            sbLIZ2.append(" videoView = ");
            sbLIZ2.append(livePlayFragment.LLLLIILLL.hashCode());
            C20441214yg.LIZIZ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ2));
            C19EG activity = livePlayFragment.getActivity();
            if (livePlayFragment.LLLLIILLL != null && !C472950Igf.LIZIZ(activity)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) livePlayFragment.LLLLIILLL.LIZIZ();
                FrameLayout.LayoutParams layoutParamsLIZ = c0ieu.LIZ();
                if (!c0ieu.LJIIJJI && layoutParams.width == layoutParamsLIZ.width && layoutParams.height == layoutParamsLIZ.height && layoutParams.gravity == layoutParamsLIZ.gravity && layoutParams.leftMargin == layoutParamsLIZ.leftMargin && layoutParams.topMargin == layoutParamsLIZ.topMargin && layoutParams.rightMargin == layoutParamsLIZ.rightMargin && layoutParams.bottomMargin == layoutParamsLIZ.bottomMargin) {
                    C20441214yg.LIZIZ("LivePlayFragment", "onAudienceVideoViewParams return as params is the same as old");
                } else {
                    livePlayFragment.OR();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) livePlayFragment.LLLLIILLL.LIZIZ();
                    if (c0ieu.LJFF) {
                        C463710IGj c463710IGj = livePlayFragment.LLLLIILLL;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(c0ieu.LJIIJ);
                        sbLIZ3.append("_onAudienceVideoViewParams1_alp.isFullScreen()");
                        c463710IGj.LIZLLL(layoutParamsLIZ, C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        layoutParams2.width = c0ieu.LIZ;
                        layoutParams2.height = c0ieu.LIZIZ;
                        layoutParams2.gravity = 51;
                        layoutParams2.leftMargin = c0ieu.LIZLLL;
                        layoutParams2.rightMargin = c0ieu.LJ;
                        layoutParams2.topMargin = c0ieu.LIZJ;
                        C463710IGj c463710IGj2 = livePlayFragment.LLLLIILLL;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(c0ieu.LJIIJ);
                        sbLIZ4.append("_onAudienceVideoViewParams2_alp.notFullScreen()");
                        c463710IGj2.LIZLLL(layoutParams2, C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
            }
        }
        LivePlayFragment livePlayFragment2 = (LivePlayFragment) aObjectS350S0100000_7.l0;
        HandlerHook.viewPost(livePlayFragment2.LLLLIILLL.LIZ, new ARunnableS12S0200100_7(aObjectS350S0100000_7, livePlayFragment2.LLILLJJLI, c0ieu, 2));
        C0IEB c0ieb = ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLFZ;
        if (c0ieb != null) {
            c0ieb.enableSeiFilter(c0ieu.LJIIIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        ((LivePlayFragment) aObjectS350S0100000_7.l0).X1.LJIIL(((Long) obj).longValue());
        return Unit.LIZ;
    }

    public static final Object invoke$21(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        int iLJIIJ;
        LiveMode liveMode;
        GameLiveBillboardWidget gameLiveBillboardWidget;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        LiveMode liveMode2 = livePlayFragment.LLJJ;
        LiveMode liveMode3 = LiveMode.SCREEN_RECORD;
        if (liveMode2 == liveMode3 || liveMode2 == LiveMode.LIVE_STUDIO) {
            int measuredWidth = livePlayFragment.LLLLIILLL.LIZ.getMeasuredWidth();
            int measuredHeight = livePlayFragment.LLLLIILLL.LIZ.getMeasuredHeight();
            if (measuredWidth != 0 && measuredWidth >= measuredHeight) {
                C463420IFg c463420IFg = livePlayFragment.I1;
                if (c463420IFg != null && c463420IFg.LIZ > 0.0f && livePlayFragment.LLJLL == 1 && (iLJIIJ = C12ES.LJIIJ(C497740JfY.LJII())) > 0) {
                    measuredWidth = iLJIIJ;
                }
                livePlayFragment.s.LIZ(livePlayFragment.LLJLL, measuredWidth, measuredHeight);
            } else {
                livePlayFragment.s.LIZ(livePlayFragment.LLJLL, 0, 0);
            }
        }
        C0IFE c0ife = livePlayFragment.t;
        if (c0ife != null && (((liveMode = livePlayFragment.LLJJ) == liveMode3 || liveMode == LiveMode.LIVE_STUDIO) && (gameLiveBillboardWidget = c0ife.LIZJ) != null && gameLiveBillboardWidget.x1().getVisibility() == 0)) {
            int measuredWidth2 = livePlayFragment.LLLLIILLL.LIZ.getMeasuredWidth();
            int measuredHeight2 = livePlayFragment.LLLLIILLL.LIZ.getMeasuredHeight();
            if (measuredWidth2 != 0 && measuredWidth2 >= measuredHeight2) {
                C0IFE c0ife2 = livePlayFragment.t;
                int i = livePlayFragment.LLJLL;
                GameLiveBillboardWidget gameLiveBillboardWidget2 = c0ife2.LIZJ;
                if (gameLiveBillboardWidget2 != null && gameLiveBillboardWidget2.isInitialized()) {
                    GameLiveBillboardWidget gameLiveBillboardWidget3 = c0ife2.LIZJ;
                    if (gameLiveBillboardWidget3 != null) {
                        gameLiveBillboardWidget3.C1(i);
                    }
                } else {
                    c0ife2.LIZIZ = i;
                }
            } else {
                C0IFE c0ife3 = livePlayFragment.t;
                int i2 = livePlayFragment.LLJLL;
                GameLiveBillboardWidget gameLiveBillboardWidget4 = c0ife3.LIZJ;
                if (gameLiveBillboardWidget4 != null && gameLiveBillboardWidget4.isInitialized()) {
                    GameLiveBillboardWidget gameLiveBillboardWidget5 = c0ife3.LIZJ;
                    if (gameLiveBillboardWidget5 != null) {
                        gameLiveBillboardWidget5.C1(i2);
                    }
                } else {
                    c0ife3.LIZIZ = i2;
                }
            }
        }
        int measuredWidth3 = livePlayFragment.LLLLIILLL.LIZ.getMeasuredWidth();
        int measuredHeight3 = livePlayFragment.LLLLIILLL.LIZ.getMeasuredHeight();
        int left = livePlayFragment.LLLLIILLL.LIZ.getLeft();
        int top = livePlayFragment.LLLLIILLL.LIZ.getTop();
        if (livePlayFragment.y != null) {
            Rect rect = new Rect(left, top, left + measuredWidth3, top + measuredHeight3);
            livePlayFragment.y.zW(MultiGuestV3VideoViewRealSizeChannel.class, rect);
            if (livePlayFragment.LLZZ != null) {
                C464030IHp.LJIIIZ = rect;
            }
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncVideoSize ,videoWidth = ");
            sbLIZ.append(measuredWidth3);
            sbLIZ.append(", videoHieght = ");
            sbLIZ.append(measuredHeight3);
            C20441214yg.LIZIZ("live_renderview", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        ImageView imageView = livePlayFragment.LLLLLLZ;
        if (imageView != null && (imageView.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(livePlayFragment.LLLLLLZ, (ViewGroup) livePlayFragment.LLLLLLZ.getParent());
            if (livePlayFragment.LLLLLLZ.getTag() instanceof Bitmap) {
                C786410Ut5.LJJJJ((Bitmap) livePlayFragment.LLLLLLZ.getTag());
            }
            livePlayFragment.LLLLLLZ = null;
            C463710IGj c463710IGj = livePlayFragment.LLLLIILLL;
            if (c463710IGj != null) {
                C786410Ut5.Jc(c463710IGj.LIZ, 0.0f);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        if (absAudienceInteractionFragment.mStatusViewValid && absAudienceInteractionFragment.getView() != null && absAudienceInteractionFragment.NS()) {
            absAudienceInteractionFragment.aS();
        }
        if (!C0IJ7.LIZIZ(absAudienceInteractionFragment.getContext())) {
            if (C0IJ7.LIZ(absAudienceInteractionFragment.LLJJJJJIL)) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).updateSearchScrollStatus();
            } else if (C0IJ7.LIZJ(absAudienceInteractionFragment.LLJJJJJIL)) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).updateMixLiveScrollStatus();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        absAudienceInteractionFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            EnumC1102750enp enumC1102750enp = EnumC1102750enp.LANDSCAPE_MESSAGE;
            if (!enumC1102750enp.isShowing(absAudienceInteractionFragment.LLJIJIL)) {
                enumC1102750enp.load(absAudienceInteractionFragment.LLJIJIL, new C473140Igy(absAudienceInteractionFragment.LLJJI));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$25(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String str = LivePlayFragment._pnsPageId;
        ((LivePlayFragment) aObjectS350S0100000_7.l0).kU((C0IFO) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.kT("layout start");
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        Long l = (Long) obj;
        if (livePlayFragment.f307n2 != null && l.longValue() == livePlayFragment.LLILLJJLI && ((LiveRoomFragment) livePlayFragment.f307n2).cS(livePlayFragment)) {
            ((LiveRoomFragment) livePlayFragment.f307n2).GS();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        portraitAudienceInteractionFragment.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (portraitAudienceInteractionFragment.LLZLI == null) {
            SwitchDefinitionTipsWidget switchDefinitionTipsWidget = new SwitchDefinitionTipsWidget(zBooleanValue);
            portraitAudienceInteractionFragment.LLZLI = switchDefinitionTipsWidget;
            portraitAudienceInteractionFragment.LLJJI.load(R.id.wu1, (Widget) switchDefinitionTipsWidget, false);
        }
        portraitAudienceInteractionFragment.LLZLI.show();
        return Unit.LIZ;
    }

    public static final Object invoke$29(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String strLJIJI;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        AccessRecallMessage accessRecallMessage = (AccessRecallMessage) obj;
        String str = LivePlayFragment._pnsPageId;
        if (accessRecallMessage != null) {
            livePlayFragment.getClass();
            if (LivePlayFragment.NT(accessRecallMessage) != LiveMode.VIDEO && livePlayFragment.LLJJ == LivePlayFragment.NT(accessRecallMessage)) {
                C464170IId.LIZ().LJIIIIZZ(C0IIM.LIVE_END, C464170IId.LIZ().LIZ());
                Event event = new Event("live_play_end_obs_access_recall", 33816, C0IIR.MessageReceived);
                event.LIZIZ("receive obs access recall. show live end dialog");
                C0IL2.LIZ.LIZ().LIZIZ(event);
                livePlayFragment.dS(C463290IEt.LJFF);
                livePlayFragment.y.IQ2(C749240TaE.class, new Pair(401, 401006));
                C0IIS.LIZ(livePlayFragment.g1, C0II1.LIVE_ACCESS_RECALL, "slide_next_room");
                livePlayFragment.oS(C0II0.LIVE_ACCESS_RECALL);
                if (accessRecallMessage.notice != null) {
                    C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                    String str2 = accessRecallMessage.notice.key;
                    c1124870fNVLIZJ.getClass();
                    strLJIJI = C1124870fNV.LIZIZ(str2);
                    if (TextUtils.isEmpty(strLJIJI)) {
                        strLJIJI = accessRecallMessage.notice.defaultPattern;
                    }
                } else {
                    strLJIJI = "";
                }
                if (TextUtils.isEmpty(strLJIJI)) {
                    strLJIJI = C497740JfY.LJIJI(2131844550);
                }
                Room room = livePlayFragment.LLILZ;
                if (room != null && room.getOwner() != null) {
                    LiveMode liveMode = livePlayFragment.LLJJ;
                    EnterRoomConfig enterRoomConfig = livePlayFragment.g1;
                    Long lValueOf = Long.valueOf(livePlayFragment.LLILZ.getId());
                    Long lValueOf2 = Long.valueOf(livePlayFragment.LLILZ.getOwner().getId());
                    if (liveMode == LiveMode.THIRD_PARTY) {
                        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                        String str3 = roomsData.enterFromMerge;
                        String str4 = roomsData.enterMethod;
                        String str5 = roomsData.enterType;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_obs_revoke_user_pop");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(str5, "action_type");
                        c474500IjALIZ.LJJII(str3, "enter_from_merge");
                        c474500IjALIZ.LJJII(str4, "enter_method");
                        c474500IjALIZ.LJJII(lValueOf, "room_id");
                        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
                        c474500IjALIZ.LIZ();
                    }
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                    String str6 = roomsData2.enterFromMerge;
                    String str7 = roomsData2.enterMethod;
                    String str8 = roomsData2.enterType;
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_access_revoke_user_pop");
                    c474500IjALIZ2.LJIL();
                    c474500IjALIZ2.LJJII(str8, "action_type");
                    c474500IjALIZ2.LJJII(str6, "enter_from_merge");
                    c474500IjALIZ2.LJJII(str7, "enter_method");
                    c474500IjALIZ2.LJJII(lValueOf, "room_id");
                    c474500IjALIZ2.LJJII(lValueOf2, "anchor_id");
                    c474500IjALIZ2.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                    c474500IjALIZ2.LJJII(liveMode.logStreamingType, "live_type");
                    c474500IjALIZ2.LIZ();
                    C766270U4b.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL, livePlayFragment.getActivity(), C786410Ut5.j4(strLJIJI, new Object[]{C0KVU.LIZ(livePlayFragment.LLILZ.getOwner())}));
                }
            }
        } else {
            livePlayFragment.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C0IET c0iet = (C0IET) obj;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C19EG activity = livePlayFragment.getActivity();
        if (livePlayFragment.LLLLIILLL != null && !C472950Igf.LIZIZ(activity)) {
            if (!MultiCohostRoomLoadingOptSetting.INSTANCE.isEnable() || (!CoHostNotUseOldArchSetting.INSTANCE.getValue())) {
                livePlayFragment.bV();
            }
            if (c0iet.LJFF) {
                livePlayFragment.W = false;
                livePlayFragment.y.zW(IsVideoViewChangeForHostChannel.class, Boolean.FALSE);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) livePlayFragment.LLLLIILLL.LIZIZ();
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 17;
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = 0;
                C463710IGj c463710IGj = livePlayFragment.LLLLIILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0iet.LJIIIIZZ);
                sbLIZ.append("_videoViewChange_alp.isFullScreen()");
                c463710IGj.LIZLLL(layoutParams, C2188811AlT.LIZIZ(sbLIZ));
                if (livePlayFragment.LLJLILLLLZIIL) {
                    int[] iArr = new int[2];
                    if (livePlayFragment.LLLFZ != null) {
                        if (LinkmicRtcRatioOptimizePlayerSize.isEnable()) {
                            livePlayFragment.LLLFZ.getVideoSizeNoCache(iArr);
                        } else {
                            livePlayFragment.LLLFZ.getVideoSize(iArr);
                        }
                    }
                    livePlayFragment.dV(iArr[0], iArr[1], C12ES.LJIIJ(livePlayFragment.getContext()), "cohost_close");
                } else {
                    Room room = livePlayFragment.LLILZ;
                    if (room != null && room.multiStreamSource == 1) {
                        int[] iArr2 = new int[2];
                        if (livePlayFragment.LLLFZ != null) {
                            if (LinkmicRtcRatioOptimizePlayerSize.isEnable()) {
                                livePlayFragment.LLLFZ.getVideoSizeNoCache(iArr2);
                            } else {
                                livePlayFragment.LLLFZ.getVideoSize(iArr2);
                            }
                        }
                        livePlayFragment.dV(iArr2[0], iArr2[1], C12ES.LJIIJ(livePlayFragment.getContext()), "cohost_close");
                    }
                }
            } else {
                livePlayFragment.W = true;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) livePlayFragment.LLLLIILLL.LIZIZ();
                if (layoutParams2.width != 0 && layoutParams2.height != 0 && c0iet.LIZ != 0 && c0iet.LIZIZ != 0) {
                    livePlayFragment.y.zW(IsVideoViewChangeForHostChannel.class, Boolean.TRUE);
                    layoutParams2.width = c0iet.LIZ;
                    layoutParams2.height = c0iet.LIZIZ;
                    layoutParams2.leftMargin = c0iet.LIZLLL;
                    layoutParams2.topMargin = c0iet.LIZJ;
                    layoutParams2.rightMargin = c0iet.LJ;
                    if (LiveSdkLinkMicLandscapeSetting.isEnable() && !C497740JfY.LJIL()) {
                        layoutParams2.gravity = 49;
                    } else {
                        layoutParams2.gravity = 48;
                    }
                    C463710IGj c463710IGj2 = livePlayFragment.LLLLIILLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c0iet.LJIIIIZZ);
                    sbLIZ2.append("_videoViewChange_notFullScreen");
                    c463710IGj2.LIZLLL(layoutParams2, C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("onVideoViewChangeParams return as lp.width = ");
                    sbLIZ3.append(layoutParams2.width);
                    sbLIZ3.append("  lp.height = ");
                    sbLIZ3.append(layoutParams2.height);
                    C20441214yg.LJ("ttlive_enter_room_log_RenderView", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            HandlerHook.viewPost(livePlayFragment.LLLLIILLL.LIZ, new ARunnableS76S0200000_7(livePlayFragment, c0iet, 13));
        } else {
            C20441214yg.LIZIZ("LivePlayFragment", "onVideoViewChangeParams return as in pip mode");
            if (C472950Igf.LIZIZ(activity)) {
                if (c0iet.LJFF) {
                    livePlayFragment.W = false;
                    livePlayFragment.y.zW(IsVideoViewChangeForHostChannel.class, Boolean.FALSE);
                } else {
                    livePlayFragment.W = true;
                    livePlayFragment.y.zW(IsVideoViewChangeForHostChannel.class, Boolean.TRUE);
                }
            }
        }
        C0IEB c0ieb = ((LivePlayFragment) aObjectS350S0100000_7.l0).LLLFZ;
        if (c0ieb != null) {
            c0ieb.enableSeiFilter(c0iet.LJII);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        InterfaceC466370IQp currentFragment;
        Pair pair = (Pair) obj;
        C0IGD c0igd = ((LivePlayFragment) aObjectS350S0100000_7.l0).f307n2;
        if (c0igd != null) {
            Room room = (Room) pair.getFirst();
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) pair.getSecond();
            LiveRoomFragment liveRoomFragment = (LiveRoomFragment) c0igd;
            if (liveRoomFragment.LLLLIIIILLL != null && liveRoomFragment.LLLJIL != null && (currentFragment = liveRoomFragment.getCurrentFragment()) != null) {
                currentFragment.Eq();
                int iLJJIII = liveRoomFragment.LLLLIIIILLL.LJJIII(room, enterRoomConfig);
                if (iLJJIII >= 0) {
                    Set<Long> set = liveRoomFragment.LLLLLLLLLL;
                    if (set != null) {
                        ((HashSet) set).add(Long.valueOf(room.getId()));
                    }
                    HandlerHook.viewPost(liveRoomFragment.LLLJIL, new ARunnableS18S0101000_7(iLJJIII, liveRoomFragment, 1));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        if (portraitAudienceInteractionFragment.LLJIJIL.gg0(RoomChannel.class) == null) {
            return Unit.LIZ;
        }
        C784440Upu.LIZ().LIZIZ(new C465900IOu());
        portraitAudienceInteractionFragment.VT();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        absAudienceInteractionFragment.getClass();
        EnumC1102750enp.DUMMY_FAST_GIFT.unload(absAudienceInteractionFragment.LLJIJIL);
        C486790J7d.LJ(absAudienceInteractionFragment.LLJIJIL, new ARunnableS107S0100000_7(absAudienceInteractionFragment, 50));
        EnumC1102750enp.DUMMY_GIFT.unload(absAudienceInteractionFragment.LLJIJIL);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).loadBehavior(absAudienceInteractionFragment.getContext(), absAudienceInteractionFragment.LLJIJIL, EnumC1102750enp.GIFT.ordinal());
        return Unit.LIZ;
    }

    public static final Object invoke$33(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0IFP c0ifp = (C0IFP) obj;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PauseViewSizeChangeParam width:");
        sbLIZ.append(c0ifp.LIZ);
        sbLIZ.append(", height:");
        sbLIZ.append(c0ifp.LIZIZ);
        sbLIZ.append(", topMargin:");
        sbLIZ.append(c0ifp.LIZLLL);
        sbLIZ.append(", startMargin:");
        sbLIZ.append(c0ifp.LIZJ);
        sbLIZ.append(", resetPauseView:");
        sbLIZ.append(c0ifp.LJ);
        C20441214yg.LIZIZ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ));
        C463250IEp c463250IEp = livePlayFragment.s;
        int i = livePlayFragment.LLJLL;
        LivePlayPauseWidget livePlayPauseWidget = c463250IEp.LJ;
        if (livePlayPauseWidget != null && livePlayPauseWidget.isInitialized()) {
            LivePlayPauseWidget livePlayPauseWidget2 = c463250IEp.LJ;
            if (livePlayPauseWidget2 != null) {
                livePlayPauseWidget2.B1(c0ifp, i);
            }
        } else {
            c463250IEp.LIZLLL = c0ifp;
            c463250IEp.LIZ = i;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C0IGD c0igd;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (!((Boolean) obj).booleanValue() && (c0igd = livePlayFragment.f307n2) != null) {
            LiveRoomFragment liveRoomFragment = (LiveRoomFragment) c0igd;
            liveRoomFragment.LLLLLLLLL = false;
            C0IOL c0iol = liveRoomFragment.LLLLIIIILLL;
            if (c0iol instanceof C0ISJ) {
                C0ISJ c0isj = (C0ISJ) c0iol;
                c0isj.LLJLLL = "mg_random_match_inner_nomore";
                c0isj.LLJZ = "36";
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        EnumC475520Iko enumC475520Iko;
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        C475540Ikq c475540Ikq = (C475540Ikq) obj;
        portraitAudienceInteractionFragment.getClass();
        boolean z = c475540Ikq.LIZ;
        boolean z2 = c475540Ikq.LIZIZ;
        if (LiveInfeedSkylightEntranceSetting.isHangoutRoomPage(portraitAudienceInteractionFragment.LLJJJJJIL)) {
            enumC475520Iko = EnumC475520Iko.HANGOUT;
        } else {
            enumC475520Iko = EnumC475520Iko.SKYLIGHT;
        }
        if (c475540Ikq.LIZLLL) {
            enumC475520Iko = EnumC475520Iko.SKYLIGHT_WITH_TITLE;
        }
        C0KVO c0kvo = new C0KVO(z, "toplive", new C475530Ikp(z2, enumC475520Iko));
        if (c475540Ikq.LIZJ == portraitAudienceInteractionFragment.LLJILJIL.getId() || c475540Ikq.LIZJ == -3 || (portraitAudienceInteractionFragment.LLJILJIL.getOfficialChannelInfo() != null && portraitAudienceInteractionFragment.LLJILJIL.getOfficialChannelInfo().backupRoomId == c475540Ikq.LIZJ)) {
            if (z) {
                portraitAudienceInteractionFragment.B |= 1;
            } else {
                portraitAudienceInteractionFragment.B &= -2;
                if (portraitAudienceInteractionFragment.B != 0) {
                    return Unit.LIZ;
                }
            }
            portraitAudienceInteractionFragment.LLJIJIL.LC0(StartClearScreenEvent.class, c0kvo);
            DataChannelGlobal.LLILZ.HQ2(ScreenClearEvent.class, Boolean.valueOf(z));
        } else {
            C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(portraitAudienceInteractionFragment.getActivity()));
            if (c472280IfaLIZLLL != null) {
                c472280IfaLIZLLL.LLILLJJLI.LJIIL = z;
            }
        }
        if (c475540Ikq.LIZJ == -3) {
            DataChannelGlobal.LLILZ.HQ2(TopLiveClearModelChannel.class, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayPauseWidget livePlayPauseWidget;
        LivePlayPauseWidget livePlayPauseWidget2;
        C463250IEp c463250IEp = ((LivePlayFragment) aObjectS350S0100000_7.l0).s;
        if (c463250IEp != null && (livePlayPauseWidget = c463250IEp.LJ) != null && livePlayPauseWidget.isInitialized() && (livePlayPauseWidget2 = c463250IEp.LJ) != null) {
            C786410Ut5.LJZL(8, livePlayPauseWidget2.y1());
            C786410Ut5.LLJJIII(livePlayPauseWidget2.x1(), 8);
            ((C1126540fQC) livePlayPauseWidget2.LLILZLL.getValue()).LIZLLL();
            livePlayPauseWidget2.LLJILJIL = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        StreamUrl streamUrl = (StreamUrl) obj;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (streamUrl != null) {
            streamUrl.LJIIIIZZ();
            if (streamUrl.liveCoreSDKData != null) {
                streamUrl.LJII();
            }
            Room room = livePlayFragment.LLILZ;
            if (room != null) {
                room.setStreamUrl(streamUrl);
                livePlayFragment.LW(livePlayFragment.LLILZ);
                LiveCoreSDKData liveCoreSDKData = streamUrl.liveCoreSDKData;
                if (liveCoreSDKData != null && liveCoreSDKData.getPullData() != null) {
                    String streamData = liveCoreSDKData.getPullData().getStreamData();
                    C0IEB c0ieb = livePlayFragment.LLLFZ;
                    if (c0ieb != null) {
                        c0ieb.switchNextPullStream(streamData);
                    }
                } else {
                    C20441214yg.LJIIL("LivePlayFragment", "onSwitchTranslationStream: pullData is null");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$38(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.rU((C924400aAA) obj);
        if (!C0IJ7.LIZIZ(livePlayFragment.getContext())) {
            if (C0IJ7.LIZ(livePlayFragment.g1)) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).updateSearchScrollStatus();
            } else if (C0IJ7.LIZJ(livePlayFragment.g1)) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).updateMixLiveScrollStatus();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = (String) obj;
        C0IEU c0ieu = (C0IEU) livePlayFragment.y.gg0(AudienceVideoViewParams.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePlayFragment ");
        sbLIZ.append(livePlayFragment.LLILLJJLI);
        sbLIZ.append(" received change event, AudienceLayoutParams：");
        sbLIZ.append(c0ieu);
        sbLIZ.append(" imageFilePath：");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        livePlayFragment.OU(c0ieu, str, false);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        long jLongValue;
        Long lLJIILIIL;
        final AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        absAudienceInteractionFragment.Hu();
        Boolean bool = Boolean.TRUE;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (!bool.equals(dataChannelGlobal.gg0(C930810aKV.class))) {
            dataChannelGlobal.JQ2(C930810aKV.class, bool);
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).requestAceAccountInfo(C0IK0.WatchLiveEnd, new C0IKY(), new C0IKZ() { // from class: X.0IKX
                @Override // X.C0IKZ
                public final void LIZJ() {
                    DataChannelGlobal.LLILZ.JQ2(C930810aKV.class, Boolean.FALSE);
                }

                @Override // X.C0IKZ
                public final void LIZ(C0IKY c0iky) {
                    c0iky.LIZLLL.put("trigger_method", c0iky.LIZIZ);
                    c0iky.LIZLLL.put("popup_type", "skippable");
                    Room room = absAudienceInteractionFragment.LLJILJIL;
                    if (room != null) {
                        c0iky.LIZLLL.put("room_id", String.valueOf(room.getId()));
                        c0iky.LIZLLL.put("anchor_id", String.valueOf(absAudienceInteractionFragment.LLJILJIL.getOwnerUserId()));
                    }
                    EnterRoomConfig enterRoomConfig = absAudienceInteractionFragment.LLJJJJJIL;
                    if (enterRoomConfig != null) {
                        c0iky.LIZLLL.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
                        c0iky.LIZLLL.put("enter_method", absAudienceInteractionFragment.LLJJJJJIL.mRoomsData.enterMethod);
                        c0iky.LIZLLL.put("action_type", absAudienceInteractionFragment.LLJJJJJIL.mRoomsData.actionType);
                    }
                    DataChannelGlobal.LLILZ.JQ2(C931310aLJ.class, c0iky);
                }
            });
        }
        absAudienceInteractionFragment.LLLLLLL = true;
        dataChannelGlobal.GQ2(WidgetAllLoadedEvent.class);
        EnterRoomConfig.RoomsData roomsData = absAudienceInteractionFragment.LLJJJJJIL.mRoomsData;
        long j = roomsData.roomId;
        String str = roomsData.userId;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null) {
            iLiveFeedApiService.H12();
            List<Long> list = C467340IUi.LJIIJ;
            C467340IUi.LJIIJ = new ArrayList();
            Pair pair = new Pair(C467340IUi.LJIIJJI, list);
            String str2 = (String) pair.getFirst();
            List list2 = (List) pair.getSecond();
            if (!list2.isEmpty()) {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62);
                C480460Ism.LIZ().getClass();
                ((RoomApi) C480460Ism.LIZLLL(RoomApi.class)).collectUnreadRequest(j, jLongValue, strLJJLIIIJ, str2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        Room room;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0II2 c0ii2 = (C0II2) obj;
        if (livePlayFragment.LLLFZ != null) {
            int i = C464130IHz.LIZLLL[c0ii2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (room = livePlayFragment.LLILZ) != null && !room.isQuizRoom()) {
                            if (livePlayFragment.u == null) {
                                livePlayFragment.u = new C0IIJ();
                            }
                            C0IIJ c0iij = livePlayFragment.u;
                            C0IEB c0ieb = livePlayFragment.LLLFZ;
                            C11JF c11jf = c0iij.LIZIZ;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            c0iij.LIZIZ = (C11JF) C11NZ.LJIJJLI(new C521990KdZ(c0iij, c0ieb, 1)).LJL(C1701940uOG.LIZIZ()).LJJLIIIJLJLI(new C0IJB()).LJJLL(new AfS176S0100000_7(c0iij, 35), new AfS176S0100000_7(c0iij, 37));
                        }
                    } else {
                        Room room2 = livePlayFragment.LLILZ;
                        if (room2 != null && !room2.isQuizRoom()) {
                            if (livePlayFragment.u == null) {
                                livePlayFragment.u = new C0IIJ();
                            }
                            C0IIJ c0iij2 = livePlayFragment.u;
                            C0IEB c0ieb2 = livePlayFragment.LLLFZ;
                            C11JF c11jf2 = c0iij2.LIZIZ;
                            if (c11jf2 != null) {
                                c11jf2.dispose();
                            }
                            String currentResolution = c0ieb2.getCurrentResolution();
                            if (!C2093608Ic.LIZJ(currentResolution, "ao")) {
                                c0iij2.LIZ = currentResolution;
                            }
                            C20441214yg.LIZIZ("SwitchResolutionHelper", "switchAo:start");
                            c0ieb2.switchResolution("ao");
                            C0IX5.LJIIIIZZ(livePlayFragment.fT());
                        }
                    }
                } else {
                    livePlayFragment.LLLFZ.tryResumePlay();
                    livePlayFragment.LLZZZIL = false;
                }
            } else {
                livePlayFragment.LLLFZ.stopWhenJoinInteract();
                livePlayFragment.LLZZZIL = true;
                C0IX5.LJIIIIZZ(livePlayFragment.fT());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        ((LandscapeAudienceInteractionFragment) aObjectS350S0100000_7.l0).GU((EnumC473170Ih1) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$42(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        C19EG activity = livePlayFragment.getActivity();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(activity));
        if (c472280IfaLIZLLL != null) {
            c472280IfaLIZLLL.setContinueLike(zBooleanValue);
            return null;
        }
        return null;
    }

    public static final Object invoke$43(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String str;
        Skin skin;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0IFQ c0ifq = (C0IFQ) obj;
        String str2 = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (c0ifq.LIZ) {
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            if (!c467800IWc.LJIIIZ.equals(c0ifq.LIZIZ)) {
                livePlayFragment.EW(c0ifq.LIZIZ, c0ifq.LIZJ);
            }
            c467800IWc.LJIILJJIL = true;
            c467800IWc.LJIILL = c0ifq.LIZLLL;
            C0IKG.LJFF(livePlayFragment.getActivity(), true);
        } else {
            C467800IWc c467800IWc2 = C467800IWc.LJIJ;
            c467800IWc2.LJIILJJIL = false;
            String str3 = "";
            c467800IWc2.LJIILL = "";
            Room room = livePlayFragment.LLILZ;
            if (room == null || (skin = room.skin) == null) {
                str = "";
                if (room != null) {
                }
                livePlayFragment.EW(str, str3);
            } else {
                str = skin.scene;
            }
            PartnershipInfo partnershipInfo = room.partnershipInfo;
            if (partnershipInfo != null) {
                str3 = partnershipInfo.promotingDropsId;
            }
            livePlayFragment.EW(str, str3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        boolean z;
        C0IJV c0ijv = (C0IJV) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        float fFloatValue = ((Float) obj).floatValue();
        if (c0ijv.LJII()) {
            ValueAnimator valueAnimator = c0ijv.LJIIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c0ijv.LIZIZ(fFloatValue);
            if (fFloatValue >= 0.999f) {
                z = true;
            } else {
                z = false;
            }
            c0ijv.LJIILL = z;
            c0ijv.LIZLLL = z;
            return null;
        }
        return null;
    }

    public static final Object invoke$45(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        absAudienceInteractionFragment.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("close_gift_toast_show");
        c474500IjALIZ.LJIILJJIL("live_room");
        c474500IjALIZ.LJIILIIL("live_room");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("show");
        c474500IjALIZ.LJIJJLI(absAudienceInteractionFragment.LLJIJIL);
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$46(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        boolean z;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        C19EG activity = livePlayFragment.getActivity();
        if (!((C520220Kai) obj).LIZ && livePlayFragment.uV()) {
            z = true;
        } else {
            z = false;
        }
        C0IKG.LJI(activity, Boolean.valueOf(z));
        return Unit.LIZ;
    }

    public static final Object invoke$47(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        Room room = livePlayFragment.LLILZ;
        if (room != null && livePlayFragment.a1) {
            livePlayFragment.bS(room);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$48(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C472280Ifa c472280IfaQ6;
        Boolean bool = (Boolean) obj;
        C19EG activity = ((AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0).getActivity();
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(activity));
        if (c472280IfaLIZLLL != null) {
            c472280IfaLIZLLL.setKeyboardOpen(bool.booleanValue());
        } else if ((activity instanceof C0IFS) && (c472280IfaQ6 = ((C0IFS) activity).q6()) != null) {
            c472280IfaQ6.setKeyboardOpen(bool.booleanValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        EnumC464630IJx enumC464630IJx = (EnumC464630IJx) obj;
        livePlayFragment.f308o0 = enumC464630IJx;
        int i = C464130IHz.LIZJ[enumC464630IJx.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LivePaidEventPreviewRefreshSetting livePaidEventPreviewRefreshSetting = LivePaidEventPreviewRefreshSetting.INSTANCE;
                if (!livePaidEventPreviewRefreshSetting.enable()) {
                    if (livePlayFragment.LLLFZ != null) {
                        livePlayFragment.XV();
                    }
                } else if (livePaidEventPreviewRefreshSetting.reEnterRoom()) {
                    Context context = livePlayFragment.getContext();
                    if (context != null) {
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, livePlayFragment.g1);
                    }
                } else {
                    C480460Ism.LIZ().getClass();
                    livePlayFragment.k1.LIZ(((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).refreshPaidStream(livePlayFragment.LLILLJJLI, 1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(livePlayFragment, 44), new AfS176S0100000_7(livePlayFragment, 45)));
                }
            }
        } else {
            C0IEB c0ieb = livePlayFragment.LLLFZ;
            if (c0ieb != null) {
                c0ieb.stop(false);
            }
            livePlayFragment.LJIIL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        C0IEG c0iegAU = livePlayFragment.AU();
        if ((c0iegAU instanceof LiveRoomFragment) && c0iegAU.getCurrentFragment() == livePlayFragment) {
            c0iegAU.xq();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0IKS c0iks = (C0IKS) obj;
        if (livePlayFragment.LLILLJJLI == c0iks.LIZ) {
            if (c0iks.LIZIZ) {
                if (c0iks.LIZJ) {
                    C766270U4b.LIZLLL(2131851147);
                    return null;
                }
                C766270U4b.LIZLLL(2131851148);
                return null;
            }
            DataChannel dataChannel = livePlayFragment.y;
            if (dataChannel == null) {
                return null;
            }
            dataChannel.FQ2(LiveToStoryClickPublishEvent.class);
            return null;
        }
        return null;
    }

    public static final Object invoke$51(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C0IEW c0iew = (C0IEW) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        c0iew.setCardFullyShown(((Boolean) obj).booleanValue());
        return null;
    }

    public static final Object invoke$52(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        View view;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        C2177431AJp c2177431AJp = (C2177431AJp) obj;
        absAudienceInteractionFragment.getClass();
        if (c2177431AJp != null && c2177431AJp.LIZIZ && absAudienceInteractionFragment.NS() && (view = absAudienceInteractionFragment.getView()) != null && view.findViewById(R.id.q32) != null) {
            View viewFindViewById = view.findViewById(R.id.q32);
            if ((viewFindViewById instanceof ConstraintLayout) && view.findViewById(R.id.oay) != null && view.findViewById(R.id.tqe) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                C19MB c19mb = new C19MB();
                int childCount = constraintLayout.getChildCount();
                boolean z = c19mb.LIZIZ;
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    if (z && childAt.getId() == -1) {
                        childAt.setId(View.generateViewId());
                    }
                }
                c19mb.LJII(constraintLayout);
                c19mb.LJIIIIZZ(R.id.oay, 6, R.id.tqe, 7);
                c19mb.LIZIZ(constraintLayout);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        int i = C464130IHz.LIZIZ[((C0II9) obj).ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (livePlayFragment.LLLFZ != null) {
                    Room room = livePlayFragment.LLILZ;
                    if (room != null && room.getOwner() != null) {
                        livePlayFragment.LLLFZ.setIsPrivate(Long.valueOf(livePlayFragment.LLILZ.getOwner().getSecret()));
                    }
                    livePlayFragment.XV();
                }
                C467650IVn c467650IVn = livePlayFragment.LLLF;
                if (c467650IVn != null) {
                    c467650IVn.LJJIJ = System.currentTimeMillis();
                }
            }
        } else if (C494680Jac.LJI(livePlayFragment.y)) {
            C0IEB c0ieb = livePlayFragment.LLLFZ;
            if (c0ieb != null) {
                c0ieb.stop(false);
            }
            C467650IVn c467650IVn2 = livePlayFragment.LLLF;
            if (c467650IVn2 != null) {
                c467650IVn2.LJJIIZI = System.currentTimeMillis();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$54(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C19EG activity = ((AbsAudienceInteractionFragment) aObjectS350S0100000_7.l0).getActivity();
        boolean zBooleanValue = ((Boolean) ((Pair) obj).getFirst()).booleanValue();
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(C0IKG.LIZ(activity));
        if (c472280IfaLIZLLL != null) {
            c472280IfaLIZLLL.setCasterShow(zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (((Long) obj).longValue() == 1) {
            C467650IVn c467650IVn = livePlayFragment.LLLF;
            if (c467650IVn != null) {
                c467650IVn.LJJIIJ(false);
            }
            EnterRoomConfig enterRoomConfig = livePlayFragment.g1;
            if (enterRoomConfig != null) {
                enterRoomConfig.mRoomsData.isSubOnlyLive = 1L;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String str;
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        landscapeAudienceInteractionFragment.LLZLL = !landscapeAudienceInteractionFragment.LLZLL;
        landscapeAudienceInteractionFragment.PU();
        landscapeAudienceInteractionFragment.MU(2);
        InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(landscapeAudienceInteractionFragment.LLJILJIL.getId());
        if (interfaceC1085480eLyO41 != null && interfaceC1085480eLyO41.isEnabled()) {
            interfaceC1085480eLyO41.LJIJI(landscapeAudienceInteractionFragment.LLZLL);
        }
        DataChannel dataChannel = landscapeAudienceInteractionFragment.LLJIJIL;
        boolean z = landscapeAudienceInteractionFragment.LLZLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_lock_screen_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str = "lock";
        } else {
            str = "unlock";
        }
        c474500IjALIZ.LJJII(str, "purpose");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$57(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.UU(false, false);
        return Unit.LIZ;
    }

    public static final Object invoke$58(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        GameLiveBillboardWidget gameLiveBillboardWidget;
        GameLiveBillboardWidget gameLiveBillboardWidget2;
        RecyclableWidgetManager recyclableWidgetManager;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0IMF c0imf = (C0IMF) obj;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (c0imf != null) {
            int i = c0imf.LIZ;
            if (i == 1) {
                RecyclableWidgetManager recyclableWidgetManagerZS = livePlayFragment.ZS();
                C0IFE c0ife = new C0IFE(recyclableWidgetManagerZS, livePlayFragment.LLJLL);
                livePlayFragment.t = c0ife;
                GameLiveBillboardWidget gameLiveBillboardWidget3 = c0ife.LIZJ;
                if (gameLiveBillboardWidget3 != null && gameLiveBillboardWidget3.isInitialized()) {
                    GameLiveBillboardWidget gameLiveBillboardWidget4 = c0ife.LIZJ;
                    if (gameLiveBillboardWidget4 != null) {
                        gameLiveBillboardWidget4.B1(c0imf, false);
                    }
                } else {
                    GameLiveBillboardWidget gameLiveBillboardWidget5 = new GameLiveBillboardWidget(c0imf, c0ife.LIZIZ);
                    c0ife.LIZJ = gameLiveBillboardWidget5;
                    gameLiveBillboardWidget5.LLILLJJLI = c0ife.LIZIZ;
                    if (recyclableWidgetManagerZS != null) {
                        recyclableWidgetManagerZS.load(R.id.my8, (Widget) gameLiveBillboardWidget5, false);
                    }
                }
            } else if (i == 2) {
                C0IFE c0ife2 = livePlayFragment.t;
                if (c0ife2 != null) {
                    GameLiveBillboardWidget gameLiveBillboardWidget6 = c0ife2.LIZJ;
                    if (gameLiveBillboardWidget6 != null && gameLiveBillboardWidget6.isInitialized() && (recyclableWidgetManager = c0ife2.LIZ) != null) {
                        recyclableWidgetManager.unload(c0ife2.LIZJ);
                    }
                    livePlayFragment.t = null;
                }
            } else {
                C0IFE c0ife3 = livePlayFragment.t;
                if (c0ife3 != null && (gameLiveBillboardWidget = c0ife3.LIZJ) != null && gameLiveBillboardWidget.isInitialized() && (gameLiveBillboardWidget2 = c0ife3.LIZJ) != null) {
                    gameLiveBillboardWidget2.B1(c0imf, false);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C0IFX c0ifx = ((LivePlayFragment) aObjectS350S0100000_7.l0).T0;
        if (c0ifx != null) {
            c0ifx.qd();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        Boolean bool = (Boolean) obj;
        if (livePlayFragment.LLLFZ != null && livePlayFragment.y != null && livePlayFragment.LLJLL == 1) {
            livePlayFragment.f301X = bool.booleanValue();
            livePlayFragment.iV(livePlayFragment.LLJJ);
            livePlayFragment.PU();
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (((Boolean) obj).booleanValue() && livePlayFragment.b1 && livePlayFragment.mStatusViewValid) {
            livePlayFragment.AU().PI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        C475550Ikr c475550Ikr = (C475550Ikr) obj;
        portraitAudienceInteractionFragment.getClass();
        boolean z = c475550Ikr.LIZ;
        if (z) {
            portraitAudienceInteractionFragment.B |= 2;
        } else {
            portraitAudienceInteractionFragment.B &= -3;
            if (portraitAudienceInteractionFragment.B != 0) {
                return Unit.LIZ;
            }
        }
        portraitAudienceInteractionFragment.LLJIJIL.LC0(StartClearScreenEvent.class, new C0KVO(z, "toplive", new C475530Ikp(c475550Ikr.LIZIZ, EnumC475520Iko.NEARBY)));
        DataChannelGlobal.LLILZ.HQ2(ScreenClearEvent.class, Boolean.valueOf(z));
        return Unit.LIZ;
    }

    public static final Object invoke$62(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        C473190Ih3 c473190Ih3 = (C473190Ih3) obj;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        c473190Ih3.getClass();
        landscapeAudienceInteractionFragment.GU(c473190Ih3.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$63(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        C0IEG c0iegAU = livePlayFragment.AU();
        if ((c0iegAU instanceof LiveRoomFragment) && c0iegAU.getCurrentFragment() == livePlayFragment) {
            c0iegAU.W9(0L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.rU((C924400aAA) obj);
        if (!C0IJ7.LIZIZ(livePlayFragment.getContext())) {
            if (C0IJ7.LIZ(livePlayFragment.g1)) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).updateSearchScrollStatus();
            } else if (C0IJ7.LIZJ(livePlayFragment.g1)) {
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).updateMixLiveScrollStatus();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$65(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS350S0100000_7.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (landscapeAudienceInteractionFragment.LLZLLIL == null || zBooleanValue) {
            SwitchDefinitionTipsWidget switchDefinitionTipsWidget = new SwitchDefinitionTipsWidget(zBooleanValue);
            landscapeAudienceInteractionFragment.LLZLLIL = switchDefinitionTipsWidget;
            landscapeAudienceInteractionFragment.LLJJI.load(R.id.wu1, (Widget) switchDefinitionTipsWidget, false);
        }
        landscapeAudienceInteractionFragment.LLZLLIL.show();
        return Unit.LIZ;
    }

    public static final Object invoke$66(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        InterfaceC463170IEh interfaceC463170IEh;
        int i;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C956380azk c956380azk = (C956380azk) obj;
        String str = LivePlayFragment._pnsPageId;
        if (livePlayFragment.mStatusViewValid && livePlayFragment.LLLFZ != null) {
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LivePlayFragment_onPkStateChanged, event=");
                sbLIZ.append(c956380azk);
                C20441214yg.LIZIZ("1VNExperienceV1", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                int i2 = c956380azk.LIZ;
                if (i2 == 0) {
                    if (livePlayFragment.a1) {
                        livePlayFragment.LLLFZ.setAnchorInteractMode(true);
                        livePlayFragment.LLJLLIL = true;
                    }
                } else if (i2 == 1) {
                    livePlayFragment.LLLFZ.setAnchorInteractMode(false);
                    livePlayFragment.LLJLLIL = false;
                }
                DataChannel dataChannel = livePlayFragment.y;
                if (dataChannel == null || !((Boolean) dataChannel.gg0(PIPStatusData.class)).booleanValue()) {
                    int[] iArr = new int[2];
                    if (LinkmicRtcRatioOptimizePlayerSize.isEnable()) {
                        livePlayFragment.LLLFZ.getVideoSizeNoCache(iArr);
                    } else {
                        livePlayFragment.LLLFZ.getVideoSize(iArr);
                    }
                    int i3 = iArr[0];
                    if (i3 != 0 && (i = iArr[1]) != 0) {
                        livePlayFragment.eV(i3, i, C12ES.LJIIJ(livePlayFragment.getContext()), "pk", c956380azk);
                    }
                    int i4 = c956380azk.LIZ;
                    if (i4 == 0) {
                        if (!C931800aM6.LIZIZ()) {
                            livePlayFragment.sV();
                        }
                    } else if (i4 == 1) {
                        if (iArr[0] > iArr[1]) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) livePlayFragment.LLLLIILLL.LIZIZ();
                            layoutParams.gravity = 48;
                            if (!LinkmicRtcRatioOptimizeAudienceResize.isEnable() || ((interfaceC463170IEh = livePlayFragment.v1) == null ? !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Kz() : !(interfaceC463170IEh.getScene() == 2 || livePlayFragment.v1.getScene() == 4))) {
                                layoutParams.topMargin = LivePlayFragment.v2;
                            }
                            if (livePlayFragment.LLJLL == 1 && livePlayFragment.y != null) {
                                if (!c956380azk.LJ.booleanValue()) {
                                    layoutParams.gravity = 1;
                                }
                                livePlayFragment.PU();
                            }
                            if (!C931800aM6.LIZIZ()) {
                                livePlayFragment.LLLLIILLL.LIZLLL(layoutParams, "end cohost for horizontal");
                            }
                            C786410Ut5.LJJJJI(livePlayFragment.LLLLLJLJLL);
                            livePlayFragment.LLLLLJLJLL.addView(livePlayFragment.LLLLIILLL.LIZ, 0);
                        } else if (!C931800aM6.LIZIZ()) {
                            livePlayFragment.sV();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        InterfaceC466370IQp interfaceC466370IQp;
        Integer num = (Integer) obj;
        C466360IQo c466360IQo = ((LiveRoomFragment) aObjectS350S0100000_7.l0).LLLLJ;
        if (c466360IQo != null && (interfaceC466370IQp = c466360IQo.LLILLJJLI) != null) {
            interfaceC466370IQp.wD(num.intValue());
            return null;
        }
        return null;
    }

    public static final Object invoke$68(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        Boolean bool = (Boolean) obj;
        C21601619gM c21601619gM = ((LiveRoomFragment) aObjectS350S0100000_7.l0).LLLJIL;
        if (c21601619gM != null) {
            c21601619gM.LLILLL = !bool.booleanValue();
            return null;
        }
        return null;
    }

    public static final Object invoke$69(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aObjectS350S0100000_7.l0;
        Integer num = (Integer) obj;
        C21601619gM c21601619gM = liveRoomFragment.LLLJIL;
        if (c21601619gM != null && !liveRoomFragment.LLLLIILL) {
            c21601619gM.setScrollConfigInPortrait(num.intValue());
            return null;
        }
        return null;
    }

    public static final Object invoke$7(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C472910Igb c472910Igb;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        C0IMR c0imr = (C0IMR) obj;
        String str = LivePlayFragment._pnsPageId;
        if (!livePlayFragment.KT() && c0imr != null) {
            if (c0imr.LIZ() && livePlayFragment.S0 == null) {
                C472910Igb c472910Igb2 = new C472910Igb(livePlayFragment.getActivity());
                livePlayFragment.S0 = c472910Igb2;
                try {
                    if (!c472910Igb2.LJFF && c472910Igb2.LJII.canDetectOrientation()) {
                        c472910Igb2.LJII.enable();
                        c472910Igb2.LJFF = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("GameLiveAutoRotateManager", e);
                }
                C472910Igb c472910Igb3 = livePlayFragment.S0;
                C0IEC c0iec = livePlayFragment.W1;
                if (c0iec == null) {
                    c472910Igb3.getClass();
                } else if (c472910Igb3.LJIIIIZZ == null) {
                    c472910Igb3.LJIIIIZZ = new WeakReference<>(c0iec);
                }
            } else if (!c0imr.LIZ() && (c472910Igb = livePlayFragment.S0) != null) {
                c472910Igb.LJII.disable();
                c472910Igb.LJFF = false;
                WeakReference<C0IG9> weakReference = c472910Igb.LJIIIIZZ;
                if (weakReference != null) {
                    weakReference.clear();
                }
                c472910Igb.LJIIIIZZ = null;
                livePlayFragment.S0 = null;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aObjectS350S0100000_7.l0;
        C466500IRc c466500IRc = (C466500IRc) obj;
        C21601619gM c21601619gM = liveRoomFragment.LLLJIL;
        if (c21601619gM != null && !liveRoomFragment.LLLLIILL) {
            c21601619gM.setScrollVelocityInPortrait(c466500IRc.LIZ);
            liveRoomFragment.LLLJIL.setScrollDistanceInPortrait(c466500IRc.LIZIZ);
            return null;
        }
        return null;
    }

    public static final Object invoke$71(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aObjectS350S0100000_7.l0;
        Pair pair = (Pair) obj;
        liveRoomFragment.getClass();
        if (pair != null && Boolean.TRUE.equals(pair.getSecond())) {
            liveRoomFragment.PR(true);
            return null;
        }
        return null;
    }

    public static final Object invoke$72(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        Boolean bool = (Boolean) obj;
        C21601619gM c21601619gM = ((LiveRoomFragment) aObjectS350S0100000_7.l0).LLLJIL;
        if (c21601619gM != null) {
            c21601619gM.setEnabled(bool.booleanValue());
            return null;
        }
        return null;
    }

    public static final Object invoke$73(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aObjectS350S0100000_7.l0;
        Pair pair = (Pair) obj;
        liveRoomFragment.getClass();
        if (pair != null && Boolean.TRUE.equals(pair.getSecond())) {
            liveRoomFragment.PR(true);
            return null;
        }
        return null;
    }

    public static final Object invoke$74(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS350S0100000_7.l0;
        commentWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            C500260Jjc.LJIILIIL(commentWidget.LLILLL);
            C500260Jjc.LLFFF(commentWidget.LL);
            Pair pair = (Pair) commentWidget.dataChannel.gg0(CommentForceIconStyle.class);
            if (pair != null && ((Boolean) pair.getFirst()).booleanValue() && commentWidget.getView() != null) {
                ViewGroup.LayoutParams layoutParams = commentWidget.getView().getLayoutParams();
                if (((Boolean) pair.getSecond()).booleanValue() && (layoutParams instanceof C19ME)) {
                    C19ME c19me = (C19ME) layoutParams;
                    c19me.leftToRight = -1;
                    c19me.rightToLeft = R.id.tml;
                    C786410Ut5.W5(commentWidget.getView(), layoutParams);
                }
            }
            boolean z = commentWidget.LLLILZ;
            try {
                if (commentWidget.dataChannel.gg0(C1082850eHj.class) != null) {
                    long jLongValue = ((Long) commentWidget.dataChannel.gg0(C1082850eHj.class)).longValue();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_box_widthcheck");
                    c474500IjALIZ.LJIJJLI(commentWidget.dataChannel);
                    c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_click_available");
                    c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - jLongValue), "watch_duration");
                    c474500IjALIZ.LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            C500260Jjc.LJIILIIL(commentWidget.LL);
            C500260Jjc.LLFFF(commentWidget.LLILLL);
            if (commentWidget.getView() != null) {
                ViewGroup.LayoutParams layoutParams2 = commentWidget.getView().getLayoutParams();
                if (layoutParams2 instanceof C19ME) {
                    C19ME c19me2 = (C19ME) layoutParams2;
                    c19me2.leftToRight = R.id.mlc;
                    c19me2.rightToLeft = R.id.tml;
                    C786410Ut5.W5(commentWidget.getView(), layoutParams2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$75(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LiveDrawerEntranceWidget liveDrawerEntranceWidget = (LiveDrawerEntranceWidget) aObjectS350S0100000_7.l0;
        if (liveDrawerEntranceWidget.LLJJIII != null && liveDrawerEntranceWidget.LLILZLL != null) {
            liveDrawerEntranceWidget.L1();
            liveDrawerEntranceWidget.J1();
            liveDrawerEntranceWidget.I1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$76(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        Boolean boolValueOf = Boolean.valueOf(((C0IMR) obj).LIZ());
        if (fullVideoButtonWidget.isViewValid() && boolValueOf != null) {
            fullVideoButtonWidget.LLILLJJLI = boolValueOf.booleanValue();
            if (fullVideoButtonWidget.x1()) {
                fullVideoButtonWidget.show();
            } else {
                fullVideoButtonWidget.hide();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$77(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        boolean z;
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        C0IEU c0ieu = (C0IEU) obj;
        if (!C465230IMf.LIZ(fullVideoButtonWidget.dataChannel)) {
            if (c0ieu.LJI != EnumC918990a1R.NORMAL) {
                z = true;
            } else {
                z = false;
            }
            fullVideoButtonWidget.LLJ = z;
            if (z) {
                fullVideoButtonWidget.hide();
            } else if (fullVideoButtonWidget.x1()) {
                fullVideoButtonWidget.show();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$78(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        fullVideoButtonWidget.LLILLL = ((Boolean) obj).booleanValue();
        if (fullVideoButtonWidget.x1()) {
            fullVideoButtonWidget.show();
        } else {
            fullVideoButtonWidget.hide();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$79(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!((Boolean) obj).booleanValue() && fullVideoButtonWidget.x1()) {
            fullVideoButtonWidget.show();
        } else {
            fullVideoButtonWidget.hide();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            livePlayFragment.w = System.currentTimeMillis();
        } else if (livePlayFragment.w > 0) {
            livePlayFragment.v += System.currentTimeMillis() - livePlayFragment.w;
            livePlayFragment.w = 0L;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$80(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        C0II9 c0ii9 = (C0II9) obj;
        if (fullVideoButtonWidget.x1()) {
            if (C494680Jac.LJII(c0ii9)) {
                fullVideoButtonWidget.hide();
            } else if (c0ii9 == C0II9.SUBSCRIBER_NORMAL_LIVE) {
                fullVideoButtonWidget.show();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$81(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        if (obj != EnumC464630IJx.PREVIEW && obj != EnumC464630IJx.MASK) {
            if ((obj == EnumC464630IJx.PAY_SUCCESS || obj == EnumC464630IJx.NORMAL) && fullVideoButtonWidget.x1()) {
                fullVideoButtonWidget.show();
            }
        } else {
            fullVideoButtonWidget.hide();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$82(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        int i = ((C956380azk) obj).LIZ;
        if (i == 0) {
            fullVideoButtonWidget.LLIZLLLIL = true;
            fullVideoButtonWidget.hide();
        } else if (i == 1) {
            fullVideoButtonWidget.LLIZLLLIL = false;
            if (fullVideoButtonWidget.x1()) {
                fullVideoButtonWidget.show();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$83(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            fullVideoButtonWidget.LLIZLLLIL = true;
            fullVideoButtonWidget.hide();
        } else {
            fullVideoButtonWidget.LLIZLLLIL = false;
            if (fullVideoButtonWidget.x1()) {
                fullVideoButtonWidget.show();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$84(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        fullVideoButtonWidget.LLJILJIL = ((Boolean) obj).booleanValue();
        fullVideoButtonWidget.y1();
        return Unit.LIZ;
    }

    public static final Object invoke$85(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        FullVideoButtonWidget fullVideoButtonWidget = (FullVideoButtonWidget) aObjectS350S0100000_7.l0;
        fullVideoButtonWidget.getClass();
        fullVideoButtonWidget.LLJILJILJ = ((Boolean) obj).booleanValue();
        fullVideoButtonWidget.y1();
        return Unit.LIZ;
    }

    public static final Object invoke$86(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS350S0100000_7.l0;
        C0KX8 c0kx8 = (C0KX8) obj;
        if (c0kx8.LIZIZ && TextUtils.equals(c0kx8.LJI, "LIVE_INTRO")) {
            interfaceC1103130eoR.setAlpha(0.34f);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$87(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C497410Jf1 c497410Jf1 = (C497410Jf1) aObjectS350S0100000_7.l0;
        Room room = (Room) c497410Jf1.LL.gg0(RoomChannel.class);
        if (room != null) {
            if (obj != C0UFE.ON && room.cppVersion == 1) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_detail_setting");
                c474500IjALIZ.LJIL();
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                c474500IjALIZ.LJJIIZI(C494680Jac.LJIIZILJ(C517110KPt.LIZIZ()));
                c474500IjALIZ.LJ("click");
                c474500IjALIZ.LIZ();
                return null;
            }
            InterfaceC772190UQv.s3.LJFF(Boolean.FALSE);
            try {
                if (C036E.LIZ.LIZIZ()) {
                    C19EG c19egLJIJJLI = C520010KaN.LJIJJLI(c497410Jf1.LLILLJJLI, false);
                    if (c497410Jf1.LLILLJJLI != null && c497410Jf1.LL != null && c19egLJIJJLI != null) {
                        C497420Jf2.LIZ(c19egLJIJJLI, false, false);
                    }
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_room_detail_setting");
                    c474500IjALIZ2.LJIL();
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                    c474500IjALIZ2.LJJIIZI(C494680Jac.LJIIZILJ(C517110KPt.LIZIZ()));
                    c474500IjALIZ2.LJ("click");
                    c474500IjALIZ2.LIZ();
                    return null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C766270U4b.LIZLLL(2131843092);
            return null;
        }
        return null;
    }

    public static final Object invoke$88(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((AbstractC476820Imu) aObjectS350S0100000_7.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggered multiGuestHangupInfoChange, hangupCount=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", enableBackRefresh=");
        LiveSkylightRefreshWhenBackFromLiveSetting liveSkylightRefreshWhenBackFromLiveSetting = LiveSkylightRefreshWhenBackFromLiveSetting.INSTANCE;
        sbLIZ.append(liveSkylightRefreshWhenBackFromLiveSetting.enable());
        sbLIZ.append(" multiGuestApplyController=");
        sbLIZ.append(((AbstractC476820Imu) aObjectS350S0100000_7.l0).LJJJI);
        C20441214yg.LJIIIZ("SkylightMultiGuestApplyController", C2188811AlT.LIZIZ(sbLIZ));
        if (liveSkylightRefreshWhenBackFromLiveSetting.enable() && ((AbstractC476820Imu) aObjectS350S0100000_7.l0).LJJJI != null) {
            C786410Ut5.LJLIIL(1500L, C473410IhP.LIZ(), new ARunnableS107S0100000_7((AbstractC476820Imu) aObjectS350S0100000_7.l0, 175));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$89(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        ((AbstractC476820Imu) aObjectS350S0100000_7.l0).getClass();
        ((C476830Imv) ((AbstractC476820Imu) aObjectS350S0100000_7.l0)).LJJIJIL(jLongValue, jLongValue, "pageChange", false);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        DataChannel dataChannel;
        LivePlayFragment livePlayFragment = (LivePlayFragment) aObjectS350S0100000_7.l0;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        if (((Boolean) obj).booleanValue() && (dataChannel = livePlayFragment.y) != null && ((Boolean) dataChannel.gg0(PIPStatusData.class)).booleanValue()) {
            livePlayFragment.JW(0, 1, 1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$90(Y.AObjectS350S0100000_7 r2, java.lang.Object r3) {
        /*
            java.lang.Object r0 = r2.l0
            X.0Imu r0 = (X.AbstractC476820Imu) r0
            r0.getClass()
            java.lang.Object r1 = r2.l0
            X.0Imu r1 = (X.AbstractC476820Imu) r1
            boolean r0 = r1.LJJJJZI
            if (r0 == 0) goto L31
            X.0Ina r1 = r1.LJJIL
            if (r1 == 0) goto L34
            X.0In1 r1 = (X.C476890In1) r1
            com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController r0 = r1.LIZIZ
            X.0InM r0 = r0.LLJJ
            X.0Iki r0 = r0.c1()
            if (r0 == 0) goto L34
            com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController r0 = r1.LIZIZ
            X.0InM r0 = r0.LLJJ
            X.0Iki r0 = r0.c1()
            X.0kZq r0 = r0.LJ
            if (r0 == 0) goto L34
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L34
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            java.lang.Object r0 = r2.l0
            X.0Imu r0 = (X.AbstractC476820Imu) r0
            android.view.View r0 = r0.LJIJ
            if (r0 == 0) goto L31
            X.C500260Jjc.LLFFF(r0)
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS350S0100000_7.invoke$90(Y.AObjectS350S0100000_7, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$91(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        EnumC476920In4 enumC476920In4;
        EnumC476910In3 enumC476910In3;
        C477110InN c477110InN = (C477110InN) obj;
        ((AbstractC476820Imu) aObjectS350S0100000_7.l0).getClass();
        LiveNearbyTabSetting liveNearbyTabSetting = LiveNearbyTabSetting.INSTANCE;
        if (!liveNearbyTabSetting.getValue().enable || ((AbstractC476820Imu) aObjectS350S0100000_7.l0).LIZJ.K4()) {
            boolean zLJFF = Intrinsics.LJFF(c477110InN.LIZIZ, "topTabPreLoad");
            if (!liveNearbyTabSetting.getValue().enable || !Intrinsics.LJFF(c477110InN.LIZIZ, "topTab") || !Intrinsics.LJFF(c477110InN.LIZJ, "topTab") || c477110InN.LIZ != ((AbstractC476820Imu) aObjectS350S0100000_7.l0).LJJJJZI) {
                AbstractC476820Imu abstractC476820Imu = (AbstractC476820Imu) aObjectS350S0100000_7.l0;
                boolean z = c477110InN.LIZ;
                boolean z2 = c477110InN.LIZLLL;
                C477140InQ c477140InQ = EnumC476920In4.Companion;
                String str = c477110InN.LIZIZ;
                c477140InQ.getClass();
                EnumC476920In4[] enumC476920In4ArrValues = EnumC476920In4.values();
                int length = enumC476920In4ArrValues.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        enumC476920In4 = enumC476920In4ArrValues[i2];
                        if (Intrinsics.LJFF(enumC476920In4.getReason(), str)) {
                            break;
                        }
                        i2++;
                    } else {
                        enumC476920In4 = EnumC476920In4.DEFAULT;
                        break;
                    }
                }
                C477130InP c477130InP = EnumC476910In3.Companion;
                String str2 = c477110InN.LIZJ;
                c477130InP.getClass();
                EnumC476910In3[] enumC476910In3ArrValues = EnumC476910In3.values();
                int length2 = enumC476910In3ArrValues.length;
                while (true) {
                    if (i < length2) {
                        enumC476910In3 = enumC476910In3ArrValues[i];
                        if (Intrinsics.LJFF(enumC476910In3.getReason(), str2)) {
                            break;
                        }
                        i++;
                    } else {
                        enumC476910In3 = EnumC476910In3.DEFAULT;
                        break;
                    }
                }
                abstractC476820Imu.LJJIII(z, z2, enumC476920In4, enumC476910In3, zLJFF);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$92(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        IMicRoomService iMicRoomService;
        Room room;
        OfficialChannelInfo officialChannelInfo;
        User user;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS350S0100000_7.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        if (((C0KXI) obj).LIZ) {
            long id = liveRoomUserInfoWidget.LLLLLJLJLL.getOwner().getId();
            if (!liveRoomUserInfoWidget.LLLLLL && (iMicRoomService = liveRoomUserInfoWidget.LLLLZIL) != null && iMicRoomService.On1() && (room = liveRoomUserInfoWidget.LLLLLJLJLL) != null && (officialChannelInfo = room.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null) {
                id = user.getId();
            }
            ((InterfaceC500100JjM) UserService.getInstance().user().LJ(id, "LiveRoomUserInfoWidget_onLoginEvent", "roomUserInfo_onLoginEvent").LJJ(C1701940uOG.LIZIZ()).LIZLLL(C11RD.LJ(liveRoomUserInfoWidget))).LIZ(new AfS176S0100000_7(liveRoomUserInfoWidget, 225), new AfS132S0000000_7(31));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$93(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        int i;
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aObjectS350S0100000_7.l0;
        Integer num = (Integer) obj;
        int i2 = ClearScreenUserInfoWidget.l0;
        if (clearScreenUserInfoWidget.LLILZ != null && num.intValue() >= 0) {
            int measuredWidth = clearScreenUserInfoWidget.LLJIJIL.getMeasuredWidth();
            int iMeasureText = (int) clearScreenUserInfoWidget.LLJIJIL.getPaint().measureText(clearScreenUserInfoWidget.LLJIJIL.getText().toString());
            int iIntValue = num.intValue() - ((int) C497740JfY.LIZIZ(10));
            if (iIntValue > 0) {
                measuredWidth += iIntValue;
                C19ME c19me = (C19ME) clearScreenUserInfoWidget.LLILZ.getLayoutParams();
                c19me.matchConstraintMaxWidth += iIntValue;
                C786410Ut5.X5(c19me, clearScreenUserInfoWidget.LLILZ);
                clearScreenUserInfoWidget.LLJIJIL.setMaxWidth(measuredWidth);
            }
            if (measuredWidth >= iMeasureText) {
                i = 1;
            } else {
                i = 0;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_nickname_show");
            c474500IjALIZ.LJIJJLI(clearScreenUserInfoWidget.dataChannel);
            c474500IjALIZ.LJJII(Integer.valueOf((int) C497740JfY.LJJI(iMeasureText)), "nickname_width");
            c474500IjALIZ.LJJII(Integer.valueOf((int) C497740JfY.LJJI(measuredWidth)), "nickname_container_width");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_complete");
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$94(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        Room room;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS350S0100000_7.l0;
        Boolean bool = (Boolean) obj;
        String str = LiveRoomUserInfoWidget.Q;
        if ((Boolean.TRUE.equals(liveRoomUserInfoWidget.dataChannel.gg0(UserIsAnchorChannel.class)) || !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1()) && (room = liveRoomUserInfoWidget.LLLLLJLJLL) != null && room.getStreamType() != LiveMode.LIVE_VOICE) {
            liveRoomUserInfoWidget.x2(bool.booleanValue());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [X.0KA4, X.0emo] */
    public static final Object invoke$95(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String str;
        final LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS350S0100000_7.l0;
        final GuideMessage guideMessage = (GuideMessage) obj;
        String str2 = LiveRoomUserInfoWidget.Q;
        if (!liveRoomUserInfoWidget.W1(guideMessage)) {
            liveRoomUserInfoWidget.C1();
            if (liveRoomUserInfoWidget.Y1()) {
                liveRoomUserInfoWidget.j.end();
            }
            final View view = liveRoomUserInfoWidget.getView();
            ?? r1 = new InterfaceC1102120emo(guideMessage, liveRoomUserInfoWidget, view) { // from class: X.0KA4
                public final GuideMessage LIZ;
                public final InterfaceC1102150emr LIZIZ;
                public final View LIZJ;
                public final long LIZLLL;

                @Override // X.InterfaceC1102120emo
                public final String LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJFF() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final void LJI() {
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIIIZZ() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIIJJI() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final Boolean LJIIL() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final boolean LJIILIIL() {
                    return true;
                }

                @Override // X.InterfaceC1102120emo
                public final String getBusinessName() {
                    return "follow";
                }

                @Override // X.InterfaceC1102120emo
                public final Map<String, String> getExtras() {
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final C1099880ejC LJIIIZ() {
                    View view2 = this.LIZJ;
                    return new C1099880ejC(view2 != null ? view2.hasWindowFocus() : false);
                }

                @Override // X.InterfaceC1102120emo
                public final View LJIILJJIL() {
                    View view2 = this.LIZJ;
                    if (view2 != null) {
                        return view2.getRootView();
                    }
                    return null;
                }

                @Override // X.InterfaceC1102120emo
                public final String LJJJ() {
                    return String.valueOf(this.LIZ.getMessageId());
                }

                @Override // X.InterfaceC1102120emo
                public final String getId() {
                    return String.valueOf(this.LIZ.getMessageId());
                }

                @Override // X.InterfaceC1102120emo
                public final EnumC245600xC LIZLLL() {
                    return C245700xD.LIZ(this);
                }

                @Override // X.InterfaceC1102120emo
                public final int getComponentType() {
                    return LJII().getComponentType();
                }

                @Override // X.InterfaceC1102120emo
                public final InterfaceC1102150emr LJII() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1102120emo
                public final long LJIIJ() {
                    return this.LIZLLL;
                }

                {
                    long jLIZIZ;
                    this.LIZ = guideMessage;
                    this.LIZIZ = liveRoomUserInfoWidget;
                    this.LIZJ = view;
                    CommonMessageData commonMessageData = guideMessage.baseMessage;
                    if (commonMessageData != null) {
                        jLIZIZ = commonMessageData.createTime;
                    } else {
                        jLIZIZ = C963140bAe.LIZIZ();
                    }
                    this.LIZLLL = jLIZIZ;
                }
            };
            liveRoomUserInfoWidget.P = r1;
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel = liveRoomUserInfoWidget.dataChannel;
            c1102070emj.getClass();
            C1102070emj.LJJIII(dataChannel, liveRoomUserInfoWidget, r1);
            liveRoomUserInfoWidget.h = guideMessage;
            c1102070emj.LJJI(liveRoomUserInfoWidget.dataChannel, liveRoomUserInfoWidget, liveRoomUserInfoWidget.P, null);
            liveRoomUserInfoWidget.s = null;
        }
        if (guideMessage != null && guideMessage.baseMessage != null) {
            int i = (int) guideMessage.displayStyle;
            if (i != 6) {
                if (i != 7) {
                    if (i != 8) {
                        str = "";
                    } else {
                        str = "follow_guide_expand_all";
                    }
                } else {
                    str = "follow_guide_expand";
                }
            } else {
                str = "follow_guide_shake";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_follow_popup_receive");
            c474500IjALIZ.LJJII(str, "follow_guide_style");
            c474500IjALIZ.LJJII(guideMessage.baseMessage.logId, "notification_request_id");
            c474500IjALIZ.LJJII(guideMessage.scene, "notification_type");
            c474500IjALIZ.LJJII(Long.valueOf(guideMessage.displayStyle), "style");
            c474500IjALIZ.LJJII("portrait", "room_orientation");
            c474500IjALIZ.LJIJJLI(liveRoomUserInfoWidget.dataChannel);
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$96(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS350S0100000_7.l0;
        Integer num = (Integer) obj;
        DataChannel dataChannel = c1106110etF.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.LC0(PanelStateEvent.class, new C0KBR(true, EnumC1105670esX.SHARE, (int) C497740JfY.LIZIZ(num.intValue())));
        }
        InterfaceC481170Itv interfaceC481170Itv = c1106110etF.LLLIIII;
        if (interfaceC481170Itv != null) {
            interfaceC481170Itv.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$97(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        String userShareText;
        final LiveShareWidget liveShareWidget = (LiveShareWidget) aObjectS350S0100000_7.l0;
        String str = (String) liveShareWidget.dataChannel.gg0(C760110Trl.class);
        InterfaceC481210Itz interfaceC481210ItzMh = ((IShareService) C1161920gLG.LIZJ(IShareService.class)).mh();
        C19EG c19egLJ = C500260Jjc.LJ(liveShareWidget.context);
        C1106200etO c1106200etOLIZ = C1106210etP.LIZ(liveShareWidget.LLILLL);
        if (liveShareWidget.LLILLJJLI) {
            userShareText = liveShareWidget.LLILLL.getAnchorShareText();
        } else {
            userShareText = liveShareWidget.LLILLL.getUserShareText();
        }
        c1106200etOLIZ.LJIIJJI = userShareText;
        c1106200etOLIZ.LJIILIIL = liveShareWidget.LLILLJJLI;
        c1106200etOLIZ.LJJIL = ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).hL0();
        c1106200etOLIZ.LJIJI = str;
        C1106210etP c1106210etPLIZLLL = c1106200etOLIZ.LIZLLL();
        InterfaceC1372610lp5 interfaceC1372610lp5 = new InterfaceC1372610lp5() { // from class: X.0Ihf
            @Override // X.InterfaceC1372610lp5
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZIZ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LIZLLL(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJ(HashMap map) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJFF(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJI(Dialog dialog) {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void LJII() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onDismiss() {
            }

            @Override // X.InterfaceC1372610lp5
            public final /* synthetic */ void onShow(int i) {
            }

            @Override // X.InterfaceC1372610lp5
            public final void LIZJ(String str2, String str3, Bundle bundle) {
                Room room;
                String string = "";
                if (bundle != null) {
                    string = bundle.getString("shareIdList", "");
                }
                LiveShareWidget liveShareWidget2 = liveShareWidget;
                Room room2 = liveShareWidget2.LLILLL;
                if (room2 != null) {
                    ((IShareService) C1161920gLG.LIZJ(IShareService.class)).ky(liveShareWidget.LLILLL.getLabels(), room2.getId(), string, (String) DataChannelGlobal.LLILZ.gg0(C1148270fzF.class)).LJJLL(new AfS176S0100000_7(liveShareWidget2, 236), C0J1R.LIZ);
                }
                if (C0IXW.LJFF(liveShareWidget.dataChannel) && (room = liveShareWidget.LLILLL) != null && room.author() != null) {
                    HashMap map = new HashMap();
                    map.put("anchor_id", String.valueOf(liveShareWidget.LLILLL.author().getId()));
                    map.put("room_id", String.valueOf(liveShareWidget.LLILLL.getId()));
                    C0IXW c0ixw = C0IXW.LIZ;
                    C0IXW.LIZ("live_ad", "live_share", null, map);
                }
            }
        };
        C481220Iu0 c481220Iu0 = (C481220Iu0) interfaceC481210ItzMh;
        c481220Iu0.getClass();
        c1106210etPLIZLLL.LIZIZ();
        c481220Iu0.LIZ(c19egLJ, c1106210etPLIZLLL, interfaceC1372610lp5);
        return Unit.LIZ;
    }

    public static final Object invoke$98(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        LiveNewAudienceEndFragment liveNewAudienceEndFragment = (LiveNewAudienceEndFragment) aObjectS350S0100000_7.l0;
        if (!liveNewAudienceEndFragment.LLLF) {
            if (liveNewAudienceEndFragment.LLLIIIL) {
                if (liveNewAudienceEndFragment.mStatusViewValid && liveNewAudienceEndFragment.LLLIIL) {
                    liveNewAudienceEndFragment.dS();
                }
            } else {
                liveNewAudienceEndFragment.LLLF = true;
                C786410Ut5.LJLLLLLL(0, liveNewAudienceEndFragment.LLJI);
                return obj;
            }
        }
        return obj;
    }

    public static final Object invoke$99(AObjectS350S0100000_7 aObjectS350S0100000_7, Object obj) {
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS350S0100000_7.l0;
        C0KX8 c0kx8 = (C0KX8) obj;
        if (c0kx8.LIZJ && TextUtils.equals(c0kx8.LJI, "STICKERS")) {
            interfaceC1103130eoR.setAlpha(0.34f);
        }
        return Unit.LIZ;
    }

    public AObjectS350S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
