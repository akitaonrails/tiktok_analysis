package X;

/* JADX INFO: renamed from: X.0twW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1684740twW {
    public static final C0F28 LIZLLL = new C0F28(-16.0f, 8.0f);
    public static final C0F28 LJ = new C0F28(-6.0f, 6.0f);
    public final C13LY<Float> LIZ;
    public final C13LY<Float> LIZIZ;
    public final C13LY<Float> LIZJ;

    public AbstractC1684740twW(C0F28 c0f28) {
        C0F28 c0f282 = LIZLLL;
        C0F28 c0f283 = LJ;
        this.LIZ = c0f282;
        this.LIZIZ = c0f283;
        this.LIZJ = c0f28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LIZ(float f, C13LY c13ly) {
        if (f < ((Number) c13ly.getStart()).floatValue()) {
            return -1;
        }
        if (f <= ((Number) c13ly.LJFF()).floatValue()) {
            return 0;
        }
        return 1;
    }

    public final boolean LIZIZ(C1684440tw2 c1684440tw2, float f, float f2, float f3) {
        if (c1684440tw2 != null) {
            c1684440tw2.LIZIZ = LIZ(f, this.LIZ);
            c1684440tw2.LIZJ = LIZ(f2, this.LIZIZ);
            c1684440tw2.LIZ = LIZ(f3, this.LIZJ);
        }
        if (this.LIZ.LIZJ(Float.valueOf(f)) && this.LIZIZ.LIZJ(Float.valueOf(f2)) && this.LIZJ.LIZJ(Float.valueOf(f3))) {
            return true;
        }
        return false;
    }
}
