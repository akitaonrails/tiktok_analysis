package X;

import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS62S0300000_29;
import Y.AUListenerS61S0201000_29;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19510411Uw extends C194551119p implements InterfaceC1637430siD {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final Interpolator LJFF;
    public final Pair<String, String> LJIIIIZZ;
    public InterfaceC1645910svt LJIIIZ;
    public final Interpolator LJI = null;
    public final boolean LJII = false;
    public boolean LJIIJ = true;

    @Override // X.InterfaceC1637430siD
    public final void LIZJ(C19510311Uv c19510311Uv) {
        ViewGroup viewGroup;
        ViewParent parent = this.LIZIZ.getParent();
        if ((parent instanceof ViewGroup) && parent != null) {
            viewGroup = (ViewGroup) parent;
        } else {
            C786410Ut5.LJJJJI(this.LIZ);
            this.LIZ.addView(this.LIZIZ);
            viewGroup = this.LIZ;
        }
        HandlerHook.viewPost(viewGroup, new ARunnableS62S0300000_29(viewGroup, this, c19510311Uv, 13));
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZLLL(C194551119p c194551119p) {
        this.LJIIIZ = c194551119p;
    }

    @Override // X.InterfaceC1637430siD
    public final void LJFF(C19510311Uv c19510311Uv) {
        String second;
        InterfaceC1645910svt interfaceC1645910svt = this.LJIIIZ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJII();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LJ);
        Pair<String, String> pair = this.LJIIIIZZ;
        if (pair == null || (second = pair.getSecond()) == null) {
            second = "";
        }
        C337100DJk.LIZ(duration, second, false);
        Interpolator interpolator = this.LJI;
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.addUpdateListener(new AUListenerS61S0201000_29(this.LIZJ.getMeasuredHeight(), this, c19510311Uv, 8));
        duration.addListener(new ALAdapterS23S0200000_29(this, c19510311Uv, 19));
        duration.start();
    }

    @Override // X.C194551119p, X.InterfaceC19510211Uu
    public final void LJ(float f, int i, int i2) {
        C786410Ut5.ed(this.LIZJ, i2 + ((i - i2) * f));
        if (this.LJII) {
            C786410Ut5.T4(this.LIZJ, f);
        }
    }

    @Override // X.C194551119p, X.InterfaceC19510211Uu
    public final void LJIIIIZZ(float f, int i, int i2) {
        C786410Ut5.ed(this.LIZJ, (i2 - i) * f);
        if (this.LJII) {
            C786410Ut5.T4(this.LIZJ, 1 - f);
        }
    }

    public C19510411Uw(ViewGroup viewGroup, View view, View view2, long j, long j2, Interpolator interpolator, Pair pair) {
        this.LIZ = viewGroup;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = interpolator;
        this.LJIIIIZZ = pair;
    }
}
