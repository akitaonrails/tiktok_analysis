package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0Wuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838550Wuz {
    public static final Locale[] LIZ = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static boolean LIZIZ(Locale locale, Locale locale2) throws Throwable {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!C786410Ut5.t2(locale).equals(C786410Ut5.t2(locale2))) {
            return false;
        }
        Locale[] localeArr = LIZ;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (localeArr[i].equals(locale)) {
                    break;
                }
                i++;
            } else {
                for (Locale locale3 : LIZ) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String strLIZ = C838650Wv9.LIZ(locale);
                if (strLIZ.isEmpty()) {
                    String strG0 = C2204961BRm.g0(locale, new C0WZX("dTF6Tg0zW9KSVlgzQFyLdfDhwn3uNqMaIWfXZTjbb/MW", new String[]{"01789"}));
                    if (strG0.isEmpty() || strG0.equals(C2204961BRm.g0(locale2, new C0WZX("dTF6Tg0zW9KSVlgzQFyLdfDhwn3uNqMaIWfXZTjbb/MW", new String[]{"01789"})))) {
                        return true;
                    }
                    return false;
                }
                return strLIZ.equals(C838650Wv9.LIZ(locale2));
            }
        }
        return false;
    }
}
