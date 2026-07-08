package X;

import Y.ARunnableS135S0100000_35;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1Def, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261031Def extends C2261051Deh {
    public Animator LIZLLL;
    public Animator LJ;
    public Animator LJFF;

    @Override // X.AbstractC2260961DeY
    public final void LIZ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.end();
        }
    }

    @Override // X.AbstractC2260961DeY
    public final void LIZIZ() {
        ARunnableS135S0100000_35 aRunnableS135S0100000_35 = new ARunnableS135S0100000_35(this, 31);
        this.LIZIZ = aRunnableS135S0100000_35;
        HandlerHook.viewPost(this.LIZ.LIZ, aRunnableS135S0100000_35);
    }

    @Override // X.AbstractC2260961DeY
    public final void LJ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        LJI(null);
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZLLL = null;
        Animator animator3 = this.LJ;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.LJ = null;
        Animator animator4 = this.LJFF;
        if (animator4 != null) {
            animator4.cancel();
        }
        this.LJFF = null;
    }

    public final void LJII() {
        C2260981Dea c2260981DeaLJIIIZ = this.LIZ.LIZ.LJIIIZ();
        int i = c2260981DeaLJIIIZ.LIZ;
        float f = c2260981DeaLJIIIZ.LIZIZ;
        C2260931DeV c2260931DeV = this.LIZ;
        C2260981Dea c2260981Dea = c2260931DeV.LIZIZ;
        int i2 = c2260981Dea.LIZ;
        if (i == i2 && f == c2260981Dea.LIZIZ) {
            return;
        }
        float f2 = (i2 - i) / 2.0f;
        c2260931DeV.LIZ.getLocationOnScreen(new int[2]);
        float f3 = f - r0[1];
        Animator animator = this.LJ;
        if (animator != null) {
            animator.cancel();
        }
        View view = this.LIZ.LJFF;
        float f4 = f3 - f2;
        float f5 = i;
        float f6 = i2;
        float f7 = f5 / f6;
        float f8 = f6 / 2.0f;
        view.setPivotX(f8);
        view.setPivotY(f8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), f7);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", view.getScaleY(), f7);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        this.LJ = animatorSet;
        animatorSet.start();
        float f9 = f5 + f3;
        Animator animator2 = this.LJFF;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animatorLIZ = C20516515Pv.LIZ(this.LIZ.LJI, f9);
        this.LJFF = animatorLIZ;
        animatorLIZ.start();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EggShowState.checkPosition, newSize:");
        sbLIZ.append(i);
        sbLIZ.append(", newTop:");
        sbLIZ.append(f);
        sbLIZ.append(", rawEggImageSize:");
        sbLIZ.append(i2);
        sbLIZ.append(", eggTransY:");
        sbLIZ.append(f3);
        sbLIZ.append(", titleTransY:");
        sbLIZ.append(f9);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2260961DeY
    public final boolean LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEggClickable");
        sbLIZ.append(this.LIZ.LIZ.LLJIJIL);
        C2188811AlT.LIZIZ(sbLIZ);
        return !this.LIZ.LIZ.LLJIJIL;
    }

    public C2261031Def(C2260931DeV c2260931DeV) {
        super(c2260931DeV);
    }
}
