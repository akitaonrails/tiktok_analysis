package X;

/* JADX INFO: renamed from: X.05mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1455905mv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1455905mv)) {
            return false;
        }
        C1455905mv c1455905mv = (C1455905mv) obj;
        return this.LIZ == c1455905mv.LIZ && this.LIZIZ == c1455905mv.LIZIZ && this.LIZJ == c1455905mv.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModuleVisibilityInfo(visibleHeightPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topPositionPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomPositionPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1455905mv(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
