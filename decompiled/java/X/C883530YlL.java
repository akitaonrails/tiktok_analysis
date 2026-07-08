package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883530YlL extends C09AY implements Function0<Integer> {
    public C883530YlL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        IMNetworkSaasApi.LIZ.getClass();
        IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
        return Integer.valueOf(iMNetworkSaasApiLIZ != null ? iMNetworkSaasApiLIZ.getNqeNetworkLevel() : 0);
    }
}
