package X;

import com.ss.android.ugc.aweme.foundation.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.foundation.network.interceptor.NetworkMonitorHandler;
import com.ss.android.ugc.aweme.foundation.network.interceptor.SessionExpiredHandler;
import com.ss.android.ugc.aweme.giftcard.network.GiftCardApi;

/* JADX INFO: renamed from: X.0unQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1717540unQ {
    public static final /* synthetic */ C1717540unQ LIZ = new C1717540unQ();

    public static GiftCardApi LIZ(String str) {
        InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
        interfaceC1717730unjCreateBuilder.LIZ(new CommonParamInterceptor());
        interfaceC1717730unjCreateBuilder.LIZIZ(new SessionExpiredHandler(""));
        interfaceC1717730unjCreateBuilder.LIZIZ(new NetworkMonitorHandler());
        return (GiftCardApi) interfaceC1717730unjCreateBuilder.build().create(GiftCardApi.class);
    }
}
