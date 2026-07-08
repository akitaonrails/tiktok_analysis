package X;

import Y.AUListenerS261S0100000_11;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722780SWu extends Transition {
    public final float LL = 0.0f;
    public final float LLILLJJLI = 1.0f;
    public Function1<? super Float, Unit> LLILLL;

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        transitionValues.values.put("custom_value", Float.valueOf(this.LLILLJJLI));
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        transitionValues.values.put("custom_value", Float.valueOf(this.LL));
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) transitionValues.values.get("custom_value")).floatValue(), ((Float) transitionValues2.values.get("custom_value")).floatValue());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS261S0100000_11(this, 13));
            return valueAnimatorOfFloat;
        }
        return null;
    }
}
