package X;

/* JADX INFO: renamed from: X.0X1A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1A {
    public long LIZ;

    public C0X1A(long j) {
        this.LIZ = j;
    }

    public final synchronized void LIZ(long j) {
        this.LIZ += j;
    }

    public final synchronized long LIZIZ(long j) {
        long j2 = this.LIZ;
        if (j2 != 0) {
            if (j2 < j) {
                this.LIZ = 0L;
                j = j2;
            } else {
                this.LIZ = j2 - j;
            }
        } else {
            j = 0;
        }
        return j;
    }
}
