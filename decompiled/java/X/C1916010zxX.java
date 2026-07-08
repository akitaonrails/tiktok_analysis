package X;

import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916010zxX extends C09AY implements Function0<ITpcConsentService> {
    public C1916010zxX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ITpcConsentService invoke() {
        return ServiceManager.get().getService(ITpcConsentService.class);
    }
}
