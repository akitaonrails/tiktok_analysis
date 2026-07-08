package X;

/* JADX INFO: renamed from: X.150y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204518150y {
    public final float LIZ;
    public final float[] LIZIZ;
    public final boolean LIZJ;
    public final C151B LIZLLL;
    public float LJ;
    public final boolean LJFF;
    public final EnumC19363810pI LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C204518150y() {
        boolean z = false;
        this(0.0f, null, z, 0 == true ? 1 : 0, z, 127);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C204518150y(float f, float[] fArr, boolean z, C151B c151b, boolean z2, int i) {
        EnumC19363810pI enumC19363810pI;
        boolean z3 = z2;
        boolean z4 = z;
        C151B c151b2 = c151b;
        float[] fArr2 = fArr;
        float f2 = (i & 1) != 0 ? 0.0f : f;
        fArr2 = (i & 2) != 0 ? new float[8] : fArr2;
        z4 = (i & 4) != 0 ? false : z4;
        c151b2 = (i & 8) != 0 ? C151B.NONE : c151b2;
        float f3 = (i & 16) != 0 ? 1.0f : 0.0f;
        z3 = (i & 32) != 0 ? false : z3;
        if ((i & 64) != 0) {
            enumC19363810pI = EnumC19363810pI.UNKNOWN;
        } else {
            enumC19363810pI = null;
        }
        this(f2, fArr2, z4, c151b2, f3, z3, enumC19363810pI);
    }

    public C204518150y(float f, float[] fArr, boolean z, C151B c151b, float f2, boolean z2, EnumC19363810pI enumC19363810pI) {
        this.LIZ = f;
        this.LIZIZ = fArr;
        this.LIZJ = z;
        this.LIZLLL = c151b;
        this.LJ = f2;
        this.LJFF = z2;
        this.LJI = enumC19363810pI;
    }
}
