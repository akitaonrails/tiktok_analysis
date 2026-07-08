package X;

import Y.ARunnableS72S0200000_3;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.experiment.RiskyRetryRequestStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498890p6l extends C09AY implements Function0<Unit> {
    public C1498890p6l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IRetrofitFactory iRetrofitFactory;
        InterfaceC2661011f interfaceC2661011fLIZ;
        INetworkApi iNetworkApi;
        if (((RiskyRetryRequestStrategy) C1498900p6m.LIZIZ.getValue()).enableTestApi && (iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null)) != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ("https://api.tiktokv.com")) != null && (iNetworkApi = (INetworkApi) interfaceC2661011fLIZ.create(INetworkApi.class)) != null) {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = 10;
            C823050WQl.LIZLLL().execute(new ARunnableS72S0200000_3(c118300cf, iNetworkApi, 11));
        }
        return Unit.LIZ;
    }
}
