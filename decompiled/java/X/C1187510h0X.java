package X;

/* JADX INFO: renamed from: X.0h0X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187510h0X {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoListCursorData(cursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reviewCursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasMoreAweme=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMoreReview=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1187510h0X(long j, long j2, long j3, int i, int i2) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
