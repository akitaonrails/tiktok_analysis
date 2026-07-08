package X;

/* JADX INFO: renamed from: X.0WI1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI1 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadResult(isSuccess=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', readType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fromPkg='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', key='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', value='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WI1(int i, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = "";
        this.LJFF = "";
    }

    public /* synthetic */ C0WI1(String str, String str2, boolean z, int i) {
        this(0, str, (i & 4) != 0 ? "" : str2, (i & 2) != 0 ? false : z);
    }
}
