package X;

/* JADX INFO: renamed from: X.0l0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341400l0k {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341400l0k)) {
            return false;
        }
        C1341400l0k c1341400l0k = (C1341400l0k) obj;
        return this.LIZ == c1341400l0k.LIZ && this.LIZIZ == c1341400l0k.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Snapshot(sig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minEdge=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341400l0k(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
