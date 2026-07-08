package Y;

import X.AbstractC19484711Kz;
import X.C11RK;
import X.C163A;
import X.InterfaceC1487280oo2;
import X.InterfaceC500500Jk0;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: loaded from: classes32.dex */
public class AkS108S1100000_31 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS108S1100000_31 akS108S1100000_31, Object obj) {
        final EnigmaProductsResponse.Data data = (EnigmaProductsResponse.Data) obj;
        List<EnigmaProductsResponse.Data.EnigmaIAPProductDetails> list = data.enigmaProductDetails;
        ArrayList arrayList = new ArrayList();
        for (EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails : list) {
            if (!enigmaIAPProductDetails.isSubscription) {
                arrayList.add(enigmaIAPProductDetails);
            }
        }
        List<EnigmaProductsResponse.Data.EnigmaIAPProductDetails> list2 = data.enigmaProductDetails;
        ArrayList arrayList2 = new ArrayList();
        for (EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails2 : list2) {
            if (enigmaIAPProductDetails2.isSubscription) {
                arrayList2.add(enigmaIAPProductDetails2);
            }
        }
        return AbstractC19484711Kz.LJJJ(((EnigmaPurchaseService) akS108S1100000_31.l1).LIZ(akS108S1100000_31.s0, "inapp", arrayList), ((EnigmaPurchaseService) akS108S1100000_31.l1).LIZ(akS108S1100000_31.s0, "subs", arrayList2), new InterfaceC500500Jk0() { // from class: X.15P0
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj2, Object obj3) {
                Map mapLJIIL = C2097608Jq.LJIIL((Map) obj2, (Map) obj3);
                EnigmaProductsResponse.Data data2 = data;
                List<EnigmaProductsResponse.Data.EnigmaIAPProductDetails> list3 = data2.enigmaProductDetails;
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                for (EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails3 : list3) {
                    IapProductDetail iapProductDetail = (IapProductDetail) ((LinkedHashMap) mapLJIIL).get(enigmaIAPProductDetails3.mpSkuId);
                    if (iapProductDetail != null) {
                        arrayList3.add(new C00DO(enigmaIAPProductDetails3, iapProductDetail, data2.remainingSubscriptionDays));
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Missing Play product detail for ");
                        sbLIZ.append(enigmaIAPProductDetails3.mpSkuId);
                        throw new C2197981B0q(C2188811AlT.LIZIZ(sbLIZ), null);
                    }
                }
                return arrayList3;
            }
        });
    }

    public static final Object apply$1(AkS108S1100000_31 akS108S1100000_31, Object obj) {
        ((C163A) akS108S1100000_31.l1).LIZJ.remove(akS108S1100000_31.s0);
        C11RK<Boolean> c11rkRemove = ((C163A) akS108S1100000_31.l1).LIZLLL.remove(akS108S1100000_31.s0);
        if (c11rkRemove != null) {
            c11rkRemove.onNext(obj);
            c11rkRemove.onComplete();
        }
        return obj;
    }

    public AkS108S1100000_31(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
