package X;

import com.bytedance.sdk.account.idv.IDVReplayInterceptor;
import com.ss.android.ugc.aweme.account.network.IAccountNetworkApi;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2207908kv extends C09AY implements Function0<IAccountNetworkApi> {
    public C2207908kv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.account.network.IAccountNetworkApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAccountNetworkApi invoke() {
        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(NetworkProxyAccount.LIZIZ);
        c1499850p8J.LIZ(IDVReplayInterceptor.LL);
        return c1499850p8J.build().retrofit.LIZ(IAccountNetworkApi.class);
    }
}
