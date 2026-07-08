package X;

/* JADX INFO: renamed from: X.0r3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573990r3t implements InterfaceC1579040rC2 {
    public final int LIZ;
    public final int LIZIZ;

    public C1573990r3t() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573990r3t)) {
            return false;
        }
        C1573990r3t c1573990r3t = (C1573990r3t) obj;
        return this.LIZ == c1573990r3t.LIZ && this.LIZIZ == c1573990r3t.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HugContent(minLabelWidthDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxLabelWidthDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1573990r3t(int i) {
        this.LIZ = 32;
        this.LIZIZ = 208;
    }
}
