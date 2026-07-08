package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.0DaO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341660DaO {
    public static CharSequence LIZ(Context context, CharSequence charSequence, int i) {
        if (i <= 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String quantityString = context.getResources().getQuantityString(2131755133, i, Integer.valueOf(i));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(quantityString);
        sbLIZ.append("] ");
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
