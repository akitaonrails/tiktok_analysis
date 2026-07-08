package Y;

import X.AbstractC1086230eNB;
import X.AbstractC1126560fQE;
import X.C0IJT;
import X.C1083910eJR;
import X.C1086050eMt;
import X.C1086300eNI;
import X.C1086440eNW;
import X.C1095930ecp;
import X.C1095940ecq;
import X.C1096340edU;
import X.C1099190ei5;
import X.C1099390eiP;
import X.C1099580eii;
import X.C1102070emj;
import X.C1102470enN;
import X.C1106110etF;
import X.C1110600f0U;
import X.C1110620f0W;
import X.C1111130f1L;
import X.C1111140f1M;
import X.C1117710fBx;
import X.C1128450fTH;
import X.C1135030fdt;
import X.C1135810ff9;
import X.C1138090fip;
import X.C1143030fqn;
import X.C1143090fqt;
import X.C1143100fqu;
import X.C1146260fw0;
import X.C11NZ;
import X.C1295960jpS;
import X.C12ES;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C16F5;
import X.C1701940uOG;
import X.C19748612Om;
import X.C20441214yg;
import X.C20736316Cj;
import X.C21459418yW;
import X.C21538619Qy;
import X.C245400xA;
import X.C245500xB;
import X.C417610GZb;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C755550TkP;
import X.C786410Ut5;
import X.EnumC1087550ePJ;
import X.EnumC1096020ecy;
import X.EnumC1135050fdv;
import X.InterfaceC1096360edW;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.UserContainerWidgetChangeEvent;
import com.bytedance.android.live.commentcombo.view.ExtendedCommentComboTrayWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleMvpStarAnimationStartEvent;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenGuideWidget;
import com.bytedance.android.live.publicscreen.impl.widget.InteractionLikeGuideWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;
import com.bytedance.android.livesdk.like.widget.LikeUserInfoAnimWidget;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveClearUserInfoWidgetOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProTimeExpSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveTrustInfoPrioritySetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.FeatureGuideMessage;
import com.bytedance.android.livesdk.pincard.ui.LivePinCardHorizontalWidget;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.BcToggleInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS13S0100000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationEnd$13(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
    }

    public static final void onAnimationEnd$69(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
    }

    public static final void onAnimationEnd$70(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 3:
                onAnimationCancel$0(this, animator);
                break;
            case 15:
                onAnimationCancel$1(this, animator);
                break;
            case 16:
                onAnimationCancel$2(this, animator);
                break;
            case 42:
                onAnimationCancel$3(this, animator);
                break;
            case 57:
                onAnimationCancel$4(this, animator);
                break;
            case 67:
                onAnimationCancel$5(this, animator);
                break;
            case 78:
                onAnimationCancel$6(this, animator);
                break;
            case 79:
                onAnimationCancel$7(this, animator);
                break;
            case 80:
                onAnimationCancel$8(this, animator);
                break;
            case 86:
                onAnimationCancel$9(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
            case 6:
            case 14:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case 21:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 27:
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
            case 37:
            case 39:
            case 52:
            case 64:
            case 68:
            case 77:
            case 82:
            case 84:
            case 96:
            case 100:
            case 101:
            case 103:
            case 105:
            case 108:
            case 110:
            case 115:
            case 116:
            case 121:
            case 124:
            case 125:
            case 128:
            case 130:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                onAnimationEnd$5(this, animator);
                break;
            case 8:
                onAnimationEnd$6(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$7(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$11(this, animator);
                break;
            case 15:
                onAnimationEnd$12(this, animator);
                break;
            case 16:
                onAnimationEnd$13(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$14(this, animator);
                break;
            case 19:
                onAnimationEnd$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$16(this, animator);
                break;
            case 22:
                onAnimationEnd$17(this, animator);
                break;
            case 23:
                onAnimationEnd$18(this, animator);
                break;
            case 25:
                onAnimationEnd$19(this, animator);
                break;
            case 26:
                onAnimationEnd$20(this, animator);
                break;
            case 28:
                onAnimationEnd$21(this, animator);
                break;
            case 29:
                onAnimationEnd$22(this, animator);
                break;
            case 30:
                onAnimationEnd$23(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$24(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationEnd$25(this, animator);
                break;
            case 35:
                onAnimationEnd$26(this, animator);
                break;
            case 38:
                C1086300eNI.LIZIZ();
                break;
            case 40:
                C1086300eNI.LIZIZ();
                break;
            case 41:
                C1086300eNI.LIZIZ();
                break;
            case 42:
                onAnimationEnd$30(this, animator);
                break;
            case 43:
                onAnimationEnd$31(this, animator);
                break;
            case 44:
                onAnimationEnd$32(this, animator);
                break;
            case 45:
                onAnimationEnd$33(this, animator);
                break;
            case 46:
                onAnimationEnd$34(this, animator);
                break;
            case 47:
                onAnimationEnd$35(this, animator);
                break;
            case 48:
                onAnimationEnd$36(this, animator);
                break;
            case 49:
                onAnimationEnd$37(this, animator);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onAnimationEnd$38(this, animator);
                break;
            case 51:
                onAnimationEnd$39(this, animator);
                break;
            case 53:
                onAnimationEnd$40(this, animator);
                break;
            case 54:
                onAnimationEnd$41(this, animator);
                break;
            case 55:
                onAnimationEnd$42(this, animator);
                break;
            case 56:
                onAnimationEnd$43(this, animator);
                break;
            case 57:
                onAnimationEnd$44(this, animator);
                break;
            case 58:
                onAnimationEnd$45(this, animator);
                break;
            case 59:
                onAnimationEnd$46(this, animator);
                break;
            case 60:
                onAnimationEnd$47(this, animator);
                break;
            case 61:
                onAnimationEnd$48(this, animator);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationEnd$49(this, animator);
                break;
            case 63:
                onAnimationEnd$50(this, animator);
                break;
            case 65:
                onAnimationEnd$51(this, animator);
                break;
            case 66:
                onAnimationEnd$52(this, animator);
                break;
            case 67:
                onAnimationEnd$53(this, animator);
                break;
            case 69:
                onAnimationEnd$54(this, animator);
                break;
            case 70:
                onAnimationEnd$55(this, animator);
                break;
            case 71:
                onAnimationEnd$56(this, animator);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                onAnimationEnd$57(this, animator);
                break;
            case 73:
                onAnimationEnd$58(this, animator);
                break;
            case 74:
                onAnimationEnd$59(this, animator);
                break;
            case 75:
                onAnimationEnd$60(this, animator);
                break;
            case 76:
                onAnimationEnd$61(this, animator);
                break;
            case 78:
                onAnimationEnd$62(this, animator);
                break;
            case 79:
                onAnimationEnd$63(this, animator);
                break;
            case 80:
                onAnimationEnd$64(this, animator);
                break;
            case 81:
                onAnimationEnd$65(this, animator);
                break;
            case 83:
                onAnimationEnd$66(this, animator);
                break;
            case 85:
                onAnimationEnd$67(this, animator);
                break;
            case 86:
                onAnimationEnd$68(this, animator);
                break;
            case 87:
                onAnimationEnd$69(this, animator);
                break;
            case 88:
                onAnimationEnd$70(this, animator);
                break;
            case 89:
                onAnimationEnd$71(this, animator);
                break;
            case 90:
                onAnimationEnd$72(this, animator);
                break;
            case 91:
                onAnimationEnd$73(this, animator);
                break;
            case 92:
                onAnimationEnd$74(this, animator);
                break;
            case 93:
                onAnimationEnd$75(this, animator);
                break;
            case 94:
                onAnimationEnd$76(this, animator);
                break;
            case 95:
                onAnimationEnd$77(this, animator);
                break;
            case 97:
                onAnimationEnd$78(this, animator);
                break;
            case 98:
                onAnimationEnd$79(this, animator);
                break;
            case 99:
                onAnimationEnd$80(this, animator);
                break;
            case 102:
                onAnimationEnd$81(this, animator);
                break;
            case 104:
                onAnimationEnd$82(this, animator);
                break;
            case 106:
                onAnimationEnd$83(this, animator);
                break;
            case 107:
                onAnimationEnd$84(this, animator);
                break;
            case 109:
                onAnimationEnd$85(this, animator);
                break;
            case 111:
                onAnimationEnd$86(this, animator);
                break;
            case 112:
                onAnimationEnd$87(this, animator);
                break;
            case 113:
                onAnimationEnd$88(this, animator);
                break;
            case 114:
                onAnimationEnd$89(this, animator);
                break;
            case 117:
                onAnimationEnd$90(this, animator);
                break;
            case 118:
                onAnimationEnd$91(this, animator);
                break;
            case 119:
                onAnimationEnd$92(this, animator);
                break;
            case 120:
                onAnimationEnd$93(this, animator);
                break;
            case 122:
                onAnimationEnd$94(this, animator);
                break;
            case 123:
                onAnimationEnd$95(this, animator);
                break;
            case 126:
                onAnimationEnd$96(this, animator);
                break;
            case 127:
                onAnimationEnd$97(this, animator);
                break;
            case 129:
                onAnimationEnd$98(this, animator);
                break;
            case 131:
                onAnimationEnd$99(this, animator);
                break;
            case 132:
                onAnimationEnd$100(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationStart$0(this, animator);
                break;
            case 6:
                onAnimationStart$1(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$2(this, animator);
                break;
            case 14:
                onAnimationStart$3(this, animator);
                break;
            case 15:
                onAnimationStart$4(this, animator);
                break;
            case 16:
                onAnimationStart$5(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$6(this, animator);
                break;
            case 21:
                onAnimationStart$7(this, animator);
                break;
            case 22:
                onAnimationStart$8(this, animator);
                break;
            case 23:
                onAnimationStart$9(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationStart$10(this, animator);
                break;
            case 25:
                onAnimationStart$11(this, animator);
                break;
            case 26:
                onAnimationStart$12(this, animator);
                break;
            case 27:
                onAnimationStart$13(this, animator);
                break;
            case 31:
                onAnimationStart$14(this, animator);
                break;
            case 32:
                onAnimationStart$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationStart$16(this, animator);
                break;
            case 37:
                onAnimationStart$17(this, animator);
                break;
            case 38:
                onAnimationStart$18(this, animator);
                break;
            case 39:
                onAnimationStart$19(this, animator);
                break;
            case 40:
                onAnimationStart$20(this, animator);
                break;
            case 41:
                onAnimationStart$21(this, animator);
                break;
            case 42:
                onAnimationStart$22(this, animator);
                break;
            case 44:
                onAnimationStart$23(this, animator);
                break;
            case 45:
                onAnimationStart$24(this, animator);
                break;
            case 51:
                onAnimationStart$25(this, animator);
                break;
            case 52:
                onAnimationStart$26(this, animator);
                break;
            case 57:
                onAnimationStart$27(this, animator);
                break;
            case 59:
                onAnimationStart$28(this, animator);
                break;
            case 64:
                onAnimationStart$29(this, animator);
                break;
            case 68:
                onAnimationStart$30(this, animator);
                break;
            case 77:
                onAnimationStart$31(this, animator);
                break;
            case 78:
                onAnimationStart$32(this, animator);
                break;
            case 82:
                onAnimationStart$33(this, animator);
                break;
            case 84:
                onAnimationStart$34(this, animator);
                break;
            case 87:
                onAnimationStart$35(this, animator);
                break;
            case 88:
                onAnimationStart$36(this, animator);
                break;
            case 92:
                onAnimationStart$37(this, animator);
                break;
            case 94:
                onAnimationStart$38(this, animator);
                break;
            case 96:
                onAnimationStart$39(this, animator);
                break;
            case 100:
                onAnimationStart$40(this, animator);
                break;
            case 101:
                onAnimationStart$41(this, animator);
                break;
            case 103:
                onAnimationStart$42(this, animator);
                break;
            case 105:
                onAnimationStart$43(this, animator);
                break;
            case 108:
                onAnimationStart$44(this, animator);
                break;
            case 110:
                onAnimationStart$45(this, animator);
                break;
            case 115:
                onAnimationStart$46(this, animator);
                break;
            case 116:
                onAnimationStart$47(this, animator);
                break;
            case 121:
                onAnimationStart$48(this, animator);
                break;
            case 124:
                onAnimationStart$49(this, animator);
                break;
            case 125:
                onAnimationStart$50(this, animator);
                break;
            case 128:
                onAnimationStart$51(this, animator);
                break;
            case 130:
                onAnimationStart$52(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS13S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1143090fqt c1143090fqt = ((C1143030fqn) aLAdapterS13S0100000_17.l0).LLJJIJI;
        if (c1143090fqt != null) {
            c1143090fqt.LJJJJI();
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS13S0100000_17.l0, 8);
        Animator.AnimatorListener animatorListener = ((C1143100fqu) aLAdapterS13S0100000_17.l0).LLJI;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS13S0100000_17.l0, 8);
        Animator.AnimatorListener animatorListener = ((C1143100fqu) aLAdapterS13S0100000_17.l0).LLJI;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    public static final void onAnimationCancel$3(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) aLAdapterS13S0100000_17.l0;
        abstractC1126560fQE.I5(abstractC1126560fQE.LLJJLIIIJLLLLLLLZ, abstractC1126560fQE.LLJLL);
        ((AbstractC1126560fQE) aLAdapterS13S0100000_17.l0).LLJLLL = false;
    }

    public static final void onAnimationCancel$4(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).t2();
    }

    public static final void onAnimationCancel$5(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.i5(((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIIIZZ, 1.0f);
        C786410Ut5.T4(((C1096340edU) aLAdapterS13S0100000_17.l0).LJI, 1.0f);
    }

    public static final void onAnimationCancel$6(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationCancel(animator);
        C1135030fdt c1135030fdt = (C1135030fdt) aLAdapterS13S0100000_17.l0;
        c1135030fdt.LLJILLL = EnumC1135050fdv.SHOW;
        c1135030fdt.LJIIJ();
    }

    public static final void onAnimationCancel$7(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationCancel(animator);
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllAnimatorListeners();
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllUpdateListeners();
        C500260Jjc.LJIILIIL((C1295960jpS) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationCancel$8(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationCancel(animator);
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllAnimatorListeners();
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllUpdateListeners();
        C500260Jjc.LJIILIIL((C1295960jpS) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationCancel$9(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$0(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((C1138090fip) aLAdapterS13S0100000_17.l0).LJIIIZ = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = (LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0;
        if (liveRoomNotifyWidget.LLIZ) {
            View view = liveRoomNotifyWidget.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            liveRoomNotifyWidget.hide();
        }
        ((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).LLJILLL = null;
        EnumC1087550ePJ.INSTANCE.onMessageFinish();
        ((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).D1();
        if (((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).dataChannel != null) {
            C20441214yg.LIZIZ("MainFrame#anim", "room-2-post event: false");
            ((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).dataChannel.zW(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((GiftAnchorPanelRecordPageCenterAssem) aLAdapterS13S0100000_17.l0).LLJJJJLIIL = null;
    }

    public static final void onAnimationEnd$100(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        DataChannel dataChannel = ((C1146260fw0) aLAdapterS13S0100000_17.l0).LLILZLL;
        if (dataChannel != null) {
            dataChannel.FQ2(BattleMvpStarAnimationStartEvent.class);
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LLD(4, ((LikeUserInfoAnimWidget) aLAdapterS13S0100000_17.l0).LLJILJILJ);
    }

    public static final void onAnimationEnd$12(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS13S0100000_17.l0, 8);
        Animator.AnimatorListener animatorListener = ((C1143100fqu) aLAdapterS13S0100000_17.l0).LLJI;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    public static final void onAnimationEnd$14(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.bd(0.0f, ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).a0);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
        C12ES.LJIILL(clearScreenUserInfoWidget.f0, clearScreenUserInfoWidget.LLJ);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget2 = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
        C12ES.LJIILL(clearScreenUserInfoWidget2.g0, clearScreenUserInfoWidget2.LLJJIJI);
        if (!LiveClearUserInfoWidgetOptSetting.INSTANCE.enable() || !((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).isDestroyed) {
            ClearScreenUserInfoWidget clearScreenUserInfoWidget3 = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
            C12ES.LJIILL(clearScreenUserInfoWidget3.f323i0, clearScreenUserInfoWidget3.LLJJJJLIIL);
            ClearScreenUserInfoWidget clearScreenUserInfoWidget4 = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
            C12ES.LJIILL(clearScreenUserInfoWidget4.j0, clearScreenUserInfoWidget4.LLJLL);
            ClearScreenUserInfoWidget clearScreenUserInfoWidget5 = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
            C12ES.LJIILL(clearScreenUserInfoWidget5.LLL, clearScreenUserInfoWidget5.LLJLILLLLZIIL);
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
        C1096340edU c1096340edU = liveRoomUserInfoWidget.LLLZ;
        if (c1096340edU != null && c1096340edU.LJJIIJ) {
            liveRoomUserInfoWidget.f2();
            return;
        }
        C12ES.LJIILL(8, liveRoomUserInfoWidget.LLJJJJLIIL);
        ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).LLJZ = false;
        if (LiveTrustInfoPrioritySetting.INSTANCE.isHighPriority() && ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).S1()) {
            if (!((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).b2()) {
                ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).m2(false);
                return;
            } else {
                ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).G2();
                return;
            }
        }
        ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).M2();
    }

    public static final void onAnimationEnd$16(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
        liveRoomUserInfoWidget.LLJZIJLIL = false;
        BcToggleInfo bcToggleInfo = liveRoomUserInfoWidget.LLZL;
        if (bcToggleInfo != null && liveRoomUserInfoWidget.LLLFFI == liveRoomUserInfoWidget.LLJJJJLIIL) {
            liveRoomUserInfoWidget.LLZL = null;
            liveRoomUserInfoWidget.A2(bcToggleInfo);
            ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).U1();
            return;
        }
        if (!liveRoomUserInfoWidget.LLLLLL && LiveProTimeExpSetting.INSTANCE.getValue() == 0) {
            LiveRoomUserInfoWidget liveRoomUserInfoWidget2 = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
            if (liveRoomUserInfoWidget2.LLLFFI == liveRoomUserInfoWidget2.LLJLILLLLZIIL && ((view = liveRoomUserInfoWidget2.LLLFZ) == liveRoomUserInfoWidget2.LLLLZLLIL || view == liveRoomUserInfoWidget2.LLJJJJLIIL)) {
                liveRoomUserInfoWidget2.I2();
            }
        } else {
            if (LiveTrustInfoPrioritySetting.INSTANCE.isHighPriority() && ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).S1()) {
                boolean z = !((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).b2();
                LiveRoomUserInfoWidget liveRoomUserInfoWidget3 = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
                View view2 = liveRoomUserInfoWidget3.LLLFZ;
                if (view2 == liveRoomUserInfoWidget3.LLJLL) {
                    BcToggleInfo bcToggleInfo2 = liveRoomUserInfoWidget3.LLZILL;
                    if (bcToggleInfo2 != null) {
                        liveRoomUserInfoWidget3.LLZILL = null;
                        liveRoomUserInfoWidget3.A2(bcToggleInfo2);
                    } else if (z) {
                        liveRoomUserInfoWidget3.m2(false);
                    } else {
                        liveRoomUserInfoWidget3.G2();
                    }
                    ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).U1();
                    return;
                }
                if (view2 == liveRoomUserInfoWidget3.LLJJJJLIIL) {
                    liveRoomUserInfoWidget3.LLJZ = false;
                    if (z) {
                        liveRoomUserInfoWidget3.m2(false);
                    } else {
                        liveRoomUserInfoWidget3.G2();
                    }
                    ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).U1();
                    return;
                }
                if (view2 == liveRoomUserInfoWidget3.LLJLILLLLZIIL) {
                    liveRoomUserInfoWidget3.G2();
                    ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).U1();
                    return;
                } else if (view2 == liveRoomUserInfoWidget3.LLLLZLLIL) {
                    liveRoomUserInfoWidget3.L2();
                    ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).U1();
                    return;
                }
            }
            LiveRoomUserInfoWidget liveRoomUserInfoWidget4 = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
            if (liveRoomUserInfoWidget4.LLLFZ == liveRoomUserInfoWidget4.LLJLILLLLZIIL) {
                liveRoomUserInfoWidget4.G2();
            } else if (liveRoomUserInfoWidget4.S1()) {
                LiveRoomUserInfoWidget liveRoomUserInfoWidget5 = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
                View view3 = liveRoomUserInfoWidget5.LLLFZ;
                if (view3 == liveRoomUserInfoWidget5.LLLLZLLIL) {
                    liveRoomUserInfoWidget5.L2();
                } else if (view3 == liveRoomUserInfoWidget5.LLJLL || view3 == liveRoomUserInfoWidget5.LLJJJJLIIL) {
                    if (liveRoomUserInfoWidget5.b2()) {
                        ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).M2();
                    } else {
                        ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).m2(false);
                    }
                }
            } else {
                LiveRoomUserInfoWidget liveRoomUserInfoWidget6 = (LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
                View view4 = liveRoomUserInfoWidget6.LLLFZ;
                if (view4 == liveRoomUserInfoWidget6.LLLLZLLIL || view4 == liveRoomUserInfoWidget6.LLJJJJLIIL) {
                    liveRoomUserInfoWidget6.m2(false);
                }
            }
        }
        ((LiveRoomUserInfoWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0).U1();
    }

    public static final void onAnimationEnd$17(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C500260Jjc.LJIILIIL(((LiveCoverCameraFragment) aLAdapterS13S0100000_17.l0).PR());
    }

    public static final void onAnimationEnd$18(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        AbstractC1086230eNB abstractC1086230eNB = (AbstractC1086230eNB) aLAdapterS13S0100000_17.l0;
        C1324720kZq c1324720kZq = abstractC1086230eNB.LLJ;
        if (c1324720kZq != null) {
            HandlerHook.viewPostDelay(c1324720kZq, new ARunnableS117S0100000_17(abstractC1086230eNB, 152), 360L);
        }
    }

    public static final void onAnimationEnd$19(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLIZ;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = (LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0;
        if (liveRoomNotifyWidget.LLIZ) {
            View view = liveRoomNotifyWidget.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        } else {
            liveRoomNotifyWidget.hide();
        }
        ((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).LLJILLL = null;
        EnumC1087550ePJ.INSTANCE.onMessageFinish();
        if (((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).dataChannel != null) {
            C20441214yg.LIZIZ("MainFrame#anim", "room-4-post event: false");
            ((LiveRoomNotifyWidget) aLAdapterS13S0100000_17.l0).dataChannel.zW(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$20(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        LiveIconView liveIconView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLJIJIL;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 8);
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1324720kZq c1324720kZq = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLJ;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1086300eNI.LIZIZ();
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZ();
    }

    public static final void onAnimationEnd$24(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLIZ;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        View view2 = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public static final void onAnimationEnd$25(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLIZ;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C1086300eNI.LIZIZ();
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZ();
    }

    public static final void onAnimationEnd$26(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1086300eNI.LIZIZ();
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZ();
    }

    public static final void onAnimationEnd$3(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1143090fqt c1143090fqt = ((C1143030fqn) aLAdapterS13S0100000_17.l0).LLJJIJI;
        if (c1143090fqt != null) {
            c1143090fqt.LJJJJI();
        }
    }

    public static final void onAnimationEnd$30(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) aLAdapterS13S0100000_17.l0;
        abstractC1126560fQE.I5(abstractC1126560fQE.LLJJLIIIJLLLLLLLZ, abstractC1126560fQE.LLJLL);
        ((AbstractC1126560fQE) aLAdapterS13S0100000_17.l0).LLJLLL = false;
    }

    public static final void onAnimationEnd$31(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ConstraintProperty constraintProperty = (ConstraintProperty) aLAdapterS13S0100000_17.l0;
        constraintProperty.margin(7, 0);
        constraintProperty.apply();
    }

    public static final void onAnimationEnd$32(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).alpha(1.0f);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).translationY(0.0f);
    }

    public static final void onAnimationEnd$33(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).alpha(1.0f);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).translationY(0.0f);
    }

    public static final void onAnimationEnd$34(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((C1096340edU) aLAdapterS13S0100000_17.l0).LJ.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.X5(layoutParams, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJ);
        ((C1096340edU) aLAdapterS13S0100000_17.l0).LIZ(EnumC1096020ecy.FOLLOWED);
    }

    public static final void onAnimationEnd$35(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        if (((C1096340edU) aLAdapterS13S0100000_17.l0).LJ.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) ((C1096340edU) aLAdapterS13S0100000_17.l0).LJ.getBackground()).setColor(C20736316Cj.LIZIZ(R.attr.c9i, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJJIFFI));
        } else {
            ((C1096340edU) aLAdapterS13S0100000_17.l0).getClass();
            C1096340edU.LJIIIIZZ();
        }
    }

    public static final void onAnimationEnd$36(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIJ);
        C786410Ut5.g5(((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIJ, 1.0f);
        C12ES.LJIILL(8, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJI);
        InterfaceC1096360edW interfaceC1096360edW = ((C1096340edU) aLAdapterS13S0100000_17.l0).LJJIJIIJI;
        if (interfaceC1096360edW != null) {
            interfaceC1096360edW.LJFF();
        }
    }

    public static final void onAnimationEnd$37(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIIL);
    }

    public static final void onAnimationEnd$38(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ClearScreenUserInfoWidget clearScreenUserInfoWidget = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
        C1096340edU c1096340edU = clearScreenUserInfoWidget.LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJJIIJ = false;
        }
        clearScreenUserInfoWidget.f3(true);
        ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).W2(false);
        C500260Jjc.LLFFF(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLIZ);
        C500260Jjc.LLFFF(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLILZIL);
        ClearScreenUserInfoWidget clearScreenUserInfoWidget2 = (ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0;
        if (!clearScreenUserInfoWidget2.b2()) {
            if (!clearScreenUserInfoWidget2.LLLLLL && clearScreenUserInfoWidget2.LLL == 0) {
                clearScreenUserInfoWidget2.I2();
            } else {
                clearScreenUserInfoWidget2.K2(clearScreenUserInfoWidget2.LLLI);
            }
        }
        ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).H1(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    public static final void onAnimationEnd$39(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1096340edU c1096340edU = ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJ();
        }
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLILZLL.setClickable(false);
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIII.setClickable(false);
    }

    public static final void onAnimationEnd$4(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view = ((C1143030fqn) aLAdapterS13S0100000_17.l0).LLJJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = ((C1143030fqn) aLAdapterS13S0100000_17.l0).LLJJJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        C1295960jpS c1295960jpS = ((C1143030fqn) aLAdapterS13S0100000_17.l0).LLJILLL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(4, c1295960jpS);
        }
    }

    public static final void onAnimationEnd$40(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ViewGroup viewGroup;
        C1099190ei5 c1099190ei5 = (C1099190ei5) aLAdapterS13S0100000_17.l0;
        View view = c1099190ei5.LIZJ;
        if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            View view2 = new View(c1099190ei5.LIZ);
            C786410Ut5.W5(view2, new FrameLayout.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            C786410Ut5.I7(new ACListenerS152S0100000_17(c1099190ei5, 113), view2);
            viewGroup.addView(view2);
            c1099190ei5.LJIILL = view2;
        }
    }

    public static final void onAnimationEnd$41(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIIL);
    }

    public static final void onAnimationEnd$42(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C500260Jjc.LJIILIIL((C1099580eii) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationEnd$43(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        if (((C1096340edU) aLAdapterS13S0100000_17.l0).LJ.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) ((C1096340edU) aLAdapterS13S0100000_17.l0).LJ.getBackground()).setColor(C20736316Cj.LIZIZ(R.attr.c9i, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJJIFFI));
        } else {
            ((C1096340edU) aLAdapterS13S0100000_17.l0).getClass();
            C1096340edU.LJIIIIZZ();
        }
    }

    public static final void onAnimationEnd$44(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(4, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIII);
        C12ES.LJIILL(0, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLLII);
    }

    public static final void onAnimationEnd$45(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C500260Jjc.LJIILIIL(((C1099390eiP) aLAdapterS13S0100000_17.l0).LJIIIIZZ);
    }

    public static final void onAnimationEnd$46(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((C1099390eiP) aLAdapterS13S0100000_17.l0).LIZ(4);
    }

    public static final void onAnimationEnd$47(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIJ);
        C786410Ut5.g5(((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIJ, 1.0f);
        C12ES.LJIILL(8, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJI);
    }

    public static final void onAnimationEnd$48(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).H1(16);
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).t2();
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLLIILLL);
        ViewGroup viewGroup = ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLILZ;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.e_u);
        }
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLLZ.LIZ();
    }

    public static final void onAnimationEnd$49(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((C1096340edU) aLAdapterS13S0100000_17.l0).LIZ(EnumC1096020ecy.FOLLOWED);
    }

    public static final void onAnimationEnd$5(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ConstraintProperty constraintPropertyById;
        InteractionLikeGuideWidget interactionLikeGuideWidget = (InteractionLikeGuideWidget) aLAdapterS13S0100000_17.l0;
        interactionLikeGuideWidget.x1();
        LayeredElementContext layeredElementContext = interactionLikeGuideWidget.getLayeredElementContext();
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(interactionLikeGuideWidget.getId())) != null) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.addUpdateListener(new AUListenerS266S0100000_17(constraintPropertyById, 145));
            duration.addListener(new ALAdapterS13S0100000_17(interactionLikeGuideWidget, 93));
            duration.start();
            interactionLikeGuideWidget.LLILZIL = duration;
            return;
        }
        C1083910eJR.LIZ(interactionLikeGuideWidget.dataChannel, 2);
        interactionLikeGuideWidget.hide();
    }

    public static final void onAnimationEnd$50(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1096340edU c1096340edU = (C1096340edU) aLAdapterS13S0100000_17.l0;
        c1096340edU.LJIJJ(C20736316Cj.LIZIZ(R.attr.c7n, c1096340edU.LJJIFFI));
    }

    public static final void onAnimationEnd$51(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIJJI);
    }

    public static final void onAnimationEnd$52(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIIL);
    }

    public static final void onAnimationEnd$53(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.i5(((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIIIZZ, 1.0f);
        C786410Ut5.T4(((C1096340edU) aLAdapterS13S0100000_17.l0).LJI, 1.0f);
        DataChannel dataChannel = ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIJ;
        if (dataChannel != null) {
            dataChannel.FQ2(UserContainerWidgetChangeEvent.class);
        }
    }

    public static final void onAnimationEnd$54(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1096340edU c1096340edU = ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJ();
        }
    }

    public static final void onAnimationEnd$55(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIIL);
    }

    public static final void onAnimationEnd$56(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        if (((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIL.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            C1096340edU c1096340edU = (C1096340edU) aLAdapterS13S0100000_17.l0;
            if (c1096340edU.LJJII != 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1096340edU.LJIIL.getLayoutParams();
                int i = ((C1096340edU) aLAdapterS13S0100000_17.l0).LJJII;
                if (i == 1) {
                    marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(9.0f));
                } else if (i == 3) {
                    marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(6.0f));
                    marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(6.0f));
                }
                C786410Ut5.c6(((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIL, marginLayoutParams);
            }
        }
        C12ES.LJIILL(8, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIILIIL);
        if (((C1096340edU) aLAdapterS13S0100000_17.l0).LIZJ == null) {
            return;
        }
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        TransitionManager.beginDelayedTransition((ViewGroup) ((C1096340edU) aLAdapterS13S0100000_17.l0).LIZJ, changeBounds);
        ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIJJLI.LIZ(C11NZ.LJJJJZ(1).LJJI(200L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS186S0100000_17(aLAdapterS13S0100000_17, 102)).LJJLJ());
    }

    public static final void onAnimationEnd$57(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LLJJJJJIL(((C1117710fBx) aLAdapterS13S0100000_17.l0).LLJJJIL, 8);
    }

    public static final void onAnimationEnd$58(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C417610GZb c417610GZb = ((C1117710fBx) aLAdapterS13S0100000_17.l0).LLJJIJI;
        int visibility = c417610GZb.getVisibility();
        c417610GZb.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c417610GZb);
        C786410Ut5.LLJZ(((C1117710fBx) aLAdapterS13S0100000_17.l0).LLJJI, 8);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$59(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LLJJJJJIL(((C1117710fBx) aLAdapterS13S0100000_17.l0).LLJJJIL, 0);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$6(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LJLLLLLL(8, ((PublicScreenWidget) aLAdapterS13S0100000_17.l0).LLILZIL);
        if (!(!((PublicScreenWidget) aLAdapterS13S0100000_17.l0).LLJLLIL.LIZ())) {
            PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aLAdapterS13S0100000_17.l0;
            publicScreenWidget.b2(publicScreenWidget.LLJJ, false);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$60(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LJZI(0, ((C1117710fBx) aLAdapterS13S0100000_17.l0).LLJJIJIIJIL);
    }

    public static final void onAnimationEnd$61(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1106110etF) aLAdapterS13S0100000_17.l0).LJIILIIL();
    }

    public static final void onAnimationEnd$62(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1135030fdt c1135030fdt = (C1135030fdt) aLAdapterS13S0100000_17.l0;
        c1135030fdt.LLJILLL = EnumC1135050fdv.SHOW;
        c1135030fdt.LJIIJ();
    }

    public static final void onAnimationEnd$63(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllAnimatorListeners();
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllUpdateListeners();
        C500260Jjc.LJIILIIL((C1295960jpS) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationEnd$64(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllAnimatorListeners();
        ((C1295960jpS) aLAdapterS13S0100000_17.l0).removeAllUpdateListeners();
        C500260Jjc.LJIILIIL((C1295960jpS) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationEnd$65(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).visibility(4);
    }

    public static final void onAnimationEnd$66(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).visibility(4);
    }

    public static final void onAnimationEnd$67(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationEnd$68(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$7(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((PublicScreenWidget) aLAdapterS13S0100000_17.l0).LLILZIL.setEnabled(true);
    }

    public static final void onAnimationEnd$71(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ProgrammedLiveUserInfoWidget programmedLiveUserInfoWidget = (ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0;
        programmedLiveUserInfoWidget.LLLZ.LJJIIJ = false;
        programmedLiveUserInfoWidget.f3(true);
        C500260Jjc.LLFFF(((ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0).LLIZ);
        C500260Jjc.LLFFF(((ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0).LLILZIL);
    }

    public static final void onAnimationEnd$72(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ViewGroup viewGroup = ((FollowTabViewLifecycleObserver) aLAdapterS13S0100000_17.l0).LLIZ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        TextView textView = ((FollowTabViewLifecycleObserver) aLAdapterS13S0100000_17.l0).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
    }

    public static final void onAnimationEnd$73(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1110600f0U c1110600f0U = ((C1110620f0W) aLAdapterS13S0100000_17.l0).LJJLIIIIJ;
        if (c1110600f0U != null) {
            c1110600f0U.invalidate();
        }
    }

    public static final void onAnimationEnd$74(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.Pd(((PublicScreenWidget) aLAdapterS13S0100000_17.l0).LLILZLL);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$75(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1083910eJR.LIZ(((InteractionLikeGuideWidget) aLAdapterS13S0100000_17.l0).dataChannel, 2);
        ((InteractionLikeGuideWidget) aLAdapterS13S0100000_17.l0).hide();
    }

    public static final void onAnimationEnd$76(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, ((LikeUserInfoAnimWidget) aLAdapterS13S0100000_17.l0).LLJILLL);
    }

    public static final void onAnimationEnd$77(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ExtendedCommentComboTrayWidget) aLAdapterS13S0100000_17.l0).hide();
    }

    public static final void onAnimationEnd$78(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C1086050eMt) aLAdapterS13S0100000_17.l0).LIZ;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        C786410Ut5.LLD(4, c1295960jpS);
    }

    public static final void onAnimationEnd$79(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C1086440eNW) aLAdapterS13S0100000_17.l0).LIZ;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        C786410Ut5.LLD(8, c1295960jpS);
    }

    public static final void onAnimationEnd$8(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.Pd(((PublicScreenWidget) aLAdapterS13S0100000_17.l0).LLILZLL);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$80(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$81(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIZILJ);
    }

    public static final void onAnimationEnd$82(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIZILJ);
    }

    public static final void onAnimationEnd$83(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIILIIL);
    }

    public static final void onAnimationEnd$84(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$85(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$86(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$87(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIILIIL);
    }

    public static final void onAnimationEnd$88(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIILIIL);
    }

    public static final void onAnimationEnd$89(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIILIIL);
    }

    public static final void onAnimationEnd$9(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = (LiveRoomNotifyWidget) ((ARunnableS117S0100000_17) aLAdapterS13S0100000_17.l0).l0;
        if (liveRoomNotifyWidget.LLILZIL == null) {
            return;
        }
        HandlerHook.viewPostDelay(liveRoomNotifyWidget.LLILZIL, liveRoomNotifyWidget.LLJJJJJIL, 2000L);
    }

    public static final void onAnimationEnd$90(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIJJI);
    }

    public static final void onAnimationEnd$91(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS13S0100000_17.l0).invoke();
    }

    public static final void onAnimationEnd$92(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIJ);
    }

    public static final void onAnimationEnd$93(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C16F5 c16f5 = ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIJ;
        if (c16f5 != null) {
            C786410Ut5.Rc(c16f5, 0.0f);
        }
    }

    public static final void onAnimationEnd$94(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LivePrivilegeAnnouncementWidget) aLAdapterS13S0100000_17.l0).D1();
        if (((LivePrivilegeAnnouncementWidget) aLAdapterS13S0100000_17.l0).dataChannel != null) {
            C20441214yg.LIZIZ("MainFrame#anim", "announ-3-post event: false");
            ((LivePrivilegeAnnouncementWidget) aLAdapterS13S0100000_17.l0).dataChannel.zW(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$95(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LivePrivilegeAnnouncementWidget) aLAdapterS13S0100000_17.l0).D1();
        if (((LivePrivilegeAnnouncementWidget) aLAdapterS13S0100000_17.l0).dataChannel != null) {
            C20441214yg.LIZIZ("MainFrame#anim", "announ-3-post event: false");
            ((LivePrivilegeAnnouncementWidget) aLAdapterS13S0100000_17.l0).dataChannel.zW(HourlyRankRewardVisibilityChangedChannel.class, Boolean.FALSE);
        }
    }

    public static final void onAnimationEnd$96(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LivePinCardHorizontalWidget) aLAdapterS13S0100000_17.l0).hide();
        ((LivePinCardHorizontalWidget) aLAdapterS13S0100000_17.l0).y1();
    }

    public static final void onAnimationEnd$97(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LivePinCardHorizontalWidget) aLAdapterS13S0100000_17.l0).hide();
    }

    public static final void onAnimationEnd$98(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C21538619Qy c21538619Qy = ((C1111140f1M) aLAdapterS13S0100000_17.l0).LLJI;
        if (c21538619Qy != null) {
            C786410Ut5.LLJJL(c21538619Qy, 8);
        }
    }

    public static final void onAnimationEnd$99(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C21538619Qy c21538619Qy = ((C1111130f1L) aLAdapterS13S0100000_17.l0).LLJILLL;
        if (c21538619Qy != null) {
            C786410Ut5.LLJJL(c21538619Qy, 8);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ExtendedScreenGuideWidget) aLAdapterS13S0100000_17.l0).A1();
    }

    public static final void onAnimationStart$1(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C245400xA c245400xA;
        C786410Ut5.Jc(((ExtendedScreenGuideWidget) aLAdapterS13S0100000_17.l0).y1(), -((ExtendedScreenGuideWidget) aLAdapterS13S0100000_17.l0).contentView.getWidth());
        ExtendedScreenGuideWidget extendedScreenGuideWidget = (ExtendedScreenGuideWidget) aLAdapterS13S0100000_17.l0;
        DataChannel dataChannel = extendedScreenGuideWidget.dataChannel;
        if (dataChannel != null) {
            FeatureGuideMessage featureGuideMessage = extendedScreenGuideWidget.LLILLJJLI;
            if (featureGuideMessage != null) {
                C245500xB.LIZ.getClass();
                C1102070emj c1102070emj = C1102070emj.LIZ;
                C1102470enN c1102470enN = C1102470enN.LL;
                Map map = (Map) ((LinkedHashMap) C245500xB.LIZIZ).get(dataChannel);
                if (map != null) {
                    c245400xA = (C245400xA) map.get(featureGuideMessage);
                } else {
                    c245400xA = null;
                }
                c1102070emj.LJIIJ(dataChannel, c1102470enN, c245400xA, null);
            }
            C500260Jjc.LLFFF(extendedScreenGuideWidget.y1());
            extendedScreenGuideWidget.dataChannel.SX0(C755550TkP.class, Boolean.TRUE);
            extendedScreenGuideWidget.B1(true);
        }
    }

    public static final void onAnimationStart$10(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIIZZ();
    }

    public static final void onAnimationStart$11(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        int width;
        View view;
        ViewGroup.LayoutParams layoutParams;
        View view2 = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILLL;
        if (view2 != null && (width = view2.getWidth()) > 0 && (view = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILLL) != null && (layoutParams = view.getLayoutParams()) != null) {
            AbstractC1086230eNB abstractC1086230eNB = (AbstractC1086230eNB) aLAdapterS13S0100000_17.l0;
            layoutParams.width = width;
            View view3 = abstractC1086230eNB.LLILLL;
            if (view3 != null) {
                C786410Ut5.W5(view3, layoutParams);
            }
        }
        LiveIconView liveIconView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLJIJIL;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
        LiveIconView liveIconView2 = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLJIJIL;
        if (liveIconView2 != null) {
            liveIconView2.setIconTintAttr(R.attr.er6);
        }
    }

    public static final void onAnimationStart$12(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLIZ;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
    }

    public static final void onAnimationStart$13(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIZ();
    }

    public static final void onAnimationStart$14(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIZ();
    }

    public static final void onAnimationStart$15(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIZ();
    }

    public static final void onAnimationStart$16(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIIZZ();
    }

    public static final void onAnimationStart$17(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIIZZ();
    }

    public static final void onAnimationStart$18(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        TextView textView = ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LLIZ;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZIZ();
    }

    public static final void onAnimationStart$19(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LJIIIIZZ();
    }

    public static final void onAnimationStart$2(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        PublicScreenWidget publicScreenWidget = (PublicScreenWidget) aLAdapterS13S0100000_17.l0;
        publicScreenWidget.getClass();
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_mention_remind_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIJJLI(publicScreenWidget.dataChannel);
        c474500IjALIZIZ.LIZ();
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$20(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZIZ();
    }

    public static final void onAnimationStart$21(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZIZ();
    }

    public static final void onAnimationStart$22(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        AbstractC1126560fQE abstractC1126560fQE = (AbstractC1126560fQE) aLAdapterS13S0100000_17.l0;
        abstractC1126560fQE.LLJLLL = true;
        abstractC1126560fQE.I5(abstractC1126560fQE.LLJJLIIIJLLLLLLLZ, abstractC1126560fQE.LLJLL);
    }

    public static final void onAnimationStart$23(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$24(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$25(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1096340edU c1096340edU = ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJI();
        }
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIII.setPadding(0, 0, 0, 0);
        C21459418yW c21459418yW = new C21459418yW();
        c21459418yW.LJIILJJIL(((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIL);
        C19748612Om.LIZ(((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLIIII, c21459418yW);
    }

    public static final void onAnimationStart$26(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLJ);
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLJJIJI);
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLJJJJLIIL);
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLJLILLLLZIIL);
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLJLL);
    }

    public static final void onAnimationStart$27(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).G1(16);
        ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).c2();
    }

    public static final void onAnimationStart$28(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((C1099390eiP) aLAdapterS13S0100000_17.l0).LIZ(0);
        C1099390eiP c1099390eiP = (C1099390eiP) aLAdapterS13S0100000_17.l0;
        HandlerHook.viewPost(c1099390eiP.LJ, new ARunnableS117S0100000_17(c1099390eiP, 210));
    }

    public static final void onAnimationStart$29(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1096340edU c1096340edU = ((LiveRoomUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LIZJ();
        }
    }

    public static final void onAnimationStart$3(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C1096340edU c1096340edU = ((ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLZ;
        c1096340edU.LJJIIJ = true;
        ImageView imageView = c1096340edU.LJJIIJZLJL;
        if (imageView != null) {
            C12ES.LJIILL(8, imageView);
        }
        ((ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0).f3(false);
        C500260Jjc.LJIILIIL(((ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0).LLIZ);
        C500260Jjc.LJIILIIL(((ProgrammedLiveUserInfoWidget) aLAdapterS13S0100000_17.l0).LLILZIL);
    }

    public static final void onAnimationStart$30(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(0, ((C1096340edU) aLAdapterS13S0100000_17.l0).LJIIL);
    }

    public static final void onAnimationStart$31(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ViewGroup) aLAdapterS13S0100000_17.l0).setPivotX((int) C497740JfY.LIZIZ(35.0f));
        ((ViewGroup) aLAdapterS13S0100000_17.l0).setPivotY((int) C497740JfY.LIZIZ(35.0f));
    }

    public static final void onAnimationStart$32(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        int i;
        long j;
        super.onAnimationStart(animator);
        C1135030fdt c1135030fdt = (C1135030fdt) aLAdapterS13S0100000_17.l0;
        c1135030fdt.LLJILLL = EnumC1135050fdv.SHOWING;
        C1135810ff9 c1135810ff9 = c1135030fdt.LLJJJIL;
        if (c1135810ff9 != null && !c1135810ff9.LJJLIIIJL) {
            i = c1135810ff9.LJJLIIIJ;
        } else {
            i = 1;
        }
        c1135030fdt.LJIIIZ(i);
        C1135810ff9 c1135810ff92 = ((C1135030fdt) aLAdapterS13S0100000_17.l0).LLJJJIL;
        if (c1135810ff92 != null && c1135810ff92.LJJLIIIJJI) {
            IInteractService iInteractService = C1128450fTH.LIZ;
            if (c1135810ff92 != null) {
                j = c1135810ff92.LJJLI;
            } else {
                j = 0;
            }
            C1128450fTH.LIZ.Pq2(j, true);
        }
    }

    public static final void onAnimationStart$33(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).visibility(0);
    }

    public static final void onAnimationStart$34(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS13S0100000_17.l0).visibility(0);
    }

    public static final void onAnimationStart$35(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ViewGroup) aLAdapterS13S0100000_17.l0).setPivotX((int) C497740JfY.LIZIZ(35.0f));
        ((ViewGroup) aLAdapterS13S0100000_17.l0).setPivotY((int) C497740JfY.LIZIZ(35.0f));
    }

    public static final void onAnimationStart$36(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ViewGroup) aLAdapterS13S0100000_17.l0).setPivotX((int) C497740JfY.LIZIZ(35.0f));
        ((ViewGroup) aLAdapterS13S0100000_17.l0).setPivotY((int) C497740JfY.LIZIZ(35.0f));
    }

    public static final void onAnimationStart$37(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((PublicScreenWidget) aLAdapterS13S0100000_17.l0).LLILZIL.setEnabled(false);
    }

    public static final void onAnimationStart$38(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LJLLLLLL(0, ((LikeUserInfoAnimWidget) aLAdapterS13S0100000_17.l0).LLJILLL);
    }

    public static final void onAnimationStart$39(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ExtendedCommentComboTrayWidget) aLAdapterS13S0100000_17.l0).show();
    }

    public static final void onAnimationStart$4(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS13S0100000_17.l0, 0);
        Animator.AnimatorListener animatorListener = ((C1143100fqu) aLAdapterS13S0100000_17.l0).LLJI;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }

    public static final void onAnimationStart$40(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095940ecq) aLAdapterS13S0100000_17.l0).LJI);
    }

    public static final void onAnimationStart$41(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJJIFFI);
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$42(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIZILJ);
    }

    public static final void onAnimationStart$43(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIZILJ);
    }

    public static final void onAnimationStart$44(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIIJ);
    }

    public static final void onAnimationStart$45(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIJI);
    }

    public static final void onAnimationStart$46(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIILIIL);
    }

    public static final void onAnimationStart$47(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS13S0100000_17.l0).LJIJI);
    }

    public static final void onAnimationStart$48(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095940ecq) aLAdapterS13S0100000_17.l0).LJFF);
        C12ES.LJIILL(4, ((C1095940ecq) aLAdapterS13S0100000_17.l0).LJ);
    }

    public static final void onAnimationStart$49(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        LivePinCardHorizontalWidget livePinCardHorizontalWidget = (LivePinCardHorizontalWidget) aLAdapterS13S0100000_17.l0;
        ViewGroup viewGroup = livePinCardHorizontalWidget.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
            viewGroup.addView(livePinCardHorizontalWidget.LLILLL);
        }
        ((LivePinCardHorizontalWidget) aLAdapterS13S0100000_17.l0).show();
    }

    public static final void onAnimationStart$5(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS13S0100000_17.l0, 0);
        Animator.AnimatorListener animatorListener = ((C1143100fqu) aLAdapterS13S0100000_17.l0).LLJI;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }

    public static final void onAnimationStart$50(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((LivePinCardHorizontalWidget) aLAdapterS13S0100000_17.l0).show();
    }

    public static final void onAnimationStart$51(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C21538619Qy c21538619Qy = ((C1111140f1M) aLAdapterS13S0100000_17.l0).LLJI;
        if (c21538619Qy != null) {
            C786410Ut5.LLJJL(c21538619Qy, 0);
        }
    }

    public static final void onAnimationStart$52(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        super.onAnimationStart(animator);
        C21538619Qy c21538619Qy = ((C1111130f1L) aLAdapterS13S0100000_17.l0).LLJILLL;
        if (c21538619Qy != null) {
            C786410Ut5.LLJJL(c21538619Qy, 0);
        }
    }

    public static final void onAnimationStart$6(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).f3(false);
        C1096340edU c1096340edU = ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJJIIJ = true;
            ImageView imageView = c1096340edU.LJJIIJZLJL;
            if (imageView != null) {
                C12ES.LJIILL(8, imageView);
            }
        }
        ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).W2(true);
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLIZ);
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).LLILZIL);
        ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).P2();
        ((ClearScreenUserInfoWidget) aLAdapterS13S0100000_17.l0).G1(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    public static final void onAnimationStart$7(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        float f;
        C1099580eii c1099580eii = (C1099580eii) aLAdapterS13S0100000_17.l0;
        if (C497740JfY.LJJ()) {
            f = 0.0f;
        } else {
            f = -C497740JfY.LIZIZ(((C1099580eii) aLAdapterS13S0100000_17.l0).LLILZLL);
        }
        c1099580eii.LLJJIJI = f;
        C500260Jjc.LLFFF((C1099580eii) aLAdapterS13S0100000_17.l0);
    }

    public static final void onAnimationStart$8(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        C500260Jjc.LLFFF(((LiveCoverCameraFragment) aLAdapterS13S0100000_17.l0).PR());
    }

    public static final void onAnimationStart$9(ALAdapterS13S0100000_17 aLAdapterS13S0100000_17, Animator animator) {
        ((AbstractC1086230eNB) aLAdapterS13S0100000_17.l0).LL.LIZIZ();
    }
}
