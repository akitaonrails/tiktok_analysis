package X;

import androidx.lifecycle.LifecycleCoroutineScope;

/* JADX INFO: renamed from: X.0fj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138250fj5 extends AbstractC1138110fir {
    @Override // X.AbstractC1138110fir
    public final String LIZ() {
        return "IdleState";
    }

    @Override // X.AbstractC1138110fir
    public final void LIZJ() {
    }

    @Override // X.AbstractC1138110fir
    public final void LIZLLL(C1135810ff9 c1135810ff9) {
    }

    @Override // X.AbstractC1138110fir
    public final void LJFF(C1135810ff9 c1135810ff9) {
    }

    public C1138250fj5(C1138090fip c1138090fip) {
        super(c1138090fip);
    }

    @Override // X.AbstractC1138110fir
    public final void LJ(C1135810ff9 c1135810ff9) {
        C1138090fip c1138090fip = this.LIZ;
        c1138090fip.LIZ.LIZIZ(c1135810ff9);
        LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip.LIZ.getLifecycleCoroutineScope();
        if (lifecycleCoroutineScope != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138160fiw(c1138090fip, this, c1135810ff9, null), 2);
        } else {
            LJI("scope_null:IdleState.enter");
        }
    }
}
