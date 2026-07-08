package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0f63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114050f63 extends ClickableSpan implements InterfaceC1114080f66 {
    public final Context LL;
    public final C1114060f64 LLILLJJLI;
    public final Function1<C1114050f63, Unit> LLILLL;
    public long LLILZIL;
    public float LLILZ = 1.0f;
    public final C1114040f62 LLILZLL = new ReplacementSpan() { // from class: X.0f62
        public float LL;
        public float LLILLJJLI;
        public final Rect LLILLL = new Rect();
        public final RectF LLILZ = new RectF();
        public final Paint LLILZIL;
        public final TextPaint LLILZLL;

        {
            Paint paint = new Paint(1);
            paint.setColor(this.LLIZ.LLILLJJLI.LJIIJJI);
            paint.setStyle(Paint.Style.FILL);
            this.LLILZIL = paint;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(this.LLIZ.LLILLJJLI.LJII);
            textPaint.setTextSize(this.LLIZ.LLILLJJLI.LJFF);
            C1119920fFW.LJII(this.LLIZ.LL, textPaint, 500);
            this.LLILZLL = textPaint;
        }

        @Override // android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            int width;
            double dCeil;
            int i3;
            String str = this.LLIZ.LLILLJJLI.LJ;
            int height = 0;
            if (str != null && str.length() > 0) {
                this.LLILZLL.getTextBounds(str, 0, str.length(), this.LLILLL);
            }
            C1114060f64 c1114060f64 = this.LLIZ.LLILLJJLI;
            C20743516Fd c20743516Fd = c1114060f64.LIZLLL;
            if (c20743516Fd != null) {
                width = c20743516Fd.getIntrinsicWidth();
            } else {
                Bitmap bitmap = c1114060f64.LIZJ;
                if (bitmap != null) {
                    width = bitmap.getWidth();
                } else {
                    width = 0;
                }
            }
            C20743516Fd c20743516Fd2 = c1114060f64.LIZLLL;
            if (c20743516Fd2 != null) {
                height = c20743516Fd2.getIntrinsicHeight();
            } else {
                Bitmap bitmap2 = c1114060f64.LIZJ;
                if (bitmap2 != null) {
                    height = bitmap2.getHeight();
                }
            }
            this.LL = c1114060f64.LJIILIIL + c1114060f64.LJIILJJIL + width + c1114060f64.LJIIZILJ + this.LLILLL.width() + r5.LLILLJJLI.LJIILLIIL;
            float fMax = Math.max(height, this.LLILLL.height());
            float f = c1114060f64.LJI;
            if (f <= 0.0f) {
                f = (c1114060f64.LJIILL * 2) + fMax;
            }
            this.LLILLJJLI = f;
            C1114050f63 c1114050f63 = this.LLIZ;
            C20743516Fd c20743516Fd3 = c1114050f63.LLILLJJLI.LIZLLL;
            if (c20743516Fd3 != null) {
                Rect bounds = c20743516Fd3.getBounds();
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt2 = this.LLILZLL.getFontMetricsInt();
                    C1114060f64 c1114060f642 = c1114050f63.LLILLJJLI;
                    float f2 = c1114060f642.LJI;
                    if (f2 > 0.0f) {
                        i3 = (int) f2;
                    } else {
                        i3 = ((int) (c1114060f642.LJIILL * 2)) + (bounds.bottom - bounds.top);
                    }
                    int i4 = i3 / 2;
                    int i5 = fontMetricsInt2.bottom;
                    int i6 = fontMetricsInt2.top;
                    int i7 = i4 - ((i5 - i6) / 4);
                    int i8 = -(i4 + ((i5 - i6) / 4));
                    fontMetricsInt.ascent = i8;
                    fontMetricsInt.top = i8;
                    fontMetricsInt.bottom = i7;
                    fontMetricsInt.descent = i7;
                }
                dCeil = Math.ceil(this.LL);
            } else {
                if (fontMetricsInt != null) {
                    Paint.FontMetricsInt fontMetricsInt3 = this.LLILZLL.getFontMetricsInt();
                    fontMetricsInt.ascent = fontMetricsInt3.ascent;
                    fontMetricsInt.descent = fontMetricsInt3.descent;
                    fontMetricsInt.top = fontMetricsInt3.top;
                    fontMetricsInt.bottom = fontMetricsInt3.bottom;
                }
                dCeil = Math.ceil(this.LL);
            }
            return (int) dCeil;
        }

        @Override // android.text.style.ReplacementSpan
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            float f2 = f;
            C1114050f63 c1114050f63 = this.LLIZ;
            int i6 = (int) (c1114050f63.LLILZ * 255);
            C1114060f64 c1114060f64 = c1114050f63.LLILLJJLI;
            if (c1114060f64.LIZIZ) {
                f2 += c1114060f64.LJIILLIIL;
            }
            this.LLILZIL.setAlpha((int) (Color.alpha(c1114060f64.LJIIJJI) * c1114050f63.LLILZ));
            float f3 = this.LLILLJJLI;
            float f4 = 2;
            float f5 = i3 + (((i5 - i3) - f3) / f4);
            this.LLILZ.set(f2, f5, (this.LL + f2) - c1114050f63.LLILLJJLI.LJIILLIIL, f3 + f5);
            RectF rectF = this.LLILZ;
            float f6 = c1114060f64.LJIIL;
            canvas.drawRoundRect(rectF, f6, f6, this.LLILZIL);
            float f7 = f2 + c1114060f64.LJIILIIL;
            C20743516Fd c20743516Fd = c1114060f64.LIZLLL;
            if (c20743516Fd != null) {
                float intrinsicHeight = ((this.LLILLJJLI - c20743516Fd.getIntrinsicHeight()) / f4) + f5;
                c20743516Fd.setBounds((int) f7, (int) intrinsicHeight, (int) (c20743516Fd.getIntrinsicWidth() + f7), (int) (intrinsicHeight + c20743516Fd.getIntrinsicHeight()));
                c20743516Fd.setAlpha(i6);
                c20743516Fd.draw(canvas);
            } else {
                Bitmap bitmap = c1114060f64.LIZJ;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (alpha * c1114050f63.LLILZ));
                    canvas.drawBitmap(bitmap, f7, ((this.LLILLJJLI - bitmap.getHeight()) / f4) + f5, paint);
                    paint.setAlpha(alpha);
                }
            }
            String str = c1114060f64.LJ;
            if (str != null) {
                int width = 0;
                if (str.length() > 0) {
                    this.LLILZLL.setColor(Color.argb((int) (Color.alpha(c1114060f64.LJII) * c1114050f63.LLILZ), Color.red(c1114060f64.LJII), Color.green(c1114060f64.LJII), Color.blue(c1114060f64.LJII)));
                    C20743516Fd c20743516Fd2 = c1114060f64.LIZLLL;
                    if (c20743516Fd2 != null) {
                        width = c20743516Fd2.getIntrinsicWidth();
                    } else {
                        Bitmap bitmap2 = c1114060f64.LIZJ;
                        if (bitmap2 != null) {
                            width = bitmap2.getWidth();
                        }
                    }
                    canvas.drawText(str, f7 + width + c1114060f64.LJIIZILJ, (f5 + ((this.LLILLJJLI - this.LLILLL.height()) / f4)) - this.LLILLL.top, this.LLILZLL);
                }
            }
        }
    };

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // X.InterfaceC1114080f66
    public final void LIZ(TextView textView) {
        SpannableString spannableString;
        C1114060f64 c1114060f64 = this.LLILLJJLI;
        Bitmap bitmap = c1114060f64.LIZJ;
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        c1114060f64.LIZJ = null;
        c1114060f64.LIZLLL = null;
        CharSequence text = textView.getText();
        if ((text instanceof SpannableString) && (spannableString = (SpannableString) text) != null) {
            int spanStart = spannableString.getSpanStart(this) - 1;
            int spanEnd = spannableString.getSpanEnd(this);
            if (spanStart >= 0 && spanEnd >= 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
                spannableStringBuilder.removeSpan(this);
                spannableStringBuilder.delete(spanStart, spanEnd);
                textView.setText(spannableStringBuilder);
            }
        }
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean z;
        Function1<C1114050f63, Unit> function1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLILZIL < 800) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = jCurrentTimeMillis;
        if (!z && (function1 = this.LLILLL) != null) {
            function1.invoke(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0f62] */
    public C1114050f63(Context context, C1114060f64 c1114060f64, AwS383S0200000_17 awS383S0200000_17) {
        this.LL = context;
        this.LLILLJJLI = c1114060f64;
        this.LLILLL = awS383S0200000_17;
    }
}
