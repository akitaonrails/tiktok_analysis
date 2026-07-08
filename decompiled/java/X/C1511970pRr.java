package X;

/* JADX INFO: renamed from: X.0pRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1511970pRr {
    public long LIZ = -1;
    public long LIZIZ = -1;

    public final void LIZ() {
        this.LIZIZ = -1L;
        this.LIZ = -1L;
    }

    public final float LIZIZ() {
        long j = this.LIZ;
        if (j < 0) {
            return -1.0f;
        }
        long j2 = this.LIZIZ;
        if (j2 < 0 || j2 < j || j2 - j > 1000000000) {
            return -1.0f;
        }
        return (j2 - j) * 1.0f;
    }
}
