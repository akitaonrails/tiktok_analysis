package X;

import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS61S0201000_29;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.11Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19510511Ux extends C194551119p implements InterfaceC1637430siD {
    public final View LIZ;
    public InterfaceC1645910svt LIZJ;
    public final long LIZIZ = 200;
    public boolean LIZLLL = true;

    public C19510511Ux(View view) {
        this.LIZ = view;
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZJ(C19510311Uv c19510311Uv) {
        HandlerHook.viewPost(this.LIZ, new ARunnableS98S0200000_29(this, c19510311Uv, 71));
    }

    @Override // X.InterfaceC1637430siD
    public final void LIZLLL(C194551119p c194551119p) {
        this.LIZJ = c194551119p;
    }

    @Override // X.InterfaceC1637430siD
    public final void LJFF(C19510311Uv c19510311Uv) {
        InterfaceC1645910svt interfaceC1645910svt = this.LIZJ;
        if (interfaceC1645910svt != null) {
            interfaceC1645910svt.LJII();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.LIZIZ);
        C337100DJk.LIZ(duration, "filter_panel_hide", false);
        duration.addUpdateListener(new AUListenerS61S0201000_29(this.LIZ.getMeasuredHeight(), this, c19510311Uv, 6));
        duration.addListener(new ALAdapterS23S0200000_29(this, c19510311Uv, 15));
        duration.start();
    }
}
