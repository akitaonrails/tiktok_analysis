package Y;

import X.AbstractC1090290eTj;
import X.AbstractC1095150ebZ;
import X.AbstractC1106180etM;
import X.AbstractC1110800f0o;
import X.AbstractC1136060ffY;
import X.AbstractC467020ITc;
import X.AbstractC509530JyZ;
import X.C00FN;
import X.C011Z;
import X.C087500Un;
import X.C087600Uo;
import X.C0IF2;
import X.C0II9;
import X.C0IJT;
import X.C0IKG;
import X.C0IKQ;
import X.C0IMR;
import X.C0IRS;
import X.C0J3Y;
import X.C0KVO;
import X.C0TZM;
import X.C0UE0;
import X.C0WIY;
import X.C1077790e9Z;
import X.C1081050eEp;
import X.C1081600eFi;
import X.C1082840eHi;
import X.C1082930eHr;
import X.C1084430eKH;
import X.C1084590eKX;
import X.C1084600eKY;
import X.C1085000eLC;
import X.C1086100eMy;
import X.C1086600eNm;
import X.C1088240eQQ;
import X.C1090930eUl;
import X.C1094740eau;
import X.C1096340edU;
import X.C1099200ei6;
import X.C1099820ej6;
import X.C1106110etF;
import X.C1109500eyi;
import X.C1109770ez9;
import X.C1110310f01;
import X.C1110490f0J;
import X.C1110530f0N;
import X.C1111930f2d;
import X.C1111960f2g;
import X.C1112390f3N;
import X.C1113460f56;
import X.C1114120f6A;
import X.C1114360f6Y;
import X.C1114720f78;
import X.C1115360f8A;
import X.C1115500f8O;
import X.C1123980fM4;
import X.C1124880fNW;
import X.C1124940fNc;
import X.C1136380fg4;
import X.C1136460fgC;
import X.C1136560fgM;
import X.C1139460fl2;
import X.C1139470fl3;
import X.C1161920gLG;
import X.C12ES;
import X.C1338270kvh;
import X.C16F5;
import X.C181500mr;
import X.C1850730yGF;
import X.C19EG;
import X.C19GN;
import X.C19ME;
import X.C20441214yg;
import X.C20586115gx;
import X.C20743416Fc;
import X.C21538619Qy;
import X.C2188811AlT;
import X.C314780CVo;
import X.C427340GpI;
import X.C443120HZe;
import X.C465520INi;
import X.C466200IPy;
import X.C466230IQb;
import X.C473410IhP;
import X.C474500IjA;
import X.C475530Ikp;
import X.C481340IuC;
import X.C485730J3b;
import X.C485760J3e;
import X.C486790J7d;
import X.C494680Jac;
import X.C496500JdY;
import X.C497740JfY;
import X.C500260Jjc;
import X.C508910JxZ;
import X.C781550UlF;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.C936530aTj;
import X.C937450aVD;
import X.C945320ahu;
import X.C956380azk;
import X.DialogC19728412Gs;
import X.EnumC1083260eIO;
import X.EnumC1087640ePS;
import X.EnumC1096020ecy;
import X.EnumC1107860ew4;
import X.EnumC1112150f2z;
import X.EnumC464630IJx;
import X.EnumC485780J3g;
import X.EnumC755280Tjy;
import X.EnumC918970a1P;
import X.InterfaceC1078490eAh;
import X.InterfaceC1096360edW;
import X.InterfaceC1100800ekg;
import X.InterfaceC1106030et7;
import X.InterfaceC1112050f2p;
import X.InterfaceC1112060f2q;
import X.InterfaceC1112100f2u;
import X.InterfaceC1124060fMC;
import X.InterfaceC2262081DgM;
import X.RunnableC469290Ial;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.LiveCommentPreloadDrawableEmojiSetting;
import com.bytedance.android.live.BarrageAdjustmentEvent;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.AudienceCountChannel;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.dynamicstrategy.RoomBaseInfoParamsChannel;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.GiftDialogStatusChangeEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.NormalGiftDisplayStatusEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.poll.ILiveNormalPollViewModel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.event.BottomMaskForceHiddenEvent;
import com.bytedance.android.live.publicscreen.impl.setting.LivePublicScreenSelfCommentUpdateOptSetting;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotController;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.comment.emoji.LiveCommentPanelEmojiListSetting;
import com.bytedance.android.livesdk.comment.emoji.OnlineDrawableEmojiResourceManager;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenType;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimOptimizedWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting;
import com.bytedance.android.livesdk.livesetting.LiveUserNameClearScreenOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevertFollowButton;
import com.bytedance.android.livesdk.livesetting.model.DrawerLoadOpt;
import com.bytedance.android.livesdk.livesetting.other.IncreaseSDKRegistrationOptimize;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTipsMigrateStrategyFrameworkSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfigOpt;
import com.bytedance.android.livesdk.livesetting.other.LiveTooltipNudgeShareGuideSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveLastNPerfFeatureSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveQuickReturnOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveScaleNativeBannerSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveFollowBigWordModeOptEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProTimeExpSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LivePublicScreenEmoteLoadResilienceSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerLoadOptSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.performance.RealtimePerfScoreSettings;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget;
import com.bytedance.android.livesdk.toolbar.LiveToolbarWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.UserInfoLikeHelper;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdk.watch.chatroom.portrait.TopMaskForceHiddenEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import debugtool.DebugToolsHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS157S0101000_17;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS360S0100000_17 implements Function1 {
    public final int $t;
    public Object l0;

    public static final Object invoke$15(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        return SlotBarrageWidget.C1((SlotBarrageWidget) aObjectS360S0100000_17.l0, (BarrageMessage) obj);
    }

    public static final Object invoke$48(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        return AbsAudienceInteractionFragment.PS((AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0, (C443120HZe) obj);
    }

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
            case 107:
                return invoke$107(this, obj);
            case 108:
                return invoke$108(this, obj);
            case 109:
                return invoke$109(this, obj);
            case 110:
                return invoke$110(this, obj);
            case 111:
                return invoke$111(this, obj);
            case 112:
                return invoke$112(this, obj);
            case 113:
                return invoke$113(this, obj);
            case 114:
                return invoke$114(this, obj);
            case 115:
                return invoke$115(this, obj);
            case 116:
                return invoke$116(this, obj);
            case 117:
                return invoke$117(this, obj);
            case 118:
                return invoke$118(this, obj);
            case 119:
                return invoke$119(this, obj);
            case 120:
                return invoke$120(this, obj);
            case 121:
                return invoke$121(this, obj);
            case 122:
                return invoke$122(this, obj);
            case 123:
                return invoke$123(this, obj);
            case 124:
                return invoke$124(this, obj);
            case 125:
                return invoke$125(this, obj);
            case 126:
                return invoke$126(this, obj);
            case 127:
                return invoke$127(this, obj);
            case 128:
                return invoke$128(this, obj);
            case 129:
                return invoke$129(this, obj);
            case 130:
                return invoke$130(this, obj);
            case 131:
                return invoke$131(this, obj);
            case 132:
                return invoke$132(this, obj);
            case 133:
                return invoke$133(this, obj);
            case 134:
                return invoke$134(this, obj);
            case 135:
                return invoke$135(this, obj);
            case 136:
                return invoke$136(this, obj);
            case 137:
                return invoke$137(this, obj);
            case 138:
                return invoke$138(this, obj);
            case 139:
                return invoke$139(this, obj);
            case 140:
                return invoke$140(this, obj);
            case 141:
                return invoke$141(this, obj);
            case 142:
                return invoke$142(this, obj);
            case 143:
                return invoke$143(this, obj);
            case 144:
                return invoke$144(this, obj);
            case 145:
                return invoke$145(this, obj);
            case 146:
                return invoke$146(this, obj);
            case 147:
                return invoke$147(this, obj);
            case 148:
                return invoke$148(this, obj);
            case 149:
                return invoke$149(this, obj);
            case 150:
                return invoke$150(this, obj);
            case 151:
                return invoke$151(this, obj);
            case 152:
                return invoke$152(this, obj);
            case 153:
                return invoke$153(this, obj);
            case 154:
                return invoke$154(this, obj);
            case 155:
                return invoke$155(this, obj);
            case 156:
                return invoke$156(this, obj);
            case 157:
                return invoke$157(this, obj);
            case 158:
                return invoke$158(this, obj);
            case 159:
                return invoke$159(this, obj);
            case 160:
                return invoke$160(this, obj);
            case 161:
                return invoke$161(this, obj);
            case 162:
                return invoke$162(this, obj);
            case 163:
                return invoke$163(this, obj);
            case 164:
                return invoke$164(this, obj);
            case 165:
                return invoke$165(this, obj);
            case 166:
                return invoke$166(this, obj);
            case 167:
                return invoke$167(this, obj);
            case 168:
                return invoke$168(this, obj);
            case 169:
                return invoke$169(this, obj);
            case 170:
                return invoke$170(this, obj);
            default:
                return null;
        }
    }

    public AObjectS360S0100000_17(C1111930f2d c1111930f2d, int i) {
        this.$t = i;
        switch (i) {
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
                this.l0 = c1111930f2d;
                break;
            case 120:
            default:
                this.l0 = c1111930f2d;
                break;
        }
    }

    public static final Object invoke$0(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = (LiveRoomNotifyWidget) aObjectS360S0100000_17.l0;
        C1081050eEp c1081050eEp = (C1081050eEp) obj;
        int i = LiveRoomNotifyWidget.LLJZIJLIL;
        if (liveRoomNotifyWidget.isShowing() && c1081050eEp.LIZ) {
            if (!liveRoomNotifyWidget.LLJL) {
                liveRoomNotifyWidget.LLJL = true;
                liveRoomNotifyWidget.LLJJLIIIJLLLLLLLZ = liveRoomNotifyWidget.getView().getAlpha();
            }
            C786410Ut5.T4(liveRoomNotifyWidget.getView(), 0.0f);
        } else if (liveRoomNotifyWidget.LLJJLIIIJLLLLLLLZ >= 0.0f && liveRoomNotifyWidget.getView().getAlpha() != liveRoomNotifyWidget.LLJJLIIIJLLLLLLLZ) {
            C786410Ut5.T4(liveRoomNotifyWidget.getView(), liveRoomNotifyWidget.LLJJLIIIJLLLLLLLZ);
            liveRoomNotifyWidget.LLJL = false;
            liveRoomNotifyWidget.LLJJLIIIJLLLLLLLZ = -1.0f;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        DataChannel dataChannel;
        Long lValueOf;
        LiveRoomNotifyWidget liveRoomNotifyWidget = (LiveRoomNotifyWidget) aObjectS360S0100000_17.l0;
        RoomNotifyMessage roomNotifyMessage = (RoomNotifyMessage) obj;
        if (!liveRoomNotifyWidget.LLJLIL || (((dataChannel = liveRoomNotifyWidget.dataChannel) != null && Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class))) || ((lValueOf = Long.valueOf(roomNotifyMessage.from_user_id)) != null && lValueOf.longValue() == UserService.getInstance().user().getCurrentUserId()))) {
            liveRoomNotifyWidget.E1(roomNotifyMessage);
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        View view;
        SlotBarrageWidget slotBarrageWidget = (SlotBarrageWidget) aObjectS360S0100000_17.l0;
        if (slotBarrageWidget.LLILZIL && (view = slotBarrageWidget.LLILLJJLI) != null && view.getVisibility() == 4) {
            slotBarrageWidget.J1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$100(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C20586115gx c20586115gx;
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        Boolean bool = (Boolean) obj;
        if (commentWidget.LLLLII != null) {
            if (bool.booleanValue()) {
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = commentWidget.LLLLII;
                if (liveEmojiInputDialogFragment.LLILLJJLI && (c20586115gx = liveEmojiInputDialogFragment.LLJLILLLLZIIL) != null) {
                    c20586115gx.requestFocus();
                    KeyBoardUtil.LIZLLL(liveEmojiInputDialogFragment.getContext(), liveEmojiInputDialogFragment.LLJLILLLLZIIL);
                }
            } else {
                commentWidget.LLLLII.RR();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$101(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        C1113460f56 c1113460f56 = (C1113460f56) obj;
        commentWidget.getClass();
        if (c1113460f56 != null) {
            String str = c1113460f56.LIZ;
            ISendCommentEvent.Sender sender = c1113460f56.LIZIZ;
            if (sender == null) {
                sender = ISendCommentEvent.Sender.COMMENTWIDGET;
            }
            commentWidget.S1(str, null, false, false, 0, sender, null, null, 0L, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$102(Y.AObjectS360S0100000_17 r4, java.lang.Object r5) {
        /*
            java.lang.Object r4 = r4.l0
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r4 = (com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget) r4
            X.0K6y r5 = (X.C512220K6y) r5
            r1 = 1
            if (r5 == 0) goto L4c
            r4.getClass()
            boolean r0 = r5.LIZIZ
            if (r0 == 0) goto L4c
            r4.LLLJL = r1
        L12:
            r4.z1(r1)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r1 = r0.user()
            java.lang.String r0 = "CommentWidget_SubscribeSuccessEvent"
            X.11Kz r3 = r1.LJIIL(r0)
            Y.AfS138S0000000_16 r2 = new Y.AfS138S0000000_16
            r0 = 13
            r2.<init>(r0)
            Y.AfS138S0000000_16 r1 = new Y.AfS138S0000000_16
            r0 = 14
            r1.<init>(r0)
            r3.LJJIIZ(r2, r1)
            boolean r0 = r4.M1()
            if (r0 == 0) goto L49
            boolean r0 = r4.LLLILZ
            if (r0 == 0) goto L49
            com.bytedance.android.live.design.view.icon.LiveIconView r0 = r4.LLILLJJLI
            if (r0 == 0) goto L49
            com.bytedance.android.live.design.view.icon.LiveIconView r1 = r4.LLILLJJLI
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C786410Ut5.i5(r1, r0)
        L49:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4c:
            r4.o2()
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS360S0100000_17.invoke$102(Y.AObjectS360S0100000_17, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: Exception -> 0x0083, TryCatch #0 {Exception -> 0x0083, blocks: (B:13:0x0030, B:15:0x0038, B:17:0x003c, B:19:0x0040, B:20:0x0057, B:22:0x005d, B:24:0x0069, B:25:0x006f), top: B:34:0x0030 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$103(Y.AObjectS360S0100000_17 r5, java.lang.Object r6) {
        /*
            java.lang.Object r4 = r5.l0
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r4 = (com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget) r4
            X.0KXH r6 = (X.C0KXH) r6
            boolean r0 = r4.isViewValid()
            if (r0 == 0) goto L8a
            boolean r0 = r4.LLJJIJI
            if (r0 != 0) goto L8a
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<X.0f76> r0 = X.C1114700f76.class
            r1.SX0(r0, r6)
            boolean r0 = r6.LIZ
            if (r0 == 0) goto L2a
            com.bytedance.android.livesdk.chatroom.model.InputAttrs r1 = r4.LLLLIIL
            java.lang.String r0 = ""
            r1.input = r0
            com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper r0 = r1.emoteFixTextHelperForText
            if (r0 == 0) goto L2a
            java.util.ArrayList<com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper$EmoteText> r0 = r0.textList
            r0.clear()
        L2a:
            boolean r0 = r4.J1()
            if (r0 == 0) goto L74
            com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment r5 = r4.LLLLII     // Catch: java.lang.Exception -> L83
            boolean r0 = r5.isAdded()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            boolean r0 = r5.LLJILLL     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L6f
            boolean r0 = r6.LIZ     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L87
        L40:
            boolean r0 = r6.LIZ     // Catch: java.lang.Exception -> L83
            r5.LLJILLL = r0     // Catch: java.lang.Exception -> L83
            boolean r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L83
            r5.LLJJ = r0     // Catch: java.lang.Exception -> L83
            long r0 = r6.LIZJ     // Catch: java.lang.Exception -> L83
            r5.LLJJI = r0     // Catch: java.lang.Exception -> L83
            r5.aS()     // Catch: java.lang.Exception -> L83
            java.util.List<X.0f7i> r0 = r5.LLLLIILL     // Catch: java.lang.Exception -> L83
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L83
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Exception -> L83
        L57:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> L83
            X.0f7i r2 = (X.AbstractC1115080f7i) r2     // Catch: java.lang.Exception -> L83
            boolean r1 = r5.LLJILLL     // Catch: java.lang.Exception -> L83
            boolean r0 = r2.LJIIJ     // Catch: java.lang.Exception -> L83
            if (r0 == r1) goto L57
            r2.LJIIJ = r1     // Catch: java.lang.Exception -> L83
            r2.LIZ()     // Catch: java.lang.Exception -> L83
            goto L57
        L6f:
            boolean r0 = r6.LIZ     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L40
            goto L87
        L74:
            com.bytedance.android.livesdk.chatroom.model.InputAttrs r2 = r4.LLLLIIL
            boolean r0 = r6.LIZ
            r2.isUserBanned = r0
            boolean r0 = r6.LIZIZ
            r2.isUserBannedWholeLive = r0
            long r0 = r6.LIZJ
            r2.mutedDuration = r0
            goto L87
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L87:
            r4.p2()
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS360S0100000_17.invoke$103(Y.AObjectS360S0100000_17, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$104(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            commentWidget.hide();
        } else {
            commentWidget.show();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$105(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((CommentWidget) aObjectS360S0100000_17.l0).G1();
        return Unit.LIZ;
    }

    public static final Object invoke$106(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((CommentWidget) aObjectS360S0100000_17.l0).G1();
        return Unit.LIZ;
    }

    public static final Object invoke$107(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        DialogC19728412Gs dialogC19728412Gs = commentWidget.LLL;
        if (dialogC19728412Gs != null) {
            dialogC19728412Gs.dismiss();
            C785410UrT.LIZ(dialogC19728412Gs);
            commentWidget.LLL = null;
        }
        C19GN c19gn = commentWidget.LLLIILIL;
        if (c19gn != null) {
            c19gn.dismiss();
            C785410UrT.LIZ(c19gn);
            commentWidget.LLLIILIL = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$108(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        String str = (String) obj;
        if (str != null) {
            if (a0.LJJIIZI(str, "live_cross_screen_gift_sei", false)) {
                C1139460fl2.LJIJ("receive SEI; key: live_cross_screen_gift_sei");
                C1136380fg4.LIZ.getClass();
                Iterator it2 = C1136380fg4.LJ(str).iterator();
                while (it2.hasNext()) {
                    ((C1139460fl2) aObjectS360S0100000_17.l0).LJIIZILJ((C1136560fgM) it2.next());
                }
            } else if (a0.LJJIIZI(str, "live_cross_screen_first_frame_sei", false)) {
                C1139460fl2.LJIJ("receive SEI; key: live_cross_screen_first_frame_sei");
                C1136460fgC.LIZ.getClass();
                C1136460fgC.LJIJI(str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$109(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        c1111930f2d.getClass();
        if (obj == EnumC464630IJx.PAY_SUCCESS && !((ArrayList) c1111930f2d.LLJLLIL).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c1111930f2d.LLJLLIL);
            ((ArrayList) c1111930f2d.LLJLLIL).clear();
            c1111930f2d.LJJLIIIJ(arrayList);
            return null;
        }
        return null;
    }

    public static final Object invoke$11(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((SlotBarrageWidget) aObjectS360S0100000_17.l0).F1((AbstractC1090290eTj) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$110(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        int i;
        RoomMessage roomMessageLJ;
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        if (c1111930f2d.LLLLLJIL != null) {
            if (InterfaceC1106030et7.G5.LIZIZ().booleanValue()) {
                i = 2131851915;
            } else {
                i = 2131851914;
            }
            String strLJIJI = C497740JfY.LJIJI(i);
            if (strLJIJI != null && (roomMessageLJ = C181500mr.LJ(c1111930f2d.LLLLLJIL.getId(), strLJIJI)) != null) {
                c1111930f2d.LLLLLZ.LIZIZ(new ARunnableS86S0200000_17(c1111930f2d, roomMessageLJ, 56));
            }
        }
        return null;
    }

    public static final Object invoke$111(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        Pair pair = (Pair) obj;
        c1111930f2d.getClass();
        long jLongValue = ((Long) pair.getFirst()).longValue();
        long jLongValue2 = ((Long) pair.getSecond()).longValue();
        if (jLongValue > 0) {
            c1111930f2d.LJIIJ(0, jLongValue, jLongValue2);
            return null;
        }
        return null;
    }

    public static final Object invoke$112(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1111930f2d) aObjectS360S0100000_17.l0).LJLI((BottomMessage) obj);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$113(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        C0WIY c0wiy = (C0WIY) obj;
        c1111930f2d.getClass();
        if (c0wiy.LIZ != 0 && c0wiy.LIZIZ != 0 && c1111930f2d.mView != 0 && c1111930f2d.LLLJL != null) {
            int iLJFF = c1111930f2d.LLJLL.LJFF();
            while (true) {
                iLJFF--;
                if (iLJFF < 0) {
                    break;
                }
                InterfaceC1112060f2q interfaceC1112060f2qLIZJ = c1111930f2d.LLJLL.LIZJ(iLJFF);
                if ((interfaceC1112060f2qLIZJ instanceof AbstractC1110800f0o) && ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL.getMessageId() == ((AbstractC1136060ffY) c0wiy.LIZ).getMessageId()) {
                    if (interfaceC1112060f2qLIZJ instanceof C1110490f0J) {
                        Set<Long> set = C087500Un.LIZ;
                        C087500Un.LIZ.remove(Long.valueOf(((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL.baseMessage.messageId));
                    }
                    c1111930f2d.LJZL(iLJFF, c1111930f2d.LJJLIIIJILLIZJL((AbstractC1136060ffY) c0wiy.LIZIZ), null);
                }
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$114(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) obj;
        int iLJFF = c1111930f2d.LLJLL.LJFF() - 1;
        while (true) {
            if (iLJFF < 0) {
                break;
            }
            InterfaceC1112060f2q interfaceC1112060f2qLIZJ = c1111930f2d.LLJLL.LIZJ(iLJFF);
            if ((interfaceC1112060f2qLIZJ instanceof AbstractC1110800f0o) && ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL.getMessageId() == abstractC1136060ffY.getMessageId()) {
                if (interfaceC1112060f2qLIZJ instanceof C1110310f01) {
                    Set<Long> set = C087600Uo.LIZ;
                    C087600Uo.LIZ.remove(Long.valueOf(((ChatMessage) ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL).chatId));
                }
                interfaceC1112060f2qLIZJ.dispose();
                int iLJI = c1111930f2d.LLJLL.LJI(interfaceC1112060f2qLIZJ);
                c1111930f2d.LLJLL.LJII(interfaceC1112060f2qLIZJ);
                T t = c1111930f2d.mView;
                if (t != 0 && iLJI != -1) {
                    ((InterfaceC1112050f2p) t).Wd0(iLJI);
                }
            } else {
                iLJFF--;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$115(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) obj;
        int iLJFF = c1111930f2d.LLJLL.LJFF() - 1;
        while (true) {
            if (iLJFF < 0) {
                break;
            }
            InterfaceC1112060f2q interfaceC1112060f2qLIZJ = c1111930f2d.LLJLL.LIZJ(iLJFF);
            if ((interfaceC1112060f2qLIZJ instanceof AbstractC1110800f0o) && ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL.getMessageId() == abstractC1136060ffY.getMessageId()) {
                if (interfaceC1112060f2qLIZJ instanceof C1110490f0J) {
                    Set<Long> set = C087500Un.LIZ;
                    C087500Un.LIZ.remove(Long.valueOf(((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL.baseMessage.messageId));
                }
                interfaceC1112060f2qLIZJ.dispose();
                int iLJI = c1111930f2d.LLJLL.LJI(interfaceC1112060f2qLIZJ);
                c1111930f2d.LLJLL.LJII(interfaceC1112060f2qLIZJ);
                T t = c1111930f2d.mView;
                if (t != 0 && iLJI != -1) {
                    ((InterfaceC1112050f2p) t).Wd0(iLJI);
                }
            } else {
                iLJFF--;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$116(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        Integer num = (Integer) obj;
        c1111930f2d.getClass();
        if (num.intValue() > 0) {
            c1111930f2d.LLF(num.intValue());
            return null;
        }
        return null;
    }

    public static final Object invoke$117(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        if (c1111930f2d.LL != null && c1111930f2d.LLLJL != null) {
            if (obj == EnumC1083260eIO.SHOW) {
                DataChannel dataChannel = c1111930f2d.dataChannel;
                if (dataChannel == null) {
                    return Unit.LIZ;
                }
                Object objGg0 = dataChannel.gg0(LiveExtendedScreenType.class);
                EnumC1112150f2z enumC1112150f2zLJLZ = c1111930f2d.LJLZ();
                if (c1111930f2d.LIZ()) {
                    c1111930f2d.start(8);
                } else {
                    c1111930f2d.QA0(8);
                }
                if (objGg0 == enumC1112150f2zLJLZ) {
                    c1111930f2d.LL.LJIILL();
                    c1111930f2d.LLLJL.LJIJJLI = true;
                } else {
                    c1111930f2d.LL.LJIILIIL();
                    c1111930f2d.LLLJL.LJIJJLI = false;
                }
            } else if (obj == EnumC1083260eIO.HIDE) {
                if (c1111930f2d.LIZ()) {
                    c1111930f2d.QA0(8);
                    c1111930f2d.LL.LJIILIIL();
                    c1111930f2d.LLLJL.LJIJJLI = false;
                } else {
                    c1111930f2d.start(8);
                    c1111930f2d.LL.LJIILL();
                    c1111930f2d.LLLJL.LJIJJLI = true;
                }
            } else if (obj == EnumC1083260eIO.DRAGGING) {
                c1111930f2d.start(8);
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$118(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        Boolean bool = (Boolean) obj;
        c1111930f2d.getClass();
        c1111930f2d.LLLLLIL = bool.booleanValue();
        c1111930f2d.LLLLLILLIL = bool.booleanValue();
        return null;
    }

    public static final Object invoke$119(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        if (c1111930f2d.LL != null && c1111930f2d.LLLJL != null) {
            if (obj == c1111930f2d.LJLZ()) {
                c1111930f2d.LL.LJIILL();
                c1111930f2d.LLLJL.LJIJJLI = true;
            } else {
                c1111930f2d.LL.LJIILIIL();
                c1111930f2d.LLLJL.LJIJJLI = false;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((SlotBarrageWidget) aObjectS360S0100000_17.l0).E1((AbstractC1095150ebZ) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$120(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111960f2g c1111960f2g = ((C1111930f2d) aObjectS360S0100000_17.l0).LLZ;
        int iIntValue = ((Integer) obj).intValue();
        if (c1111960f2g.LIZIZ()) {
            c1111960f2g.LJII.add(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$121(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        Integer num = (Integer) obj;
        c1111930f2d.getClass();
        if (num.intValue() > 0) {
            c1111930f2d.LLF(num.intValue());
            if (c1111930f2d.LLZL > 0 && c1111930f2d.LLLLILI) {
                c1111930f2d.LLLLLZ.LIZIZ.removeCallbacks(c1111930f2d.LLZLI);
                c1111930f2d.LLLLLZ.LIZIZ.removeCallbacks(c1111930f2d.LLZLL);
                c1111930f2d.LLLLLZ.LIZ(c1111930f2d.LLJILJILJ, c1111930f2d.LLZLL);
                c1111930f2d.LJLLLL(c1111930f2d.LLJIJIL);
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$122(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        c1111930f2d.getClass();
        if (((Boolean) obj).booleanValue()) {
            c1111930f2d.QA0(2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$123(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1111930f2d) aObjectS360S0100000_17.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$124(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        RecycleSource recycleSource;
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        User user = (User) obj;
        if (!c1111930f2d.LLLJL.LJI && c1111930f2d.LLLZIIL && (recycleSource = c1111930f2d.LLLZL) != null && recycleSource == RecycleSource.FROM_ROOM_CHANGE && !c1111930f2d.LLLLZLLLI) {
            c1111930f2d.LLLLZLLLI = true;
            long j = c1111930f2d.LLLLZLLIL.delay;
            if (j > 0) {
                C786410Ut5.LJLIIL(j, c1111930f2d.LLLLLZ.LIZ, new ARunnableS86S0200000_17(c1111930f2d, user, 60));
            } else {
                Room room = c1111930f2d.LLLLLJIL;
                c1111930f2d.LLLLLZ.LIZIZ(new ARunnableS10S0310000_17(C181500mr.LIZLLL(room.decisions, room.getId(), user, c1111930f2d.LLLZ, c1111930f2d.LLLZI), null, c1111930f2d, false, 2));
                return null;
            }
        }
        return null;
    }

    public static final Object invoke$125(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1111930f2d) aObjectS360S0100000_17.l0).LLLZZIL = (Boolean) obj;
        return null;
    }

    public static final Object invoke$126(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111960f2g c1111960f2g = ((C1111930f2d) aObjectS360S0100000_17.l0).LLZ;
        int iIntValue = ((Integer) obj).intValue();
        if (c1111960f2g.LIZIZ()) {
            c1111960f2g.LJII.add(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0f00] */
    public static final Object invoke$127(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS360S0100000_17.l0;
        C0WIY c0wiy = (C0WIY) obj;
        c1111930f2d.getClass();
        if (c0wiy.LIZ != 0 && c0wiy.LIZIZ != 0 && c1111930f2d.mView != 0 && c1111930f2d.LLLJL != null) {
            int iLJFF = c1111930f2d.LLJLL.LJFF();
            while (true) {
                iLJFF--;
                if (iLJFF < 0) {
                    break;
                }
                InterfaceC1112060f2q interfaceC1112060f2qLIZJ = c1111930f2d.LLJLL.LIZJ(iLJFF);
                if ((interfaceC1112060f2qLIZJ instanceof AbstractC1110800f0o) && ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL.getMessageId() == ((AbstractC1136060ffY) c0wiy.LIZ).getMessageId()) {
                    if (interfaceC1112060f2qLIZJ instanceof C1110310f01) {
                        Set<Long> set = C087600Uo.LIZ;
                        C087600Uo.LIZ.remove(Long.valueOf(((ChatMessage) ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL).chatId));
                    }
                    if (LivePublicScreenSelfCommentUpdateOptSetting.INSTANCE.isAvatarOptEnabled()) {
                        c1111930f2d.LJZL(iLJFF, c1111930f2d.LJJLIIIJILLIZJL((AbstractC1136060ffY) c0wiy.LIZIZ), new Object() { // from class: X.0f00
                        });
                    } else {
                        c1111930f2d.LJZL(iLJFF, c1111930f2d.LJJLIIIJILLIZJL((AbstractC1136060ffY) c0wiy.LIZIZ), null);
                    }
                }
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$128(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        if (liveRoomUserInfoWidget.LLLIIL.getVisibility() == 0) {
            liveRoomUserInfoWidget.V2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$129(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aObjectS360S0100000_17.l0;
        C0KVO c0kvo = (C0KVO) obj;
        int i = ClearScreenUserInfoWidget.l0;
        clearScreenUserInfoWidget.getClass();
        boolean z = c0kvo.LIZ;
        if (((c0kvo.LIZJ instanceof C475530Ikp) && z) || z == clearScreenUserInfoWidget.Z) {
            return null;
        }
        clearScreenUserInfoWidget.Z = z;
        clearScreenUserInfoWidget.Z2();
        boolean z2 = c0kvo.LIZJ.LIZIZ;
        if (clearScreenUserInfoWidget.Z) {
            clearScreenUserInfoWidget.f319X = clearScreenUserInfoWidget.LLLIIII.getMeasuredWidth();
            clearScreenUserInfoWidget.f320Y = clearScreenUserInfoWidget.LLLIIII.getMeasuredHeight();
            clearScreenUserInfoWidget.f0 = clearScreenUserInfoWidget.LLJ.getVisibility();
            clearScreenUserInfoWidget.g0 = clearScreenUserInfoWidget.LLJJIJI.getVisibility();
            clearScreenUserInfoWidget.f322h0 = clearScreenUserInfoWidget.LLLIIII.getVisibility();
            clearScreenUserInfoWidget.f323i0 = clearScreenUserInfoWidget.LLJJJJLIIL.getVisibility();
            clearScreenUserInfoWidget.j0 = clearScreenUserInfoWidget.LLJLL.getVisibility();
            clearScreenUserInfoWidget.LLL = clearScreenUserInfoWidget.LLJLILLLLZIIL.getVisibility();
            if (LiveUserNameClearScreenOptSetting.INSTANCE.enable()) {
                clearScreenUserInfoWidget.f324k0 = clearScreenUserInfoWidget.LLJIJIL.getMaxWidth();
            }
            if (z2) {
                clearScreenUserInfoWidget.d3();
            } else {
                new AnimatorSet();
                if (clearScreenUserInfoWidget.f322h0 == 8) {
                    clearScreenUserInfoWidget.Y2();
                } else {
                    clearScreenUserInfoWidget.Y2();
                    C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLJ);
                    C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLJJIJI);
                    C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLJJJJLIIL);
                    C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLJLILLLLZIIL);
                    C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLJLL);
                    ViewGroup viewGroup = clearScreenUserInfoWidget.a0;
                    if (viewGroup != null) {
                        C786410Ut5.bd(0.0f, viewGroup);
                    }
                }
                clearScreenUserInfoWidget.f3(false);
                C1096340edU c1096340edU = clearScreenUserInfoWidget.LLLZ;
                if (c1096340edU != null) {
                    c1096340edU.LJJIIJ = true;
                    ImageView imageView = c1096340edU.LJJIIJZLJL;
                    if (imageView != null) {
                        C12ES.LJIILL(8, imageView);
                    }
                }
                clearScreenUserInfoWidget.W2(true);
                C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLIZ);
                C500260Jjc.LJIILIIL(clearScreenUserInfoWidget.LLILZIL);
                clearScreenUserInfoWidget.P2();
                clearScreenUserInfoWidget.G1(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_clear_screen_anchor_show");
            c474500IjALIZ.LJJII(c0kvo.LIZIZ, "clear_type");
            c474500IjALIZ.LJIJJLI(clearScreenUserInfoWidget.dataChannel);
            c474500IjALIZ.LIZ();
            return null;
        }
        clearScreenUserInfoWidget.e3();
        return null;
    }

    public static final Object invoke$13(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((SlotBarrageWidget) aObjectS360S0100000_17.l0).getClass();
        SlotBarrageWidget.G1((C1090930eUl) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$130(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        if (liveRoomUserInfoWidget.LLLIIL.getVisibility() == 0) {
            liveRoomUserInfoWidget.V2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$131(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.z2();
        return Unit.LIZ;
    }

    public static final Object invoke$132(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        liveRoomUserInfoWidget.R2(liveRoomUserInfoWidget.LLLLLLLLL + 1);
        if (LiveProTimeExpSetting.INSTANCE.getValue() != 0) {
            liveRoomUserInfoWidget.E1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$133(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        liveRoomUserInfoWidget.x2(((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$134(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C427340GpI c427340GpI;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        Boolean bool = (Boolean) obj;
        if (C500260Jjc.LJJJJIZL(liveRoomUserInfoWidget.LLJJJ)) {
            c427340GpI = liveRoomUserInfoWidget.LLJJJ;
        } else if (C500260Jjc.LJJJJIZL(liveRoomUserInfoWidget.LLJJJJLIIL)) {
            c427340GpI = liveRoomUserInfoWidget.LLJJJJLIIL;
        } else if (C500260Jjc.LJJJJIZL(liveRoomUserInfoWidget.LLJLLL)) {
            c427340GpI = liveRoomUserInfoWidget.LLJLLL;
        } else {
            c427340GpI = null;
        }
        if (bool.booleanValue()) {
            liveRoomUserInfoWidget.LLLLZ.LIZLLL = true;
            if (c427340GpI != null) {
                c427340GpI.LJJJJIZL();
            }
            UserInfoLikeHelper userInfoLikeHelper = liveRoomUserInfoWidget.LLLLZLL;
            if (userInfoLikeHelper != null) {
                userInfoLikeHelper.LLJI = true;
            }
        } else {
            C1099200ei6 c1099200ei6 = liveRoomUserInfoWidget.LLLLZ;
            C786410Ut5.LJLIIL(2000L, c1099200ei6.LIZ, c1099200ei6.LJFF);
            UserInfoLikeHelper userInfoLikeHelper2 = liveRoomUserInfoWidget.LLLLZLL;
            if (userInfoLikeHelper2 != null) {
                userInfoLikeHelper2.LLJI = false;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$135(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        String string;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        C496500JdY c496500JdY = (C496500JdY) obj;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        if (c496500JdY.LIZ == 1) {
            if (!c496500JdY.LIZJ) {
                BorderInfo borderInfo = c496500JdY.LIZIZ;
                Boolean bool = Boolean.FALSE;
                liveRoomUserInfoWidget.Q2(borderInfo, bool, bool);
            } else if (liveRoomUserInfoWidget.LLLLLZIL != null && liveRoomUserInfoWidget.LLLLZ != null && liveRoomUserInfoWidget.dataChannel != null) {
                C16F5 c16f5 = liveRoomUserInfoWidget.LLJIJIL;
                if (c16f5 != null) {
                    string = c16f5.getText().toString();
                } else {
                    string = "";
                }
                AObjectS292S0200000_17 aObjectS292S0200000_17 = new AObjectS292S0200000_17(c496500JdY, liveRoomUserInfoWidget, 5);
                AObjectS392S0100000_17 aObjectS392S0100000_17 = new AObjectS392S0100000_17(liveRoomUserInfoWidget, 35);
                if (c496500JdY.LIZLLL && liveRoomUserInfoWidget.LLZLL != null) {
                    liveRoomUserInfoWidget.LLLLZ.LIZJ(10720L, new AObjectS41S1300000_17(liveRoomUserInfoWidget, string, c496500JdY, aObjectS392S0100000_17, 0));
                } else {
                    liveRoomUserInfoWidget.LLLLZ.LIZJ(10720L, new AObjectS41S1300000_17(liveRoomUserInfoWidget, string, c496500JdY, aObjectS292S0200000_17, 1));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$136(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1099200ei6 c1099200ei6;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        C1094740eau c1094740eau = (C1094740eau) obj;
        C1096340edU c1096340edU = liveRoomUserInfoWidget.LLLZ;
        if (c1096340edU != null) {
            InterfaceC1096360edW interfaceC1096360edW = c1096340edU.LJJIJIIJI;
            if (interfaceC1096360edW != null) {
                interfaceC1096360edW.LIZ(c1094740eau);
            }
            InterfaceC1096360edW interfaceC1096360edW2 = c1096340edU.LJJIJ;
            if (interfaceC1096360edW2 != null) {
                interfaceC1096360edW2.LIZ(c1094740eau);
            }
            if (c1096340edU.LJJIJIIJI != null || c1096340edU.LJJIJ != null) {
                return Unit.LIZ;
            }
        }
        if (c1094740eau != null && (c1099200ei6 = liveRoomUserInfoWidget.LLLLZ) != null && liveRoomUserInfoWidget.LLLLILI != null) {
            c1099200ei6.LIZJ(12000L, new AObjectS292S0200000_17(c1094740eau, liveRoomUserInfoWidget, 3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$137(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        C1094740eau c1094740eau = (C1094740eau) obj;
        String str = LiveRoomUserInfoWidget.Q;
        if (c1094740eau != null) {
            C1099200ei6 c1099200ei6 = liveRoomUserInfoWidget.LLLLZ;
            if (c1099200ei6 != null && liveRoomUserInfoWidget.LLLLILI != null) {
                c1099200ei6.LIZJ(12000L, new AObjectS292S0200000_17(c1094740eau, liveRoomUserInfoWidget, 3));
            }
        } else {
            liveRoomUserInfoWidget.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$138(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1096340edU c1096340edU;
        int i;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        if (MultiGuestRevertFollowButton.enable() && (c1096340edU = liveRoomUserInfoWidget.LLLZ) != null && !c1096340edU.LJIJI && !c1096340edU.LJJIIJ && c1096340edU.LJIILL == EnumC1096020ecy.UNFOLLOW) {
            ViewGroup viewGroup = c1096340edU.LJII;
            if (C1096340edU.LJIJI(c1096340edU.LJIJ)) {
                i = 8;
            } else {
                i = 0;
            }
            C12ES.LJIILL(i, viewGroup);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$139(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        UserInfoLikeHelper userInfoLikeHelper = liveRoomUserInfoWidget.LLLLZLL;
        LiveHostAutoAdaptiveParams liveHostAutoAdaptiveParams = LiveHostAutoAdaptiveParams.INSTANCE;
        userInfoLikeHelper.LLIZ = liveHostAutoAdaptiveParams.isDisable("self_like_avatar");
        liveRoomUserInfoWidget.LLLLZLL.LLIZLLLIL = liveHostAutoAdaptiveParams.isDisable("self_like_avatar");
        return Unit.LIZ;
    }

    public static final Object invoke$14(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((SlotBarrageWidget) aObjectS360S0100000_17.l0).D1((C1082930eHr) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$140(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        int iMax;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        C1086100eMy c1086100eMy = (C1086100eMy) obj;
        C19ME c19me = (C19ME) liveRoomUserInfoWidget.LLILZ.getLayoutParams();
        if (c19me.matchConstraintMaxWidth > ((int) C497740JfY.LIZIZ(200.0f))) {
            iMax = c19me.matchConstraintMaxWidth;
        } else {
            int iLJIIZILJ = C497740JfY.LJIIZILJ();
            int iLIZIZ = LiveRoomUserInfoWidget.T;
            int iLIZIZ2 = LiveRoomUserInfoWidget.U;
            if (LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.INSTANCE.enable()) {
                iLIZIZ = (int) C497740JfY.LIZIZ(r6.variableMarginOrDefault(20));
                iLIZIZ2 = (int) C497740JfY.LIZIZ(r6.skylightLeftMarginOrDefault(12));
            }
            float fLIZIZ = (((iLJIIZILJ - iLIZIZ) - iLIZIZ2) - LiveRoomUserInfoWidget.V) - LiveRoomUserInfoWidget.R;
            DataChannel dataChannel = liveRoomUserInfoWidget.dataChannel;
            if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(C1082840eHi.class))) {
                fLIZIZ = (fLIZIZ - LiveRoomUserInfoWidget.S) - ((int) C497740JfY.LIZIZ(r6.skylightRightMarginOrDefault(12)));
            }
            int width = liveRoomUserInfoWidget.LLLIIII.getWidth();
            if (width <= 0) {
                width = (int) C497740JfY.LIZIZ(LiveRoomUserInfoWidget.W);
            }
            if (C011Z.LIZ.LJJII() && LiveFollowBigWordModeOptEnableSetting.INSTANCE.enable()) {
                liveRoomUserInfoWidget.LLLIIII.measure(0, 0);
                width = liveRoomUserInfoWidget.LLLIIII.getMeasuredWidth();
            }
            int iLIZIZ3 = ((int) C497740JfY.LIZIZ(48.0f)) + width + ((int) C497740JfY.LIZIZ(r6.nickNameMinWidthOrDefault(45)));
            if (LiveMainFrameUpdateFontOptSetting.INSTANCE.shrinkFollow()) {
                if (fLIZIZ - iLIZIZ3 < c1086100eMy.LIZ) {
                    liveRoomUserInfoWidget.v2(false);
                } else {
                    liveRoomUserInfoWidget.v2(true);
                }
                liveRoomUserInfoWidget.LLLIIII.measure(0, 0);
                iLIZIZ3 = ((int) C497740JfY.LIZIZ(48.0f)) + liveRoomUserInfoWidget.LLLIIII.getMeasuredWidth() + ((int) C497740JfY.LIZIZ(r6.nickNameMinWidthOrDefault(45)));
            }
            iMax = (int) Math.max(iLIZIZ3, Math.min((int) C497740JfY.LIZIZ(200.0f), fLIZIZ - c1086100eMy.LIZ));
        }
        if (liveRoomUserInfoWidget.LLZZ != iMax) {
            liveRoomUserInfoWidget.LLZZ = iMax;
            C19ME c19me2 = (C19ME) liveRoomUserInfoWidget.LLILZ.getLayoutParams();
            if (c19me2.matchConstraintMaxWidth != iMax) {
                c19me2.matchConstraintMaxWidth = iMax;
                if (LiveFollowBigWordModeOptEnableSetting.INSTANCE.enable()) {
                    liveRoomUserInfoWidget.LLJIJIL.setMaxWidth(iMax);
                }
                C786410Ut5.X5(c19me2, liveRoomUserInfoWidget.LLILZ);
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$141(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS360S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$142(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C481340IuC c481340IuC = ((C1106110etF) aObjectS360S0100000_17.l0).LLJJIII;
        if (c481340IuC != null) {
            c481340IuC.LIZJ("add_to_story", "", null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$143(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1106110etF) aObjectS360S0100000_17.l0).LJIIIIZZ();
        return Unit.LIZ;
    }

    public static final Object invoke$144(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1106110etF) aObjectS360S0100000_17.l0).LJIIIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$145(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1106110etF) aObjectS360S0100000_17.l0).LJIIIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$146(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        Room room;
        C19EG c19eg;
        View view;
        C1106110etF c1106110etF = (C1106110etF) aObjectS360S0100000_17.l0;
        C1084590eKX c1084590eKX = (C1084590eKX) obj;
        if (!c1106110etF.LJFF()) {
            return Unit.LIZ;
        }
        if (c1084590eKX != null && (room = c1106110etF.LLILZIL) != null) {
            if (C494680Jac.LJJ(c1106110etF.LLILZ, room) && !((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2()) {
                return Unit.LIZ;
            }
            if (!C1084600eKY.LJI(c1106110etF.LLILZIL.getId(), c1084590eKX)) {
                return Unit.LIZ;
            }
            c1106110etF.LLLIIIIL = c1084590eKX;
            if (c1106110etF.LLJJ != null && c1106110etF.LL != null && (c19eg = c1106110etF.LLJ) != null && !c19eg.isFinishing()) {
                c1106110etF.LIZIZ();
                FrameLayout frameLayout = c1106110etF.LLLILZJ;
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    view = c1106110etF.LLLILZJ;
                } else {
                    view = c1106110etF.LLJJ;
                }
                c1106110etF.LLILLJJLI = true;
                float f = -((int) C497740JfY.LIZIZ(10.0f));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
                objectAnimatorOfFloat.setDuration(350L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f, 0.0f);
                objectAnimatorOfFloat2.setDuration(350L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat).before(objectAnimatorOfFloat2);
                c1106110etF.LLILZLL = animatorSet;
                animatorSet.addListener(new ALAdapterS3S0210000_17(c1106110etF, view, 3));
                animatorSet.start();
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$147(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C481340IuC c481340IuC = ((C1106110etF) aObjectS360S0100000_17.l0).LLJJIII;
        if (c481340IuC != null) {
            c481340IuC.LIZJ("add_to_story", "", null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$148(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS360S0100000_17.l0;
        c1106110etF.getClass();
        if (obj == C0UE0.SHARE) {
            c1106110etF.LJIIZILJ(c1106110etF.LL.getContext());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$149(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS360S0100000_17.l0;
        c1106110etF.getClass();
        if (obj == C0UE0.SHARE) {
            c1106110etF.LJIIZILJ(c1106110etF.LL.getContext());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$150(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        String strLJIIIZ;
        String strLJIIIZ2;
        Room roomLIZLLL;
        BaseResponse<Room, EnterRoomExtra> baseResponseLIZIZ;
        Room room;
        C1106110etF c1106110etF = (C1106110etF) aObjectS360S0100000_17.l0;
        Integer num = (Integer) obj;
        c1106110etF.getClass();
        if (LiveQuickReturnOptSetting.isEnabled() && (roomLIZLLL = c1106110etF.LIZLLL()) != null && (baseResponseLIZIZ = C466200IPy.LIZIZ(roomLIZLLL.getId(), false)) != null && (room = baseResponseLIZIZ.data) != null && room.getStats() != null && num != null) {
            baseResponseLIZIZ.data.getStats().setShareCount(num.intValue());
        }
        if ((c1106110etF.LLJJIJIIJIL || LiveToolbarUIConfigOpt.INSTANCE.overlayTextOnTheShare()) && c1106110etF.LLJJIJIL != null) {
            if (num != null && num.intValue() > 0) {
                C20743416Fc c20743416Fc = c1106110etF.LLJJIJIL;
                if (!c1106110etF.LLLILZLLLI) {
                    strLJIIIZ = C497740JfY.LJIJI(2131842930);
                } else {
                    strLJIIIZ = C1850730yGF.LJIIIZ(num.intValue());
                }
                c20743416Fc.setText(strLJIIIZ);
                c1106110etF.LLJJJ = num.intValue();
            } else {
                c1106110etF.LLJJIJIL.setText(C497740JfY.LJIJI(2131842930));
                c1106110etF.LLJJJ = -1;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        if (!c1106110etF.LLJJIJIIJIL) {
            AbstractC1106180etM abstractC1106180etM = c1106110etF.LLJJJJJIL;
            if (abstractC1106180etM != null) {
                abstractC1106180etM.LIZ(num);
            }
            AbstractC1106180etM abstractC1106180etM2 = c1106110etF.LLJJJJLIIL;
            if (abstractC1106180etM2 != null) {
                abstractC1106180etM2.LIZ(num);
            }
            if (num != null) {
                c1106110etF.LLJJJIL = num.intValue();
            }
            if (LiveToolbarUIConfigOpt.INSTANCE.overlayTextOnTheShare()) {
                if (num != null && num.intValue() > 0) {
                    if (!c1106110etF.LLLILZLLLI) {
                        strLJIIIZ2 = C497740JfY.LJIJI(2131842930);
                    } else {
                        strLJIIIZ2 = C1850730yGF.LJIIIZ(num.intValue());
                    }
                    if (strLJIIIZ2.length() >= 3) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1106110etF.LLJJIJIL.getLayoutParams();
                        layoutParams.gravity = 81;
                        C20743416Fc c20743416Fc2 = c1106110etF.LLJJIJIL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743416Fc2);
                        c20743416Fc2.setLayoutParams(layoutParams);
                    } else {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c1106110etF.LLJJIJIL.getLayoutParams();
                        layoutParams2.gravity = 85;
                        C20743416Fc c20743416Fc3 = c1106110etF.LLJJIJIL;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743416Fc3);
                        c20743416Fc3.setLayoutParams(layoutParams2);
                    }
                    if (strLJIIIZ2.length() == 1) {
                        c1106110etF.LLJJIJIL.setPadding((int) C497740JfY.LIZIZ(3.0f), 0, (int) C497740JfY.LIZIZ(3.0f), 0);
                    } else if (strLJIIIZ2.length() == 2) {
                        c1106110etF.LLJJIJIL.setPadding((int) C497740JfY.LIZIZ(4.0f), 0, (int) C497740JfY.LIZIZ(4.0f), 0);
                    } else {
                        c1106110etF.LLJJIJIL.setPadding((int) C497740JfY.LIZIZ(2.0f), 0, (int) C497740JfY.LIZIZ(2.0f), 0);
                    }
                    c1106110etF.LLJJIJIL.setText(strLJIIIZ2);
                    AnimatorSet animatorSet = c1106110etF.LLILZLL;
                    if (animatorSet == null || !animatorSet.isRunning()) {
                        C500260Jjc.LLFFF(c1106110etF.LLJJIJIL);
                    }
                } else {
                    C500260Jjc.LJIILIIL(c1106110etF.LLJJIJIL);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$151(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS360S0100000_17.l0;
        c1106110etF.LLLFZ = false;
        c1106110etF.LLLIIIIL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$152(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveAudienceToolbarWidget liveAudienceToolbarWidget = (LiveAudienceToolbarWidget) aObjectS360S0100000_17.l0;
        int i = LiveAudienceToolbarWidget.LLIZ;
        liveAudienceToolbarWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            liveAudienceToolbarWidget.hide();
        } else {
            liveAudienceToolbarWidget.show();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$153(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveToolbarWidget liveToolbarWidget = (LiveToolbarWidget) aObjectS360S0100000_17.l0;
        int i = LiveToolbarWidget.LLIZ;
        liveToolbarWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            liveToolbarWidget.hide();
        } else {
            liveToolbarWidget.show();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$154(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((DebugToolsHelper) aObjectS360S0100000_17.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$155(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) aObjectS360S0100000_17.l0;
        int i = LikeHelper.LLLJL;
        likeHelper.getClass();
        likeHelper.LLLIL = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$156(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) aObjectS360S0100000_17.l0;
        int i = LikeHelper.LLLJL;
        likeHelper.getClass();
        likeHelper.LLLILZ = ((Boolean) obj).booleanValue();
        return null;
    }

    public static final Object invoke$157(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        publicScreenWidget.getClass();
        if (((C1077790e9Z) obj).LIZIZ.ordinal() < EnumC1087640ePS.LEVEL_HIGH.ordinal()) {
            publicScreenWidget.a2(null);
            publicScreenWidget.LLJLLIL.LIZJ();
            publicScreenWidget.LLJJL = true;
        } else if (publicScreenWidget.LLJJL && ScalableDowngradeSetting.enablePublicScreenAnimRecover()) {
            publicScreenWidget.a2(publicScreenWidget.LLJZ);
            publicScreenWidget.LLJJL = false;
            return null;
        }
        return null;
    }

    public static final Object invoke$158(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        publicScreenWidget.getClass();
        publicScreenWidget.X1(!((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$159(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        publicScreenWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            publicScreenWidget.a2(null);
            publicScreenWidget.LLJLLIL.LIZJ();
            publicScreenWidget.LLJJL = true;
        } else {
            publicScreenWidget.a2(publicScreenWidget.LLJZ);
            publicScreenWidget.LLJJL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aObjectS360S0100000_17.l0;
        frameL2SlotWidget.getClass();
        frameL2SlotWidget.x1(Boolean.valueOf(C494680Jac.LJII((C0II9) obj)));
        return Unit.LIZ;
    }

    public static final Object invoke$160(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        publicScreenWidget.getClass();
        if (((View) obj).getTranslationY() != 0.0f) {
            publicScreenWidget.B1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$161(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        publicScreenWidget.getClass();
        if (((C1077790e9Z) obj).LIZIZ.ordinal() < EnumC1087640ePS.LEVEL_HIGH.ordinal()) {
            publicScreenWidget.X1(false);
            return null;
        }
        publicScreenWidget.X1(true);
        return null;
    }

    public static final Object invoke$162(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        publicScreenWidget.getClass();
        if (LiveHostAutoAdaptiveParams.INSTANCE.isDisable("publish_screen_animation")) {
            publicScreenWidget.a2(null);
            publicScreenWidget.LLJLLIL.LIZJ();
            publicScreenWidget.LLJJL = true;
        } else {
            publicScreenWidget.a2(publicScreenWidget.LLJZ);
            publicScreenWidget.LLJJL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$163(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        C0IMR c0imr = (C0IMR) obj;
        if (publicScreenWidget.LLJILJILJ.LLLJL != null) {
            publicScreenWidget.e2(!c0imr.LIZ());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$164(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        C956380azk c956380azk = (C956380azk) obj;
        if (publicScreenWidget.LLJILJILJ.LLLJL != null) {
            int i = c956380azk.LIZ;
            if (i == 1) {
                publicScreenWidget.e2(true);
            } else if (i == 0) {
                publicScreenWidget.e2(false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$165(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C1111930f2d c1111930f2d = ((PublicScreenWidget) aObjectS360S0100000_17.l0).LLJILJILJ;
        if (c1111930f2d != null) {
            Iterator it2 = ((ArrayList) c1111930f2d.LL.LJFF).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1112100f2u) it2.next()).LJJIJIIJIL(recyclerView);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$166(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C781550UlF c781550UlF = ((PublicScreenWidget) aObjectS360S0100000_17.l0).LLJLLIL.LIZ;
        if (c781550UlF != null) {
            c781550UlF.clearFocus();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$167(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        for (int i = 0; i < publicScreenWidget.LLJILJILJ.LLJLL.LJ(); i++) {
            if (((InterfaceC1112060f2q) ListProtector.get(publicScreenWidget.LLJILJILJ.LLJLL.LIZLLL(), i)).LJJ()) {
                C1112390f3N c1112390f3N = publicScreenWidget.LLJLLIL;
                c1112390f3N.getClass();
                c1112390f3N.LIZIZ(new AwS157S0101000_17(c1112390f3N, i, 5));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$168(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aObjectS360S0100000_17.l0;
        Long l = (Long) obj;
        C1114120f6A c1114120f6A = publicScreenWidget.LLJZ;
        if (c1114120f6A != null) {
            c1114120f6A.LJIJJ(l.longValue());
            publicScreenWidget.LLJZ.LJIL(l.longValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$169(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LikeUserInfoAnimOptimizedWidget likeUserInfoAnimOptimizedWidget = (LikeUserInfoAnimOptimizedWidget) aObjectS360S0100000_17.l0;
        float f = LikeUserInfoAnimOptimizedWidget.LLJJJJJIL;
        likeUserInfoAnimOptimizedWidget.getClass();
        LiveHostAutoAdaptiveParams liveHostAutoAdaptiveParams = LiveHostAutoAdaptiveParams.INSTANCE;
        likeUserInfoAnimOptimizedWidget.LLJJIJIL = liveHostAutoAdaptiveParams.isDisable("self_like_avatar");
        likeUserInfoAnimOptimizedWidget.LLJJJ = liveHostAutoAdaptiveParams.isDisable("self_like_avatar");
        return Unit.LIZ;
    }

    public static final Object invoke$17(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        return ((FrameL2SlotWidget) aObjectS360S0100000_17.l0).x1((Boolean) obj);
    }

    public static final Object invoke$170(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LikeUserInfoAnimWidget likeUserInfoAnimWidget = (LikeUserInfoAnimWidget) aObjectS360S0100000_17.l0;
        float f = LikeUserInfoAnimWidget.LLJJJJ;
        likeUserInfoAnimWidget.getClass();
        LiveHostAutoAdaptiveParams liveHostAutoAdaptiveParams = LiveHostAutoAdaptiveParams.INSTANCE;
        likeUserInfoAnimWidget.LLJJIJIIJIL = liveHostAutoAdaptiveParams.isDisable("self_like_avatar");
        likeUserInfoAnimWidget.LLJJIJIL = liveHostAutoAdaptiveParams.isDisable("self_like_avatar");
        return Unit.LIZ;
    }

    public static final Object invoke$18(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        IFrameSlot.SlotViewModel slotViewModel;
        android.util.Pair<Boolean, String> value;
        FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aObjectS360S0100000_17.l0;
        frameL2SlotWidget.getClass();
        if (((C1088240eQQ) obj).LIZIZ && (slotViewModel = frameL2SlotWidget.LLILLJJLI) != null && (value = slotViewModel.LL.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            frameL2SlotWidget.LLILLJJLI.LL.setValue(new android.util.Pair<>(Boolean.FALSE, "visibility_reason_conflict"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        String str;
        FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aObjectS360S0100000_17.l0;
        C945320ahu c945320ahu = (C945320ahu) obj;
        if (c945320ahu != null) {
            if (frameL2SlotWidget.LLILLJJLI != null && (str = c945320ahu.LIZIZ) != null && str.contains("video_e2e_delay")) {
                frameL2SlotWidget.LLILLJJLI.LLIZ.setValue(c945320ahu.LIZIZ);
            }
        } else {
            frameL2SlotWidget.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        int i = LiveRoomNotifyWidget.LLJZIJLIL;
        ((LiveRoomNotifyWidget) aObjectS360S0100000_17.l0).z1((RoomNotifyMessage) obj);
        return null;
    }

    public static final Object invoke$20(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C1114360f6Y) aObjectS360S0100000_17.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$21(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$22(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence] */
    public static final Object invoke$3(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        Object spannableStringBuilder;
        Function1 function1 = (Function1) aObjectS360S0100000_17.l0;
        List list = (List) obj;
        if (list.size() == 1) {
            spannableStringBuilder = (CharSequence) ListProtector.get(list, 0);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    spannableStringBuilder.append((CharSequence) ListProtector.get(list, i));
                } else {
                    spannableStringBuilder.append(" · ").append((CharSequence) ListProtector.get(list, i));
                }
            }
        }
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS72S0200000_3(function1, spannableStringBuilder, 5));
        return null;
    }

    public static final Object invoke$30(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((C466230IQb) aObjectS360S0100000_17.l0).LJFF(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$32(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        landscapeAudienceInteractionFragment.LLZ = ((Boolean) ((Pair) obj).getFirst()).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$33(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        boolean z;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        if (absAudienceInteractionFragment.cS((MotionEvent) obj) && absAudienceInteractionFragment.LLLLJI && !absAudienceInteractionFragment.LLLLLJIL && !absAudienceInteractionFragment.LLLLL && !absAudienceInteractionFragment.LLLLLIL && !absAudienceInteractionFragment.HS() && !absAudienceInteractionFragment.LLLLLILLIL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$34(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        View viewFindViewById;
        int[] iArr = (int[]) obj;
        View view = ((PortraitAudienceInteractionFragment) aObjectS360S0100000_17.l0).LLZZZZ;
        if (view != null && (viewFindViewById = view.findViewById(R.id.sfo)) != null && viewFindViewById.getVisibility() == 0 && (viewFindViewById instanceof C1099820ej6)) {
            C21538619Qy c21538619Qy = (C21538619Qy) viewFindViewById;
            float[] gradientPositions = c21538619Qy.getGradientPositions();
            if (iArr != null && gradientPositions != null && gradientPositions.length == iArr.length) {
                c21538619Qy.LJLILLLLZI(gradientPositions, iArr);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.0Ial] */
    public static final Object invoke$36(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        EnumC755280Tjy enumC755280Tjy;
        boolean z;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        Boolean bool = (Boolean) obj;
        absAudienceInteractionFragment.getClass();
        absAudienceInteractionFragment.LLLLJI = bool.booleanValue();
        C0J3Y c0j3y = C0J3Y.LIZ;
        C0J3Y.LJIIL = EnumC485780J3g.FIRST_FRAME;
        C0J3Y.LIZ.getClass();
        C0J3Y.LIZIZ();
        InterfaceC1100800ekg interfaceC1100800ekgMc1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).mc1(absAudienceInteractionFragment.LLJIJIL);
        absAudienceInteractionFragment.LLLILZJ = interfaceC1100800ekgMc1;
        if (interfaceC1100800ekgMc1 != null) {
            C465520INi.LIZ.JV(interfaceC1100800ekgMc1);
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LIZIZ(absAudienceInteractionFragment.LLLILZJ);
            if (LiveStrategyParamsSwitchSetting.getValue().f36switch) {
                ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).R60(absAudienceInteractionFragment.LLJIJIL);
                AbstractC467020ITc abstractC467020ITcEi2 = ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).Ei2(absAudienceInteractionFragment.LLJIJIL);
                if (abstractC467020ITcEi2 != null) {
                    absAudienceInteractionFragment.LLLILZJ.LJIIIIZZ(abstractC467020ITcEi2);
                }
            }
            if (LiveLastNPerfFeatureSetting.INSTANCE.getValue().enable) {
                absAudienceInteractionFragment.LLLILZJ.LJIIIIZZ(absAudienceInteractionFragment.LLLLLZ);
            }
            absAudienceInteractionFragment.LLLILZJ.start();
            if (RealtimePerfScoreSettings.isUploadServer()) {
                absAudienceInteractionFragment.LLLILZJ.LJIIIIZZ(((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).pI0(absAudienceInteractionFragment.LLJILJIL.getId()));
            }
            ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).keepPerfMetricForReport(absAudienceInteractionFragment.LLLILZJ);
            if (LiveScaleNativeBannerSetting.enable()) {
                if (absAudienceInteractionFragment.getParentFragment() != null && (absAudienceInteractionFragment.getParentFragment() instanceof LivePlayFragment) && ((LivePlayFragment) absAudienceInteractionFragment.getParentFragment()).f1 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).wJ0(absAudienceInteractionFragment.LLLILZJ, z);
            }
        }
        ((IDebugService) C1161920gLG.LIZJ(IDebugService.class)).Bj2(absAudienceInteractionFragment.LLJIJIL);
        if (absAudienceInteractionFragment.LLLILZ != null && bool.booleanValue()) {
            absAudienceInteractionFragment.LLLILZ.LIZIZ(absAudienceInteractionFragment.LLLILZJ);
            absAudienceInteractionFragment.LLLILZ.start();
        }
        if (bool.booleanValue() && absAudienceInteractionFragment.LLJIJIL != null && absAudienceInteractionFragment.LLJILJIL != null && LiveStrategyParamsSwitchSetting.getValue().f36switch) {
            ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).BO(absAudienceInteractionFragment.LLJIJIL);
            String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if (currentUser.getUserAttr() != null) {
                DataChannel dataChannel = absAudienceInteractionFragment.LLJIJIL;
                long id = absAudienceInteractionFragment.LLJILJIL.getId();
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                boolean zLIZJ = C00FN.LIZJ(absAudienceInteractionFragment.LLJILJIL);
                Room room = absAudienceInteractionFragment.LLJILJIL;
                int i = room.liveRoomMode;
                long ownerUserId = room.getOwnerUserId();
                if (currentUser.getUserAttr().isAdmin) {
                    enumC755280Tjy = EnumC755280Tjy.ADMIN;
                } else {
                    enumC755280Tjy = EnumC755280Tjy.VIEWER;
                }
                dataChannel.zW(RoomBaseInfoParamsChannel.class, new C1084430eKH(id, currentUserId, serverDeviceId, zLIZJ, i, ownerUserId, enumC755280Tjy));
            }
            absAudienceInteractionFragment.LLJIJIL.zW(AudienceCountChannel.class, Integer.valueOf(absAudienceInteractionFragment.LLJILJIL.getUserCount()));
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z71(absAudienceInteractionFragment.LLJIJIL);
        }
        if (!C0IRS.LIZ) {
            C0IRS.LIZ = true;
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).kI2();
        } else {
            ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).Ck2();
        }
        DrawerLoadOpt value = LiveDrawerLoadOptSetting.INSTANCE.getValue();
        if (value != null) {
            final boolean z2 = value.isPreLoadingForuData;
            final boolean z3 = value.isPreLoadingForuUI;
            final boolean z4 = value.isPreLoadingGameData;
            final boolean z5 = value.isPreLoadingGameUI;
            if (z2 || z3 || z4 || z5) {
                if (C0IKG.LIZLLL == null) {
                    C0IKG.LIZLLL = new Runnable() { // from class: X.0Ial
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z6 = z2;
                            boolean z7 = z3;
                            boolean z8 = z4;
                            boolean z9 = z5;
                            C1C7U.LIZ("LiveDrawerHelper@85f9.preLoadingDrawer$1L");
                            C784440Upu.LIZ().LIZIZ(new C469380Iau(z6, z7, z8, z9));
                            C1C7U.LIZIZ("LiveDrawerHelper@85f9.preLoadingDrawer$1L");
                        }
                    };
                }
                long j = (long) (value.delayDataDuration * 1000.0d);
                RunnableC469290Ial runnableC469290Ial = C0IKG.LIZLLL;
                if (runnableC469290Ial != null) {
                    C473410IhP.LJ(runnableC469290Ial);
                    C473410IhP.LIZJ(C0IKG.LIZLLL, j);
                }
            }
        }
        if (LiveTipsMigrateStrategyFrameworkSetting.INSTANCE.getValue()) {
            IToolbarService iToolbarService = (IToolbarService) C1161920gLG.LIZJ(IToolbarService.class);
            absAudienceInteractionFragment.getContext();
            iToolbarService.VT(absAudienceInteractionFragment, absAudienceInteractionFragment.LLJIJIL);
        } else if (IncreaseSDKRegistrationOptimize.avoidFirstFrame() && IncreaseSDKRegistrationOptimize.avoidComponentLoading()) {
            ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).wl2(absAudienceInteractionFragment.LLJIJIL, absAudienceInteractionFragment, absAudienceInteractionFragment.LLJJJJJIL);
        }
        if (LiveTooltipNudgeShareGuideSetting.INSTANCE.isEnabled()) {
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).pO1(absAudienceInteractionFragment.LLJIJIL);
        }
        if (bool.booleanValue()) {
            if (absAudienceInteractionFragment.LLJJJ || absAudienceInteractionFragment.LLJJJIL) {
                absAudienceInteractionFragment.rU();
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$37(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        KaraokeRecyclableWidget karaokeRecyclableWidget = (KaraokeRecyclableWidget) obj;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWidgetCreated: ");
        sbLIZ.append(karaokeRecyclableWidget.toString());
        C20441214yg.LIZIZ("KLazy", C2188811AlT.LIZIZ(sbLIZ));
        landscapeAudienceInteractionFragment.t = karaokeRecyclableWidget;
        return null;
    }

    public static final Object invoke$38(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        portraitAudienceInteractionFragment.getClass();
        portraitAudienceInteractionFragment.JU(!((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$39(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.getClass();
        absAudienceInteractionFragment.LLLLZLLIL = System.currentTimeMillis();
        return Boolean.TRUE;
    }

    public static final Object invoke$4(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        C1110490f0J c1110490f0J = (C1110490f0J) aObjectS360S0100000_17.l0;
        c1110490f0J.LJJIJIL = spannableStringBuilder;
        if (c1110490f0J.LLIIIILZ() != null) {
            ((C1110490f0J) aObjectS360S0100000_17.l0).LJJIJIIJIL = spannableStringBuilder;
            ((C1110490f0J) aObjectS360S0100000_17.l0).LLIIIILZ().LJIIIIZZ((C1110490f0J) aObjectS360S0100000_17.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0).jT();
        return Unit.LIZ;
    }

    public static final Object invoke$41(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return obj;
    }

    public static final Object invoke$42(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return obj;
    }

    public static final Object invoke$43(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        PrivilegeDynamicEffectMessage privilegeDynamicEffectMessage = (PrivilegeDynamicEffectMessage) obj;
        if (privilegeDynamicEffectMessage.effectType != 1) {
            return Unit.LIZ;
        }
        interfaceC1078490eAh.invoke(privilegeDynamicEffectMessage);
        return Unit.LIZ;
    }

    public static final Object invoke$44(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$45(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        Pair pair = (Pair) obj;
        absAudienceInteractionFragment.getClass();
        GuideMessage guideMessage = (GuideMessage) pair.getFirst();
        Long l = (Long) pair.getSecond();
        if (guideMessage != null && l != null && l.longValue() == absAudienceInteractionFragment.LLJILJIL.getId()) {
            absAudienceInteractionFragment.LL.postDelayed(new ARunnableS86S0200000_17(absAudienceInteractionFragment, guideMessage, 12), 1000L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        portraitAudienceInteractionFragment.getClass();
        if (((C0IMR) obj).LIZ() && portraitAudienceInteractionFragment.LLZZ) {
            DataChannel dataChannel = portraitAudienceInteractionFragment.LLJIJIL;
            Boolean bool = Boolean.TRUE;
            dataChannel.zW(TopMaskForceHiddenEvent.class, bool);
            portraitAudienceInteractionFragment.LLJIJIL.zW(BottomMaskForceHiddenEvent.class, bool);
            C786410Ut5.LJLLLLLL(8, portraitAudienceInteractionFragment.LLZZZZ.findViewById(R.id.kvx));
            C786410Ut5.LJLLLLLL(8, portraitAudienceInteractionFragment.LLZZZZ.findViewById(R.id.sfo));
        }
        portraitAudienceInteractionFragment.LLZZ = false;
        return Unit.LIZ;
    }

    public static final Object invoke$47(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        boolean z;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        C1081600eFi c1081600eFi = (C1081600eFi) obj;
        absAudienceInteractionFragment.getClass();
        EnumC918970a1P enumC918970a1P = c1081600eFi.LIZ;
        if (enumC918970a1P == EnumC918970a1P.GRID_FIX || ((enumC918970a1P == EnumC918970a1P.GRID && c1081600eFi.LIZIZ > 0) || enumC918970a1P == EnumC918970a1P.FLOATING_FIX || (enumC918970a1P == EnumC918970a1P.FLOATING && c1081600eFi.LIZIZ > 0))) {
            z = true;
        } else {
            z = false;
        }
        absAudienceInteractionFragment.LLLLLIL = z;
        absAudienceInteractionFragment.bS();
        return Unit.LIZ;
    }

    public static final Object invoke$49(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        boolean z;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.getClass();
        if (((C936530aTj) obj).LIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        absAudienceInteractionFragment.LLLLLIL = z;
        absAudienceInteractionFragment.bS();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        IFrameSlot.SlotViewModel slotViewModel;
        FrameSlotController frameSlotController = (FrameSlotController) aObjectS360S0100000_17.l0;
        if (!frameSlotController.LLJ) {
            frameSlotController.LLJ = true;
            Queue<C1123980fM4> queue = frameSlotController.LL;
            if (queue != null) {
                Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
                while (it2.hasNext()) {
                    InterfaceC1124060fMC interfaceC1124060fMC = ((C1123980fM4) it2.next()).LIZIZ;
                    if ((interfaceC1124060fMC instanceof AbsSlotWidget) && (interfaceC1124060fMC.LLILZLL() instanceof IFrameSlot) && (slotViewModel = (IFrameSlot.SlotViewModel) ((AbsSlotWidget) interfaceC1124060fMC).LL) != null) {
                        slotViewModel.LLILLJJLI.setValue(Boolean.TRUE);
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$50(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        interfaceC1078490eAh.invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$51(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        MatchCutShortEvent matchCutShortEvent = new MatchCutShortEvent();
        matchCutShortEvent.setValue(obj);
        interfaceC1078490eAh.invoke(matchCutShortEvent);
        return null;
    }

    public static final Object invoke$52(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.getClass();
        absAudienceInteractionFragment.LLLLLJIL = ((Boolean) obj).booleanValue();
        absAudienceInteractionFragment.bS();
        return Unit.LIZ;
    }

    public static final Object invoke$53(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        TwoMatchCutShortEvent twoMatchCutShortEvent = new TwoMatchCutShortEvent();
        twoMatchCutShortEvent.setValue(obj);
        interfaceC1078490eAh.invoke(twoMatchCutShortEvent);
        return null;
    }

    public static final Object invoke$54(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        boolean z;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.getClass();
        if (((Integer) obj).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        absAudienceInteractionFragment.LLLLLILLIL = z;
        absAudienceInteractionFragment.bS();
        return Unit.LIZ;
    }

    public static final Object invoke$55(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.SR();
        C486790J7d.LJ(absAudienceInteractionFragment.LLJIJIL, new ARunnableS117S0100000_17(absAudienceInteractionFragment, 54));
        return Unit.LIZ;
    }

    public static final Object invoke$56(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        NormalGiftDisplayStatusEvent normalGiftDisplayStatusEvent = new NormalGiftDisplayStatusEvent();
        normalGiftDisplayStatusEvent.setValue(obj);
        interfaceC1078490eAh.invoke(normalGiftDisplayStatusEvent);
        return null;
    }

    public static final Object invoke$57(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0).LLLLLILLIL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$58(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        return Boolean.valueOf(((AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0).dU((MotionEvent) obj));
    }

    public static final Object invoke$59(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!landscapeAudienceInteractionFragment.LLZL && zBooleanValue) {
            landscapeAudienceInteractionFragment.LLZL = true;
            landscapeAudienceInteractionFragment.RU();
            landscapeAudienceInteractionFragment.MU(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        android.util.Pair<Boolean, String> value;
        FrameL2SlotWidget frameL2SlotWidget = (FrameL2SlotWidget) aObjectS360S0100000_17.l0;
        C1109500eyi c1109500eyi = (C1109500eyi) obj;
        if (c1109500eyi != null) {
            IFrameSlot.SlotViewModel slotViewModel = frameL2SlotWidget.LLILLJJLI;
            if (slotViewModel != null && (value = slotViewModel.LL.getValue()) != null && ((Boolean) value.first).booleanValue() && c1109500eyi.LIZ) {
                frameL2SlotWidget.LLILLJJLI.LL.setValue(new android.util.Pair<>(Boolean.FALSE, "visibility_reason_conflict"));
            }
        } else {
            frameL2SlotWidget.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        GiftDialogStatusChangeEvent giftDialogStatusChangeEvent = new GiftDialogStatusChangeEvent();
        giftDialogStatusChangeEvent.setValue(obj);
        interfaceC1078490eAh.invoke(giftDialogStatusChangeEvent);
        return null;
    }

    public static final Object invoke$61(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        Room room;
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        if (absAudienceInteractionFragment.LLLLLLL && TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable() && (room = absAudienceInteractionFragment.LLJILJIL) != null && room.isScreenshot) {
            absAudienceInteractionFragment.vU();
            absAudienceInteractionFragment.uU();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$62(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.getClass();
        if (((Boolean) obj).booleanValue() && !landscapeAudienceInteractionFragment.LLZL) {
            landscapeAudienceInteractionFragment.LLZL = true;
            landscapeAudienceInteractionFragment.RU();
            landscapeAudienceInteractionFragment.MU(0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$63(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return null;
    }

    public static final Object invoke$64(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        portraitAudienceInteractionFragment.getClass();
        portraitAudienceInteractionFragment.JU(((Boolean) obj).booleanValue());
        return Unit.LIZ;
    }

    public static final Object invoke$65(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return null;
    }

    public static final Object invoke$66(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.getClass();
        int i = ((C1086600eNm) obj).LIZIZ;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        }
        ILiveNormalPollViewModel iLiveNormalPollViewModel = absAudienceInteractionFragment.LLLLIL;
        if (iLiveNormalPollViewModel != null) {
            iLiveNormalPollViewModel.BQ2(i2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$67(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        KaraokeRecyclableWidget karaokeRecyclableWidget = (KaraokeRecyclableWidget) obj;
        portraitAudienceInteractionFragment.getClass();
        if (karaokeRecyclableWidget != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWidgetCreated: ");
            sbLIZ.append(karaokeRecyclableWidget.toString());
            C20441214yg.LIZIZ("KLazy", C2188811AlT.LIZIZ(sbLIZ));
            portraitAudienceInteractionFragment.t = karaokeRecyclableWidget;
            return null;
        }
        return null;
    }

    public static final Object invoke$68(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return null;
    }

    public static final Object invoke$69(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        landscapeAudienceInteractionFragment.PU();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        IFrameSlot.SlotViewModel slotViewModel;
        android.util.Pair<Boolean, String> value;
        FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aObjectS360S0100000_17.l0;
        C1088240eQQ c1088240eQQ = (C1088240eQQ) obj;
        frameL3SlotWidget.getClass();
        if (c1088240eQQ.LIZ == EnumC1107860ew4.QUESTION && c1088240eQQ.LIZIZ && (slotViewModel = frameL3SlotWidget.LLILLL) != null && (value = slotViewModel.LL.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            frameL3SlotWidget.LLILLL.LL.setValue(new android.util.Pair<>(Boolean.FALSE, "visibility_reason_conflict"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$70(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        BarrageAdjustmentEvent barrageAdjustmentEvent = new BarrageAdjustmentEvent();
        barrageAdjustmentEvent.setValue(obj);
        interfaceC1078490eAh.invoke(barrageAdjustmentEvent);
        return null;
    }

    public static final Object invoke$71(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        absAudienceInteractionFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            absAudienceInteractionFragment.XS();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$72(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((AbsAudienceInteractionFragment) aObjectS360S0100000_17.l0).bU((C956380azk) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$73(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        if (!((LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0).LLZ) {
            C784440Upu.LIZ().LIZIZ(new C0IF2(1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$74(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aObjectS360S0100000_17.l0;
        liveEmojiInputDialogFragment.getClass();
        liveEmojiInputDialogFragment.LLLLLLZZ = ((Boolean) obj).booleanValue();
        liveEmojiInputDialogFragment.zS();
        return null;
    }

    public static final Object invoke$75(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS360S0100000_17.l0;
        portraitAudienceInteractionFragment.getClass();
        int i = ((C956380azk) obj).LIZ;
        if (i == 1) {
            portraitAudienceInteractionFragment.LLJIJIL.zW(BottomMaskForceHiddenEvent.class, Boolean.FALSE);
            C786410Ut5.LJLLLLLL(0, portraitAudienceInteractionFragment.LLZZZZ.findViewById(R.id.sfo));
        } else if (i == 0) {
            portraitAudienceInteractionFragment.LLJIJIL.zW(BottomMaskForceHiddenEvent.class, Boolean.TRUE);
            C786410Ut5.LJLLLLLL(4, portraitAudienceInteractionFragment.LLZZZZ.findViewById(R.id.sfo));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$76(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((InterfaceC1078490eAh) aObjectS360S0100000_17.l0).invoke(obj);
        return null;
    }

    public static final Object invoke$77(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        InterfaceC1078490eAh interfaceC1078490eAh = (InterfaceC1078490eAh) aObjectS360S0100000_17.l0;
        if (((C0IMR) obj).LIZ()) {
            interfaceC1078490eAh.invoke(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$78(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((LandscapeAudienceInteractionFragment) aObjectS360S0100000_17.l0).NU(!r1.LLZLI);
        return Unit.LIZ;
    }

    public static final Object invoke$79(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1124880fNW c1124880fNW = (C1124880fNW) aObjectS360S0100000_17.l0;
        c1124880fNW.LIZLLL = (Map) obj;
        String string = ((Keva) C1124940fNc.LIZIZ.getValue()).getString("live_i18n_version_code_v1", "");
        c1124880fNW.LIZJ = string;
        c1124880fNW.LJI.LIZJ(c1124880fNW.LIZIZ, string);
        return null;
    }

    public static final Object invoke$8(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        View view;
        SlotBarrageWidget slotBarrageWidget = (SlotBarrageWidget) aObjectS360S0100000_17.l0;
        slotBarrageWidget.getClass();
        boolean z = !((Boolean) obj).booleanValue();
        slotBarrageWidget.LLILZIL = z;
        if (!z && (view = slotBarrageWidget.LLILLJJLI) != null && view.getVisibility() != 0) {
            slotBarrageWidget.J1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$80(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = (ARunnableS117S0100000_17) aObjectS360S0100000_17.l0;
        C1124880fNW c1124880fNW = (C1124880fNW) aRunnableS117S0100000_17.l0;
        c1124880fNW.LIZLLL = (Map) obj;
        c1124880fNW.LIZJ = ((Keva) C1124940fNc.LIZIZ.getValue()).getString("live_i18n_version_code_v1", "");
        C1124880fNW c1124880fNW2 = (C1124880fNW) aRunnableS117S0100000_17.l0;
        c1124880fNW2.LJI.LIZJ(c1124880fNW2.LIZIZ, c1124880fNW2.LIZJ);
        return null;
    }

    public static final Object invoke$81(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        String str = (String) obj;
        if (str != null) {
            if (a0.LJJIIZI(str, "live_cross_screen_gift_sei", false)) {
                ((C1139470fl3) aObjectS360S0100000_17.l0).getClass();
                C20441214yg.LJIIIZ("gift_sticker_ttlive_gift_render", "receive SEI; key: live_cross_screen_gift_sei");
                C1136380fg4.LIZ.getClass();
                Iterator it2 = C1136380fg4.LJ(str).iterator();
                while (it2.hasNext()) {
                    ((C1139470fl3) aObjectS360S0100000_17.l0).LJIIZILJ((C1136560fgM) it2.next());
                }
            } else if (a0.LJJIIZI(str, "live_cross_screen_first_frame_sei", false)) {
                ((C1139470fl3) aObjectS360S0100000_17.l0).getClass();
                C20441214yg.LJIIIZ("gift_sticker_ttlive_gift_render", "receive SEI; key: live_cross_screen_first_frame_sei");
                C1136460fgC.LIZ.getClass();
                C1136460fgC.LJIJI(str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$82(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1110310f01 c1110310f01 = (C1110310f01) aObjectS360S0100000_17.l0;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        c1110310f01.getClass();
        boolean value = LivePublicScreenEmoteLoadResilienceSetting.INSTANCE.getValue();
        if (!value) {
            c1110310f01.LJJJI = spannableStringBuilder;
        }
        if (c1110310f01.LJIILIIL != null) {
            if (value) {
                c1110310f01.LJJJI = spannableStringBuilder;
            }
            c1110310f01.LJIIL = spannableStringBuilder;
            c1110310f01.LLLILZLLLI(c1110310f01.LJJJI);
            c1110310f01.LJIILIIL.LJIIIIZZ(c1110310f01);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$83(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1110310f01 c1110310f01 = (C1110310f01) aObjectS360S0100000_17.l0;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        c1110310f01.LJJJJI = spannableStringBuilder;
        c1110310f01.LLLIZZ(spannableStringBuilder);
        C1109770ez9 c1109770ez9 = c1110310f01.LJIILIIL;
        if (c1109770ez9 != null) {
            c1109770ez9.LJIIIIZZ(c1110310f01);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$84(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1110310f01 c1110310f01 = (C1110310f01) aObjectS360S0100000_17.l0;
        c1110310f01.getClass();
        c1110310f01.LLLIIIL((EmoteModel) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$85(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        C1085000eLC c1085000eLC;
        C1114720f78 c1114720f78;
        C1085000eLC c1085000eLC2;
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        Boolean bool = (Boolean) obj;
        commentWidget.getClass();
        if (!bool.booleanValue() && (c1085000eLC2 = commentWidget.LLLFFI) != null) {
            commentWidget.k2(c1085000eLC2);
            commentWidget.LLLFFI = null;
        }
        if (!bool.booleanValue() && (c1114720f78 = commentWidget.LLLIL) != null) {
            commentWidget.i2(c1114720f78);
            commentWidget.LLLIL = null;
        }
        if (!bool.booleanValue() && (c1085000eLC = commentWidget.LLLFZ) != null) {
            commentWidget.l2(c1085000eLC);
            commentWidget.LLLFZ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$86(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (commentWidget.J1()) {
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = commentWidget.LLLLII;
                liveEmojiInputDialogFragment.LLJIJIL = C497740JfY.LJIJI(2131842933);
                liveEmojiInputDialogFragment.aS();
            }
            commentWidget.LLLILZLLLI = true;
            commentWidget.p2();
        } else {
            if (commentWidget.J1()) {
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = commentWidget.LLLLII;
                liveEmojiInputDialogFragment2.LLJIJIL = null;
                liveEmojiInputDialogFragment2.aS();
            }
            commentWidget.LLLILZLLLI = false;
            commentWidget.p2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$87(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        if (commentWidget.LLLILZ) {
            if (!commentWidget.J1()) {
                commentWidget.n2();
                commentWidget.z1(commentWidget.L1());
            } else {
                commentWidget.LLLJIL = true;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$88(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (commentWidget.LLLLII == null) {
                commentWidget.LLLLII = new LiveEmojiInputDialogFragment();
            }
            C0J3Y c0j3y = C0J3Y.LIZ;
            C485730J3b c485730J3bLIZ = C485760J3e.LIZ("ttlive_fragment_live_emoji_input_dialog_optimized_v2_hotspot_optimized");
            EnumC485780J3g enumC485780J3g = EnumC485780J3g.FIRST_FRAME;
            c0j3y.getClass();
            C0J3Y.LJIILIIL(R.layout.gj7, null, c485730J3bLIZ, enumC485780J3g, true);
            if (LiveCommentPreloadDrawableEmojiSetting.INSTANCE.getValue()) {
                C1115360f8A c1115360f8ALIZJ = C1115360f8A.LIZJ();
                List<String> listAsList = commentWidget.LLJJIJIIJIL.allEmojiList;
                c1115360f8ALIZJ.getClass();
                if (C0IKQ.LIZ(listAsList)) {
                    listAsList = Arrays.asList(LiveCommentPanelEmojiListSetting.INSTANCE.getValue());
                }
                List listLJ = C1115360f8A.LJ(listAsList, false);
                ArrayList arrayList = new ArrayList();
                for (C1115500f8O c1115500f8O : (ArrayList) listLJ) {
                    if (c1115500f8O.getType() == 1) {
                        arrayList.add(c1115500f8O.previewEmoji);
                    }
                }
                OnlineDrawableEmojiResourceManager onlineDrawableEmojiResourceManager = C1115360f8A.LIZJ().LIZ.LIZ;
                if (onlineDrawableEmojiResourceManager.LJFF.LJI() == 0) {
                    C500260Jjc.LJJJJJ(commentWidget, null, new C314780CVo(arrayList, onlineDrawableEmojiResourceManager, null), 3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$89(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((CommentWidget) aObjectS360S0100000_17.l0).n2();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        android.util.Pair<Boolean, String> value;
        FrameL3SlotWidget frameL3SlotWidget = (FrameL3SlotWidget) aObjectS360S0100000_17.l0;
        C1109500eyi c1109500eyi = (C1109500eyi) obj;
        if (c1109500eyi != null) {
            IFrameSlot.SlotViewModel slotViewModel = frameL3SlotWidget.LLILLL;
            if (slotViewModel != null && (value = slotViewModel.LL.getValue()) != null && ((Boolean) value.first).booleanValue() && c1109500eyi.LIZ) {
                frameL3SlotWidget.LLILLL.LL.setValue(new android.util.Pair<>(Boolean.FALSE, "visibility_reason_conflict"));
            }
        } else {
            frameL3SlotWidget.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$90(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.getClass();
        return C508910JxZ.LIZ((AbstractC509530JyZ) obj, new AObjectS360S0100000_17(commentWidget, 102));
    }

    public static final Object invoke$91(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((CommentWidget) aObjectS360S0100000_17.l0).r2((C1110530f0N) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$92(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.getClass();
        if (!((Boolean) obj).booleanValue()) {
            if (commentWidget.LLLJL) {
                HandlerHook.viewPostDelay(commentWidget.LLIZLLLIL, new ARunnableS117S0100000_17(commentWidget, 148), 1000L);
            }
            commentWidget.LLLJL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$93(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.getClass();
        if (((C937450aVD) obj).LIZ() > 0) {
            commentWidget.G1();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$94(Y.AObjectS360S0100000_17 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS360S0100000_17.invoke$94(Y.AObjectS360S0100000_17, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$95(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        ((CommentWidget) aObjectS360S0100000_17.l0).G1();
        return Unit.LIZ;
    }

    public static final Object invoke$96(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.LLJLILLLLZIIL = true;
        commentWidget.p2();
        return Unit.LIZ;
    }

    public static final Object invoke$97(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        commentWidget.LLJLILLLLZIIL = false;
        commentWidget.p2();
        return Unit.LIZ;
    }

    public static final Object invoke$98(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        String strLJIJI;
        String str;
        RoomAuthStatus roomAuthStatus;
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        C1084590eKX c1084590eKX = (C1084590eKX) obj;
        if (!commentWidget.LLJJIJI && Boolean.TRUE.equals(commentWidget.dataChannel.gg0(C0TZM.class))) {
            Room room = commentWidget.LLJJIJIIJIL;
            if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && !roomAuthStatus.enableChat) {
                return Unit.LIZ;
            }
            if (C494680Jac.LJJ(commentWidget.LLJJIJI, room) && !((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2()) {
                return Unit.LIZ;
            }
            if (!C1084600eKY.LJI(commentWidget.LLJJIJIIJIL.getId(), c1084590eKX)) {
                return Unit.LIZ;
            }
            if (commentWidget.LLIZLLLIL != null) {
                commentWidget.B1();
                commentWidget.LLJILLL = true;
                commentWidget.g2();
                if (c1084590eKX != null && c1084590eKX.LIZJ) {
                    strLJIJI = C497740JfY.LJIJI(2131853389);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131853390);
                }
                commentWidget.f2(strLJIJI, true);
                if (commentWidget.LLJJIJIIJIL != null) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interactive_motion_show");
                    c474500IjALIZ.LJIJJLI(commentWidget.dataChannel);
                    c474500IjALIZ.LJJII("comment", "interactive_type");
                    if (c1084590eKX != null && c1084590eKX.LIZJ) {
                        str = "for_old";
                    } else {
                        str = "for_new";
                    }
                    c474500IjALIZ.LJJII(str, "interactive_sub_type");
                    c474500IjALIZ.LJJII(Long.valueOf(commentWidget.LLJJIJIIJIL.getOwnerUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(commentWidget.LLJJIJIIJIL.getId()), "room_id");
                    c474500IjALIZ.LIZ();
                }
            }
            C1084600eKY.LJ(commentWidget.LLJJIJIIJIL.getId(), c1084590eKX);
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$99(AObjectS360S0100000_17 aObjectS360S0100000_17, Object obj) {
        CommentWidget commentWidget = (CommentWidget) aObjectS360S0100000_17.l0;
        HashMap map = (HashMap) obj;
        DataChannel dataChannel = commentWidget.dataChannel;
        if (dataChannel != null && map.containsKey(dataChannel.gg0(DrawGuessRoundIdChannel.class))) {
            commentWidget.LLJLILLLLZIIL = false;
            commentWidget.p2();
        }
        return Unit.LIZ;
    }

    public AObjectS360S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
