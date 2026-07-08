package X;

import android.icu.util.ULocale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.1Aoj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190831Aoj {
    public static String[] LIZLLL() {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : Locale.getAvailableLocales()) {
            arrayList.add(locale.toLanguageTag());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ULocale LIZIZ(InterfaceC2190701AoW<?> interfaceC2190701AoW) {
        boolean[] zArr = new boolean[1];
        ULocale uLocaleAcceptLanguage = ULocale.acceptLanguage(new ULocale[]{interfaceC2190701AoW.LIZLLL()}, ULocale.getAvailableLocales(), zArr);
        if (!zArr[0] && uLocaleAcceptLanguage != null) {
            return uLocaleAcceptLanguage;
        }
        return null;
    }

    public static String[] LIZJ(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (LIZIZ(C2190551AoH.LIZ(str)) != null) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] LJ(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] strArrLIZLLL = LIZLLL();
        for (String str : strArr) {
            String strLIZ = LIZ(C2190551AoH.LIZ(str).LJ(), strArrLIZLLL);
            if (strLIZ != null && !strLIZ.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String LIZ(String str, String[] strArr) {
        while (Arrays.asList(strArr).indexOf(str) <= -1) {
            int iLastIndexOf = str.lastIndexOf("-");
            if (iLastIndexOf < 0) {
                return "";
            }
            if (iLastIndexOf >= 2 && str.charAt(iLastIndexOf - 2) == '-') {
                iLastIndexOf -= 2;
            }
            str = str.substring(0, iLastIndexOf);
        }
        return str;
    }
}
