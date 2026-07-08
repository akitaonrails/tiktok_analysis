package X;

/* JADX INFO: renamed from: X.0PAA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PAA {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final C0PHW LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackFromDetailStreamRootSnapshot(isCompat=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSimulate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDualStream=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", entryId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", backCurrentCursorId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", compatEntryId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", compatConsumeId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", backCursor=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PAA(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, C0PHW c0phw) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = i4;
        this.LJII = c0phw;
    }
}
