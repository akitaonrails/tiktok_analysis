package X;

import com.bytedance.pns.engine.RuleEngineService;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WRL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0WRL implements C0WRP {
    public String LIZ;

    public abstract boolean LIZIZ(C0WRN c0wrn);

    @Override // X.C0WRP
    public final boolean LIZ(C0WRN c0wrn) {
        PrivacyEvent privacyEvent = c0wrn.LJ;
        try {
            boolean zLIZIZ = LIZIZ(c0wrn);
            if (!zLIZIZ) {
                Throwable th = new Throwable();
                try {
                    String strLIZIZ = this.LIZ;
                    if (strLIZIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(name());
                        sbLIZ.append(" execute false");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C823280WRi.LJII(strLIZIZ, th, C2097608Jq.LJIIJ(new Pair("pumbaa_exception_type", "action_execute_false"), new Pair("trigger_id", privacyEvent.triggerId()), new Pair("trigger_biz", privacyEvent.triggerBiz()), new Pair("strategy_id", c0wrn.LIZIZ), new Pair("strategy_version", String.valueOf(String.valueOf(RuleEngineService.getStrategyVersion()))), new Pair("const_pool_version", String.valueOf(String.valueOf(RuleEngineService.getConstPoolVersion())))));
                    return zLIZIZ;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                return zLIZIZ;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        TryCatchGuardChecker.doCheck(th);
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(name());
            sbLIZ2.append(" execute error");
            C823280WRi.LJ(thM5exceptionOrNullimpl, C2188811AlT.LIZIZ(sbLIZ2), C2097608Jq.LJIIJ(new Pair("pumbaa_exception_type", "action_execute_error"), new Pair("trigger_id", privacyEvent.triggerId()), new Pair("trigger_biz", privacyEvent.triggerBiz()), new Pair("strategy_id", c0wrn.LIZIZ), new Pair("strategy_version", String.valueOf(String.valueOf(RuleEngineService.getStrategyVersion()))), new Pair("const_pool_version", String.valueOf(String.valueOf(RuleEngineService.getConstPoolVersion())))));
        }
        return false;
    }
}
