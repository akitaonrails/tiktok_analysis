package X;

/* JADX INFO: renamed from: X.05MO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05MO {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05MO)) {
            return false;
        }
        C05MO c05mo = (C05MO) obj;
        return this.LIZ == c05mo.LIZ && this.LIZIZ == c05mo.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightRange(start=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05MO(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
