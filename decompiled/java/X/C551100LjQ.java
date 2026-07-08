package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551100LjQ {
    public final C551120LjS LIZ;
    public final C551120LjS LIZIZ;
    public final C551120LjS LIZJ;
    public final C551120LjS LIZLLL;
    public final C551120LjS LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551100LjQ)) {
            return false;
        }
        C551100LjQ c551100LjQ = (C551100LjQ) obj;
        return Intrinsics.LJFF(this.LIZ, c551100LjQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551100LjQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c551100LjQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c551100LjQ.LIZLLL) && Intrinsics.LJFF(this.LJ, c551100LjQ.LJ);
    }

    public final int hashCode() {
        C551120LjS c551120LjS = this.LIZ;
        int iHashCode = (c551120LjS == null ? 0 : c551120LjS.hashCode()) * 31;
        C551120LjS c551120LjS2 = this.LIZIZ;
        return ((((((iHashCode + (c551120LjS2 != null ? c551120LjS2.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinimalStandardSlots(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", upload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", server=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", polling=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", download=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551100LjQ(C551120LjS c551120LjS, C551120LjS c551120LjS2, C551120LjS c551120LjS3, C551120LjS c551120LjS4, C551120LjS c551120LjS5) {
        this.LIZ = c551120LjS;
        this.LIZIZ = c551120LjS2;
        this.LIZJ = c551120LjS3;
        this.LIZLLL = c551120LjS4;
        this.LJ = c551120LjS5;
    }
}
