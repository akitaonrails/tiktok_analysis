package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841200WzG extends C09AY implements Function0<Set<? extends String>> {
    public C841200WzG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        Set<String> set;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        return (networkConfigNetworkConfigOrNull == null || (set = networkConfigNetworkConfigOrNull.thirdPartySDKCallSite) == null) ? C08CX.INSTANCE : set;
    }
}
