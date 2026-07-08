package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: X.0Gvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC431450Gvv extends ClickableSpan {
    public boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.LL) {
            i = this.LLILLL;
        } else {
            i = this.LLILLJJLI;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public AbstractC431450Gvv(int i, int i2) {
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
