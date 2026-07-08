package androidx.compose.foundation.selection;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680220tpE;
import X.C20052513d5;
import X.C20074313gb;
import X.C20279814Wu;
import X.C786410Ut5;
import X.InterfaceC1693230uAD;
import X.InterfaceC595010NVj;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ToggleableElement extends AbstractC1685820tyG<C20074313gb> {
    public final boolean LIZIZ;
    public final InterfaceC595010NVj LIZJ;
    public final InterfaceC1693230uAD LIZLLL;
    public final boolean LJ;
    public final C20279814Wu LJFF;
    public final Function1<Boolean, Unit> LJI;

    public ToggleableElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20074313gb(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
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
        C20074313gb c20074313gb = (C20074313gb) abstractC20055413dY;
        boolean z = this.LIZIZ;
        InterfaceC595010NVj interfaceC595010NVj = this.LIZJ;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZLLL;
        boolean z2 = this.LJ;
        C20279814Wu c20279814Wu = this.LJFF;
        Function1<Boolean, Unit> function1 = this.LJI;
        if (c20074313gb.LLJZ != z) {
            c20074313gb.LLJZ = z;
            C20052513d5.LJFF(c20074313gb).LJJJJIZL();
        }
        c20074313gb.LLJZIJLIL = function1;
        c20074313gb.LLJJJJLIIL(interfaceC595010NVj, interfaceC1693230uAD, z2, null, c20279814Wu, c20074313gb.LLL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        if (this.LIZIZ == toggleableElement.LIZIZ && Intrinsics.LJFF(this.LIZJ, toggleableElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, toggleableElement.LIZLLL) && this.LJ == toggleableElement.LJ && Intrinsics.LJFF(this.LJFF, toggleableElement.LJFF) && this.LJI == toggleableElement.LJI) {
            return true;
        }
        return false;
    }

    public ToggleableElement(boolean z, InterfaceC595010NVj interfaceC595010NVj, C1680220tpE c1680220tpE, boolean z2, C20279814Wu c20279814Wu, Function1 function1) {
        this.LIZIZ = z;
        this.LIZJ = interfaceC595010NVj;
        this.LIZLLL = c1680220tpE;
        this.LJ = z2;
        this.LJFF = c20279814Wu;
        this.LJI = function1;
    }
}
