package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781540wSe {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781540wSe)) {
            return false;
        }
        C1781540wSe c1781540wSe = (C1781540wSe) obj;
        return this.LIZ == c1781540wSe.LIZ && Intrinsics.LJFF(this.LIZIZ, c1781540wSe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781540wSe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781540wSe.LIZLLL) && this.LJ == c1781540wSe.LJ && this.LJFF == c1781540wSe.LJFF && this.LJI == c1781540wSe.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndustryItem(industryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", supportIndustryVerification=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", riskLevel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", industryType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1781540wSe() {
        this(0, 0, "", "", "", true, 0L);
    }

    public C1781540wSe(int i, int i2, String str, String str2, String str3, boolean z, long j) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = i;
        this.LJI = i2;
    }
}
