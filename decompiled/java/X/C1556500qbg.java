package X;

/* JADX INFO: renamed from: X.0qbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556500qbg extends AbstractC1556490qbf {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556500qbg)) {
            return false;
        }
        C1556500qbg c1556500qbg = (C1556500qbg) obj;
        return this.LIZ == c1556500qbg.LIZ && this.LIZIZ == c1556500qbg.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideLottie(lightRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", darkRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556500qbg(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
