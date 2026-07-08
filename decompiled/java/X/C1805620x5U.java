package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0x5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805620x5U {
    public static void LIZ(C495520Jby c495520Jby) {
        try {
            C1803800x2Y.LIZ.getClass();
            String strLJIIL = C1803800x2Y.LJIIL(null);
            c495520Jby.LIZJ("strategy_task_type", strLJIIL);
            c495520Jby.LIZJ("campaign_type", strLJIIL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
    }
}
