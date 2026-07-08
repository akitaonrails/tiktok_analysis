package X;

/* JADX INFO: renamed from: X.0CiW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321220CiW {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C321220CiW(int i, int i2, String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i;
        this.LJ = i2;
    }

    public static C321220CiW LIZ(C321220CiW c321220CiW, boolean z, boolean z2, int i, int i2, int i3) {
        String str;
        int i4 = i2;
        int i5 = i;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i3 & 1) != 0) {
            str = c321220CiW.LIZ;
        } else {
            str = null;
        }
        if ((i3 & 2) != 0) {
            z4 = c321220CiW.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z3 = c321220CiW.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i5 = c321220CiW.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            i4 = c321220CiW.LJ;
        }
        return new C321220CiW(i5, i4, str, z4, z3);
    }
}
