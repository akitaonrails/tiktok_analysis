package X;

/* JADX INFO: renamed from: X.0Q4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664440Q4k {
    public final double LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public double LJ;
    public int LJFF;
    public final long LJI;

    public C664440Q4k() {
        this(0.0d, 63);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C664440Q4k(double d, int i) {
        int i2;
        double d2 = (i & 1) != 0 ? 0.0d : d;
        if ((i & 32) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(d2, 0.0d, 0, 0, 0, i2);
    }

    public C664440Q4k(double d, double d2, int i, int i2, int i3, int i4) {
        this.LIZ = d;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = d2;
        this.LJFF = i4;
        this.LJI = System.currentTimeMillis();
    }
}
