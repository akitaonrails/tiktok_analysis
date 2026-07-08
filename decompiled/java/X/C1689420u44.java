package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u44, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689420u44 extends AbstractC1689250u3n {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1689420u44)) {
            return false;
        }
        C1689420u44 c1689420u44 = (C1689420u44) obj;
        return this.LIZIZ == c1689420u44.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1689420u44.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1689420u44.LIZLLL) && Intrinsics.LJFF(this.LJ, c1689420u44.LJ) && this.LJFF == c1689420u44.LJFF && this.LJI == c1689420u44.LJI && this.LJII == c1689420u44.LJII;
    }

    public final int hashCode() {
        return (((((((((((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Switch(type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", inApp=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1689250u3n
    public final String LIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1689250u3n
    public final boolean LIZIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC1689250u3n
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1689250u3n
    public final boolean LIZLLL() {
        return this.LJFF;
    }

    @Override // X.AbstractC1689250u3n
    public final String LJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1689250u3n
    public final int LJFF() {
        return this.LIZIZ;
    }

    public static C1689420u44 LJI(C1689420u44 c1689420u44, boolean z, boolean z2, int i) {
        int i2;
        String str;
        String str2;
        boolean z3 = z2;
        boolean z4 = z;
        boolean z5 = false;
        if ((i & 1) != 0) {
            i2 = c1689420u44.LIZIZ;
        } else {
            i2 = 0;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            str = c1689420u44.LIZJ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = c1689420u44.LIZLLL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = c1689420u44.LJ;
        }
        if ((i & 16) != 0) {
            z5 = c1689420u44.LJFF;
        }
        if ((i & 32) != 0) {
            z4 = c1689420u44.LJI;
        }
        if ((i & 64) != 0) {
            z3 = c1689420u44.LJII;
        }
        c1689420u44.getClass();
        return new C1689420u44(str, str2, str3, z5, i2, z4, z3);
    }

    public C1689420u44(String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
    }
}
