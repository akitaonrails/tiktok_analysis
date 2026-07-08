package androidx.compose.ui.graphics;

import X.AbstractC1683790tuz;
import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676680tjW;
import X.C1683040ttm;
import X.C1685910tyP;
import X.C20052513d5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1680710tq1;
import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: loaded from: classes26.dex */
public final class GraphicsLayerElement extends AbstractC1685820tyG<C1683040ttm> {
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final long LJIIJJI;
    public final InterfaceC1680710tq1 LJIIL;
    public final boolean LJIILIIL;
    public final AbstractC1683790tuz LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final int LJIIZILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.LIZIZ, graphicsLayerElement.LIZIZ) == 0 && Float.compare(this.LIZJ, graphicsLayerElement.LIZJ) == 0 && Float.compare(this.LIZLLL, graphicsLayerElement.LIZLLL) == 0 && Float.compare(this.LJ, graphicsLayerElement.LJ) == 0 && Float.compare(this.LJFF, graphicsLayerElement.LJFF) == 0 && Float.compare(this.LJI, graphicsLayerElement.LJI) == 0 && Float.compare(this.LJII, graphicsLayerElement.LJII) == 0 && Float.compare(this.LJIIIIZZ, graphicsLayerElement.LJIIIIZZ) == 0 && Float.compare(this.LJIIIZ, graphicsLayerElement.LJIIIZ) == 0 && Float.compare(this.LJIIJ, graphicsLayerElement.LJIIJ) == 0 && C1676680tjW.LIZ(this.LJIIJJI, graphicsLayerElement.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, graphicsLayerElement.LJIIL) && this.LJIILIIL == graphicsLayerElement.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, graphicsLayerElement.LJIILJJIL) && C1685910tyP.LJ(this.LJIILL, graphicsLayerElement.LJIILL) && C1685910tyP.LJ(this.LJIILLIIL, graphicsLayerElement.LJIILLIIL) && this.LJIIZILJ == graphicsLayerElement.LJIIZILJ;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1683040ttm(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((((((((((((Float.floatToIntBits(this.LIZIZ) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + Float.floatToIntBits(this.LJIIIZ)) * 31) + Float.floatToIntBits(this.LJIIJ)) * 31;
        long j = this.LJIIJJI;
        int i = C1676680tjW.LIZJ;
        int iY2 = (((((iFloatToIntBits + C786410Ut5.Y2(j)) * 31) + this.LJIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31;
        AbstractC1683790tuz abstractC1683790tuz = this.LJIILJJIL;
        return ((((((iY2 + (abstractC1683790tuz == null ? 0 : abstractC1683790tuz.hashCode())) * 31) + C1685910tyP.LJIIJ(this.LJIILL)) * 31) + C1685910tyP.LJIIJ(this.LJIILLIIL)) * 31) + this.LJIIZILJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.LIZIZ);
        sb.append(", scaleY=");
        sb.append(this.LIZJ);
        sb.append(", alpha=");
        sb.append(this.LIZLLL);
        sb.append(", translationX=");
        sb.append(this.LJ);
        sb.append(", translationY=");
        sb.append(this.LJFF);
        sb.append(", shadowElevation=");
        sb.append(this.LJI);
        sb.append(", rotationX=");
        sb.append(this.LJII);
        sb.append(", rotationY=");
        sb.append(this.LJIIIIZZ);
        sb.append(", rotationZ=");
        sb.append(this.LJIIIZ);
        sb.append(", cameraDistance=");
        sb.append(this.LJIIJ);
        sb.append(", transformOrigin=");
        sb.append((Object) C1676680tjW.LIZLLL(this.LJIIJJI));
        sb.append(", shape=");
        sb.append(this.LJIIL);
        sb.append(", clip=");
        sb.append(this.LJIILIIL);
        sb.append(", renderEffect=");
        sb.append(this.LJIILJJIL);
        sb.append(", ambientShadowColor=");
        sb.append((Object) C1685910tyP.LJIIJJI(this.LJIILL));
        sb.append(", spotShadowColor=");
        sb.append((Object) C1685910tyP.LJIIJJI(this.LJIILLIIL));
        sb.append(", compositingStrategy=");
        int i = this.LJIIZILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompositingStrategy(value=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        sb.append((Object) C2188811AlT.LIZIZ(sbLIZ));
        sb.append(')');
        return sb.toString();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1683040ttm c1683040ttm = (C1683040ttm) abstractC20055413dY;
        c1683040ttm.LLJJ = this.LIZIZ;
        c1683040ttm.LLJJI = this.LIZJ;
        c1683040ttm.LLJJIII = this.LIZLLL;
        c1683040ttm.LLJJIJI = this.LJ;
        c1683040ttm.LLJJIJIIJIL = this.LJFF;
        c1683040ttm.LLJJIJIL = this.LJI;
        c1683040ttm.LLJJJ = this.LJII;
        c1683040ttm.LLJJJIL = this.LJIIIIZZ;
        c1683040ttm.LLJJJJ = this.LJIIIZ;
        c1683040ttm.LLJJJJJIL = this.LJIIJ;
        c1683040ttm.LLJJJJLIIL = this.LJIIJJI;
        c1683040ttm.LLJJL = this.LJIIL;
        c1683040ttm.LLJJLIIIJLLLLLLLZ = this.LJIILIIL;
        c1683040ttm.LLJL = this.LJIILJJIL;
        c1683040ttm.LLJLIL = this.LJIILL;
        c1683040ttm.LLJLILLLLZIIL = this.LJIILLIIL;
        c1683040ttm.LLJLL = this.LJIIZILJ;
        j1 j1Var = C20052513d5.LIZLLL(c1683040ttm, 2).LLJJI;
        if (j1Var != null) {
            j1Var.LLJJ(c1683040ttm.LLJLLIL, true);
        }
    }

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC1680710tq1 interfaceC1680710tq1, boolean z, AbstractC1683790tuz abstractC1683790tuz, long j2, long j3, int i) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
        this.LJII = f7;
        this.LJIIIIZZ = f8;
        this.LJIIIZ = f9;
        this.LJIIJ = f10;
        this.LJIIJJI = j;
        this.LJIIL = interfaceC1680710tq1;
        this.LJIILIIL = z;
        this.LJIILJJIL = abstractC1683790tuz;
        this.LJIILL = j2;
        this.LJIILLIIL = j3;
        this.LJIIZILJ = i;
    }
}
