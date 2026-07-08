package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.031G, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031G {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list) {
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    ShopOrderNew shopOrderNew = (ShopOrderNew) obj;
                    shopOrderNew.getClass();
                    List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                    if (list2 != null) {
                        int i3 = 0;
                        for (MainOrderInfo mainOrderInfo : list2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                MainOrderInfo mainOrderInfo2 = mainOrderInfo;
                                int i5 = (i2 * 100) + i4;
                                mainOrderInfo2.LIZ = i5;
                                List<PackedSku> list3 = mainOrderInfo2.packedSkus;
                                if (list3 != null) {
                                    int i6 = 0;
                                    for (PackedSku packedSku : list3) {
                                        int i7 = i6 + 1;
                                        if (i6 >= 0) {
                                            packedSku.LLILLJJLI = (i5 * 100) + i7;
                                            i6 = i7;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static void LIZIZ(List list) {
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C719202rO c719202rO = (C719202rO) obj;
                    c719202rO.LLJJL = i2;
                    List<C723002s0> list2 = c719202rO.LLJIJIL;
                    if (list2 != null) {
                        int i3 = 0;
                        for (C723002s0 c723002s0 : list2) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                C723002s0 c723002s02 = c723002s0;
                                int i5 = (i2 * 100) + i4;
                                c723002s02.LLJJL = i5;
                                List<C719102rN> list3 = c723002s02.LLJ;
                                if (list3 != null) {
                                    int i6 = 0;
                                    for (C719102rN c719102rN : list3) {
                                        int i7 = i6 + 1;
                                        if (i6 >= 0) {
                                            c719102rN.LLLIZZ = (i5 * 100) + i7;
                                            i6 = i7;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                }
                                i3 = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static InsuranceInfo LIZJ(String str, Map map, boolean z) {
        InsuranceInfo insuranceInfo;
        if (map != null && !map.isEmpty() && str != null && str.length() != 0 && !z) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.keySet().contains(str) && (insuranceInfo = (InsuranceInfo) linkedHashMap.get(str)) != null && insuranceInfo.checkInsurance()) {
                return (InsuranceInfo) linkedHashMap.get(str);
            }
            return null;
        }
        return null;
    }

    public static CreateOrderSku LIZLLL(CreateOrderSku createOrderSku, C719102rN c719102rN, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        HashMap map;
        Type type;
        AddonOrder addonOrder;
        String str;
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (addonOrder = billInfoData.addonOrder) != null && (str = addonOrder.daInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        } else {
            mapLJIIJ = null;
        }
        if (mapLJIIJ != null) {
            obj = mapLJIIJ.get("source_module");
        } else {
            obj = null;
        }
        String str2 = createOrderSku.entranceInfo;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJI(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class))));
            } else {
                type = new TypeToken<HashMap<String, Object>>() { // from class: X.031H
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
            if (!(objFromJson instanceof HashMap)) {
                objFromJson = null;
            }
            map = (HashMap) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (map == null) {
            map = new HashMap();
        }
        Object obj2 = ((HashMap) orderSubmitAssemViewModel.LLLLLLIL).get(c719102rN.LLILZLL);
        if (obj2 == null) {
            obj2 = "";
        }
        map.put("add_on_track_id", obj2);
        map.put("is_add_on_product", 1);
        map.put("source_page_type", "add_on_order_submit_rec");
        map.put("entrance_form", "append_goods_card");
        if (obj == null) {
            obj = "rec_order_submit_outer_add_on_module";
        }
        map.put("source_module", obj);
        map.put("purchase_path", "skip_pdp");
        Object obj3 = ((HashMap) orderSubmitAssemViewModel.LLLLLLIL).get(c719102rN.LLILZLL);
        if (obj3 != null) {
            map.put("track_id", obj3);
        }
        String strLIZLLL = C08JS.LIZLLL(map);
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("entrance_info", strLIZLLL);
        return CreateOrderSku.LIZ(createOrderSku, orderSubmitAssemViewModel.XR2(map2), null, 8388575);
    }
}
