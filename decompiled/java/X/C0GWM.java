package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0GWM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWM extends DynamicDrawableSpan {
    public final Context LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final Integer LLIZ;
    public WeakReference<Drawable> LLIZLLLIL;

    @Override // android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.LL, this.LLILLJJLI);
        if (drawableLIZIZ == null) {
            return null;
        }
        drawableLIZIZ.setBounds(0, 0, drawableLIZIZ.getIntrinsicWidth(), drawableLIZIZ.getIntrinsicHeight());
        Integer num = this.LLIZ;
        if (num != null) {
            drawableLIZIZ.setTint(num.intValue());
        }
        return drawableLIZIZ;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.LLIZLLLIL;
        if (weakReference == null || (drawable = weakReference.get()) == null) {
            drawable = getDrawable();
            this.LLIZLLLIL = new WeakReference<>(drawable);
        }
        if (drawable == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right + this.LLILZ + this.LLILZIL;
    }

    public /* synthetic */ C0GWM(Context context, int i, int i2, int i3, int i4, boolean z) {
        this(context, i, i2, i3, i4, z, null);
    }

    public C0GWM(Context context, int i, int i2, int i3, int i4, boolean z, Integer num) {
        super(i4);
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = 1;
        this.LLILZLL = z;
        this.LLIZ = num;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable;
        int i6;
        WeakReference<Drawable> weakReference = this.LLIZLLLIL;
        if (weakReference == null || (drawable = weakReference.get()) == null) {
            drawable = getDrawable();
            this.LLIZLLLIL = new WeakReference<>(drawable);
            if (drawable == null) {
                return;
            }
        }
        canvas.save();
        int iHeight = i5 - drawable.getBounds().bottom;
        int i7 = ((DynamicDrawableSpan) this).mVerticalAlignment;
        if (i7 == 1) {
            iHeight -= paint.getFontMetricsInt().descent;
        } else if (i7 == 2) {
            iHeight = (i3 + ((i5 - i3) / 2)) - (drawable.getBounds().height() / 2);
        }
        canvas.translate(f + this.LLILZIL, iHeight - this.LLILLL);
        if (this.LLILZLL) {
            i6 = 255;
        } else {
            i6 = 127;
        }
        drawable.setAlpha(i6);
        drawable.draw(canvas);
        canvas.restore();
    }
}
