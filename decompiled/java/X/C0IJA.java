package X;

/* JADX INFO: renamed from: X.0IJA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IJA {
    public final C0IJ9 LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TraceNode{type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extra='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IJA(long j, String str) {
        this.LIZ = C0IJ9.BACKGROUND;
        this.LIZIZ = j;
        this.LIZJ = str;
    }

    public C0IJA(C0IJ9 c0ij9, long j) {
        this.LIZ = c0ij9;
        this.LIZIZ = j;
    }
}
