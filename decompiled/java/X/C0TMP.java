package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TMP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TMP {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(int i, String str, String str2, Function1 function1) {
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        if (iLJJJ != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, iLJJJ));
            sbLIZ.append(str2);
            sbLIZ.append(str.substring(str2.length() + iLJJJ));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            C1697806kq.LIZIZ(spannableStringBuilder, new C511701z1(new AwS591S0100000_12(function1, (Function1<? super LiveEffect, Unit>) 845), 2), iLJJJ, iLJJJ + str2.length(), i, R.attr.a1n);
            return SpannableString.valueOf(spannableStringBuilder);
        }
        return str;
    }

    public static CharSequence LIZIZ(int i, int i2, String str, String str2, Function1 function1) {
        int iLJJJ = a0.LJJJ(str, "%1$s", 0, false, 6);
        if (iLJJJ == -1) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(0, iLJJJ));
        sbLIZ.append(str2);
        sbLIZ.append(str.substring(iLJJJ + 4));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int length = iLJJJ + str2.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
        C1697806kq.LIZIZ(spannableStringBuilder, new C511701z1(new AwS591S0100000_12(function1, (Function1<? super LiveEffect, Unit>) 846), 2), iLJJJ, length, i, i2);
        return SpannableString.valueOf(spannableStringBuilder);
    }
}
