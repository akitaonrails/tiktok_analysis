package X;

/* JADX INFO: renamed from: X.1Dbn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2259251Dbn {
    public final long LIZ;
    public final long LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("/");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2259251Dbn(long j, long j2) {
        if (j2 == 0) {
            this.LIZ = 0L;
            this.LIZIZ = 1L;
        } else {
            this.LIZ = j;
            this.LIZIZ = j2;
        }
    }
}
