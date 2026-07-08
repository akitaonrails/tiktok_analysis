package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0HgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447380HgW {
    public static final void LIZIZ(Drawable drawable, Integer num) {
        if (num != null) {
            C16GF.LJII(drawable, ColorStateList.valueOf(num.intValue()));
        }
    }

    public static final /* synthetic */ Drawable LIZ(Drawable drawable, Context context, Integer num, Integer num2) {
        if (num != null && num2 != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, num.intValue(), num2.intValue());
            drawable.draw(canvas);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        }
        return drawable;
    }
}
