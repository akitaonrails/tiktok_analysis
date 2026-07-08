package X;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: X.10eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19298810eo {
    public static Spanned LIZ(String str, int i) {
        return Html.fromHtml(str, i);
    }

    public static String LIZJ(Spanned spanned, int i) {
        return Html.toHtml(spanned, i);
    }

    public static Spanned LIZIZ(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i, imageGetter, tagHandler);
    }
}
