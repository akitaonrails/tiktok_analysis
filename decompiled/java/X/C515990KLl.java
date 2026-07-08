package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515990KLl {
    public static void LIZ(C0KM5 c0km5, C518150KTt c518150KTt) {
        EnumC1792020wjY enumC1792020wjY;
        EnumC1792020wjY enumC1792020wjY2;
        String strLIZ;
        String upperCase;
        List<IapSubscriptionProduct> list;
        C1617230sBd c1617230sBd;
        IapSubscriptionProduct iapSubscriptionProduct;
        Integer numValueOf = null;
        if (c518150KTt.LIZ) {
            Map<String, IapProductDetail> map = c518150KTt.LIZIZ;
            if (map != null && !map.isEmpty()) {
                C516000KLm c516000KLm = C516000KLm.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - c0km5.LIZ();
                int size = map.size();
                boolean zIsAutoRenew = c0km5.isAutoRenew();
                String strLIZIZ = c0km5.LIZIZ();
                IapProductDetail iapProductDetail = (IapProductDetail) C13LP.LJJJLIIL(map.values());
                if (iapProductDetail == null || (((list = iapProductDetail.subscriptionOffer) == null || (iapSubscriptionProduct = (IapSubscriptionProduct) C13LP.LJJJLL(list)) == null || (strLIZ = iapSubscriptionProduct.LIZ()) == null) && ((c1617230sBd = iapProductDetail.oneTimePurchaseProduct) == null || (strLIZ = c1617230sBd.priceCurrencyCode) == null))) {
                    strLIZ = "";
                }
                String strLIZJ = c0km5.LIZJ();
                String showEntrance = c0km5.getShowEntrance();
                c516000KLm.getClass();
                if (strLIZIZ.length() == 0) {
                    upperCase = C516000KLm.LJFF.toUpperCase(Locale.ROOT);
                } else {
                    upperCase = strLIZIZ.toUpperCase(Locale.ROOT);
                }
                String upperCase2 = strLIZ.toUpperCase(Locale.ROOT);
                boolean zLJFF = Intrinsics.LJFF(Boolean.valueOf(!Intrinsics.LJFF(upperCase2, upperCase)), Boolean.TRUE);
                C1973307oB c1973307oB = C1973307oB.LIZ;
                C1973407oC c1973407oC = new C1973407oC("livesdk_subscription_tpl_iap_success");
                c1973407oC.LIZ("1", "is_from_pgc_subscription");
                c1973407oC.LIZ(showEntrance, "show_entrance");
                c1973407oC.LIZ(strLIZJ, "source");
                c1973407oC.LIZ(upperCase, "server_currency");
                c1973407oC.LIZ(upperCase2, "gp_currency");
                c1973407oC.LIZ(Integer.valueOf(zLJFF ? 1 : 0), "is_different_currency");
                c1973407oC.LIZ(Float.valueOf(jCurrentTimeMillis), "duration");
                c1973407oC.LIZ(Integer.valueOf(size), "tpl_count");
                c1973407oC.LIZ(Integer.valueOf(C516000KLm.LIZIZ(Boolean.valueOf(zIsAutoRenew))), "type");
                c1973407oC.LIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
                c1973407oC.LIZJ();
                return;
            }
            C516000KLm c516000KLm2 = C516000KLm.LIZ;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - c0km5.LIZ();
            C0KQW c0kqw = c518150KTt.LIZJ;
            if (c0kqw != null && (enumC1792020wjY2 = c0kqw.LIZ) != null) {
                numValueOf = Integer.valueOf(enumC1792020wjY2.getValue());
            }
            boolean zIsAutoRenew2 = c0km5.isAutoRenew();
            String strLIZJ2 = c0km5.LIZJ();
            String showEntrance2 = c0km5.getShowEntrance();
            c516000KLm2.getClass();
            C516000KLm.LJIJ(jCurrentTimeMillis2, numValueOf, strLIZJ2, showEntrance2, zIsAutoRenew2);
            return;
        }
        C516000KLm c516000KLm3 = C516000KLm.LIZ;
        long jCurrentTimeMillis3 = System.currentTimeMillis() - c0km5.LIZ();
        C0KQW c0kqw2 = c518150KTt.LIZJ;
        if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
            numValueOf = Integer.valueOf(enumC1792020wjY.getValue());
        }
        String strLIZJ3 = c0km5.LIZJ();
        String showEntrance3 = c0km5.getShowEntrance();
        c516000KLm3.getClass();
        C516000KLm.LJIJ(jCurrentTimeMillis3, numValueOf, strLIZJ3, showEntrance3, false);
    }
}
