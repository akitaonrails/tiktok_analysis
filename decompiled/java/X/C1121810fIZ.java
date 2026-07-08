package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fIZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121810fIZ {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public String LJIIIIZZ;
    public int LJIIIZ;

    public C1121810fIZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1121810fIZ)) {
            return false;
        }
        C1121810fIZ c1121810fIZ = (C1121810fIZ) obj;
        return this.LIZ == c1121810fIZ.LIZ && this.LIZIZ == c1121810fIZ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1121810fIZ.LIZJ) && this.LIZLLL == c1121810fIZ.LIZLLL && this.LJ == c1121810fIZ.LJ && this.LJFF == c1121810fIZ.LJFF && this.LJI == c1121810fIZ.LJI && this.LJII == c1121810fIZ.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1121810fIZ.LJIIIIZZ) && this.LJIIIZ == c1121810fIZ.LJIIIZ;
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewServicePlusALogParams(useCreateInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useSmbQualification=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", optInStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", qualification=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", revokeReason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isPendingRevoke=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isSmbDeactivated=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", iconStatus=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", revocationRestored=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1121810fIZ(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = "";
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = "available";
        this.LJIIIZ = 0;
    }
}
