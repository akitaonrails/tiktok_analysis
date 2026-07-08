package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0GuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430600GuY {
    public static final Pair<String, String> LIZ(String str, String str2, String str3) {
        String strSubstring;
        try {
            strSubstring = str.substring(a0.LJJJ(str, str2, 0, false, 6) + 1, a0.LJJJ(str, str3, 0, false, 6));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strSubstring = "";
        }
        return new Pair<>(strSubstring, u.LJJIFFI(u.LJJIFFI(str, str2, "", false), str3, "", false));
    }

    public static SpannableStringBuilder LIZIZ(final Context context, String str, String str2, final int i, String str3, final Function0 function0, int i2) {
        boolean z;
        String str4 = null;
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i = C446980Hfs.LIZ(context, R.color.a8x);
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        if ((i2 & 64) != 0) {
            function0 = null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        final boolean z2 = false;
        boolean z3 = true;
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str2 = null;
            }
            if (str2 != null) {
                ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.0Gpd
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setUnderlineText(z2);
                        textPaint.setTypeface(C1119920fFW.LIZJ(textPaint.getTextSize(), 500, context));
                        textPaint.setColor(i);
                    }
                };
                int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
                try {
                    C786410Ut5.q2(spannableStringBuilder, clickableSpan, iLJJJ, str2.length() + iLJJJ, 18);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (str3 != null) {
            if (str3.length() <= 0) {
                z3 = false;
            }
            if (z3) {
                str4 = str3;
            }
            if (str4 != null) {
                C444930HcZ c444930HcZ = new C444930HcZ(C1119920fFW.LIZJ(17.0f, 500, context));
                int iLJJJ2 = a0.LJJJ(str, str4, 0, false, 6);
                try {
                    C786410Ut5.q2(spannableStringBuilder, c444930HcZ, iLJJJ2, str4.length() + iLJJJ2, 18);
                    return spannableStringBuilder;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return spannableStringBuilder;
    }
}
