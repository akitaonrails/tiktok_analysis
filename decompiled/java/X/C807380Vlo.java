package X;

import com.ss.android.ugc.aweme.network.spi.INetworkContextService;
import com.ss.android.ugc.aweme.services.NetworkContextService;

/* JADX INFO: renamed from: X.0Vlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807380Vlo implements INetworkContextService {
    public static final C807380Vlo LIZIZ = new C807380Vlo();
    public final /* synthetic */ INetworkContextService LIZ = NetworkContextService.createINetworkContextServicebyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkContextService
    public final C807390Vlp removeNetworkContext(String str) {
        return this.LIZ.removeNetworkContext(str);
    }
}
