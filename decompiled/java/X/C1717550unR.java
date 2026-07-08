package X;

import com.ss.android.ugc.aweme.component.phone.PhoneApi;
import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.RiskInfoInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionInterceptorForValue;

/* JADX INFO: renamed from: X.0unR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717550unR {
    public static final /* synthetic */ C1717550unR LIZ = new C1717550unR();

    public static PhoneApi LIZ(String str, String str2, String str3) {
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZ(new RiskInfoInterceptor(str3));
        interfaceC1717730unjCreateBuilder.LIZ(new SessionInterceptorForValue(str2));
        interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
        interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(str3));
        interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
        return (PhoneApi) interfaceC1717730unjCreateBuilder.build().create(PhoneApi.class);
    }
}
