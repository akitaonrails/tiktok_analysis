package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06kn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1697506kn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C16F5 c16f5, String str, String str2, int i, int i2, int i3, Function0 function0) {
        ForegroundColorSpan foregroundColorSpan;
        Context context;
        Context context2;
        Integer numLIZJ;
        Context context3;
        Integer numLIZJ2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int iLJJJ = a0.LJJJ(str2, str, 0, false, 6);
        if (iLJJJ < 0) {
            if (c16f5 != null) {
                c16f5.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        int length = iLJJJ + str.length();
        int length2 = str2.length() - 1;
        ForegroundColorSpan foregroundColorSpan2 = null;
        if (c16f5 != null && (context3 = c16f5.getContext()) != null && (numLIZJ2 = C1308910kAL.LIZJ(i3, context3)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(numLIZJ2.intValue());
        } else {
            foregroundColorSpan = null;
        }
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, 0, length2, 33);
        if (c16f5 != null) {
            context = c16f5.getContext();
        } else {
            context = null;
        }
        C1119920fFW.LJ(context, spannableStringBuilder, iLJJJ, length, 33, i, 500);
        C786410Ut5.q2(spannableStringBuilder, new C1766906vz(function0, 1), iLJJJ, length, 33);
        if (c16f5 != null && (context2 = c16f5.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(i2, context2)) != null) {
            foregroundColorSpan2 = new ForegroundColorSpan(numLIZJ.intValue());
        }
        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan2, iLJJJ, length, 33);
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
    }
}
