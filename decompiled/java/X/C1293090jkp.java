package X;

/* JADX INFO: renamed from: X.0jkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293090jkp {
    public static float LIZ(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float LIZIZ(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int LIZJ(float f, int i, int i2) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float fLIZ = LIZ(((i >> 16) & 255) / 255.0f);
        float fLIZ2 = LIZ(((i >> 8) & 255) / 255.0f);
        float fLIZ3 = LIZ((i & 255) / 255.0f);
        float fLIZ4 = LIZ(((i2 >> 16) & 255) / 255.0f);
        float fLIZ5 = fLIZ2 + ((LIZ(((i2 >> 8) & 255) / 255.0f) - fLIZ2) * f);
        float fLIZ6 = fLIZ3 + (f * (LIZ((i2 & 255) / 255.0f) - fLIZ3));
        return (Math.round(LIZIZ(fLIZ + ((fLIZ4 - fLIZ) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(LIZIZ(fLIZ5) * 255.0f) << 8) | Math.round(LIZIZ(fLIZ6) * 255.0f);
    }
}
