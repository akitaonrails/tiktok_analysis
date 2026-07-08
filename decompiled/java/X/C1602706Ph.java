package X;

/* JADX INFO: renamed from: X.06Ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1602706Ph {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;

    public static C1602706Ph LIZ(C1602706Ph c1602706Ph, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        boolean z4;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c1602706Ph.LIZ;
        }
        if ((i3 & 2) != 0) {
            i4 = c1602706Ph.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z = c1602706Ph.LIZJ;
        } else {
            z = false;
        }
        if ((i3 & 8) != 0) {
            z2 = c1602706Ph.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i3 & 16) != 0) {
            z3 = c1602706Ph.LJ;
        } else {
            z3 = false;
        }
        String str4 = null;
        if ((i3 & 32) != 0) {
            str = c1602706Ph.LJFF;
        } else {
            str = null;
        }
        if ((i3 & 64) != 0) {
            str2 = c1602706Ph.LJI;
        } else {
            str2 = null;
        }
        if ((i3 & 128) != 0) {
            str3 = c1602706Ph.LJII;
        } else {
            str3 = null;
        }
        if ((i3 & 256) != 0) {
            str4 = c1602706Ph.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            z4 = c1602706Ph.LJIIIZ;
        } else {
            z4 = false;
        }
        return new C1602706Ph(i5, i4, z, z2, z3, str, str2, str3, str4, z4);
    }

    public /* synthetic */ C1602706Ph(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, int i2) {
        this(i, 0, z, false, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) == 0 ? str4 : null, (i2 & 512) != 0 ? false : z3);
    }

    public C1602706Ph(int i, int i2, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = z4;
    }
}
