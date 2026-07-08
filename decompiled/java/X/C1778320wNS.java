package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wNS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778320wNS {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1778320wNS)) {
            return false;
        }
        C1778320wNS c1778320wNS = (C1778320wNS) obj;
        return Intrinsics.LJFF(this.LIZ, c1778320wNS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1778320wNS.LIZIZ) && this.LIZJ == c1778320wNS.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1778320wNS.LIZLLL) && this.LJ == c1778320wNS.LJ && this.LJFF == c1778320wNS.LJFF && Intrinsics.LJFF(this.LJI, c1778320wNS.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyPageParams(actionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", smbTag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", verifyMethod=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSupportKyb=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", existingVerification=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", clickPosition=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778320wNS(int i, String str, int i2, String str2, String str3, int i3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = str4;
    }
}
