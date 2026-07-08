package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0kLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316090kLv extends AbstractC1316100kLw {
    public static final C1316090kLv LJ = new C1316090kLv();

    public final String toString() {
        return "fit_xy";
    }

    @Override // X.AbstractC1316100kLw
    public final void LIZIZ(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        matrix.setScale(f / f3, f2 / f4);
        matrix.postTranslate(f5, f6);
    }
}
