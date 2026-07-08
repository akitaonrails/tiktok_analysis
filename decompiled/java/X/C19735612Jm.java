package X;

import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS61S0201000_29;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.12Jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19735612Jm implements InterfaceC1637430siD, InterfaceC19510211Uu {
    public final ViewGroup LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public InterfaceC1645910svt LIZ = new C194551119p();
    public boolean LJ = true;

    @Override // X.InterfaceC19510211Uu
    public final void LJII() {
    }

    @Override // X.InterfaceC19510211Uu
    public final void LIZ() {
        C786410Ut5.LJJJLZIJ(this.LIZLLL, this.LIZIZ);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LIZIZ() {
        C786410Ut5.ed(this.LIZJ, 0.0f);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJI() {
        C786410Ut5.LJLLLLLL(0, this.LIZLLL);
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZJ(C19510311Uv c19510311Uv) {
        C786410Ut5.LJJJJI(this.LIZIZ);
        ViewGroup viewGroup = (ViewGroup) this.LIZLLL.getParent();
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this.LIZLLL, viewGroup);
        }
        this.LIZIZ.addView(this.LIZLLL);
        if (this.LJ) {
            HandlerHook.viewPost(this.LIZIZ, new ARunnableS98S0200000_29(c19510311Uv, this, 33));
        } else {
            this.LIZ.LIZIZ();
            LIZIZ();
        }
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZLLL(C194551119p c194551119p) {
        this.LIZ = c194551119p;
    }

    @Override // X.InterfaceC1637430siD
    public final void LJFF(C19510311Uv c19510311Uv) {
        this.LIZ.LJII();
        if (this.LJ) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addUpdateListener(new AUListenerS61S0201000_29(this.LIZJ.getMeasuredHeight(), c19510311Uv, this, 3));
            duration.addListener(new ALAdapterS23S0200000_29(c19510311Uv, this, 10));
            duration.start();
            return;
        }
        this.LIZ.LIZ();
        LIZ();
    }

    public C19735612Jm(View view, View view2, ViewGroup viewGroup) {
        this.LIZIZ = viewGroup;
        this.LIZLLL = view;
        this.LIZJ = view2;
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJ(float f, int i, int i2) {
        float f2 = i2 + ((i - i2) * f);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        C786410Ut5.ed(this.LIZJ, f2);
    }

    @Override // X.InterfaceC19510211Uu
    public final void LJIIIIZZ(float f, int i, int i2) {
        C786410Ut5.ed(this.LIZJ, (i2 - i) * f);
    }
}
