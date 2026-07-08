package X;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: renamed from: X.0Wv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838620Wv6 {
    public static LocaleList LIZ(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void LIZIZ(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
