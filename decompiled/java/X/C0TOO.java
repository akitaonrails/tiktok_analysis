package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TOO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TOO extends C09AY implements Function0<IComplianceSettingsService> {
    public C0TOO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IComplianceSettingsService invoke() {
        return ComplianceServiceProvider.LJJI();
    }
}
