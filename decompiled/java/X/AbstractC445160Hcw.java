package X;

import android.text.Spanned;

/* JADX INFO: renamed from: X.0Hcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC445160Hcw {
    public static boolean LIZ(CharSequence charSequence, Object obj, int i) {
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i) {
            return true;
        }
        return false;
    }
}
