package X;

import Y.AUListenerS146S0300000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.AwS80S0500000_21;

/* JADX INFO: renamed from: X.0l1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342140l1w {
    public static final /* synthetic */ int LIZ = 0;

    public static AnimatorSet LIZIZ(TuxIconView tuxIconView) {
        if (tuxIconView == null) {
            return new AnimatorSet();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.0f, 0.8f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.0f, 0.8f);
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        return animatorSet;
    }

    public static AnimatorSet LIZJ(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        if (tuxIconView != null && tuxIconView2 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(0L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.34f, 1.56f, 0.64f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(100L);
            objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 1.0f, 1.0f);
            objectAnimatorOfFloat5.setDuration(0L);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 1.0f, 1.0f);
            objectAnimatorOfFloat6.setDuration(0L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat4).after(animatorSet);
            return animatorSet2;
        }
        return new AnimatorSet();
    }

    public static AnimatorSet LIZLLL(TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        if (tuxIconView != null && tuxIconView2 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView2, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 0.8f, 1.0f);
            objectAnimatorOfFloat2.setDuration(200L);
            objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 0.8f, 1.0f);
            objectAnimatorOfFloat3.setDuration(200L);
            objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxIconView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(100L);
            objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tuxIconView, "scaleX", 0.8f, 1.0f);
            objectAnimatorOfFloat5.setDuration(200L);
            objectAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tuxIconView, "scaleY", 0.8f, 1.0f);
            objectAnimatorOfFloat6.setDuration(200L);
            objectAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
            return animatorSet;
        }
        return new AnimatorSet();
    }

    public static Animator LIZ(View view, int i, int i2, AwS80S0500000_21 awS80S0500000_21, int i3) {
        long j;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            j = 350;
        } else {
            j = 0;
        }
        if ((i3 & 16) != 0) {
            awS80S0500000_21 = null;
        }
        if (view == null) {
            return null;
        }
        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        C013C c013c = new C013C();
        c013c.element = true;
        valueAnimatorOfInt.addUpdateListener(new AUListenerS146S0300000_2(view, c013c, awS80S0500000_21, 1));
        return valueAnimatorOfInt;
    }
}
