package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: X.0kN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316790kN3 extends MetricAffectingSpan {
    public final int LL;
    public int LLILLJJLI;
    public float LLILLL;
    public boolean LLILZ;

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    public final int hashCode() {
        return this.LL + 31;
    }

    public C1316790kN3(int i) {
        this.LL = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316790kN3) || this.LL != ((C1316790kN3) obj).LL) {
            return false;
        }
        return true;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z = this.LLILZ;
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        float f = this.LLILLL;
        DecimalFormat decimalFormat = C1316710kMv.LIZ;
        if (z) {
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(f);
            textPaint.setColor(i2);
            textPaint.bgColor = 0;
            return;
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(i);
    }
}
