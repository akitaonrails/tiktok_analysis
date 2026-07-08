package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739460vMm extends AbstractC1547260qMm {
    public boolean LL;
    public long LLILLJJLI;

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (!this.LL || routeIntent == null || (url = routeIntent.getUrl()) == null) {
            return false;
        }
        String strLJI = "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list";
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ec_live_shopping_bag_match_pattern_url", "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!a0.LJJIIZI(url, strLJI, false)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final boolean matchInterceptRules(String str) {
        if (!this.LL || str == null) {
            return false;
        }
        String strLJI = "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list";
        try {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ec_live_shopping_bag_match_pattern_url", "fe_tiktok_ecommerce_live_room_shop_bag%2Fpages%2Fproduct-list");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!a0.LJJIIZI(str, strLJI, false)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1547260qMm, com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor
    public final void handleSparkContext(SparkContext sparkContext, String str) {
        super.handleSparkContext(sparkContext, str);
        sparkContext.LJJJJZI(new C21525119Lt(this, 1));
    }
}
