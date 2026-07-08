package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStandardApi;
import com.ss.android.ugc.aweme.services.NetworkStandardApiImpl;

/* JADX INFO: renamed from: X.1BMD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BMD implements INetworkStandardApi {
    public static final C1BMD LIZIZ = new C1BMD();
    public final /* synthetic */ INetworkStandardApi LIZ = NetworkStandardApiImpl.createINetworkStandardApibyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public final void addEffectiveConnectionTypeChangedListener(C1BMO c1bmo) {
        this.LIZ.addEffectiveConnectionTypeChangedListener(c1bmo);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public final int getEffectiveConnectionType() {
        return this.LIZ.getEffectiveConnectionType();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public final void removeEffectiveConnectionTypeChangedListener(C1BMO c1bmo) {
        this.LIZ.removeEffectiveConnectionTypeChangedListener(c1bmo);
    }
}
