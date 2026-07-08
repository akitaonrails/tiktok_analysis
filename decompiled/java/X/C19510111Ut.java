package X;

import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS61S0201000_29;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.11Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19510111Ut implements InterfaceC1637430siD, InterfaceC19510211Uu {
    public InterfaceC1645910svt LIZ = new C194551119p();
    public final FrameLayout LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    @Override // X.InterfaceC19510211Uu
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJII() {
    }

    @Override // X.InterfaceC19510211Uu
    public final void LIZ() {
        C786410Ut5.LJJJZ(this.LIZLLL, this.LIZIZ);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJI() {
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZJ(C19510311Uv c19510311Uv) {
        C786410Ut5.LJJJJIZL(this.LIZIZ);
        this.LIZIZ.addView(this.LIZLLL);
        HandlerHook.viewPost(this.LIZIZ, new ARunnableS98S0200000_29(c19510311Uv, this, 4));
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZLLL(C194551119p c194551119p) {
        this.LIZ = c194551119p;
    }

    @Override // X.InterfaceC1637430siD
    public final void LJFF(C19510311Uv c19510311Uv) {
        this.LIZ.LJII();
        c19510311Uv.LJII();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
        duration.setInterpolator(new C1357210lQF());
        duration.addUpdateListener(new AUListenerS61S0201000_29(this.LIZJ.getMeasuredHeight(), c19510311Uv, this, 0));
        duration.addListener(new ALAdapterS23S0200000_29(c19510311Uv, this, 1));
        duration.start();
    }

    public C19510111Ut(View view, View view2, FrameLayout frameLayout) {
        this.LIZIZ = frameLayout;
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
