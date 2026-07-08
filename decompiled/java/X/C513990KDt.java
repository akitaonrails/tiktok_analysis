package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import webcast.api.sub.OfferInfo;

/* JADX INFO: renamed from: X.0KDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513990KDt {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(OfferInfo offerInfo, SubscriptionProductDetail subscriptionProductDetail) {
        String str;
        List<SubscriptionProductDetail.PricePhase> list;
        if (offerInfo.offerStartTimestamp != 0 && offerInfo.offerEndTimestamp != 0) {
            Locale localeLJ = C513900KDk.LJ();
            long j = offerInfo.offerStartTimestamp * 1000;
            SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
            String str2 = DateFormat.getDateInstance(2, localeLJ).format(new Date(j));
            String str3 = DateFormat.getDateInstance(2, localeLJ).format(new Date(offerInfo.offerEndTimestamp * 1000));
            if (subscriptionProductDetail != null && (list = subscriptionProductDetail.pricePhaseList) != null && !list.isEmpty()) {
                SubscriptionProductDetail.PricePhase pricePhase = (SubscriptionProductDetail.PricePhase) C13LP.LJJLIIIJL(list);
                if (pricePhase == null || (str = pricePhase.price) == null) {
                    str = "";
                }
            } else {
                str = offerInfo.originalMoneyDisplay;
            }
            return C497740JfY.LJIJJ(2131856513, str2, str3, str);
        }
        if (!C513940KDo.LJIIIZ(offerInfo)) {
            return null;
        }
        C0KEN c0ken = C0KE1.Companion;
        long j2 = offerInfo.offerType;
        c0ken.getClass();
        if (C0KEN.LIZ(j2) == C0KE1.FREE_TRIAL_7DAYS) {
            return C497740JfY.LJIJI(2131830311);
        }
        return C497740JfY.LJIJI(2131830313);
    }
}
