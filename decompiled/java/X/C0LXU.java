package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.CacheQuota;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;

/* JADX INFO: renamed from: X.0LXU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXU {
    public static CacheQuota LIZ(String str, boolean z) {
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        IAIGCQuotaService aIGCQuotaService;
        CacheQuota quotaCache;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (aIGCQuotaService = iExternalService.getAIGCQuotaService()) != null && (quotaCache = aIGCQuotaService.getQuotaCache(str, z)) != null) {
            return quotaCache;
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = "";
        }
        return new CacheQuota(0, 0, null, curUserId, true);
    }
}
