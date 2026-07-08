package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.19Mh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21526519Mh implements Comparable<C21526519Mh> {
    public static final String[] LLJJ = {"position", "x", "y", "width", "height", "pathRotate"};
    public C19NB LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public final LinkedHashMap<String, C21526019Mc> LLJIJIL;
    public int LLJILJIL;
    public double[] LLJILJILJ;
    public double[] LLJILLL;

    public C21526519Mh() {
        this.LLJ = Float.NaN;
        this.LLJI = -1;
        this.LLJIJIL = new LinkedHashMap<>();
        this.LLJILJIL = 0;
        this.LLJILJILJ = new double[18];
        this.LLJILLL = new double[18];
    }

    public final void LIZJ(C19MA c19ma) {
        this.LL = C19NB.LIZJ(c19ma.LIZJ.LIZJ);
        C19MC c19mc = c19ma.LIZJ;
        this.LLJI = c19mc.LIZLLL;
        this.LLJ = c19mc.LJI;
        this.LLILLJJLI = c19mc.LJ;
        for (String str : c19ma.LJFF.keySet()) {
            C21526019Mc c21526019Mc = c19ma.LJFF.get(str);
            if (c21526019Mc.LIZIZ != EnumC21526219Me.STRING_TYPE) {
                this.LLJIJIL.put(str, c21526019Mc);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C21526519Mh c21526519Mh) {
        return Float.compare(this.LLILZ, c21526519Mh.LLILZ);
    }

    public static boolean LJFF(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        }
        if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        }
        return false;
    }

    public final void LJI(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.LLILZIL;
        float f2 = this.LLILZLL;
        float f3 = this.LLIZ;
        float f4 = this.LLIZLLLIL;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    public C21526519Mh(int i, int i2, C19MZ c19mz, C21526519Mh c21526519Mh, C21526519Mh c21526519Mh2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        this.LLJ = Float.NaN;
        this.LLJI = -1;
        this.LLJIJIL = new LinkedHashMap<>();
        this.LLJILJIL = 0;
        this.LLJILJILJ = new double[18];
        this.LLJILLL = new double[18];
        int i4 = c19mz.LJIILJJIL;
        if (i4 != 1) {
            if (i4 != 2) {
                float f11 = c19mz.LIZ / 100.0f;
                this.LLILLL = f11;
                this.LLILLJJLI = c19mz.LJII;
                if (Float.isNaN(c19mz.LJIIIIZZ)) {
                    f6 = f11;
                } else {
                    f6 = c19mz.LJIIIIZZ;
                }
                if (Float.isNaN(c19mz.LJIIIZ)) {
                    f7 = f11;
                } else {
                    f7 = c19mz.LJIIIZ;
                }
                float f12 = c21526519Mh2.LLIZ;
                float f13 = c21526519Mh.LLIZ;
                float f14 = f12 - f13;
                float f15 = c21526519Mh2.LLIZLLLIL;
                float f16 = c21526519Mh.LLIZLLLIL;
                this.LLILZ = this.LLILLL;
                float f18 = c21526519Mh.LLILZIL;
                float f19 = c21526519Mh.LLILZLL;
                float f20 = (c21526519Mh2.LLILZIL + (f12 / 2.0f)) - ((f13 / 2.0f) + f18);
                float f21 = (c21526519Mh2.LLILZLL + (f15 / 2.0f)) - ((f16 / 2.0f) + f19);
                float f22 = (f14 * f6) / 2.0f;
                this.LLILZIL = (int) ((f18 + (f20 * f11)) - f22);
                float f23 = ((f15 - f16) * f7) / 2.0f;
                this.LLILZLL = (int) ((f19 + (f21 * f11)) - f23);
                this.LLIZ = (int) (f13 + r17);
                this.LLIZLLLIL = (int) (f16 + r16);
                if (Float.isNaN(c19mz.LJIIJ)) {
                    f8 = f11;
                } else {
                    f8 = c19mz.LJIIJ;
                }
                if (Float.isNaN(c19mz.LJIILIIL)) {
                    f9 = 0.0f;
                } else {
                    f9 = c19mz.LJIILIIL;
                }
                f11 = Float.isNaN(c19mz.LJIIJJI) ? f11 : c19mz.LJIIJJI;
                if (Float.isNaN(c19mz.LJIIL)) {
                    i3 = 2;
                    f10 = 0.0f;
                } else {
                    f10 = c19mz.LJIIL;
                    i3 = 2;
                }
                this.LLJILJIL = i3;
                this.LLILZIL = (int) (((c21526519Mh.LLILZIL + (f8 * f20)) + (f10 * f21)) - f22);
                this.LLILZLL = (int) (((c21526519Mh.LLILZLL + (f20 * f9)) + (f21 * f11)) - f23);
                this.LL = C19NB.LIZJ(c19mz.LJFF);
                this.LLJI = c19mz.LJI;
                return;
            }
            float f24 = c19mz.LIZ / 100.0f;
            this.LLILLL = f24;
            this.LLILLJJLI = c19mz.LJII;
            if (Float.isNaN(c19mz.LJIIIIZZ)) {
                f4 = f24;
            } else {
                f4 = c19mz.LJIIIIZZ;
            }
            if (Float.isNaN(c19mz.LJIIIZ)) {
                f5 = f24;
            } else {
                f5 = c19mz.LJIIIZ;
            }
            float f25 = c21526519Mh2.LLIZ;
            float f26 = f25 - c21526519Mh.LLIZ;
            float f27 = c21526519Mh2.LLIZLLLIL;
            float f28 = c21526519Mh.LLIZLLLIL;
            this.LLILZ = this.LLILLL;
            float f29 = c21526519Mh.LLILZIL;
            float f30 = c21526519Mh.LLILZLL;
            float f31 = c21526519Mh2.LLILZIL + (f25 / 2.0f);
            float f32 = (c21526519Mh2.LLILZLL + (f27 / 2.0f)) - (f30 + (f28 / 2.0f));
            float f33 = f26 * f4;
            this.LLILZIL = (int) ((f29 + ((f31 - ((r6 / 2.0f) + f29)) * f24)) - (f33 / 2.0f));
            float f34 = (f27 - f28) * f5;
            this.LLILZLL = (int) ((f30 + (f32 * f24)) - (f34 / 2.0f));
            this.LLIZ = (int) (r6 + f33);
            this.LLIZLLLIL = (int) (f28 + f34);
            this.LLJILJIL = 3;
            if (!Float.isNaN(c19mz.LJIIJ)) {
                this.LLILZIL = (int) (c19mz.LJIIJ * ((int) (i - this.LLIZ)));
            }
            if (!Float.isNaN(c19mz.LJIIJJI)) {
                this.LLILZLL = (int) (c19mz.LJIIJJI * ((int) (i2 - this.LLIZLLLIL)));
            }
            this.LL = C19NB.LIZJ(c19mz.LJFF);
            this.LLJI = c19mz.LJI;
            return;
        }
        float f35 = c19mz.LIZ / 100.0f;
        this.LLILLL = f35;
        this.LLILLJJLI = c19mz.LJII;
        if (Float.isNaN(c19mz.LJIIIIZZ)) {
            f = f35;
        } else {
            f = c19mz.LJIIIIZZ;
        }
        if (Float.isNaN(c19mz.LJIIIZ)) {
            f2 = f35;
        } else {
            f2 = c19mz.LJIIIZ;
        }
        float f36 = c21526519Mh2.LLIZ - c21526519Mh.LLIZ;
        float f37 = c21526519Mh2.LLIZLLLIL - c21526519Mh.LLIZLLLIL;
        this.LLILZ = this.LLILLL;
        f35 = Float.isNaN(c19mz.LJIIJ) ? f35 : c19mz.LJIIJ;
        float f38 = c21526519Mh.LLILZIL;
        float f39 = c21526519Mh.LLIZ;
        float f40 = c21526519Mh.LLILZLL;
        float f41 = c21526519Mh.LLIZLLLIL;
        float f42 = (c21526519Mh2.LLILZIL + (c21526519Mh2.LLIZ / 2.0f)) - ((f39 / 2.0f) + f38);
        float f43 = (c21526519Mh2.LLILZLL + (c21526519Mh2.LLIZLLLIL / 2.0f)) - ((f41 / 2.0f) + f40);
        float f44 = f42 * f35;
        float f45 = (f36 * f) / 2.0f;
        this.LLILZIL = (int) ((f38 + f44) - f45);
        float f46 = f35 * f43;
        float f47 = (f37 * f2) / 2.0f;
        this.LLILZLL = (int) ((f40 + f46) - f47);
        this.LLIZ = (int) (f39 + r12);
        this.LLIZLLLIL = (int) (f41 + r10);
        if (Float.isNaN(c19mz.LJIIJJI)) {
            f3 = 0.0f;
        } else {
            f3 = c19mz.LJIIJJI;
        }
        float f48 = (-f43) * f3;
        float f49 = f42 * f3;
        this.LLJILJIL = 1;
        float f50 = (int) ((c21526519Mh.LLILZIL + f44) - f45);
        float f51 = (int) ((c21526519Mh.LLILZLL + f46) - f47);
        this.LLILZIL = f50 + f48;
        this.LLILZLL = f51 + f49;
        this.LL = C19NB.LIZJ(c19mz.LJFF);
        this.LLJI = c19mz.LJI;
    }

    public static void LJII(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f5 = f7;
                        }
                    } else {
                        f3 = f7;
                    }
                } else {
                    f6 = f7;
                }
            } else {
                f4 = f7;
            }
        }
        float f8 = f4 - ((0.0f * f3) / 2.0f);
        float f9 = f6 - ((0.0f * f5) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f3 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f5 * 1.0f) + f9) * f2) + 0.0f;
    }
}
