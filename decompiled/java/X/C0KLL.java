package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KLL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KLL {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KLL)) {
            return false;
        }
        C0KLL c0kll = (C0KLL) obj;
        return this.LIZ == c0kll.LIZ && this.LIZIZ == c0kll.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0kll.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0kll.LIZLLL) && Intrinsics.LJFF(this.LJ, c0kll.LJ) && Intrinsics.LJFF(this.LJFF, c0kll.LJFF) && Intrinsics.LJFF(this.LJI, c0kll.LJI);
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Integer num = this.LJFF;
        return ((iY2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TplLogData(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tplCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", serverCurrency=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KLL(long j, String str, int i, String str2, Integer num, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = str4;
    }
}
