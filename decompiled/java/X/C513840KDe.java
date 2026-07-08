package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513840KDe {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(List list) {
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (LJIILIIL((PGCSubscriptionProductDetailWithTemplateInfo) it2.next())) {
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
            PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) it2.next();
            if (LJIILIIL(pGCSubscriptionProductDetailWithTemplateInfo)) {
                TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo == null) {
                    return null;
                }
                return templateInfo.offerInfo;
            }
        }
        return null;
    }

    public static String LJIIIIZZ(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        String str;
        TemplateInfo templateInfo;
        TemplateInfo templateInfo2;
        PGCSubscriptionProductDetail subscriptionProductDetail;
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList;
        PGCSubscriptionProductDetail.PricePhase pricePhase;
        String price;
        String str2 = null;
        if (pGCSubscriptionProductDetailWithTemplateInfo == null || (subscriptionProductDetail = pGCSubscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail()) == null || (pricePhaseList = subscriptionProductDetail.getPricePhaseList()) == null || (pricePhase = (PGCSubscriptionProductDetail.PricePhase) C13LP.LJJJLZIJ(pricePhaseList.size() - 1, pricePhaseList)) == null || (price = pricePhase.getPrice()) == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                str = templateInfo2.currency;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            if (pGCSubscriptionProductDetailWithTemplateInfo != null && (templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                str2 = templateInfo.amount;
            }
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return price;
    }

    public static boolean LJIIIZ(OfferInfo offerInfo) {
        long j;
        long j2;
        C0KEC c0kec = EnumC514030KDx.Companion;
        long j3 = 0;
        if (offerInfo != null) {
            j = offerInfo.campaignType;
        } else {
            j = 0;
        }
        c0kec.getClass();
        EnumC514030KDx enumC514030KDxLIZ = C0KEC.LIZ(j);
        if (C1697810uHb.LJIIJJI(EnumC514030KDx.COMMON, EnumC514030KDx.CUSTOM_PROMOTION).contains(enumC514030KDxLIZ)) {
            return true;
        }
        if (enumC514030KDxLIZ != EnumC514030KDx.ANNIVERSARY) {
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

    public static boolean LJIIJ(C0KDZ c0kdz) {
        if (c0kdz == C0KDZ.PAY_INPROGRESS) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        Integer numValueOf;
        List listLJIIJJI = C1697810uHb.LJIIJJI(3, 4, 5, 6);
        TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo != null) {
            numValueOf = Integer.valueOf(templateInfo.subCircle);
        } else {
            numValueOf = null;
        }
        return C13LP.LJJJJ(numValueOf, listLJIIJJI);
    }

    public static boolean LJIIL(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        OfferInfo offerInfo;
        long j;
        TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo != null) {
            offerInfo = templateInfo.offerInfo;
        } else {
            offerInfo = null;
        }
        C0KED c0ked = C0KE2.Companion;
        if (offerInfo != null) {
            j = offerInfo.offerType;
        } else {
            j = 0;
        }
        c0ked.getClass();
        if (C0KED.LIZ(j) == C0KE2.FREE_TRIAL_7DAYS) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        OfferInfo offerInfo;
        TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
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
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            String strLIZIZ = "";
            for (Object obj : (Iterable) ((Map.Entry) it2.next()).getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(obj);
                sbLIZ.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
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
                PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) it2.next();
                TemplateInfo templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo4 != null) {
                    str2 = templateInfo4.packageId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str) && (templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && templateInfo.shouldDisplay && (templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && templateInfo2.tplType == 1 && pGCSubscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail() != null && (templateInfo3 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null && (str3 = templateInfo3.basePlanId) != null && str3.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void LIZJ(List list, EnumC514050KDz enumC514050KDz) {
        C19719612Di.LJJIIJ(list, AFwS237S0000000_7.get$arr$(323), false);
        C19719612Di.LJJIIJ(list, AFwS237S0000000_7.get$arr$(324), true);
        if (enumC514050KDz != null) {
            if (enumC514050KDz == EnumC514050KDz.PRE_CHECK_STATUS_INCORRECT_ACCOUNT || enumC514050KDz == EnumC514050KDz.PRE_CHECK_STATUS_INCORRECT_APP_STORE_ACCOUNT || enumC514050KDz == EnumC514050KDz.PRE_CHECK_STATUS_INCORRECT_PAYMENT_CHANNEL || enumC514050KDz == EnumC514050KDz.PRE_CHECK_STATUS_UNKNOWN) {
                list.removeIf(new Predicate() { // from class: X.0KE4
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C518090KTn c518090KTn;
                        Map<String, C515620KKa> map;
                        TemplateInfo templateInfo = ((PGCSubscriptionProductDetailWithTemplateInfo) obj).getTemplateInfo();
                        if (templateInfo == null || (c518090KTn = C513470KBt.LIZJ) == null || (map = c518090KTn.LJIIJ) == null) {
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

    public static String LJ(PGCSubscriptionProductDetail.PricePhase pricePhase, int i) {
        long jLongValue;
        String price = pricePhase.getPrice();
        if (price == null) {
            price = "";
        }
        Long priceAmountMicros = pricePhase.getPriceAmountMicros();
        if (priceAmountMicros != null) {
            jLongValue = priceAmountMicros.longValue();
        } else {
            jLongValue = 0;
        }
        return C513890KDj.LJFF(i, jLongValue, price);
    }

    public static String LJFF(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, boolean z) {
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList;
        String strLJI;
        OfferInfo offerInfo;
        String str;
        PGCSubscriptionProductDetail subscriptionProductDetail = pGCSubscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail();
        if (subscriptionProductDetail != null) {
            pricePhaseList = subscriptionProductDetail.getPricePhaseList();
        } else {
            pricePhaseList = null;
        }
        if (LJIIJJI(pGCSubscriptionProductDetailWithTemplateInfo)) {
            if (pricePhaseList != null && !pricePhaseList.isEmpty()) {
                String strLJI2 = LJI(pGCSubscriptionProductDetailWithTemplateInfo, true, z);
                C01GW c01gw = C0K51.LIZ;
                if (strLJI2 != null && strLJI2.length() > 0) {
                    return strLJI2;
                }
                TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo == null || (str = templateInfo.moneyDisplay) == null) {
                    return "";
                }
                return str;
            }
            TemplateInfo templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo2 == null || (strLJI = templateInfo2.moneyDisplay) == null) {
                return "";
            }
            return strLJI;
        }
        if (pricePhaseList != null && !pricePhaseList.isEmpty()) {
            strLJI = LJI(pGCSubscriptionProductDetailWithTemplateInfo, false, z);
            if (strLJI == null) {
                return "";
            }
        } else if (LJIILIIL(pGCSubscriptionProductDetailWithTemplateInfo) && z) {
            TemplateInfo templateInfo3 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo3 == null || (offerInfo = templateInfo3.offerInfo) == null || (strLJI = offerInfo.discountMoneyDisplay) == null) {
                return "";
            }
        } else {
            TemplateInfo templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo4 == null || (strLJI = templateInfo4.moneyDisplay) == null) {
                return "";
            }
        }
        return strLJI;
    }

    public static String LJI(PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo, boolean z, boolean z2) {
        String str;
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList;
        int i;
        TemplateInfo templateInfo;
        PGCSubscriptionProductDetail subscriptionProductDetail = pGCSubscriptionProductDetailWithTemplateInfo.getSubscriptionProductDetail();
        if (subscriptionProductDetail != null && (pricePhaseList = subscriptionProductDetail.getPricePhaseList()) != null) {
            if (z && (templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()) != null) {
                i = templateInfo.renewalPeriod;
            } else {
                i = 1;
            }
            if (z2) {
                PGCSubscriptionProductDetail.PricePhase pricePhase = (PGCSubscriptionProductDetail.PricePhase) C13LP.LJJJLL(pricePhaseList);
                if (pricePhase != null) {
                    return LJ(pricePhase, i);
                }
                return null;
            }
            PGCSubscriptionProductDetail.PricePhase pricePhase2 = (PGCSubscriptionProductDetail.PricePhase) C13LP.LJJLIIIJL(pricePhaseList);
            if (pricePhase2 != null) {
                return LJ(pricePhase2, i);
            }
            return null;
        }
        TemplateInfo templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
        if (templateInfo2 == null || (str = templateInfo2.moneyDisplay) == null) {
            return "";
        }
        return str;
    }
}
