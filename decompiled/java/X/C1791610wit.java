package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionOfferPricing;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0wit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791610wit {
    public static final /* synthetic */ int LIZ = 0;

    public static IapProductDetail LIZ(AbstractC1791620wiu abstractC1791620wiu) {
        ArrayList arrayList;
        C1617230sBd c1617230sBd;
        String strCurrentRegionCode;
        IapProductDetail iapProductDetail = new IapProductDetail();
        iapProductDetail.productId = abstractC1791620wiu.LIZ;
        iapProductDetail.productType = abstractC1791620wiu.LIZIZ;
        iapProductDetail.title = abstractC1791620wiu.LIZJ;
        iapProductDetail.description = abstractC1791620wiu.LIZLLL;
        List<C1791630wiv> list = abstractC1791620wiu.LJFF;
        if (list == null) {
            arrayList = null;
        } else {
            int i = 10;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1791630wiv c1791630wiv : (ArrayList) list) {
                String str = c1791630wiv.LJFF;
                String str2 = c1791630wiv.LIZ;
                String str3 = c1791630wiv.LIZIZ;
                String str4 = c1791630wiv.LIZJ;
                List<C1791640wiw> list2 = c1791630wiv.LIZLLL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, i));
                for (C1791640wiw c1791640wiw : list2) {
                    arrayList2.add(new IapSubscriptionOfferPricing(c1791640wiw.mPrice, c1791640wiw.mPriceAmountMicros, c1791640wiw.mPriceCurrencyCode, c1791640wiw.LIZ, c1791640wiw.LIZIZ, c1791640wiw.LIZJ));
                }
                arrayList.add(new IapSubscriptionProduct(str, str2, str3, str4, arrayList2, c1791630wiv.LJ));
                i = 10;
            }
        }
        iapProductDetail.subscriptionOffer = arrayList;
        C1791650wix c1791650wix = abstractC1791620wiu.LJ;
        if (c1791650wix != null) {
            c1617230sBd = new C1617230sBd(c1791650wix.LIZIZ, c1791650wix.mPrice, c1791650wix.mPriceAmountMicros, c1791650wix.mPriceCurrencyCode);
        } else {
            c1617230sBd = null;
        }
        iapProductDetail.oneTimePurchaseProduct = c1617230sBd;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext == null || (strCurrentRegionCode = iHostAppContext.currentRegionCode()) == null) {
            strCurrentRegionCode = "";
        }
        iapProductDetail.countryCode = strCurrentRegionCode;
        return iapProductDetail;
    }
}
