package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0mmz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409750mmz {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final AbstractC1409710mmv LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C375830EoP<Integer> LJFF;
    public final C375830EoP<C0FNO> LJI;

    public C1409750mmz() {
        this(0);
    }

    public /* synthetic */ C1409750mmz(int i) {
        this(true, "", 0, new C1409740mmy(System.currentTimeMillis()), null, null, null);
    }

    public C1409750mmz(boolean z, String str, int i, AbstractC1409710mmv abstractC1409710mmv, C375830EoP<Unit> c375830EoP, C375830EoP<Integer> c375830EoP2, C375830EoP<C0FNO> c375830EoP3) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = abstractC1409710mmv;
        this.LJ = c375830EoP;
        this.LJFF = c375830EoP2;
        this.LJI = c375830EoP3;
    }

    public static C1409750mmz LIZ(C1409750mmz c1409750mmz, boolean z, String str, int i, AbstractC1409710mmv abstractC1409710mmv, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i2) {
        C375830EoP c375830EoP4 = c375830EoP3;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        AbstractC1409710mmv abstractC1409710mmv2 = abstractC1409710mmv;
        int i3 = i;
        String str2 = str;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = c1409750mmz.LIZ;
        }
        if ((i2 & 2) != 0) {
            str2 = c1409750mmz.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i3 = c1409750mmz.LIZJ;
        }
        if ((i2 & 8) != 0) {
            abstractC1409710mmv2 = c1409750mmz.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            c375830EoP6 = c1409750mmz.LJ;
        }
        if ((i2 & 32) != 0) {
            c375830EoP5 = c1409750mmz.LJFF;
        }
        if ((i2 & 64) != 0) {
            c375830EoP4 = c1409750mmz.LJI;
        }
        c1409750mmz.getClass();
        return new C1409750mmz(z2, str2, i3, abstractC1409710mmv2, c375830EoP6, c375830EoP5, c375830EoP4);
    }
}
