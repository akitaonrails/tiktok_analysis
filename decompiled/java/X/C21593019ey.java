package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.19ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21593019ey {
    public final ShortVideoContext LIZ;
    public final C375830EoP<C1648010szH> LIZIZ;
    public final C1647990szF LIZJ;
    public final C375830EoP<Integer> LIZLLL;
    public final C375830EoP<Boolean> LJ;
    public final C375830EoP<Boolean> LJFF;
    public final C375830EoP<C1648000szG> LJI;
    public final C375830EoP<Boolean> LJII;

    public C21593019ey(ShortVideoContext shortVideoContext, C375830EoP<C1648010szH> c375830EoP, C1647990szF c1647990szF, C375830EoP<Integer> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<Boolean> c375830EoP4, C375830EoP<C1648000szG> c375830EoP5, C375830EoP<Boolean> c375830EoP6) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c1647990szF;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c375830EoP4;
        this.LJI = c375830EoP5;
        this.LJII = c375830EoP6;
    }

    public static C21593019ey LIZ(C21593019ey c21593019ey, C375830EoP c375830EoP, C1647990szF c1647990szF, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, int i) {
        ShortVideoContext shortVideoContext;
        C375830EoP c375830EoP7 = c375830EoP6;
        C375830EoP c375830EoP8 = c375830EoP5;
        C375830EoP c375830EoP9 = c375830EoP4;
        C375830EoP c375830EoP10 = c375830EoP3;
        C375830EoP c375830EoP11 = c375830EoP2;
        C1647990szF c1647990szF2 = c1647990szF;
        C375830EoP c375830EoP12 = c375830EoP;
        if ((i & 1) != 0) {
            shortVideoContext = c21593019ey.LIZ;
        } else {
            shortVideoContext = null;
        }
        if ((i & 2) != 0) {
            c375830EoP12 = c21593019ey.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1647990szF2 = c21593019ey.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP11 = c21593019ey.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP10 = c21593019ey.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP9 = c21593019ey.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP8 = c21593019ey.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP7 = c21593019ey.LJII;
        }
        c21593019ey.getClass();
        return new C21593019ey(shortVideoContext, c375830EoP12, c1647990szF2, c375830EoP11, c375830EoP10, c375830EoP9, c375830EoP8, c375830EoP7);
    }
}
