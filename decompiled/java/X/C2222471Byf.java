package X;

/* JADX INFO: renamed from: X.1Byf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222471Byf {
    public long LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public int LIZLLL;

    public final void LIZ(long j) {
        long j2 = this.LIZIZ;
        if (j2 != -1) {
            j = Math.max(j, j2);
        }
        this.LIZIZ = j;
    }

    public final void LIZIZ(long j) {
        long j2 = this.LIZJ;
        if (j2 != -1) {
            j = Math.min(j, j2);
        }
        this.LIZJ = j;
    }
}
