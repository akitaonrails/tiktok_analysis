package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.model.Sku;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.0vzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763700vzs {
    public final SkuPanelAssemVM LIZ;

    public C1763700vzs(SkuPanelAssemVM skuPanelAssemVM) {
        this.LIZ = skuPanelAssemVM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(Context context, String str, Bitmap bitmap, String str2) {
        Object obj;
        String strValueOf;
        boolean z;
        String strValueOf2;
        Object obj2;
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        boolean z2;
        ProductBase productBase;
        String str3;
        Object obj3;
        Map<String, Object> map;
        Map<String, Object> map2;
        Object obj4;
        Map<String, Object> map3;
        Object obj5;
        Map<String, Object> map4;
        String str4 = str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ.getClass();
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        String name = null;
        if (productPackStruct != null) {
            C041G.LIZJ(productPackStruct, null);
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        this.LIZ.ml(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 518));
        int value = C0QXR.PDP_SCREENSHOT_FIND_SIMILAR.getValue();
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LIZ.LLJI;
        if (skuEnterParams != null && (map4 = skuEnterParams.trackParams) != null) {
            obj = map4.get("traffic_source_list");
        } else {
            obj = null;
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams("product_detail", "screenshot_find_similar_without_click", C197300pP.LIZ(String.valueOf(obj), Collections.singletonList(6)), null, "", 0, "", "", "", str, null, null, "", "", "", null, null, null, null, value, null, str, null, null, null, null, null, String.valueOf(System.currentTimeMillis()));
        SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LIZ.LLJI;
        if (skuEnterParams2 == null || (map3 = skuEnterParams2.trackParams) == null || (((obj5 = map3.get("search_entrance")) == null || (strValueOf = obj5.toString()) == null || strValueOf.length() <= 0) && (strValueOf = String.valueOf(map3.get("enter_from_info"))) == null)) {
            strValueOf = "";
        }
        PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(strValueOf, str, "photo_search", null, "product_detail", null, "screen_shots_search", null, null, null, null, null, null);
        if (str4 == null && (str4 = (String) c259800zU.element) == null) {
            str4 = "";
        }
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        if (bitmap != null) {
            z = true;
        } else {
            z = false;
        }
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = new PhotoSearchToolsEnterParams(str4, lValueOf, "", null, null, Boolean.valueOf(z), null);
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.LIZ.LLJI;
        if (skuEnterParams3 == null || (map2 = skuEnterParams3.trackParams) == null || (((obj4 = map2.get("search_entrance")) == null || (strValueOf2 = obj4.toString()) == null || strValueOf2.length() <= 0) && (strValueOf2 = String.valueOf(map2.get("enter_from_info"))) == null)) {
            strValueOf2 = "";
        }
        String productId = this.LIZ.getProductId();
        SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.LIZ.LLJI;
        if (skuEnterParams4 != null && (map = skuEnterParams4.trackParams) != null) {
            obj2 = map.get("track_id");
        } else {
            obj2 = null;
        }
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = new PhotoSearchPdpEnterParams(strValueOf2, "sku_panel", "screen_shots", productId, String.valueOf(obj2), null, null);
        HashMap map5 = new HashMap();
        SkuPanelAssemVM skuPanelAssemVM = this.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams5 = skuPanelAssemVM.LLJI;
        if (skuEnterParams5 != null) {
            map5.put("product_id", skuPanelAssemVM.getProductId());
            Map<String, Object> map6 = skuEnterParams5.visitReportParams;
            if (map6 != null && (obj3 = map6.get("seller_id")) != null) {
                map5.put("seller_id", obj3);
            }
        }
        ProductPackStruct productPackStruct2 = this.LIZ.LLJIJIL;
        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null && (str3 = productBase.title) != null) {
            map5.put("product_title", str3);
        }
        map5.put("sku", new Sku(null, null));
        PhotoSearchEnterParams photoSearchEnterParams = new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, photoSearchPdpEnterParams, map5, null, null, null, null);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IEcomSearchDependencyService.class.getName();
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcomSearchDependencyService.class);
        }
        ((IEcomSearchDependencyService) anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin).openPhotoSearchResult(context, photoSearchEnterParams, null, bitmap);
    }
}
