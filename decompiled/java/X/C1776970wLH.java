package X;

/* JADX INFO: renamed from: X.0wLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776970wLH {
    public final EnumC2177591AKf LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776970wLH)) {
            return false;
        }
        C1776970wLH c1776970wLH = (C1776970wLH) obj;
        return this.LIZ == c1776970wLH.LIZ && this.LIZIZ == c1776970wLH.LIZIZ && this.LIZJ == c1776970wLH.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JavaHeapEval(level=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", usedBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776970wLH(EnumC2177591AKf enumC2177591AKf, long j, long j2) {
        this.LIZ = enumC2177591AKf;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
