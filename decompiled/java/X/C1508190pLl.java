package X;

import com.ss.android.ugc.aweme.ecommerce.api.PDPNetworkControlConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508190pLl implements InterfaceC1508070pLZ {
    public long LIZ;
    public String LIZIZ = "";

    @Override // X.InterfaceC1508070pLZ
    public final String LIZJ() {
        return "touch";
    }

    @Override // X.InterfaceC1508070pLZ
    public final Pair<Boolean, String> LIZ() {
        PDPNetworkControlConfig pDPNetworkControlConfig = C1508200pLm.LIZ;
        PDPNetworkControlConfig pDPNetworkControlConfig2 = C1508200pLm.LIZ;
        boolean z = false;
        if (pDPNetworkControlConfig2 != null && pDPNetworkControlConfig2.disablePreloads && this.LIZ > 0 && System.currentTimeMillis() - this.LIZ < pDPNetworkControlConfig2.maxDelay) {
            z = true;
        }
        return new Pair<>(Boolean.valueOf(true ^ z), this.LIZIZ);
    }
}
