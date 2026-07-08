package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.richtextcontainer.model.SeaPdpBtm;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.03wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1005503wT {
    public static final C1005503wT LIZ = new C1005503wT();

    public static String LIZ(SeaPdpBtm seaPdpBtm) {
        String str;
        if (seaPdpBtm == null) {
            return null;
        }
        String str2 = seaPdpBtm.c;
        Map<String, String> map = seaPdpBtm.d;
        if (map != null) {
            str = map.get(EnumC1005703wV.BODY.getValue());
        } else {
            str = null;
        }
        if (str2 == null || a0.LJJJIL(str2) || str == null || a0.LJJJIL(str)) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('.');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() < 2) {
            return null;
        }
        return (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [T, java.lang.String] */
    public static void LIZJ(Context context, SeaPdpViewModel seaPdpViewModel, String str, int i, Map map, String str2, View view) {
        T tLJII;
        Map<String, Object> map2;
        Object obj;
        String str3;
        Map<String, Object> map3;
        String str4;
        SellerInfo sellerInfo;
        Map<String, Object> map4;
        String string;
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Object obj2;
        if (i == EnumC1005603wU.CUT_PRICE.getValue()) {
            HashMap map5 = new HashMap();
            map5.put("enter_method", "pdp_cut_price_banner");
            SeaPdpViewModel.sS2(seaPdpViewModel, view, 17, null, false, null, null, false, false, map5, null, null, str2, null, null, null, 30460);
            return;
        }
        if (str == 0 || a0.LJJJIL(str)) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = str;
        String str5 = null;
        if (map != null) {
            ArrayList<Pair> arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!C123100dR.LIZ(str7)) {
                    str7 = str6;
                }
                C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
                if (c1054104Ah != null && (concurrentHashMap = c1054104Ah.LIZIZ) != null && (obj2 = concurrentHashMap.get(str6)) != null) {
                    string = obj2.toString();
                } else {
                    string = null;
                }
                if (C123100dR.LIZ(str7) && C123100dR.LIZ(string)) {
                    arrayList.add(new Pair(str7, string));
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    Uri.Builder builderBuildUpon = UriProtector.parse((String) c259800zU.element).buildUpon();
                    for (Pair pair : arrayList) {
                        builderBuildUpon.appendQueryParameter((String) pair.getFirst(), (String) pair.getSecond());
                    }
                    c259800zU.element = builderBuildUpon.toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.ERR108, e, null);
                }
            }
        }
        if (str2 != null && !a0.LJJJIL(str2) && i != EnumC1005603wU.OUT_APP.getValue()) {
            tLJII = seaPdpViewModel.LLLLL.LJII(str2, (String) c259800zU.element, null);
        } else {
            tLJII = c259800zU.element;
        }
        c259800zU.element = tLJII;
        if (i == EnumC1005603wU.COUPON.getValue()) {
            C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpViewModel.LLIZ;
            if (pdpEnterParam != null && (map4 = pdpEnterParam.trackParams) != null) {
                obj = map4.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam2 = seaPdpViewModel.LLIZ;
            if (pdpEnterParam2 != null) {
                map3 = pdpEnterParam2.trackParams;
            } else {
                map3 = null;
            }
            IPdpStarter.LIZ.getClass();
            String strValueOf = String.valueOf(C1013003xg.LIZJ(pdpEnterParam2));
            Boolean boolValueOf = Boolean.valueOf(seaPdpViewModel.LLIZLLLIL);
            IPdpStarter.PdpEnterParam pdpEnterParam3 = seaPdpViewModel.LLIZ;
            if (pdpEnterParam3 != null) {
                str4 = pdpEnterParam3.sourceInfo;
            } else {
                str4 = null;
            }
            String skuId = seaPdpViewModel.getSkuId();
            String[] strArr = new String[1];
            ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                str5 = sellerInfo.sellerId;
            }
            strArr[0] = String.valueOf(str5);
            C1013103xh.LIZ(c1013103xh, context, str, str3, map3, null, "discounts_module", strValueOf, boolValueOf, str4, skuId, C1697810uHb.LJIILJJIL(strArr), false, null, null, 28672);
            return;
        }
        if (i == EnumC1005603wU.RANK.getValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam4 = seaPdpViewModel.LLIZ;
            if (pdpEnterParam4 != null && (map2 = pdpEnterParam4.trackParams) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                    if (Intrinsics.LJFF(entry2.getKey(), "enter_from") || Intrinsics.LJFF(entry2.getKey(), "enter_from_info") || Intrinsics.LJFF(entry2.getKey(), "action_type") || Intrinsics.LJFF(entry2.getKey(), "search_entrance") || Intrinsics.LJFF(entry2.getKey(), "first_source_page") || Intrinsics.LJFF(entry2.getKey(), "source_previous_page")) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
                linkedHashMap.put("parent_track_id", map2.get("track_id"));
                linkedHashMap.put("previous_page", "product_detail");
                if (linkedHashMap.get("first_source_page") == null) {
                    linkedHashMap.put("first_source_page", map2.get("source_page_type"));
                }
                if (linkedHashMap.get("source_previous_page") == null) {
                    linkedHashMap.put("source_previous_page", "product_detail");
                }
                linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
            }
            C919503ib.LIZIZ(context, (String) c259800zU.element, linkedHashMap, false).open();
            return;
        }
        if (i == EnumC1005603wU.OUT_APP.getValue()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse((String) c259800zU.element));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5LMck70v2KhsdVbRPMKjJ/aJ5C/1qf6X5u+NbTkpprHExFx83aolEJGEztcbmOXznQPM2IxMMss4LN7/cJV8MU0WNIOpa6GBh3g+Pw==", null));
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1019103yf.LIZ(EnumC1014603xw.ERR109, e2, null);
                return;
            }
        }
        SmartRouter.buildRoute(context, (String) c259800zU.element).open();
    }
}
