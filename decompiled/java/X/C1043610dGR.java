package X;

import android.util.LruCache;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0dGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043610dGR {
    public static final C1043610dGR LIZ = new C1043610dGR();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(424));

    public static C1043600dGQ LIZ(String str) {
        C01GW c01gw = LIZIZ;
        C1043600dGQ c1043600dGQ = (C1043600dGQ) ((LruCache) c01gw.getValue()).get(str);
        C811103Ev.LIZ("AnoleGeckoLoggerCache");
        if (c1043600dGQ == null) {
            C1043600dGQ c1043600dGQ2 = new C1043600dGQ(new Object[0]);
            C811103Ev.LIZ("AnoleGeckoLoggerCache");
            ((LruCache) c01gw.getValue()).put(str, c1043600dGQ2);
            return c1043600dGQ2;
        }
        return c1043600dGQ;
    }
}
