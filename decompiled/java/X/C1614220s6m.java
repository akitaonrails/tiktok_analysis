package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.components.purchaseoption.MarketplacePurchaseCategory;
import com.ss.android.ugc.aweme.model.PurchaseCategory;

/* JADX INFO: renamed from: X.0s6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1614220s6m {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PurchaseCategory.values().length];
        try {
            iArr[PurchaseCategory.PURCHASE_CATEGORY_ENTIRE_COLLECTION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[PurchaseCategory.PURCHASE_CATEGORY_REMAINING_VIDEOS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        MarketplacePurchaseCategory.values();
        try {
            MarketplacePurchaseCategory.MARKETPLACE_PURCHASE_CATEGORY_ALL.ordinal();
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            MarketplacePurchaseCategory.MARKETPLACE_PURCHASE_CATEGORY_REMAINING.ordinal();
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
