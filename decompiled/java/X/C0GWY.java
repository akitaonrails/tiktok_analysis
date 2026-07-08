package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GWY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWY extends ReplacementSpan {
    public static final /* synthetic */ int LLJJ = 0;
    public final float LL;
    public int LLILLJJLI;
    public final float LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final Context LLIZLLLIL;
    public final float LLJ;
    public final Paint LLJI;
    public final Paint LLJIJIL;
    public final Paint LLJILJIL;
    public final RectF LLJILJILJ;
    public final Bitmap LLJILLL;

    public final void LIZ(Canvas canvas, RectF rectF) {
        int i = this.LLILZIL;
        if (i != -1) {
            this.LLJIJIL.setColor(i);
        } else {
            this.LLJIJIL.setColor(C475630Ikz.LIZIZ(R.attr.ei, this.LLIZLLLIL));
        }
        this.LLJIJIL.setAntiAlias(true);
        this.LLJIJIL.setStyle(Paint.Style.FILL);
        float f = this.LL;
        canvas.drawRoundRect(rectF, f, f, this.LLJIJIL);
    }

    public final void LIZIZ(Canvas canvas, float f, RectF rectF) {
        int i = this.LLIZ;
        if (i != -1) {
            this.LLJI.setColor(i);
        } else {
            this.LLJI.setColor(C475630Ikz.LIZIZ(R.attr.bx, this.LLIZLLLIL));
        }
        Paint.FontMetricsInt fontMetricsInt = this.LLJI.getFontMetricsInt();
        float f2 = rectF.bottom;
        float f3 = f2 - ((f2 - rectF.top) / 2);
        canvas.drawText(this.LLILZLL, f, (f3 + ((r2 - fontMetricsInt.ascent) / 2.0f)) - fontMetricsInt.descent, this.LLJI);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.LLILLJJLI + (4 * this.LLJ));
    }

    public C0GWY(Context context, boolean z, int i, String str, int i2, int i3, int i4, int i5) {
        Context contextN3;
        float fApplyDimension;
        float f;
        float f2;
        float fWidth;
        double dWidth;
        this.LL = 2.0f;
        this.LLILLL = 16.0f;
        this.LLILZIL = -1;
        this.LLIZ = -1;
        Paint paint = new Paint();
        this.LLJI = paint;
        this.LLJIJIL = new Paint();
        this.LLJILJIL = new Paint();
        this.LLJILJILJ = new RectF();
        if (context != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        this.LLIZLLLIL = contextN3;
        if (context != null) {
            fApplyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        } else {
            fApplyDimension = 3.0f;
        }
        this.LLJ = fApplyDimension;
        str = (str == null || str.length() == 0) ? "Sponsored" : str;
        this.LLILZLL = str;
        this.LLILZIL = i;
        this.LLIZ = i2;
        if (i3 > 0) {
            f = i3 * fApplyDimension;
        } else {
            f = fApplyDimension * 16.0f;
        }
        this.LLILLL = f;
        if (i4 > 0) {
            f2 = i4 * fApplyDimension;
        } else {
            f2 = 10.0f * fApplyDimension;
        }
        if (i5 == 1) {
            this.LLJILLL = context != null ? BitmapFactory.decodeResource(context.getResources(), R.drawable.b9z) : null;
        }
        this.LL = 2.0f * fApplyDimension;
        this.LLILZ = z;
        Rect rect = new Rect();
        paint.setTextSize(f2);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        paint.setTypeface(c444890HcV.getTypeface());
        paint.setAntiAlias(true);
        paint.getTextBounds(str, 0, str.length(), rect);
        float f3 = 4 * fApplyDimension;
        Bitmap bitmap = this.LLJILLL;
        if (bitmap == null && i == 0) {
            dWidth = rect.width() + f3;
        } else {
            if (bitmap == null) {
                fWidth = rect.width() + (f3 * 2);
            } else {
                float f4 = 2;
                fWidth = rect.width() + (f3 * f4) + (11.5f * fApplyDimension) + (f4 * fApplyDimension);
            }
            dWidth = fWidth;
        }
        this.LLILLJJLI = (int) (dWidth + (((double) fApplyDimension) * 0.5d));
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        RectF rectF = this.LLJILJILJ;
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f3 = this.LLJ * 0.5f;
        int i6 = fontMetricsInt.descent;
        int i7 = fontMetricsInt.ascent;
        float f4 = this.LLILLL;
        float f5 = 2;
        float f6 = i4 + (((i6 - i7) - f4) / f5) + i7;
        rectF.set(new RectF(f3 + f, f6, this.LLILLJJLI + f + f3, f4 + f6));
        Bitmap bitmap = this.LLJILLL;
        if (bitmap == null && this.LLILZIL == 0) {
            LIZIZ(canvas, f, this.LLJILJILJ);
            return;
        }
        if (bitmap == null) {
            LIZ(canvas, this.LLJILJILJ);
            LIZIZ(canvas, f + (4 * this.LLJ), this.LLJILJILJ);
            return;
        }
        LIZ(canvas, this.LLJILJILJ);
        RectF rectF2 = this.LLJILJILJ;
        float f7 = 4;
        float f8 = this.LLJ;
        float f9 = f7 * f8;
        float f10 = f5 * f8;
        float f11 = rectF2.bottom;
        float f12 = rectF2.top;
        float f13 = (((f11 - f12) - (f10 * f5)) - (8.0f * f8)) / f5;
        float f14 = f12 + f13;
        float f15 = f11 - f13;
        boolean z = this.LLILZ;
        float f16 = rectF2.left;
        if (z) {
            f2 = f16 + f10;
        } else {
            f2 = f16 + f9;
        }
        RectF rectF3 = new RectF(f2, f14, (f8 * 11.5f) + f2, f15);
        Bitmap bitmap2 = this.LLJILLL;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, rectF3, this.LLJILJIL);
        }
        float f18 = this.LLJ;
        LIZIZ(canvas, f + (f7 * f18) + (11.5f * f18) + (f5 * f18), this.LLJILJILJ);
    }
}
