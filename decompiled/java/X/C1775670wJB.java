package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.verify.otp.OtpViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775670wJB extends ClickableSpan {
    public final int $t;
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

    public C1775670wJB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C1775670wJB c1775670wJB, View view) {
        Function1<? super Boolean, Unit> function1 = ((C1761470vwH) c1775670wJB.l0).LLJI;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$1(C1775670wJB c1775670wJB, View view) {
        Function1<? super Boolean, Unit> function1 = ((C1761470vwH) c1775670wJB.l0).LLJ;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
    }

    public static final void onClick$2(C1775670wJB c1775670wJB, View view) {
        ((OtpFragment) c1775670wJB.l0).onEventClick("cant_receive_code");
        OtpViewModel otpViewModelQS = ((OtpFragment) c1775670wJB.l0).qS();
        C23250099c.LIZLLL(otpViewModelQS.getLifecycleScope(), otpViewModelQS.LLILLL, null, new C1714960ujG(otpViewModelQS, null), 2);
    }

    public static final void updateDrawState$0(C1775670wJB c1775670wJB, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C960203pA.LIZ(((C1761470vwH) c1775670wJB.l0).getSeeLessTextColor(), ((C1761470vwH) c1775670wJB.l0).getContext()));
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.defaultFromStyle(1));
    }

    public static final void updateDrawState$1(C1775670wJB c1775670wJB, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(C960203pA.LIZ(((C1761470vwH) c1775670wJB.l0).getSeeLessTextColor(), ((C1761470vwH) c1775670wJB.l0).getContext()));
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(Typeface.defaultFromStyle(1));
    }

    public static final void updateDrawState$2(C1775670wJB c1775670wJB, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(R.attr.a1h);
        textPaint.setUnderlineText(false);
    }
}
