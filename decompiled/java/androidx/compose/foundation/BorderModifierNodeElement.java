package androidx.compose.foundation;

import X.AbstractC1668700tWe;
import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1668650tWZ;
import X.C1680740tq4;
import X.C2188811AlT;
import X.InterfaceC1680710tq1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class BorderModifierNodeElement extends AbstractC1685820tyG<C1680740tq4> {
    public final float LIZIZ;
    public final AbstractC1668700tWe LIZJ;
    public final InterfaceC1680710tq1 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return C1668650tWZ.LIZJ(this.LIZIZ, borderModifierNodeElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, borderModifierNodeElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, borderModifierNodeElement.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BorderModifierNodeElement(width=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", brush=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shape=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1680740tq4(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1680740tq4 c1680740tq4 = (C1680740tq4) abstractC20055413dY;
        float f = this.LIZIZ;
        if (!C1668650tWZ.LIZJ(c1680740tq4.LLJJIJI, f)) {
            c1680740tq4.LLJJIJI = f;
            c1680740tq4.LLJJJ.LJLLLLLL();
        }
        AbstractC1668700tWe abstractC1668700tWe = this.LIZJ;
        if (!Intrinsics.LJFF(c1680740tq4.LLJJIJIIJIL, abstractC1668700tWe)) {
            c1680740tq4.LLJJIJIIJIL = abstractC1668700tWe;
            c1680740tq4.LLJJJ.LJLLLLLL();
        }
        InterfaceC1680710tq1 interfaceC1680710tq1 = this.LIZLLL;
        if (!Intrinsics.LJFF(c1680740tq4.LLJJIJIL, interfaceC1680710tq1)) {
            c1680740tq4.LLJJIJIL = interfaceC1680710tq1;
            c1680740tq4.LLJJJ.LJLLLLLL();
        }
    }

    public BorderModifierNodeElement(float f, AbstractC1668700tWe abstractC1668700tWe, InterfaceC1680710tq1 interfaceC1680710tq1) {
        this.LIZIZ = f;
        this.LIZJ = abstractC1668700tWe;
        this.LIZLLL = interfaceC1680710tq1;
    }
}
