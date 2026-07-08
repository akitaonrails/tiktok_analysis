package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* JADX INFO: renamed from: X.0pT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512770pT9 {
    public static final float LIZ = Float.intBitsToFloat(1056964608);

    public static void LIZ(String str, Float[] fArr, int i) {
        int i2;
        int i3;
        float fIntBitsToFloat;
        for (int i4 = 0; i4 < str.length() / 4 && i4 < i; i4++) {
            char[] cArr = new char[4];
            int i5 = i4 * 4;
            str.getChars(i5, i5 + 4, cArr, 0);
            int i6 = CastIntegerProtector.parseInt(new String(cArr), 16) & 65535;
            int i7 = 32768 & i6;
            int i8 = (i6 >>> 10) & 31;
            int i9 = i6 & 1023;
            if (i8 == 0) {
                if (i9 != 0) {
                    fIntBitsToFloat = Float.intBitsToFloat(i9 + 1056964608) - LIZ;
                    if (i7 != 0) {
                        fIntBitsToFloat = -fIntBitsToFloat;
                    }
                    fArr[i4] = Float.valueOf(fIntBitsToFloat);
                } else {
                    i2 = 0;
                    i3 = 0;
                }
            } else {
                i2 = i9 << 13;
                if (i8 == 31) {
                    i3 = 255;
                } else {
                    i3 = (i8 - 15) + 127;
                }
            }
            fIntBitsToFloat = Float.intBitsToFloat(i2 | (i7 << 16) | (i3 << 23));
            fArr[i4] = Float.valueOf(fIntBitsToFloat);
        }
    }
}
