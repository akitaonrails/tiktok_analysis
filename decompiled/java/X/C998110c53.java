package X;

import Y.ALAdapterS11S0200000_16;
import Y.ALAdapterS12S0100000_16;
import Y.ALAdapterS5S0110000_16;
import Y.ALAdapterS6S0300000_16;
import Y.ALAdapterS9S0100000_12;
import Y.AUListenerS223S0200000_16;
import Y.AUListenerS262S0100000_12;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewParent;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import kotlin.Pair;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0c53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998110c53 {
    public final InterfaceC998260c5I LIZ;
    public final C0T9P LIZIZ;
    public final AbstractC997340c3o LIZJ;
    public final AbstractC997340c3o LIZLLL;
    public final InterfaceC998100c52<? extends InterfaceC997360c3q> LJ;
    public final InterfaceC998100c52<InterfaceC997360c3q> LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public Animator LJIIL;
    public Animator LJIILIIL;
    public Animator LJIILJJIL;
    public Animator LJIILL;
    public Animator LJIILLIIL;
    public Animator LJIIZILJ;
    public Animator LJIJ;
    public Animator LJIJI;
    public Animator LJIJJ;
    public Animator LJIJJLI;
    public Animator LJIL;
    public Animator LJJ;

    public final ValueAnimator LJI() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJJI());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 46));
        valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(this, 40));
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator LJII() {
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LIZIZ.LIZLLL(), ((C693770RJf.LIZIZ() * 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-19))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(95)));
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 47));
        return valueAnimatorOfInt;
    }

    public final Animator LIZJ() {
        InterfaceC998100c52<? extends InterfaceC997360c3q> interfaceC998100c52 = this.LJ;
        int i = -this.LJIIJ;
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, C693770RJf.LIZIZ());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(interfaceC998100c52, 45));
        valueAnimatorOfInt.addListener(new ALAdapterS12S0100000_16(this, 17));
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
        return valueAnimatorOfInt;
    }

    public final Animator LIZLLL() {
        Animator animatorLIZJ;
        if (this.LJIIL == null) {
            if (this.LJI) {
                animatorLIZJ = LIZJ();
            } else {
                ValueAnimator valueAnimatorLJI = LJI();
                valueAnimatorLJI.setDuration(200L);
                ValueAnimator valueAnimatorLJII = LJII();
                valueAnimatorLJII.setDuration(600L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimatorLJI, valueAnimatorLJII);
                animatorSet.playTogether(LIZJ(), valueAnimatorLJII);
                animatorLIZJ = animatorSet;
            }
            this.LJIIL = animatorLIZJ;
        }
        return this.LJIIL;
    }

    public final Animator LJFF() {
        Animator animator;
        if (this.LJIILJJIL == null) {
            AbstractC997340c3o abstractC997340c3o = this.LIZLLL;
            if (abstractC997340c3o != null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.LJII, 0);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(abstractC997340c3o, 42));
                valueAnimatorOfInt.setDuration(600L);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                valueAnimatorOfInt.addListener(new ALAdapterS11S0200000_16(abstractC997340c3o, this, 9));
                animator = valueAnimatorOfInt;
                if (!this.LJI) {
                    ValueAnimator valueAnimatorLJI = LJI();
                    valueAnimatorLJI.setDuration(200L);
                    ValueAnimator valueAnimatorLJII = LJII();
                    valueAnimatorLJII.setDuration(600L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(valueAnimatorLJI, valueAnimatorLJII);
                    animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorLJII);
                    animator = animatorSet;
                }
            } else {
                animator = null;
            }
            this.LJIILJJIL = animator;
            if (animator != null) {
                animator.addListener(new ALAdapterS12S0100000_16(this, 16));
            }
        }
        return this.LJIILJJIL;
    }

    public final Animator LJIIIZ() {
        AnimatorSet animatorSet;
        if (this.LJIILL == null) {
            AbstractC997340c3o abstractC997340c3o = this.LIZJ;
            if (abstractC997340c3o != null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-this.LJIIIIZZ, 0);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(abstractC997340c3o, 43));
                valueAnimatorOfInt.setDuration(600L);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                valueAnimatorOfInt.addListener(new ALAdapterS11S0200000_16(abstractC997340c3o, this, 10));
                Animator animatorLJ = LJ(false);
                animatorLJ.setDuration(200L);
                Animator animatorLIZIZ = LIZIZ(true);
                animatorLIZIZ.setDuration(600L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(animatorLJ, valueAnimatorOfInt);
                animatorSet.playTogether(valueAnimatorOfInt, animatorLIZIZ);
            } else {
                animatorSet = null;
            }
            this.LJIILL = animatorSet;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS12S0100000_16(this, 16));
            }
        }
        return this.LJIILL;
    }

    public final Animator LJIIJ() {
        AnimatorSet animatorSet;
        if (this.LJIJJ == null) {
            AbstractC997340c3o abstractC997340c3o = this.LIZJ;
            if (abstractC997340c3o != null) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -this.LJIIIIZZ);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(abstractC997340c3o, 44));
                valueAnimatorOfInt.setDuration(400L);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                valueAnimatorOfInt.addListener(new ALAdapterS12S0100000_16(abstractC997340c3o, 18));
                Animator animatorLJ = LJ(true);
                animatorLJ.setDuration(200L);
                Animator animatorLIZIZ = LIZIZ(false);
                animatorLIZIZ.setDuration(400L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimatorOfInt, animatorLJ);
                animatorSet.playTogether(valueAnimatorOfInt, animatorLIZIZ);
            } else {
                animatorSet = null;
            }
            this.LJIJJ = animatorSet;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS12S0100000_16(this, 16));
            }
        }
        return this.LJIJJ;
    }

    public final Animator LJIIJJI() {
        AnimatorSet animatorSet;
        if (this.LJIIZILJ == null) {
            AbstractC997340c3o abstractC997340c3o = this.LIZJ;
            AbstractC997340c3o abstractC997340c3o2 = this.LIZLLL;
            if (abstractC997340c3o == null || abstractC997340c3o2 == null) {
                animatorSet = null;
            } else {
                int[] iArr = {this.LJIIIIZZ, this.LJII};
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, C13LQ.LJJLIIIJ(iArr));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS223S0200000_16(new AbstractC997340c3o[]{abstractC997340c3o, abstractC997340c3o2}, iArr, 3));
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                valueAnimatorOfInt.setDuration(600L);
                valueAnimatorOfInt.addListener(new ALAdapterS6S0300000_16(this, abstractC997340c3o, abstractC997340c3o2, 0));
                Animator animatorLJ = LJ(false);
                animatorLJ.setDuration(200L);
                Animator animatorLIZIZ = LIZIZ(true);
                animatorLIZIZ.setDuration(600L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(animatorLJ, valueAnimatorOfInt);
                animatorSet.playTogether(valueAnimatorOfInt, animatorLIZIZ);
            }
            this.LJIIZILJ = animatorSet;
            Animator animator = this.LJIJJLI;
            if (animator != null) {
                animator.addListener(new ALAdapterS12S0100000_16(this, 16));
            }
        }
        return this.LJIIZILJ;
    }

    public final Animator LJIIL() {
        AnimatorSet animatorSet;
        if (this.LJIJJLI == null) {
            AbstractC997340c3o abstractC997340c3o = this.LIZJ;
            AbstractC997340c3o abstractC997340c3o2 = this.LIZLLL;
            if (abstractC997340c3o == null || abstractC997340c3o2 == null) {
                animatorSet = null;
            } else {
                int[] iArr = {this.LJII, this.LJIIIIZZ};
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, C13LQ.LJJLIIIJ(iArr));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS223S0200000_16(new AbstractC997340c3o[]{abstractC997340c3o2, abstractC997340c3o}, iArr, 4));
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIIJJI());
                valueAnimatorOfInt.setDuration(400L);
                valueAnimatorOfInt.addListener(new ALAdapterS11S0200000_16(abstractC997340c3o, abstractC997340c3o2, 11));
                Animator animatorLJ = LJ(true);
                animatorLJ.setDuration(200L);
                Animator animatorLIZIZ = LIZIZ(false);
                animatorLIZIZ.setDuration(400L);
                animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimatorOfInt, animatorLJ);
                animatorSet.playTogether(valueAnimatorOfInt, animatorLIZIZ);
            }
            this.LJIJJLI = animatorSet;
        }
        Animator animator = this.LJIJJLI;
        if (animator != null) {
            animator.addListener(new ALAdapterS12S0100000_16(this, 16));
        }
        return this.LJIJJLI;
    }

    public final void LJIILIIL() {
        AbstractC997340c3o abstractC997340c3o = this.LIZLLL;
        if (abstractC997340c3o != null) {
            abstractC997340c3o.LJFF("change_stage_event", new Pair<>("stageName", "changeButtonColor"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C998110c53(X.C998090c51 r5) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C998110c53.<init>(X.0c51):void");
    }

    public static void LIZ(Animator animator) {
        if (animator.isRunning()) {
            animator.end();
        }
    }

    public final Animator LIZIZ(boolean z) {
        float f;
        if (z) {
            f = 0.0f;
        } else {
            f = 180.0f;
        }
        InterfaceC998100c52<InterfaceC997360c3q> interfaceC998100c52 = this.LJFF;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f + f, f + 180.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(interfaceC998100c52, 41));
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJJI());
        return valueAnimatorOfFloat;
    }

    public final Animator LJ(final boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJJI());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0c5B
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    C998110c53 c998110c53 = this.LL;
                    boolean z2 = z;
                    float fFloatValue = f.floatValue();
                    InterfaceC998260c5I interfaceC998260c5I = c998110c53.LIZ;
                    if (!z2) {
                        fFloatValue = 1.0f - fFloatValue;
                    }
                    interfaceC998260c5I.LIZ(fFloatValue);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS5S0110000_16(this, z, 1));
        return valueAnimatorOfFloat;
    }

    public final Animator LJIIIIZZ(final boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJJI());
        final ViewParent parent = this.LJFF.Mh().LJIJI().getParent();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0T55
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Float f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
                    C998110c53 c998110c53 = this;
                    boolean z2 = z;
                    ViewParent viewParent = parent;
                    float fFloatValue = f.floatValue();
                    C0T9P c0t9p = c998110c53.LIZIZ;
                    if (!z2) {
                        fFloatValue = 1.0f - fFloatValue;
                    }
                    c0t9p.LIZ(fFloatValue, new AwS591S0100000_12(viewParent, 980));
                }
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0T9O
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (!z) {
                    this.LIZIZ.LJ(4, new AwS591S0100000_12(parent, 981));
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    this.LIZIZ.LJ(0, new AwS591S0100000_12(parent, 982));
                }
            }
        });
        return valueAnimatorOfFloat;
    }
}
