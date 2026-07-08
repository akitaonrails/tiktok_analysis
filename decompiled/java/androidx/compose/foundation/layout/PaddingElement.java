package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1668650tWZ;
import X.C1679560toA;
import X.C1682550tsz;
import X.C1688620u2m;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class PaddingElement extends AbstractC1685820tyG<C1682550tsz> {
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final Function1<C1688620u2m, Unit> LJI;

    public PaddingElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1682550tsz(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1682550tsz c1682550tsz = (C1682550tsz) abstractC20055413dY;
        c1682550tsz.LLJJ = this.LIZIZ;
        c1682550tsz.LLJJI = this.LIZJ;
        c1682550tsz.LLJJIII = this.LIZLLL;
        c1682550tsz.LLJJIJI = this.LJ;
        c1682550tsz.LLJJIJIIJIL = this.LJFF;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !C1668650tWZ.LIZJ(this.LIZIZ, paddingElement.LIZIZ) || !C1668650tWZ.LIZJ(this.LIZJ, paddingElement.LIZJ) || !C1668650tWZ.LIZJ(this.LIZLLL, paddingElement.LIZLLL) || !C1668650tWZ.LIZJ(this.LJ, paddingElement.LJ) || this.LJFF != paddingElement.LJFF) {
            return false;
        }
        return true;
    }

    public PaddingElement(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = z;
        this.LJI = function1;
        if (f < 0.0f && !Float.isNaN(f)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (f2 < 0.0f && !Float.isNaN(f2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z5 = z2 & z3;
        if (f3 < 0.0f && !Float.isNaN(f3)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!(z5 & z4 & (f4 >= 0.0f || Float.isNaN(f4)))) {
            C1679560toA.LIZ("Padding must be non-negative");
        }
    }
}
