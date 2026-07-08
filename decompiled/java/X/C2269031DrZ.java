package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.CacheQuota;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.1DrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269031DrZ extends C09AY implements Function0<C554390Loj> {
    public C2269031DrZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Loj] */
    @Override // kotlin.jvm.functions.Function0
    public final C554390Loj invoke() {
        return new IAIGCQuotaService() { // from class: X.0Loj
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(434));

            @Override // com.ss.android.ugc.aweme.services.external.IAIGCQuotaService
            public final CacheQuota getQuotaCache(String str, boolean z) {
                String curUserId;
                AccountUserService accountUserServiceLJIIJ;
                String curUserId2;
                AccountUserService accountUserServiceLJIIJ2;
                CacheQuota cacheQuotaLIZLLL;
                C554380Loi c554380Loi = (C554380Loi) this.LIZ.getValue();
                c554380Loi.getClass();
                int iLIZIZ = 0;
                if (str.length() != 0 && c554380Loi.LIZLLL(str) != null) {
                    synchronized (c554380Loi) {
                        try {
                            InterfaceC554410Lol interfaceC554410LolLIZLLL = c554380Loi.LIZLLL(str);
                            if (interfaceC554410LolLIZLLL != null && (cacheQuotaLIZLLL = interfaceC554410LolLIZLLL.LIZLLL()) != null && c554380Loi.LJ(str)) {
                                return cacheQuotaLIZLLL;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(", invalid quota");
                            C201955140j.LJFF("AIGCQuotaManager", C2188811AlT.LIZIZ(sbLIZ));
                            InterfaceC554410Lol interfaceC554410LolLIZLLL2 = c554380Loi.LIZLLL(str);
                            if (interfaceC554410LolLIZLLL2 != null) {
                                iLIZIZ = interfaceC554410LolLIZLLL2.LIZIZ();
                            }
                            if (z) {
                                c554380Loi.LJFF(str, RefreshQuotaScene.INVALID_REFRESH);
                            }
                            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                            if (iAccountService != null && (accountUserServiceLJIIJ2 = iAccountService.LJIIJ()) != null) {
                                curUserId2 = accountUserServiceLJIIJ2.getCurUserId();
                            } else {
                                curUserId2 = "";
                            }
                            return new CacheQuota(iLIZIZ, iLIZIZ, null, curUserId2, true);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService2 != null && (accountUserServiceLJIIJ = iAccountService2.LJIIJ()) != null) {
                    curUserId = accountUserServiceLJIIJ.getCurUserId();
                } else {
                    curUserId = "";
                }
                return new CacheQuota(0, 0, null, curUserId, true);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAIGCQuotaService
            public final void refreshQuotaCache(String str, RefreshQuotaScene refreshQuotaScene) {
                ((C554380Loi) this.LIZ.getValue()).LJFF(str, refreshQuotaScene);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAIGCQuotaService
            public final void refreshQuotaCacheIfNeed(String str, RefreshQuotaScene refreshQuotaScene) {
                C554380Loi c554380Loi = (C554380Loi) this.LIZ.getValue();
                c554380Loi.getClass();
                if (str.length() != 0 && c554380Loi.LIZLLL(str) != null && c554380Loi.LJ) {
                    c554380Loi.LJFF(str, refreshQuotaScene);
                    c554380Loi.LJ = false;
                }
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAIGCQuotaService
            public final void cacheQuota(String str, Integer num, Integer num2) {
                ((C554380Loi) this.LIZ.getValue()).LIZ(str, num, num2);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IAIGCQuotaService
            public final Object checkQuotaBeforeGenerate(String str, RefreshQuotaScene refreshQuotaScene, InterfaceC1364105Vn<? super Pair<Integer, String>> interfaceC1364105Vn) {
                return ((C554380Loi) this.LIZ.getValue()).LIZIZ(str, interfaceC1364105Vn);
            }
        };
    }
}
