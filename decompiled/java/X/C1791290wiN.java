package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionOfferPricing;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.iap.core.model.IAPProductDetail;
import com.bytedance.iap.core.model.IAPProductPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791290wiN {
    public static final C0KQW LIZ(EnumC1787180wbk enumC1787180wbk) {
        EnumC1792020wjY next;
        Iterator<EnumC1792020wjY> it2 = EnumC1792020wjY.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == enumC1787180wbk.getCode()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC1792020wjY enumC1792020wjY = next;
        if (enumC1792020wjY == null) {
            enumC1792020wjY = EnumC1792020wjY.UNDEFINED;
        }
        return new C0KQW(enumC1792020wjY, enumC1787180wbk.getMessage());
    }

    public static final Map<String, IapProductDetail> LIZIZ(List<IAPProductDetail> list) {
        long j;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IAPProductDetail iAPProductDetail : list) {
            String str2 = iAPProductDetail.requestProductId;
            Object arrayList = linkedHashMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str2, arrayList);
            }
            ((List) arrayList).add(iAPProductDetail);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            int i = 10;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str3 = (String) entry.getKey();
            List<IAPProductDetail> list2 = (List) entry.getValue();
            IAPProductDetail iAPProductDetail2 = (IAPProductDetail) C13LP.LJJJLL(list2);
            C1617230sBd c1617230sBd = null;
            String str4 = null;
            if (iAPProductDetail2 != null) {
                IapProductDetail iapProductDetail = new IapProductDetail();
                iapProductDetail.productId = str3;
                iapProductDetail.productType = iAPProductDetail2.LIZIZ.getValue();
                iapProductDetail.title = iAPProductDetail2.LIZJ;
                iapProductDetail.description = iAPProductDetail2.LIZLLL;
                iapProductDetail.countryCode = iAPProductDetail2.LJ;
                if (iAPProductDetail2.LIZIZ == EnumC1780720wRK.SUBSCRIPTION) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (IAPProductDetail iAPProductDetail3 : list2) {
                        String str5 = iAPProductDetail3.clientPayload;
                        String str6 = iAPProductDetail3.LJI;
                        String str7 = iAPProductDetail3.LJII;
                        String str8 = iAPProductDetail3.LJIIIIZZ;
                        C13BV c13bv = C13BV.INSTANCE;
                        List<IAPProductPrice> list3 = iAPProductDetail3.prices;
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, i));
                        for (IAPProductPrice iAPProductPrice : list3) {
                            arrayList4.add(new IapSubscriptionOfferPricing(iAPProductPrice.price, iAPProductPrice.LIZ, iAPProductPrice.priceCurrencyCode, "", 1, 0));
                        }
                        arrayList3.add(new IapSubscriptionProduct(str5, str8, str6, str7, arrayList4, c13bv));
                        i = 10;
                    }
                    iapProductDetail.subscriptionOffer = arrayList3;
                } else {
                    IAPProductDetail iAPProductDetail4 = (IAPProductDetail) C13LP.LJJJLL(list2);
                    if (iAPProductDetail4 != null) {
                        String str9 = iAPProductDetail4.clientPayload;
                        IAPProductPrice iAPProductPrice2 = (IAPProductPrice) C13LP.LJJJLL(iAPProductDetail4.prices);
                        if (iAPProductPrice2 != null) {
                            str4 = iAPProductPrice2.price;
                        }
                        String str10 = "";
                        if (str4 == null) {
                            str4 = "";
                        }
                        IAPProductPrice iAPProductPrice3 = (IAPProductPrice) C13LP.LJJJLL(iAPProductDetail4.prices);
                        if (iAPProductPrice3 != null) {
                            j = iAPProductPrice3.LIZ;
                        } else {
                            j = 0;
                        }
                        IAPProductPrice iAPProductPrice4 = (IAPProductPrice) C13LP.LJJJLL(iAPProductDetail4.prices);
                        if (iAPProductPrice4 != null && (str = iAPProductPrice4.priceCurrencyCode) != null) {
                            str10 = str;
                        }
                        c1617230sBd = new C1617230sBd(str9, str4, j, str10);
                    }
                    iapProductDetail.oneTimePurchaseProduct = c1617230sBd;
                }
                arrayList2.add(iapProductDetail);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList2) {
            linkedHashMap2.put(((IapProductDetail) obj).productId, obj);
        }
        return linkedHashMap2;
    }
}
