package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0POM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POM {
    public static final int LIZ(String str) {
        EnumC1876780ywG enumC1876780ywGLIZ;
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() != null && (enumC1876780ywGLIZ = C1915720zx4.LIZ(str, null)) != null) {
            return enumC1876780ywGLIZ.getI();
        }
        return EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE.getI();
    }
}
