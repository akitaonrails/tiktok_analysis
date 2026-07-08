package androidx.compose.foundation.lazy.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C19369610qE;
import X.C20052513d5;
import X.C786410Ut5;
import X.EnumC1684030tvN;
import X.InterfaceC1690480u5m;
import X.InterfaceC19369510qD;
import X.InterfaceC2217311BqL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class LazyLayoutSemanticsModifier extends AbstractC1685820tyG<C19369610qE> {
    public final Function0<InterfaceC1690480u5m> LIZIZ;
    public final InterfaceC19369510qD LIZJ;
    public final EnumC1684030tvN LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C19369610qE(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public final int hashCode() {
        return (((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C19369610qE c19369610qE = (C19369610qE) abstractC20055413dY;
        Function0<InterfaceC1690480u5m> function0 = this.LIZIZ;
        InterfaceC19369510qD interfaceC19369510qD = this.LIZJ;
        EnumC1684030tvN enumC1684030tvN = this.LIZLLL;
        boolean z = this.LJ;
        boolean z2 = this.LJFF;
        c19369610qE.LLJJ = function0;
        c19369610qE.LLJJI = interfaceC19369510qD;
        if (c19369610qE.LLJJIII != enumC1684030tvN) {
            c19369610qE.LLJJIII = enumC1684030tvN;
            C20052513d5.LJFF(c19369610qE).LJJJJIZL();
        }
        if (c19369610qE.LLJJIJI != z || c19369610qE.LLJJIJIIJIL != z2) {
            c19369610qE.LLJJIJI = z;
            c19369610qE.LLJJIJIIJIL = z2;
            c19369610qE.LLJJ();
            C20052513d5.LJFF(c19369610qE).LJJJJIZL();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        if (this.LIZIZ == lazyLayoutSemanticsModifier.LIZIZ && Intrinsics.LJFF(this.LIZJ, lazyLayoutSemanticsModifier.LIZJ) && this.LIZLLL == lazyLayoutSemanticsModifier.LIZLLL && this.LJ == lazyLayoutSemanticsModifier.LJ && this.LJFF == lazyLayoutSemanticsModifier.LJFF) {
            return true;
        }
        return false;
    }

    public LazyLayoutSemanticsModifier(InterfaceC2217311BqL interfaceC2217311BqL, InterfaceC19369510qD interfaceC19369510qD, EnumC1684030tvN enumC1684030tvN, boolean z, boolean z2) {
        this.LIZIZ = interfaceC2217311BqL;
        this.LIZJ = interfaceC19369510qD;
        this.LIZLLL = enumC1684030tvN;
        this.LJ = z;
        this.LJFF = z2;
    }
}
