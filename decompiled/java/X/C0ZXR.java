package X;

/* JADX INFO: renamed from: X.0ZXR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXR {
    public final int LIZ;
    public final int LIZIZ;

    public C0ZXR() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXR)) {
            return false;
        }
        C0ZXR c0zxr = (C0ZXR) obj;
        return this.LIZ == c0zxr.LIZ && this.LIZIZ == c0zxr.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Constraints(minWidthDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minHeightDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZXR(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
