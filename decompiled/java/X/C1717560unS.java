package X;

import com.ss.android.ugc.aweme.component.verify.PinApi;
import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionInterceptorForValue;

/* JADX INFO: renamed from: X.0unS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717560unS {
    public static final /* synthetic */ C1717560unS LIZ = new C1717560unS();

    public static PinApi LIZ(String str, String str2, String str3) {
        if (str.length() == 0) {
            return null;
        }
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZ(new SessionInterceptorForValue(str2));
        interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
        interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(str3));
        return (PinApi) interfaceC1717730unjCreateBuilder.build().create(PinApi.class);
    }
}
