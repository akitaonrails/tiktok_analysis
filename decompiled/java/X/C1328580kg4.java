package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328580kg4 {
    public static final C1330000kiM LIZ = new C1330000kiM("JPEG", "jpeg");
    public static final C1330000kiM LIZIZ = new C1330000kiM("PNG", "png");
    public static final C1330000kiM LIZJ = new C1330000kiM("GIF", "gif");
    public static final C1330000kiM LIZLLL = new C1330000kiM("BMP", "bmp");
    public static final C1330000kiM LJ = new C1330000kiM("ICO", "ico");
    public static final C1330000kiM LJFF = new C1330000kiM("WEBP_SIMPLE", "webp");
    public static final C1330000kiM LJI = new C1330000kiM("WEBP_LOSSLESS", "webp");
    public static final C1330000kiM LJII = new C1330000kiM("WEBP_EXTENDED", "webp");
    public static final C1330000kiM LJIIIIZZ = new C1330000kiM("WEBP_EXTENDED_WITH_ALPHA", "webp");
    public static final C1330000kiM LJIIIZ = new C1330000kiM("WEBP_ANIMATED", "webp");
    public static final C1330000kiM LJIIJ = new C1330000kiM("HEIF", "heif");
    public static final C1330000kiM LJIIJJI = new C1330000kiM("HEIF_FORMAT", "heic");
    public static final C1330000kiM LJIIL = new C1330000kiM("VVIC_FORMAT", "vvic");
    public static final C1330000kiM LJIILIIL = new C1330000kiM("DNG", "dng");

    public static boolean LIZ(C1330000kiM c1330000kiM) {
        try {
            if (c1330000kiM != C1328540kg0.LIZIZ()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1328570kg3.LJI("DefaultImageFormats", "isHeifFormat error", th);
            return false;
        }
    }

    public static boolean LIZIZ(C1330000kiM c1330000kiM) {
        C1330000kiM c1330000kiMLIZJ = C1328540kg0.LIZJ();
        if (c1330000kiMLIZJ == null || c1330000kiM != c1330000kiMLIZJ) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(C1330000kiM c1330000kiM) {
        if (c1330000kiM != LJFF && c1330000kiM != LJI && c1330000kiM != LJII && c1330000kiM != LJIIIIZZ) {
            return false;
        }
        return true;
    }
}
