package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ2 {
    public static final Bitmap LIZ(Drawable drawable, int i, int i2, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                    if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                        return bitmapDrawable.getBitmap();
                    }
                    return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
                }
            } else {
                throw new IllegalArgumentException("bitmap is null");
            }
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }
}
