package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521540Kcq extends ClickableSpan {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C521540Kcq c521540Kcq, View view) {
        ((Function0) c521540Kcq.l0).invoke();
    }

    public static final void onClick$1(C521540Kcq c521540Kcq, View view) {
        ((Function0) c521540Kcq.l0).invoke();
    }

    public static final void updateDrawState$0(C521540Kcq c521540Kcq, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c521540Kcq.i1);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C521540Kcq c521540Kcq, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c521540Kcq.i1);
        textPaint.setUnderlineText(false);
    }

    public C521540Kcq(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
