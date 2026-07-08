package X;

/* JADX INFO: renamed from: X.0wLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776980wLI {
    public final EnumC2177591AKf LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776980wLI)) {
            return false;
        }
        C1776980wLI c1776980wLI = (C1776980wLI) obj;
        return this.LIZ == c1776980wLI.LIZ && this.LIZIZ == c1776980wLI.LIZIZ && this.LIZJ == c1776980wLI.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeviceRamEval(level=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", availBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776980wLI(EnumC2177591AKf enumC2177591AKf, long j, long j2) {
        this.LIZ = enumC2177591AKf;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
