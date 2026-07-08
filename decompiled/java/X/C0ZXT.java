package X;

/* JADX INFO: renamed from: X.0ZXT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXT {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXT)) {
            return false;
        }
        C0ZXT c0zxt = (C0ZXT) obj;
        return Float.compare(this.LIZ, c0zxt.LIZ) == 0 && Float.compare(this.LIZIZ, c0zxt.LIZIZ) == 0 && Float.compare(this.LIZJ, c0zxt.LIZJ) == 0 && Float.compare(this.LIZLLL, c0zxt.LIZLLL) == 0 && this.LJ == c0zxt.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(startDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", botDp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", contentFollowPadding=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public C0ZXT(boolean z, float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = z;
    }
}
