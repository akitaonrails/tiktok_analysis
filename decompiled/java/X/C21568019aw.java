package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Pair;

/* JADX INFO: renamed from: X.19aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21568019aw {
    public static final C21568319az[] LIZ = {new C21568319az(0.0f, 24.959f, -0.001f, 18.238f, 2.615f, 13.104f), new C21568319az(4.916f, 8.589f, 8.589f, 4.917f, 13.104f, 2.616f), new C21568319az(18.237f, 0.0f, 24.958f, 0.0f, 38.4f, 0.0f)};
    public static final C21568319az[] LIZIZ = {new C21568319az(0.0f, 16.418f, 0.0f, 13.627f, 0.689f, 11.356f), new C21568319az(2.24f, 6.242f, 6.242f, 2.24f, 11.356f, 0.689f), new C21568319az(13.627f, 0.0f, 16.418f, 0.0f, 22.0f, 0.0f)};
    public static final C21568319az[] LIZJ = {new C21568319az(0.0f, 23.615f, 0.006f, 22.068f, 0.16f, 20.758f), new C21568319az(1.43f, 9.952f, 9.951f, 1.431f, 20.757f, 0.161f), new C21568319az(22.123f, 0.0f, 23.749f, 0.0f, 27.0f, 0.0f)};
    public static final C21568319az[] LIZLLL = {new C21568319az(0.0f, 24.179f, 0.0f, 23.018f, 0.08f, 22.039f), new C21568319az(1.04f, 10.332f, 10.332f, 1.041f, 22.039f, 0.081f), new C21568319az(23.018f, 0.001f, 24.179f, 0.0f, 26.5f, 0.0f)};

    public static Matrix LIZIZ(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.centerX(), 0.0f);
        matrix.preScale(-1.0f, 1.0f);
        matrix.preTranslate(-rectF.centerX(), 0.0f);
        return matrix;
    }

    public static Path LIZJ(RectF rectF) {
        if (rectF.height() >= 54.0f) {
            Path path = new Path();
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            float f5 = f3 - 27.0f;
            path.moveTo(f5, f2);
            EnumC1321550kUj enumC1321550kUj = EnumC1321550kUj.LLILLJJLI;
            C21568319az[] c21568319azArr = LIZJ;
            LIZ(path, f3, f2, enumC1321550kUj, c21568319azArr);
            path.lineTo(f3, f4 - 27.0f);
            LIZ(path, f3, f4, EnumC1321550kUj.LLILLL, c21568319azArr);
            path.lineTo(27.0f + f, f4);
            path.cubicTo(f + 23.749f, f4, 22.123f + f, f4 + 4.0E-4f, f + 20.757f, f4 - 0.16f);
            path.cubicTo(f + 13.611f, f4 - 1.0f, f + 7.465f, f4 - 5.011f, f + 3.754f, f4 - 10.757f);
            path.cubicTo(f + 3.202f, f4 - 9.883f, f + 2.482f, f4 - 9.288f, f + 1.621f, f4 - 9.08f);
            path.cubicTo(f - 1.181f, f4 - 8.404f, f - 4.402f, f4 - 12.074f, f - 5.573f, f4 - 17.277f);
            path.cubicTo(f - 6.744f, f4 - 22.479f, f - 5.422f, f4 - 27.243f, f - 2.62f, f4 - 27.919f);
            path.cubicTo(f - 1.762f, f4 - 28.126f, f - 0.866f, f4 - 27.924f, f, f4 - 27.397f);
            path.lineTo(f, 26.604f + f2);
            LIZ(path, f, f2, EnumC1321550kUj.LL, c21568319azArr);
            path.lineTo(f5, f2);
            path.close();
            return path;
        }
        Path path2 = new Path();
        float f6 = rectF.left;
        float f7 = rectF.top;
        float f8 = rectF.right;
        float f9 = rectF.bottom;
        float fHeight = rectF.height() / 2.0f;
        float f10 = fHeight * 0.5522848f;
        float fCenterY = rectF.centerY();
        float f11 = f8 - fHeight;
        float f12 = fHeight + f6;
        path2.moveTo(f11, f7);
        float f13 = f11 + f10;
        path2.cubicTo(f13, f7, f8, fCenterY - f10, f8, fCenterY);
        path2.cubicTo(f8, fCenterY + f10, f13, f9, f11, f9);
        path2.lineTo(f12, f9);
        path2.cubicTo(f6 + 11.594f, f9, f6 + 5.572f, f9 - 3.784f, f6 + 2.394f, f9 - 9.392f);
        path2.cubicTo(2.151f + f6, f9 - 9.252f, f6 + 1.893f, f9 - 9.146f, f6 + 1.621f, f9 - 9.08f);
        path2.cubicTo(f6 - 1.181f, f9 - 8.404f, f6 - 4.403f, f9 - 12.074f, f6 - 5.574f, f9 - 17.277f);
        path2.cubicTo(f6 - 6.745f, f9 - 22.479f, f6 - 5.422f, f9 - 27.243f, f6 - 2.621f, f9 - 27.919f);
        float f14 = 1.592f + f6;
        path2.cubicTo(f6 - 1.218f, f9 - 28.257f, f6 + 0.29f, f9 - 27.507f, f14, f9 - 26.02f);
        path2.lineTo(f14, 10.98f + f7);
        path2.cubicTo(f6 + 4.474f, f7 + 4.51f, f6 + 10.96f, f7, f12, f7);
        path2.lineTo(f11, f7);
        path2.close();
        return path2;
    }

    public static Path LIZLLL(RectF rectF) {
        Path path = new Path();
        float f = rectF.left;
        float f2 = rectF.bottom;
        float f3 = f - 16.493f;
        float f4 = f2 - 21.838f;
        path.moveTo(f3, f4);
        path.cubicTo(f - 14.265f, f2 - 22.598f, f - 11.567f, f2 - 20.6f, f - 10.466f, f2 - 17.376f);
        path.cubicTo(f - 9.366f, f2 - 14.151f, f - 10.28f, f2 - 10.921f, f - 12.508f, f2 - 10.161f);
        path.cubicTo(f - 14.736f, f2 - 9.401f, f - 17.433f, f2 - 11.399f, f - 18.534f, f2 - 14.623f);
        path.cubicTo(f - 19.634f, f2 - 17.848f, f - 18.72f, f2 - 21.078f, f3, f4);
        path.close();
        return path;
    }

    public static Path LJ(RectF rectF) {
        Path path = new Path();
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        float fHeight = rectF.height() / 2.0f;
        float f5 = fHeight * 0.5522848f;
        float fCenterY = rectF.centerY();
        float f6 = f3 - fHeight;
        float f7 = f + fHeight;
        path.moveTo(f6, f2);
        float f8 = f6 + f5;
        path.cubicTo(f8, f2, f3, fCenterY - f5, f3, fCenterY);
        path.cubicTo(f3, fCenterY + f5, f8, f4, f6, f4);
        path.lineTo(f7, f4);
        path.cubicTo(f + 6.412f, f4, f + 2.483f, f2 + 19.192f, f + 0.832f, f2 + 15.201f);
        path.cubicTo(f + 0.124f, f2 + 16.363f, f - 0.837f, f2 + 17.06f, f - 1.856f, f2 + 16.996f);
        path.cubicTo(f - 3.779f, f2 + 16.875f, f - 5.179f, f2 + 14.092f, f - 4.982f, f2 + 10.78f);
        path.cubicTo(f - 4.786f, f2 + 7.469f, f - 3.067f, f2 + 4.883f, f - 1.144f, f2 + 5.004f);
        path.cubicTo(f - 0.313f, f2 + 5.056f, f + 0.421f, f2 + 5.608f, f + 0.97f, f2 + 6.483f);
        path.cubicTo(f + 2.694f, f2 + 2.662f, f + 6.534f, f2, f7, f2);
        path.lineTo(f6, f2);
        path.close();
        return path;
    }

    public static Path LJFF(RectF rectF) {
        Path path = new Path();
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = f - 10.519f;
        float f4 = f2 + 7.03f;
        path.moveTo(f3, f4);
        path.cubicTo(f - 9.452f, f2 + 6.796f, f - 8.355f, f2 + 7.935f, f - 8.069f, f2 + 9.575f);
        path.cubicTo(f - 7.783f, f2 + 11.215f, f - 8.416f, f2 + 12.735f, f - 9.482f, f2 + 12.97f);
        path.cubicTo(f - 10.549f, f2 + 13.204f, f - 11.646f, f2 + 12.065f, f - 11.932f, f2 + 10.425f);
        path.cubicTo(f - 12.217f, f2 + 8.785f, f - 11.585f, f2 + 7.265f, f3, f4);
        path.close();
        return path;
    }

    public static void LIZ(Path path, float f, float f2, EnumC1321550kUj enumC1321550kUj, C21568319az[] c21568319azArr) {
        for (C21568319az c21568319az : c21568319azArr) {
            Pair<Float, Float> pairLIZJ = enumC1321550kUj.LIZJ(c21568319az.LIZ, c21568319az.LIZIZ);
            float fFloatValue = pairLIZJ.getFirst().floatValue();
            float fFloatValue2 = pairLIZJ.getSecond().floatValue();
            Pair<Float, Float> pairLIZJ2 = enumC1321550kUj.LIZJ(c21568319az.LIZJ, c21568319az.LIZLLL);
            float fFloatValue3 = pairLIZJ2.getFirst().floatValue();
            float fFloatValue4 = pairLIZJ2.getSecond().floatValue();
            Pair<Float, Float> pairLIZJ3 = enumC1321550kUj.LIZJ(c21568319az.LJ, c21568319az.LJFF);
            path.cubicTo(f + fFloatValue, f2 + fFloatValue2, f + fFloatValue3, f2 + fFloatValue4, f + pairLIZJ3.getFirst().floatValue(), f2 + pairLIZJ3.getSecond().floatValue());
        }
    }
}
