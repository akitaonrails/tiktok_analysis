package X;

/* JADX INFO: renamed from: X.0hFu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197040hFu {
    public final int LIZ;
    public final int LIZIZ;

    public C1197040hFu() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197040hFu)) {
            return false;
        }
        C1197040hFu c1197040hFu = (C1197040hFu) obj;
        return this.LIZ == c1197040hFu.LIZ && this.LIZIZ == c1197040hFu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAnchorTagLineWidthData(tag1Width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagLineWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1197040hFu(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
