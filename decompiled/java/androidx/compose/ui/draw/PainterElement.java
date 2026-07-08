package androidx.compose.ui.draw;

import X.AbstractC1676270tir;
import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680770tq7;
import X.C1682350tsf;
import X.C1685400txa;
import X.C1691800u7u;
import X.C20052513d5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1668050tVb;
import X.InterfaceC1671600tbK;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class PainterElement extends AbstractC1685820tyG<C1682350tsf> {
    public final AbstractC1676270tir LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC1668050tVb LIZLLL;
    public final InterfaceC1671600tbK LJ;
    public final float LJFF;
    public final C1685400txa LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, painterElement.LIZIZ) && this.LIZJ == painterElement.LIZJ && Intrinsics.LJFF(this.LIZLLL, painterElement.LIZLLL) && Intrinsics.LJFF(this.LJ, painterElement.LJ) && Float.compare(this.LJFF, painterElement.LJFF) == 0 && Intrinsics.LJFF(this.LJI, painterElement.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PainterElement(painter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sizeToIntrinsics=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", alignment=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", contentScale=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", colorFilter=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1682350tsf(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF)) * 31;
        C1685400txa c1685400txa = this.LJI;
        return iHashCode + (c1685400txa == null ? 0 : c1685400txa.hashCode());
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        boolean z;
        C1682350tsf c1682350tsf = (C1682350tsf) abstractC20055413dY;
        boolean z2 = c1682350tsf.LLJJI;
        boolean z3 = this.LIZJ;
        if (z2 != z3 || (z3 && !C1680770tq7.LIZ(c1682350tsf.LLJJ.LJIIIIZZ(), this.LIZIZ.LJIIIIZZ()))) {
            z = true;
        } else {
            z = false;
        }
        c1682350tsf.LLJJ = this.LIZIZ;
        c1682350tsf.LLJJI = this.LIZJ;
        c1682350tsf.LLJJIII = this.LIZLLL;
        c1682350tsf.LLJJIJI = this.LJ;
        c1682350tsf.LLJJIJIIJIL = this.LJFF;
        c1682350tsf.LLJJIJIL = this.LJI;
        if (z) {
            C20052513d5.LJFF(c1682350tsf).LJJJJI();
        }
        C1691800u7u.LIZ(c1682350tsf);
    }

    public PainterElement(AbstractC1676270tir abstractC1676270tir, boolean z, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, float f, C1685400txa c1685400txa) {
        this.LIZIZ = abstractC1676270tir;
        this.LIZJ = z;
        this.LIZLLL = interfaceC1668050tVb;
        this.LJ = interfaceC1671600tbK;
        this.LJFF = f;
        this.LJI = c1685400txa;
    }
}
