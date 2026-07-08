package X;

/* JADX INFO: renamed from: X.0O5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613690O5f {
    public final int LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public static C613690O5f LIZ(C613690O5f c613690O5f) {
        long j = c613690O5f.LIZIZ;
        boolean z = c613690O5f.LIZJ;
        c613690O5f.getClass();
        return new C613690O5f(0, j, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C613690O5f(int i, boolean z, int i2) {
        long j;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 2) != 0) {
            j = 3000;
        } else {
            j = 0;
        }
        this(i, j, (i2 & 4) != 0 ? false : z);
    }

    public C613690O5f(int i, long j, boolean z) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = z;
    }
}
