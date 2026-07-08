package X;

/* JADX INFO: renamed from: X.0Q3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664140Q3g {
    public final String LIZ;
    public final String LIZIZ;
    public final C00BD LIZJ;
    public final EnumC670450QRn LIZLLL;
    public final long LJ;
    public final int LJFF;

    public static C664140Q3g LIZ(C664140Q3g c664140Q3g, EnumC670450QRn enumC670450QRn, long j, int i, int i2) {
        String str;
        String str2;
        int i3 = i;
        long j2 = j;
        EnumC670450QRn enumC670450QRn2 = enumC670450QRn;
        C00BD c00bd = null;
        if ((i2 & 1) != 0) {
            str = c664140Q3g.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = c664140Q3g.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            c00bd = c664140Q3g.LIZJ;
        }
        if ((i2 & 8) != 0) {
            enumC670450QRn2 = c664140Q3g.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            j2 = c664140Q3g.LJ;
        }
        if ((i2 & 32) != 0) {
            i3 = c664140Q3g.LJFF;
        }
        return new C664140Q3g(str, str2, c00bd, enumC670450QRn2, j2, i3);
    }

    public C664140Q3g(String str, String str2, C00BD c00bd, EnumC670450QRn enumC670450QRn, long j, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c00bd;
        this.LIZLLL = enumC670450QRn;
        this.LJ = j;
        this.LJFF = i;
    }
}
