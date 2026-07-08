package X;

/* JADX INFO: renamed from: X.0Kk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525990Kk1 {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525990Kk1)) {
            return false;
        }
        C525990Kk1 c525990Kk1 = (C525990Kk1) obj;
        return this.LIZ == c525990Kk1.LIZ && this.LIZIZ == c525990Kk1.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumBottomBarState(backgroundColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clipChildren=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C525990Kk1(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
