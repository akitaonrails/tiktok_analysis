package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.streak.impl.milestone.MilestoneResourceOptConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.06Pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1603906Pt {
    public static final MilestoneResourceOptConfig LIZ = new MilestoneResourceOptConfig(null, true, true, C1697810uHb.LJIIJJI(3, 10, 30, 100, 200), false, null, 49, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1604006Pu());

    public static MilestoneResourceOptConfig LIZIZ() {
        return (MilestoneResourceOptConfig) LIZIZ.getValue();
    }

    public static StreakMilestoneConf LIZ() {
        Object c098200Yq;
        if (!LIZIZ().useTypeAdapter) {
            return LIZIZ().milestoneConfig;
        }
        try {
            e eVar = new e();
            IStrategyPlatformService.LIZ.getClass();
            ((ArrayList) eVar.LJ).add(C909190Zld.LIZIZ.getValue().LJIIIIZZ());
            c098200Yq = (StreakMilestoneConf) eVar.LIZ().LJII(LIZIZ().milestoneConfigStr, StreakMilestoneConf.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Mason ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (StreakMilestoneConf) c098200Yq;
    }
}
