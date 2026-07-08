package X;

import android.icu.text.NumberingSystem;
import android.icu.text.RuleBasedCollator;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1Anj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190211Anj {
    public static final C2190231Anl LIZ;
    public static final C2190191Anh LIZIZ;
    public static final C2190181Ang LIZJ;
    public static final C2190171Anf LIZLLL;
    public static final C2190201Ani LJ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Anl] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Anh] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Ang] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1Anf] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Ani] */
    static {
        new HashMap<String, String>() { // from class: X.1Ank
            {
                put("ca", "calendar");
                put("nu", "numbers");
                put("hc", "hours");
                put("co", "collation");
                put("kn", "colnumeric");
                put("kf", "colcasefirst");
            }
        };
        LIZ = new HashMap<String, String>() { // from class: X.1Anl
            {
                put("calendar", "ca");
                put("numbers", "nu");
                put("hours", "hc");
                put("collation", "co");
                put("colnumeric", "kn");
                put("colcasefirst", "kf");
            }
        };
        LIZIZ = new HashMap<String, String>() { // from class: X.1Anh
            {
                put("dictionary", "dict");
                put("phonebook", "phonebk");
                put("traditional", "trad");
                put("gb2312han", "gb2312");
            }
        };
        LIZJ = new HashMap<String, String>() { // from class: X.1Ang
            {
                put("gregorian", "gregory");
            }
        };
        LIZLLL = new HashMap<String, String>() { // from class: X.1Anf
            {
                put("traditional", "traditio");
            }
        };
        LJ = new HashMap<String, String[]>() { // from class: X.1Ani
            {
                put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", "segment", "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
                put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
                put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
            }
        };
    }

    public static Object LIZIZ(Object obj, String str) {
        if (str.equals("ca") && (obj instanceof String)) {
            C2190181Ang c2190181Ang = LIZJ;
            if (c2190181Ang.containsKey(obj)) {
                return c2190181Ang.get(obj);
            }
            return obj;
        }
        if (str.equals("nu") && (obj instanceof String)) {
            C2190171Anf c2190171Anf = LIZLLL;
            if (c2190171Anf.containsKey(obj)) {
                return c2190171Anf.get(obj);
            }
            return obj;
        }
        if (str.equals("co") && (obj instanceof String)) {
            C2190191Anh c2190191Anh = LIZIZ;
            if (c2190191Anh.containsKey(obj)) {
                return c2190191Anh.get(obj);
            }
            return obj;
        }
        if (str.equals("kn") && (obj instanceof String) && obj.equals("yes")) {
            return "true";
        }
        if ((str.equals("kn") || str.equals("kf")) && (obj instanceof String) && obj.equals("no")) {
            return "false";
        }
        return obj;
    }

    public static boolean LIZ(String str, String str2, InterfaceC2190701AoW interfaceC2190701AoW) {
        if (Build.VERSION.SDK_INT >= 24) {
            ULocale uLocale = (ULocale) interfaceC2190701AoW.getLocale();
            String[] availableNames = new String[0];
            if (str.equals("co")) {
                if (str2.equals("standard") || str2.equals("search")) {
                    return false;
                }
                availableNames = RuleBasedCollator.getKeywordValuesForLocale("co", uLocale, false);
            } else if (str.equals("ca")) {
                availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
            } else if (str.equals("nu")) {
                availableNames = NumberingSystem.getAvailableNames();
            }
            if (availableNames.length == 0) {
                return true;
            }
            return Arrays.asList(availableNames).contains(str2);
        }
        C2190201Ani c2190201Ani = LJ;
        if (!c2190201Ani.containsKey(str)) {
            return true;
        }
        return Arrays.asList(c2190201Ani.get(str)).contains(str2);
    }
}
