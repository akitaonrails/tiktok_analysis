package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0qoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564480qoY {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(534));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(539));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(537));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(536));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(538));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(535));

    public static C1564600qok LIZ(String str) {
        C01GW c01gw = LJ;
        C1564600qok c1564600qok = (C1564600qok) ((Map) c01gw.getValue()).get(str);
        if (c1564600qok == null) {
            C1564600qok c1564600qok2 = new C1564600qok();
            ((Map) c01gw.getValue()).put(str, c1564600qok2);
            return c1564600qok2;
        }
        return c1564600qok;
    }

    public static void LIZIZ(String str) {
        C1564600qok c1564600qokLIZ = LIZ(str);
        if (c1564600qokLIZ.LIZ < 2) {
            c1564600qokLIZ.LIZ = 1;
        }
        c1564600qokLIZ.LIZIZ = System.currentTimeMillis();
    }

    public static void LIZJ(String str) {
        ((Map) LIZIZ.getValue()).put(str, Long.valueOf(System.currentTimeMillis()));
    }
}
