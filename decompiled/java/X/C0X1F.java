package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X1F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1F extends C09AY implements Function0<IComplianceMonitorService> {
    public C0X1F() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IComplianceMonitorService invoke() {
        return ComplianceServiceProvider.LJIIZILJ();
    }
}
