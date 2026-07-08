package X;

import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0fQ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126450fQ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(View view) {
        if (view == null) {
            return null;
        }
        C500260Jjc.LLFFF(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(view, 107));
        return valueAnimatorOfFloat;
    }

    public static Animator LIZIZ(View view) {
        if (view == null) {
            return null;
        }
        C500260Jjc.LLFFF(view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(130L);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(view, 108));
        return valueAnimatorOfFloat;
    }
}
