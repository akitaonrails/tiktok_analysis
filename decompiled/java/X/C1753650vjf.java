package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundlePrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleTotalPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.NumberFormat;
import java.util.HashMap;
import kotlin.jvm.internal.AwS109S1200000_26;

/* JADX INFO: renamed from: X.0vjf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753650vjf {
    public final SeaPdpViewModel LIZ;
    public boolean LIZIZ;
    public String LIZJ;

    public C1753650vjf(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public static void LIZ(LaneParams laneParams, BundleInfo bundleInfo) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(bundleInfo.daInfo);
        Object obj6 = "";
        if (mapLJIIJ == null || (obj = mapLJIIJ.get("campaign_type")) == null) {
            obj = "";
        }
        laneParams.plusAssign("campaign_type", obj);
        if (mapLJIIJ == null || (obj2 = mapLJIIJ.get("campaign_channel")) == null) {
            obj2 = "";
        }
        laneParams.plusAssign("campaign_channel", obj2);
        if (mapLJIIJ == null || (obj3 = mapLJIIJ.get("campaign_user_tag")) == null) {
            obj3 = "";
        }
        laneParams.plusAssign("campaign_user_tag", obj3);
        if (mapLJIIJ == null || (obj4 = mapLJIIJ.get("campaign_id")) == null) {
            obj4 = "";
        }
        laneParams.plusAssign("campaign_id", obj4);
        if (mapLJIIJ != null && (obj5 = mapLJIIJ.get("campaign_cost_role")) != null) {
            obj6 = obj5;
        }
        laneParams.plusAssign("campaign_cost_role", obj6);
    }

    public final void LIZIZ(LaneParams laneParams, BundleInfo bundleInfo) {
        String str;
        String str2;
        laneParams.plusAssign("module_name", "bundle_deal");
        BundleTotalPrice bundleTotalPrice = bundleInfo.totalPrice;
        String str3 = null;
        if (bundleTotalPrice != null && (str2 = bundleTotalPrice.activityId) != null && str2.length() != 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("is_discounted_bundle_deal", str);
        laneParams.plusAssign("bundle_id", bundleInfo.bundleId);
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        if (productPackStruct != null) {
            str3 = productPackStruct.productId;
        }
        laneParams.plusAssign("product_id", str3);
    }

    public final void LIZJ(LaneParams laneParams, BundleProduct bundleProduct, int i) {
        String str;
        String str2;
        String str3;
        laneParams.plusAssign("product_id", bundleProduct.productId);
        BundlePrice bundlePrice = bundleProduct.productPrice;
        String str4 = "";
        if (bundlePrice == null || (str = bundlePrice.originalPrice) == null) {
            str = "";
        }
        laneParams.plusAssign("original_price", str);
        BundlePrice bundlePrice2 = bundleProduct.productPrice;
        if (bundlePrice2 == null || (str2 = bundlePrice2.realPrice) == null) {
            str2 = "";
        }
        laneParams.plusAssign("sales_price", str2);
        String str5 = bundleProduct.productSource;
        if (str5 != null) {
            str4 = str5;
        }
        laneParams.plusAssign("product_source", str4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('_');
        sbLIZ.append(i + 1);
        laneParams.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        BundlePrice bundlePrice3 = bundleProduct.productPrice;
        if (bundlePrice3 != null && (str3 = bundlePrice3.discount) != null && str3.length() > 0) {
            try {
                laneParams.plusAssign("discount_ratio", NumberFormat.getPercentInstance().parse(bundleProduct.productPrice.discount.substring(1)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZLLL(View view, BundleInfo bundleInfo, String str) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        C128Y c128yLIZ = C946803n0.LIZ(view);
        if ((c128yLIZ instanceof InterfaceC1748810vbr) && (interfaceC1748810vbr = (InterfaceC1748810vbr) c128yLIZ) != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbr, new C10516049i(), new AwS109S1200000_26(this, bundleInfo, str, 43));
        }
    }
}
