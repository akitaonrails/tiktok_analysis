package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916940zz2 extends C09AY implements Function0<IComplianceSettingsService> {
    public C1916940zz2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IComplianceSettingsService invoke() {
        return ComplianceServiceProvider.LJJI();
    }
}
