package X;

import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524380pls {
    public boolean LIZ;
    public int LIZIZ;
    public C1502140pC0 LIZJ;
    public C1524430plx LIZLLL;
    public String LJ;
    public Throwable LJFF;
    public String LJI = "";
    public int LJII;

    public static boolean LIZ(String str) {
        if (str.length() > 0) {
            Locale locale = Locale.ROOT;
            if (a0.LJJIIZI(str.toLowerCase(locale), "time", false) && a0.LJJIIZI(str.toLowerCase(locale), "out", false)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
