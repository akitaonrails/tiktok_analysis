package X;

import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.13g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20071013g4 {
    public static final AFwS274S0000000_30 LIZ = AFwS274S0000000_30.get$arr$(21);

    public static final void LIZIZ(float[] fArr, float[] fArr2) {
        float fLIZ = LIZ(fArr2, 0, fArr, 0);
        float fLIZ2 = LIZ(fArr2, 0, fArr, 1);
        float fLIZ3 = LIZ(fArr2, 0, fArr, 2);
        float fLIZ4 = LIZ(fArr2, 0, fArr, 3);
        float fLIZ5 = LIZ(fArr2, 1, fArr, 0);
        float fLIZ6 = LIZ(fArr2, 1, fArr, 1);
        float fLIZ7 = LIZ(fArr2, 1, fArr, 2);
        float fLIZ8 = LIZ(fArr2, 1, fArr, 3);
        float fLIZ9 = LIZ(fArr2, 2, fArr, 0);
        float fLIZ10 = LIZ(fArr2, 2, fArr, 1);
        float fLIZ11 = LIZ(fArr2, 2, fArr, 2);
        float fLIZ12 = LIZ(fArr2, 2, fArr, 3);
        float fLIZ13 = LIZ(fArr2, 3, fArr, 0);
        float fLIZ14 = LIZ(fArr2, 3, fArr, 1);
        float fLIZ15 = LIZ(fArr2, 3, fArr, 2);
        float fLIZ16 = LIZ(fArr2, 3, fArr, 3);
        fArr[0] = fLIZ;
        fArr[1] = fLIZ2;
        fArr[2] = fLIZ3;
        fArr[3] = fLIZ4;
        fArr[4] = fLIZ5;
        fArr[5] = fLIZ6;
        fArr[6] = fLIZ7;
        fArr[7] = fLIZ8;
        fArr[8] = fLIZ9;
        fArr[9] = fLIZ10;
        fArr[10] = fLIZ11;
        fArr[11] = fLIZ12;
        fArr[12] = fLIZ13;
        fArr[13] = fLIZ14;
        fArr[14] = fLIZ15;
        fArr[15] = fLIZ16;
    }

    public static final float LIZ(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }
}
