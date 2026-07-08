package Y;

import X.AbstractC19484711Kz;
import X.C13BV;
import X.C15438062q;
import X.C1615330s8Z;
import X.C1615950s9Z;
import X.C1616770sAt;
import X.C1616830sAz;
import X.C1616850sB1;
import X.C1616880sB4;
import X.C2188811AlT;
import X.C518170KTv;
import X.EnumC1616780sAu;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.iap.component.api.Discount;
import com.ss.android.ugc.aweme.iap.component.api.PackageGroup;
import com.ss.android.ugc.aweme.iap.component.api.PackageInfo;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponent;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import com.ss.android.ugc.aweme.iap.component.api.PaymentProps;
import com.ss.android.ugc.aweme.iap.component.api.UnifiedPackage;
import com.ss.android.ugc.aweme.iap.component.api.UnifiedPricePacket;
import com.ss.android.ugc.aweme.iap.component.api.UnifiedPurchaseOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public class AkS201S0300000_24 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    public static final Object apply$0(AkS201S0300000_24 akS201S0300000_24, Object obj) {
        ?? arrayList;
        AbstractC19484711Kz abstractC19484711KzLJIJJLI;
        List list;
        String str;
        String str2;
        String str3;
        PaymentProps paymentProps;
        PackageInfo packageInfo;
        PaymentComponentResponse paymentComponentResponse = (PaymentComponentResponse) obj;
        if (((C1616880sB4) akS201S0300000_24.l0).LIZIZ == EnumC1616780sAu.SUBSCRIPTION) {
            ((C1616850sB1) akS201S0300000_24.l1).getClass();
            PaymentComponent paymentComponent = paymentComponentResponse.component;
            if (paymentComponent == null || (paymentProps = paymentComponent.props) == null || (packageInfo = paymentProps.packageInfo) == null || (list = packageInfo.packageGroups) == null) {
                list = C13BV.INSTANCE;
            }
            if (list.isEmpty()) {
                arrayList = C13BV.INSTANCE;
            } else {
                arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Iterator<UnifiedPackage> it3 = ((PackageGroup) it2.next()).packages.iterator();
                    while (it3.hasNext()) {
                        for (UnifiedPurchaseOption unifiedPurchaseOption : it3.next().options) {
                            Integer num = unifiedPurchaseOption.optionType;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                UnifiedPricePacket unifiedPricePacket = unifiedPurchaseOption.price;
                                if (unifiedPricePacket != null && (str = unifiedPricePacket.iapId) != null && str.length() > 0) {
                                    Discount discount = unifiedPricePacket.discount;
                                    if (discount != null) {
                                        str2 = discount.discountIapId;
                                    } else {
                                        str2 = null;
                                    }
                                    String str4 = unifiedPricePacket.googleBasePlanId;
                                    if (discount != null) {
                                        str3 = discount.promotionOfferId;
                                    } else {
                                        str3 = null;
                                    }
                                    arrayList.add(new C1615330s8Z(iIntValue, str, str2, str4, str3, unifiedPurchaseOption.cycleType, unifiedPurchaseOption.isAutoRenew));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C1615330s8Z c1615330s8Z : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(optionType=");
            sbLIZ.append(c1615330s8Z.LIZ);
            sbLIZ.append(", iapId=");
            sbLIZ.append(c1615330s8Z.LIZIZ);
            sbLIZ.append(", discountIapId=");
            sbLIZ.append(c1615330s8Z.LIZJ);
            sbLIZ.append(", basePlanId=");
            sbLIZ.append(c1615330s8Z.LIZLLL);
            sbLIZ.append(", offerId=");
            sbLIZ.append(c1615330s8Z.LJ);
            sbLIZ.append(", cycleType=");
            sbLIZ.append(c1615330s8Z.LJFF);
            sbLIZ.append(", isAutoRenew=");
            sbLIZ.append(c1615330s8Z.LJI);
            sbLIZ.append(')');
            arrayList2.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!arrayList.isEmpty()) {
            long jLJ = C518170KTv.LJ("prefetch_iap_product_detail", null, null, null, (Map) akS201S0300000_24.l2, 30);
            abstractC19484711KzLJIJJLI = C1616770sAt.LIZIZ(arrayList, ((C1616880sB4) akS201S0300000_24.l0).LIZIZ).LJIL(new InterfaceC1487280oo2() { // from class: X.0s8a
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    return ((C1616800sAw) obj2).LIZ;
                }
            }).LJIILL(new AfS3S0100100_7(jLJ, (Map) akS201S0300000_24.l2, 1)).LJIIL(new AfS3S0100100_7(jLJ, (Map) akS201S0300000_24.l2, 2));
        } else {
            abstractC19484711KzLJIJJLI = AbstractC19484711Kz.LJIJJLI(C13BV.INSTANCE);
        }
        return abstractC19484711KzLJIJJLI.LJIL(new AkS201S0300000_24((C1616880sB4) akS201S0300000_24.l0, (C1616850sB1) akS201S0300000_24.l1, paymentComponentResponse, 1));
    }

    public static final Object apply$1(AkS201S0300000_24 akS201S0300000_24, Object obj) {
        List<C1616830sAz> list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1616830sAz c1616830sAz : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(optionType=");
            sbLIZ.append(c1616830sAz.LIZ);
            sbLIZ.append(", iapId=");
            sbLIZ.append(c1616830sAz.LIZIZ);
            sbLIZ.append(", discountIapId=");
            sbLIZ.append(c1616830sAz.LIZJ);
            sbLIZ.append(", basePlanId=");
            sbLIZ.append(c1616830sAz.LJIIIZ);
            sbLIZ.append(", offerId=");
            sbLIZ.append(c1616830sAz.LJIIJ);
            sbLIZ.append(", localPriceAmount=");
            sbLIZ.append(c1616830sAz.LIZLLL);
            sbLIZ.append(", discountedLocalPriceAmount=");
            sbLIZ.append(c1616830sAz.LJ);
            sbLIZ.append(", currencyCode=");
            sbLIZ.append(c1616830sAz.LJFF);
            sbLIZ.append(", cycleType=");
            sbLIZ.append(c1616830sAz.LJIIJJI);
            sbLIZ.append(", isAutoRenew=");
            sbLIZ.append(c1616830sAz.LJIIL);
            sbLIZ.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        EnumC1616780sAu enumC1616780sAu = ((C1616880sB4) akS201S0300000_24.l0).LIZIZ;
        EnumC1616780sAu enumC1616780sAu2 = EnumC1616780sAu.SUBSCRIPTION;
        if (enumC1616780sAu == enumC1616780sAu2 && (!list.isEmpty())) {
            ((C1616850sB1) akS201S0300000_24.l1).LIZ(enumC1616780sAu2.getValue(), list);
        }
        return new C1615950s9Z((PaymentComponentResponse) akS201S0300000_24.l2, null);
    }

    public AkS201S0300000_24(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
