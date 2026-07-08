package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915290zwN extends C09AY implements Function0<C1915720zx4> {
    public C1915290zwN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1915720zx4 invoke() {
        return ((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ();
    }
}
