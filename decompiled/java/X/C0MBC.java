package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MBC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MBC {
    public final C1668880tWw LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final Function0<Unit> LJI;

    public C0MBC() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MBC)) {
            return false;
        }
        C0MBC c0mbc = (C0MBC) obj;
        return Intrinsics.LJFF(this.LIZ, c0mbc.LIZ) && this.LIZIZ == c0mbc.LIZIZ && this.LIZJ == c0mbc.LIZJ && this.LIZLLL == c0mbc.LIZLLL && this.LJ == c0mbc.LJ && Intrinsics.LJFF(this.LJFF, c0mbc.LJFF) && Intrinsics.LJFF(this.LJI, c0mbc.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceDescriptor(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showNewBadge=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showCheckBox=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0MBC(C1668880tWw c1668880tWw, int i, boolean z, boolean z2, boolean z3, String str, Function0 function0, int i2) {
        z = (i2 & 4) != 0 ? true : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        z3 = (i2 & 16) != 0 ? false : z3;
        str = (i2 & 32) != 0 ? null : str;
        this.LIZ = c1668880tWw;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = str;
        this.LJI = function0;
    }
}
