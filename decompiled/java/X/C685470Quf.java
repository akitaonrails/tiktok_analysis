package X;

import android.text.Spanned;

/* JADX INFO: renamed from: X.0Quf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685470Quf {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(CharSequence charSequence, Class cls) {
        Spanned spanned;
        Object[] spans;
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        if (spanned == null || (spans = spanned.getSpans(0, spanned.length(), cls)) == null || spans.length == 0) {
            return false;
        }
        return true;
    }
}
