package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18MH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ C18MY LLILLJJLI;
    public final /* synthetic */ AnchorProductInfoModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ C259800zU LLILZLL;
    public final /* synthetic */ TuxIconView LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18MH(View view, C18MY c18my, AnchorProductInfoModel anchorProductInfoModel, String str, C013C c013c, C259800zU c259800zU, TuxIconView tuxIconView, boolean z, String str2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = c18my;
        this.LLILLL = anchorProductInfoModel;
        this.LLILZ = str;
        this.LLILZIL = c013c;
        this.LLILZLL = c259800zU;
        this.LLIZ = tuxIconView;
        this.LLIZLLLIL = z;
        this.LLJ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
        Map<String, String> map;
        List<SkuItem> listN5;
        Map<String, String> map2;
        Map<String, String> map3;
        View view = this.LL;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        C18MY c18my = this.LLILLJJLI;
        ProductListModel productListModel = c18my.LLILZ;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLL;
        int i = c18my.LLILLJJLI;
        boolean z = !this.LLILZIL.element;
        int i2 = c18my.LLIZ.panelStyle;
        String str = c18my.LLJIJIL;
        List<SkuItem> listN52 = c18my.N5(anchorProductInfoModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        Map<String, C21271218Mc> map4 = this.LLILLJJLI.LLJI.LJIJI;
        String str2 = this.LLILZ;
        anchorBizUtils.getClass();
        linkedHashMap.putAll(AnchorBizUtils.LJJIJ(str2, map4));
        C18MY c18my2 = this.LLILLJJLI;
        C21271018Ma c21271018MaL5 = c18my2.L5(Integer.valueOf(c18my2.LLILLJJLI), this.LLILZ);
        SkuItem skuItem = null;
        linkedHashMap.putAll(AnchorBizUtils.LJJJ(c21271018MaL5 != null ? c21271018MaL5.LJIIIZ : null));
        C18MY c18my3 = this.LLILLJJLI;
        C21271018Ma c21271018MaL52 = c18my3.L5(Integer.valueOf(c18my3.LLILLJJLI), this.LLILZ);
        Map mapLJJIZ = AnchorBizUtils.LJJIZ(c21271018MaL52 != null ? c21271018MaL52.LJIILLIIL : null);
        if (mapLJJIZ != null) {
            linkedHashMap.putAll(mapLJJIZ);
        }
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        String str3 = this.LLILZ;
        c21272018Mk.getClass();
        C21272018Mk.LIZJ(str3, linkedHashMap);
        linkedHashMap.putAll(C18LA.LIZJ(this.LLILLJJLI.LL, this.LLJ));
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_button_click", new C21269718Ln(productListModel, anchorProductInfoModel, i, z, i2, str, linkedHashMap, listN52));
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_add_to_cart_shows_pdp_page", false)) {
            C18MY c18my4 = this.LLILLJJLI;
            c18my4.LLJI.LIZ(c18my4.LL, c18my4.LLILLJJLI, this.LLILLL, c18my4.LLJILJIL, "cart");
        } else if (!this.LLILZIL.element) {
            C18MY c18my5 = this.LLILLJJLI;
            IECommerceVideoService iECommerceVideoService = c18my5.LLJ;
            if (iECommerceVideoService != null) {
                iECommerceVideoService.LJFF(this.LLIZ, (ViewGroup) c18my5.LL.findViewById(R.id.azy), AnchorBizUtils.LJJJJJ(this.LLILLL.extraData, 2));
            }
            String strLIZJ = this.LLILLJJLI.LLJI.LIZJ(this.LLILZ);
            C21272518Mp.LIZ.getClass();
            C21272518Mp.LIZIZ = true;
            C18M2 c18m2 = C18M2.LIZ;
            C18MY c18my6 = this.LLILLJJLI;
            String str4 = c18my6.LLILZ.eventType;
            Integer numValueOf = Integer.valueOf(c18my6.LLILLJJLI);
            C18MY c18my7 = this.LLILLJJLI;
            String str5 = c18my7.LLJIJIL;
            AnchorProductInfoModel anchorProductInfoModel2 = this.LLILLL;
            ProductListModel productListModel2 = c18my7.LLILZ;
            List<SkuItem> listN53 = c18my7.N5(anchorProductInfoModel2);
            Map<String, String> map5 = this.LLILLJJLI.LLJILJILJ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("previous_page", "video");
            linkedHashMap2.put("button_type", this.LLILZIL.element ? "unable_to_cart" : "able_to_cart");
            BcmStandardTrack bcmStandardTrack = this.LLILLL.extraData.bcmStandardTrack;
            if (bcmStandardTrack != null && (map3 = bcmStandardTrack.trackParam) != null) {
                linkedHashMap2.putAll(map3);
            }
            c18m2.getClass();
            Map mapLIZ = C18M2.LIZ(str4, numValueOf, strLIZJ, str5, anchorProductInfoModel2, productListModel2, listN53, map5, linkedHashMap2);
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(mapLIZ);
            Integer num = this.LLILLL.extraData.bizType;
            C18MY c18my8 = this.LLILLJJLI;
            String strLIZIZ = C18LA.LIZIZ(c18my8.LLIZ.panelStyle, c18my8.LLILLJJLI, "c7828.d9074_iplaceholder_w6919");
            BcmStandardTrack bcmStandardTrack2 = this.LLILLL.extraData.bcmStandardTrack;
            SkuPanelParam skuPanelParam = new SkuPanelParam(num, 0, strLIZIZ, (bcmStandardTrack2 == null || (map2 = bcmStandardTrack2.chainParam) == null) ? null : map2.toString(), Boolean.TRUE, null, strLJIIIIZZ, null);
            AnchorProductInfoModel anchorProductInfoModel3 = this.LLILLL;
            C18MY c18my9 = this.LLILLJJLI;
            ProductListModel productListModel3 = c18my9.LLILZ;
            String strLJIIIIZZ2 = C21272218Mm.LJIIIIZZ(anchorProductInfoModel3, null, productListModel3, productListModel3.eventType, c18my9.LLJIJIL, strLIZJ, c18my9.LLILZIL, "video", null, null, null, null);
            AnchorProductInfoModel anchorProductInfoModel4 = this.LLILLL;
            AnchorProductInfo anchorProductInfo = anchorProductInfoModel4.extraData;
            if (this.LLIZLLLIL && (listN5 = this.LLILLJJLI.N5(anchorProductInfoModel4)) != null) {
                skuItem = (SkuItem) ListProtector.get(listN5, 0);
            }
            String strLJJII = AnchorBizUtils.LJJII(this.LLILLL.extraData.schema);
            String str6 = this.LLILLJJLI.LLJIJIL;
            HashMap map6 = new HashMap();
            for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    map6.put(key, value);
                }
            }
            C18MY c18my10 = this.LLILLJJLI;
            Map<String, Object> mapLIZLLL = c18my10.LLJI.LIZLLL(this.LLILLL, this.LLILZ, true ^ this.LLILZIL.element, c18my10.LLJILJIL);
            if (this.LLIZLLLIL) {
                C18MY c18my11 = this.LLILLJJLI;
                mapLIZLLL.putAll(C18LA.LIZJ(c18my11.LL, C18LA.LIZIZ(c18my11.LLIZ.panelStyle, c18my11.LLILLJJLI, "c7828.d9074_iplaceholder_w6919")));
            }
            BcmStandardTrack bcmStandardTrack3 = this.LLILLL.extraData.bcmStandardTrack;
            if (bcmStandardTrack3 != null && (map = bcmStandardTrack3.trackParam) != null) {
                mapLIZLLL.putAll(map);
            }
            AnchorBizUtils.LJL(view, anchorProductInfo, skuItem, strLJJII, str6, map6, mapLIZLLL, skuPanelParam, C1741890vQh.LJIIJ(strLJIIIIZZ2), AFwS223S0000000_32.get$arr$(157));
        } else if (((CharSequence) this.LLILZLL.element).length() > 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI.LL);
            c1389890mGx.LJIIJ((CharSequence) this.LLILZLL.element);
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILLJJLI.LL);
            c1389890mGx2.LJIIJ(this.LLILLJJLI.LLILLL.getString(2131845266));
            c1389890mGx2.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
