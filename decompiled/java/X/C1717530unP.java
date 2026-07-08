package X;

import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeApi;
import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.AgentBridgeMockHeaderInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0unP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717530unP {
    public static final /* synthetic */ C1717530unP LIZ = new C1717530unP();

    public static AgentBridgeApi LIZ(String str, String str2) {
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
        if (Intrinsics.LJFF(str2, "1")) {
            interfaceC1717730unjCreateBuilder.LIZ(AgentBridgeMockHeaderInterceptor.LL);
        }
        interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(""));
        interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
        return (AgentBridgeApi) interfaceC1717730unjCreateBuilder.build().create(AgentBridgeApi.class);
    }
}
