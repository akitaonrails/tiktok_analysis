package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DYJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DYJ {
    public static final SpannableString LIZ(String str, String str2) {
        int iLJJJ;
        SpannableString spannableString = new SpannableString(str);
        if (str2.length() == 0 || (iLJJJ = a0.LJJJ(str, str2, 0, true, 2)) < 0) {
            return spannableString;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(-65536), iLJJJ, str2.length() + iLJJJ, 33);
        return spannableString;
    }

    public static final float LIZIZ(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
