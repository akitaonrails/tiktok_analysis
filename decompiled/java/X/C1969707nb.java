package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969707nb {
    public final String LIZ;
    public final long LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1969707nb)) {
            return false;
        }
        C1969707nb c1969707nb = (C1969707nb) obj;
        return Intrinsics.LJFF(this.LIZ, c1969707nb.LIZ) && this.LIZIZ == c1969707nb.LIZIZ && Double.compare(this.LIZJ, c1969707nb.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhaseDetail(phase=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", percentage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1969707nb(long j, String str, double d) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = d;
    }
}
