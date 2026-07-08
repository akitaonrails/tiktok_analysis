package X;

import com.ss.ttlivestreamer.core.opengl.UVRange;

/* JADX INFO: renamed from: X.0jCA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271600jCA {
    public static UVRange LIZ(UVRange uVRange, int i, int i2, float f) {
        float f2 = i;
        float f3 = uVRange.uMax - uVRange.uMin;
        float f4 = f3 * f2;
        float f5 = i2;
        float f6 = uVRange.vMax - uVRange.vMin;
        float f7 = f6 * f5;
        if (f4 / f7 >= f) {
            float f8 = (f3 - ((f * f7) / f2)) / 2;
            return new UVRange(uVRange.uMin + f8, uVRange.uMax - f8, uVRange.vMin, uVRange.vMax);
        }
        float f9 = (f6 - ((f4 / f) / f5)) / 2;
        return new UVRange(uVRange.uMin, uVRange.uMax, uVRange.vMin + f9, uVRange.vMax - f9);
    }
}
