package X;

/* JADX INFO: renamed from: X.0i6G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229500i6G {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final boolean LJI;

    public static C1229500i6G LIZ(C1229500i6G c1229500i6G) {
        String str = c1229500i6G.LIZ;
        String str2 = c1229500i6G.LIZIZ;
        int i = c1229500i6G.LIZJ;
        boolean z = c1229500i6G.LIZLLL;
        String str3 = c1229500i6G.LJ;
        int i2 = c1229500i6G.LJFF;
        c1229500i6G.getClass();
        return new C1229500i6G(str, str2, str3, i, i2, z, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1229500i6G(int i, int i2, int i3, String str, String str2, String str3, boolean z) {
        int i4 = i2;
        boolean z2 = z;
        int i5 = i;
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 16) == 0 ? str3 : "", (i3 & 4) != 0 ? 1 : i5, (i3 & 32) != 0 ? 0 : i4, (i3 & 8) != 0 ? true : z2, false);
    }

    public C1229500i6G(String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = str3;
        this.LJFF = i2;
        this.LJI = z2;
    }
}
