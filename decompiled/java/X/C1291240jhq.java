package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0jhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291240jhq extends AbstractC1291220jho {
    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        int width;
        if (bitmap.getWidth() >= bitmap.getHeight()) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        int i = (int) (((double) width) / 1.2d);
        int i2 = (width - i) / 2;
        return C1323050kX9.LJFF(abstractC1301670jyf.LIZJ(Bitmap.createBitmap(bitmap, i2, i2, i, i, (Matrix) null, false)));
    }
}
