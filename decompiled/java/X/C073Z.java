package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.073Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C073Z {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(464));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(465));

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static int LIZ() {
        try {
            return C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "pre_request_interest", false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
