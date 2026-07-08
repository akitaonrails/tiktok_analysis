package X;

import Y.AAListenerS322S0100000_11;
import Y.AUListenerS3S0101001_11;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Rlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705520Rlu {
    public static final Interpolator LIZ;

    static {
        new BPEAHandler(Looper.getMainLooper());
        LIZ = C1619980sG4.LIZLLL();
    }

    public static ValueAnimator LIZ(final View view, final float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i = 0;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, f).setDuration(300L);
        duration.setInterpolator(LIZ);
        if (C299640Boo.LIZ()) {
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Rlv
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Float f2;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if ((animatedValue instanceof Float) && (f2 = (Float) animatedValue) != null) {
                        float fFloatValue = f2.floatValue();
                        C786410Ut5.ed(view, f - fFloatValue);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = (int) fFloatValue;
                        C786410Ut5.W5(view, layoutParams);
                    }
                }
            });
            duration.addListener(new AAListenerS322S0100000_11(view, 0));
            return duration;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        }
        duration.addUpdateListener(new AUListenerS3S0101001_11(f + i, i, view, 0));
        duration.addListener(new AAListenerS322S0100000_11(view, 1));
        return duration;
    }

    public static ValueAnimator LIZIZ(final View view, float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        final int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, f + i).setDuration(200L);
        duration.setInterpolator(LIZ);
        final float translationY = view.getTranslationY();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams2.topMargin;
        }
        duration.addUpdateListener(new AUListenerS3S0101001_11(translationY, i2, view, 1));
        duration.addListener(new AnimatorListenerAdapter() { // from class: X.0Rlt
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup.MarginLayoutParams marginLayoutParams3;
                C786410Ut5.LJLLLLLL(8, view);
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.topMargin = i2;
                    }
                } else {
                    marginLayoutParams3 = null;
                }
                C786410Ut5.ed(view, translationY);
                C786410Ut5.W5(view, marginLayoutParams3);
            }
        });
        return duration;
    }
}
