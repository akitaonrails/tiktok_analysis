package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusInAppPushCTROptConfig;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.intercept.LowConsumptionData;
import java.util.Calendar;

/* JADX INFO: renamed from: X.0ZFD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFD {
    public final String LIZ;
    public final Keva LIZIZ;
    public final ActivityStatusInAppPushCTROptConfig LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public LowConsumptionData LJ;

    public final synchronized LowConsumptionData LIZIZ() {
        long j = this.LJ.lowConsumptionStrategyVersion;
        long j2 = this.LIZJ.lowConsumptionStrategyVersion;
        if (j != j2) {
            this.LJ = new LowConsumptionData(null, null, 0L, j2, 7, null);
        }
        return this.LJ;
    }

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public C0ZFD(String str) {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("as_in_app_push_low_consumption_");
        sbLIZ.append(str);
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        ActivityStatusInAppPushCTROptConfig activityStatusInAppPushCTROptConfig = (ActivityStatusInAppPushCTROptConfig) C0ZFH.LIZIZ.getValue();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LIZ = str;
        this.LIZIZ = repo;
        this.LIZJ = activityStatusInAppPushCTROptConfig;
        this.LIZLLL = c054gLIZ;
        try {
            c098200Yq = (LowConsumptionData) C09EF.LIZ.LJII(repo.getString("key_low_consumption_data", ""), LowConsumptionData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LowConsumptionData lowConsumptionData = (LowConsumptionData) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LJ = lowConsumptionData == null ? new LowConsumptionData(null, null, 0L, 0L, 15, null) : lowConsumptionData;
    }

    public final synchronized void LIZJ(LowConsumptionData lowConsumptionData) {
        if (lowConsumptionData.lowConsumptionStrategyVersion == this.LIZJ.lowConsumptionStrategyVersion) {
            this.LJ = lowConsumptionData;
            this.LIZIZ.storeString("key_low_consumption_data", GsonProtectorUtils.toJson(C09EF.LIZ, lowConsumptionData));
        }
    }
}
