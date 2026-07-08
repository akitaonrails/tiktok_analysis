package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777970wMt {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final C1777960wMs LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777970wMt)) {
            return false;
        }
        C1777970wMt c1777970wMt = (C1777970wMt) obj;
        return Intrinsics.LJFF(this.LIZ, c1777970wMt.LIZ) && this.LIZIZ == c1777970wMt.LIZIZ && this.LIZJ == c1777970wMt.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1777970wMt.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31;
        C1777960wMs c1777960wMs = this.LIZLLL;
        return iHashCode + (c1777960wMs != null ? c1777960wMs.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankGap(gapDescription=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gapScore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777970wMt(String str, long j, int i, C1777960wMs c1777960wMs) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = c1777960wMs;
    }
}
