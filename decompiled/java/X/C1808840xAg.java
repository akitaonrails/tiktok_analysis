package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$ShopOrderStatus;

/* JADX INFO: renamed from: X.0xAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1808840xAg {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SeriesSubscriptionModels$ShopOrderStatus.values().length];
        try {
            iArr[SeriesSubscriptionModels$ShopOrderStatus.SHOP_ORDER_STATUS_DONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
