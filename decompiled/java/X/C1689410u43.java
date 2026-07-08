package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689410u43 extends AbstractC1689280u3q {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1689410u43)) {
            return false;
        }
        C1689410u43 c1689410u43 = (C1689410u43) obj;
        return this.LIZIZ == c1689410u43.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1689410u43.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1689410u43.LIZLLL) && Intrinsics.LJFF(this.LJ, c1689410u43.LJ) && this.LJFF == c1689410u43.LJFF && this.LJI == c1689410u43.LJI && Intrinsics.LJFF(this.LJII, c1689410u43.LJII);
    }

    public final int hashCode() {
        return (((((((((((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(type=");
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
        sbLIZ.append(", label=");
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

    @Override // X.AbstractC1689280u3q
    public final String LJI() {
        return this.LJII;
    }

    public static C1689410u43 LJII(C1689410u43 c1689410u43, boolean z, String str, int i) {
        int i2;
        String str2;
        String str3;
        String str4 = str;
        boolean z2 = z;
        boolean z3 = false;
        if ((i & 1) != 0) {
            i2 = c1689410u43.LIZIZ;
        } else {
            i2 = 0;
        }
        String str5 = null;
        if ((i & 2) != 0) {
            str2 = c1689410u43.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c1689410u43.LIZLLL;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str5 = c1689410u43.LJ;
        }
        if ((i & 16) != 0) {
            z3 = c1689410u43.LJFF;
        }
        if ((i & 32) != 0) {
            z2 = c1689410u43.LJI;
        }
        if ((i & 64) != 0) {
            str4 = c1689410u43.LJII;
        }
        c1689410u43.getClass();
        return new C1689410u43(i2, str2, str3, str5, str4, z3, z2);
    }

    public C1689410u43(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = str4;
    }
}
