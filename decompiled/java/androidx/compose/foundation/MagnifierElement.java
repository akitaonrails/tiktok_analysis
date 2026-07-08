package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1378605aS;
import X.C1668650tWZ;
import X.C1679680toM;
import X.C20051613cw;
import X.C20052513d5;
import X.C20074513gd;
import X.C786410Ut5;
import X.InterfaceC1690500u5o;
import X.InterfaceC20076313gv;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class MagnifierElement extends AbstractC1685820tyG<C20074513gd> {
    public final Function1<InterfaceC1690500u5o, C1378605aS> LIZIZ;
    public final Function1<InterfaceC1690500u5o, C1378605aS> LIZJ;
    public final Function1<C1679680toM, Unit> LIZLLL;
    public final float LJ;
    public final boolean LJFF;
    public final long LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;
    public final InterfaceC20076313gv LJIIJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C20074513gd(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        Function1<InterfaceC1690500u5o, C1378605aS> function1 = this.LIZJ;
        int iHashCode2 = (((((((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        Function1<C1679680toM, Unit> function12 = this.LIZLLL;
        return ((iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31) + this.LJIIJ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C20074513gd c20074513gd = (C20074513gd) abstractC20055413dY;
        Function1<InterfaceC1690500u5o, C1378605aS> function1 = this.LIZIZ;
        Function1<InterfaceC1690500u5o, C1378605aS> function12 = this.LIZJ;
        float f = this.LJ;
        boolean z = this.LJFF;
        long j = this.LJI;
        float f2 = this.LJII;
        float f3 = this.LJIIIIZZ;
        boolean z2 = this.LJIIIZ;
        Function1<C1679680toM, Unit> function13 = this.LIZLLL;
        InterfaceC20076313gv interfaceC20076313gv = this.LJIIJ;
        float f4 = c20074513gd.LLJJIJI;
        long j2 = c20074513gd.LLJJIJIL;
        float f5 = c20074513gd.LLJJJ;
        boolean z3 = c20074513gd.LLJJIJIIJIL;
        float f6 = c20074513gd.LLJJJIL;
        boolean z4 = c20074513gd.LLJJJJ;
        InterfaceC20076313gv interfaceC20076313gv2 = c20074513gd.LLJJJJJIL;
        View view = c20074513gd.LLJJJJLIIL;
        InterfaceC1690500u5o interfaceC1690500u5o = c20074513gd.LLJJL;
        c20074513gd.LLJJ = function1;
        c20074513gd.LLJJI = function12;
        c20074513gd.LLJJIJI = f;
        c20074513gd.LLJJIJIIJIL = z;
        c20074513gd.LLJJIJIL = j;
        c20074513gd.LLJJJ = f2;
        c20074513gd.LLJJJIL = f3;
        c20074513gd.LLJJJJ = z2;
        c20074513gd.LLJJIII = function13;
        c20074513gd.LLJJJJJIL = interfaceC20076313gv;
        View viewLIZ = C20051613cw.LIZ(c20074513gd);
        InterfaceC1690500u5o interfaceC1690500u5o2 = C20052513d5.LJFF(c20074513gd).LLJJJJLIIL;
        if (c20074513gd.LLJJLIIIJLLLLLLLZ != null && (((!Float.isNaN(f) || !Float.isNaN(f4)) && f != f4 && !interfaceC20076313gv.LIZIZ()) || j != j2 || !C1668650tWZ.LIZJ(f2, f5) || !C1668650tWZ.LIZJ(f3, f6) || z != z3 || z2 != z4 || !Intrinsics.LJFF(interfaceC20076313gv, interfaceC20076313gv2) || !Intrinsics.LJFF(viewLIZ, view) || !Intrinsics.LJFF(interfaceC1690500u5o2, interfaceC1690500u5o))) {
            c20074513gd.LLJJI();
        }
        c20074513gd.LLJJIII();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierElement)) {
            return false;
        }
        MagnifierElement magnifierElement = (MagnifierElement) obj;
        if (this.LIZIZ == magnifierElement.LIZIZ && this.LIZJ == magnifierElement.LIZJ && this.LJ == magnifierElement.LJ && this.LJFF == magnifierElement.LJFF && this.LJI == magnifierElement.LJI && C1668650tWZ.LIZJ(this.LJII, magnifierElement.LJII) && C1668650tWZ.LIZJ(this.LJIIIIZZ, magnifierElement.LJIIIIZZ) && this.LJIIIZ == magnifierElement.LJIIIZ && this.LIZLLL == magnifierElement.LIZLLL && Intrinsics.LJFF(this.LJIIJ, magnifierElement.LJIIJ)) {
            return true;
        }
        return false;
    }

    public MagnifierElement(AwS609S0100000_30 awS609S0100000_30, Function1 function1, Function1 function12, float f, boolean z, long j, float f2, float f3, boolean z2, InterfaceC20076313gv interfaceC20076313gv) {
        this.LIZIZ = awS609S0100000_30;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = f;
        this.LJFF = z;
        this.LJI = j;
        this.LJII = f2;
        this.LJIIIIZZ = f3;
        this.LJIIIZ = z2;
        this.LJIIJ = interfaceC20076313gv;
    }
}
