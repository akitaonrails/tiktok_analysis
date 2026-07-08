package X;

/* JADX INFO: renamed from: X.1Ahs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186581Ahs {
    public final float[] LIZ;
    public final int[] LIZIZ;

    public final int LIZ(int i, int i2) {
        if (i >= 0 && i <= 3) {
            int i3 = (int) (this.LIZ[i] * i2);
            int i4 = this.LIZIZ[i % 2];
            if (i3 > i4) {
                i3 = i4;
            }
            if (i3 >= 0) {
                return i3;
            }
        }
        return 0;
    }

    public C2186581Ahs(float f, float f2, float f3, float f4, int i, int i2) {
        this.LIZ = new float[]{f, f2, f3, f4};
        this.LIZIZ = new int[]{i, i2};
    }
}
