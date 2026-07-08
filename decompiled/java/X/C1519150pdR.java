package X;

import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519150pdR extends C09AY implements Function0<C1914170zuZ> {
    public C1519150pdR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1914170zuZ invoke() {
        IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
        if (iPolicyNoticeService != null) {
            return iPolicyNoticeService.LIZ();
        }
        return null;
    }
}
