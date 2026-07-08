package X;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: X.0Wv1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838570Wv1 {
    public static C838510Wuv LIZIZ(Configuration configuration) {
        return C838510Wuv.LIZIZ(configuration.getLocales().toLanguageTags());
    }

    public static void LIZJ(C838510Wuv c838510Wuv) {
        LocaleList.setDefault(LocaleList.forLanguageTags(c838510Wuv.LIZ.LIZIZ()));
    }

    public static void LIZLLL(Configuration configuration, C838510Wuv c838510Wuv) {
        configuration.setLocales(LocaleList.forLanguageTags(c838510Wuv.LIZ.LIZIZ()));
    }

    public static void LIZ(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }
}
