package X;

/* JADX INFO: renamed from: X.0dHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044500dHs {
    public final int LIZ;
    public final int LIZIZ;

    public C1044500dHs() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044500dHs)) {
            return false;
        }
        C1044500dHs c1044500dHs = (C1044500dHs) obj;
        return this.LIZ == c1044500dHs.LIZ && this.LIZIZ == c1044500dHs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BufferPressureSnapshot(bufferedCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", overdueBufferedCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044500dHs(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
