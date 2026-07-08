package androidx.compose.foundation.lazy.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1690570u5v;
import X.C1691280u74;
import X.C786410Ut5;
import X.EnumC1684030tvN;
import X.InterfaceC1691320u78;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends AbstractC1685820tyG<C1691280u74> {
    public final InterfaceC1691320u78 LIZIZ;
    public final C1690570u5v LIZJ;
    public final boolean LIZLLL;
    public final EnumC1684030tvN LJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1691280u74(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
    }

    public final int hashCode() {
        return (((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1691280u74 c1691280u74 = (C1691280u74) abstractC20055413dY;
        InterfaceC1691320u78 interfaceC1691320u78 = this.LIZIZ;
        C1690570u5v c1690570u5v = this.LIZJ;
        boolean z = this.LIZLLL;
        EnumC1684030tvN enumC1684030tvN = this.LJ;
        c1691280u74.LLJJ = interfaceC1691320u78;
        c1691280u74.LLJJI = c1690570u5v;
        c1691280u74.LLJJIII = z;
        c1691280u74.LLJJIJI = enumC1684030tvN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, lazyLayoutBeyondBoundsModifierElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, lazyLayoutBeyondBoundsModifierElement.LIZJ) && this.LIZLLL == lazyLayoutBeyondBoundsModifierElement.LIZLLL && this.LJ == lazyLayoutBeyondBoundsModifierElement.LJ) {
            return true;
        }
        return false;
    }

    public LazyLayoutBeyondBoundsModifierElement(InterfaceC1691320u78 interfaceC1691320u78, C1690570u5v c1690570u5v, boolean z, EnumC1684030tvN enumC1684030tvN) {
        this.LIZIZ = interfaceC1691320u78;
        this.LIZJ = c1690570u5v;
        this.LIZLLL = z;
        this.LJ = enumC1684030tvN;
    }
}
