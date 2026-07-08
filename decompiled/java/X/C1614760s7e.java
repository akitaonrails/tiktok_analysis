package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614760s7e {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(VipSubscriptionDetailResponse vipSubscriptionDetailResponse, String str, List list, Map map) {
        Object next;
        String str2;
        VipSubscriptionPrice vipSubscriptionPrice;
        VipSubscriptionPrice vipSubscriptionPrice2;
        Object next2;
        String str3;
        String str4;
        VipSubscriptionPrice vipSubscriptionPrice3;
        String str5;
        String str6;
        List<VipSubscriptionPurchaseOption> list2 = vipSubscriptionDetailResponse.subsOptions;
        ArrayList arrayList = new ArrayList();
        Iterator<VipSubscriptionPurchaseOption> it2 = list2.iterator();
        while (true) {
            String str7 = "";
            if (!it2.hasNext()) {
                break;
            }
            VipSubscriptionPurchaseOption next3 = it2.next();
            VipSubscriptionPrice vipSubscriptionPrice4 = next3.price;
            if (vipSubscriptionPrice4 != null && (str6 = vipSubscriptionPrice4.basePlanId) != null) {
                str7 = str6;
            }
            if (str7.length() > 0) {
                arrayList.add(next3);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                VipSubscriptionPrice vipSubscriptionPrice5 = ((VipSubscriptionPurchaseOption) next).price;
                if (vipSubscriptionPrice5 != null) {
                    str5 = vipSubscriptionPrice5.basePlanId;
                } else {
                    str5 = null;
                }
                if (Intrinsics.LJFF(str5, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption = (VipSubscriptionPurchaseOption) next;
        if (vipSubscriptionPurchaseOption == null || (vipSubscriptionPrice3 = vipSubscriptionPurchaseOption.price) == null || (str2 = vipSubscriptionPrice3.discountPriceInUsd) == null) {
            VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption2 = (VipSubscriptionPurchaseOption) C13LP.LJJJLL(arrayList);
            if (vipSubscriptionPurchaseOption2 != null && (vipSubscriptionPrice2 = vipSubscriptionPurchaseOption2.price) != null) {
                str2 = vipSubscriptionPrice2.discountPriceInUsd;
            } else {
                VipSubscriptionPurchaseOption vipSubscriptionPurchaseOption3 = (VipSubscriptionPurchaseOption) C13LP.LJJJLL(arrayList);
                if (vipSubscriptionPurchaseOption3 == null || (vipSubscriptionPrice = vipSubscriptionPurchaseOption3.price) == null || (str2 = vipSubscriptionPrice.priceInUsd) == null) {
                    str2 = "";
                }
            }
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next2 = it4.next();
                VipSubscriptionPrice vipSubscriptionPrice6 = ((C1612820s4W) next2).LIZJ;
                if (vipSubscriptionPrice6 != null) {
                    str4 = vipSubscriptionPrice6.basePlanId;
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(str4, str)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C1612820s4W c1612820s4W = (C1612820s4W) next2;
        if (c1612820s4W == null || (((str3 = c1612820s4W.LJ) == null || str3.length() == 0 || str3 == null) && (str3 = c1612820s4W.LIZLLL) == null)) {
            str3 = "";
        }
        String str8 = (String) map.get(str);
        if (str8 == null) {
            str8 = "";
        }
        if (str3.length() > 0) {
            return str3;
        }
        if (str8.length() > 0) {
            return str8;
        }
        if (str2.length() <= 0) {
            return "";
        }
        return Currency.getInstance("USD").getSymbol() + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1614790s7h LIZ(com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse r20, X.EnumC1614730s7b r21, java.lang.String r22, java.util.List r23, java.util.Map r24) {
        /*
            Method dump skipped, instruction units count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614760s7e.LIZ(com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse, X.0s7b, java.lang.String, java.util.List, java.util.Map):X.0s7h");
    }
}
