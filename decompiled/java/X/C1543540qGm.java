package X;

import com.bytedance.sdk.xbridge.services.IXBridgeDowngraderService;
import com.bytedance.sdk.xbridge.services.IXBridgeDowngraderServiceProvider;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543540qGm {
    public final ConcurrentHashMap<String, InterfaceC1543620qGu> LIZ = new ConcurrentHashMap<>();
    public final IXBridgeDowngraderService LIZIZ;

    public C1543540qGm() {
        C587540N2q.LIZ.getClass();
        IXBridgeDowngraderServiceProvider iXBridgeDowngraderServiceProvider = (IXBridgeDowngraderServiceProvider) C587540N2q.LIZ(IXBridgeDowngraderServiceProvider.class);
        this.LIZIZ = iXBridgeDowngraderServiceProvider != null ? iXBridgeDowngraderServiceProvider.provideIXBridgeDowngraderService() : null;
    }
}
