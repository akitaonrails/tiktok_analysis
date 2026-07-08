package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1688000u1m;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes26.dex */
public final class LayoutWeightElement extends AbstractC1685820tyG<C1688000u1m> {
    public final float LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1688000u1m(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1688000u1m c1688000u1m = (C1688000u1m) abstractC20055413dY;
        c1688000u1m.LLJJ = this.LIZIZ;
        c1688000u1m.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement != null && this.LIZIZ == layoutWeightElement.LIZIZ && this.LIZJ == layoutWeightElement.LIZJ) {
            return true;
        }
        return false;
    }

    public LayoutWeightElement(float f, boolean z) {
        this.LIZIZ = f;
        this.LIZJ = z;
    }
}
