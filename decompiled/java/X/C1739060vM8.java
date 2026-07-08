package X;

import com.bytedance.router.RouteIntent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.InsertItem;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ProductListRequestBody;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0vM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739060vM8 {
    public final EnumC1161720gKw LIZ;
    public final ConcurrentHashMap<String, Object> LIZIZ = new ConcurrentHashMap<>();
    public WeakReference<InterfaceC1541990qEH> LIZJ = new WeakReference<>(null);
    public boolean LIZLLL;

    public C1739060vM8(EnumC1161720gKw enumC1161720gKw) {
        this.LIZ = enumC1161720gKw;
    }

    public final void LIZJ(String str) {
        boolean z;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZJ.get();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTemplateData [");
        sbLIZ.append(str);
        sbLIZ.append("] loadSuccess: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" targetViewNull: ");
        if (interfaceC1541990qEH == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (interfaceC1541990qEH != null && this.LIZLLL && (true ^ this.LIZIZ.isEmpty())) {
            interfaceC1541990qEH.updateData(this.LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b A[PHI: r4
      0x009b: PHI (r4v4 com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopCreator) = 
      (r4v3 com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopCreator)
      (r4v6 com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopCreator)
      (r4v7 com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopCreator)
     binds: [B:29:0x007d, B:40:0x0099, B:36:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData r7, java.util.Map r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1739060vM8.LIZIZ(com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData, java.util.Map, java.lang.String):void");
    }

    public final Object LIZ(RouteIntent routeIntent, String str, String str2, String str3, Map<String, Object> map, C1738990vM1 c1738990vM1, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        int[] iArr;
        List list;
        String strLJIIIIZZ;
        String str4;
        Integer numValueOf;
        n nVarLJIILIIL;
        String str5;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 10, "ec_shop_first_screen_page_size", true);
        Object obj = map.get("traffic_source_list");
        if (obj instanceof int[]) {
            iArr = (int[]) obj;
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = new int[0];
        }
        Object objLIZLLL = map.get("last_expo_item_id");
        if (objLIZLLL == null) {
            objLIZLLL = C0WWO.LIZLLL(routeIntent, "last_expo_item_id");
        }
        try {
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            Object objLIZLLL2 = map.get("insert_items");
            if (objLIZLLL2 == null) {
                objLIZLLL2 = C0WWO.LIZLLL(routeIntent, "insert_items");
            }
            if (objLIZLLL2 instanceof String) {
                str5 = (String) objLIZLLL2;
            } else {
                str5 = null;
            }
            list = (List) gsonLIZLLL.LJIIIIZZ(str5, new TypeToken<List<? extends InsertItem>>() { // from class: X.0CnD
            }.getType());
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            list = null;
        }
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str6 = c1738990vM1.LIZJ;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        String str8 = c1738990vM1.LIZLLL;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = c1738990vM1.LJ;
        if (str9 != null) {
            str7 = str9;
        }
        List<String> list2 = c1738990vM1.LJI;
        List<String> list3 = c1738990vM1.LJII;
        List<String> list4 = c1738990vM1.LJIIIIZZ;
        List<String> list5 = c1738990vM1.LJIIJ;
        List<String> list6 = c1738990vM1.LJIIJJI;
        List<String> list7 = c1738990vM1.LJIIIZ;
        String str10 = c1738990vM1.LIZ;
        List listSingletonList = Collections.singletonList(c1738990vM1.LJFF);
        String str11 = c1738990vM1.LJIIL;
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        } else {
            strLJIIIIZZ = null;
        }
        if (objLIZLLL instanceof String) {
            str4 = (String) objLIZLLL;
        } else {
            str4 = null;
        }
        int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_shop_product_protocol_version", true);
        if (iLJIJ2 == 0) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(iLJIJ2);
        }
        C1202220hOG c1202220hOG = C1202220hOG.LIZ;
        EnumC1161720gKw enumC1161720gKw = this.LIZ;
        c1202220hOG.getClass();
        String str12 = str6;
        String str13 = str8;
        ProductListRequestBody productListRequestBody = new ProductListRequestBody(str, str12, 0, 0, iLJIJ, str2, str10, str13, str7, "shop", null, list2, list3, list4, list5, list6, list7, null, iArr, listSingletonList, str11, str3, strLJIIIIZZ, str4, list, 0, 1, numValueOf, C1202220hOG.LIZ(enumC1161720gKw), null, null, null, C2286608xc.LJ(1), C2286608xc.LJFF(c1738990vM1.LJIILIIL), -503184372, 0, null);
        try {
            C1227904rF.LIZ.getClass();
            nVarLJIILIIL = C1227904rF.LIZLLL().LJIJJLI(productListRequestBody).LJIILIIL();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            nVarLJIILIIL = null;
        }
        if (nVarLJIILIIL == null) {
            return new n();
        }
        C1957807lg.LIZ("store_v3", nVarLJIILIIL, routeIntent);
        return C2399409ai.LIZ("shop", "product_list", c1738990vM1.LIZIZ, new C324100CnA(nVarLJIILIIL, null), interfaceC1364105Vn);
    }
}
