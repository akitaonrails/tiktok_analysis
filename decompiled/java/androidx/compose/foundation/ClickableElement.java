package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.AbstractC20072513gJ;
import X.C0NW3;
import X.C20279814Wu;
import X.C786410Ut5;
import X.InterfaceC1693230uAD;
import X.InterfaceC595010NVj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ClickableElement extends AbstractC1685820tyG<C0NW3> {
    public final InterfaceC595010NVj LIZIZ;
    public final InterfaceC1693230uAD LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final C20279814Wu LJFF;
    public final Function0<Unit> LJI;

    public ClickableElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C0NW3(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public final int hashCode() {
        InterfaceC595010NVj interfaceC595010NVj = this.LIZIZ;
        int iHashCode = (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0) * 31;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZJ;
        int iHashCode2 = (((iHashCode + (interfaceC1693230uAD != null ? interfaceC1693230uAD.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C20279814Wu c20279814Wu = this.LJFF;
        return ((iHashCode3 + (c20279814Wu != null ? c20279814Wu.LIZ : 0)) * 31) + this.LJI.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((AbstractC20072513gJ) abstractC20055413dY).LLJJJJLIIL(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, clickableElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, clickableElement.LIZJ) && this.LIZLLL == clickableElement.LIZLLL && Intrinsics.LJFF(this.LJ, clickableElement.LJ) && Intrinsics.LJFF(this.LJFF, clickableElement.LJFF) && this.LJI == clickableElement.LJI) {
            return true;
        }
        return false;
    }

    public ClickableElement(InterfaceC595010NVj interfaceC595010NVj, InterfaceC1693230uAD interfaceC1693230uAD, boolean z, String str, C20279814Wu c20279814Wu, Function0 function0) {
        this.LIZIZ = interfaceC595010NVj;
        this.LIZJ = interfaceC1693230uAD;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = c20279814Wu;
        this.LJI = function0;
    }
}
