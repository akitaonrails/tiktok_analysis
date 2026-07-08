package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ID5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0ID5 extends ClickableSpan {
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

    public static final void onClick$0(C0ID5 c0id5, View view) {
        ((C1246240iXG) c0id5.l0).LJIILIIL();
    }

    public static final void onClick$1(C0ID5 c0id5, View view) {
        ((C19417510xx) c0id5.l0).itemView.performClick();
    }

    public static final void onClick$2(C0ID5 c0id5, View view) {
        if (!C0OBG.LIZIZ(view)) {
            ((Function0) c0id5.l0).invoke();
        }
    }

    public static final void updateDrawState$0(C0ID5 c0id5, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, ((C688120Qyw) c0id5.l1).LIZ);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(62);
            textPaint.setTypeface(c444890HcV.getTypeface());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C0ID5 c0id5, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int iIntValue = 0;
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, (Context) c0id5.l1);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        textPaint.setColor(iIntValue);
    }

    public static final void updateDrawState$2(C0ID5 c0id5, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1o, (Context) c0id5.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
    }

    public C0ID5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
