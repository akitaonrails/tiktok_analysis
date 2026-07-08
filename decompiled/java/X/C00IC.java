package X;

/* JADX INFO: renamed from: X.00IC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IC {
    public final int LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportData(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categoryKeyValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IC(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
