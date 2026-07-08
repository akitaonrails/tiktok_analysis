package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260360iu2 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1260360iu2)) {
            return false;
        }
        C1260360iu2 c1260360iu2 = (C1260360iu2) obj;
        return Intrinsics.LJFF(this.LIZ, c1260360iu2.LIZ) && this.LIZIZ == c1260360iu2.LIZIZ && this.LIZJ == c1260360iu2.LIZJ && this.LIZLLL == c1260360iu2.LIZLLL && this.LJ == c1260360iu2.LJ && this.LJFF == c1260360iu2.LJFF && this.LJI == c1260360iu2.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataEvent(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", listType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", invalidCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isRefresh=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasValidItems=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1260360iu2(String str, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
