package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PMC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PMC extends C09AY implements Function0<Object> {
    public C0PMC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIILL() == 1);
    }
}
