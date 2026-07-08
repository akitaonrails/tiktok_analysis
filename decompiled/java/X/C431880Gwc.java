package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0Gwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431880Gwc extends Drawable {
    public final Integer LIZ;
    public final EnumC431900Gwe LIZIZ;
    public final TextPaint LIZJ;
    public int LIZLLL;
    public String LJ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C431880Gwc() {
        Integer numValueOf = Integer.valueOf(ColorProtector.parseColor("#440066CC"));
        EnumC431900Gwe enumC431900Gwe = EnumC431900Gwe.LEFT_BOTTOM;
        this.LIZ = numValueOf;
        this.LIZIZ = enumC431900Gwe;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(24.0f);
        textPaint.setColor(-65536);
        textPaint.setTextAlign(Paint.Align.LEFT);
        this.LIZJ = textPaint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String str = this.LJ;
        if (str == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        int i = 0;
        if (this.LIZ != null) {
            C786410Ut5.p2(spannableString, new BackgroundColorSpan(this.LIZ.intValue()), 0, str.length(), 33);
        }
        int iMeasureText = ((int) this.LIZJ.measureText(str)) + 1;
        if (iMeasureText < 1) {
            iMeasureText = 1;
        }
        StaticLayout staticLayout = new StaticLayout(spannableString, this.LIZJ, iMeasureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        if (staticLayout.getLineCount() > 0) {
            this.LIZLLL = staticLayout.getHeight();
        }
        canvas.save();
        int i2 = C431890Gwd.LIZ[this.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    int iWidth = getBounds().width() - iMeasureText;
                    if (iWidth >= 0) {
                        i = iWidth;
                    }
                    canvas.translate(i, 0.0f);
                } else {
                    throw new C1954807lC();
                }
            } else {
                canvas.translate(0.0f, 0.0f);
            }
        } else {
            canvas.translate(0.0f, getBounds().height() - this.LIZLLL);
        }
        staticLayout.draw(canvas);
        canvas.restore();
    }
}
