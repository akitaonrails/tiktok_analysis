package androidx.compose.foundation;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C20052513d5;
import X.C20073913gX;
import X.C20279814Wu;
import X.C786410Ut5;
import X.InterfaceC1693230uAD;
import X.InterfaceC20079413hQ;
import X.InterfaceC595010NVj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class CombinedClickableElement extends AbstractC1685820tyG<C20073913gX> {
    public final InterfaceC595010NVj LIZIZ;
    public final InterfaceC1693230uAD LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final C20279814Wu LJFF;
    public final Function0<Unit> LJI;
    public final String LJII;
    public final Function0<Unit> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public final boolean LJIIJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        Function0<Unit> function0 = this.LJI;
        String str = this.LJII;
        Function0<Unit> function02 = this.LJIIIIZZ;
        Function0<Unit> function03 = this.LJIIIZ;
        boolean z = this.LJIIJ;
        InterfaceC595010NVj interfaceC595010NVj = this.LIZIZ;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZJ;
        boolean z2 = this.LIZLLL;
        return new C20073913gX(interfaceC1693230uAD, interfaceC595010NVj, this.LJFF, str, this.LJ, function0, function02, function03, z, z2);
    }

    public final int hashCode() {
        InterfaceC595010NVj interfaceC595010NVj = this.LIZIZ;
        int iHashCode = (interfaceC595010NVj != null ? interfaceC595010NVj.hashCode() : 0) * 31;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZJ;
        int iHashCode2 = (((iHashCode + (interfaceC1693230uAD != null ? interfaceC1693230uAD.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C20279814Wu c20279814Wu = this.LJFF;
        int iHashCode4 = (((iHashCode3 + (c20279814Wu != null ? c20279814Wu.LIZ : 0)) * 31) + this.LJI.hashCode()) * 31;
        String str2 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.LJIIIIZZ;
        int iHashCode6 = (iHashCode5 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function0<Unit> function02 = this.LJIIIZ;
        return ((iHashCode6 + (function02 != null ? function02.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        InterfaceC20079413hQ interfaceC20079413hQ;
        C20073913gX c20073913gX = (C20073913gX) abstractC20055413dY;
        c20073913gX.LLLF = this.LJIIJ;
        Function0<Unit> function0 = this.LJI;
        String str = this.LJII;
        Function0<Unit> function02 = this.LJIIIIZZ;
        Function0<Unit> function03 = this.LJIIIZ;
        InterfaceC595010NVj interfaceC595010NVj = this.LIZIZ;
        InterfaceC1693230uAD interfaceC1693230uAD = this.LIZJ;
        boolean z5 = this.LIZLLL;
        String str2 = this.LJ;
        C20279814Wu c20279814Wu = this.LJFF;
        if (!Intrinsics.LJFF(c20073913gX.LLJZ, str)) {
            c20073913gX.LLJZ = str;
            C20052513d5.LJFF(c20073913gX).LJJJJIZL();
        }
        boolean z6 = true;
        boolean z7 = false;
        if (c20073913gX.LLJZIJLIL == null) {
            z = true;
        } else {
            z = false;
        }
        if (function02 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            c20073913gX.LLJJIJIL();
            C20052513d5.LJFF(c20073913gX).LJJJJIZL();
            z3 = true;
        } else {
            z3 = false;
        }
        c20073913gX.LLJZIJLIL = function02;
        if (c20073913gX.LLL == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (function03 == null) {
            z7 = true;
        }
        if (z4 != z7) {
            z3 = true;
        }
        c20073913gX.LLL = function03;
        if (c20073913gX.LLJJJ == z5) {
            z6 = z3;
        }
        c20073913gX.LLJJJJLIIL(interfaceC595010NVj, interfaceC1693230uAD, z5, str2, c20279814Wu, function0);
        if (z6 && (interfaceC20079413hQ = c20073913gX.LLJJJJJIL) != null) {
            interfaceC20079413hQ.LJLLLL();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (Intrinsics.LJFF(this.LIZIZ, combinedClickableElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, combinedClickableElement.LIZJ) && this.LIZLLL == combinedClickableElement.LIZLLL && Intrinsics.LJFF(this.LJ, combinedClickableElement.LJ) && Intrinsics.LJFF(this.LJFF, combinedClickableElement.LJFF) && this.LJI == combinedClickableElement.LJI && Intrinsics.LJFF(this.LJII, combinedClickableElement.LJII) && this.LJIIIIZZ == combinedClickableElement.LJIIIIZZ && this.LJIIIZ == combinedClickableElement.LJIIIZ && this.LJIIJ == combinedClickableElement.LJIIJ) {
            return true;
        }
        return false;
    }

    public CombinedClickableElement(InterfaceC1693230uAD interfaceC1693230uAD, InterfaceC595010NVj interfaceC595010NVj, C20279814Wu c20279814Wu, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z, boolean z2) {
        this.LIZIZ = interfaceC595010NVj;
        this.LIZJ = interfaceC1693230uAD;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = c20279814Wu;
        this.LJI = function0;
        this.LJII = str2;
        this.LJIIIIZZ = function02;
        this.LJIIIZ = function03;
        this.LJIIJ = z2;
    }
}
