package X;

/* JADX INFO: renamed from: X.0vj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753300vj6 {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final String LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1753300vj6() {
        int i = 0;
        this(i, i, i, (String) null, 31);
    }

    public /* synthetic */ C1753300vj6(int i, int i2, int i3, String str, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, (i4 & 16) != 0 ? "" : str, false);
    }

    public C1753300vj6(int i, int i2, int i3, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = i3;
        this.LJ = str;
    }

    public static C1753300vj6 LIZ(C1753300vj6 c1753300vj6, int i, int i2, int i3, String str, int i4) {
        boolean z;
        String str2 = str;
        int i5 = i3;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c1753300vj6.LIZ;
        }
        if ((i4 & 2) != 0) {
            i6 = c1753300vj6.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            z = c1753300vj6.LIZJ;
        } else {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i5 = c1753300vj6.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            str2 = c1753300vj6.LJ;
        }
        return new C1753300vj6(i7, i6, i5, str2, z);
    }
}
