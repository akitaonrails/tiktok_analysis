package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1320320kSk implements InterfaceC1320380kSq {
    public abstract void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

    @Override // X.InterfaceC1320380kSq
    public final Matrix LIZ(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        LIZIZ(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }
}
