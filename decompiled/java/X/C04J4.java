package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.04J4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J4 extends ClickableSpan {
    public final int $t;
    public int i2;
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
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
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
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            case 5:
                updateDrawState$5(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C04J4 c04j4, View view) {
        ((Function0) c04j4.l0).invoke();
    }

    public static final void onClick$1(C04J4 c04j4, View view) {
        ((Function1) c04j4.l1).invoke(Integer.valueOf(c04j4.i2));
    }

    public static final void onClick$2(C04J4 c04j4, View view) {
        ((Function1) c04j4.l1).invoke(Integer.valueOf(c04j4.i2));
    }

    public static final void onClick$3(C04J4 c04j4, View view) {
        String str = ((C7944038k) c04j4.l0).LIZIZ;
        if (str != null) {
            C919503ib.LIZIZ(((TextView) c04j4.l1).getContext(), str, new LinkedHashMap(), false).open();
        }
    }

    public static final void onClick$4(C04J4 c04j4, View view) {
        ((Function1) c04j4.l1).invoke(Integer.valueOf(c04j4.i2));
    }

    public static final void onClick$5(C04J4 c04j4, View view) {
        ((Function1) c04j4.l1).invoke(Integer.valueOf(c04j4.i2));
    }

    public static final void updateDrawState$0(C04J4 c04j4, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(c04j4.i2, (Context) c04j4.l1);
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(53);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C04J4 c04j4, TextPaint textPaint) {
        int iIntValue;
        Integer num = (Integer) c04j4.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C04J4 c04j4, TextPaint textPaint) {
        int iIntValue;
        Integer num = (Integer) c04j4.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C04J4 c04j4, TextPaint textPaint) {
        textPaint.setColor(c04j4.i2);
        if (!((C7944038k) c04j4.l0).LJFF) {
            textPaint.setStrikeThruText(false);
        }
        if (!((C7944038k) c04j4.l0).LJ) {
            textPaint.setUnderlineText(false);
        }
    }

    public static final void updateDrawState$4(C04J4 c04j4, TextPaint textPaint) {
        int iIntValue;
        Integer num = (Integer) c04j4.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(62);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$5(C04J4 c04j4, TextPaint textPaint) {
        int iIntValue;
        Integer num = (Integer) c04j4.l0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(62);
        textPaint.setTypeface(c444890HcV.getTypeface());
        textPaint.setUnderlineText(false);
    }

    public C04J4(int i, TextView textView, Function1 function1, int i2) {
        this.$t = i2;
        this.l1 = function1;
        this.i2 = i;
        this.l0 = C1308910kAL.LIZJ(R.attr.a1n, textView.getContext());
    }

    public C04J4(int i, TuxTextView tuxTextView, AwS581S0100000_2 awS581S0100000_2, int i2) {
        this.$t = i2;
        this.l1 = awS581S0100000_2;
        this.i2 = i;
        this.l0 = C1308910kAL.LIZJ(R.attr.a1n, tuxTextView.getContext());
    }

    public C04J4(TuxTextView tuxTextView, Function1 function1, int i, int i2) {
        this.$t = i2;
        this.l1 = function1;
        this.i2 = i;
        this.l0 = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
    }

    public C04J4(TuxTextView tuxTextView, AwS367S0200000_1 awS367S0200000_1, int i, int i2) {
        this.$t = i2;
        this.l1 = awS367S0200000_1;
        this.i2 = i;
        this.l0 = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView.getContext());
    }

    public C04J4(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.l1 = obj;
        this.i2 = i;
    }
}
