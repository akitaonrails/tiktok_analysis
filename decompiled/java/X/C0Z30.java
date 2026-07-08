package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Z30, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z30 {
    public static C893390Z2z LIZ(C19EG c19eg) {
        Configuration configuration;
        String strLIZIZ;
        DisplayMetrics displayMetrics;
        int iHashCode = c19eg.getTheme().hashCode();
        Resources resources = c19eg.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null || (strLIZIZ = LIZIZ(configuration)) == null) {
            return null;
        }
        int i = configuration.orientation;
        int i2 = configuration.uiMode;
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        int i5 = configuration.smallestScreenWidthDp;
        Resources resources2 = c19eg.getResources();
        if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
            return new C893390Z2z(iHashCode, strLIZIZ, i, i2, i3, i4, i5, displayMetrics.density, displayMetrics.densityDpi, displayMetrics.scaledDensity);
        }
        return null;
    }

    public static String LIZIZ(Configuration configuration) {
        if (Build.VERSION.SDK_INT < 24) {
            Locale locale = configuration.locale;
            if (locale == null) {
                return null;
            }
            return locale.toString();
        }
        LocaleList locales = configuration.getLocales();
        if (locales.isEmpty()) {
            Locale locale2 = configuration.locale;
            if (locale2 == null) {
                return null;
            }
            return locale2.toString();
        }
        return locales.get(0).toString();
    }
}
