package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1668650tWZ;
import X.C1684000tvK;

/* JADX INFO: loaded from: classes26.dex */
public final class UnspecifiedConstraintsElement extends AbstractC1685820tyG<C1684000tvK> {
    public final float LIZIZ;
    public final float LIZJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1684000tvK(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1684000tvK c1684000tvK = (C1684000tvK) abstractC20055413dY;
        c1684000tvK.LLJJ = this.LIZIZ;
        c1684000tvK.LLJJI = this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!C1668650tWZ.LIZJ(this.LIZIZ, unspecifiedConstraintsElement.LIZIZ) || !C1668650tWZ.LIZJ(this.LIZJ, unspecifiedConstraintsElement.LIZJ)) {
            return false;
        }
        return true;
    }

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.LIZIZ = f;
        this.LIZJ = f2;
    }
}
