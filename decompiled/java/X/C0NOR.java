package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NOR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOR {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0NOV());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0NOS());

    public static ConcurrentHashMap LIZLLL() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static boolean LIZIZ(C0NON c0non) {
        if (c0non.LIZJ == 0 || Math.abs(System.currentTimeMillis() - c0non.LIZJ) > ((Number) C1309360kB4.LJI.getValue()).longValue()) {
            return true;
        }
        return false;
    }

    public static void LIZJ(String str, String str2) {
        if (Intrinsics.LJFF(str, "starship_strategy_init_trace")) {
            C0NON c0non = (C0NON) LIZLLL().get(str);
            if (c0non != null && C793770VBv.LIZJ("starship_strategy_api_monitor")) {
                C23250099c.LIZLLL(C1306520k6U.LIZ, null, null, new C0NOO(c0non, null), 3);
                return;
            }
            return;
        }
        C0NON c0non2 = (C0NON) LIZLLL().get(str);
        if (c0non2 == null || str2 == null || !LIZIZ(c0non2)) {
            return;
        }
        C23250099c.LIZLLL(C1306520k6U.LIZ, null, null, new C0NOM(c0non2, str2, null), 3);
    }

    public static void LIZ(String str, String str2, Function1 function1) {
        C0NON c0non = (C0NON) LIZLLL().get(str);
        if (c0non != null) {
            C1306520k6U.LJ(c0non.LIZIZ, str2, new C0NOQ(function1));
        }
    }
}
