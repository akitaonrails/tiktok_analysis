package androidx.compose.foundation.gestures;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1378605aS;
import X.C1380605am;
import X.C786410Ut5;
import X.EnumC1684030tvN;
import X.InterfaceC1364105Vn;
import X.InterfaceC1381005aq;
import X.InterfaceC1631620sYq;
import X.InterfaceC497601wk;
import X.InterfaceC595010NVj;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DraggableElement extends AbstractC1685820tyG<C1380605am> {
    public static final AFwS229S0000000_2 LJIIIZ = AFwS229S0000000_2.get$arr$(10);
    public final InterfaceC1381005aq LIZIZ;
    public final EnumC1684030tvN LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC595010NVj LJ;
    public final boolean LJFF;
    public final InterfaceC1631620sYq<InterfaceC497601wk, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> LJI;
    public final InterfaceC1631620sYq<InterfaceC497601wk, Float, InterfaceC1364105Vn<? super Unit>, Object> LJII;
    public final boolean LJIIIIZZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1380605am(this.LIZIZ, LJIIIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        InterfaceC595010NVj interfaceC595010NVj = this.LJ;
        return ((((((((iHashCode + (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        boolean z;
        C1380605am c1380605am = (C1380605am) abstractC20055413dY;
        InterfaceC1381005aq interfaceC1381005aq = this.LIZIZ;
        AFwS229S0000000_2 aFwS229S0000000_2 = LJIIIZ;
        EnumC1684030tvN enumC1684030tvN = this.LIZJ;
        boolean z2 = this.LIZLLL;
        InterfaceC595010NVj interfaceC595010NVj = this.LJ;
        boolean z3 = this.LJFF;
        InterfaceC1631620sYq<InterfaceC497601wk, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq = this.LJI;
        InterfaceC1631620sYq<InterfaceC497601wk, Float, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq2 = this.LJII;
        boolean z4 = this.LJIIIIZZ;
        if (!Intrinsics.LJFF(c1380605am.LLJJJJLIIL, interfaceC1381005aq)) {
            c1380605am.LLJJJJLIIL = interfaceC1381005aq;
            z = true;
        } else {
            z = false;
        }
        if (c1380605am.LLJJL != enumC1684030tvN) {
            c1380605am.LLJJL = enumC1684030tvN;
            z = true;
        }
        if (c1380605am.LLJLILLLLZIIL != z4) {
            c1380605am.LLJLILLLLZIIL = z4;
            z = true;
        }
        c1380605am.LLJL = interfaceC1631620sYq;
        c1380605am.LLJLIL = interfaceC1631620sYq2;
        c1380605am.LLJJLIIIJLLLLLLLZ = z3;
        c1380605am.LLJJL(aFwS229S0000000_2, z2, interfaceC595010NVj, enumC1684030tvN, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, draggableElement.LIZIZ) && this.LIZJ == draggableElement.LIZJ && this.LIZLLL == draggableElement.LIZLLL && Intrinsics.LJFF(this.LJ, draggableElement.LJ) && this.LJFF == draggableElement.LJFF && Intrinsics.LJFF(this.LJI, draggableElement.LJI) && Intrinsics.LJFF(this.LJII, draggableElement.LJII) && this.LJIIIIZZ == draggableElement.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(InterfaceC1381005aq interfaceC1381005aq, EnumC1684030tvN enumC1684030tvN, boolean z, InterfaceC595010NVj interfaceC595010NVj, boolean z2, InterfaceC1631620sYq<? super InterfaceC497601wk, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, InterfaceC1631620sYq<? super InterfaceC497601wk, ? super Float, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq2, boolean z3) {
        this.LIZIZ = interfaceC1381005aq;
        this.LIZJ = enumC1684030tvN;
        this.LIZLLL = z;
        this.LJ = interfaceC595010NVj;
        this.LJFF = z2;
        this.LJI = interfaceC1631620sYq;
        this.LJII = interfaceC1631620sYq2;
        this.LJIIIIZZ = z3;
    }
}
