package X;

import Y.AAListenerS327S0100000_16;
import Y.ATListenerS9S0100002_6;
import Y.AUListenerS216S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: renamed from: X.0GgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421750GgH {
    public static void LIZ(View view) {
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new ATListenerS9S0100002_6(view.getAlpha(), view, 0));
    }

    public static ValueAnimator LIZIZ(View view, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(view, 43));
        valueAnimatorOfInt.setDuration(i3);
        valueAnimatorOfInt.setTarget(view);
        return valueAnimatorOfInt;
    }

    public static void LIZJ(View view, Drawable drawable, int i, int i2, long j, AAListenerS327S0100000_16 aAListenerS327S0100000_16) {
        if (i == i2) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        Drawable drawableMutate = drawable.mutate();
        if (drawableMutate instanceof GradientDrawable) {
            ((GradientDrawable) drawableMutate).setColor(i2);
        }
        valueAnimatorOfObject.addUpdateListener(new AUListenerS216S0200000_6(view, drawableMutate, 6));
        if (aAListenerS327S0100000_16 != null) {
            valueAnimatorOfObject.addListener(aAListenerS327S0100000_16);
        }
        valueAnimatorOfObject.setDuration(j);
        valueAnimatorOfObject.start();
    }
}
