package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BannerCountdown;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionWaist;

/* JADX INFO: renamed from: X.03zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1025103zd {
    public static final FlashSale LIZ(GlobalWaistBanner globalWaistBanner) {
        long jLongValue;
        String strValueOf = String.valueOf(globalWaistBanner.countDown);
        String strValueOf2 = String.valueOf(SystemClock.elapsedRealtime());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l = globalWaistBanner.countDown;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return new FlashSale(null, 2, strValueOf, strValueOf2, String.valueOf(jElapsedRealtime + jLongValue), globalWaistBanner.title, null, null, null, null, null, 2, null, null);
    }

    public static final FlashSale LIZIZ(PromotionEntrance promotionEntrance) {
        return new FlashSale(null, promotionEntrance.flashSaleStatus, promotionEntrance.countdown, promotionEntrance.startTime, promotionEntrance.endTime, promotionEntrance.title, null, null, null, null, null, 2, null, null);
    }

    public static final FlashSale LIZJ(PromotionWaist promotionWaist) {
        BannerComponent bannerComponent;
        BannerCountdown bannerCountdown;
        BannerComponent bannerComponent2 = promotionWaist.tailComponent;
        if ((bannerComponent2 == null || (bannerCountdown = bannerComponent2.bannerCountdown) == null) && ((bannerComponent = promotionWaist.headComponent) == null || (bannerCountdown = bannerComponent.bannerCountdown) == null)) {
            return null;
        }
        return new FlashSale(null, Integer.valueOf(bannerCountdown.launchStatus), null, String.valueOf(bannerCountdown.startTime), String.valueOf(bannerCountdown.endTime), null, null, null, null, null, null, null, null, null);
    }
}
