package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Drs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269221Drs extends C09AY implements Function0<IAVServiceProxy> {
    public C2269221Drs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.services.IAVServiceProxy, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAVServiceProxy invoke() {
        ?? service = ServiceManager.get().getService(IAVServiceProxy.class);
        if (service != 0) {
            return service;
        }
        throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
    }
}
