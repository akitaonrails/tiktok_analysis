package androidx.compose.foundation.lazy.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676820tjk;
import X.C1689850u4l;
import X.C2188811AlT;
import X.InterfaceC1675680thu;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LazyLayoutAnimateItemElement extends AbstractC1685820tyG<C1689850u4l> {
    public final InterfaceC1675680thu<Float> LIZIZ;
    public final InterfaceC1675680thu<C1676820tjk> LIZJ;
    public final InterfaceC1675680thu<Float> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, lazyLayoutAnimateItemElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, lazyLayoutAnimateItemElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, lazyLayoutAnimateItemElement.LIZLLL);
    }

    public final int hashCode() {
        InterfaceC1675680thu<Float> interfaceC1675680thu = this.LIZIZ;
        int iHashCode = (interfaceC1675680thu == null ? 0 : interfaceC1675680thu.hashCode()) * 31;
        InterfaceC1675680thu<C1676820tjk> interfaceC1675680thu2 = this.LIZJ;
        int iHashCode2 = (iHashCode + (interfaceC1675680thu2 == null ? 0 : interfaceC1675680thu2.hashCode())) * 31;
        InterfaceC1675680thu<Float> interfaceC1675680thu3 = this.LIZLLL;
        return iHashCode2 + (interfaceC1675680thu3 != null ? interfaceC1675680thu3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LazyLayoutAnimateItemElement(fadeInSpec=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", placementSpec=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fadeOutSpec=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1689850u4l(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1689850u4l c1689850u4l = (C1689850u4l) abstractC20055413dY;
        c1689850u4l.LLJJ = this.LIZIZ;
        c1689850u4l.LLJJI = this.LIZJ;
        c1689850u4l.LLJJIII = this.LIZLLL;
    }

    public LazyLayoutAnimateItemElement(InterfaceC1675680thu<Float> interfaceC1675680thu, InterfaceC1675680thu<C1676820tjk> interfaceC1675680thu2, InterfaceC1675680thu<Float> interfaceC1675680thu3) {
        this.LIZIZ = interfaceC1675680thu;
        this.LIZJ = interfaceC1675680thu2;
        this.LIZLLL = interfaceC1675680thu3;
    }
}
