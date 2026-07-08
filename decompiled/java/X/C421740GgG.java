package X;

import Y.ATListenerS9S0100002_6;
import Y.AUListenerS216S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: renamed from: X.0GgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421740GgG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        if (view != null) {
            view.setOnTouchListener(new ATListenerS9S0100002_6(view.getAlpha(), view, 1));
        }
    }

    public static ValueAnimator LIZIZ(View view, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(view, 175));
        valueAnimatorOfInt.setDuration(i3);
        valueAnimatorOfInt.setTarget(view);
        return valueAnimatorOfInt;
    }

    public static void LIZJ(View view, Drawable drawable, int i, int i2, long j) {
        if (i != i2) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
            Drawable drawableMutate = drawable.mutate();
            if (drawableMutate instanceof GradientDrawable) {
                ((GradientDrawable) drawableMutate).setColor(i2);
            }
            valueAnimatorOfObject.addUpdateListener(new AUListenerS216S0200000_6(view, drawableMutate, 29));
            valueAnimatorOfObject.setDuration(j);
            valueAnimatorOfObject.start();
        }
    }
}
