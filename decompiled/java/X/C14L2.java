package X;

import android.telephony.TelephonyManager;
import android.util.LruCache;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14L2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14L2 {
    public static C2280611EOl LIZ() {
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.G2(C7879035x.LIZ(), "phone");
        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
        String strLJIIIIZZ = C1300840jxK.LJIIIIZZ(telephonyManager);
        if (strLJIIIIZZ.length() == 0) {
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            strLJIIIIZZ = C837920Wty.LIZIZ(Locale.getDefault());
        }
        if (strLJIIIIZZ.length() == 0) {
            return C1745850vX5.LLJJI;
        }
        for (C2280611EOl c2280611EOl : C2280611EOl.LIZLLL) {
            if (u.LJIJI(c2280611EOl.LIZ, strLJIIIIZZ, true)) {
                return c2280611EOl;
            }
        }
        return C1745850vX5.LLJJI;
    }
}
