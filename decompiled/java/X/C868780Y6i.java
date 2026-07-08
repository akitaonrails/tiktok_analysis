package X;

/* JADX INFO: renamed from: X.0Y6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868780Y6i {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC868790Y6j LIZ;
    public final String LIZIZ;
    public volatile boolean LIZJ = true;

    public final void LIZIZ(String str) {
        LJ(this, null, str, 5);
    }

    public final void LIZJ(String str, String str2) {
        LJ(this, str, str2, 4);
    }

    public final void LJIIJJI(String str) {
        LJIILJJIL(this, null, str, 5);
    }

    public final void LJIIL(String str, String str2) {
        LJIILJJIL(this, str, str2, 4);
    }

    public final void LJIILL(String str) {
        LJIILLIIL(this, null, str, 5);
    }

    public final String LIZ(String str) {
        if (str == null) {
            str = "";
        }
        if (this.LIZIZ.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(this.LIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public final void LJFF(String str) {
        if (this.LIZJ) {
            LIZLLL(this, str);
        }
    }

    public final void LJI(String str) {
        LJIIIIZZ("imsdk", str, null);
    }

    public C868780Y6i(InterfaceC868790Y6j interfaceC868790Y6j, String str) {
        this.LIZ = interfaceC868790Y6j;
        this.LIZIZ = str;
    }

    public static void LIZLLL(C868780Y6i c868780Y6i, String str) {
        c868780Y6i.LIZ.LJFF("imsdk", c868780Y6i.LIZ(str), null);
    }

    public static void LJIILIIL(C868780Y6i c868780Y6i, String str) {
        c868780Y6i.LIZ.LJ("imsdk", c868780Y6i.LIZ(str), null);
    }

    public final void LJII(String str, String str2) {
        LJIIIIZZ(str, str2, null);
    }

    public final void LJIIIZ(String str, Throwable th) {
        LJIIIIZZ("imsdk", str, th);
    }

    public final void LJIIIIZZ(String str, String str2, Throwable th) {
        this.LIZ.LJI(str, LIZ(str2), th);
    }

    public static void LJ(C868780Y6i c868780Y6i, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = "imsdk";
        }
        c868780Y6i.LIZ.LJFF(str, c868780Y6i.LIZ(str2), null);
    }

    public static void LJIILJJIL(C868780Y6i c868780Y6i, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = "imsdk";
        }
        c868780Y6i.LIZ.LJ(str, c868780Y6i.LIZ(str2), null);
    }

    public static void LJIILLIIL(C868780Y6i c868780Y6i, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = "imsdk";
        }
        c868780Y6i.LIZ.LIZJ(str, c868780Y6i.LIZ(str2), null);
    }
}
