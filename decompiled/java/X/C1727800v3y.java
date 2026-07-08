package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0v3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727800v3y {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableString LIZ(String str, String str2, Integer num, Integer num2, final Function0 function0, Context context) {
        SpannableString spannableString = new SpannableString(str);
        if (context != null && a0.LJJIIZI(str, str2, false)) {
            int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
            int length = str2.length() + iLJJJ;
            if (num != null) {
                num.intValue();
                C1119920fFW.LJIIIIZZ(spannableString, iLJJJ, length, 33, num.intValue());
            }
            if (num2 != null) {
                num2.intValue();
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C14MF.LIZIZ(num2.intValue(), context)), iLJJJ, length, 33);
            }
            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0v3x
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    function0.invoke();
                }
            }, iLJJJ, length, 33);
        }
        return spannableString;
    }
}
