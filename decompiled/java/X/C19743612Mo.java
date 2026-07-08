package X;

/* JADX INFO: renamed from: X.12Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19743612Mo {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19743612Mo)) {
            return false;
        }
        C19743612Mo c19743612Mo = (C19743612Mo) obj;
        return this.LIZ == c19743612Mo.LIZ && this.LIZIZ == c19743612Mo.LIZIZ && this.LIZJ == c19743612Mo.LIZJ && this.LIZLLL == c19743612Mo.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongPressVideoCellRect(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19743612Mo(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
