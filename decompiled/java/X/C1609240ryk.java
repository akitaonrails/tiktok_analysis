package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609240ryk implements InterfaceC1609020ryO {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final InterfaceC1609270ryn LIZJ;
    public final Function1<C1608740rxw, Float> LIZLLL;
    public final boolean LJ;
    public final Function1<C1608740rxw, Float> LJFF;
    public final boolean LJI;
    public final C1608470rxV LJII;

    public C1609240ryk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1609240ryk)) {
            return false;
        }
        C1609240ryk c1609240ryk = (C1609240ryk) obj;
        return Intrinsics.LJFF(this.LIZ, c1609240ryk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1609240ryk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1609240ryk.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1609240ryk.LIZLLL) && this.LJ == c1609240ryk.LJ && Intrinsics.LJFF(this.LJFF, c1609240ryk.LJFF) && this.LJI == c1609240ryk.LJI;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Function1<C1608740rxw, Float> function1 = this.LJFF;
        return ((iHashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarDotUIData(color=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", colorRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", dotWidth=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasHollowOutline=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", outlineWidth=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", autoRTL=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1609020ryO
    public final InterfaceC1609270ryn getPosition() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1609020ryO
    public final C1608470rxV getSize() {
        return this.LJII;
    }

    public C1609240ryk(Integer num, InterfaceC1609270ryn interfaceC1609270ryn, Function1 function1, Function1 function12) {
        this.LIZ = null;
        this.LIZIZ = num;
        this.LIZJ = interfaceC1609270ryn;
        this.LIZLLL = function1;
        this.LJ = true;
        this.LJFF = function12;
        this.LJI = true;
        this.LJII = new C1608470rxV(new AwS603S0100000_24(this, 15), new AwS603S0100000_24(this, 16), 4);
    }
}
