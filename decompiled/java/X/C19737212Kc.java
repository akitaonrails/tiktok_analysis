package X;

import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS61S0201000_29;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19737212Kc extends C194551119p implements InterfaceC1637430siD {
    public final View LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final Pair<String, String> LIZLLL;
    public final TimeInterpolator LJ;
    public InterfaceC1645910svt LJFF;
    public boolean LJI = true;
    public ValueAnimator LJII;

    @Override // X.InterfaceC1637430siD
    public final void LIZJ(C19510311Uv c19510311Uv) {
        ValueAnimator valueAnimator = this.LJII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        InterfaceC1645910svt interfaceC1645910svt = this.LJFF;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJI();
        }
        C786410Ut5.T4(this.LIZ, 0.0f);
        HandlerHook.viewPost(this.LIZ, new ARunnableS98S0200000_29(c19510311Uv, this, 40));
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZLLL(C194551119p c194551119p) {
        this.LJFF = c194551119p;
    }

    @Override // X.InterfaceC1637430siD
    public final void LJFF(C19510311Uv c19510311Uv) {
        String second;
        ValueAnimator valueAnimator = this.LJII;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        InterfaceC1645910svt interfaceC1645910svt = this.LJFF;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJII();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LIZJ);
        Pair<String, String> pair = this.LIZLLL;
        if (pair == null || (second = pair.getSecond()) == null) {
            second = "";
        }
        C337100DJk.LIZ(duration, second, false);
        this.LJII = duration;
        int measuredHeight = this.LIZ.getMeasuredHeight();
        ValueAnimator valueAnimator2 = this.LJII;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS61S0201000_29(measuredHeight, this, c19510311Uv, 4));
        }
        ValueAnimator valueAnimator3 = this.LJII;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new ALAdapterS23S0200000_29(this, c19510311Uv, 12));
        }
        ValueAnimator valueAnimator4 = this.LJII;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public C19737212Kc(View view, long j, long j2, Pair<String, String> pair, TimeInterpolator timeInterpolator) {
        this.LIZ = view;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = pair;
        this.LJ = timeInterpolator;
    }
}
