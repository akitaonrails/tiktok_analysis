package X;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21412418qw {
    public static LocaleList LIZ(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void LIZIZ(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
