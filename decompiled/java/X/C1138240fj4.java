package X;

import androidx.lifecycle.LifecycleCoroutineScope;

/* JADX INFO: renamed from: X.0fj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138240fj4 extends AbstractC1138110fir {
    @Override // X.AbstractC1138110fir
    public final String LIZ() {
        return "WaitingState";
    }

    @Override // X.AbstractC1138110fir
    public final void LIZJ() {
        LJII("WaitingState.onAnimationEnd");
    }

    public C1138240fj4(C1138090fip c1138090fip) {
        super(c1138090fip);
    }

    @Override // X.AbstractC1138110fir
    public final void LIZLLL(C1135810ff9 c1135810ff9) {
        C1138090fip c1138090fip = this.LIZ;
        c1138090fip.LIZ.LJ(c1135810ff9);
        LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip.LIZ.getLifecycleCoroutineScope();
        if (lifecycleCoroutineScope != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138150fiv(c1138090fip, this, null), 2);
        } else {
            LJI("scope_null:WaitingState.combo");
        }
    }

    @Override // X.AbstractC1138110fir
    public final void LJ(C1135810ff9 c1135810ff9) {
        LJII("WaitingState.onEnter");
    }

    @Override // X.AbstractC1138110fir
    public final void LJFF(C1135810ff9 c1135810ff9) {
        LIZIZ("WaitingState.exit", c1135810ff9, false);
    }
}
