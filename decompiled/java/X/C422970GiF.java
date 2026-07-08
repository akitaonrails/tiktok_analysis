package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0GiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422970GiF extends Transition {
    public final long LL;
    public final long LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final boolean LLILZIL;

    @Override // android.transition.Transition
    public final Transition addTarget(View view) {
        view.setPivotX(this.LLILLL);
        view.setPivotY(this.LLILZ);
        return super.addTarget(view);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        if (this.LLILZIL) {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(1.0f));
        } else {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(0.0f));
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        if (this.LLILZIL) {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(0.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(0.0f));
        } else {
            transitionValues.values.put("ttlive:scaleX", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:scaleY", Float.valueOf(1.0f));
            transitionValues.values.put("ttlive:alpha", Float.valueOf(1.0f));
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null && transitionValues.view == transitionValues2.view) {
            float fFloatValue = ((Float) transitionValues.values.get("ttlive:scaleX")).floatValue();
            float fFloatValue2 = ((Float) transitionValues.values.get("ttlive:scaleY")).floatValue();
            float fFloatValue3 = ((Float) transitionValues2.values.get("ttlive:scaleX")).floatValue();
            float fFloatValue4 = ((Float) transitionValues2.values.get("ttlive:scaleY")).floatValue();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(transitionValues.view, "alpha", ((Float) transitionValues.values.get("ttlive:alpha")).floatValue(), ((Float) transitionValues2.values.get("ttlive:alpha")).floatValue());
            objectAnimatorOfFloat.setDuration(this.LL);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            if (!this.LLILZIL) {
                objectAnimatorOfFloat.setStartDelay(this.LLILLJJLI - this.LL);
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(transitionValues.view, "scaleX", fFloatValue, fFloatValue3);
            objectAnimatorOfFloat2.setDuration(this.LLILLJJLI);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(transitionValues.view, "scaleY", fFloatValue2, fFloatValue4);
            objectAnimatorOfFloat3.setDuration(this.LLILLJJLI);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat);
            return animatorSet;
        }
        return null;
    }

    public C422970GiF(float f, float f2, long j, long j2, boolean z) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = z;
    }
}
