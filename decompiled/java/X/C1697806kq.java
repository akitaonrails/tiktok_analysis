package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1697806kq {
    public static final void LIZ(TuxTextView tuxTextView) {
        tuxTextView.setMovementMethod(new LinkMovementMethod());
        tuxTextView.setHighlightColor(0);
    }

    public static final void LIZJ(SpannableStringBuilder spannableStringBuilder, String str, int i, Function1 function1) {
        int iLJJJ = a0.LJJJ(spannableStringBuilder, str, 0, false, 6);
        if (iLJJJ != -1) {
            LIZIZ(spannableStringBuilder, new C511701z1(function1, 1), iLJJJ, iLJJJ + str.length(), i, R.attr.a1n);
        }
    }

    public static final void LIZIZ(SpannableStringBuilder spannableStringBuilder, ClickableSpan clickableSpan, int i, int i2, int i3, int i4) {
        C786410Ut5.q2(spannableStringBuilder, clickableSpan, i, i2, 18);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i3, false), i, i2, 18);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C1383370m6R.LJFF(i4)), i, i2, 18);
    }
}
