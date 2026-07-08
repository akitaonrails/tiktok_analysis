package X;

/* JADX INFO: renamed from: X.0UyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789600UyE extends AbstractC789590UyD {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789600UyE)) {
            return false;
        }
        C789600UyE c789600UyE = (C789600UyE) obj;
        return this.LIZ == c789600UyE.LIZ && this.LIZIZ == c789600UyE.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hot(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789600UyE(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
