package X;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838520Wuw {
    public static LocaleList LIZIZ() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList LIZJ() {
        return LocaleList.getDefault();
    }

    public static LocaleList LIZ(Locale... localeArr) {
        return new LocaleList(localeArr);
    }
}
