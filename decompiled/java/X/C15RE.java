package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: X.15RE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15RE extends View {
    public TextPaint LL;
    public Path LLILLJJLI;
    public Paint LLILLL;
    public Paint LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;

    public C15RE(Context context) {
        super(context, null);
        TextPaint textPaint = new TextPaint();
        this.LL = textPaint;
        textPaint.setAntiAlias(true);
        this.LLILLL = new Paint();
        this.LLILLJJLI = new Path();
        Paint paint = this.LLILLL;
        (paint == null ? null : paint).setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LLILZ = paint2;
        paint2.setAntiAlias(true);
        TextPaint textPaint2 = this.LL;
        (textPaint2 != null ? textPaint2 : null).setTypeface(C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (TextUtils.isEmpty(this.LLILZIL)) {
            return;
        }
        TextPaint textPaint = this.LL;
        TextPaint textPaint2 = null;
        if (textPaint == null) {
            textPaint = null;
        }
        int iMeasureText = ((int) textPaint.measureText(this.LLILZIL)) + (this.LLJ * 2);
        Rect rect = new Rect();
        TextPaint textPaint3 = this.LL;
        if (textPaint3 == null) {
            textPaint3 = null;
        }
        String str = this.LLILZIL;
        textPaint3.getTextBounds(str, 0, str.length(), rect);
        int iHeight = rect.height() + (this.LLJ * 2);
        float f = iHeight;
        RectF rectF = new RectF(this.LLJI, 0.0f, r0 + iMeasureText, f);
        int i = this.LLJI;
        float f2 = i;
        float f3 = i;
        Paint paint = this.LLILLL;
        if (paint == null) {
            paint = null;
        }
        canvas.drawRoundRect(rectF, f2, f3, paint);
        Path path = this.LLILLJJLI;
        if (path == null) {
            path = null;
        }
        path.moveTo(this.LLIZLLLIL + this.LLILZLL + this.LLJI, f);
        Path path2 = this.LLILLJJLI;
        if (path2 == null) {
            path2 = null;
        }
        path2.lineTo(this.LLIZLLLIL + (this.LLILZLL / 2) + this.LLJI, this.LLIZ + iHeight);
        Path path3 = this.LLILLJJLI;
        if (path3 == null) {
            path3 = null;
        }
        path3.lineTo(this.LLIZLLLIL + this.LLJI, f);
        Path path4 = this.LLILLJJLI;
        if (path4 == null) {
            path4 = null;
        }
        Paint paint2 = this.LLILZ;
        if (paint2 == null) {
            paint2 = null;
        }
        canvas.drawPath(path4, paint2);
        String str2 = this.LLILZIL;
        int length = str2.length();
        float f4 = this.LLJI + this.LLJ;
        float f5 = (iHeight - r1) - 4;
        TextPaint textPaint4 = this.LL;
        if (textPaint4 != null) {
            textPaint2 = textPaint4;
        }
        canvas.drawText(str2, 0, length, f4, f5, (Paint) textPaint2);
    }

    public final void setAttribute(C15RD c15rd) {
        this.LLJILJIL = c15rd.LJI;
        int i = c15rd.LJII;
        this.LLJILJILJ = i;
        this.LLJI = c15rd.LJ;
        this.LLJ = c15rd.LIZLLL;
        this.LLILZLL = c15rd.LIZ;
        this.LLIZ = c15rd.LIZIZ;
        this.LLIZLLLIL = c15rd.LIZJ;
        this.LLJILLL = c15rd.LJIIIIZZ;
        Paint paint = this.LLILLL;
        Paint paint2 = null;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
        Paint paint3 = this.LLILZ;
        if (paint3 == null) {
            paint3 = null;
        }
        paint3.setColor(this.LLJILJILJ);
        TextPaint textPaint = this.LL;
        if (textPaint == null) {
            textPaint = null;
        }
        textPaint.setColor(this.LLJILJIL);
        TextPaint textPaint2 = this.LL;
        if (textPaint2 == null) {
            textPaint2 = null;
        }
        textPaint2.setTextSize(this.LLJILLL);
        this.LLJIJIL = c15rd.LJFF;
        Paint paint4 = this.LLILZ;
        if (paint4 != null) {
            paint2 = paint4;
        }
        paint2.setPathEffect(new CornerPathEffect(this.LLJIJIL));
        invalidate();
    }

    public final void setBgColor(int i) {
        Paint paint = this.LLILLL;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setText(String str) {
        this.LLILZIL = str;
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.LL;
        if (textPaint == null) {
            textPaint = null;
        }
        textPaint.setColor(i);
        invalidate();
    }

    public final void setTextSize(int i) {
        TextPaint textPaint = this.LL;
        if (textPaint == null) {
            textPaint = null;
        }
        textPaint.setTextSize(i);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.LLILZIL)) {
            setMeasuredDimension(0, 0);
            return;
        }
        TextPaint textPaint = this.LL;
        TextPaint textPaint2 = null;
        if (textPaint == null) {
            textPaint = null;
        }
        int iMeasureText = ((int) textPaint.measureText(this.LLILZIL)) + (this.LLJ * 2) + (this.LLJI * 2);
        Rect rect = new Rect();
        TextPaint textPaint3 = this.LL;
        if (textPaint3 != null) {
            textPaint2 = textPaint3;
        }
        String str = this.LLILZIL;
        textPaint2.getTextBounds(str, 0, str.length(), rect);
        setMeasuredDimension(iMeasureText, rect.height() + (this.LLJ * 2) + this.LLIZ);
    }
}
