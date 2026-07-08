package X;

import android.content.Context;
import android.text.SpannableString;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TIG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIG {
    public static final C0TIG LIZ = new C0TIG();

    public static final CharSequence LIZ(Context context, String str, String str2) {
        String strJ4 = C786410Ut5.j4(str2, Arrays.copyOf(new Object[]{str}, 1));
        int iLJJJ = a0.LJJJ(strJ4, str, 0, false, 6);
        SpannableString spannableString = new SpannableString(strJ4);
        if (iLJJJ != -1) {
            C786410Ut5.p2(spannableString, new C785800Us6(C960203pA.LIZ(R.attr.a1j, context), context, 1), iLJJJ, str.length() + iLJJJ, 33);
        }
        return spannableString;
    }
}
