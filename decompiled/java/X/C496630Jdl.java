package X;

import com.bytedance.android.livesdk.chatroom.model.EcomLiveUserStats;
import com.bytedance.android.livesdk.chatroom.model.GetUserInteractionSummaryResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Jdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496630Jdl {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(GetUserInteractionSummaryResponse.ResponseData responseData) {
        String str;
        long j = 0;
        switch (responseData.summaryType) {
            case 1:
                return String.valueOf(responseData.watchDuration);
            case 2:
            default:
                return CardStruct.IStatusCode.DEFAULT;
            case 3:
                return String.valueOf(responseData.commentCount);
            case 4:
                return String.valueOf(responseData.shareCount);
            case 5:
                return String.valueOf(responseData.likeCount);
            case 6:
                EcomLiveUserStats ecomLiveUserStats = responseData.ecomLiveUserStats;
                if (ecomLiveUserStats != null) {
                    j = ecomLiveUserStats.purchasedProductsCount;
                }
                return String.valueOf(j);
            case 7:
                EcomLiveUserStats ecomLiveUserStats2 = responseData.ecomLiveUserStats;
                if (ecomLiveUserStats2 != null) {
                    j = ecomLiveUserStats2.viewedProductsCount;
                }
                return String.valueOf(j);
            case 8:
                EcomLiveUserStats ecomLiveUserStats3 = responseData.ecomLiveUserStats;
                if (ecomLiveUserStats3 != null) {
                    j = ecomLiveUserStats3.productsAddedToCartCount;
                }
                return String.valueOf(j);
            case BdTuring.TYPE_ECAF /* 9 */:
                EcomLiveUserStats ecomLiveUserStats4 = responseData.ecomLiveUserStats;
                if (ecomLiveUserStats4 != null && (str = ecomLiveUserStats4.totalSpending) != null) {
                    return str;
                }
                return "";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                EcomLiveUserStats ecomLiveUserStats5 = responseData.ecomLiveUserStats;
                if (ecomLiveUserStats5 != null) {
                    j = ecomLiveUserStats5.bidAttempts;
                }
                return String.valueOf(j);
        }
    }

    public static String LIZIZ(GetUserInteractionSummaryResponse.ResponseData responseData) {
        switch (responseData.summaryType) {
            case 1:
                return "watch_duration";
            case 2:
                return "gift";
            case 3:
                return "comment";
            case 4:
                return "share";
            case 5:
                return "like";
            case 6:
                return "purchased";
            case 7:
                return "product_view";
            case 8:
                return "add_to_cart";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "total_spending";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "bid_attempts";
            default:
                return "";
        }
    }
}
