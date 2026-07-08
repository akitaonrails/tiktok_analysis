package X;

import com.ss.android.ugc.aweme.foundation.network.PipoAccountApi;
import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import defpackage.PipoPaRetrofitRefactorConfigSettings;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0unU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717580unU {
    public static final /* synthetic */ C1717580unU LIZ = new C1717580unU();
    public static final Map<String, PipoAccountApi> LIZIZ = new HashMap();

    public static PipoAccountApi LIZ(String str) {
        if (Intrinsics.LJFF(PipoPaRetrofitRefactorConfigSettings.LIZ().useCache, Boolean.TRUE)) {
            HashMap map = (HashMap) LIZIZ;
            PipoAccountApi pipoAccountApi = (PipoAccountApi) map.get(str);
            if (pipoAccountApi != null) {
                return pipoAccountApi;
            }
            InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
            interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
            interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(""));
            interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
            PipoAccountApi pipoAccountApi2 = (PipoAccountApi) interfaceC1717730unjCreateBuilder.build().create(PipoAccountApi.class);
            map.put(str, pipoAccountApi2);
            return pipoAccountApi2;
        }
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder2 = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder2.LIZ(new CommonParamInterceptor());
        interfaceC1717730unjCreateBuilder2.LIZIZ(new SessionExpiredHandler(""));
        interfaceC1717730unjCreateBuilder2.LIZIZ(new NetworkMonitorHandler());
        return (PipoAccountApi) interfaceC1717730unjCreateBuilder2.build().create(PipoAccountApi.class);
    }
}
