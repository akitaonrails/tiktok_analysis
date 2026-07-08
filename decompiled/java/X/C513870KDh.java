package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import webcast.api.sub.OfferInfo;

/* JADX INFO: renamed from: X.0KDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513870KDh {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(OfferInfo offerInfo, PGCSubscriptionProductDetail pGCSubscriptionProductDetail) {
        String price;
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList;
        if (offerInfo.offerStartTimestamp != 0 && offerInfo.offerEndTimestamp != 0) {
            Locale localeLJ = C513890KDj.LJ();
            String str = DateFormat.getDateInstance(2, localeLJ).format(new Date(offerInfo.offerStartTimestamp * 1000));
            String str2 = DateFormat.getDateInstance(2, localeLJ).format(new Date(offerInfo.offerEndTimestamp * 1000));
            if (pGCSubscriptionProductDetail != null && (pricePhaseList = pGCSubscriptionProductDetail.getPricePhaseList()) != null && !pricePhaseList.isEmpty()) {
                PGCSubscriptionProductDetail.PricePhase pricePhase = (PGCSubscriptionProductDetail.PricePhase) C13LP.LJJLIIIJL(pricePhaseList);
                if (pricePhase == null || (price = pricePhase.getPrice()) == null) {
                    price = "";
                }
            } else {
                price = offerInfo.originalMoneyDisplay;
            }
            return C511520K4g.LJIIIIZZ(2131839495, str, str2, price);
        }
        if (!C513840KDe.LJIIIZ(offerInfo)) {
            return null;
        }
        C0KED c0ked = C0KE2.Companion;
        long j = offerInfo.offerType;
        c0ked.getClass();
        if (C0KED.LIZ(j) == C0KE2.FREE_TRIAL_7DAYS) {
            return C511520K4g.LJII(2131830311);
        }
        return C511520K4g.LJII(2131830313);
    }
}
