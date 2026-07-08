package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1693200uAA;
import X.C612270Nzt;
import X.C786410Ut5;
import X.EnumC1684030tvN;
import X.InterfaceC1420105h9;
import X.InterfaceC1681290tqx;
import X.InterfaceC20063613es;
import X.InterfaceC595010NVj;
import X.InterfaceC633750OtR;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class ScrollingContainerElement extends AbstractC1685820tyG<C1693200uAA> {
    public final InterfaceC1420105h9 LIZIZ;
    public final EnumC1684030tvN LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final InterfaceC633750OtR LJFF;
    public final InterfaceC595010NVj LJI;
    public final InterfaceC20063613es LJII;
    public final boolean LJIIIIZZ;
    public final InterfaceC1681290tqx LJIIIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        InterfaceC1420105h9 interfaceC1420105h9 = this.LIZIZ;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        boolean z = this.LIZLLL;
        boolean z2 = this.LJ;
        InterfaceC633750OtR interfaceC633750OtR = this.LJFF;
        InterfaceC595010NVj interfaceC595010NVj = this.LJI;
        return new C1693200uAA(this.LJIIIZ, this.LJII, interfaceC633750OtR, enumC1684030tvN, interfaceC1420105h9, interfaceC595010NVj, z, z2, this.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        InterfaceC633750OtR interfaceC633750OtR = this.LJFF;
        int iHashCode2 = (iHashCode + (interfaceC633750OtR != null ? interfaceC633750OtR.hashCode() : 0)) * 31;
        InterfaceC595010NVj interfaceC595010NVj = this.LJI;
        int iHashCode3 = (iHashCode2 + (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0)) * 31;
        InterfaceC20063613es interfaceC20063613es = this.LJII;
        int iHashCode4 = (((iHashCode3 + (interfaceC20063613es != null ? interfaceC20063613es.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LJIIIZ;
        return iHashCode4 + (interfaceC1681290tqx != null ? interfaceC1681290tqx.hashCode() : 0);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        InterfaceC1420105h9 interfaceC1420105h9 = this.LIZIZ;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        boolean z = this.LJIIIIZZ;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LJIIIZ;
        boolean z2 = this.LIZLLL;
        boolean z3 = this.LJ;
        ((C1693200uAA) abstractC20055413dY).LLJJIJIL(interfaceC1681290tqx, this.LJII, this.LJFF, enumC1684030tvN, interfaceC1420105h9, this.LJI, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, scrollingContainerElement.LIZIZ) && this.LIZJ == scrollingContainerElement.LIZJ && this.LIZLLL == scrollingContainerElement.LIZLLL && this.LJ == scrollingContainerElement.LJ && Intrinsics.LJFF(this.LJFF, scrollingContainerElement.LJFF) && Intrinsics.LJFF(this.LJI, scrollingContainerElement.LJI) && Intrinsics.LJFF(this.LJII, scrollingContainerElement.LJII) && this.LJIIIIZZ == scrollingContainerElement.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, scrollingContainerElement.LJIIIZ)) {
            return true;
        }
        return false;
    }

    public ScrollingContainerElement(InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC20063613es interfaceC20063613es, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC1420105h9 interfaceC1420105h9, C612270Nzt c612270Nzt, boolean z, boolean z2, boolean z3) {
        this.LIZIZ = interfaceC1420105h9;
        this.LIZJ = enumC1684030tvN;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = interfaceC633750OtR;
        this.LJI = c612270Nzt;
        this.LJII = interfaceC20063613es;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = interfaceC1681290tqx;
    }
}
