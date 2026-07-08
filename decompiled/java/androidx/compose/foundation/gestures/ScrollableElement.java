package androidx.compose.foundation.gestures;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C20074413gc;
import X.C786410Ut5;
import X.EnumC1684030tvN;
import X.InterfaceC1420105h9;
import X.InterfaceC1681290tqx;
import X.InterfaceC20063613es;
import X.InterfaceC595010NVj;
import X.InterfaceC633750OtR;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class ScrollableElement extends AbstractC1685820tyG<C20074413gc> {
    public final InterfaceC1420105h9 LIZIZ;
    public final EnumC1684030tvN LIZJ;
    public final InterfaceC1681290tqx LIZLLL = null;
    public final boolean LJ;
    public final boolean LJFF;
    public final InterfaceC633750OtR LJI;
    public final InterfaceC595010NVj LJII;
    public final InterfaceC20063613es LJIIIIZZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        InterfaceC1420105h9 interfaceC1420105h9 = this.LIZIZ;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LIZLLL;
        InterfaceC633750OtR interfaceC633750OtR = this.LJI;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        boolean z = this.LJ;
        boolean z2 = this.LJFF;
        return new C20074413gc(interfaceC1681290tqx, this.LJIIIIZZ, interfaceC633750OtR, enumC1684030tvN, interfaceC1420105h9, this.LJII, z, z2);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LIZLLL;
        int iHashCode2 = (((((iHashCode + (interfaceC1681290tqx != null ? interfaceC1681290tqx.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        InterfaceC633750OtR interfaceC633750OtR = this.LJI;
        int iHashCode3 = (iHashCode2 + (interfaceC633750OtR != null ? interfaceC633750OtR.hashCode() : 0)) * 31;
        InterfaceC595010NVj interfaceC595010NVj = this.LJII;
        int iHashCode4 = (iHashCode3 + (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0)) * 31;
        InterfaceC20063613es interfaceC20063613es = this.LJIIIIZZ;
        return iHashCode4 + (interfaceC20063613es != null ? interfaceC20063613es.hashCode() : 0);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        InterfaceC1420105h9 interfaceC1420105h9 = this.LIZIZ;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        InterfaceC1681290tqx interfaceC1681290tqx = this.LIZLLL;
        boolean z = this.LJ;
        boolean z2 = this.LJFF;
        ((C20074413gc) abstractC20055413dY).LLJJLIIIJLLLLLLLZ(interfaceC1681290tqx, this.LJIIIIZZ, this.LJI, enumC1684030tvN, interfaceC1420105h9, this.LJII, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, scrollableElement.LIZIZ) && this.LIZJ == scrollableElement.LIZJ && Intrinsics.LJFF(this.LIZLLL, scrollableElement.LIZLLL) && this.LJ == scrollableElement.LJ && this.LJFF == scrollableElement.LJFF && Intrinsics.LJFF(this.LJI, scrollableElement.LJI) && Intrinsics.LJFF(this.LJII, scrollableElement.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, scrollableElement.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public ScrollableElement(InterfaceC20063613es interfaceC20063613es, InterfaceC633750OtR interfaceC633750OtR, EnumC1684030tvN enumC1684030tvN, InterfaceC1420105h9 interfaceC1420105h9, InterfaceC595010NVj interfaceC595010NVj, boolean z, boolean z2) {
        this.LIZIZ = interfaceC1420105h9;
        this.LIZJ = enumC1684030tvN;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = interfaceC633750OtR;
        this.LJII = interfaceC595010NVj;
        this.LJIIIIZZ = interfaceC20063613es;
    }
}
