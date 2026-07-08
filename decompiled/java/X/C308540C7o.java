package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308540C7o {
    public static final C308540C7o LIZ = new C308540C7o();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5429));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5430));

    public static boolean LIZ(String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "migrate_draft_debug_clear_cache", true, false)) {
            ((Keva) LIZIZ.getValue()).storeInt(str, 0);
            return true;
        }
        int i = ((Keva) LIZIZ.getValue()).getInt(str, 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkIfNeed: current count = ");
        sbLIZ.append(i);
        sbLIZ.append(", maxTryTime = ");
        LIZ.getClass();
        C01GW c01gw = LIZJ;
        sbLIZ.append(((Number) c01gw.getValue()).intValue());
        C0WJO.LIZ("verify", C2188811AlT.LIZIZ(sbLIZ));
        if (i < ((Number) c01gw.getValue()).intValue()) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str) {
        try {
            ((Keva) LIZIZ.getValue()).storeInt(str, 100);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
