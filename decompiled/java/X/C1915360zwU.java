package X;

import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915360zwU extends C09AY implements Function0<IComplianceBusinessService> {
    public C1915360zwU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IComplianceBusinessService invoke() {
        return ServiceManager.get().getService(IComplianceBusinessService.class);
    }
}
