package X;

import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1Dyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273401Dyc {
    public static volatile String LIZLLL;
    public static volatile String LJ;
    public static final C2273401Dyc LIZ = new C2273401Dyc();
    public static final CopyOnWriteArrayList<C0VEJ> LIZIZ = new CopyOnWriteArrayList<>();
    public static volatile String LIZJ = "";
    public static final C830490Whz<String, String> LJFF = new C830490Whz<>();
    public static final C830490Whz<String, String> LJI = new C830490Whz<>(64);
    public static final String[] LJII = {"us", "eu"};
    public static final String[] LJIIIIZZ = {"at", "be", "bg", "ch", "cy", "cz", "de", "dk", "ee", "es", "fi", "fr", "gb", "gf", "gp", "gr", "hr", "hu", "ie", "is", "it", "li", "lt", "lu", "lv", "mf", "mq", "mt", "nl", "no", "pl", "pt", "re", "ro", "se", "si", "sk", "yt"};

    static {
        LIZLLL = "";
        LJ = "";
        for (String str : new String[]{"us", "as", "gu", "mp", "pr", "vi", "um"}) {
            LJI.put(str, "us");
        }
        for (String str2 : LJIIIIZZ) {
            LJI.put(str2, "eu");
        }
        String lowerCase = C20301014c4.LIZIZ().toLowerCase(Locale.ROOT);
        if (lowerCase.length() > 0) {
            LIZ.getClass();
            String str3 = LJI.get(lowerCase);
            if (str3 == null) {
                str3 = "row";
            }
            LIZLLL = str3;
            LJ = lowerCase;
        }
    }

    public static final boolean LIZIZ() {
        return C13LQ.LJIILLIIL(LIZLLL.toLowerCase(Locale.ROOT), LJII);
    }

    public static final String LIZ(String str) {
        if (str == null) {
            return null;
        }
        String str2 = LJI.get(str);
        if (str2 == null) {
            return "row";
        }
        return str2;
    }
}
