package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04H8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04H8 {
    public final PdpViewModel LIZ;

    public C04H8(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZ(String str, String str2) {
        LinkedHashMap linkedHashMap;
        ProductPackStruct productPackStruct;
        Map<String, Object> map;
        Object obj;
        String string;
        Map<String, Object> map2;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            linkedHashMap = new LinkedHashMap(map2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZ.LLJI;
        if (pdpEnterParam2 != null && (map = pdpEnterParam2.trackParams) != null && (obj = map.get("enter_from_info")) != null && (string = obj.toString()) != null && !a0.LJJJIL(string)) {
            linkedHashMap.put("enter_from", string);
        }
        linkedHashMap.put("enter_method", "showcase_detail");
        linkedHashMap.put("product_id", this.LIZ.getProductId());
        if (C041G.LJIILLIIL(this.LIZ.LLJILLL) && (productPackStruct = this.LIZ.LLJILLL) != null) {
            linkedHashMap.putAll(productPackStruct.LIZLLL());
        }
        linkedHashMap.put("previous_page", "product_detail");
        linkedHashMap.put("source_previous_page", "product_detail");
        IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
        if (iECommerceShowcaseService != null) {
            ViewModelKt.getViewModelScope(this.LIZ);
            iECommerceShowcaseService.LIZLLL();
        }
    }
}
