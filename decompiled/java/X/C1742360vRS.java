package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.AssembleBagData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.AssembleProduct;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.BagAssembleData;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.LiveProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0vRS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.ShopBagPreview$fetchShoppingBagPreviewBagAssemble$requestAndUpdateCache$2", f = "ShopBagPreview.kt", l = {}, m = "invokeSuspend")
public final class C1742360vRS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742360vRS(String str, String str2, InterfaceC1364105Vn<? super C1742360vRS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742360vRS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BagAssembleData bagAssembleData;
        AssembleBagData assembleBagData;
        LiveProduct liveProduct;
        List<AssembleProduct> list;
        boolean z;
        boolean z2;
        String strLJJIFFI;
        String str;
        boolean z3;
        Type type;
        C1C7U.LIZ("ShopBagPreview@d7a8.fetchShoppingBagPreviewBagAssemble$requestAndUpdateCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL;
        String str3 = this.LLILLJJLI;
        String str4 = C1742330vRP.LIZ;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                type = new TypeToken<BagAssembleData>() { // from class: X.0vRT
                }.getType();
            } else {
                type = C2371409Qy.LIZJ(C13LE.LJII(BagAssembleData.class));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
            if (!(objFromJson instanceof BagAssembleData)) {
                objFromJson = null;
            }
            bagAssembleData = (BagAssembleData) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            bagAssembleData = null;
        }
        if (bagAssembleData != null && (assembleBagData = bagAssembleData.data) != null && (liveProduct = assembleBagData.liveProduct) != null && (list = liveProduct.products) != null) {
            C2232408os c2232408os = C341050DYp.LIZ;
            Pair[] pairArr = new Pair[1];
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AssembleProduct> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().productId);
            }
            pairArr[0] = new Pair("product_id_list", arrayList);
            C341050DYp.LJII("live_view_action", str3, C2097608Jq.LJIIJ(pairArr));
            C01GW c01gw = C286250BJv.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C1191504lN c1191504lN = C1191504lN.LIZ;
                String str5 = C1742330vRP.LIZ;
                c1191504lN.getClass();
                Map<String, AbstractC1742310vRN> map = C1191504lN.LIZJ;
                if (((LinkedHashMap) map).get(str5) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    map.put(str5, new C1742320vRO(str5));
                }
                List<AssembleProduct> listSubList = list.subList(0, Math.min(list.size(), ((Number) c01gw.getValue()).intValue()));
                ArrayList arrayList2 = new ArrayList();
                Iterator<AssembleProduct> it3 = listSubList.iterator();
                while (it3.hasNext()) {
                    ECImage eCImage = it3.next().cover;
                    if (eCImage != null && (str = eCImage.url) != null) {
                        strLJJIFFI = u.LJJIFFI(str, "800", "216", false);
                    } else {
                        strLJJIFFI = null;
                    }
                    if (strLJJIFFI != null) {
                        arrayList2.add(strLJJIFFI);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = C1742330vRP.LIZIZ;
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(arrayList2);
                }
            }
        }
        C1C7U.LIZIZ("ShopBagPreview@d7a8.fetchShoppingBagPreviewBagAssemble$requestAndUpdateCache$2");
        return str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
