package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0GQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415500GQy {
    public static void LIZ(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7 = f * 1.6f;
        Path path2 = path;
        path2.moveTo(0.0f, f7);
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            float f8 = f * 1.03995f;
            float f9 = f * 0.759921f;
            float f10 = f * 0.108993f;
            float f11 = f * 0.546009f;
            path2.cubicTo(0.0f, f8, 0.0f, f9, f10, f11);
            float f12 = f * 0.204867f;
            float f13 = f * 0.357847f;
            path2.cubicTo(f12, f13, f13, f12, f11, f10);
            path2.cubicTo(f9, 0.0f, f8, 0.0f, f7, 0.0f);
        }
        float f14 = f2 * 1.6f;
        path2.lineTo(f5 - f14, 0.0f);
        if (f2 != 0.0f) {
            float f15 = f2 * 1.03995f;
            float f16 = f2 * 0.759921f;
            float f18 = f2 * 0.546009f;
            float f19 = f2 * 0.108993f;
            path2 = path2;
            path2.cubicTo(f5 - f15, 0.0f, f5 - f16, 0.0f, f5 - f18, f19);
            float f20 = f2 * 0.357847f;
            float f21 = f2 * 0.204867f;
            path2.cubicTo(f5 - f20, f21, f5 - f21, f20, f5 - f19, f18);
            path2.cubicTo(f5, f16, f5, f15, f5, f14);
        }
        float f22 = f3 * 1.6f;
        path2.lineTo(f5, f6 - f22);
        if (f3 != 0.0f) {
            float f23 = f3 * 1.03995f;
            float f24 = f3 * 0.759921f;
            float f25 = f3 * 0.108993f;
            float f26 = f3 * 0.546009f;
            path2.cubicTo(f5, f6 - f23, f5, f6 - f24, f5 - f25, f6 - f26);
            float f27 = f3 * 0.204867f;
            float f28 = f3 * 0.357847f;
            path2.cubicTo(f5 - f27, f6 - f28, f5 - f28, f6 - f27, f5 - f26, f6 - f25);
            path2 = path2;
            path2.cubicTo(f5 - f24, f6, f5 - f23, f6, f5 - f22, f6);
        }
        float f29 = f4 * 1.6f;
        path2.lineTo(f29, f6);
        if (f4 != 0.0f) {
            float f30 = f4 * 1.03995f;
            float f31 = f4 * 0.759921f;
            float f32 = f4 * 0.546009f;
            float f33 = f4 * 0.108993f;
            path2 = path2;
            path2.cubicTo(f30, f6, f31, f6, f32, f6 - f33);
            float f34 = f4 * 0.357847f;
            float f35 = f4 * 0.204867f;
            path2.cubicTo(f34, f6 - f35, f35, f6 - f34, f33, f6 - f32);
            path2.cubicTo(0.0f, f6 - f31, 0.0f, f6 - f30, 0.0f, f6 - f29);
        }
        path2.close();
    }
}
