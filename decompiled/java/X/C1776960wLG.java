package X;

/* JADX INFO: renamed from: X.0wLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776960wLG {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776960wLG)) {
            return false;
        }
        C1776960wLG c1776960wLG = (C1776960wLG) obj;
        return this.LIZ == c1776960wLG.LIZ && this.LIZIZ == c1776960wLG.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoRechargeArgumentsV3(usePreload=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", createOrderTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776960wLG(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
