package X;

/* JADX INFO: renamed from: X.15eY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20571215eY {
    public final boolean LIZ;
    public final float LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;

    public C20571215eY() {
        this(false, 0, 1023);
    }

    public C20571215eY(boolean z, int i, int i2) {
        boolean z2;
        float fFloatValue;
        boolean z3;
        boolean z4;
        boolean zBooleanValue;
        boolean z5;
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            fFloatValue = ((Number) C274420ApE.LIZ.getValue()).floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        if ((i2 & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i2 & 16) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            zBooleanValue = ((Boolean) C257770A8h.LIZ.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        z = (i2 & 64) != 0 ? false : z;
        if ((i2 & 128) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        i = (i2 & 256) != 0 ? -1 : i;
        boolean z6 = (i2 & 512) != 0;
        this.LIZ = z2;
        this.LIZIZ = fFloatValue;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = zBooleanValue;
        this.LJFF = z;
        this.LJI = z5;
        this.LJII = i;
        this.LJIIIIZZ = z6;
    }
}
