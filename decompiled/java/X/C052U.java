package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.052U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C052U extends C09AY implements Function0<IPNSDeviceConsentService> {
    public C052U() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPNSDeviceConsentService invoke() {
        return ServiceManager.get().getService(IPNSDeviceConsentService.class);
    }
}
