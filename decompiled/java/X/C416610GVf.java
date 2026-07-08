package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416610GVf extends ImageSpan {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public final int LLILZIL;
    public float LLILZLL;

    public C416610GVf(Drawable drawable, int i, int i2, int i3) {
        super(drawable);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZIL = 2 - i3;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.LLILLL != i2 - i && this.LLILZ) {
            return 0;
        }
        int i3 = paint.getFontMetricsInt().bottom - paint.getFontMetricsInt().top;
        double d = ((double) i3) * 0.98d;
        Rect rect = new Rect(0, 0, (int) (((double) getDrawable().getIntrinsicWidth()) * (d / ((double) getDrawable().getIntrinsicHeight()))), (int) d);
        this.LLILZLL = (float) (d * ((double) 0.04f));
        getDrawable().setBounds(rect);
        if (fontMetricsInt != null) {
            float f = ((rect.bottom - rect.top) + 0.0f) / 2;
            float f2 = i3 / 4;
            int iLIZIZ = C814420VxA.LIZIZ(f - f2);
            int i4 = -C814420VxA.LIZIZ(f + f2);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = iLIZIZ;
            fontMetricsInt.descent = iLIZIZ;
        }
        return C814420VxA.LIZIZ(rect.bottom + (this.LLILZLL * 2));
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i2 - i;
        if (this.LLILLL != i6 && this.LLILZ) {
            this.LLILZ = false;
            return;
        }
        getDrawable().setAlpha(Color.alpha(paint.getColor()));
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = this.LLILZLL + f;
        int i7 = fontMetricsInt.ascent;
        float fHeight = i4 + i7 + (((fontMetricsInt.descent - i7) - getDrawable().getBounds().height()) / 2.0f);
        int iSave = canvas.save();
        canvas.translate(f2, fHeight);
        try {
            getDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.LLILLL == i6) {
                this.LLILZ = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
