package X;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: X.10ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19298910ep {
    public static Spanned LIZ(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C19298810eo.LIZ(str, i);
        }
        return Html.fromHtml(str);
    }
}
