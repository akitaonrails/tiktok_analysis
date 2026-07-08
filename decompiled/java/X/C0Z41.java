package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z41, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z41 extends C09AY implements Function0<IMSaasHostOfflineDebugService> {
    public C0Z41() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMSaasHostOfflineDebugService invoke() {
        return PluggableExtentionKt.pluggableSpiForReal(IMSaasHostOfflineDebugService.class);
    }
}
