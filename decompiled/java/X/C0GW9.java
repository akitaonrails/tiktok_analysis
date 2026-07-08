package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0GW9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GW9 {
    public static final Path LIZ(Path path, float f, float f2, float f3, float f4) {
        if (path != null) {
            path.reset();
        } else {
            path = new Path();
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        float f5 = f - 0.0f;
        float f6 = f2 - 0.0f;
        float f7 = 2;
        float f8 = f5 / f7;
        if (f3 > f8) {
            f3 = f8;
        }
        float f9 = f6 / f7;
        if (f4 > f9) {
            f4 = f9;
        }
        float f10 = f5 - (f7 * f3);
        float f11 = f6 - (f7 * f4);
        path.moveTo(f, 0.0f + f4);
        float f12 = -f4;
        path.rQuadTo(0.0f, f12, -f3, f12);
        path.rLineTo(-f10, 0.0f);
        path.rLineTo(-f3, 0.0f);
        path.rLineTo(0.0f, f4);
        path.rLineTo(0.0f, f11);
        path.rLineTo(0.0f, f4);
        path.rLineTo(f3, 0.0f);
        path.rLineTo(f10, 0.0f);
        path.rQuadTo(f3, 0.0f, f3, -f4);
        path.rLineTo(0.0f, -f11);
        path.close();
        return path;
    }
}
