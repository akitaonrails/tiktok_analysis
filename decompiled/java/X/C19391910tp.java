package X;

import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19391910tp extends C09AY implements Function0<IComplianceSettingsService> {
    public C19391910tp() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IComplianceSettingsService invoke() {
        return ServiceManager.get().getService(IComplianceSettingsService.class);
    }
}
