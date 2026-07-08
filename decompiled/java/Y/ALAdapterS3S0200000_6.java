package Y;

import X.C013C;
import X.C0HML;
import X.C1295960jpS;
import X.C15DF;
import X.C16F5;
import X.C189200o6;
import X.C371330Eh9;
import X.C423560GjC;
import X.C423580GjE;
import X.C423590GjF;
import X.C423600GjG;
import X.C423610GjH;
import X.C423630GjJ;
import X.C428230Gqj;
import X.C428860Grk;
import X.C453470HqL;
import X.C500260Jjc;
import X.C661350Pwr;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC20236714Gf;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.DanmakuSwitchAssem;
import com.ss.android.ugc.aweme.im.messagelist.ui.MessageListItemAnimator;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.abroll.StoryAbRollProgressButton;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ALAdapterS3S0200000_6 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 2:
                onAnimationCancel$1(this, animator);
                break;
            case 15:
                onAnimationCancel$2(this, animator);
                break;
            case 16:
                onAnimationCancel$3(this, animator);
                break;
            case 22:
                onAnimationCancel$4(this, animator);
                break;
            case 23:
                onAnimationCancel$5(this, animator);
                break;
            case 27:
                onAnimationCancel$6(this, animator);
                break;
            case 29:
                onAnimationCancel$7(this, animator);
                break;
            case 31:
                onAnimationCancel$8(this, animator);
                break;
            case 35:
                onAnimationCancel$9(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationCancel$10(this, animator);
                break;
            case 38:
                onAnimationCancel$11(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
                break;
            case 2:
                onAnimationEnd$1(this, animator);
                break;
            case 3:
                onAnimationEnd$2(this, animator);
                break;
            case 4:
            case 21:
            case 35:
            default:
                super.onAnimationEnd(animator);
                break;
            case 5:
                onAnimationEnd$3(this, animator);
                break;
            case 6:
                onAnimationEnd$4(this, animator);
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
            case 14:
                onAnimationEnd$12(this, animator);
                break;
            case 15:
                onAnimationEnd$13(this, animator);
                break;
            case 16:
                onAnimationEnd$14(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$16(this, animator);
                break;
            case 19:
                onAnimationEnd$17(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$18(this, animator);
                break;
            case 22:
                onAnimationEnd$19(this, animator);
                break;
            case 23:
                onAnimationEnd$20(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$21(this, animator);
                break;
            case 25:
                onAnimationEnd$22(this, animator);
                break;
            case 26:
                onAnimationEnd$23(this, animator);
                break;
            case 27:
                onAnimationEnd$24(this, animator);
                break;
            case 28:
                onAnimationEnd$25(this, animator);
                break;
            case 29:
                onAnimationEnd$26(this, animator);
                break;
            case 30:
                onAnimationEnd$27(this, animator);
                break;
            case 31:
                onAnimationEnd$28(this, animator);
                break;
            case 32:
                onAnimationEnd$29(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$30(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationEnd$31(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationEnd$32(this, animator);
                break;
            case 37:
                onAnimationEnd$33(this, animator);
                break;
            case 38:
                onAnimationEnd$34(this, animator);
                break;
            case 39:
                onAnimationEnd$35(this, animator);
                break;
            case 40:
                onAnimationEnd$36(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
            case 5:
            case 6:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 19:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 23:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 35:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$3(this, animator);
                break;
            case 7:
                onAnimationStart$4(this, animator);
                break;
            case 8:
                onAnimationStart$5(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$6(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$7(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$8(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$9(this, animator);
                break;
            case 15:
                onAnimationStart$10(this, animator);
                break;
            case 16:
                onAnimationStart$11(this, animator);
                break;
            case 21:
                onAnimationStart$12(this, animator);
                break;
            case 22:
                onAnimationStart$13(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationStart$14(this, animator);
                break;
            case 30:
                onAnimationStart$15(this, animator);
                break;
            case 31:
                onAnimationStart$16(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationStart$17(this, animator);
                break;
        }
    }

    public ALAdapterS3S0200000_6(View view, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = null;
    }

    public static final void onAnimationCancel$0(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0).itemView, 1.0f);
    }

    public static final void onAnimationCancel$1(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0).itemView, 0.0f);
        ((C423630GjJ) aLAdapterS3S0200000_6.l1).LLJJJIL = (RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0;
    }

    public static final void onAnimationCancel$10(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView, 1.0f);
    }

    public static final void onAnimationCancel$11(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C013C) aLAdapterS3S0200000_6.l0).element = true;
    }

    public static final void onAnimationCancel$2(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C423610GjH.LJJIJIL(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView);
    }

    public static final void onAnimationCancel$3(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C423610GjH.LJJIJIL(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView);
    }

    public static final void onAnimationCancel$4(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C423590GjF.LJJIJL(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView);
    }

    public static final void onAnimationCancel$5(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.LJJJZ((C1295960jpS) aLAdapterS3S0200000_6.l1, (FrameLayout) aLAdapterS3S0200000_6.l0);
    }

    public static final void onAnimationCancel$6(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C428230Gqj) aLAdapterS3S0200000_6.l0).LLJJ.removeAllAnimatorListeners();
        ((C428230Gqj) aLAdapterS3S0200000_6.l0).LLJJIJI = false;
        ((Function0) aLAdapterS3S0200000_6.l1).invoke();
    }

    public static final void onAnimationCancel$7(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.Mb(1.0f, (TextView) aLAdapterS3S0200000_6.l0);
        C786410Ut5.nc(1.0f, (TextView) aLAdapterS3S0200000_6.l0);
        C786410Ut5.LLIL((TextView) aLAdapterS3S0200000_6.l0, 8);
        ((AnimatorSet) aLAdapterS3S0200000_6.l1).removeAllListeners();
    }

    public static final void onAnimationCancel$8(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C423580GjE.LJJIJIL(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView);
    }

    public static final void onAnimationCancel$9(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((ObjectAnimator) aLAdapterS3S0200000_6.l0).cancel();
        ((ObjectAnimator) aLAdapterS3S0200000_6.l1).cancel();
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0).itemView, 1.0f);
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        ((C423630GjJ) aLAdapterS3S0200000_6.l1).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0);
        C423630GjJ c423630GjJ = (C423630GjJ) aLAdapterS3S0200000_6.l1;
        if (!c423630GjJ.LJIIZILJ()) {
            c423630GjJ.LJIIJ();
        }
        ((ArrayList) ((C423630GjJ) aLAdapterS3S0200000_6.l1).LLJJIJIL).remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0);
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0).itemView, 0.0f);
        ((C423630GjJ) aLAdapterS3S0200000_6.l1).LLJJJIL = (RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0;
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        ((C423630GjJ) aLAdapterS3S0200000_6.l1).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0);
        C423630GjJ c423630GjJ = (C423630GjJ) aLAdapterS3S0200000_6.l1;
        if (!c423630GjJ.LJIIZILJ()) {
            c423630GjJ.LJIIJ();
        }
        ((ArrayList) ((C423630GjJ) aLAdapterS3S0200000_6.l1).LLJJJ).remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0);
    }

    public static final void onAnimationEnd$10(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((ArrayList) ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LLJILLL).remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView, 1.0f);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$11(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        TuxTextView tuxTextView = ((DanmakuSwitchAssem) aLAdapterS3S0200000_6.l0).LLLI;
        if (tuxTextView != null) {
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        C786410Ut5.W4((LinearLayout) aLAdapterS3S0200000_6.l1, 1.0f);
    }

    public static final void onAnimationEnd$12(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS3S0200000_6.l0).invoke();
        C786410Ut5.T4((View) aLAdapterS3S0200000_6.l1, 1.0f);
    }

    public static final void onAnimationEnd$13(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        C423610GjH.LJJIJIL(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView);
        ((C423610GjH) aLAdapterS3S0200000_6.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C423610GjH c423610GjH = (C423610GjH) aLAdapterS3S0200000_6.l0;
        if (!c423610GjH.LJIIZILJ()) {
            c423610GjH.LJIIJ();
        }
    }

    public static final void onAnimationEnd$14(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        C423610GjH.LJJIJIL(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1).itemView);
        ((C423610GjH) aLAdapterS3S0200000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C423610GjH c423610GjH = (C423610GjH) aLAdapterS3S0200000_6.l0;
        if (!c423610GjH.LJIIZILJ()) {
            c423610GjH.LJIIJ();
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C0HML c0hml = (C0HML) aLAdapterS3S0200000_6.l0;
        FrameLayout frameLayout = c0hml.LIZLLL;
        if (frameLayout != null) {
            HandlerHook.viewPost(c0hml.LIZ, new ARunnableS75S0200000_6(c0hml, frameLayout, 74));
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) aLAdapterS3S0200000_6.l1;
        Boolean bool = Boolean.TRUE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void onAnimationEnd$16(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C500260Jjc.LJIILIIL(((C15DF) aLAdapterS3S0200000_6.l0).findViewById(R.id.mjz));
        View view = ((C15DF) aLAdapterS3S0200000_6.l0).LLJLILLLLZIIL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        TuxTextView tuxTextView = ((C15DF) aLAdapterS3S0200000_6.l0).LLJLLL;
        if (tuxTextView != null) {
            C500260Jjc.LJIILIIL(tuxTextView);
        }
        View view2 = ((C15DF) aLAdapterS3S0200000_6.l0).LLJLILLLLZIIL;
        if (view2 != null) {
            C786410Ut5.Jc(view2, 0.0f);
        }
        View view3 = ((C15DF) aLAdapterS3S0200000_6.l0).LLJLILLLLZIIL;
        if (view3 != null) {
            C786410Ut5.T4(view3, 1.0f);
        }
        TuxTextView tuxTextView2 = ((C15DF) aLAdapterS3S0200000_6.l0).LLJLLL;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 1.0f);
        }
        C786410Ut5.Vc((TuxTextView) aLAdapterS3S0200000_6.l1, 0.0f);
    }

    public static final void onAnimationEnd$17(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Vc((TuxTextView) aLAdapterS3S0200000_6.l0, 0.0f);
        Function0 function0 = (Function0) aLAdapterS3S0200000_6.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$18(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C16F5) aLAdapterS3S0200000_6.l0).setText((Spannable) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationEnd$19(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        ((C423590GjF) aLAdapterS3S0200000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((C423590GjF) aLAdapterS3S0200000_6.l0).LLJJJ.remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C423590GjF.LJJIJIL((C423590GjF) aLAdapterS3S0200000_6.l0);
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C16F5) aLAdapterS3S0200000_6.l0).setText((Spannable) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationEnd$20(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJJJZ((C1295960jpS) aLAdapterS3S0200000_6.l1, (FrameLayout) aLAdapterS3S0200000_6.l0);
    }

    public static final void onAnimationEnd$21(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS3S0200000_6.l0, 0.0f);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0200000_6.l0);
        C786410Ut5.ed((View) aLAdapterS3S0200000_6.l1, 0.0f);
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationEnd$22(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0200000_6.l0);
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS3S0200000_6.l1;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$23(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJZ(8, ((C428230Gqj) aLAdapterS3S0200000_6.l0).LLILLL);
        Function0 function0 = (Function0) aLAdapterS3S0200000_6.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$24(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C428230Gqj) aLAdapterS3S0200000_6.l0).LLJJ.removeAllAnimatorListeners();
        C428230Gqj c428230Gqj = (C428230Gqj) aLAdapterS3S0200000_6.l0;
        c428230Gqj.LLJJIJI = false;
        c428230Gqj.LLJJ.setProgress(1.0f);
        ((C428230Gqj) aLAdapterS3S0200000_6.l0).LLJJ.pauseAnimation();
        ((Function0) aLAdapterS3S0200000_6.l1).invoke();
    }

    public static final void onAnimationEnd$25(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ((InterfaceC20236714Gf) aLAdapterS3S0200000_6.l0).LJJIFFI(new AwS585S0100000_6((ValueAnimator) aLAdapterS3S0200000_6.l1, 309), Unit.LIZ);
    }

    public static final void onAnimationEnd$26(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Mb(1.0f, (TextView) aLAdapterS3S0200000_6.l0);
        C786410Ut5.nc(1.0f, (TextView) aLAdapterS3S0200000_6.l0);
        C786410Ut5.LLIL((TextView) aLAdapterS3S0200000_6.l0, 8);
        ((AnimatorSet) aLAdapterS3S0200000_6.l1).removeAllListeners();
    }

    public static final void onAnimationEnd$27(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS3S0200000_6.l0, 0.0f);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0200000_6.l0);
        C786410Ut5.ed((View) aLAdapterS3S0200000_6.l1, 0.0f);
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationEnd$28(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        ((C423580GjE) aLAdapterS3S0200000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C423580GjE c423580GjE = (C423580GjE) aLAdapterS3S0200000_6.l0;
        if (!c423580GjE.LJIIZILJ()) {
            c423580GjE.LJIIJ();
        }
    }

    public static final void onAnimationEnd$29(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS3S0200000_6.l0;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        View view = (View) aLAdapterS3S0200000_6.l1;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.9f));
        objectAnimatorOfPropertyValuesHolder.setDuration(75L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.9f, 1.0f));
        objectAnimatorOfPropertyValuesHolder2.setDuration(75L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        animatorSet.start();
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0200000_6.l0);
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aLAdapterS3S0200000_6.l1;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$30(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJLZ(4, (ViewGroup) aLAdapterS3S0200000_6.l0);
        Function0 function0 = (Function0) aLAdapterS3S0200000_6.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$31(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C428860Grk) aLAdapterS3S0200000_6.l0).LLJILJILJ.LIZIZ((CharSequence) aLAdapterS3S0200000_6.l1, false, true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C428860Grk c428860Grk = (C428860Grk) aLAdapterS3S0200000_6.l0;
        valueAnimatorOfFloat.setDuration(110L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c428860Grk, 151));
        valueAnimatorOfFloat.start();
    }

    public static final void onAnimationEnd$32(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            listeners.remove(aLAdapterS3S0200000_6);
        }
    }

    public static final void onAnimationEnd$33(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJLZ(4, (ViewGroup) aLAdapterS3S0200000_6.l0);
        Function0 function0 = (Function0) aLAdapterS3S0200000_6.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$34(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        if (((C013C) aLAdapterS3S0200000_6.l0).element) {
            return;
        }
        ((C453470HqL) aLAdapterS3S0200000_6.l1).LLJILJIL = null;
        C786410Ut5.M5((C453470HqL) aLAdapterS3S0200000_6.l1, 1.0f);
        C786410Ut5.Bd((C453470HqL) aLAdapterS3S0200000_6.l1, 0.0f);
        ((C453470HqL) aLAdapterS3S0200000_6.l1).LIZIZ();
    }

    public static final void onAnimationEnd$35(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ((StoryAbRollProgressButton) aLAdapterS3S0200000_6.l0).setProgress(100.0f);
        ((AnimatorListenerAdapter) aLAdapterS3S0200000_6.l1).onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$36(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        super.onAnimationEnd(animator);
        StoryAbRollProgressButton storyAbRollProgressButton = (StoryAbRollProgressButton) aLAdapterS3S0200000_6.l0;
        if (!storyAbRollProgressButton.LLJJ) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(32.0f, 100.0f);
        StoryAbRollProgressButton storyAbRollProgressButton2 = (StoryAbRollProgressButton) aLAdapterS3S0200000_6.l0;
        AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) aLAdapterS3S0200000_6.l1;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        double dLIZIZ = 1.5d;
        try {
            SettingsManager.LIZLLL().getClass();
            dLIZIZ = SettingsManager.LIZIZ("ab_roll_press_time_in_second", 1.5d);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        valueAnimatorOfFloat.setDuration((((long) dLIZIZ) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - ((long) 500));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(storyAbRollProgressButton2, 181));
        valueAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(animatorListenerAdapter, storyAbRollProgressButton2, 39));
        valueAnimatorOfFloat.start();
        storyAbRollProgressButton.LLIZ = valueAnimatorOfFloat;
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((View) aLAdapterS3S0200000_6.l0).setBackground((GradientDrawable) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationEnd$5(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        ((C423560GjC) aLAdapterS3S0200000_6.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C423560GjC c423560GjC = (C423560GjC) aLAdapterS3S0200000_6.l0;
        if (!c423560GjC.LJIIZILJ()) {
            c423560GjC.LJIIJ();
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        animator.getListeners().remove(aLAdapterS3S0200000_6);
        ((C423560GjC) aLAdapterS3S0200000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        C423560GjC c423560GjC = (C423560GjC) aLAdapterS3S0200000_6.l0;
        if (!c423560GjC.LJIIZILJ()) {
            c423560GjC.LJIIJ();
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((ArrayList) ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LLJILJILJ).remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$8(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((ArrayList) ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LLJILJIL).remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$9(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((ArrayList) ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LLJJ).remove((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l1);
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LJJIIZI();
    }

    public static final void onAnimationStart$0(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C661350Pwr.LJIIL((C371330Eh9) aLAdapterS3S0200000_6.l0);
        C661350Pwr.LIZJ((View) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationStart$1(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0).itemView, 0.0f);
        ((C423630GjJ) aLAdapterS3S0200000_6.l1).getClass();
    }

    public static final void onAnimationStart$10(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423610GjH) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$11(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423610GjH) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$12(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        long startDelay = ((AnimatorSet) aLAdapterS3S0200000_6.l0).getStartDelay();
        C16F5 c16f5 = (C16F5) aLAdapterS3S0200000_6.l1;
        HandlerHook.viewPostDelay(c16f5, new ARunnableS106S0100000_6((Object) c16f5, 148), startDelay);
    }

    public static final void onAnimationStart$13(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423590GjF) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$14(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0200000_6.l0);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationStart$15(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0200000_6.l0);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0200000_6.l1);
    }

    public static final void onAnimationStart$16(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423580GjE) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$17(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423600GjG) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS3S0200000_6.l0).itemView, 1.0f);
        ((C423630GjJ) aLAdapterS3S0200000_6.l1).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        long startDelay = ((AnimatorSet) aLAdapterS3S0200000_6.l0).getStartDelay();
        C16F5 c16f5 = (C16F5) aLAdapterS3S0200000_6.l1;
        HandlerHook.viewPostDelay(c16f5, new ARunnableS106S0100000_6((Object) c16f5, 7), startDelay);
    }

    public static final void onAnimationStart$4(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423560GjC) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$5(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((C423560GjC) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$6(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ViewGroup viewGroup;
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).getClass();
        ViewParent parent = ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).LLJ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(false);
        }
    }

    public static final void onAnimationStart$7(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$8(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).getClass();
    }

    public static final void onAnimationStart$9(ALAdapterS3S0200000_6 aLAdapterS3S0200000_6, Animator animator) {
        ((MessageListItemAnimator) aLAdapterS3S0200000_6.l0).getClass();
    }

    public ALAdapterS3S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
