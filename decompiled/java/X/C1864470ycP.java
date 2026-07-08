package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: X.0ycP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864470ycP extends ClickableSpan {
    public final int $t;
    public Object l1;
    public String s0;

    public static final void updateDrawState$2(C1864470ycP c1864470ycP, TextPaint textPaint) {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
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
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C1864470ycP c1864470ycP, View view) {
        ((InterfaceC1802940x1A) c1864470ycP.l1).LIZ(c1864470ycP.s0);
    }

    public static final void onClick$1(C1864470ycP c1864470ycP, View view) {
        ((InterfaceC1802940x1A) c1864470ycP.l1).LIZ(c1864470ycP.s0);
    }

    public static final void onClick$2(C1864470ycP c1864470ycP, View view) {
        ((InterfaceC1807460x8S) c1864470ycP.l1).LIZ(c1864470ycP.s0);
    }

    public static final void updateDrawState$0(C1864470ycP c1864470ycP, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C1864470ycP c1864470ycP, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C1864470ycP(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
