package X;

import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513940KDo {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(List list) {
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (LJIILIIL((SubscriptionProductDetailWithTemplateInfo) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static String LIZLLL(TemplateInfo templateInfo) {
        Integer numValueOf;
        if (LJIILJJIL(templateInfo)) {
            if (templateInfo != null && templateInfo.renewalPeriod == 1) {
                return "auto_sub";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (templateInfo != null) {
                numValueOf = Integer.valueOf(templateInfo.renewalPeriod);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append("_month");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "one_month";
    }

    public static OfferInfo LJII(List list) {
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = (SubscriptionProductDetailWithTemplateInfo) it2.next();
            if (LJIILIIL(subscriptionProductDetailWithTemplateInfo)) {
                TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo == null) {
                    return null;
                }
                return templateInfo.offerInfo;
            }
        }
        return null;
    }

    public static String LJIIIIZZ(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        String str;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        SubscriptionProductDetail subscriptionProductDetail;
        List<SubscriptionProductDetail.PricePhase> list;
        SubscriptionProductDetail.PricePhase pricePhase;
        String str2;
        String str3 = null;
        if (subscriptionProductDetailWithTemplateInfo == null || (subscriptionProductDetail = subscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail()) == null || (list = subscriptionProductDetail.pricePhaseList) == null || (pricePhase = (SubscriptionProductDetail.PricePhase) C13LP.LJJJLZIJ(list.size() - 1, list)) == null || (str2 = pricePhase.price) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (subscriptionProductDetailWithTemplateInfo != null && (templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                str = templateInfo2.currency;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            if (subscriptionProductDetailWithTemplateInfo != null && (templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                str3 = templateInfo.amount;
            }
            sbLIZ.append(str3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str2;
    }

    public static boolean LJIIIZ(OfferInfo offerInfo) {
        long j;
        long j2;
        C0KEM c0kem = EnumC514040KDy.Companion;
        long j3 = 0;
        if (offerInfo != null) {
            j = offerInfo.campaignType;
        } else {
            j = 0;
        }
        c0kem.getClass();
        EnumC514040KDy enumC514040KDyLIZ = C0KEM.LIZ(j);
        if (C1697810uHb.LJIIJJI(EnumC514040KDy.COMMON, EnumC514040KDy.CUSTOM_PROMOTION).contains(enumC514040KDyLIZ)) {
            return true;
        }
        if (enumC514040KDyLIZ != EnumC514040KDy.ANNIVERSARY) {
            return false;
        }
        if (offerInfo != null) {
            j2 = offerInfo.offerStartTimestamp;
            j3 = offerInfo.offerEndTimestamp;
        } else {
            j2 = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j2 * 1000 > jCurrentTimeMillis || j3 * 1000 < jCurrentTimeMillis) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(EnumC513810KDb enumC513810KDb) {
        if (enumC513810KDb == EnumC513810KDb.PAY_INPROGRESS) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        Integer numValueOf;
        List listLJIIJJI = C1697810uHb.LJIIJJI(3, 4, 5, 6);
        TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo != null) {
            numValueOf = Integer.valueOf(templateInfo.subCircle);
        } else {
            numValueOf = null;
        }
        return C13LP.LJJJJ(numValueOf, listLJIIJJI);
    }

    public static boolean LJIIL(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        OfferInfo offerInfo;
        long j;
        TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo != null) {
            offerInfo = templateInfo.offerInfo;
        } else {
            offerInfo = null;
        }
        C0KEN c0ken = C0KE1.Companion;
        if (offerInfo != null) {
            j = offerInfo.offerType;
        } else {
            j = 0;
        }
        c0ken.getClass();
        if (C0KEN.LIZ(j) == C0KE1.FREE_TRIAL_7DAYS) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        OfferInfo offerInfo;
        TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo != null) {
            offerInfo = templateInfo.offerInfo;
        } else {
            offerInfo = null;
        }
        return LJIIIZ(offerInfo);
    }

    public static boolean LJIILJJIL(TemplateInfo templateInfo) {
        if (templateInfo != null && templateInfo.tplType == 2) {
            return true;
        }
        return false;
    }

    public static void LJIILL(Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("printPriceInfoMap, size=");
        sbLIZ.append(map.size());
        C20441214yg.LJIIIZ("SubscriptionProcessHandler", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : map.entrySet()) {
            String strLIZIZ = "";
            for (Object obj : (Iterable) entry.getValue()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(obj);
                sbLIZ2.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("package_id=");
            sbLIZ3.append((String) entry.getKey());
            sbLIZ3.append(" priceInfo=");
            sbLIZ3.append(strLIZIZ);
            C20441214yg.LJIIIZ("SubscriptionProcessHandler", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static boolean LIZIZ(String str, List list) {
        String str2;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        TemplateInfo templateInfo3;
        String str3;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = (SubscriptionProductDetailWithTemplateInfo) it2.next();
                TemplateInfo templateInfo4 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo4 != null) {
                    str2 = templateInfo4.packageId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str) && (templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && templateInfo.shouldDisplay && (templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && templateInfo2.tplType == 1 && subscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail() != null && (templateInfo3 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && (str3 = templateInfo3.basePlanId) != null && str3.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LIZJ(List list, PreCheckResult preCheckResult) {
        C19719612Di.LJJIIJ(list, new C0KEH(), false);
        C19719612Di.LJJIIJ(list, new C0KBQ(), true);
        if (preCheckResult != null) {
            int i = preCheckResult.status;
            if (i == 1 || i == 2) {
                list.removeIf(new Predicate() { // from class: X.0KE3
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C518090KTn c518090KTn;
                        Map<String, C515620KKa> map;
                        TemplateInfo templateInfo = ((SubscriptionProductDetailWithTemplateInfo) obj).getTemplateInfo();
                        if (templateInfo == null || (c518090KTn = C513500KBw.LIZJ) == null || (map = c518090KTn.LJIIJ) == null) {
                            return false;
                        }
                        if (!((HashMap) map).containsKey(templateInfo.iapId) || templateInfo.basePlanId.length() <= 0) {
                            return false;
                        }
                        return true;
                    }
                });
            }
        }
    }

    public static String LJ(SubscriptionProductDetail.PricePhase pricePhase, int i) {
        long jLongValue;
        String str = pricePhase.price;
        if (str == null) {
            str = "";
        }
        Long l = pricePhase.priceAmountMicros;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return C513900KDk.LJFF(i, jLongValue, str);
    }

    public static String LJFF(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, boolean z) {
        List<SubscriptionProductDetail.PricePhase> list;
        String strLJI;
        OfferInfo offerInfo;
        String str;
        SubscriptionProductDetail subscriptionProductDetail = subscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail();
        if (subscriptionProductDetail != null) {
            list = subscriptionProductDetail.pricePhaseList;
        } else {
            list = null;
        }
        if (LJIIJJI(subscriptionProductDetailWithTemplateInfo)) {
            if (list != null && !list.isEmpty()) {
                String strLJI2 = LJI(subscriptionProductDetailWithTemplateInfo, true, z);
                if (strLJI2 != null && strLJI2.length() > 0) {
                    return strLJI2;
                }
                TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo == null || (str = templateInfo.moneyDisplay) == null) {
                    return "";
                }
                return str;
            }
            TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo2 == null || (strLJI = templateInfo2.moneyDisplay) == null) {
                return "";
            }
            return strLJI;
        }
        if (list != null && !list.isEmpty()) {
            strLJI = LJI(subscriptionProductDetailWithTemplateInfo, false, z);
            if (strLJI == null) {
                return "";
            }
        } else if (LJIILIIL(subscriptionProductDetailWithTemplateInfo) && z) {
            TemplateInfo templateInfo3 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo3 == null || (offerInfo = templateInfo3.offerInfo) == null || (strLJI = offerInfo.discountMoneyDisplay) == null) {
                return "";
            }
        } else {
            TemplateInfo templateInfo4 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo4 == null || (strLJI = templateInfo4.moneyDisplay) == null) {
                return "";
            }
        }
        return strLJI;
    }

    public static String LJI(SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo, boolean z, boolean z2) {
        String str;
        List<SubscriptionProductDetail.PricePhase> list;
        int i;
        TemplateInfo templateInfo;
        SubscriptionProductDetail subscriptionProductDetail = subscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail();
        if (subscriptionProductDetail != null && (list = subscriptionProductDetail.pricePhaseList) != null) {
            if (z && (templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                i = templateInfo.renewalPeriod;
            } else {
                i = 1;
            }
            if (z2) {
                SubscriptionProductDetail.PricePhase pricePhase = (SubscriptionProductDetail.PricePhase) C13LP.LJJJLL(list);
                if (pricePhase != null) {
                    return LJ(pricePhase, i);
                }
                return null;
            }
            SubscriptionProductDetail.PricePhase pricePhase2 = (SubscriptionProductDetail.PricePhase) C13LP.LJJLIIIJL(list);
            if (pricePhase2 != null) {
                return LJ(pricePhase2, i);
            }
            return null;
        }
        TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo2 == null || (str = templateInfo2.moneyDisplay) == null) {
            return "";
        }
        return str;
    }
}
