package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0El8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373800El8 {
    public final EnumC373830ElB LIZ;
    public final C419910GdJ LIZIZ;
    public final C419910GdJ LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C373800El8)) {
            return false;
        }
        C373800El8 c373800El8 = (C373800El8) obj;
        return this.LIZ == c373800El8.LIZ && Intrinsics.LJFF(this.LIZIZ, c373800El8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c373800El8.LIZJ) && this.LIZLLL == c373800El8.LIZLLL && this.LJ == c373800El8.LJ && this.LJFF == c373800El8.LJFF && this.LJI == c373800El8.LJI;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C419910GdJ c419910GdJ = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c419910GdJ == null ? 0 : c419910GdJ.hashCode())) * 31;
        C419910GdJ c419910GdJ2 = this.LIZJ;
        return ((((((((iHashCode2 + (c419910GdJ2 != null ? c419910GdJ2.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutToolBarItem(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconSelected=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nameResId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSelect=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showBorderWhenSelected=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C373800El8 LIZ(C373800El8 c373800El8, boolean z, boolean z2, int i) {
        EnumC373830ElB enumC373830ElB;
        C419910GdJ c419910GdJ;
        int i2;
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        C419910GdJ c419910GdJ2 = null;
        if ((i & 1) != 0) {
            enumC373830ElB = c373800El8.LIZ;
        } else {
            enumC373830ElB = null;
        }
        if ((i & 2) != 0) {
            c419910GdJ = c373800El8.LIZIZ;
        } else {
            c419910GdJ = null;
        }
        if ((i & 4) != 0) {
            c419910GdJ2 = c373800El8.LIZJ;
        }
        if ((i & 8) != 0) {
            i2 = c373800El8.LIZLLL;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            z5 = c373800El8.LJ;
        }
        if ((i & 32) != 0) {
            z4 = c373800El8.LJFF;
        }
        if ((i & 64) != 0) {
            z3 = c373800El8.LJI;
        } else {
            z3 = false;
        }
        c373800El8.getClass();
        return new C373800El8(enumC373830ElB, c419910GdJ, c419910GdJ2, i2, z5, z4, z3);
    }

    public C373800El8(EnumC373830ElB enumC373830ElB, C419910GdJ c419910GdJ, C419910GdJ c419910GdJ2, int i, boolean z, boolean z2, boolean z3) {
        this.LIZ = enumC373830ElB;
        this.LIZIZ = c419910GdJ;
        this.LIZJ = c419910GdJ2;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C373800El8(EnumC373830ElB enumC373830ElB, C419910GdJ c419910GdJ, C419910GdJ c419910GdJ2, int i, boolean z, boolean z2, boolean z3, int i2) {
        c419910GdJ = (i2 & 2) != 0 ? null : c419910GdJ;
        this(enumC373830ElB, c419910GdJ, (i2 & 4) != 0 ? c419910GdJ : c419910GdJ2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? true : z2, (i2 & 64) != 0 ? false : z3);
    }
}
