package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C511501yz extends ClickableSpan {
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

    public static final void onClick$0(C511501yz c511501yz, View view) {
        ((Function0) c511501yz.l0).invoke();
    }

    public static final void onClick$1(C511501yz c511501yz, View view) {
        ((Function0) c511501yz.l0).invoke();
    }

    public static final void onClick$2(C511501yz c511501yz, View view) {
        ((Function0) c511501yz.l0).invoke();
    }

    public static final void updateDrawState$0(C511501yz c511501yz, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c511501yz.i1);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C511501yz c511501yz, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c511501yz.i1);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C511501yz c511501yz, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(c511501yz.i1);
        textPaint.setUnderlineText(false);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C511501yz(int r2, kotlin.jvm.functions.Function0 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            if (r4 == 0) goto Ld
            r0 = r1
            r0.i1 = r2
            r0.l0 = r3
        L9:
            r0.<init>()
            return
        Ld:
            r0 = r1
            r0.l0 = r3
            r0.i1 = r2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C511501yz.<init>(int, kotlin.jvm.functions.Function0, int):void");
    }
}
