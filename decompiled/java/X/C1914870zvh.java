package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914870zvh extends C09AY implements Function0<IPNSConsentCollectorService> {
    public C1914870zvh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPNSConsentCollectorService invoke() {
        IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentCollectorService.class, false, false, false, 14, null);
        if (iPNSConsentCollectorService == null) {
            return null;
        }
        ComplianceServiceProvider.LJIJI().LIZ();
        C0S78.LIZJ(new AwS572S0100000_28(iPNSConsentCollectorService, 161), true);
        return iPNSConsentCollectorService;
    }
}
