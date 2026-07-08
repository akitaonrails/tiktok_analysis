package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331470kkj extends AbstractC1331460kki {
    public final Paint LLJLIL;
    public final Paint LLJLILLLLZIIL;
    public final Bitmap LLJLL;
    public WeakReference<Bitmap> LLJLLIL;

    public final boolean LIZJ() {
        return (this.LLILLJJLI || this.LLILLL || this.LLILZ > 0.0f) && this.LLJLL != null;
    }

    @Override // X.AbstractC1331460kki, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.LLJLL;
        return bitmap != null ? bitmap.getHeight() : super.getIntrinsicHeight();
    }

    @Override // X.AbstractC1331460kki, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.LLJLL;
        return bitmap != null ? bitmap.getWidth() : super.getIntrinsicWidth();
    }

    @Override // X.AbstractC1331460kki, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1336010ks3.LIZIZ();
        if (!LIZJ()) {
            super.draw(canvas);
            C1336010ks3.LIZIZ();
            return;
        }
        LIZIZ();
        LIZ();
        WeakReference<Bitmap> weakReference = this.LLJLLIL;
        if (weakReference == null || weakReference.get() != this.LLJLL) {
            this.LLJLLIL = new WeakReference<>(this.LLJLL);
            this.LLJLIL.setFilterBitmap(true);
            Paint paint = this.LLJLIL;
            Bitmap bitmap = this.LLJLL;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.LLILZLL = true;
        }
        if (this.LLILZLL) {
            this.LLJLIL.getShader().setLocalMatrix(this.LLJJJJJIL);
            this.LLILZLL = false;
        }
        int iSave = canvas.save();
        canvas.concat(this.LLJJJ);
        canvas.drawPath(this.LLILZIL, this.LLJLIL);
        float f = this.LLILZ;
        if (f > 0.0f) {
            this.LLJLILLLLZIIL.setStrokeWidth(f);
            this.LLJLILLLLZIIL.setColor(C1331180kkG.LIZIZ(this.LLIZ, this.LLJLIL.getAlpha()));
            canvas.drawPath(this.LLIZLLLIL, this.LLJLILLLLZIIL);
        }
        canvas.restoreToCount(iSave);
        C1336010ks3.LIZIZ();
    }

    @Override // X.AbstractC1331460kki, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.LLJLIL.getAlpha()) {
            this.LLJLIL.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // X.AbstractC1331460kki, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.LLJLIL.setColorFilter(colorFilter);
    }

    public C1331470kkj(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.LLJLIL = paint2;
        Paint paint3 = new Paint(1);
        this.LLJLILLLLZIIL = paint3;
        this.LLJLL = bitmap;
        if (Build.VERSION.SDK_INT >= 24 && (this.LL instanceof BitmapDrawable) && bitmap != null) {
            int density = bitmap.getDensity();
            int i = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (density == i) {
                ((BitmapDrawable) this.LL).setTargetDensity(i);
            }
        }
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }
}
