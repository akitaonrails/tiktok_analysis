package X;

/* JADX INFO: renamed from: X.0POW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POW {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Boolean LJFF;
    public final int LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C0POW() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public static C0POW LIZ(C0POW c0pow, String str, String str2, int i) {
        String str3;
        String str4;
        String str5;
        int i2;
        String str6 = str2;
        String str7 = str;
        Boolean bool = null;
        if ((i & 1) != 0) {
            str3 = c0pow.LIZ;
        } else {
            str3 = null;
        }
        if ((i & 2) != 0) {
            str4 = c0pow.LIZIZ;
        } else {
            str4 = null;
        }
        if ((i & 4) != 0) {
            str7 = c0pow.LIZJ;
        }
        if ((i & 8) != 0) {
            str6 = c0pow.LIZLLL;
        }
        if ((i & 16) != 0) {
            str5 = c0pow.LJ;
        } else {
            str5 = null;
        }
        if ((i & 32) != 0) {
            bool = c0pow.LJFF;
        }
        if ((i & 64) != 0) {
            i2 = c0pow.LJI;
        } else {
            i2 = 0;
        }
        return new C0POW(str3, i2, str4, str7, str6, bool, str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0POW(String str, int i, String str2, Boolean bool, String str3, int i2) {
        String str4;
        int i3 = i;
        Boolean bool2 = bool;
        String str5 = str2;
        String str6 = (i2 & 1) != 0 ? "" : str;
        str5 = (i2 & 2) != 0 ? "" : str5;
        if ((i2 & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        this(str6, (i2 & 64) != 0 ? -1 : i3, str5, str4, (i2 & 8) != 0 ? "" : null, (i2 & 32) != 0 ? Boolean.FALSE : bool2, (i2 & 16) == 0 ? str3 : "");
    }

    public C0POW(String str, int i, String str2, String str3, String str4, Boolean bool, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = bool;
        this.LJI = i;
    }
}
