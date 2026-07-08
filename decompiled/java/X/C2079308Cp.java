package X;

import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079308Cp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (!u.LJJIIJZLJL(str.toLowerCase(locale), "http://", false) && !u.LJJIIJZLJL(str.toLowerCase(locale), "https://", false)) {
            return false;
        }
        return true;
    }
}
