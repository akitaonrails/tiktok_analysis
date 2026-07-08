package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelProductManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.model.VideoProductDaInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18MF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C18MZ LLILLJJLI;
    public final /* synthetic */ AnchorProductInfoModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ View LLIZ;
    public final /* synthetic */ C259800zU LLIZLLLIL;
    public final /* synthetic */ View LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18MF(View view, C18MZ c18mz, AnchorProductInfoModel anchorProductInfoModel, int i, String str, C013C c013c, View view2, C259800zU c259800zU, View view3, boolean z, String str2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c18mz;
        this.LLILLL = anchorProductInfoModel;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = c013c;
        this.LLIZ = view2;
        this.LLIZLLLIL = c259800zU;
        this.LLJ = view3;
        this.LLJI = z;
        this.LLJIJIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        Map<String, String> map;
        List<SkuItem> listLLLIILIL;
        Map<String, String> map2;
        Map<String, String> map3;
        View view = this.LL;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        C18MZ c18mz = this.LLILLJJLI;
        ProductListModel productListModel = c18mz.LL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLL;
        int i = this.LLILZ;
        boolean z = !this.LLILZLL.element;
        int i2 = c18mz.LLIZLLLIL.panelStyle;
        String str = c18mz.LLJIJIL;
        List<SkuItem> listLLLIILIL2 = c18mz.LLLIILIL(anchorProductInfoModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Map<String, C21271218Mc> map4 = this.LLILLJJLI.LLL;
        String str2 = this.LLILZIL;
        anchorBizUtils.getClass();
        linkedHashMap.putAll(AnchorBizUtils.LJJIJ(str2, map4));
        Map<String, Map<String, Object>> map5 = this.LLILLJJLI.LLJJIJIL;
        SkuItem skuItem = null;
        linkedHashMap.putAll(AnchorBizUtils.LJJJ(map5 != null ? (Map) ((LinkedHashMap) map5).get(this.LLILZIL) : null));
        Map<String, VideoProductDaInfo> map6 = this.LLILLJJLI.LLJL;
        Map mapLJJIZ = AnchorBizUtils.LJJIZ(map6 != null ? (VideoProductDaInfo) ((LinkedHashMap) map6).get(this.LLILZIL) : null);
        if (mapLJJIZ != null) {
            linkedHashMap.putAll(mapLJJIZ);
        }
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        String str3 = this.LLILZIL;
        c21272018Mk.getClass();
        C21272018Mk.LIZJ(str3, linkedHashMap);
        linkedHashMap.putAll(C18LA.LIZJ(this.LLIZ, this.LLJIJIL));
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_button_click", new C21269718Ln(productListModel, anchorProductInfoModel, i, z, i2, str, linkedHashMap, listLLLIILIL2));
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_add_to_cart_shows_pdp_page", false)) {
            AnchorPanelProductManager anchorPanelProductManagerLLLIIIIL = this.LLILLJJLI.LLLIIIIL();
            View view2 = this.LLIZ;
            int i3 = this.LLILZ;
            anchorPanelProductManagerLLLIIIIL.LIZ(view2, i3, this.LLILLL, this.LLILLJJLI.LLLFZ(i3), "cart");
        } else if (!this.LLILZLL.element) {
            IECommerceVideoService iECommerceVideoService = this.LLILLJJLI.LLILZLL;
            if (iECommerceVideoService != null) {
                iECommerceVideoService.LJFF(this.LLJ, (ViewGroup) this.LLIZ.findViewById(R.id.azy), AnchorBizUtils.LJJJJJ(this.LLILLL.extraData, 2));
            }
            String strLIZJ = this.LLILLJJLI.LLLIIIIL().LIZJ(this.LLILZIL);
            C21272518Mp.LIZ.getClass();
            C21272518Mp.LIZIZ = true;
            C18M2 c18m2 = C18M2.LIZ;
            String str4 = this.LLILLJJLI.LL.eventType;
            Integer numValueOf = Integer.valueOf(this.LLILZ);
            String str5 = (String) ((LinkedHashMap) this.LLILLJJLI.LLLIIIIL).get(this.LLILZIL);
            C18MZ c18mz2 = this.LLILLJJLI;
            String str6 = c18mz2.LLJIJIL;
            AnchorProductInfoModel anchorProductInfoModel2 = this.LLILLL;
            ProductListModel productListModel2 = c18mz2.LL;
            List<SkuItem> listLLLIILIL3 = c18mz2.LLLIILIL(anchorProductInfoModel2);
            Map<String, String> map7 = this.LLILLJJLI.LLLIIII;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("previous_page", "video");
            linkedHashMap2.put("button_type", this.LLILZLL.element ? "unable_to_cart" : "able_to_cart");
            BcmStandardTrack bcmStandardTrack = this.LLILLL.extraData.bcmStandardTrack;
            if (bcmStandardTrack != null && (map3 = bcmStandardTrack.trackParam) != null) {
                linkedHashMap2.putAll(map3);
            }
            c18m2.getClass();
            Map mapLIZ = C18M2.LIZ(str4, numValueOf, str5, str6, anchorProductInfoModel2, productListModel2, listLLLIILIL3, map7, linkedHashMap2);
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(mapLIZ);
            Integer num = this.LLILLL.extraData.bizType;
            String strLIZIZ = C18LA.LIZIZ(this.LLILLJJLI.LLJILJIL, this.LLILZ, "c7828.d9074_iplaceholder_w6919");
            BcmStandardTrack bcmStandardTrack2 = this.LLILLL.extraData.bcmStandardTrack;
            SkuPanelParam skuPanelParam = new SkuPanelParam(num, 0, strLIZIZ, (bcmStandardTrack2 == null || (map2 = bcmStandardTrack2.chainParam) == null) ? null : map2.toString(), Boolean.TRUE, null, strLJIIIIZZ, null);
            AnchorProductInfoModel anchorProductInfoModel3 = this.LLILLL;
            C18MZ c18mz3 = this.LLILLJJLI;
            ProductListModel productListModel3 = c18mz3.LL;
            String strLJIIIIZZ2 = C21272218Mm.LJIIIIZZ(anchorProductInfoModel3, null, productListModel3, productListModel3 != null ? productListModel3.eventType : null, c18mz3.LLJIJIL, strLIZJ, c18mz3.LLILZ, "video", null, null, null, null);
            AnchorProductInfoModel anchorProductInfoModel4 = this.LLILLL;
            AnchorProductInfo anchorProductInfo = anchorProductInfoModel4.extraData;
            if (this.LLJI && (listLLLIILIL = this.LLILLJJLI.LLLIILIL(anchorProductInfoModel4)) != null) {
                skuItem = (SkuItem) ListProtector.get(listLLLIILIL, 0);
            }
            String strLJJII = AnchorBizUtils.LJJII(this.LLILLL.extraData.schema);
            String str7 = this.LLILLJJLI.LLJIJIL;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            Map<String, Object> mapLIZLLL = this.LLILLJJLI.LLLIIIIL().LIZLLL(this.LLILLL, this.LLILZIL, !this.LLILZLL.element, this.LLILLJJLI.LLLFZ(this.LLILZ));
            if (this.LLJI) {
                mapLIZLLL.putAll(C18LA.LIZJ(this.LLIZ, C18LA.LIZIZ(this.LLILLJJLI.LLJILJIL, this.LLILZ, "c7828.d9074_iplaceholder_w6919")));
            }
            BcmStandardTrack bcmStandardTrack3 = this.LLILLL.extraData.bcmStandardTrack;
            if (bcmStandardTrack3 != null && (map = bcmStandardTrack3.trackParam) != null) {
                mapLIZLLL.putAll(map);
            }
            AnchorBizUtils.LJL(view, anchorProductInfo, skuItem, strLJJII, str7, linkedHashMap3, mapLIZLLL, skuPanelParam, C1741890vQh.LJIIJ(strLJIIIIZZ2), AFwS223S0000000_32.get$arr$(156));
        } else if (((CharSequence) this.LLIZLLLIL.element).length() > 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLIZ);
            c1389890mGx.LJIIJ((CharSequence) this.LLIZLLLIL.element);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLIZ);
            c1389890mGx2.LJIIJ(this.LLILLJJLI.LLILLJJLI.getString(2131845266));
            c1389890mGx2.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
