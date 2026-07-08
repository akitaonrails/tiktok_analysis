package androidx.compose.ui;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1684160tva;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes26.dex */
public final class ZIndexElement extends AbstractC1685820tyG<C1684160tva> {
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.LIZIZ, ((ZIndexElement) obj).LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ZIndexElement(zIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1684160tva(this.LIZIZ);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LIZIZ);
    }

    public ZIndexElement(float f) {
        this.LIZIZ = f;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        ((C1684160tva) abstractC20055413dY).LLJJ = this.LIZIZ;
    }
}
