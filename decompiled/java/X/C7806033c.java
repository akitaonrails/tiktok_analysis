package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformRight;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardExtendInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspSecondaryRefreshByChunkOpt;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.033c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7806033c {
    public static final boolean LJIJJLI() {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        if (!Intrinsics.LJFF(((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toUpperCase(Locale.ROOT), "SA")) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("ec_order_submit_version", 0) == 2;
    }

    public static final boolean LJIL() {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILocationDependencyService.class.getName(), anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        return ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).isUS();
    }

    public static final boolean LIZ(List<ShopOrderNew> list) {
        if (list == null) {
            return false;
        }
        Iterator<ShopOrderNew> it2 = list.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next().productType;
            if (num != null && num.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r51) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7806033c.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData");
    }

    public static final PackedSku LIZJ(BillInfoData billInfoData) {
        ShopOrderNew shopOrderNew;
        List<MainOrderInfo> list;
        MainOrderInfo mainOrderInfo;
        List<PackedSku> list2;
        List<ShopOrderNew> list3 = billInfoData.newShopOrders;
        if (list3 != null && (shopOrderNew = (ShopOrderNew) C13LP.LJJJLL(list3)) != null && (list = shopOrderNew.mainOrderInfos) != null && (mainOrderInfo = (MainOrderInfo) C13LP.LJJJLL(list)) != null && (list2 = mainOrderInfo.packedSkus) != null) {
            return (PackedSku) C13LP.LJJJLL(list2);
        }
        return null;
    }

    public static final HashMap<String, Object> LJ(BillInfoData billInfoData) {
        List<BillItem> list;
        String priceVal;
        String currency;
        Summary summary;
        BillItem billItem = null;
        if (billInfoData != null && (summary = billInfoData.summary) != null) {
            list = summary.billItems;
        } else {
            list = null;
        }
        HashMap<String, Object> map = new HashMap<>();
        if (list != null) {
            Iterator<BillItem> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BillItem next = it2.next();
                Integer num = next.itemType;
                if (num != null && num.intValue() == 2) {
                    billItem = next;
                    break;
                }
            }
            BillItem billItem2 = billItem;
            if (billItem2 != null) {
                Price price = billItem2.itemPrice;
                String str = "";
                if (price == null || (priceVal = price.getPriceVal()) == null) {
                    priceVal = "";
                }
                map.put("total_tax", priceVal);
                Price price2 = billItem2.itemPrice;
                if (price2 != null && (currency = price2.getCurrency()) != null) {
                    str = currency;
                }
                map.put("currency", str);
            }
        }
        return map;
    }

    public static final HashMap<String, Object> LJFF(HashMap<String, Object> map) throws JSONException {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("previous_page", "order_submit");
        if (map != null) {
            Object obj2 = map.get("source");
            if (obj2 != null) {
                jSONObject.put("source", obj2);
            }
            Object obj3 = map.get("source_from");
            if (obj3 != null) {
                jSONObject.put("source_from", obj3);
            }
            Object obj4 = map.get("product_source");
            if (obj4 != null) {
                jSONObject.put("product_source", obj4);
            }
            Object obj5 = map.get("cart_entrance");
            if (obj5 != null) {
                jSONObject.put("cart_entrance", obj5);
            }
            Object obj6 = map.get("enter_from");
            if (obj6 != null) {
                jSONObject.put("enter_from", obj6);
            }
            Object obj7 = map.get("enter_from_info");
            if (obj7 != null) {
                jSONObject.put("enter_from_info", obj7);
            }
            Object obj8 = map.get("enter_method");
            if (obj8 != null) {
                jSONObject.put("enter_method", obj8);
            }
            Object obj9 = map.get("traffic_source_list");
            if (obj9 != null) {
                jSONObject.put("traffic_source_list", obj9);
            }
            Object obj10 = map.get("template_id");
            if (obj10 != null) {
                jSONObject.put("template_id", obj10);
            }
            Object obj11 = map.get("enter_from_merge");
            if (obj11 != null) {
                jSONObject.put("enter_from_merge", obj11);
            }
            Object obj12 = map.get("source_page_type");
            if (obj12 != null) {
                jSONObject.put("source_page_type", obj12);
            }
            Object obj13 = map.get("entrance_info");
            if (obj13 != null) {
                jSONObject.put("entrance_info", obj13);
            }
            Object obj14 = map.get("source_module");
            if (obj14 != null) {
                jSONObject.put("source_module", obj14);
            }
        }
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("trackParams", C786410Ut5.J3(jSONObject));
        if (map != null && (obj = map.get("biz_type")) != null) {
            map2.put("biz_type", obj);
        }
        return map2;
    }

    @InterfaceC1294060jmO
    public static final List<ShopOrderNew> LJI(BillInfoData billInfoData) {
        ArrayList arrayList = new ArrayList();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            for (ShopOrderNew shopOrderNew : list) {
                ArrayList arrayList2 = new ArrayList();
                List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                if (list2 != null) {
                    for (MainOrderInfo mainOrderInfo : list2) {
                        if (LJIJI(mainOrderInfo)) {
                            arrayList2.add(mainOrderInfo);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    shopOrderNew.mainOrderInfos = arrayList2;
                    arrayList.add(shopOrderNew);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LJII(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r12) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7806033c.LJII(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    public static final HashMap<String, String> LJIIIZ(BillInfoData billInfoData) {
        String strLJIIIIZZ;
        ?? arrayList;
        ?? arrayList2;
        List<UserRightDetail> list;
        String strLJJLIIIJ;
        StringBuilder sb = new StringBuilder("");
        StringBuilder sb2 = new StringBuilder("");
        StringBuilder sb3 = new StringBuilder("");
        StringBuilder sb4 = new StringBuilder("");
        StringBuilder sb5 = new StringBuilder("");
        StringBuilder sb6 = new StringBuilder("");
        StringBuilder sb7 = new StringBuilder("");
        int i = 0;
        int i2 = 1;
        if (billInfoData != null) {
            PlatformRight platformRight = billInfoData.platformRight;
            if (platformRight != null && (list = platformRight.rightDetails) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(861), 30)) != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(strLJJLIIIJ);
            } else {
                strLJIIIIZZ = null;
            }
            sb7.append(strLJIIIIZZ);
            sb7.append(',');
            List<ShopOrderNew> list2 = billInfoData.newShopOrders;
            if (list2 != null) {
                Iterator<ShopOrderNew> it2 = list2.iterator();
                while (it2.hasNext()) {
                    List<MainOrderInfo> list3 = it2.next().mainOrderInfos;
                    if (list3 != null) {
                        Iterator<MainOrderInfo> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            List<PackedSku> list4 = it3.next().packedSkus;
                            if (list4 != null) {
                                Iterator<PackedSku> it4 = list4.iterator();
                                while (it4.hasNext()) {
                                    C719102rN c719102rNLIZ = C719002rM.LIZ(it4.next());
                                    List<PromotionLogo> list5 = c719102rNLIZ.LLJJ;
                                    if (list5 != null) {
                                        Pair[] pairArr = new Pair[i2];
                                        pairArr[i] = new Pair(c719102rNLIZ.LLLLIL, C13LP.LJJLIIIJ(list5, ",", null, null, i, null, AFwS228S0000000_1.get$arr$(862), 30));
                                        sb.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(pairArr)));
                                        sb.append(',');
                                    }
                                    List<PromotionSellingPoint> list6 = c719102rNLIZ.LLLLLLL;
                                    if (list6 != null) {
                                        Pair[] pairArr2 = new Pair[1];
                                        pairArr2[i] = new Pair(c719102rNLIZ.LLLLIL, C13LP.LJJLIIIJ(list6, ",", null, null, i, null, AFwS228S0000000_1.get$arr$(863), 30));
                                        sb2.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(pairArr2)));
                                        sb2.append(',');
                                    }
                                    Pair[] pairArr3 = new Pair[1];
                                    pairArr3[i] = new Pair(c719102rNLIZ.LLLLIL, c719102rNLIZ.LLLII);
                                    sb3.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(pairArr3)));
                                    sb3.append(',');
                                    Integer num = c719102rNLIZ.LLLLLLLLLL;
                                    if (num != null) {
                                        Pair[] pairArr4 = new Pair[1];
                                        pairArr4[i] = new Pair(c719102rNLIZ.LLLLIL, Integer.valueOf(num.intValue()));
                                        sb4.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(pairArr4)));
                                        sb4.append(',');
                                    }
                                    Integer num2 = c719102rNLIZ.LLLLLLLZIL;
                                    if (num2 != null) {
                                        Pair[] pairArr5 = new Pair[1];
                                        pairArr5[i] = new Pair(c719102rNLIZ.LLLLIL, Integer.valueOf(num2.intValue()));
                                        sb5.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(pairArr5)));
                                        sb5.append(',');
                                    }
                                    Float f = c719102rNLIZ.LLJJL;
                                    if (f != null) {
                                        Pair[] pairArr6 = new Pair[1];
                                        pairArr6[i] = new Pair(c719102rNLIZ.LLLLIL, Float.valueOf(f.floatValue()));
                                        sb6.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(pairArr6)));
                                        sb6.append(',');
                                    }
                                    UserRight userRight = c719102rNLIZ.LLJJIII;
                                    if (userRight != null) {
                                        List<UserRightDetail> list7 = userRight.userRightDetails;
                                        if (list7 != null) {
                                            arrayList = new ArrayList(C15438062q.LJIJJ(list7, 10));
                                            Iterator<UserRightDetail> it5 = list7.iterator();
                                            while (it5.hasNext()) {
                                                arrayList.add(it5.next().nameEn);
                                            }
                                        } else {
                                            arrayList = C13BV.INSTANCE;
                                        }
                                        List<UserRightDetail> list8 = userRight.priceRightDetails;
                                        if (list8 != null) {
                                            arrayList2 = new ArrayList(C15438062q.LJIJJ(list8, 10));
                                            Iterator<UserRightDetail> it6 = list8.iterator();
                                            while (it6.hasNext()) {
                                                arrayList2.add(it6.next().nameEn);
                                            }
                                        } else {
                                            arrayList2 = C13BV.INSTANCE;
                                        }
                                        sb7.append(C1741890vQh.LJIIIIZZ(C2097608Jq.LJI(new Pair(c719102rNLIZ.LLLLIL, C13LP.LJJLIIIJ(C13LP.LJLIL(arrayList2, arrayList), ",", null, null, 0, null, null, 62)))));
                                        sb7.append(',');
                                    }
                                    i = 0;
                                    i2 = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        HashMap<String, String> map = new HashMap<>();
        String string = sb.toString();
        char[] cArr = new char[i2];
        cArr[0] = ',';
        String strLJLJJI = a0.LJLJJI(string, cArr);
        if (strLJLJJI.length() > 0) {
            map.put("product_promotion_tag", strLJLJJI);
        }
        String strLJLJJI2 = a0.LJLJJI(sb2.toString(), ',');
        if (strLJLJJI2.length() > 0) {
            map.put("label_type", strLJLJJI2);
        }
        String strLJLJJI3 = a0.LJLJJI(sb3.toString(), ',');
        if (strLJLJJI3.length() > 0) {
            map.put("stock_num", strLJLJJI3);
        }
        String strLJLJJI4 = a0.LJLJJI(sb4.toString(), ',');
        if (strLJLJJI4.length() > 0) {
            map.put("sales_rating_tag", strLJLJJI4);
        }
        String strLJLJJI5 = a0.LJLJJI(sb5.toString(), ',');
        if (strLJLJJI5.length() > 0) {
            map.put("product_sales", strLJLJJI5);
        }
        String strLJLJJI6 = a0.LJLJJI(sb6.toString(), ',');
        if (strLJLJJI6.length() > 0) {
            map.put("product_rating", strLJLJJI6);
        }
        String strLJLJJI7 = a0.LJLJJI(sb7.toString(), ',');
        if (strLJLJJI7.length() > 0) {
            map.put("rights_tag", strLJLJJI7);
        }
        return map;
    }

    public static final Map<String, Object> LJIIJ(OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        int i;
        List<ShopOrderNew> list;
        LogisticPanelModule logisticPanelModule;
        LogisticArea logisticArea;
        List<LogisticExpressionArea> list2;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (list = billInfoData.newShopOrders) != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                List<MainOrderInfo> list3 = it2.next().mainOrderInfos;
                if (list3 != null) {
                    for (MainOrderInfo mainOrderInfo : list3) {
                        if (!orderSubmitAssemViewModel.f0 && (logisticPanelModule = mainOrderInfo.logisticsExpressionModule) != null && (logisticArea = logisticPanelModule.logisticArea) != null && (list2 = logisticArea.logisticExpressionAreas) != null && list2.size() > 1) {
                            orderSubmitAssemViewModel.f0 = true;
                        }
                        if (orderSubmitAssemViewModel.f350e0.containsKey(mainOrderInfo.mainOrderId) && Intrinsics.LJFF(orderSubmitAssemViewModel.f350e0.get(mainOrderInfo.mainOrderId), mainOrderInfo.selectedLogisticsServiceId)) {
                            i = 1;
                        }
                    }
                }
            }
        } else {
            i = 0;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("is_recommend_logistics_show", Integer.valueOf(orderSubmitAssemViewModel.f0 ? 1 : 0)), new Pair("is_recommend_logistics_chosen", Integer.valueOf(i)));
    }

    public static final Map<String, String> LJIIJJI(BillInfoData billInfoData) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (billInfoData != null) {
            str = billInfoData.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                String key = entry.getKey();
                int iHashCode = key.hashCode();
                if (iHashCode != -338069640) {
                    if (iHashCode != 1382005751) {
                        if (iHashCode == 1489278288 && key.equals("shipping_price_after_coupon")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        }
                    } else if (key.equals("discounted_shipping_price")) {
                        String string = entry.getValue().toString();
                        if (a0.LJJLIIIJJIZ(string, '-')) {
                            linkedHashMap.put(entry.getKey(), C13LN.LJLJLJ(1, string));
                        } else {
                            linkedHashMap.put(entry.getKey(), string);
                        }
                    }
                } else if (key.equals("shipping_price")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        if (!linkedHashMap.containsKey("discounted_shipping_price")) {
            linkedHashMap.put("discounted_shipping_price", CardStruct.IStatusCode.DEFAULT);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Map<String, String> LJIIL(BillInfoData billInfoData) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (billInfoData != null) {
            str = billInfoData.daInfo;
        } else {
            str = null;
        }
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str);
        if (mapLJIIJ != null) {
            for (Map.Entry<String, Object> entry : mapLJIIJ.entrySet()) {
                String key = entry.getKey();
                switch (key.hashCode()) {
                    case -338069640:
                        if (key.equals("shipping_price")) {
                        }
                        break;
                    case 784545185:
                        if (key.equals("sns_type")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        } else {
                            continue;
                        }
                        break;
                    case 1382005751:
                        if (key.equals("discounted_shipping_price")) {
                            String string = entry.getValue().toString();
                            if (a0.LJJLIIIJJIZ(string, '-')) {
                                linkedHashMap.put(entry.getKey(), C13LN.LJLJLJ(1, string));
                            } else {
                                linkedHashMap.put(entry.getKey(), string);
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 1489278288:
                        if (key.equals("shipping_price_after_coupon")) {
                        }
                        break;
                }
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        if (!linkedHashMap.containsKey("discounted_shipping_price")) {
            linkedHashMap.put("discounted_shipping_price", CardStruct.IStatusCode.DEFAULT);
        }
        return linkedHashMap;
    }

    @InterfaceC1294060jmO
    public static final Map<String, List<MainOrderInfo>> LJIILIIL(BillInfoData billInfoData) {
        int value;
        String strValueOf;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            for (ShopOrderNew shopOrderNew : list) {
                List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                if (list2 != null) {
                    for (MainOrderInfo mainOrderInfo : list2) {
                        if (!LJIJI(mainOrderInfo)) {
                            MainOrderAvailableInfo mainOrderAvailableInfo = mainOrderInfo.availableInfo;
                            if (mainOrderAvailableInfo != null && (num = mainOrderAvailableInfo.availableStatus) != null) {
                                value = num.intValue();
                            } else {
                                value = EnumC803803Ca.UNKNOWN.getValue();
                            }
                            if (value != EnumC803803Ca.UNAVAILABLE_SHOP_CLOSE.getValue()) {
                                strValueOf = String.valueOf(value);
                            } else {
                                strValueOf = shopOrderNew.sellerId;
                                if (strValueOf == null) {
                                    strValueOf = "";
                                }
                            }
                            if (linkedHashMap.get(strValueOf) == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(mainOrderInfo);
                                linkedHashMap.put(strValueOf, arrayList);
                            } else {
                                List list3 = (List) linkedHashMap.get(strValueOf);
                                if (list3 != null) {
                                    list3.add(mainOrderInfo);
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final Map<String, List<MainOrderInfo>> LJIILJJIL(List<ShopOrderNew> list) {
        int value;
        String strValueOf;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (ShopOrderNew shopOrderNew : list) {
                List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                if (list2 != null) {
                    for (MainOrderInfo mainOrderInfo : list2) {
                        if (!LJIJI(mainOrderInfo)) {
                            MainOrderAvailableInfo mainOrderAvailableInfo = mainOrderInfo.availableInfo;
                            if (mainOrderAvailableInfo != null && (num = mainOrderAvailableInfo.availableStatus) != null) {
                                value = num.intValue();
                            } else {
                                value = EnumC803803Ca.UNKNOWN.getValue();
                            }
                            if (value != EnumC803803Ca.UNAVAILABLE_SHOP_CLOSE.getValue()) {
                                strValueOf = String.valueOf(value);
                            } else {
                                strValueOf = shopOrderNew.sellerId;
                                if (strValueOf == null) {
                                    strValueOf = "";
                                }
                            }
                            if (linkedHashMap.get(strValueOf) == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(mainOrderInfo);
                                linkedHashMap.put(strValueOf, arrayList);
                            } else {
                                List list3 = (List) linkedHashMap.get(strValueOf);
                                if (list3 != null) {
                                    list3.add(mainOrderInfo);
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String LJIILL(BillInfoData billInfoData) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        List<ShopOrderNew> list = billInfoData.newShopOrders;
        if (list != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            Iterator<PackedSku> it4 = list3.iterator();
                            while (it4.hasNext()) {
                                SinglePriceItem singlePriceItem = it4.next().singlePrice;
                                if (singlePriceItem != null && (str = singlePriceItem.unitPriceDescription) != null) {
                                    if (i > 0) {
                                        stringBuffer.append(",");
                                    }
                                    stringBuffer.append(str);
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public static final Map<String, Object> LJIILLIIL(List<ShopOrderNew> list) {
        int i;
        Iterator<ShopOrderNew> it2 = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it2.hasNext()) {
            List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
            if (list2 != null) {
                Iterator<MainOrderInfo> it3 = list2.iterator();
                while (it3.hasNext()) {
                    List<PackedSku> list3 = it3.next().packedSkus;
                    if (list3 != null) {
                        Iterator<PackedSku> it4 = list3.iterator();
                        while (it4.hasNext()) {
                            SkuCardExtendInfo skuCardExtendInfo = it4.next().skuCardExtendInfo;
                            if (skuCardExtendInfo != null && skuCardExtendInfo.virtualInfo != null) {
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
        }
        Pair[] pairArr = new Pair[3];
        if (i2 > 0) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair("contain_virtual_product", Integer.valueOf(i));
        pairArr[1] = new Pair("virtual_product_cnt", Integer.valueOf(i2));
        pairArr[2] = new Pair("physical_product_cnt", Integer.valueOf(i3));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final boolean LJIJ(BillInfoData billInfoData) {
        List<ShopOrderNew> list;
        if (billInfoData != null && (list = billInfoData.newShopOrders) != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        if (list3 != null) {
                            Iterator<PackedSku> it4 = list3.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    PackedSku next = it4.next();
                                    if (next.insuranceModule != null) {
                                        if (next != null) {
                                            i++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIJI(MainOrderInfo mainOrderInfo) {
        MainOrderAvailableInfo mainOrderAvailableInfo = mainOrderInfo.availableInfo;
        if (mainOrderAvailableInfo != null && mainOrderAvailableInfo.availableStatus != null) {
            Integer num = mainOrderAvailableInfo.availableStatus;
            int value = EnumC803803Ca.AVAILABLE.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(mainOrderInfo.reachable, Boolean.TRUE);
    }

    public static final boolean LJJ(BillInfoData billInfoData) {
        if (billInfoData.privacyPopup != null || billInfoData.exceptionUX != null) {
            return true;
        }
        Boolean bool = billInfoData.LIZ;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(billInfoData.lastChunk, bool2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[PHI: r3
      0x0046: PHI (r3v1 float) = (r3v0 float), (r3v3 float), (r3v3 float) binds: [B:23:0x0043, B:16:0x0023, B:18:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap<java.lang.String, java.lang.Object> LIZLLL(int r5, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r6) {
        /*
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            if (r5 == 0) goto Lb
            r0 = 2
            if (r5 == r0) goto Lb
            return r4
        Lb:
            if (r6 == 0) goto L42
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r6.realPrice
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.getPriceVal()
            if (r0 == 0) goto L42
            java.lang.Float r0 = X.C2327809Ae.LJIIIIZZ(r0)
            if (r0 == 0) goto L42
            float r3 = r0.floatValue()
        L21:
            java.lang.String r0 = r6.originalPriceVal
            if (r0 == 0) goto L46
            java.lang.Float r0 = X.C2327809Ae.LJIIIIZZ(r0)
            if (r0 == 0) goto L46
            float r2 = r0.floatValue()
        L2f:
            java.lang.String r1 = "original_price_value"
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r4.put(r1, r0)
            java.lang.String r1 = "sale_price_value"
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r4.put(r1, r0)
            return r4
        L42:
            r3 = 0
            if (r6 == 0) goto L46
            goto L21
        L46:
            r2 = r3
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7806033c.LIZLLL(int, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice):java.util.HashMap");
    }

    public static final String LJIIZILJ(BillInfoData billInfoData, String str) {
        String str2;
        Map<String, String> map;
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            if (!listLJJLIIIJILLIZJL.isEmpty()) {
                HashMap map2 = new HashMap();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    map2.put((String) it2.next(), "");
                }
                Iterator it3 = ((ArrayList) LJI(billInfoData)).iterator();
                while (it3.hasNext()) {
                    List<MainOrderInfo> list = ((ShopOrderNew) it3.next()).mainOrderInfos;
                    if (list != null) {
                        Iterator<MainOrderInfo> it4 = list.iterator();
                        while (it4.hasNext()) {
                            List<PackedSku> list2 = it4.next().packedSkus;
                            if (list2 != null) {
                                for (PackedSku packedSku : list2) {
                                    BcmStandardTrack bcmStandardTrack = packedSku.bcmStandardTrack;
                                    if (bcmStandardTrack != null && (map = bcmStandardTrack.trackParam) != null) {
                                        str2 = map.get("bcm_multiverse_id");
                                    } else {
                                        str2 = null;
                                    }
                                    String str3 = packedSku.productId;
                                    if (str3 != null && map2.containsKey(str3)) {
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        map2.put(str3, str2);
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator it5 = listLJJLIIIJILLIZJL.iterator();
                while (it5.hasNext()) {
                    String str4 = (String) map2.get((String) it5.next());
                    if (str4 == null) {
                        str4 = "";
                    }
                    stringBuffer.append(str4);
                    stringBuffer.append(",");
                }
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return stringBuffer.toString();
    }

    public static final EnumC804103Cd LJJI(C03CT c03ct, Integer num) {
        if (c03ct == C03CT.PUDO && num != null && num.intValue() == 1) {
            return EnumC804103Cd.PICKUP;
        }
        return EnumC804103Cd.DOORSTEP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x033a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v313 */
    /* JADX WARN: Type inference failed for: r0v314 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r14, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 1803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7806033c.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, boolean):java.util.HashMap");
    }

    public static final boolean LJIJJ(BillInfoData billInfoData, boolean z, Integer num) {
        List<ShopOrderNew> list;
        if (billInfoData == null) {
            return false;
        }
        if (ECOspSecondaryRefreshByChunkOpt.LIZ() && !z) {
            List<ShopOrderNew> list2 = billInfoData.newShopOrders;
            if (list2 == null || list2.isEmpty()) {
                return false;
            }
        } else {
            Boolean bool = billInfoData.LIZ;
            Boolean bool2 = Boolean.TRUE;
            if ((!Intrinsics.LJFF(bool, bool2) || (Intrinsics.LJFF(billInfoData.LIZ, bool2) && Intrinsics.LJFF(billInfoData.beginRenderChunk, bool2))) && ((list = billInfoData.newShopOrders) == null || list.isEmpty())) {
                return false;
            }
            if (Intrinsics.LJFF(billInfoData.LIZ, bool2) && Intrinsics.LJFF(billInfoData.lastChunk, bool2) && num != null && num.intValue() < 2) {
                return false;
            }
        }
        return true;
    }
}
