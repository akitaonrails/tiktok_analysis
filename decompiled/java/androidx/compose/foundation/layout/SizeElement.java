package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1668650tWZ;
import X.C1684140tvY;
import X.C1684370tvv;
import X.C1688620u2m;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class SizeElement extends AbstractC1685820tyG<C1684140tvY> {
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final Function1<C1688620u2m, Unit> LJI;

    public SizeElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1684140tvY(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1684140tvY c1684140tvY = (C1684140tvY) abstractC20055413dY;
        c1684140tvY.LLJJ = this.LIZIZ;
        c1684140tvY.LLJJI = this.LIZJ;
        c1684140tvY.LLJJIII = this.LIZLLL;
        c1684140tvY.LLJJIJI = this.LJ;
        c1684140tvY.LLJJIJIIJIL = this.LJFF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (C1668650tWZ.LIZJ(this.LIZIZ, sizeElement.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, sizeElement.LIZJ) && C1668650tWZ.LIZJ(this.LIZLLL, sizeElement.LIZLLL) && C1668650tWZ.LIZJ(this.LJ, sizeElement.LJ) && this.LJFF == sizeElement.LJFF) {
            return true;
        }
        return false;
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z, C1684370tvv c1684370tvv) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = z;
        this.LJI = c1684370tvv;
    }

    public SizeElement(float f, float f2, float f3, float f4, boolean z, C1684370tvv c1684370tvv, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z, c1684370tvv);
    }
}
