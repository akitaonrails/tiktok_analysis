package Y;

import X.C15E1;
import X.C15E2;
import X.C15EB;
import X.C15EC;
import X.C15EJ;
import X.C15EK;
import X.C15EM;
import X.C15EN;
import X.C15EO;
import X.C15EQ;
import X.C20485615Dy;
import X.C20485715Dz;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes32.dex */
public class ALAdapterS5S0400000_31 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$3(this, animator);
                break;
            case 14:
                onAnimationCancel$4(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationCancel$5(this, animator);
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
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$12(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$13(this, animator);
                break;
            case 14:
                onAnimationEnd$14(this, animator);
                break;
            case 15:
                onAnimationEnd$15(this, animator);
                break;
            case 16:
                onAnimationEnd$16(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$17(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$18(this, animator);
                break;
            case 19:
                onAnimationEnd$19(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$20(this, animator);
                break;
            case 21:
                onAnimationEnd$21(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
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
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
            case 6:
                onAnimationStart$6(this, animator);
                break;
            case 7:
                onAnimationStart$7(this, animator);
                break;
            case 8:
                onAnimationStart$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$12(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$13(this, animator);
                break;
            case 14:
                onAnimationStart$14(this, animator);
                break;
            case 15:
                onAnimationStart$15(this, animator);
                break;
            case 16:
                onAnimationStart$16(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$17(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationStart$18(this, animator);
                break;
            case 19:
                onAnimationStart$19(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationStart$20(this, animator);
                break;
            case 21:
                onAnimationStart$21(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C15EB c15eb = (C15EB) aLAdapterS5S0400000_31.l0;
        View view = (View) aLAdapterS5S0400000_31.l2;
        c15eb.getClass();
        C15EB.LJJIIZI(view);
    }

    public static final void onAnimationCancel$1(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((View) aLAdapterS5S0400000_31.l2).setTranslationZ(0.0f);
    }

    public static final void onAnimationCancel$2(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((View) aLAdapterS5S0400000_31.l2).setTranslationZ(0.0f);
    }

    public static final void onAnimationCancel$3(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
    }

    public static final void onAnimationCancel$4(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
    }

    public static final void onAnimationCancel$5(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l3).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((View) aLAdapterS5S0400000_31.l2).setTranslationZ(0.0f);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EB) aLAdapterS5S0400000_31.l0).LLJJIII.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJJIJIIJIL();
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l3).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((View) aLAdapterS5S0400000_31.l2).setTranslationZ(0.0f);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15EC) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15EB) aLAdapterS5S0400000_31.l0).LLJJIJIL.remove(((C15EC) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJJIJIIJIL();
    }

    public static final void onAnimationEnd$10(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l3).setListener(null);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LLJJIII.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$11(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15EM) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LLJJIJIL.remove(((C15EM) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$12(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15EM) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LLJJIJIL.remove(((C15EM) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$13(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LLJJIJIIJIL.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EQ) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$14(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l3).setListener(null);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LLJJ.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$15(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJIIIZ(((C20485715Dz) aLAdapterS5S0400000_31.l1).LIZ);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LLJJIJI.remove(((C20485715Dz) aLAdapterS5S0400000_31.l1).LIZ);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$16(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJIIIZ(((C20485715Dz) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LLJJIJI.remove(((C20485715Dz) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$17(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LLJJIII.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$18(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l3).setListener(null);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15E1) aLAdapterS5S0400000_31.l0).LLJJI.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$19(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15E2) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15E1) aLAdapterS5S0400000_31.l0).LLJJIJIIJIL.remove(((C15E2) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l3).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((View) aLAdapterS5S0400000_31.l2).setTranslationZ(0.0f);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15EC) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15EB) aLAdapterS5S0400000_31.l0).LLJJIJIL.remove(((C15EC) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJJIJIIJIL();
    }

    public static final void onAnimationEnd$20(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15E2) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15E1) aLAdapterS5S0400000_31.l0).LLJJIJIIJIL.remove(((C15E2) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$21(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15E1) aLAdapterS5S0400000_31.l0).LLJJIJI.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15E1) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((View) aLAdapterS5S0400000_31.l3).setTranslationZ(0.0f);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EB) aLAdapterS5S0400000_31.l0).LLJJIJIIJIL.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EB) aLAdapterS5S0400000_31.l0).LJJIJIIJIL();
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l1).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l0);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LLJJIII.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l0);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LJJIIZI();
    }

    public static final void onAnimationEnd$5(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l1).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LJIIIZ(((C15EK) aLAdapterS5S0400000_31.l0).LIZ);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LLJJIJI.remove(((C15EK) aLAdapterS5S0400000_31.l0).LIZ);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LJJIIZI();
    }

    public static final void onAnimationEnd$6(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l1).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l2, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l2, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l2, 0.0f);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LJIIIZ(((C15EK) aLAdapterS5S0400000_31.l0).LIZIZ);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LLJJIJI.remove(((C15EK) aLAdapterS5S0400000_31.l0).LIZIZ);
        ((C15EJ) aLAdapterS5S0400000_31.l3).LJJIIZI();
    }

    public static final void onAnimationEnd$7(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C15EO) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15EN) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15EO) aLAdapterS5S0400000_31.l0).LLJJJ.remove(((C15EN) aLAdapterS5S0400000_31.l1).LIZ);
        ((C15EO) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$8(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        C786410Ut5.Jc((View) aLAdapterS5S0400000_31.l3, 0.0f);
        C786410Ut5.ed((View) aLAdapterS5S0400000_31.l3, 0.0f);
        ((C15EO) aLAdapterS5S0400000_31.l0).LJIIIZ(((C15EN) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15EO) aLAdapterS5S0400000_31.l0).LLJJJ.remove(((C15EN) aLAdapterS5S0400000_31.l1).LIZIZ);
        ((C15EO) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationEnd$9(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS5S0400000_31.l2).setListener(null);
        C786410Ut5.T4((View) aLAdapterS5S0400000_31.l3, 1.0f);
        ((C15EO) aLAdapterS5S0400000_31.l0).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EO) aLAdapterS5S0400000_31.l0).LLJJIJIL.remove((RecyclerView.ViewHolder) aLAdapterS5S0400000_31.l1);
        ((C15EO) aLAdapterS5S0400000_31.l0).LJJIIZI();
    }

    public static final void onAnimationStart$0(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EB) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$1(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EB) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$10(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EQ) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$11(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EQ) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$12(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EQ) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$13(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EQ) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$14(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$15(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$16(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$17(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C20485615Dy) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$18(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15E1) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$19(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15E1) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EB) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$20(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15E1) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$21(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15E1) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$3(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EB) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EJ) aLAdapterS5S0400000_31.l3).getClass();
    }

    public static final void onAnimationStart$5(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EJ) aLAdapterS5S0400000_31.l3).getClass();
    }

    public static final void onAnimationStart$6(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EJ) aLAdapterS5S0400000_31.l3).getClass();
    }

    public static final void onAnimationStart$7(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EO) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$8(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EO) aLAdapterS5S0400000_31.l0).getClass();
    }

    public static final void onAnimationStart$9(ALAdapterS5S0400000_31 aLAdapterS5S0400000_31, Animator animator) {
        ((C15EO) aLAdapterS5S0400000_31.l0).getClass();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS5S0400000_31(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C20485615Dy r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 14 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS5S0400000_31.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.15Dy, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS5S0400000_31(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C15E1 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 18 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS5S0400000_31.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.15E1, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS5S0400000_31(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C15EQ r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 10 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS5S0400000_31.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.15EQ, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS5S0400000_31(android.view.View r2, android.view.ViewPropertyAnimator r3, androidx.recyclerview.widget.RecyclerView.ViewHolder r4, X.C15EB r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            if (r6 == 0) goto L11
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS5S0400000_31.<init>(android.view.View, android.view.ViewPropertyAnimator, androidx.recyclerview.widget.RecyclerView$ViewHolder, X.15EB, int):void");
    }

    public ALAdapterS5S0400000_31(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
