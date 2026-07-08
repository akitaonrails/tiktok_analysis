package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkLevelService;

/* JADX INFO: renamed from: X.0Zqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912260Zqa implements INetworkLevelService {
    public static final C912260Zqa LIZIZ = new C912260Zqa();
    public final /* synthetic */ INetworkLevelService LIZ = (INetworkLevelService) ServiceManager.get().getService(INetworkLevelService.class);

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public final C1411240mpO getNqeNetworkLevel() {
        return this.LIZ.getNqeNetworkLevel();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public final void init() {
        this.LIZ.init();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkLevelService
    public final void onTTNetNqeChanged(int i) {
        this.LIZ.onTTNetNqeChanged(i);
    }
}
