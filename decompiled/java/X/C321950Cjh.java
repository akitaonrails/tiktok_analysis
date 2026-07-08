package X;

/* JADX INFO: renamed from: X.0Cjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321950Cjh {
    public final String LIZ;
    public long LIZIZ = 0;
    public int LIZJ = 1;
    public final long LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkRecord(url='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', interval=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C321950Cjh(long j, String str) {
        this.LIZ = str;
        this.LIZLLL = j;
    }
}
