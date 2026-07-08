package androidx.compose.foundation.selection;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C20052513d5;
import X.C20074213ga;
import X.C20279814Wu;
import X.C786410Ut5;
import X.InterfaceC1693230uAD;
import X.InterfaceC595010NVj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class SelectableElement extends AbstractC1685820tyG<C20074213ga> {
    public final boolean LIZIZ;
    public final InterfaceC595010NVj LIZJ;
    public final InterfaceC1693230uAD LIZLLL;
    public final boolean LJ;
    public final C20279814Wu LJFF;
    public final Function0<Unit> LJI;

    public SelectableElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20074213ga(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZIZ) * 31;
        InterfaceC595010NVj interfaceC595010NVj = this.LIZJ;
        int iHashCode = (iZ2 + (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0)) * 31;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (interfaceC1693230uAD != null ? interfaceC1693230uAD.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        C20279814Wu c20279814Wu = this.LJFF;
        return ((iHashCode2 + (c20279814Wu != null ? c20279814Wu.LIZ : 0)) * 31) + this.LJI.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C20074213ga c20074213ga = (C20074213ga) abstractC20055413dY;
        boolean z = this.LIZIZ;
        InterfaceC595010NVj interfaceC595010NVj = this.LIZJ;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZLLL;
        boolean z2 = this.LJ;
        C20279814Wu c20279814Wu = this.LJFF;
        Function0<Unit> function0 = this.LJI;
        if (c20074213ga.LLJZ != z) {
            c20074213ga.LLJZ = z;
            C20052513d5.LJFF(c20074213ga).LJJJJIZL();
        }
        c20074213ga.LLJJJJLIIL(interfaceC595010NVj, interfaceC1693230uAD, z2, null, c20279814Wu, function0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        if (this.LIZIZ == selectableElement.LIZIZ && Intrinsics.LJFF(this.LIZJ, selectableElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, selectableElement.LIZLLL) && this.LJ == selectableElement.LJ && Intrinsics.LJFF(this.LJFF, selectableElement.LJFF) && this.LJI == selectableElement.LJI) {
            return true;
        }
        return false;
    }

    public SelectableElement(boolean z, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1693230uAD interfaceC1693230uAD, boolean z2, C20279814Wu c20279814Wu, Function0 function0) {
        this.LIZIZ = z;
        this.LIZJ = interfaceC595010NVj;
        this.LIZLLL = interfaceC1693230uAD;
        this.LJ = z2;
        this.LJFF = c20279814Wu;
        this.LJI = function0;
    }
}
