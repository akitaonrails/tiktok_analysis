package X;

import Y.AAListenerS316S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375740EoG extends C21392618nk {
    public AwS549S0100000_5 LJFF;

    @Override // X.C21392618nk, X.C195L
    public final Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c214795194f.LIZIZ.getAlpha(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(c214795194f, 2));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(25L);
        return valueAnimatorOfFloat;
    }

    @Override // X.C21392618nk, X.C195L
    public final Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        Animator animatorLJIILJJIL = super.LJIILJJIL(c214795194f, c214795194f2);
        animatorLJIILJJIL.addListener(new AAListenerS316S0100000_5(this, 0));
        return animatorLJIILJJIL;
    }
}
