package androidx.compose.foundation.gestures;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1681210tqp;
import X.C594920NVa;
import X.C786410Ut5;
import X.EnumC1684030tvN;
import X.InterfaceC1681290tqx;
import X.InterfaceC595010NVj;
import X.InterfaceC633750OtR;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AnchoredDraggableElement<T> extends AbstractC1685820tyG<C1681210tqp<T>> {
    public final C594920NVa<T> LIZIZ;
    public final EnumC1684030tvN LIZJ;
    public final boolean LIZLLL;
    public final Boolean LJ;
    public final InterfaceC595010NVj LJFF;
    public final Boolean LJI = null;
    public final InterfaceC1681290tqx LJII;
    public final InterfaceC633750OtR LJIIIIZZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        C594920NVa<T> c594920NVa = this.LIZIZ;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        boolean z = this.LIZLLL;
        Boolean bool = this.LJ;
        InterfaceC595010NVj interfaceC595010NVj = this.LJFF;
        return new C1681210tqp(this.LJII, c594920NVa, this.LJIIIIZZ, enumC1684030tvN, interfaceC595010NVj, bool, this.LJI, z);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Boolean bool = this.LJ;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        InterfaceC595010NVj interfaceC595010NVj = this.LJFF;
        int iHashCode3 = (iHashCode2 + (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0)) * 31;
        Boolean bool2 = this.LJI;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LJII;
        int iHashCode5 = (iHashCode4 + (interfaceC1681290tqx != null ? interfaceC1681290tqx.hashCode() : 0)) * 31;
        InterfaceC633750OtR interfaceC633750OtR = this.LJIIIIZZ;
        return iHashCode5 + (interfaceC633750OtR != null ? interfaceC633750OtR.hashCode() : 0);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        boolean z;
        C1681210tqp c1681210tqp = (C1681210tqp) abstractC20055413dY;
        C594920NVa<T> c594920NVa = this.LIZIZ;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        boolean z2 = this.LIZLLL;
        Boolean bool = this.LJ;
        InterfaceC595010NVj interfaceC595010NVj = this.LJFF;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LJII;
        Boolean bool2 = this.LJI;
        InterfaceC633750OtR interfaceC633750OtR = this.LJIIIIZZ;
        c1681210tqp.LLJLILLLLZIIL = interfaceC633750OtR;
        if (!Intrinsics.LJFF(c1681210tqp.LLJJJJLIIL, c594920NVa)) {
            c1681210tqp.LLJJJJLIIL = c594920NVa;
            c1681210tqp.LLJLILLLLZIIL(interfaceC633750OtR);
            z = true;
        } else {
            z = false;
        }
        if (c1681210tqp.LLJJL != enumC1684030tvN) {
            c1681210tqp.LLJJL = enumC1684030tvN;
            z = true;
        }
        if (!Intrinsics.LJFF(c1681210tqp.LLJJLIIIJLLLLLLLZ, bool)) {
            c1681210tqp.LLJJLIIIJLLLLLLLZ = bool;
            z = true;
        }
        c1681210tqp.LLJLIL = bool2;
        c1681210tqp.LLJL = interfaceC1681290tqx;
        c1681210tqp.LLJJL(c1681210tqp.LLJJIJI, z2, interfaceC595010NVj, enumC1684030tvN, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, anchoredDraggableElement.LIZIZ) && this.LIZJ == anchoredDraggableElement.LIZJ && this.LIZLLL == anchoredDraggableElement.LIZLLL && Intrinsics.LJFF(this.LJ, anchoredDraggableElement.LJ) && Intrinsics.LJFF(this.LJFF, anchoredDraggableElement.LJFF) && Intrinsics.LJFF(this.LJI, anchoredDraggableElement.LJI) && Intrinsics.LJFF(this.LJII, anchoredDraggableElement.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, anchoredDraggableElement.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public AnchoredDraggableElement(C594920NVa c594920NVa, EnumC1684030tvN enumC1684030tvN, boolean z, Boolean bool, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1681290tqx interfaceC1681290tqx, InterfaceC633750OtR interfaceC633750OtR) {
        this.LIZIZ = c594920NVa;
        this.LIZJ = enumC1684030tvN;
        this.LIZLLL = z;
        this.LJ = bool;
        this.LJFF = interfaceC595010NVj;
        this.LJII = interfaceC1681290tqx;
        this.LJIIIIZZ = interfaceC633750OtR;
    }
}
