package X;

import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: X.0kN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316800kN4 extends MetricAffectingSpan {
    public final Rect LL = new Rect();
    public final AbstractC1315160kKQ LLILLJJLI;

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    public C1316800kN4(AbstractC1315160kKQ abstractC1315160kKQ) {
        this.LLILLJJLI = abstractC1315160kKQ;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.LL.width() != 0 && this.LL.height() != 0) {
            this.LLILLJJLI.setBounds(this.LL);
            textPaint.setShader(this.LLILLJJLI.LLILLJJLI);
        }
    }
}
