package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TIR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C16F5 c16f5, String str, Drawable drawable) {
        SpannableString spannableStringValueOf = SpannableString.valueOf(str);
        int iLJJJ = a0.LJJJ(str, "{icon}", 0, false, 6);
        if (iLJJJ != -1) {
            C786410Ut5.o2(spannableStringValueOf, new C419890GdH(drawable, 2), iLJJJ, 6 + iLJJJ, 33);
        }
        c16f5.setText(spannableStringValueOf);
    }
}
