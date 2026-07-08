package X;

import com.bytedance.router.RouteIntent;
import java.util.Collections;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549860qQy extends AbstractC1547260qMm {
    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final List<InterfaceC2217711Bqz> provideSparkInterceptSAFCallbacks() {
        return Collections.singletonList(new C1549840qQw());
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final List<InterfaceC2217701Bqy> provideSparkInterceptActivityCallbacks() {
        return C2190461Ao8.LIZIZ() ? Collections.singletonList(new C1549850qQx()) : Collections.singletonList(new C1549840qQw());
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        return u.LJJIIJZLJL(url, "aweme://echybrid/intercept_back", false);
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (str == null) {
            return false;
        }
        return u.LJJIIJZLJL(str, "aweme://echybrid/intercept_back", false);
    }
}
