package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20222914Ax extends C09AY implements Function0<IPNSDeviceConsentService> {
    public C20222914Ax() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IPNSDeviceConsentService invoke() {
        return ServiceManager.get().getService(IPNSDeviceConsentService.class);
    }
}
