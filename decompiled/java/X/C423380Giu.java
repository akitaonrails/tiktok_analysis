package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.SeekBar;

/* JADX INFO: renamed from: X.0Giu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423380Giu {
    public final Context LIZ;

    public C423380Giu(Context context) {
        this.LIZ = context;
    }

    public static Drawable LIZIZ(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(0);
        paint2.setStrokeWidth(C418440Gaw.LIZIZ(2));
        paint2.setStyle(Paint.Style.STROKE);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        canvas.drawCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, paint2);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, C1BWL.LIZJ().getDisplayMetrics());
        return new BitmapDrawable(C1BWL.LIZJ(), Bitmap.createScaledBitmap(bitmapCreateBitmap, iApplyDimension, iApplyDimension, true));
    }

    public final float LIZJ(SeekBar seekBar) {
        float width = ((seekBar.getWidth() - seekBar.getPaddingStart()) - seekBar.getPaddingEnd()) * (seekBar.getProgress() / seekBar.getMax());
        float paddingStart = seekBar.getPaddingStart() + width;
        float paddingEnd = (seekBar.getPaddingEnd() + r4) - width;
        if (C426750GoL.LIZLLL(this.LIZ)) {
            return paddingEnd;
        }
        return paddingStart;
    }

    public static int LIZ(Long l, Long l2, int i) {
        if (l != null && l.longValue() != 0 && l2 != null) {
            return C814420VxA.LIZIZ((l2.longValue() + ((long) i)) / (l.longValue() + 1));
        }
        return i;
    }
}
