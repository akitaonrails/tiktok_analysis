package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;

/* JADX INFO: renamed from: X.19Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21522519Kt {
    /* JADX WARN: Multi-variable type inference failed */
    public static Animator LIZ(InterfaceC21522719Kv interfaceC21522719Kv, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC21522719Kv, new Property<InterfaceC21522719Kv, C19L0>() { // from class: X.19Kx
            @Override // android.util.Property
            public final C19L0 get(InterfaceC21522719Kv interfaceC21522719Kv2) {
                return interfaceC21522719Kv2.getRevealInfo();
            }

            @Override // android.util.Property
            public final void set(InterfaceC21522719Kv interfaceC21522719Kv2, C19L0 c19l0) {
                interfaceC21522719Kv2.setRevealInfo(c19l0);
            }
        }, new TypeEvaluator<C19L0>() { // from class: X.19Ky
            public final C19L0 LIZ = new C19L0();

            @Override // android.animation.TypeEvaluator
            public final C19L0 evaluate(float f4, C19L0 c19l0, C19L0 c19l02) {
                C19L0 c19l03 = c19l0;
                C19L0 c19l04 = c19l02;
                C19L0 c19l05 = this.LIZ;
                float f5 = 1.0f - f4;
                float f6 = (c19l03.LIZ * f5) + (c19l04.LIZ * f4);
                float f7 = (c19l03.LIZIZ * f5) + (c19l04.LIZIZ * f4);
                float f8 = (f5 * c19l03.LIZJ) + (f4 * c19l04.LIZJ);
                c19l05.LIZ = f6;
                c19l05.LIZIZ = f7;
                c19l05.LIZJ = f8;
                return c19l05;
            }
        }, new C19L0(f, f2, f3));
        C19L0 revealInfo = interfaceC21522719Kv.getRevealInfo();
        if (revealInfo != null) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC21522719Kv, (int) f, (int) f2, revealInfo.LIZJ, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
