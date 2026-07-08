package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ImageSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0GVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416560GVa extends ImageSpan {
    public final int LL;
    public final int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C416560GVa(TuxIconDrawable tuxIconDrawable, int i, int i2) {
        super(tuxIconDrawable, 1);
        i = (i2 & 2) != 0 ? 0 : i;
        this.LL = i;
        this.LLILLJJLI = 0;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int iHeight = bounds.height() / 2;
            int i6 = i5 - iHeight;
            fontMetricsInt.ascent = i6;
            int i7 = i5 + iHeight;
            fontMetricsInt.descent = i7;
            fontMetricsInt.top = i6;
            fontMetricsInt.bottom = i7;
        }
        return bounds.right + this.LL + this.LLILLJJLI;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float fHeight = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (getDrawable().getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(f + this.LL, fHeight);
        try {
            getDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }
}
