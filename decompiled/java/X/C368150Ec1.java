package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: X.0Ec1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368150Ec1 {
    public final View LIZ;
    public final ViewPropertyAnimator LIZIZ;
    public float LIZJ;
    public final float LIZLLL = 1.0f;
    public float LJ = 1.0f;
    public float LJFF = 1.0f;
    public long LJI;
    public long LJII;
    public TimeInterpolator LJIIIIZZ;
    public Animator.AnimatorListener LJIIIZ;

    public final void LIZ() {
        this.LIZIZ.rotation(0.0f);
        this.LIZIZ.translationX(0.0f);
        this.LIZIZ.translationY(this.LIZJ);
        this.LIZIZ.scaleX(this.LIZLLL);
        this.LIZIZ.scaleY(this.LJ);
        this.LIZIZ.alpha(this.LJFF);
        this.LIZIZ.setStartDelay(this.LJII);
        long j = this.LJI;
        if (j != 0) {
            this.LIZIZ.setDuration(j);
        }
        TimeInterpolator timeInterpolator = this.LJIIIIZZ;
        if (timeInterpolator != null) {
            this.LIZIZ.setInterpolator(timeInterpolator);
        }
        Animator.AnimatorListener animatorListener = this.LJIIIZ;
        if (animatorListener != null) {
            this.LIZIZ.setListener(animatorListener);
        }
        this.LIZIZ.start();
    }

    public C368150Ec1(View view) {
        this.LIZ = view;
        this.LIZIZ = view.animate();
    }
}
