package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import java.util.List;

/* JADX INFO: renamed from: X.0qMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1547260qMm implements ISparkRouterInterceptor {
    public static final C1547270qMn Companion = new Object() { // from class: X.0qMn
    };

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public void handleSparkContext(SparkContext sparkContext, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public boolean matchInterceptRules(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public List<InterfaceC2217701Bqy> provideSparkInterceptActivityCallbacks() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public List<InterfaceC2217711Bqz> provideSparkInterceptSAFCallbacks() {
        return C13BV.INSTANCE;
    }
}
