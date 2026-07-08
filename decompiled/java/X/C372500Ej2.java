package X;

import Y.AAListenerS49S0210000_5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ej2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372500Ej2 {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final View LJI;
    public Animator.AnimatorListener LJII;
    public float LJIIIIZZ = 80.0f;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final void LIZJ(Boolean bool) {
        boolean z;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            View view = this.LJFF;
            boolean z2 = true;
            if (view != null && view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIIZ = z;
            View view2 = this.LJI;
            if (view2 == null || view2.getVisibility() != 0) {
                z2 = false;
            }
            this.LJIIJ = z2;
            LJ(false);
            return;
        }
        LIZLLL(false);
    }

    public final void LIZLLL(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
            f3 = this.LJIIIIZZ;
            f4 = 0.0f;
        } else {
            f = 1.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = this.LJIIIIZZ;
        }
        if (this.LIZ.getAlpha() == 0.0f && f2 == 0.0f) {
            f5 = 0.0f;
        } else {
            f5 = f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZ, "alpha", f5, f2);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.bd(0.0f, this.LIZ);
        C786410Ut5.R4(f, this.LIZ);
        LIZ(z, f, f2, f3, f4, C13BV.INSTANCE, null, null, objectAnimatorOfFloat);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(boolean r26) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372500Ej2.LJ(boolean):void");
    }

    public final void LIZIZ(boolean z, Boolean bool) {
        if (z) {
            C786410Ut5.LJLZ(0, this.LIZ);
        }
        C786410Ut5.LJLLLLLL(0, this.LIZLLL);
        C786410Ut5.LJLLLLLL(0, this.LIZIZ);
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LJ(true);
        } else {
            LIZLLL(true);
        }
    }

    public C372500Ej2(ViewGroup viewGroup, View view, View view2, View view3, View view4, View view5, View view6) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = view3;
        this.LJ = view4;
        this.LJFF = view5;
        this.LJI = view6;
    }

    public final void LIZ(boolean z, float f, float f2, float f3, float f4, List<? extends Animator> list, Animator animator, Animator animator2, ObjectAnimator objectAnimator) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LIZLLL, "alpha", f, f2);
        objectAnimatorOfFloat3.setDuration(250L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        C786410Ut5.ed(this.LIZLLL, 0.0f);
        C786410Ut5.T4(this.LIZLLL, f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LIZIZ, "translationY", f3, f4);
        objectAnimatorOfFloat4.setDuration(250L);
        objectAnimatorOfFloat4.setInterpolator(new C21388418n4());
        C786410Ut5.ed(this.LIZIZ, f3);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", f, f2);
        objectAnimatorOfFloat5.setDuration(250L);
        objectAnimatorOfFloat5.setInterpolator(new LinearInterpolator());
        C786410Ut5.T4(this.LIZIZ, f);
        View view = this.LJ;
        if (view != null) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f3, f4);
            objectAnimatorOfFloat.setInterpolator(new C21388418n4());
            objectAnimatorOfFloat.setDuration(250L);
            C786410Ut5.ed(view, f3);
        } else {
            objectAnimatorOfFloat = null;
        }
        View view2 = this.LJ;
        if (view2 != null) {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "alpha", f, f2);
            objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat2.setDuration(250L);
            C786410Ut5.T4(view2, f);
        } else {
            objectAnimatorOfFloat2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.LIZJ, "translationY", f3, f4);
        objectAnimatorOfFloat6.setDuration(250L);
        objectAnimatorOfFloat6.setInterpolator(new C21388418n4());
        C786410Ut5.ed(this.LIZJ, f3);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.LIZJ, "alpha", f, f2);
        objectAnimatorOfFloat7.setDuration(250L);
        objectAnimatorOfFloat7.setInterpolator(new LinearInterpolator());
        C786410Ut5.T4(this.LIZJ, f);
        AnimatorSet.Builder builderWith = animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5);
        if (this.LJ != null) {
            builderWith.with(objectAnimatorOfFloat);
            builderWith.with(objectAnimatorOfFloat2);
        }
        if (objectAnimator != null) {
            builderWith.with(objectAnimator);
        }
        Iterator<? extends Animator> it2 = list.iterator();
        while (it2.hasNext()) {
            builderWith.with(it2.next());
        }
        if (animator != null) {
            builderWith.with(animator);
        }
        if (animator2 != null) {
            builderWith.with(animator2);
        }
        animatorSet.addListener(new AAListenerS49S0210000_5(objectAnimator, z, this, 0));
        Animator.AnimatorListener animatorListener = this.LJII;
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
    }
}
