package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10g5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19306710g5 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    public C19306710g5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19306710g5)) {
            return false;
        }
        C19306710g5 c19306710g5 = (C19306710g5) obj;
        return this.LIZ == c19306710g5.LIZ && this.LIZIZ == c19306710g5.LIZIZ && this.LIZJ == c19306710g5.LIZJ && this.LIZLLL == c19306710g5.LIZLLL && this.LJ == c19306710g5.LJ && this.LJFF == c19306710g5.LJFF && this.LJI == c19306710g5.LJI && this.LJII == c19306710g5.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c19306710g5.LJIIIIZZ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SOTLBackgroundConfig(drawableRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showInNineScreen=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showInSevenScreen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showInFiveScreen=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showMaskInFullScreen=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showMaskInNineScreen=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showMaskInSevenScreen=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showMaskInFiveScreen=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", dimensionRatio=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C19306710g5(int i) {
        this(0, "390:300", true, true, true, true, true, true, true);
    }

    public C19306710g5(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = z6;
        this.LJII = z7;
        this.LJIIIIZZ = str;
    }
}
