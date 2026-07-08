package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.180o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212152180o {
    public static final C01GW<EcShopBagBubbleNoImageSetting.EcShopBagBubbleNoImageConfig> LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(143));
    public final Keva LIZ = Keva.getRepo("ecommerce_live_shop_bag_bubble_preference");

    public final String[] LIZIZ() {
        try {
            return this.LIZ.getStringArray("bubble_shown_v2", new String[0]);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return new String[0];
        }
    }

    public final boolean LIZ() {
        String[] strArrLIZIZ = LIZIZ();
        int length = strArrLIZIZ.length;
        C01GW<EcShopBagBubbleNoImageSetting.EcShopBagBubbleNoImageConfig> c01gw = LIZIZ;
        if (length >= c01gw.getValue().maxTotalShowTimes) {
            return false;
        }
        if (c01gw.getValue().maxShowTimesInWindow <= 0 || c01gw.getValue().timeWindowDays <= 0) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) (((c01gw.getValue().timeWindowDays * 24) * 60) * 60)) * 1000);
        int i = 0;
        for (String str : strArrLIZIZ) {
            Long lLIZIZ = C1946707jt.LIZIZ(str);
            if (lLIZIZ == null) {
                return false;
            }
            if (lLIZIZ.longValue() < jCurrentTimeMillis) {
                break;
            }
            i++;
        }
        return i < LIZIZ.getValue().maxShowTimesInWindow;
    }
}
