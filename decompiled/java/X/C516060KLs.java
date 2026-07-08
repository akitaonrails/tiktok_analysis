package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516060KLs {
    public static void LIZ(C0KM6 c0km6, C518080KTm c518080KTm) {
        C516010KLn c516010KLn = C516010KLn.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - c0km6.LIZ();
        Integer numValueOf = Integer.valueOf(c518080KTm.LIZIZ);
        Integer numValueOf2 = Integer.valueOf(c518080KTm.LIZJ);
        String str = c518080KTm.LJIIIZ;
        String strLIZJ = c0km6.LIZJ();
        c516010KLn.getClass();
        C516010KLn.LJIJJ(jCurrentTimeMillis, numValueOf, numValueOf2, str, false, strLIZJ, true);
    }

    public static void LIZIZ(C0KM6 c0km6, C518160KTu c518160KTu) {
        String strLIZ;
        List<IapSubscriptionProduct> list;
        C1617230sBd c1617230sBd;
        IapSubscriptionProduct iapSubscriptionProduct;
        Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapSubscribeFetchProductResult: ");
        sbLIZ.append(c518160KTu.LJIIJ);
        sbLIZ.append(", source: ");
        sbLIZ.append(c0km6.LIZJ());
        C20441214yg.LIZIZ("SubscribePaymentV2", C2188811AlT.LIZIZ(sbLIZ));
        if (map != null && !map.isEmpty()) {
            C516010KLn c516010KLn = C516010KLn.LIZ;
            long jCurrentTimeMillis = System.currentTimeMillis() - c0km6.LIZ();
            int size = map.size();
            boolean zIsAutoRenew = c0km6.isAutoRenew();
            String strLIZIZ = c0km6.LIZIZ();
            IapProductDetail iapProductDetail = (IapProductDetail) C13LP.LJJJLIIL(map.values());
            if (iapProductDetail == null || (((list = iapProductDetail.subscriptionOffer) == null || (iapSubscriptionProduct = (IapSubscriptionProduct) C13LP.LJJJLL(list)) == null || (strLIZ = iapSubscriptionProduct.LIZ()) == null) && ((c1617230sBd = iapProductDetail.oneTimePurchaseProduct) == null || (strLIZ = c1617230sBd.priceCurrencyCode) == null))) {
                strLIZ = "";
            }
            String strLIZJ = c0km6.LIZJ();
            c516010KLn.getClass();
            C516010KLn.LJIJJLI(size, jCurrentTimeMillis, strLIZIZ, strLIZ, strLIZJ, zIsAutoRenew, true);
            return;
        }
        C516010KLn c516010KLn2 = C516010KLn.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - c0km6.LIZ();
        Integer numValueOf = Integer.valueOf(c518160KTu.LIZIZ);
        Integer numValueOf2 = Integer.valueOf(c518160KTu.LIZJ);
        String str = c518160KTu.LJIIIZ;
        boolean zIsAutoRenew2 = c0km6.isAutoRenew();
        String strLIZJ2 = c0km6.LIZJ();
        c516010KLn2.getClass();
        C516010KLn.LJIJJ(jCurrentTimeMillis2, numValueOf, numValueOf2, str, zIsAutoRenew2, strLIZJ2, true);
    }
}
