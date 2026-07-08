package X;

/* JADX INFO: renamed from: X.0Ms8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581980Ms8 {
    public int LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public C581980Ms8() {
        this(0L, 15);
    }

    public C581980Ms8(long j, int i) {
        int i2;
        long j2;
        if ((i & 1) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        j = (i & 2) != 0 ? -1L : j;
        if ((i & 4) != 0) {
            j2 = -3;
        } else {
            j2 = 0;
        }
        long j3 = (i & 8) != 0 ? -3L : 0L;
        this.LIZ = i2;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
