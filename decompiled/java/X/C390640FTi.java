package X;

/* JADX INFO: renamed from: X.0FTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390640FTi {
    public final Boolean LIZ;
    public final Integer LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;
    public final Boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;

    public C390640FTi() {
        this(0, 1023);
    }

    public /* synthetic */ C390640FTi(int i, int i2) {
        this(null, null, null, null, null, 0, 0, 0, 0, (i2 & 512) != 0 ? 0 : i);
    }

    public C390640FTi(Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, int i, int i2, int i3, int i4, int i5) {
        this.LIZ = bool;
        this.LIZIZ = num;
        this.LIZJ = bool2;
        this.LIZLLL = bool3;
        this.LJ = bool4;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
    }

    public static C390640FTi LIZ(C390640FTi c390640FTi, Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i4;
        int i8 = i3;
        int i9 = i2;
        int i10 = i;
        Boolean bool5 = bool4;
        Boolean bool6 = bool3;
        Boolean bool7 = bool2;
        Integer num2 = num;
        Boolean bool8 = bool;
        if ((i5 & 1) != 0) {
            bool8 = c390640FTi.LIZ;
        }
        if ((i5 & 2) != 0) {
            num2 = c390640FTi.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            bool7 = c390640FTi.LIZJ;
        }
        if ((i5 & 8) != 0) {
            bool6 = c390640FTi.LIZLLL;
        }
        if ((i5 & 16) != 0) {
            bool5 = c390640FTi.LJ;
        }
        if ((i5 & 32) != 0) {
            i10 = c390640FTi.LJFF;
        }
        if ((i5 & 64) != 0) {
            i9 = c390640FTi.LJI;
        }
        if ((i5 & 128) != 0) {
            i8 = c390640FTi.LJII;
        }
        if ((i5 & 256) != 0) {
            i7 = c390640FTi.LJIIIIZZ;
        }
        if ((i5 & 512) != 0) {
            i6 = c390640FTi.LJIIIZ;
        } else {
            i6 = 0;
        }
        c390640FTi.getClass();
        return new C390640FTi(bool8, num2, bool7, bool6, bool5, i10, i9, i8, i7, i6);
    }
}
