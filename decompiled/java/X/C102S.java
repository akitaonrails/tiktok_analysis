package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.102S, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102S extends C09AY implements Function0<IComplianceSettingsService> {
    public C102S() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IComplianceSettingsService invoke() {
        return ComplianceServiceProvider.LJJI();
    }
}
