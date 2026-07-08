package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0kLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316080kLu extends AbstractC1316100kLw {
    public static final C1316080kLu LJ = new C1316080kLu();

    public final String toString() {
        return "fit_center";
    }

    @Override // X.AbstractC1316100kLw
    public final void LIZIZ(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f / f3;
        float f8 = f2 / f4;
        if (f7 > f8) {
            matrix.setScale(f8, f8);
            matrix.postTranslate(((f - (f3 * f8)) / 2.0f) + f5, f6);
        } else {
            matrix.setScale(f7, f7);
            matrix.postTranslate(f5, ((f2 - (f4 * f7)) / 2.0f) + f6);
        }
    }
}
