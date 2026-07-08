package X;

/* JADX INFO: renamed from: X.0kdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327100kdg {
    public static final C1322480kWE<Integer> LIZ = C1322480kWE.of((Object[]) new Integer[]{2, 7, 4, 5});

    public static int LIZ(C1324670kZl c1324670kZl, C1328480kfu c1328480kfu) throws Throwable {
        c1328480kfu.LJIJJLI();
        int i = c1328480kfu.LLILZIL;
        C1322480kWE<Integer> c1322480kWE = LIZ;
        int iIndexOf = c1322480kWE.indexOf(Integer.valueOf(i));
        if (iIndexOf >= 0) {
            int iLIZ = 0;
            if (c1324670kZl.LIZ != -1) {
                iLIZ = c1324670kZl.LIZ();
            }
            return c1322480kWE.get((iIndexOf + (iLIZ / 90)) % c1322480kWE.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    public static int LIZIZ(C1324670kZl c1324670kZl, C1328480kfu c1328480kfu) throws Throwable {
        int i;
        if (c1324670kZl.LIZ == -2) {
            return 0;
        }
        c1328480kfu.LJIJJLI();
        int i2 = c1328480kfu.LLILZ;
        if (i2 != 90 && i2 != 180 && i2 != 270) {
            i = 0;
        } else {
            c1328480kfu.LJIJJLI();
            i = c1328480kfu.LLILZ;
        }
        if (c1324670kZl.LIZ == -1) {
            return i;
        }
        return (i + c1324670kZl.LIZ()) % 360;
    }

    public static int LIZJ(C1324670kZl c1324670kZl, C1324630kZh c1324630kZh, C1328480kfu c1328480kfu, boolean z) throws Throwable {
        int iLIZ;
        int i;
        int i2;
        if (!z || c1324630kZh == null) {
            return 8;
        }
        int iLIZIZ = LIZIZ(c1324670kZl, c1328480kfu);
        C1322480kWE<Integer> c1322480kWE = LIZ;
        c1328480kfu.LJIJJLI();
        if (c1322480kWE.contains(Integer.valueOf(c1328480kfu.LLILZIL))) {
            iLIZ = LIZ(c1324670kZl, c1328480kfu);
        } else {
            iLIZ = 0;
        }
        if (iLIZIZ != 90 && iLIZIZ != 270 && iLIZ != 5 && iLIZ != 7) {
            c1328480kfu.LJIJJLI();
            i = c1328480kfu.LLILZLL;
            c1328480kfu.LJIJJLI();
            i2 = c1328480kfu.LLIZ;
        } else {
            c1328480kfu.LJIJJLI();
            i = c1328480kfu.LLIZ;
            c1328480kfu.LJIJJLI();
            i2 = c1328480kfu.LLILZLL;
        }
        float f = i;
        float f2 = i2;
        float fMax = Math.max(c1324630kZh.LIZ / f, c1324630kZh.LIZIZ / f2);
        float f3 = f * fMax;
        float f4 = c1324630kZh.LIZJ;
        if (f3 > f4) {
            fMax = f4 / f;
        }
        if (f2 * fMax > f4) {
            fMax = f4 / f2;
        }
        int i3 = (int) (c1324630kZh.LIZLLL + (fMax * 8.0f));
        if (i3 > 8) {
            return 8;
        }
        if (i3 < 1) {
            return 1;
        }
        return i3;
    }
}
