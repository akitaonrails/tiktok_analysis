package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.boot.downgrade.DowngradeAbilityModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312420CMm extends C09AY implements Function0<DowngradeAbilityModel> {
    public C312420CMm() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final DowngradeAbilityModel invoke() {
        DowngradeAbilityModel downgradeAbilityModel;
        try {
            Gson gson = C2104708Mj.LIZ;
            C844470XAv.LIZ.getClass();
            DowngradeAbilityModel downgradeAbilityModel2 = (DowngradeAbilityModel) gson.LJII(C08Q0.LIZLLL(C844470XAv.LIZ(), "downgrade_ability_config_string", (String) C312410CMl.LIZLLL.getValue()), DowngradeAbilityModel.class);
            C189200o6.m2constructorimpl(downgradeAbilityModel2);
            downgradeAbilityModel = downgradeAbilityModel2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            downgradeAbilityModel = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(downgradeAbilityModel) != null ? new DowngradeAbilityModel(true, 15000L, 200L, 3000L, 0L, 0L, 0L, 0L, false, true, false, true, false, true, 0L, true) : downgradeAbilityModel;
    }
}
