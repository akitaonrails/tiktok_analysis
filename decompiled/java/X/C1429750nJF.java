package X;

/* JADX INFO: renamed from: X.0nJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429750nJF {
    public static final float[] LIZ(float f, float f2, int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        float f3 = i3;
        float f4 = i;
        float f5 = (f3 * 1.0f) / f4;
        float f6 = i4;
        float f7 = i2;
        float f8 = (1.0f * f6) / f7;
        if (f5 == f8) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new float[]{f, f2};
        }
        float fMax = Math.max(f5, f8);
        if (fMax == f5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f2 = (((f2 * f7) * fMax) - (((f7 * fMax) - f6) / 2.0f)) / f6;
        } else {
            f = (((f * f4) * fMax) - (((f4 * fMax) - f3) / 2.0f)) / f3;
        }
        return new float[]{f, f2};
    }
}
