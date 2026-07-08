package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0GWR, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWR extends ReplacementSpan {
    public final Context LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;
    public final float LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public Paint LLJILJILJ;
    public Paint LLJILLL;
    public WeakReference<Drawable> LLJJ;
    public float LLJJI;

    public final Drawable LIZ() {
        Drawable drawableLIZIZ;
        WeakReference<Drawable> weakReference = this.LLJJ;
        if (weakReference == null || (drawableLIZIZ = weakReference.get()) == null) {
            drawableLIZIZ = C800330VaR.LIZIZ(this.LL, this.LLILZ);
            if (drawableLIZIZ == null) {
                drawableLIZIZ = new ColorDrawable();
            }
            this.LLJJ = new WeakReference<>(drawableLIZIZ);
        }
        return drawableLIZIZ;
    }

    public final void LIZIZ() {
        if (!TextUtils.isEmpty(this.LLILLJJLI) && this.LLJILLL == null) {
            this.LLJILLL = new TextPaint();
            try {
                if (TextUtils.isEmpty(this.LLILLL)) {
                    this.LLJILLL.setColor(this.LLIZ);
                } else {
                    this.LLJILLL.setColor(Color.parseColor(this.LLILLL));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJILLL.setColor(this.LLIZ);
            }
            this.LLJILLL.setTextSize(this.LLJILJIL);
            this.LLJILLL.setAntiAlias(true);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) this.LLIZLLLIL;
    }

    public C0GWR(int i, int i2, int i3, Context context, String str, String str2, String str3, String str4) {
        float fWidth;
        Context contextN3 = C786410Ut5.N3(context);
        this.LL = contextN3;
        this.LLIZ = ColorProtector.parseColor("#FACE15");
        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, contextN3.getResources().getDisplayMetrics());
        this.LLJIJIL = fApplyDimension;
        this.LLJILJIL = i2 * fApplyDimension;
        this.LLJ = i3 * fApplyDimension;
        this.LLJI = 2 * fApplyDimension;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        if (TextUtils.isEmpty(str)) {
            fWidth = 0.0f;
        } else {
            LIZIZ();
            this.LLJILLL.getTextBounds(str, 0, str.length(), new Rect());
            fWidth = r3.width() + (4 * fApplyDimension * 3) + LIZ().getIntrinsicWidth();
        }
        this.LLIZLLLIL = fWidth;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        BitmapDrawable bitmapDrawable;
        int color;
        String str;
        if (!TextUtils.isEmpty(this.LLILZLL) && this.LLJILJILJ == null) {
            Paint paint2 = new Paint();
            this.LLJILJILJ = paint2;
            try {
                paint2.setColor(Color.parseColor(this.LLILZLL));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJILJILJ.setColor(-1);
            }
            this.LLJILJILJ.setStyle(Paint.Style.FILL);
            this.LLJILJILJ.setAntiAlias(true);
        }
        LIZIZ();
        Paint paint3 = this.LLJILLL;
        if (paint3 != null && this.LLJILJILJ != null) {
            Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
            float f2 = i4;
            float f3 = fontMetrics.ascent + f2;
            float f4 = f2 + fontMetrics.descent;
            float fMin = Math.min(Math.min(f3, canvas.getHeight() - f4), (this.LLJ - (f4 - f3)) * 0.5f);
            float f5 = 1 * this.LLJIJIL;
            RectF rectF = new RectF(f, (f3 - fMin) - f5, this.LLIZLLLIL + f, (f4 + fMin) - f5);
            float f6 = this.LLJI;
            Paint paint4 = this.LLJILJILJ;
            if (paint4 != null) {
                canvas.drawRoundRect(rectF, f6, f6, paint4);
            }
        }
        float f7 = i4;
        if (this.LLJILLL != null && (str = this.LLILLJJLI) != null) {
            float intrinsicWidth = (6 * this.LLJIJIL) + f + LIZ().getIntrinsicWidth();
            float f8 = f7 - (1 * this.LLJIJIL);
            Paint paint5 = this.LLJILLL;
            if (paint5 != null) {
                canvas.drawText(str, intrinsicWidth, f8, paint5);
            }
        }
        Drawable drawableLIZ = LIZ();
        if ((drawableLIZ instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawableLIZ) != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint6 = new Paint();
            try {
                if (TextUtils.isEmpty(this.LLILZIL)) {
                    color = this.LLIZ;
                } else {
                    color = Color.parseColor(this.LLILZIL);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                color = this.LLIZ;
            }
            paint6.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
            paint6.setAntiAlias(true);
            canvas.drawBitmap(bitmap, f + C12ES.LIZJ(4.0f, this.LL), (i4 - bitmapDrawable.getMinimumHeight()) + C12ES.LIZJ(1.0f, this.LL) + this.LLJJI, paint6);
        }
    }
}
