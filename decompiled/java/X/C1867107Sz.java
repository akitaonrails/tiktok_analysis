package X;

/* JADX INFO: renamed from: X.07Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867107Sz {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;

    public static C1867107Sz LIZ(C1867107Sz c1867107Sz, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7 = str2;
        String str8 = str;
        String str9 = null;
        if ((i & 1) != 0) {
            str3 = c1867107Sz.LIZ;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str8 = c1867107Sz.LIZIZ;
        }
        if ((i & 4) != 0) {
            str4 = c1867107Sz.LIZJ;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = c1867107Sz.LIZLLL;
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            str7 = c1867107Sz.LJ;
        }
        if ((i & 32) != 0) {
            str6 = c1867107Sz.LJFF;
        } else {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str9 = c1867107Sz.LJI;
        }
        if ((i & 128) != 0) {
            z = c1867107Sz.LJII;
        } else {
            z = false;
        }
        c1867107Sz.getClass();
        return new C1867107Sz(str3, str8, str4, str5, str7, str6, str9, z);
    }

    public C1867107Sz(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = z;
    }
}
