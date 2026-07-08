package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1316100kLw implements InterfaceC1316000kLm {
    public abstract void LIZIZ(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6);

    @Override // X.InterfaceC1316000kLm
    public final Matrix LIZ(int i, int i2, Rect rect, Matrix matrix) {
        LIZIZ(matrix, rect.width(), rect.height(), i, i2, rect.left, rect.top);
        return matrix;
    }
}
