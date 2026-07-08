package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: renamed from: X.15ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20621015ma {
    public final String LIZ;
    public final EnumC325100Com LIZIZ;

    public AbstractC20621015ma(String str) {
        EnumC325100Com networkStatus = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        this.LIZ = str;
        this.LIZIZ = networkStatus;
    }
}
