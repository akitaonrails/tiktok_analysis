package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0GUS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GUS {
    public static final Path LIZ(Path path, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        Path path2 = path;
        if (path2 != null) {
            path2.reset();
        } else {
            path2 = new Path();
        }
        float f5 = f4 - f2;
        float f6 = (f3 - f) - f5;
        float f7 = 2;
        float f8 = f5 / f7;
        path2.moveTo(f3 - f8, f4);
        if (z2) {
            path2.arcTo(f3 - f5, f2, f3, f4, 90.0f, -180.0f, false);
        } else {
            path2.rLineTo(f8, 0.0f);
            float f9 = -f5;
            path2.rLineTo(0.0f, f9);
            path2.rLineTo(f9 / f7, 0.0f);
        }
        path2.rLineTo(-f6, 0.0f);
        if (z) {
            path2.arcTo(f, f2, f + f5, f4, -90.0f, -180.0f, false);
        } else {
            path2.rLineTo((-f5) / f7, 0.0f);
            path2.rLineTo(0.0f, f5);
            path2.rLineTo(f8, 0.0f);
        }
        path2.close();
        return path2;
    }
}
