package X;

/* JADX INFO: renamed from: X.0Kjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525750Kjd {
    public final boolean LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525750Kjd)) {
            return false;
        }
        C525750Kjd c525750Kjd = (C525750Kjd) obj;
        return this.LIZ == c525750Kjd.LIZ && this.LIZIZ == c525750Kjd.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumDefaultBottomActionBarState(nextEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C525750Kjd(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
