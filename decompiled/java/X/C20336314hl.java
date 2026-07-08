package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20336314hl extends C09AY implements Function0<OutreachOperationService> {
    public C20336314hl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.outreach.dispersion.spi.OutreachOperationService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final OutreachOperationService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(OutreachOperationService.class, false, false, false, 14, null);
    }
}
