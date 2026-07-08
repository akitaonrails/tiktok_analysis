package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696000uEg {
    public static final /* synthetic */ int LIZIZ = 0;
    public final float[] LIZ;

    public static float[] LIZ() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LIZ);
    }

    public final String toString() {
        float[] fArr = this.LIZ;
        return C09AZ.LIZJ("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void LIZLLL(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public final boolean equals(Object obj) {
        float[] fArr = this.LIZ;
        if (!(obj instanceof C1696000uEg) || !Intrinsics.LJFF(fArr, ((C1696000uEg) obj).LIZ)) {
            return false;
        }
        return true;
    }

    public static final long LIZIZ(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1 / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2)) + f7) * f10)) << 32) | (((long) Float.floatToRawIntBits(f10 * ((f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8))) & 4294967295L);
    }

    public static final void LIZJ(float[] fArr, C1696010uEh c1696010uEh) {
        boolean z;
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = c1696010uEh.LIZ;
        float f11 = c1696010uEh.LIZIZ;
        float f12 = c1696010uEh.LIZJ;
        float f13 = c1696010uEh.LIZLLL;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) < 2139095040) {
            z = true;
        } else {
            z = false;
        }
        float f18 = 0.0f;
        if (!z) {
            f16 = 0.0f;
        }
        float f19 = f * f10;
        float f20 = f4 * f11;
        float f21 = f16 * (f19 + f20 + f7);
        float f22 = f10 * f2;
        float f23 = f11 * f5;
        float f24 = f16 * (f22 + f23 + f8);
        float f25 = f6 * f13;
        float f26 = 1.0f / ((f14 + f25) + f9);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f4 * f13;
        float f28 = (f19 + f27 + f7) * f26;
        float f29 = f5 * f13;
        float f30 = f26 * (f22 + f29 + f8);
        float f31 = f3 * f12;
        float f32 = 1.0f / ((f31 + f15) + f9);
        if ((Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) >= 2139095040) {
            f32 = 0.0f;
        }
        float f33 = f * f12;
        float f34 = f32 * (f33 + f20 + f7);
        float f35 = f2 * f12;
        float f36 = f32 * (f23 + f35 + f8);
        float f37 = 1.0f / ((f31 + f25) + f9);
        if ((Float.floatToRawIntBits(f37) & Integer.MAX_VALUE) < 2139095040) {
            f18 = f37;
        }
        float f38 = (f33 + f27 + f7) * f18;
        float f39 = f18 * (f35 + f29 + f8);
        c1696010uEh.LIZ = Math.min(f21, Math.min(f28, Math.min(f34, f38)));
        c1696010uEh.LIZIZ = Math.min(f24, Math.min(f30, Math.min(f36, f39)));
        c1696010uEh.LIZJ = Math.max(f21, Math.max(f28, Math.max(f34, f38)));
        c1696010uEh.LIZLLL = Math.max(f24, Math.max(f30, Math.max(f36, f39)));
    }

    public static final void LJFF(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[8];
        float f7 = fArr[3];
        float f8 = fArr2[12];
        float f9 = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
        float f10 = fArr2[1];
        float f11 = fArr2[5];
        float f12 = fArr2[9];
        float f13 = fArr2[13];
        float f14 = (f * f10) + (f3 * f11) + (f5 * f12) + (f7 * f13);
        float f15 = fArr2[2];
        float f16 = fArr2[6];
        float f18 = fArr2[10];
        float f19 = fArr2[14];
        float f20 = (f * f15) + (f3 * f16) + (f5 * f18) + (f7 * f19);
        float f21 = fArr2[3];
        float f22 = fArr2[7];
        float f23 = fArr2[11];
        float f24 = fArr2[15];
        float f25 = (f * f21) + (f3 * f22) + (f5 * f23) + (f7 * f24);
        float f26 = fArr[4];
        float f27 = fArr[5];
        float f28 = fArr[6];
        float f29 = fArr[7];
        float f30 = (f26 * f2) + (f27 * f4) + (f28 * f6) + (f29 * f8);
        float f31 = (f26 * f10) + (f27 * f11) + (f28 * f12) + (f29 * f13);
        float f32 = (f26 * f15) + (f27 * f16) + (f28 * f18) + (f29 * f19);
        float f33 = (f26 * f21) + (f27 * f22) + (f28 * f23) + (f29 * f24);
        float f34 = fArr[8];
        float f35 = fArr[9];
        float f36 = fArr[10];
        float f37 = fArr[11];
        float f38 = (f34 * f2) + (f35 * f4) + (f36 * f6) + (f37 * f8);
        float f39 = (f34 * f10) + (f35 * f11) + (f36 * f12) + (f37 * f13);
        float f40 = (f34 * f15) + (f35 * f16) + (f36 * f18) + (f37 * f19);
        float f41 = (f34 * f21) + (f35 * f22) + (f36 * f23) + (f37 * f24);
        float f42 = fArr[12];
        float f43 = fArr[13];
        float f44 = fArr[14];
        float f45 = fArr[15];
        fArr[0] = f9;
        fArr[1] = f14;
        fArr[2] = f20;
        fArr[3] = f25;
        fArr[4] = f30;
        fArr[5] = f31;
        fArr[6] = f32;
        fArr[7] = f33;
        fArr[8] = f38;
        fArr[9] = f39;
        fArr[10] = f40;
        fArr[11] = f41;
        fArr[12] = (f2 * f42) + (f4 * f43) + (f6 * f44) + (f8 * f45);
        fArr[13] = (f10 * f42) + (f11 * f43) + (f12 * f44) + (f13 * f45);
        fArr[14] = (f15 * f42) + (f16 * f43) + (f18 * f44) + (f19 * f45);
        fArr[15] = (f42 * f21) + (f43 * f22) + (f44 * f23) + (f45 * f24);
    }

    public static final void LJ(float f, float f2, float f3, float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    public static final void LJI(float f, float f2, float f3, float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }
}
