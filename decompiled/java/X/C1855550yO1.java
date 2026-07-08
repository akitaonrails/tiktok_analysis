package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.internal.AwS113S0110000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yO1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855550yO1 {
    public final C1855630yO9 LIZ;
    public EnumC1855560yO2 LIZIZ;
    public boolean LIZJ;
    public Animator LIZLLL;
    public Animator LJ;
    public AnimatorSet LJFF;
    public AwS571S0100000_27 LJI;

    public final void LIZ() {
        Animator animator = this.LIZLLL;
        if (animator != null && animator.isRunning()) {
            Animator animator2 = this.LIZLLL;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator animator3 = this.LIZLLL;
            if (animator3 != null) {
                animator3.removeAllListeners();
            }
            this.LIZLLL = null;
        }
        Animator animator4 = this.LJ;
        if (animator4 != null && animator4.isRunning()) {
            Animator animator5 = this.LJ;
            if (animator5 != null) {
                animator5.cancel();
            }
            Animator animator6 = this.LJ;
            if (animator6 != null) {
                animator6.removeAllListeners();
            }
            this.LJ = null;
        }
        AnimatorSet animatorSet = this.LJFF;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.LJFF;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.LJFF;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
        }
        this.LJFF = null;
    }

    public C1855550yO1(C1855630yO9 c1855630yO9) {
        this.LIZ = c1855630yO9;
        C1860520yW2.LIZ.getClass();
        EnumC1855560yO2 enumC1855560yO2LJIIJJI = C1860520yW2.LJIIJJI();
        this.LIZIZ = enumC1855560yO2LJIIJJI;
        LIZIZ(enumC1855560yO2LJIIJJI, false);
    }

    public final void LIZJ(EnumC1855560yO2 enumC1855560yO2) {
        new AwS393S0200000_27(enumC1855560yO2, this, 47).invoke(this.LIZ);
    }

    public final void LIZIZ(EnumC1855560yO2 enumC1855560yO2, boolean z) {
        int i = C1855570yO3.LIZ[enumC1855560yO2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            EnumC1855560yO2 enumC1855560yO22 = EnumC1855560yO2.LONG_PRESS_TO_TALK;
                            LIZJ(enumC1855560yO22);
                            this.LIZIZ = enumC1855560yO22;
                            return;
                        }
                        throw new C1954807lC();
                    }
                    EnumC1855560yO2 enumC1855560yO23 = EnumC1855560yO2.CLICK_TO_TALK;
                    LIZJ(enumC1855560yO23);
                    this.LIZIZ = enumC1855560yO23;
                    return;
                }
                this.LIZJ = false;
                if (!z) {
                    LIZJ(EnumC1855560yO2.DIRECT_TO_TALK);
                    AwS571S0100000_27 awS571S0100000_27 = this.LJI;
                    if (awS571S0100000_27 != null) {
                        awS571S0100000_27.invoke();
                    }
                } else {
                    new AwS606S0100000_27(this, 203).invoke(this.LIZ);
                }
                this.LIZIZ = EnumC1855560yO2.DIRECT_TO_TALK;
                return;
            }
            this.LIZJ = true;
            if (!z) {
                LIZJ(EnumC1855560yO2.HOLD_TO_TALK);
            } else {
                new AwS606S0100000_27(this, 202).invoke(this.LIZ);
            }
            this.LIZIZ = EnumC1855560yO2.HOLD_TO_TALK;
            return;
        }
        LIZ();
        new AwS113S0110000_27(z, this, 3).invoke(this.LIZ);
        this.LIZIZ = EnumC1855560yO2.KEYBOARD;
    }
}
