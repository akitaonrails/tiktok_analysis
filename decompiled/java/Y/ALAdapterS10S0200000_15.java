package Y;

import X.C0GRL;
import X.C0GRS;
import X.C12ES;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C20441214yg;
import X.C20736316Cj;
import X.C500260Jjc;
import X.C930540aK4;
import X.C942410adD;
import X.C984930bjn;
import X.C984940bjo;
import X.C984950bjp;
import X.C984960bjq;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class ALAdapterS10S0200000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
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
            case 3:
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        ConstraintLayout constraintLayout;
        super.onAnimationEnd(animator);
        if (!Intrinsics.LJFF(((C984940bjo) aLAdapterS10S0200000_15.l1).LLILLL, Boolean.TRUE) && (constraintLayout = ((C984940bjo) aLAdapterS10S0200000_15.l1).LLJ) != null) {
            constraintLayout.setClickable(false);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        ConstraintLayout constraintLayout;
        super.onAnimationEnd(animator);
        if (!Intrinsics.LJFF(((C984930bjn) aLAdapterS10S0200000_15.l1).LLILZ, Boolean.TRUE) && (constraintLayout = ((C984930bjn) aLAdapterS10S0200000_15.l1).LLJI) != null) {
            constraintLayout.setClickable(false);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        ((ObjectAnimator) aLAdapterS10S0200000_15.l0).removeListener(aLAdapterS10S0200000_15);
        ((MultiGuestUserInfoFragment) aLAdapterS10S0200000_15.l1).isAnimationApplyTV = false;
    }

    public static final void onAnimationEnd$3(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1324720kZq) aLAdapterS10S0200000_15.l0).setImageDrawable(null);
        C12ES.LJIILL(4, (C1324720kZq) aLAdapterS10S0200000_15.l0);
        C12ES.LJIILL(4, (C1324720kZq) aLAdapterS10S0200000_15.l1);
    }

    public static final void onAnimationEnd$4(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1324720kZq) aLAdapterS10S0200000_15.l0).setImageDrawable(null);
        C12ES.LJIILL(4, (C1324720kZq) aLAdapterS10S0200000_15.l0);
        C12ES.LJIILL(4, (C1324720kZq) aLAdapterS10S0200000_15.l1);
    }

    public static final void onAnimationEnd$5(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((C942410adD) aLAdapterS10S0200000_15.l0).LJI;
        View view2 = (View) aLAdapterS10S0200000_15.l1;
        if (view != view2) {
            return;
        }
        view2.animate().setListener(null);
        C930540aK4.LJJIJL((View) aLAdapterS10S0200000_15.l1);
        ((C942410adD) aLAdapterS10S0200000_15.l0).LJI = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        ((ObjectAnimator) aLAdapterS10S0200000_15.l0).removeListener(aLAdapterS10S0200000_15);
        ((VoiceChatUserInfoFragment) aLAdapterS10S0200000_15.l1).getClass();
    }

    public static final void onAnimationEnd$7(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1324720kZq) aLAdapterS10S0200000_15.l0).setImageDrawable(null);
        C12ES.LJIILL(4, (C1324720kZq) aLAdapterS10S0200000_15.l0);
        C12ES.LJIILL(4, (C1324720kZq) aLAdapterS10S0200000_15.l1);
    }

    public static final void onAnimationStart$0(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        super.onAnimationStart(animator);
        C984960bjq c984960bjq = (C984960bjq) aLAdapterS10S0200000_15.l0;
        int visibility = c984960bjq.getVisibility();
        c984960bjq.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c984960bjq);
        C20441214yg.LIZIZ("CatchBeansMvpContainerLayout", "MVP animation start");
        ((C0GRS) ((C984960bjq) aLAdapterS10S0200000_15.l0).findViewById(R.id.user_stroke)).setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.etp, ((C984940bjo) aLAdapterS10S0200000_15.l1).getContext()), C20736316Cj.LIZIZ(R.attr.eto, ((C984940bjo) aLAdapterS10S0200000_15.l1).getContext())});
    }

    public static final void onAnimationStart$1(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        super.onAnimationStart(animator);
        C984950bjp c984950bjp = (C984950bjp) aLAdapterS10S0200000_15.l0;
        int visibility = c984950bjp.getVisibility();
        c984950bjp.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c984950bjp);
        C20441214yg.LIZIZ("TakeTheStageMvpContainerLayout", "MVP animation start");
        ((C0GRL) ((C984950bjp) aLAdapterS10S0200000_15.l0).findViewById(R.id.user_stroke)).setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.etp, ((C984930bjn) aLAdapterS10S0200000_15.l1).getContext()), C20736316Cj.LIZIZ(R.attr.eto, ((C984930bjn) aLAdapterS10S0200000_15.l1).getContext())});
    }

    public static final void onAnimationStart$2(ALAdapterS10S0200000_15 aLAdapterS10S0200000_15, Animator animator) {
        View viewFindViewById;
        super.onAnimationStart(animator);
        C500260Jjc.LLFFF((View) aLAdapterS10S0200000_15.l0);
        View view = ((LinkDialog) aLAdapterS10S0200000_15.l1).LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.view_shadow)) != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
    }

    public ALAdapterS10S0200000_15(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
