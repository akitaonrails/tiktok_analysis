package Y;

import X.C09RB;
import X.C09RD;
import X.C0GY9;
import X.C0IJT;
import X.C0T0Y;
import X.C0TKM;
import X.C0TL0;
import X.C0UHS;
import X.C0UK0;
import X.C0UKJ;
import X.C0UKK;
import X.C0UO5;
import X.C1143920fsE;
import X.C1146260fw0;
import X.C1161920gLG;
import X.C12ES;
import X.C1602160rnK;
import X.C19ME;
import X.C19P4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C339190DRl;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C745070TKn;
import X.C745190TKz;
import X.C746290TPf;
import X.C761650TuF;
import X.C767200U7q;
import X.C770170UJb;
import X.C778030UfZ;
import X.C781300Ukq;
import X.C781580UlI;
import X.C781960Ulu;
import X.C784440Upu;
import X.C785000Uqo;
import X.C785060Uqu;
import X.C786410Ut5;
import X.C998110c53;
import X.InterfaceC772190UQv;
import X.InterfaceC778060Ufc;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.CameraFocusViewGone;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.music.LiveBGMFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.PreviewLevelUpNotifyWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewCampaignCenterWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveExposureOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.marketing.ui.LiveMarketingWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.LiveAiSummaryTypewriterAnimConfig;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.AlphaSpan;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LivePreviewAiSummaryNewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideButtonWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.PreviewRealTimeCommentWidget;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS9S0100000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$6(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
                onAnimationCancel$1(this, animator);
                break;
            case 7:
                onAnimationCancel$2(this, animator);
                break;
            case 8:
                onAnimationCancel$3(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationCancel$4(this, animator);
                break;
            case 21:
                onAnimationCancel$5(this, animator);
                break;
            case 27:
                onAnimationCancel$6(this, animator);
                break;
            case 31:
                onAnimationCancel$7(this, animator);
                break;
            case 38:
                onAnimationCancel$8(this, animator);
                break;
            case 39:
                onAnimationCancel$9(this, animator);
                break;
            case 43:
                onAnimationCancel$10(this, animator);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onAnimationCancel$11(this, animator);
                break;
            case 60:
                onAnimationCancel$12(this, animator);
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
                onAnimationEnd$5(this, animator);
                break;
            case 6:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 26:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 35:
            case 46:
            case 51:
            case 53:
            case 57:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$8(this, animator);
                break;
            case 14:
                onAnimationEnd$9(this, animator);
                break;
            case 15:
                onAnimationEnd$10(this, animator);
                break;
            case 16:
                onAnimationEnd$11(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$12(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$13(this, animator);
                break;
            case 19:
                onAnimationEnd$14(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$15(this, animator);
                break;
            case 21:
                onAnimationEnd$16(this, animator);
                break;
            case 22:
                onAnimationEnd$17(this, animator);
                break;
            case 23:
                onAnimationEnd$18(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                super.onAnimationEnd(animator);
                break;
            case 25:
                onAnimationEnd$20(this, animator);
                break;
            case 27:
                onAnimationEnd$21(this, animator);
                break;
            case 28:
                onAnimationEnd$22(this, animator);
                break;
            case 29:
                onAnimationEnd$23(this, animator);
                break;
            case 30:
                onAnimationEnd$24(this, animator);
                break;
            case 31:
                onAnimationEnd$25(this, animator);
                break;
            case 32:
                onAnimationEnd$26(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationEnd$27(this, animator);
                break;
            case 37:
                onAnimationEnd$28(this, animator);
                break;
            case 38:
                onAnimationEnd$29(this, animator);
                break;
            case 39:
                onAnimationEnd$30(this, animator);
                break;
            case 40:
                onAnimationEnd$31(this, animator);
                break;
            case 41:
                onAnimationEnd$32(this, animator);
                break;
            case 42:
                onAnimationEnd$33(this, animator);
                break;
            case 43:
                onAnimationEnd$34(this, animator);
                break;
            case 44:
                onAnimationEnd$35(this, animator);
                break;
            case 45:
                onAnimationEnd$36(this, animator);
                break;
            case 47:
                onAnimationEnd$37(this, animator);
                break;
            case 48:
                onAnimationEnd$38(this, animator);
                break;
            case 49:
                onAnimationEnd$39(this, animator);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onAnimationEnd$40(this, animator);
                break;
            case 52:
                onAnimationEnd$41(this, animator);
                break;
            case 54:
                onAnimationEnd$42(this, animator);
                break;
            case 55:
                onAnimationEnd$43(this, animator);
                break;
            case 56:
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
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$2(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$3(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationStart$4(this, animator);
                break;
            case 26:
                onAnimationStart$5(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationStart$6(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationStart$7(this, animator);
                break;
            case 35:
                onAnimationStart$8(this, animator);
                break;
            case 38:
                onAnimationStart$9(this, animator);
                break;
            case 39:
                onAnimationStart$10(this, animator);
                break;
            case 46:
                onAnimationStart$11(this, animator);
                break;
            case 51:
                onAnimationStart$12(this, animator);
                break;
            case 53:
                onAnimationStart$13(this, animator);
                break;
            case 57:
                onAnimationStart$14(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS9S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        Iterator<View> it2 = new C09RD(((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS()).iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(8.0f), ((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS());
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(8.0f), ((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS());
    }

    public static final void onAnimationCancel$10(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationCancel$11(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS9S0100000_12.l0, 1.0f);
        C786410Ut5.Ob((View) aLAdapterS9S0100000_12.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS9S0100000_12.l0, 1.0f);
    }

    public static final void onAnimationCancel$12(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        C20441214yg.LIZIZ("NewMvpContainer", "mvpGuideAnimatorSet, onAnimationCancel");
        ConstraintLayout constraintLayout = ((C1146260fw0) aLAdapterS9S0100000_12.l0).LLJJJ;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        ConstraintLayout constraintLayout2 = ((C1146260fw0) aLAdapterS9S0100000_12.l0).LLJILJIL;
        if (constraintLayout2 != null) {
            C786410Ut5.c5(constraintLayout2, 1.0f);
        }
    }

    public static final void onAnimationCancel$2(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        Iterator<View> it2 = new C09RD(((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS()).iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
    }

    public static final void onAnimationCancel$3(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(8.0f), ((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS());
        C500260Jjc.LJJLJ((int) C497740JfY.LIZIZ(8.0f), ((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS());
    }

    public static final void onAnimationCancel$4(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        View view = (View) C09RB.LJIJ(new C09RD(((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS()));
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public static final void onAnimationCancel$5(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationCancel$7(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((C0UHS) aLAdapterS9S0100000_12.l0).getClass();
    }

    public static final void onAnimationCancel$8(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        C746290TPf c746290TPf = (C746290TPf) aLAdapterS9S0100000_12.l0;
        c746290TPf.LLILZ = false;
        int visibility = c746290TPf.getVisibility();
        c746290TPf.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c746290TPf);
        C0TKM c0tkm = ((C746290TPf) aLAdapterS9S0100000_12.l0).LLIZLLLIL;
        if (c0tkm != null) {
            c0tkm.LIZIZ();
        }
    }

    public static final void onAnimationCancel$9(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationCancel(animator);
        ((C746290TPf) aLAdapterS9S0100000_12.l0).LLILZIL = false;
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        View view = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).z1();
    }

    public static final void onAnimationEnd$1(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C19ME c19me;
        View view = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).LL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            c19me.endToEnd = 0;
            View view2 = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).LL;
            if (view2 != null) {
                C786410Ut5.W5(view2, c19me);
            }
            View view3 = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).LLILLJJLI;
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((LivePreviewFollowGuideButtonWidget) aLAdapterS9S0100000_12.l0).Q1();
    }

    public static final void onAnimationEnd$11(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((LivePreviewFollowGuideCardWidget) aLAdapterS9S0100000_12.l0).Q1();
    }

    public static final void onAnimationEnd$12(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((PreviewRealTimeCommentWidget) aLAdapterS9S0100000_12.l0).hide();
    }

    public static final void onAnimationEnd$13(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        PreviewRealTimeCommentWidget previewRealTimeCommentWidget = (PreviewRealTimeCommentWidget) aLAdapterS9S0100000_12.l0;
        View view = previewRealTimeCommentWidget.getView();
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        C12ES.LJIIZILJ(-1, -2, previewRealTimeCommentWidget.getView());
    }

    public static final void onAnimationEnd$14(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$15(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$16(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$17(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((C19P4) aLAdapterS9S0100000_12.l0).LLJLLL = true;
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$18(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        PreviewCampaignCenterWidget.N1((PreviewCampaignCenterWidget) aLAdapterS9S0100000_12.l0, true, 2000L, 1);
    }

    public static final void onAnimationEnd$2(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((C778030UfZ) aLAdapterS9S0100000_12.l0).LIZJ.removeAllUpdateListeners();
        ((C778030UfZ) aLAdapterS9S0100000_12.l0).LIZJ.removeAllListeners();
        C778030UfZ c778030UfZ = (C778030UfZ) aLAdapterS9S0100000_12.l0;
        c778030UfZ.LIZJ = null;
        InterfaceC778060Ufc interfaceC778060Ufc = c778030UfZ.LIZIZ.LJIIL;
        if (interfaceC778060Ufc != null) {
            interfaceC778060Ufc.LIZLLL();
        }
    }

    public static final void onAnimationEnd$20(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationEnd$21(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS9S0100000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$22(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        int i;
        String string;
        String strLLJLL;
        DataChannel dataChannel;
        super.onAnimationEnd(animator);
        C767200U7q.LJIIL = null;
        C20441214yg.LIZIZ("ComposerFilterSlideHelper", "removePreviousAndUpdateCurrentFilter");
        C767200U7q c767200U7q = C767200U7q.LIZ;
        if (C497740JfY.LJJ()) {
            if (C767200U7q.LJFF) {
                C767200U7q.LJIIIZ.LIZ();
            } else {
                C767200U7q.LJIIIZ.LIZIZ();
            }
        } else if (C767200U7q.LJFF) {
            C767200U7q.LJIIIZ.LIZIZ();
        } else {
            C767200U7q.LJIIIZ.LIZ();
        }
        LiveEffect liveEffect = C767200U7q.LJII;
        if (liveEffect != null) {
            C767200U7q.LIZIZ.LJIIJ(liveEffect, C767200U7q.LIZJ);
        }
        LiveEffect liveEffect2 = C767200U7q.LJI;
        if (liveEffect2 != null && (dataChannel = C767200U7q.LJIILIIL) != null) {
            dataChannel.LC0(OnFilterSelectedEvent.class, liveEffect2);
        }
        C767200U7q.LJII = C767200U7q.LJI;
        if (!C497740JfY.LJJ() ? !C767200U7q.LJFF : C767200U7q.LJFF) {
            i = 2;
        } else {
            i = 1;
        }
        C770170UJb.LIZJ("ComposerFilterSlideHelper");
        C770170UJb.LIZLLL = "removePreviousAndUpdateCurrentFilter";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current: ");
        sbLIZ.append(C767200U7q.LJII);
        sbLIZ.append(" newFilter: ");
        sbLIZ.append(C767200U7q.LJI);
        C770170UJb.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C784440Upu.LIZ().LIZIZ(new C761650TuF(i));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_filter_slide");
        c474500IjALIZ.LJIJJLI(C767200U7q.LJIILIIL);
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(C767200U7q.LJIILIIL);
        if (roomLJJLIIIIJ == null || (string = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "room_id");
        LiveEffect liveEffect3 = C767200U7q.LJII;
        if (liveEffect3 != null) {
            strLLJLL = liveEffect3.LLJLL();
        } else {
            strLLJLL = null;
        }
        c474500IjALIZ.LJJII(strLLJLL, "filter_id");
        c474500IjALIZ.LJJIFFI(Float.valueOf(C767200U7q.LJIIIIZZ.LJFF(C767200U7q.LJII)), "filter_value");
        c474500IjALIZ.LJJII(Integer.valueOf(C767200U7q.LJIILJJIL ? 1 : 0), "is_beauty_panel_show");
        c474500IjALIZ.LIZ();
        c767200U7q.LIZ(null, false);
        Function0 function0 = (Function0) aLAdapterS9S0100000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$23(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$24(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$25(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((C0UHS) aLAdapterS9S0100000_12.l0).getClass();
    }

    public static final void onAnimationEnd$26(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C500260Jjc.LJIILIIL((FrameLayout) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationEnd$27(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$28(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        C339190DRl.LIZIZ(((LivePreviewFollowGuideButtonWidget) aLAdapterS9S0100000_12.l0).O1());
    }

    public static final void onAnimationEnd$29(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((C746290TPf) aLAdapterS9S0100000_12.l0).LLILZ = false;
    }

    public static final void onAnimationEnd$3(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$30(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        C746290TPf c746290TPf = (C746290TPf) aLAdapterS9S0100000_12.l0;
        int visibility = c746290TPf.getVisibility();
        c746290TPf.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c746290TPf);
        C746290TPf c746290TPf2 = (C746290TPf) aLAdapterS9S0100000_12.l0;
        c746290TPf2.LLILZIL = false;
        C0TKM c0tkm = c746290TPf2.LLIZLLLIL;
        if (c0tkm != null) {
            c0tkm.LIZIZ();
        }
    }

    public static final void onAnimationEnd$31(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((C998110c53) aLAdapterS9S0100000_12.l0).LIZIZ.LJFF(4);
    }

    public static final void onAnimationEnd$32(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((C781960Ulu) aLAdapterS9S0100000_12.l0).LLJILLL.removeAllUpdateListeners();
        ((C781960Ulu) aLAdapterS9S0100000_12.l0).LLJILLL.removeAllListeners();
        ((C781960Ulu) aLAdapterS9S0100000_12.l0).LLJILLL = null;
    }

    public static final void onAnimationEnd$33(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        PreviewCampaignWidget.b2((PreviewCampaignWidget) aLAdapterS9S0100000_12.l0, true, 2000L, 1);
    }

    public static final void onAnimationEnd$34(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$35(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C0T0Y.LIZJ(((VideoRelationBtnAssem) aLAdapterS9S0100000_12.l0).LLL, false);
    }

    public static final void onAnimationEnd$36(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        String strLIZ = C0T0Y.LIZ(((VideoRelationBtnAssem) aLAdapterS9S0100000_12.l0).LLL);
        if (strLIZ != null) {
            C0T0Y.LIZ.put(strLIZ, Boolean.TRUE);
        }
    }

    public static final void onAnimationEnd$37(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationEnd$38(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        Runnable runnable = (Runnable) aLAdapterS9S0100000_12.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationEnd$39(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        Runnable runnable = (Runnable) aLAdapterS9S0100000_12.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C500260Jjc.LJIILIIL(((LiveBGMFragment) aLAdapterS9S0100000_12.l0).PR());
    }

    public static final void onAnimationEnd$40(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS9S0100000_12.l0, 1.0f);
        C786410Ut5.Ob((View) aLAdapterS9S0100000_12.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS9S0100000_12.l0, 1.0f);
    }

    public static final void onAnimationEnd$41(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        View view = (View) aLAdapterS9S0100000_12.l0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$42(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C1143920fsE c1143920fsE = ((C781580UlI) aLAdapterS9S0100000_12.l0).LLILZ;
        if (c1143920fsE != null) {
            c1143920fsE.LJFF();
        }
    }

    public static final void onAnimationEnd$43(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C500260Jjc.LJIILIIL((C781580UlI) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationEnd$44(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        View view;
        String str;
        DataChannel dataChannel;
        C0UKK c0ukk = (C0UKK) aLAdapterS9S0100000_12.l0;
        if (c0ukk.LLJILJILJ && (view = c0ukk.LLILZLL) != null && view.getVisibility() == 0) {
            View view2 = ((C0UKK) aLAdapterS9S0100000_12.l0).LLILZLL;
            if (view2 != null) {
                C500260Jjc.LJIILIIL(view2);
            }
            C0UK0.LIZ = false;
            C0UK0.LIZJ = false;
            if (LiveExposureOptSetting.INSTANCE.disable() && (dataChannel = ((C0UKK) aLAdapterS9S0100000_12.l0).getDataChannel()) != null) {
                dataChannel.FQ2(CameraFocusViewGone.class);
            }
            if (((C0UKK) aLAdapterS9S0100000_12.l0).LLJILLL != 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_focus_exposure_adjust");
                c474500IjALIZ.LJIJJLI(((C0UKK) aLAdapterS9S0100000_12.l0).getDataChannel());
                c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
                c474500IjALIZ.LJJII(0, "is_dual_camera");
                Integer numLIZ = InterfaceC772190UQv.c3.LIZ();
                if (numLIZ != null && numLIZ.intValue() == 1) {
                    str = "front";
                } else {
                    str = "back";
                }
                c474500IjALIZ.LJJII(str, "camera_type");
                c474500IjALIZ.LJJII(Integer.valueOf(((C0UKK) aLAdapterS9S0100000_12.l0).LLJILLL), "adjusted_exp");
                String str2 = C0UKJ.LJIIIIZZ;
                if (str2 == null) {
                    str2 = "normal_click";
                }
                c474500IjALIZ.LJJII(str2, "from");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static final void onAnimationEnd$45(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((TextView) aLAdapterS9S0100000_12.l0).setEnabled(true);
    }

    public static final void onAnimationEnd$46(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((TextView) aLAdapterS9S0100000_12.l0).setEnabled(false);
    }

    public static final void onAnimationEnd$47(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        C20441214yg.LIZIZ("NewMvpContainer", "mvpGuideAnimatorSet, onAnimationEnd");
        ConstraintLayout constraintLayout = ((C1146260fw0) aLAdapterS9S0100000_12.l0).LLJJJ;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        ConstraintLayout constraintLayout2 = ((C1146260fw0) aLAdapterS9S0100000_12.l0).LLJILJIL;
        if (constraintLayout2 != null) {
            C786410Ut5.c5(constraintLayout2, 1.0f);
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS9S0100000_12);
        Iterator<View> it2 = new C09RD(((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS()).iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        animator.getListeners().remove(aLAdapterS9S0100000_12);
        Iterator<View> it2 = new C09RD(((MultiCoHostBeInvitedFragment) aLAdapterS9S0100000_12.l0).cS()).iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4(it2.next(), 1.0f);
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0).I1(2131755585);
        ((PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0).LLIZ = C0UO5.L1_TASK_KEY.getKey();
        ((PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0).G1();
        ((PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0).M1(false);
        Interpolator interpolatorLIZIZ = C0GY9.LIZIZ(0.25f, 0.46f, 0.45f, 0.94f);
        PreviewLevelUpNotifyWidget previewLevelUpNotifyWidget = (PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0;
        ObjectAnimator objectAnimatorJ1 = previewLevelUpNotifyWidget.J1(previewLevelUpNotifyWidget.LLJIJIL, false, interpolatorLIZIZ, 250L, 0L);
        PreviewLevelUpNotifyWidget previewLevelUpNotifyWidget2 = (PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0;
        ObjectAnimator objectAnimatorJ12 = previewLevelUpNotifyWidget2.J1(previewLevelUpNotifyWidget2.LLJILJILJ, false, interpolatorLIZIZ, 250L, 0L);
        AnimatorSet animatorSet = ((PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0).LLJILLL;
        if (animatorSet != null) {
            animatorSet.playTogether(objectAnimatorJ1, objectAnimatorJ12);
        }
        AnimatorSet animatorSet2 = ((PreviewLevelUpNotifyWidget) aLAdapterS9S0100000_12.l0).LLJILLL;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((C781300Ukq) aLAdapterS9S0100000_12.l0).LIZLLL.setClickable(false);
        C786410Ut5.LJLLLLLL(8, ((C781300Ukq) aLAdapterS9S0100000_12.l0).LIZLLL);
        ((C781300Ukq) aLAdapterS9S0100000_12.l0).LJIIJJI();
        ((C781300Ukq) aLAdapterS9S0100000_12.l0).LJIIJ.animate().alpha(0.0f).setDuration(200L).start();
        C786410Ut5.k5(((C781300Ukq) aLAdapterS9S0100000_12.l0).LJIIIIZZ, 1.0f);
        ((C781300Ukq) aLAdapterS9S0100000_12.l0).LJIIIIZZ.animate().alpha(0.0f).setDuration(200L).start();
    }

    public static final void onAnimationEnd$9(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        NextLiveData<Boolean> nextLiveData;
        int i;
        View view = ((LivePreviewAiSummaryNewWidget) aLAdapterS9S0100000_12.l0).getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C0TL0 c0tl0 = ((LivePreviewAiSummaryNewWidget) aLAdapterS9S0100000_12.l0).LLJJI;
        if (c0tl0 != null) {
            for (Pair<TuxTextView, C745190TKz> pair : c0tl0.getAiSummaryContentViewList()) {
                for (AlphaSpan alphaSpan : (ArrayList) pair.getSecond().LIZJ) {
                    if (((LiveAiSummaryTypewriterAnimConfig) C745070TKn.LIZIZ.getValue()).hasTypewriterAnim) {
                        i = 0;
                    } else {
                        i = 225;
                    }
                    alphaSpan.alpha = i;
                }
                C786410Ut5.B5(pair.getFirst(), C745070TKn.LIZ());
            }
        }
        LivePreviewAiSummaryNewWidget livePreviewAiSummaryNewWidget = (LivePreviewAiSummaryNewWidget) aLAdapterS9S0100000_12.l0;
        livePreviewAiSummaryNewWidget.LLJJJJ = null;
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = livePreviewAiSummaryNewWidget.M1();
        if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILZLL) != null) {
            nextLiveData.setValue(Boolean.TRUE);
        }
        ((LivePreviewAiSummaryNewWidget) aLAdapterS9S0100000_12.l0).Q1();
    }

    public static final void onAnimationStart$0(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        View view = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).getView();
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C19ME c19me;
        View view = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).LL;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            c19me.endToEnd = -1;
            View view2 = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).LL;
            if (view2 != null) {
                C786410Ut5.W5(view2, c19me);
            }
            View view3 = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).getView();
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
            View view4 = ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).LLILLJJLI;
            if (view4 != null) {
                C786410Ut5.T4(view4, 0.0f);
            }
            ((LiveMarketingWidget) aLAdapterS9S0100000_12.l0).A1();
        }
    }

    public static final void onAnimationStart$10(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationStart(animator);
        ((C746290TPf) aLAdapterS9S0100000_12.l0).LLILZIL = true;
    }

    public static final void onAnimationStart$11(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ((Function0) aLAdapterS9S0100000_12.l0).invoke();
    }

    public static final void onAnimationStart$12(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        View view = (View) aLAdapterS9S0100000_12.l0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static final void onAnimationStart$13(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationStart$14(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        View view = (View) aLAdapterS9S0100000_12.l0;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS112S0100000_12(view, 503), 500L);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationStart(animator);
        ImageView imageView = ((BottomLeftSlotWidget) aLAdapterS9S0100000_12.l0).LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        ImageView imageView = ((C785060Uqu) aLAdapterS9S0100000_12.l0).LLJ;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationStart(animator);
        LiveIconView liveIconView = ((C785000Uqo) ((AObserverS78S0400000_12) aLAdapterS9S0100000_12.l0).l3).LLILZLL;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 4);
        }
    }

    public static final void onAnimationStart$5(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationStart$6(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C12ES.LJIILL(0, (View) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationStart$7(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        C12ES.LJIILL(0, (View) aLAdapterS9S0100000_12.l0);
    }

    public static final void onAnimationStart$8(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.Qb((ImageView) aLAdapterS9S0100000_12.l0, 0.0f);
        C786410Ut5.rc((ImageView) aLAdapterS9S0100000_12.l0, 0.0f);
        C786410Ut5.V4((ImageView) aLAdapterS9S0100000_12.l0, 0.5f);
    }

    public static final void onAnimationStart$9(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        super.onAnimationStart(animator);
        C746290TPf c746290TPf = (C746290TPf) aLAdapterS9S0100000_12.l0;
        c746290TPf.LLILZ = true;
        int visibility = c746290TPf.getVisibility();
        c746290TPf.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c746290TPf);
        C0TKM c0tkm = ((C746290TPf) aLAdapterS9S0100000_12.l0).LLIZLLLIL;
        if (c0tkm != null) {
            c0tkm.LIZ();
        }
    }
}
