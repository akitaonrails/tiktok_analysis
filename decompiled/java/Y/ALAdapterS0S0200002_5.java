package Y;

import X.C1295960jpS;
import X.C2268791DrB;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0200002_5 extends AnimatorListenerAdapter {
    public final int $t;
    public float f2;
    public float f3;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0200002_5 aLAdapterS0S0200002_5, Animator animator) {
        ValueAnimator duration = ObjectAnimator.ofFloat(0.0f, 1.0f).setDuration(700L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.TRANSLATION_X, 0.0f, aLAdapterS0S0200002_5.f2).setDuration(500L);
        duration2.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_X, 0.8f, 1.0f).setDuration(500L);
        duration3.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_Y, 0.8f, 1.0f).setDuration(500L);
        duration4.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration3, duration4);
        ValueAnimator duration5 = ObjectAnimator.ofFloat(0.0f, 1.0f).setDuration(1433L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.TRANSLATION_X, aLAdapterS0S0200002_5.f2, aLAdapterS0S0200002_5.f3).setDuration(433L);
        duration6.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_X, 1.0f, 0.8f).setDuration(433L);
        duration7.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_Y, 1.0f, 0.8f).setDuration(433L);
        duration8.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration6, duration7, duration8);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(duration, animatorSet, duration5, animatorSet2);
        animatorSet3.start();
    }

    public static final void onAnimationStart$1(ALAdapterS0S0200002_5 aLAdapterS0S0200002_5, Animator animator) {
        ObjectAnimator duration = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.ALPHA, 1.0f, 1.0f).setDuration(700L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.TRANSLATION_X, 0.0f, aLAdapterS0S0200002_5.f2).setDuration(500L);
        duration2.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_X, 0.8f, 1.0f).setDuration(500L);
        duration3.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_Y, 0.8f, 1.0f).setDuration(500L);
        duration4.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration3, duration4);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.ALPHA, 1.0f, 1.0f).setDuration(1433L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.TRANSLATION_X, aLAdapterS0S0200002_5.f2, aLAdapterS0S0200002_5.f3).setDuration(433L);
        duration6.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_X, 1.0f, 0.8f).setDuration(433L);
        duration7.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        ObjectAnimator duration8 = ObjectAnimator.ofFloat((C1295960jpS) aLAdapterS0S0200002_5.l0, (Property<C1295960jpS, Float>) View.SCALE_Y, 1.0f, 0.8f).setDuration(433L);
        duration8.setInterpolator((C2268791DrB) aLAdapterS0S0200002_5.l1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration6, duration7, duration8);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(duration, animatorSet, duration5, animatorSet2);
        animatorSet3.start();
    }

    public ALAdapterS0S0200002_5(float f, float f2, C1295960jpS c1295960jpS, C2268791DrB c2268791DrB, int i) {
        this.$t = i;
        this.l0 = c1295960jpS;
        this.f2 = f;
        this.l1 = c2268791DrB;
        this.f3 = f2;
    }
}
