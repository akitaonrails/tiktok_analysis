package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0g0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149240g0o {
    public static final WeakHashMap<C1149250g0p, Bitmap> LIZ = new WeakHashMap<>();
    public static WeakReference<Bitmap> LIZIZ;

    static {
        new Random();
    }

    public static Bitmap LIZ(Context context, final int i, final int i2, final int i3) {
        Bitmap bitmapCreateBitmap;
        Object obj = new Object(i, i2, i3) { // from class: X.0g0p
            public final int LIZ;
            public final int LIZIZ;
            public final int LIZJ;
            public final int LIZLLL = -1;

            public final int hashCode() {
                return ((((((629 + this.LIZ) * 37) + this.LIZIZ) * 37) + this.LIZJ) * 37) + this.LIZLLL;
            }

            public final boolean equals(Object obj2) {
                if (obj2 == null || !(obj2 instanceof C1149250g0p)) {
                    return false;
                }
                C1149250g0p c1149250g0p = (C1149250g0p) obj2;
                if (this.LIZIZ != c1149250g0p.LIZIZ || this.LIZJ != c1149250g0p.LIZJ || this.LIZ != c1149250g0p.LIZ || this.LIZLLL != c1149250g0p.LIZLLL) {
                    return false;
                }
                return true;
            }

            {
                this.LIZIZ = i2;
                this.LIZJ = i3;
                this.LIZ = i;
            }
        };
        Bitmap bitmap = LIZ.get(obj);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        context.getResources();
        WeakReference<Bitmap> weakReference = LIZIZ;
        if (weakReference != null) {
            bitmapCreateBitmap = weakReference.get();
            if (bitmapCreateBitmap == null || ((bitmapCreateBitmap.getWidth() == i2 && bitmapCreateBitmap.getHeight() == i3) || bitmapCreateBitmap.isRecycled())) {
                LIZIZ = null;
                bitmapCreateBitmap = null;
            }
        } else {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dus, context);
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setBounds(0, 0, i2, i3);
                bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                c20743516FdLIZLLL.draw(new Canvas(bitmapCreateBitmap));
                if (bitmapCreateBitmap != null) {
                    if (LIZIZ == null) {
                        LIZIZ = new WeakReference<>(bitmapCreateBitmap);
                    }
                }
            }
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i3, false);
        if (bitmapCreateScaledBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmapCreateScaledBitmap);
        Paint paint = new Paint(3);
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
        LIZ.put((C1149250g0p) obj, bitmapCreateScaledBitmap);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
        }
        return bitmapCreateScaledBitmap;
    }
}
