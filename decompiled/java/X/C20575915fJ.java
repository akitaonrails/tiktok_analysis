package X;

import Y.ALAdapterS25S0100000_31;
import Y.AUListenerS233S0200000_31;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: X.15fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20575915fJ {
    public final View LIZ;
    public final TextView LIZIZ;
    public ValueAnimator LIZJ;
    public ValueAnimator LIZLLL;
    public ValueAnimator LJ;
    public boolean LJFF = true;
    public CharSequence LJI = "";
    public CharSequence LJII = "";
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        this.LJFF = false;
        ValueAnimator valueAnimator = this.LIZJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LIZLLL;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LJ;
        if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
            return;
        }
        valueAnimator3.cancel();
    }

    public final void LIZIZ() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LIZ.getScaleX();
        this.LIZ.getScaleY();
        C786410Ut5.Ob(this.LIZ, 0.0f);
        C786410Ut5.pc(this.LIZ, 0.0f);
        C817403Hg c817403Hg = new C817403Hg();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.34f, 1.3f, 0.64f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS233S0200000_31(c817403Hg, this, 14));
        valueAnimatorOfFloat.addListener(new ALAdapterS25S0100000_31(this, 36));
        this.LIZJ = valueAnimatorOfFloat;
    }

    public final void LIZJ(Long l) {
        long jLongValue;
        if (!this.LJIIIZ && this.LJIIIIZZ) {
            this.LJIIIZ = true;
            this.LJFF = true;
            ValueAnimator valueAnimator = this.LIZJ;
            if (valueAnimator != null) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                valueAnimator.setStartDelay(jLongValue);
            }
            ValueAnimator valueAnimator2 = this.LIZJ;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }
    }

    public C20575915fJ(View view, TextView textView) {
        this.LIZ = view;
        this.LIZIZ = textView;
    }
}
