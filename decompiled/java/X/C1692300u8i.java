package X;

/* JADX INFO: renamed from: X.0u8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692300u8i {
    public final long LIZ = 1;
    public final int LIZIZ = 1;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C1692150u8T LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectionInfo(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", range=(");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('-');
        sbLIZ.append(C1692320u8k.LIZ(this.LJFF, this.LIZJ));
        sbLIZ.append(',');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('-');
        sbLIZ.append(C1692320u8k.LIZ(this.LJFF, this.LIZLLL));
        sbLIZ.append("), prevOffset=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1692580u9A LIZ(int i) {
        return new C1692580u9A(C1692320u8k.LIZ(this.LJFF, i), i, this.LIZ);
    }

    public C1692300u8i(int i, int i2, int i3, C1692150u8T c1692150u8T) {
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = c1692150u8T;
    }
}
