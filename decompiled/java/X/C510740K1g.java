package X;

import android.text.SpannableStringBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K1g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510740K1g {
    public static final SpannableStringBuilder LIZ(CharSequence charSequence, Integer num, Function1<? super SpannableStringBuilder, Unit> function1) {
        if (charSequence == null) {
            charSequence = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        function1.invoke(spannableStringBuilder);
        if (num != null) {
            int iIntValue = num.intValue();
            if (spannableStringBuilder.length() > 0) {
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(iIntValue, true), 0, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static final void LIZJ(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2, int i3) {
        if (i >= 0 && i2 <= spannableStringBuilder.length() && i < i2) {
            C786410Ut5.q2(spannableStringBuilder, obj, i, i2, i3);
        }
    }

    public static final void LIZLLL(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, boolean z, int i4) {
        if (i >= 0 && i2 <= spannableStringBuilder.length() && i < i2) {
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i3, z), i, i2, i4);
        }
    }
}
