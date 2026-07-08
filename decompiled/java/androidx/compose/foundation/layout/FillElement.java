package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1684010tvL;
import X.EnumC1683990tvJ;

/* JADX INFO: loaded from: classes26.dex */
public final class FillElement extends AbstractC1685820tyG<C1684010tvL> {
    public final EnumC1683990tvJ LIZIZ;
    public final float LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1684010tvL(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1684010tvL c1684010tvL = (C1684010tvL) abstractC20055413dY;
        c1684010tvL.LLJJ = this.LIZIZ;
        c1684010tvL.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.LIZIZ == fillElement.LIZIZ && this.LIZJ == fillElement.LIZJ) {
            return true;
        }
        return false;
    }

    public FillElement(EnumC1683990tvJ enumC1683990tvJ, float f) {
        this.LIZIZ = enumC1683990tvJ;
        this.LIZJ = f;
    }
}
