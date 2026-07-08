package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: renamed from: X.09me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2473409me {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(Bitmap bitmap, int i, int i2) {
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float f = i2;
        matrix.postRotate(i);
        matrix.postScale(f / width, f / height);
        return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
    }
}
