package X;

import Y.AUListenerS215S0200000_4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0DJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337100DJk {
    public static final void LIZ(final ValueAnimator valueAnimator, final String str, final boolean z) {
        final C118300cf c118300cf = new C118300cf();
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        final C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = -1L;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.11XU
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C118300cf c118300cf2 = c118300cf;
                c118300cf2.element--;
                float fNanoTime = (System.nanoTime() - c238400w22.element) / 1.0E9f;
                int i = c118300cf.element;
                C2281251EQx c2281251EQx = C2281251EQx.LIZ;
                c2281251EQx.LJIIIIZZ(i / fNanoTime, fNanoTime, i, str, z);
                c2281251EQx.LIZIZ(str);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                c118300cf.element = 0;
                c238400w2.element = valueAnimator.getDuration();
                C2281251EQx.LIZ.LIZLLL(str);
            }
        });
        valueAnimator.addUpdateListener(new AUListenerS215S0200000_4(c238400w22, c118300cf, 4));
    }
}
