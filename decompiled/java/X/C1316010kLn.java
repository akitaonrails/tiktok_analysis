package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0kLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1316010kLn extends AbstractC1316100kLw {
    public static final C1316010kLn LJ = new C1316010kLn();

    public final String toString() {
        return "center";
    }

    @Override // X.AbstractC1316100kLw
    public final void LIZIZ(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        float fLIZIZ = C1311130kDv.LIZIZ(1.0f, 0.0f);
        float fRound = Math.round((f - (f3 * fLIZIZ)) * 0.5f);
        float fRound2 = Math.round((f2 - (f4 * fLIZIZ)) * 0.5f);
        matrix.setScale(fLIZIZ, fLIZIZ);
        matrix.postTranslate(fRound, fRound2);
    }
}
