package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GZW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZW extends C19R6 {
    public boolean LLJILJILJ;
    public float LLJILLL;
    public boolean LLJJ;
    public final Paint LLJJI;
    public Bitmap LLJJIII;

    public final void LJI() {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            LJII();
            return;
        }
        Bitmap bitmap = this.LLJJIII;
        if (bitmap == null || bitmap.getWidth() != width || bitmap.getHeight() != height) {
            Bitmap bitmap2 = this.LLJJIII;
            if (bitmap2 != null) {
                bitmap2.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap2);
            }
            this.LLJJIII = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = this.LLJJIII;
        if (bitmap3 == null) {
            return;
        }
        Canvas canvas = new Canvas(bitmap3);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        float f = height;
        float f2 = this.LLJILLL * f;
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f3 = width;
        canvas.drawRect(0.0f, 0.0f, f3, f2, paint);
        Paint paint2 = new Paint(1);
        paint2.setShader(new LinearGradient(0.0f, f2, 0.0f, f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, f2, f3, f, paint2);
    }

    public final void LJII() {
        Bitmap bitmap = this.LLJJIII;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLJJIII = null;
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.LLJILJILJ || this.LLJJIII != null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        LJI();
        invalidate();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJII();
        C20597815iq.LIZ(this);
    }

    public final float getFadeStartPercent() {
        return this.LLJILLL;
    }

    public final boolean getMaskEnabled() {
        return this.LLJILJILJ;
    }

    public final boolean getReleaseMaskOnDisable() {
        return this.LLJJ;
    }

    public static void LJIIIIZZ(C0GZW c0gzw) {
        c0gzw.setImageDrawable(null);
        c0gzw.LJII();
        c0gzw.setMaskEnabled(false);
        c0gzw.invalidate();
    }

    public final void LIZLLL(boolean z) {
        setMaskEnabled(z);
        float fLIZLLL = C13LZ.LIZLLL(0.5f, 0.0f, 1.0f);
        if (this.LLJILLL == fLIZLLL) {
            if (z && this.LLJJIII == null && getWidth() > 0 && getHeight() > 0) {
                LJI();
                invalidate();
                return;
            }
            return;
        }
        setFadeStartPercent(fLIZLLL);
    }

    @Override // X.C19R6, X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (this.LLJILJILJ && this.LLJJIII != null) {
                int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                super.onDraw(canvas);
                Bitmap bitmap = this.LLJJIII;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.LLJJI);
                }
                canvas.restoreToCount(iSaveLayer);
                return;
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setFadeStartPercent(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (this.LLJILLL == fLIZLLL) {
            return;
        }
        this.LLJILLL = fLIZLLL;
        LJI();
        invalidate();
    }

    public final void setMaskEnabled(boolean z) {
        if (this.LLJILJILJ == z) {
            return;
        }
        this.LLJILJILJ = z;
        if (!z && this.LLJJ) {
            LJII();
        }
        invalidate();
    }

    public final void setReleaseMaskOnDisable(boolean z) {
        this.LLJJ = z;
    }

    public C0GZW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // X.C1322090kVb, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.LLJILJILJ && this.LLJJIII == null && getWidth() > 0 && getHeight() > 0) {
            LJI();
            invalidate();
        }
    }

    public C0GZW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILJILJ = true;
        this.LLJILLL = 0.5f;
        Paint paint = new Paint(1);
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(BlendMode.DST_IN);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.LLJJI = paint;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setWillNotDraw(false);
    }

    @Override // X.C19R6, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLJILJILJ) {
            LJI();
            invalidate();
        }
    }
}
