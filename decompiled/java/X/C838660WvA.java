package X;

import android.icu.util.ULocale;
import java.util.Locale;

/* JADX INFO: renamed from: X.0WvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838660WvA {
    public static ULocale LIZ(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale LIZIZ(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String LIZJ(Object obj) {
        return ((ULocale) obj).getScript();
    }
}
