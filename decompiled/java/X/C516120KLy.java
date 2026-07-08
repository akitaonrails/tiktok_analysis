package X;

/* JADX INFO: renamed from: X.0KLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516120KLy {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public boolean LJ;
    public String LJFF;
    public final Integer LJI;
    public final Throwable LJII;

    public C516120KLy(long j, int i, String str, String str2, boolean z, String str3, Integer num, Throwable th, int i2) {
        str = (i2 & 4) != 0 ? "unknown" : str;
        str2 = (i2 & 8) != 0 ? "" : str2;
        z = (i2 & 16) != 0 ? true : z;
        str3 = (i2 & 32) != 0 ? "" : str3;
        num = (i2 & 64) != 0 ? null : num;
        th = (i2 & 128) != 0 ? null : th;
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = str3;
        this.LJI = num;
        this.LJII = th;
    }
}
