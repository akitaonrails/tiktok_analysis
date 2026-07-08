package X;

import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011470cQb extends C09AY implements Function0<ICRouterManager> {
    public C1011470cQb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICRouterManager invoke() {
        return ServiceManager.get().getService(ICRouterManager.class);
    }
}
