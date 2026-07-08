package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.RouteIntent;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523400pkI extends AbstractC1547260qMm {
    public static final C1523400pkI LL = new C1523400pkI();
    public static final WeakHashMap<SparkContext, Object> LLILLJJLI = new WeakHashMap<>();

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        String strLIZJ;
        if (routeIntent != null && (url = routeIntent.getUrl()) != null && (strLIZJ = C2011207uI.LIZJ(C1946007jm.LJ(url), "spark_preload_compat")) != null && Intrinsics.LJFF(strLIZJ, "1")) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        String strLIZJ;
        if (str != null && (strLIZJ = C2011207uI.LIZJ(C1946007jm.LJ(str), "spark_preload_compat")) != null && Intrinsics.LJFF(strLIZJ, "1")) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String str) {
        super.handleSparkContext(sparkContext, str);
        if (LLILLJJLI.put(sparkContext, new Object()) != null) {
            return;
        }
        sparkContext.LJJJJZ(new C1151910g57(sparkContext, 1));
    }
}
