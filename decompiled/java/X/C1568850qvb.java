package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568850qvb {
    public final double LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1568850qvb)) {
            return false;
        }
        C1568850qvb c1568850qvb = (C1568850qvb) obj;
        return Double.compare(this.LIZ, c1568850qvb.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1568850qvb.LIZIZ) && this.LIZJ == c1568850qvb.LIZJ;
    }

    public final int hashCode() {
        int iX2 = C786410Ut5.X2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return ((iX2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FECashierPreloadJSTriggerInput(originalLocalPrice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createOrderTimestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1568850qvb(long j, String str, double d) {
        this.LIZ = d;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
