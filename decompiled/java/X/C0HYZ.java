package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYZ extends C09AY implements Function0<IPrivacyService> {
    public C0HYZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPrivacyService invoke() {
        return ComplianceServiceProvider.LJIJJ();
    }
}
