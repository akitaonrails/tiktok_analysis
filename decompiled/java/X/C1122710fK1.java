package X;

/* JADX INFO: renamed from: X.0fK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122710fK1 {
    public static final /* synthetic */ int LJII = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public C1122710fK1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122710fK1)) {
            return false;
        }
        C1122710fK1 c1122710fK1 = (C1122710fK1) obj;
        return this.LIZ == c1122710fK1.LIZ && this.LIZIZ == c1122710fK1.LIZIZ && this.LIZJ == c1122710fK1.LIZJ && this.LIZLLL == c1122710fK1.LIZLLL && this.LJ == c1122710fK1.LJ && this.LJFF == c1122710fK1.LJFF && this.LJI == c1122710fK1.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionSnapshot(commentCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", watchDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hostProfileClickCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shareCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", followAnchorCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", likeCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sendGiftCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1122710fK1(int i) {
        this(0, 0, 0, 0, 0, 0, 0);
    }

    public C1122710fK1(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i7;
    }
}
