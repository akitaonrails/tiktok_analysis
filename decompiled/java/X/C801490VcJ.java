package X;

/* JADX INFO: renamed from: X.0VcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801490VcJ {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public EnumC1525890poJ LIZLLL;
    public EnumC1527250pqV LJ;
    public long LJFF;
    public long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncCursor{did='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", uid='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", syncId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", topicType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bucket=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", receiveCursor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", reportCursor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C801490VcJ() {
    }

    public C801490VcJ(C801490VcJ c801490VcJ) {
        this.LIZIZ = c801490VcJ.LIZIZ;
        this.LIZJ = c801490VcJ.LIZJ;
        this.LIZ = c801490VcJ.LIZ;
        this.LIZLLL = c801490VcJ.LIZLLL;
        this.LJ = c801490VcJ.LJ;
        this.LJFF = c801490VcJ.LJFF;
        this.LJI = c801490VcJ.LJI;
    }
}
