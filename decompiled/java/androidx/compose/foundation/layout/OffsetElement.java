package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1668650tWZ;
import X.C1688610u2l;
import X.C1688620u2m;
import X.C20052513d5;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class OffsetElement extends AbstractC1685820tyG<C1688610u2l> {
    public final float LIZIZ;
    public final float LIZJ;
    public final boolean LIZLLL;
    public final Function1<C1688620u2m, Unit> LJ;

    public OffsetElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1688610u2l(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OffsetModifierElement(x=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", y=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(", rtlAware=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1688610u2l c1688610u2l = (C1688610u2l) abstractC20055413dY;
        float f = this.LIZIZ;
        float f2 = this.LIZJ;
        boolean z = this.LIZLLL;
        if (!C1668650tWZ.LIZJ(c1688610u2l.LLJJ, f) || !C1668650tWZ.LIZJ(c1688610u2l.LLJJI, f2) || c1688610u2l.LLJJIII != z) {
            C20052513d5.LJFF(c1688610u2l).LJJL(false);
        }
        c1688610u2l.LLJJ = f;
        c1688610u2l.LLJJI = f2;
        c1688610u2l.LLJJIII = z;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement != null && C1668650tWZ.LIZJ(this.LIZIZ, offsetElement.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, offsetElement.LIZJ) && this.LIZLLL == offsetElement.LIZLLL) {
            return true;
        }
        return false;
    }

    public OffsetElement(float f, float f2, boolean z, Function1 function1) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = z;
        this.LJ = function1;
    }
}
