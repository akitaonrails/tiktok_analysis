package X;

/* JADX INFO: renamed from: X.0l1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341960l1e {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C1341960l1e() {
        this(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341960l1e)) {
            return false;
        }
        C1341960l1e c1341960l1e = (C1341960l1e) obj;
        return this.LIZ == c1341960l1e.LIZ && this.LIZIZ == c1341960l1e.LIZIZ && this.LIZJ == c1341960l1e.LIZJ && this.LIZLLL == c1341960l1e.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentLongPressCustomStyle(actionListPaddingStartPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionListPaddingTopPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionListPaddingEndPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", actionListPaddingBottomPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341960l1e(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
