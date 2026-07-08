package X;

/* JADX INFO: renamed from: X.19cX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21577919cX {
    public static final C21577919cX LIZJ;
    public static final C21577919cX LIZLLL;
    public static final C21577919cX LJ;
    public static final C21577919cX LJFF;
    public static final C21577919cX LJI;
    public static final C21577919cX[] LJII;
    public final int LIZ;
    public final boolean LIZIZ;

    static {
        C21577919cX c21577919cX = new C21577919cX(0, false);
        LIZJ = c21577919cX;
        C21577919cX c21577919cX2 = new C21577919cX(1, true);
        C21577919cX c21577919cX3 = new C21577919cX(2, false);
        LIZLLL = c21577919cX3;
        C21577919cX c21577919cX4 = new C21577919cX(3, true);
        C21577919cX c21577919cX5 = new C21577919cX(4, false);
        LJ = c21577919cX5;
        C21577919cX c21577919cX6 = new C21577919cX(5, true);
        C21577919cX c21577919cX7 = new C21577919cX(6, false);
        LJFF = c21577919cX7;
        C21577919cX c21577919cX8 = new C21577919cX(7, true);
        C21577919cX c21577919cX9 = new C21577919cX(8, false);
        C21577919cX c21577919cX10 = new C21577919cX(9, true);
        LJI = c21577919cX10;
        LJII = new C21577919cX[]{c21577919cX, c21577919cX2, c21577919cX3, c21577919cX4, c21577919cX5, c21577919cX6, c21577919cX7, c21577919cX8, c21577919cX9, c21577919cX10, new C21577919cX(10, false), new C21577919cX(10, true)};
    }

    public final boolean LIZ(C21577919cX c21577919cX) {
        int i = this.LIZ;
        int i2 = c21577919cX.LIZ;
        if (i >= i2) {
            if ((!this.LIZIZ || LJI == this) && i == i2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C21577919cX(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
