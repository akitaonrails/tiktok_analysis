package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.VipSubscriptionPrice;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616940sBA {
    public static final C1616940sBA LIZ = new C1616940sBA();

    public static C1612740s4O LIZ() {
        return new C1612740s4O(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public static void LIZJ(int i, boolean z, EnumC1614850s7n enumC1614850s7n) {
        String str;
        String value;
        if (z) {
            str = "success";
        } else {
            str = "failure";
        }
        if (enumC1614850s7n != null) {
            value = enumC1614850s7n.getValue();
        } else {
            value = null;
        }
        C1614640s7S.LIZ("marketplace_price_fetch", str, "marketplace_prefetch", "", "", "", value, Integer.valueOf(i), 256);
    }

    public static void LIZLLL(C1616990sBF c1616990sBF, String str, EnumC1614850s7n enumC1614850s7n) {
        String value;
        String str2 = c1616990sBF.LIZ;
        String str3 = c1616990sBF.LIZIZ;
        String str4 = c1616990sBF.LIZJ;
        String str5 = c1616990sBF.LIZLLL;
        if (enumC1614850s7n != null) {
            value = enumC1614850s7n.getValue();
        } else {
            value = null;
        }
        C1614640s7S.LIZ("client_param_resolution", str, str2, str3, str4, str5, value, null, 384);
    }

    public static AbstractC19484711Kz LJFF(final InterfaceC1791930wjP interfaceC1791930wjP, String str, final C1616990sBF c1616990sBF) {
        String str2 = c1616990sBF.LJ;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            LIZLLL(c1616990sBF, "cache_hit", null);
            return AbstractC19484711Kz.LJIJJLI(new C1614920s7u(str2));
        }
        if (c1616990sBF.LIZIZ.length() == 0) {
            EnumC1614850s7n enumC1614850s7n = EnumC1614850s7n.PRODUCT_DETAIL_NOT_FOUND;
            LIZLLL(c1616990sBF, "sdk_recovery_failed", enumC1614850s7n);
            return AbstractC19484711Kz.LJIJJLI(new C1614880s7q(enumC1614850s7n));
        }
        final C1617170sBX c1617170sBX = new C1617170sBX(str, (List<String>) Collections.singletonList(c1616990sBF.LIZIZ), "subs");
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sBE
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<AbstractC1615220s8O> interfaceC2329309At) {
                InterfaceC1791930wjP interfaceC1791930wjP2 = interfaceC1791930wjP;
                if (interfaceC1791930wjP2 != null) {
                    C1617170sBX c1617170sBX2 = c1617170sBX;
                    final C1616990sBF c1616990sBF2 = c1616990sBF;
                    final C11KT c11kt = (C11KT) interfaceC2329309At;
                    interfaceC1791930wjP2.LIZ(c1617170sBX2, new InterfaceC1791300wiO() { // from class: X.0sBC
                        @Override // X.InterfaceC1791300wiO
                        public final void LJ(C0KSV c0ksv) {
                        }

                        @Override // X.InterfaceC1791300wiO
                        public final void LIZLLL(C518150KTt c518150KTt) {
                            if (c11kt.isDisposed()) {
                                return;
                            }
                            if (!c518150KTt.LIZ) {
                                EnumC1614850s7n enumC1614850s7n2 = EnumC1614850s7n.EMPTY_MARKETPLACE_RESULT;
                                C1616940sBA c1616940sBA = C1616940sBA.LIZ;
                                C1616990sBF c1616990sBF3 = c1616990sBF2;
                                c1616940sBA.getClass();
                                C1616940sBA.LIZLLL(c1616990sBF3, "sdk_recovery_failed", enumC1614850s7n2);
                                c11kt.onSuccess(new C1614880s7q(enumC1614850s7n2));
                                return;
                            }
                            Map<String, IapProductDetail> mapLJ = c518150KTt.LIZIZ;
                            if (mapLJ == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            IapProductDetail iapProductDetail = mapLJ.get(c1616990sBF2.LIZIZ);
                            if (iapProductDetail == null) {
                                EnumC1614850s7n enumC1614850s7n3 = EnumC1614850s7n.PRODUCT_DETAIL_NOT_FOUND;
                                C1616940sBA c1616940sBA2 = C1616940sBA.LIZ;
                                C1616990sBF c1616990sBF4 = c1616990sBF2;
                                c1616940sBA2.getClass();
                                C1616940sBA.LIZLLL(c1616990sBF4, "sdk_recovery_failed", enumC1614850s7n3);
                                c11kt.onSuccess(new C1614880s7q(enumC1614850s7n3));
                                return;
                            }
                            C1616940sBA c1616940sBA3 = C1616940sBA.LIZ;
                            List list = iapProductDetail.subscriptionOffer;
                            if (list == null) {
                                list = C13BV.INSTANCE;
                            }
                            C1616990sBF c1616990sBF5 = c1616990sBF2;
                            String str3 = c1616990sBF5.LIZJ;
                            String str4 = c1616990sBF5.LIZLLL;
                            AwS638S0100000_24 awS638S0100000_24 = new AwS638S0100000_24(iapProductDetail, 173);
                            c1616940sBA3.getClass();
                            AbstractC1617020sBI abstractC1617020sBILJ = C1616940sBA.LJ(list, str3, str4, awS638S0100000_24);
                            if (abstractC1617020sBILJ instanceof C1617000sBG) {
                                C1616940sBA.LIZLLL(c1616990sBF2, "sdk_recovery_success", null);
                                c11kt.onSuccess(new C1614920s7u(((C1617000sBG) abstractC1617020sBILJ).LIZ));
                            } else {
                                if (abstractC1617020sBILJ instanceof C1617010sBH) {
                                    C1617010sBH c1617010sBH = (C1617010sBH) abstractC1617020sBILJ;
                                    C1616940sBA.LIZLLL(c1616990sBF2, "sdk_recovery_failed", c1617010sBH.LIZ);
                                    c11kt.onSuccess(new C1614880s7q(c1617010sBH.LIZ));
                                    return;
                                }
                                throw new C1954807lC();
                            }
                        }
                    });
                }
            }
        });
    }

    public static void LIZIZ(InterfaceC1791930wjP interfaceC1791930wjP, String str, List list, final Function1 function1) {
        Object c098200Yq;
        Object c098200Yq2;
        String str2;
        String str3;
        try {
            c098200Yq = JsonParseUtils.LJ(list);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("<serialization-failed: ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            sbLIZ.append('>');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            VipSubscriptionPrice vipSubscriptionPrice = ((VipSubscriptionPurchaseOption) obj).price;
            if (vipSubscriptionPrice == null || (str3 = vipSubscriptionPrice.basePlanId) == null) {
                str3 = "";
            }
            if (str3.length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VipSubscriptionPrice vipSubscriptionPrice2 = ((VipSubscriptionPurchaseOption) it2.next()).price;
            if (vipSubscriptionPrice2 != null && (str2 = vipSubscriptionPrice2.mpProductId) != null && str2.length() > 0) {
                arrayList2.add(str2);
            }
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            VipSubscriptionPrice vipSubscriptionPrice3 = ((VipSubscriptionPurchaseOption) it3.next()).price;
            if (vipSubscriptionPrice3 != null) {
                String str4 = vipSubscriptionPrice3.basePlanId;
                if (str4.length() != 0) {
                    arrayList3.add(new Pair(str4, vipSubscriptionPrice3.promotionOfferId));
                }
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            VipSubscriptionPrice vipSubscriptionPrice4 = ((VipSubscriptionPurchaseOption) it4.next()).price;
            if (vipSubscriptionPrice4 != null) {
                String str5 = vipSubscriptionPrice4.mpProductId;
                String str6 = vipSubscriptionPrice4.localCurrencyCode;
                if (str5.length() != 0 && str6.length() != 0) {
                    arrayList4.add(new Pair(str5, str6));
                }
            }
        }
        Map mapLJIILLIIL2 = C2097608Jq.LJIILLIIL(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            VipSubscriptionPrice vipSubscriptionPrice5 = ((VipSubscriptionPurchaseOption) it5.next()).price;
            if (vipSubscriptionPrice5 != null) {
                String str7 = vipSubscriptionPrice5.basePlanId;
                String str8 = vipSubscriptionPrice5.mpProductId;
                if (str7.length() != 0 && str8.length() != 0) {
                    arrayList5.add(new Pair(str7, str8));
                }
            }
        }
        final C1200804ms c1200804ms = new C1200804ms(listLJJJJI, mapLJIILLIIL, mapLJIILLIIL2, C2097608Jq.LJIILLIIL(arrayList5));
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : listLJJJJI) {
            if (((String) obj2).length() > 0) {
                arrayList6.add(obj2);
            }
        }
        final List listLJJJJI2 = C13LP.LJJJJI(arrayList6);
        if (listLJJJJI2.isEmpty()) {
            LIZJ(0, false, EnumC1614850s7n.PRODUCT_DETAIL_NOT_FOUND);
            function1.invoke(LIZ());
            return;
        }
        C1617170sBX c1617170sBX = new C1617170sBX(str, (List<String>) listLJJJJI2, "subs");
        try {
            c098200Yq2 = JsonParseUtils.LJ(listLJJJJI2);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("<serialization-failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl2.getMessage());
            sbLIZ2.append('>');
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1617030sBJ c1617030sBJ = C1617030sBJ.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("merchant_id", c1617170sBX.LIZ);
        c2344009Gk.LJIIIIZZ("product_id_list", GsonProtectorUtils.toJson(C1617030sBJ.LIZIZ, c1617170sBX.LIZIZ));
        c2344009Gk.LJIIIIZZ("product_type", c1617170sBX.LIZJ);
        c2344009Gk.LJFF("biz_line", "subscription");
        c2344009Gk.LJFF("option_type", "subscription");
        C20684815ws.LJIILLIIL("pgc_iap_get_product_details_request", c2344009Gk.LIZ);
        if (interfaceC1791930wjP == null) {
            return;
        }
        interfaceC1791930wjP.LIZ(c1617170sBX, new InterfaceC1791300wiO() { // from class: X.0sBB
            @Override // X.InterfaceC1791300wiO
            public final void LJ(C0KSV c0ksv) {
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x00c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x019d A[SYNTHETIC] */
            @Override // X.InterfaceC1791300wiO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.C518150KTt r28) {
                /*
                    Method dump skipped, instruction units count: 531
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1616950sBB.LIZLLL(X.0KTt):void");
            }
        });
    }

    public static AbstractC1617020sBI LJ(List list, String str, String str2, Function2 function2) {
        String str3;
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            str3 = "";
            if (it2.hasNext()) {
                next = it2.next();
                IapSubscriptionProduct iapSubscriptionProduct = (IapSubscriptionProduct) next;
                String str4 = iapSubscriptionProduct.basePlanId;
                if (str4 == null) {
                    str4 = "";
                }
                if (Intrinsics.LJFF(str4, str)) {
                    String str5 = iapSubscriptionProduct.offerId;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (Intrinsics.LJFF(str5, str2)) {
                        break;
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        IapSubscriptionProduct iapSubscriptionProduct2 = (IapSubscriptionProduct) next;
        if (iapSubscriptionProduct2 == null) {
            return new C1617010sBH(EnumC1614850s7n.OFFER_MATCH_FAILED);
        }
        String str6 = iapSubscriptionProduct2.basePlanId;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = iapSubscriptionProduct2.offerId;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = (String) function2.invoke(str6, str7);
        if (str8 != null) {
            str3 = str8;
        }
        if (str3.length() == 0) {
            return new C1617010sBH(EnumC1614850s7n.EMPTY_SDK_PAYLOAD);
        }
        return new C1617000sBG(iapSubscriptionProduct2, str3);
    }
}
