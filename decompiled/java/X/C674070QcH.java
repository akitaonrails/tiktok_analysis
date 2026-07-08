package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674070QcH {
    public final C674180QcS LIZ;
    public final C674160QcQ LIZIZ;
    public final C674090QcJ LIZJ;
    public final C674080QcI LIZLLL;
    public final C674170QcR LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674070QcH)) {
            return false;
        }
        C674070QcH c674070QcH = (C674070QcH) obj;
        return Intrinsics.LJFF(this.LIZ, c674070QcH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c674070QcH.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c674070QcH.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c674070QcH.LIZLLL) && Intrinsics.LJFF(this.LJ, c674070QcH.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarStableSnapshot(layout=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", interaction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C674070QcH(C674180QcS c674180QcS, C674160QcQ c674160QcQ, C674090QcJ c674090QcJ, C674080QcI c674080QcI, C674170QcR c674170QcR) {
        this.LIZ = c674180QcS;
        this.LIZIZ = c674160QcQ;
        this.LIZJ = c674090QcJ;
        this.LIZLLL = c674080QcI;
        this.LJ = c674170QcR;
    }

    public static C674070QcH LIZ(C674070QcH c674070QcH, C674160QcQ c674160QcQ, C674090QcJ c674090QcJ, C674080QcI c674080QcI, C674170QcR c674170QcR) {
        return new C674070QcH(c674070QcH.LIZ, c674160QcQ, c674090QcJ, c674080QcI, c674170QcR);
    }
}
