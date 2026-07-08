package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C511601z0 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onClick$0(C511601z0 c511601z0, View view) {
        ((Function0) c511601z0.l0).invoke();
    }

    public static final void onClick$1(C511601z0 c511601z0, View view) {
        ((Function0) c511601z0.l0).invoke();
    }

    public static final void onClick$2(C511601z0 c511601z0, View view) {
        ((Function1) c511601z0.l0).invoke(view);
    }

    public static final void updateDrawState$0(C511601z0 c511601z0, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C20736316Cj.LIZIZ(R.attr.ezs, ((C16F5) c511601z0.l1).getContext()));
    }

    public static final void updateDrawState$1(C511601z0 c511601z0, TextPaint textPaint) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, ((C1370860lmG) c511601z0.l1).getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C511601z0 c511601z0, TextPaint textPaint) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, (Context) c511601z0.l1);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public C511601z0(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
