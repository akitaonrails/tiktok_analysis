package X;

import Y.ALAdapterS3S0100000_6;
import Y.AUListenerS253S0100000_2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS408S0200000_7;

/* JADX INFO: renamed from: X.0Gfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421390Gfh {
    public static final int LJIILLIIL = C439101nJ.LIZ(178);
    public static final int LJIIZILJ = C439101nJ.LIZ(30);
    public static final int LJIJ = C439101nJ.LIZ(3);
    public static final long LJIJI = 500;
    public final View LIZ;
    public final ViewGroup LIZIZ;
    public final ViewGroup LIZJ;
    public final C1126540fQC LIZLLL;
    public final C16F5 LJ;
    public final ViewGroup LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final Function0<Unit> LJIIJ;
    public final Integer LJIIJJI;
    public final List<String> LJIIL;
    public final String LJIILIIL;
    public boolean LJIILJJIL;
    public AnimatorSet LJIILL;

    public final void LJFF() {
        C786410Ut5.LJLLLLLL(8, this.LIZ);
        C786410Ut5.LJLZ(8, this.LJFF);
        C786410Ut5.LLJJI(this.LIZLLL, 8);
        ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
        int i = LJIIZILJ;
        layoutParams.width = i;
        C786410Ut5.X5(layoutParams, this.LIZIZ);
        ViewGroup.LayoutParams layoutParams2 = this.LIZJ.getLayoutParams();
        layoutParams2.width = i;
        C786410Ut5.X5(layoutParams2, this.LIZJ);
        C786410Ut5.T4(this.LJI, 1.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C497740JfY.LJI(-12303292, "#44000000"));
        gradientDrawable.setCornerRadius(C497740JfY.LIZIZ(4));
        this.LIZJ.setBackground(gradientDrawable);
        this.LJIILJJIL = false;
    }

    public final void LJI() {
        AnimatorSet animatorSet = this.LJIILL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJIILJJIL = false;
    }

    public static void LIZLLL(Animator animator) {
        if (animator instanceof AnimatorSet) {
            Iterator<Animator> it2 = ((AnimatorSet) animator).getChildAnimations().iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next());
            }
        }
        animator.removeAllListeners();
    }

    public static ObjectAnimator LIZ(float f, View view) {
        float f2 = 0.0f;
        if (f == 0.0f) {
            f2 = 1.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f2, f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setStartDelay(0L);
        return objectAnimatorOfFloat;
    }

    public static ValueAnimator LIZJ(View view, int i, int i2) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(linearInterpolator);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 3));
        return valueAnimatorOfInt;
    }

    public static AnimatorSet LJ(int i, int i2, View view) {
        Pair pair;
        PathInterpolator pathInterpolator = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        float fLIZIZ = C497740JfY.LIZIZ(90);
        if (i2 == 1) {
            pair = new Pair(Float.valueOf(-fLIZIZ), Float.valueOf(i));
        } else {
            pair = new Pair(Float.valueOf(i), Float.valueOf(-fLIZIZ));
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        objectAnimatorOfFloat2.setStartDelay(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new ALAdapterS3S0100000_6(view, 3));
        return animatorSet;
    }

    public static AnimatorSet LIZIZ(View view, C1126540fQC c1126540fQC, View view2, long j, boolean z) {
        float f;
        float f2;
        float width = view.getWidth();
        float measuredWidth = c1126540fQC.getMeasuredWidth() + width;
        if (z) {
            f = width;
            f2 = measuredWidth;
            width = 0.0f;
            measuredWidth = 0.0f;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        PathInterpolator pathInterpolator = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1126540fQC, (Property<C1126540fQC, Float>) View.TRANSLATION_X, width, f);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, measuredWidth, f2);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setStartDelay(j);
        return animatorSet;
    }

    public C421390Gfh(View view, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, C1126540fQC c1126540fQC, C16F5 c16f5, ViewGroup viewGroup, C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2, C1324720kZq c1324720kZq3, C020Y c020y, AwS408S0200000_7 awS408S0200000_7, Integer num, List list, String str) {
        this.LIZ = view;
        this.LIZIZ = constraintLayout;
        this.LIZJ = constraintLayout2;
        this.LIZLLL = c1126540fQC;
        this.LJ = c16f5;
        this.LJFF = viewGroup;
        this.LJI = c1324720kZq;
        this.LJII = c1324720kZq2;
        this.LJIIIIZZ = c1324720kZq3;
        this.LJIIIZ = c020y;
        this.LJIIJ = awS408S0200000_7;
        this.LJIIJJI = num;
        this.LJIIL = list;
        this.LJIILIIL = str;
    }
}
