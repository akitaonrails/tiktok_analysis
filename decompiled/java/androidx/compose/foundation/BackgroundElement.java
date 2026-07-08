package androidx.compose.foundation;

import X.AbstractC1668700tWe;
import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680690tpz;
import X.C1684370tvv;
import X.C1685910tyP;
import X.C1688620u2m;
import X.InterfaceC1680710tq1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class BackgroundElement extends AbstractC1685820tyG<C1680690tpz> {
    public final long LIZIZ;
    public final AbstractC1668700tWe LIZJ;
    public final float LIZLLL;
    public final InterfaceC1680710tq1 LJ;
    public final Function1<C1688620u2m, Unit> LJFF;

    public BackgroundElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1680690tpz(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public final int hashCode() {
        int iLJIIJ = C1685910tyP.LJIIJ(this.LIZIZ) * 31;
        AbstractC1668700tWe abstractC1668700tWe = this.LIZJ;
        return ((((iLJIIJ + (abstractC1668700tWe != null ? abstractC1668700tWe.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1680690tpz c1680690tpz = (C1680690tpz) abstractC20055413dY;
        c1680690tpz.LLJJ = this.LIZIZ;
        c1680690tpz.LLJJI = this.LIZJ;
        c1680690tpz.LLJJIII = this.LIZLLL;
        c1680690tpz.LLJJIJI = this.LJ;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !C1685910tyP.LJ(this.LIZIZ, backgroundElement.LIZIZ) || !Intrinsics.LJFF(this.LIZJ, backgroundElement.LIZJ) || this.LIZLLL != backgroundElement.LIZLLL || !Intrinsics.LJFF(this.LJ, backgroundElement.LJ)) {
            return false;
        }
        return true;
    }

    public BackgroundElement(long j, AbstractC1668700tWe abstractC1668700tWe, float f, InterfaceC1680710tq1 interfaceC1680710tq1, C1684370tvv c1684370tvv, int i) {
        j = (i & 1) != 0 ? C1685910tyP.LJIIJ : j;
        abstractC1668700tWe = (i & 2) != 0 ? null : abstractC1668700tWe;
        this.LIZIZ = j;
        this.LIZJ = abstractC1668700tWe;
        this.LIZLLL = f;
        this.LJ = interfaceC1680710tq1;
        this.LJFF = c1684370tvv;
    }
}
