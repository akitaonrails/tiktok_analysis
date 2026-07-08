package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0ksD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336110ksD {
    public static String LIZ(String str, String str2, Map map) {
        if (map != null && !map.isEmpty()) {
            String str3 = (String) map.get(str);
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String str4 = (String) map.get(lowerCase);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
            String str5 = (String) map.get(lowerCase.toUpperCase(locale));
            if (!TextUtils.isEmpty(str5)) {
                return str5;
            }
            return str2;
        }
        return str2;
    }
}
