package androidx.compose.ui.draw;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1668650tWZ;
import X.C1680490tpf;
import X.C1685910tyP;
import X.C20052513d5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1680710tq1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: loaded from: classes26.dex */
public final class ShadowGraphicsLayerElement extends AbstractC1685820tyG<C1680490tpf> {
    public final float LIZIZ;
    public final InterfaceC1680710tq1 LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return C1668650tWZ.LIZJ(this.LIZIZ, shadowGraphicsLayerElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, shadowGraphicsLayerElement.LIZJ) && this.LIZLLL == shadowGraphicsLayerElement.LIZLLL && C1685910tyP.LJ(this.LJ, shadowGraphicsLayerElement.LJ) && C1685910tyP.LJ(this.LJFF, shadowGraphicsLayerElement.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShadowGraphicsLayerElement(elevation=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", shape=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clip=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", ambientColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LJ));
        sbLIZ.append(", spotColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LJFF));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1680490tpf(new AwS604S0100000_25(this, 819));
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C1685910tyP.LJIIJ(this.LJ)) * 31) + C1685910tyP.LJIIJ(this.LJFF);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1680490tpf c1680490tpf = (C1680490tpf) abstractC20055413dY;
        c1680490tpf.LLJJ = new AwS604S0100000_25(this, 819);
        j1 j1Var = C20052513d5.LIZLLL(c1680490tpf, 2).LLJJI;
        if (j1Var != null) {
            j1Var.LLJJ(c1680490tpf.LLJJ, true);
        }
    }

    public ShadowGraphicsLayerElement(float f, InterfaceC1680710tq1 interfaceC1680710tq1, boolean z, long j, long j2) {
        this.LIZIZ = f;
        this.LIZJ = interfaceC1680710tq1;
        this.LIZLLL = z;
        this.LJ = j;
        this.LJFF = j2;
    }
}
