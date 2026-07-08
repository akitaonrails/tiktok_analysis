package X;

import Y.ALAdapterS23S0200000_29;
import Y.AUListenerS61S0201000_29;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.12Kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19737512Kf implements InterfaceC1637430siD, InterfaceC19510211Uu {
    public InterfaceC1645910svt LIZ = new C194551119p();
    public final ViewGroup LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public ValueAnimator LJ;
    public ValueAnimator LJFF;

    @Override // X.InterfaceC19510211Uu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC19510211Uu
    public final void LIZ() {
        C786410Ut5.LJJJLZIJ(this.LIZJ, this.LIZIZ);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJI() {
        C786410Ut5.LJLLLLLL(4, this.LIZLLL);
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJII() {
        C786410Ut5.LJLLLLLL(0, this.LIZLLL);
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZJ(C19510311Uv c19510311Uv) {
        ValueAnimator valueAnimator = this.LJFF;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.LJFF.cancel();
        }
        C786410Ut5.T4(this.LIZJ, 0.0f);
        if (this.LIZJ.getParent() != null) {
            C786410Ut5.LJJJLZIJ(this.LIZJ, (ViewGroup) this.LIZJ.getParent());
        }
        this.LIZIZ.addView(this.LIZJ);
        this.LIZ.LJI();
        LJI();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(new C21388018n0());
        duration.addUpdateListener(new AUListenerS61S0201000_29(this.LIZJ.getMeasuredHeight(), c19510311Uv, this, 1));
        duration.addListener(new ALAdapterS23S0200000_29(c19510311Uv, this, 9));
        duration.start();
        this.LJ = duration;
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZLLL(C194551119p c194551119p) {
        this.LIZ = c194551119p;
    }

    @Override // X.InterfaceC1637430siD
    public final void LJFF(C19510311Uv c19510311Uv) {
        ValueAnimator valueAnimator = this.LJ;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.LJ.cancel();
        }
        this.LIZ.LJII();
        LJII();
        c19510311Uv.LJII();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(new C21388018n0());
        duration.addUpdateListener(new AUListenerS61S0201000_29(this.LIZJ.getMeasuredHeight(), c19510311Uv, this, 2));
        duration.addListener(new ALAdapterS23S0200000_29(c19510311Uv, this, 8));
        duration.start();
        this.LJFF = duration;
    }

    public C19737512Kf(View view, View view2, ViewGroup viewGroup) {
        this.LIZIZ = viewGroup;
        this.LIZLLL = view;
        this.LIZJ = view2;
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJ(float f, int i, int i2) {
        C786410Ut5.ed(this.LIZJ, i2 + ((i - i2) * f));
        C786410Ut5.T4(this.LIZJ, f);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJIIIIZZ(float f, int i, int i2) {
        C786410Ut5.ed(this.LIZJ, (i2 - i) * f);
        C786410Ut5.T4(this.LIZJ, 1.0f - f);
    }
}
