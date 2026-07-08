package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09nD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476909nD {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(Bitmap bitmap) {
        EnumC2477009nE enumC2477009nE;
        Rect rect;
        try {
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            Point point = new Point(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                enumC2477009nE = EnumC2477009nE.LLILLJJLI;
            } else {
                enumC2477009nE = EnumC2477009nE.LL;
            }
            int i = iMin * 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(new Rect(0, 0, i, i));
            float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-16777216);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            if (enumC2477009nE == EnumC2477009nE.LLILLJJLI) {
                int i2 = point.x;
                rect = new Rect(i2 - iMin, 0, i2 + iMin, i);
            } else {
                int i3 = point.y;
                rect = new Rect(0, i3 - iMin, i, i3 + iMin);
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmap;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
