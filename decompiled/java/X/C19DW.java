package X;

import com.ss.android.ugc.aweme.compliance.api.services.userbehavior.IUITransitionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19DW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DW extends C09AY implements Function0<IUITransitionService> {
    public C19DW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.userbehavior.IUITransitionService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IUITransitionService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IUITransitionService.class, false, false, false, 14, null);
    }
}
