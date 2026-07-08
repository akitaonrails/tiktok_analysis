package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849630yET extends C09AY implements Function0<INetworkStateService> {
    public C1849630yET() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.network.spi.INetworkStateService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INetworkStateService invoke() {
        return ServiceManager.get().getService(INetworkStateService.class);
    }
}
