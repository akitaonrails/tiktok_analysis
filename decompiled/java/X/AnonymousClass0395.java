package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0395, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0395 {
    public static final CharSequence LIZ(int i, Context context, String str, String str2, Function0 function0) {
        String strJ4 = C786410Ut5.j4(str, Arrays.copyOf(new Object[]{str2}, 1));
        int iLJJJ = a0.LJJJ(strJ4, str2, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strJ4);
        if (iLJJJ != -1) {
            C786410Ut5.q2(spannableStringBuilder, new C04J4(i, context, function0, 0), iLJJJ, str2.length() + iLJJJ, 17);
        }
        return spannableStringBuilder;
    }
}
