package X;

/* JADX INFO: renamed from: X.0SRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721520SRy {
    public final boolean LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C721520SRy)) {
            return false;
        }
        C721520SRy c721520SRy = (C721520SRy) obj;
        return this.LIZ == c721520SRy.LIZ && this.LIZIZ == c721520SRy.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReleaseInfo(wasHorizontalDragging=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", appBarOffset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C721520SRy(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
