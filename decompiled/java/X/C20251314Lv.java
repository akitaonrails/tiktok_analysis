package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: X.14Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20251314Lv {
    public static String LIZIZ(Locale locale) {
        if (TextUtils.equals("zh", C786410Ut5.t2(locale))) {
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            if (TextUtils.equals("", C837920Wty.LIZIZ(locale))) {
                return "zh-Hans";
            }
        }
        if (locale.equals(Locale.TRADITIONAL_CHINESE)) {
            return "zh-Hant";
        }
        if (locale.equals(Locale.CHINESE) || locale.equals(Locale.SIMPLIFIED_CHINESE)) {
            return "zh-Hans";
        }
        if ("iw".equals(C786410Ut5.t2(locale))) {
            return "he";
        }
        if ("in".equals(C786410Ut5.t2(locale))) {
            return FollowStatusChangeMethod.PARAM_UID;
        }
        return C786410Ut5.t2(locale);
    }

    public static boolean LIZ(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strLIZIZ = LIZIZ(LIZJ(context, null, null));
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = C786410Ut5.t2(Locale.getDefault());
        }
        return str.toLowerCase().equals(strLIZIZ.toLowerCase());
    }

    public static Locale LIZJ(Context context, String str, String str2) {
        Locale locale;
        Locale locale2 = Locale.getDefault();
        if (str2 == null) {
            str2 = C20251014Ls.LIZ(context, "pref_language_key", "");
        }
        if (str == null) {
            str = C20251014Ls.LIZ(context, "key_current_locale", "");
            if (TextUtils.isEmpty(str)) {
                str = LIZLLL(str2, locale2, true);
                C20251014Ls.LIZIZ(context, "key_current_locale", str);
            }
        }
        try {
            InterfaceC1910030znt interfaceC1910030znt = (InterfaceC1910030znt) ((LinkedHashMap) C20251514Lx.LIZ.LIZ).get(str);
            if (interfaceC1910030znt != null) {
                locale = interfaceC1910030znt.getLocale();
            } else {
                locale = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (locale != null) {
            return locale;
        }
        return locale2;
    }

    public static String LIZLLL(String str, Locale locale, boolean z) {
        String strLIZIZ;
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        String strLIZIZ2 = C837920Wty.LIZIZ(locale);
        String strT2 = C786410Ut5.t2(locale);
        if (TextUtils.isEmpty(strLIZIZ2)) {
            strLIZIZ = strT2;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strT2);
            sbLIZ.append("-");
            sbLIZ.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, strT2)) {
            if (TextUtils.equals(str, "zh-Hant") || TextUtils.equals(str, "zh")) {
                return "zh-Hant-TW";
            }
            if (TextUtils.equals(str, "in")) {
                return "id-ID";
            }
            if (TextUtils.equals(str, "iw")) {
                return "he-IL";
            }
            strLIZIZ2 = "";
        } else {
            str = strT2;
        }
        if (TextUtils.equals("in", str)) {
            return "id-ID";
        }
        if (TextUtils.equals("iw", str)) {
            return "he-IL";
        }
        String strT22 = C786410Ut5.t2(locale);
        String strLIZIZ3 = C837920Wty.LIZIZ(locale);
        if (TextUtils.equals("zh-Hans", strT22) || (TextUtils.equals("zh", strT22) && (TextUtils.equals(strLIZIZ3, "CN") || TextUtils.equals(strLIZIZ3, "SG")))) {
            return "zh-Hans";
        }
        if (TextUtils.equals("zh-Hant", str) || TextUtils.equals("zh_TW", str) || TextUtils.equals("zh", str)) {
            return "zh-Hant-TW";
        }
        if (!TextUtils.isEmpty(strLIZIZ2) && C20251514Lx.LIZ.LIZ.containsKey(strLIZIZ)) {
            return strLIZIZ;
        }
        C20251414Lw c20251414Lw = C20251514Lx.LIZ;
        if (c20251414Lw.LIZIZ(str, strLIZIZ2) != null) {
            return c20251414Lw.LIZIZ(str, strLIZIZ2).LIZ();
        }
        if (c20251414Lw.LIZ.containsKey(str)) {
            return str;
        }
        for (InterfaceC1910030znt interfaceC1910030znt : ((LinkedHashMap) c20251414Lw.LIZ).values()) {
            if (TextUtils.equals(C786410Ut5.t2(interfaceC1910030znt.getLocale()), str)) {
                return interfaceC1910030znt.LIZ();
            }
        }
        if (z) {
            return "en";
        }
        return null;
    }
}
