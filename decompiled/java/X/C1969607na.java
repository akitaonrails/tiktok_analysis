package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969607na {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1969607na)) {
            return false;
        }
        C1969607na c1969607na = (C1969607na) obj;
        return Intrinsics.LJFF(this.LIZ, c1969607na.LIZ) && this.LIZIZ == c1969607na.LIZIZ && this.LIZJ == c1969607na.LIZJ && Double.compare(this.LIZLLL, c1969607na.LIZLLL) == 0;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.X2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OtherMessageGroup(groupKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", percentage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1969607na(long j, String str, int i, double d) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = d;
    }
}
