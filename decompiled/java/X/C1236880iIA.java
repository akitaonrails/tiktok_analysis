package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS30S0102000_19;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236880iIA {
    public static final void LIZ(C0HZQ c0hzq, Context context) {
        if (C294000Bfi.LIZ() && context != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, context);
            if (numLIZJ != null && numLIZJ2 != null) {
                int iIntValue = numLIZJ.intValue();
                int iIntValue2 = numLIZJ2.intValue();
                if (context != null) {
                    c0hzq.setCheckBoxCheckedColor(iIntValue);
                    c0hzq.setCheckBoxInnerShapeColor(iIntValue2);
                }
            }
        }
    }

    public static final SpannableStringBuilder LIZLLL(CharSequence charSequence, String[] strArr, int i) {
        try {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            for (String str : strArr) {
                int iLJJJ = a0.LJJJ(charSequence, str, 0, false, 6);
                if (iLJJJ != -1) {
                    C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(i, true), iLJJJ, str.length() + iLJJJ, 18);
                }
            }
            return spannableStringBuilderValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setFont failed ");
            sbLIZ.append((Object) charSequence);
            sbLIZ.append(' ');
            sbLIZ.append(C13LQ.LJJJ(strArr, "|", null, null, null, 62));
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            return new SpannableStringBuilder(charSequence);
        }
    }

    public static final SpannableStringBuilder LIZIZ(CharSequence charSequence, Context context, int i, String... strArr) {
        Integer numLIZ;
        try {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
            if (context != null && (numLIZ = C1308910kAL.LIZ(i, context)) != null) {
                int iIntValue = numLIZ.intValue();
                for (String str : strArr) {
                    int iLJJJ = a0.LJJJ(charSequence, str, 0, false, 6);
                    if (iLJJJ != -1) {
                        C786410Ut5.q2(spannableStringBuilderValueOf, new ForegroundColorSpan(iIntValue), iLJJJ, str.length() + iLJJJ, 18);
                    }
                }
            }
            return spannableStringBuilderValueOf;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setColor failed ");
            sbLIZ.append((Object) charSequence);
            sbLIZ.append(' ');
            sbLIZ.append(C13LQ.LJJJ(strArr, "|", null, null, null, 62));
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
            return new SpannableStringBuilder(charSequence);
        }
    }

    public static final void LIZJ(C197039127h c197039127h, Context context, int i, int i2) {
        if (context == null) {
            return;
        }
        c197039127h.setButtonVariant(-1);
        c197039127h.LJJJJL(new AwS30S0102000_19(i2, i, context, 0));
    }
}
