package X;

/* JADX INFO: renamed from: X.0an8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948560an8 {
    public final int LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C948560an8(int i, boolean z, int i2, int i3) {
        long j;
        int i4 = i2;
        if ((i3 & 4) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this(i, z, j, (i3 & 8) != 0 ? -1 : i4);
    }

    public C948560an8(int i, boolean z, long j, int i2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = i2;
    }
}
