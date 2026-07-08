package X;

import Y.ARunnableS10S1100000_4;
import android.os.Handler;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Buq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303380Buq {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3609));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3606));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3607));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3608));

    public static void LIZ(String str, Map map) {
        if (((Boolean) LIZLLL.getValue()).booleanValue()) {
            C786410Ut5.LJLIIL(((Number) LIZJ.getValue()).longValue(), (Handler) LIZ.getValue(), new ARunnableS10S1100000_4(map, str, 5));
            return;
        }
        C2341909Fp.LIZ(str, map);
    }
}
