package X;

import Y.AAListenerS316S0100000_5;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375760EoI extends C0ETA {
    public final long LJFF;
    public final long LJI;
    public final Float LJII;
    public final List<Animator.AnimatorListener> LJIIIIZZ;
    public final List<Animator.AnimatorListener> LJIIIZ;

    @Override // X.C0ETA
    public final void LJIILL(AAListenerS316S0100000_5 aAListenerS316S0100000_5) {
        ((ArrayList) this.LJIIIZ).add(aAListenerS316S0100000_5);
    }

    @Override // X.C0ETA
    public final void LJIILLIIL(Animator.AnimatorListener animatorListener) {
        ((ArrayList) this.LJIIIIZZ).add(animatorListener);
    }

    public C375760EoI(Float f, int i) {
        long j;
        if ((i & 1) != 0) {
            j = 300;
        } else {
            j = 0;
        }
        long j2 = (i & 2) != 0 ? 200L : 0L;
        f = (i & 4) != 0 ? null : f;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = f;
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
    }

    @Override // X.C21392618nk, X.C195L
    public final Animator LJIILIIL(C214795194f c214795194f, C214795194f c214795194f2) {
        Animator animatorLJIILIIL;
        View view;
        float height;
        if (c214795194f != null && (view = c214795194f.LIZIZ) != null) {
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            Float f = this.LJII;
            if (f != null) {
                height = f.floatValue();
            } else {
                height = view.getHeight();
            }
            fArr[1] = height;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            objectAnimatorOfFloat.setDuration(this.LJI);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            animatorLJIILIIL = objectAnimatorOfFloat;
        } else {
            animatorLJIILIIL = super.LJIILIIL(c214795194f, c214795194f2);
        }
        animatorLJIILIIL.addListener(new AAListenerS316S0100000_5(this, 1));
        return animatorLJIILIIL;
    }

    @Override // X.C21392618nk, X.C195L
    public final Animator LJIILJJIL(C214795194f c214795194f, C214795194f c214795194f2) {
        Animator animatorLJIILJJIL;
        View view;
        float height;
        if (c214795194f2 != null && (view = c214795194f2.LIZIZ) != null) {
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[2];
            Float f = this.LJII;
            if (f != null) {
                height = f.floatValue();
            } else {
                height = view.getHeight();
            }
            fArr[0] = height;
            fArr[1] = 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            objectAnimatorOfFloat.setDuration(this.LJFF);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            animatorLJIILJJIL = objectAnimatorOfFloat;
        } else {
            animatorLJIILJJIL = super.LJIILJJIL(c214795194f, c214795194f2);
        }
        animatorLJIILJJIL.addListener(new AAListenerS316S0100000_5(this, 2));
        return animatorLJIILJJIL;
    }
}
