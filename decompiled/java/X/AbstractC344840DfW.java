package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: X.0DfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC344840DfW extends ClickableSpan {
    public final int LL;
    public final int LLILLJJLI;
    public boolean LLILLL;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.LLILLL) {
            i = this.LLILLJJLI;
        } else {
            i = this.LL;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public AbstractC344840DfW(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
