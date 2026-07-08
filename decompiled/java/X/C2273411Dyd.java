package X;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.1Dyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273411Dyd {
    public static final Set<String> LIZ;
    public static final Set<String> LIZIZ;
    public static final Set<String> LIZJ;
    public static final Set<String> LIZLLL;

    static {
        Set<String> setLJLIIL = C13LQ.LJLIIL(new String[]{"us", "as", "gu", "mp", "pr", "vi", "um"});
        LIZ = setLJLIIL;
        Set<String> setLJLIIL2 = C13LQ.LJLIIL(new String[]{"at", "be", "bg", "ch", "cy", "cz", "de", "dk", "ee", "es", "fi", "fr", "gb", "gf", "gp", "gr", "hr", "hu", "ie", "is", "it", "li", "lt", "lu", "lv", "mf", "mq", "mt", "nl", "no", "pl", "pt", "re", "ro", "se", "si", "sk", "yt"});
        LIZIZ = setLJLIIL2;
        Set<String> setLJLIIL3 = C13LQ.LJLIIL(new String[]{"ca", "au", "nz", "il"});
        LIZJ = setLJLIIL3;
        LIZLLL = C15442062u.LJIIIZ(C15442062u.LJIIIZ(setLJLIIL, setLJLIIL2), setLJLIIL3);
    }

    public static final boolean LIZ() {
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            return LIZLLL.contains(C2273401Dyc.LJ.toLowerCase(Locale.ROOT));
        }
        return false;
    }
}
