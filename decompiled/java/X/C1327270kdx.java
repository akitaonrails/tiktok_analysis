package X;

/* JADX INFO: renamed from: X.0kdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327270kdx {
    public static boolean LIZIZ(C1328480kfu c1328480kfu, C1324630kZh c1324630kZh) throws Throwable {
        if (c1328480kfu == null) {
            return false;
        }
        c1328480kfu.LJIJJLI();
        int i = c1328480kfu.LLILZ;
        if (i != 90 && i != 270) {
            c1328480kfu.LJIJJLI();
            int i2 = c1328480kfu.LLILZLL;
            c1328480kfu.LJIJJLI();
            return LIZ(i2, c1328480kfu.LLIZ, c1324630kZh);
        }
        c1328480kfu.LJIJJLI();
        int i3 = c1328480kfu.LLIZ;
        c1328480kfu.LJIJJLI();
        return LIZ(i3, c1328480kfu.LLILZLL, c1324630kZh);
    }

    public static boolean LIZ(int i, int i2, C1324630kZh c1324630kZh) {
        if (c1324630kZh == null) {
            if (((int) (i * 1.3333334f)) >= 2048.0f && ((int) (i2 * 1.3333334f)) >= 2048) {
                return true;
            }
            return false;
        }
        if (((int) (i * 1.3333334f)) >= c1324630kZh.LIZ && ((int) (i2 * 1.3333334f)) >= c1324630kZh.LIZIZ) {
            return true;
        }
        return false;
    }
}
