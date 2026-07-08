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
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Gx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432140Gx2 extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public final TextPaint LIZJ;
    public final Map<EnumC432150Gx3, String> LIZLLL;
    public int LJ;

    public C432140Gx2() {
        this(0);
    }

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

    public C432140Gx2(int i) {
        int color = ColorProtector.parseColor("#440066CC");
        int color2 = ColorProtector.parseColor("#44cc7700");
        this.LIZ = color;
        this.LIZIZ = color2;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(24.0f);
        textPaint.setColor(-16777216);
        this.LIZJ = textPaint;
        this.LIZLLL = new LinkedHashMap();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        BackgroundColorSpan backgroundColorSpan;
        float f;
        float fHeight;
        int i;
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            String str = (String) entry.getValue();
            EnumC432150Gx3 enumC432150Gx3 = (EnumC432150Gx3) entry.getKey();
            SpannableString spannableString = new SpannableString(str);
            EnumC432150Gx3 enumC432150Gx32 = EnumC432150Gx3.LEFT_BOTTOM;
            if (enumC432150Gx3 != enumC432150Gx32 && enumC432150Gx3 != EnumC432150Gx3.RIGHT_BOTTOM) {
                backgroundColorSpan = new BackgroundColorSpan(this.LIZIZ);
            } else {
                backgroundColorSpan = new BackgroundColorSpan(this.LIZ);
            }
            C786410Ut5.p2(spannableString, backgroundColorSpan, 0, str.length(), 33);
            StaticLayout staticLayout = new StaticLayout(spannableString, this.LIZJ, getBounds().width(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (staticLayout.getLineCount() > 0) {
                this.LJ = staticLayout.getHeight();
                staticLayout.getWidth();
            }
            canvas.save();
            if (enumC432150Gx3 != enumC432150Gx32 && enumC432150Gx3 != EnumC432150Gx3.LEFT_TOP) {
                this.LIZJ.setTextAlign(Paint.Align.RIGHT);
            } else {
                this.LIZJ.setTextAlign(Paint.Align.LEFT);
            }
            int i2 = C432160Gx4.LIZ[enumC432150Gx3.ordinal()];
            float fWidth = 0.0f;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        fHeight = getBounds().height();
                        i = this.LJ;
                    } else {
                        fWidth = getBounds().width() - this.LJ;
                        fHeight = getBounds().height();
                        i = this.LJ;
                    }
                    f = fHeight - i;
                } else {
                    fWidth = getBounds().width() - this.LJ;
                    f = 0.0f;
                }
            } else {
                f = 0.0f;
            }
            canvas.translate(fWidth, f);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }
}
