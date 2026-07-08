package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u45, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689430u45 extends AbstractC1689280u3q {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1689430u45)) {
            return false;
        }
        C1689430u45 c1689430u45 = (C1689430u45) obj;
        return this.LIZIZ == c1689430u45.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1689430u45.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1689430u45.LIZLLL) && Intrinsics.LJFF(this.LJ, c1689430u45.LJ) && this.LJFF == c1689430u45.LJFF && this.LJI == c1689430u45.LJI && Intrinsics.LJFF(this.LJII, c1689430u45.LJII) && this.LJIIIIZZ == c1689430u45.LJIIIIZZ && this.LJIIIZ == c1689430u45.LJIIIZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZIZ * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RadioEntry(type=");
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
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", selectIsChecked=");
        sbLIZ.append(this.LJIIIZ);
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

    public C1689430u45(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = str4;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
    }
}
