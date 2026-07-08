package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0GVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416770GVv extends C416760GVu {
    public int LLILLL;
    public int LLILZ;
    public final float[] LLILZIL;
    public float LLILZLL;
    public final RectF LLIZ;
    public final Shader LLIZLLLIL;
    public final Matrix LLJ;

    public C416770GVv(Drawable drawable) {
        super(drawable);
        this.LLILZIL = new float[8];
        Path path = new Path();
        Paint paint = new Paint(1);
        this.LLIZ = new RectF();
        this.LLJ = new Matrix();
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(paint2.getStrokeWidth());
        paint2.setColor(-1);
        new RectF();
        path.setFillType(Path.FillType.INVERSE_WINDING);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), bitmapDrawable.getBounds().width(), bitmapDrawable.getBounds().height(), true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.LLIZLLLIL = new BitmapShader(bitmapCreateScaledBitmap, tileMode, tileMode);
        }
    }

    public final void LIZIZ(float f) {
        this.LLILZLL = f;
        float[] fArr = this.LLILZIL;
        Arrays.fill(fArr, 0, fArr.length, f);
        if (getDrawable() instanceof GradientDrawable) {
            ((GradientDrawable) getDrawable()).setCornerRadius(f);
        }
    }

    @Override // X.C416760GVu, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.LLILLL + this.LLILZ;
    }

    @Override // X.C416760GVu, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        boolean zLJJ = C497740JfY.LJJ();
        boolean z2 = true;
        if (this.LLILLL > 0 && zLJJ) {
            canvas.save();
            canvas.translate(this.LLILLL, 0.0f);
            z = true;
        } else {
            z = false;
        }
        if (this.LLILZ > 0 && !zLJJ) {
            canvas.save();
            canvas.translate(this.LLILZ, 0.0f);
        } else {
            z2 = z;
        }
        float fLIZ = C416760GVu.LIZ(i4, paint.getFontMetricsInt(), getDrawable());
        if (!(getDrawable() instanceof BitmapDrawable) || this.LLILZLL <= 0.0f) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
        if (this.LLILZLL > 0.0f) {
            this.LLIZ.set(f, fLIZ, getDrawable().getBounds().width() + f, getDrawable().getBounds().height() + fLIZ);
            if (getDrawable() instanceof BitmapDrawable) {
                Shader shader = this.LLIZLLLIL;
                if (shader != null) {
                    shader.getLocalMatrix(this.LLJ);
                    this.LLJ.setTranslate(f, fLIZ);
                    shader.setLocalMatrix(this.LLJ);
                }
                paint.setShader(this.LLIZLLLIL);
                RectF rectF = this.LLIZ;
                float f2 = this.LLILZLL;
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }
}
