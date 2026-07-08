package X;

/* JADX INFO: renamed from: X.0DvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354700DvQ {
    public final boolean LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public C354700DvQ() {
        this(0L, false, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C354700DvQ(long j, boolean z, int i) {
        String str;
        long j2 = j;
        boolean z2 = (i & 1) != 0 ? true : z;
        j2 = (i & 2) != 0 ? 0L : j2;
        if ((i & 8) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(0, j2, str, z2);
    }

    public C354700DvQ(int i, long j, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
