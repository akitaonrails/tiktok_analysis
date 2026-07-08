package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductRecommendData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752480vhm {
    public final PdpViewModel LIZ;
    public ProductRecommendData LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final Map<String, C1752460vhk> LJ = new LinkedHashMap();

    public final void LIZIZ() {
        PdpViewModel pdpViewModel = this.LIZ;
        ProductPackStruct productPackStruct = pdpViewModel.LLJILLL;
        if (productPackStruct == null || productPackStruct.productRecommendContext == null || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        C948503nH.LJFF(pdpViewModel, C0PEM.LIZJ, new C1752490vhn(this, null));
    }

    public C1752480vhm(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
    }

    public final void LIZ(View view, String str, String str2, Map<String, ? extends Object> map) {
        Map<String, Object> mapLJ;
        Object objPut;
        String string;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLJI;
        if (pdpEnterParam == null || (mapLJ = pdpEnterParam.trackParams) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        HashMap map2 = new HashMap(mapLJ);
        if (map != null) {
            map2.putAll(map);
        }
        map2.put("pdp_path", "pass_pdp");
        map2.put("previous_page", "product_detail");
        try {
            Object obj = map2.get("entrance_info");
            if (obj != null && (string = obj.toString()) != null) {
                JSONObject jSONObject = new JSONObject(string);
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("pdp_path", "pass_pdp");
                objPut = map2.put("entrance_info", C786410Ut5.J3(jSONObject));
            } else {
                objPut = null;
            }
            C189200o6.m2constructorimpl(objPut);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("trackParams", C1741890vQh.LJIIIIZZ(map2));
        C919503ib.LIZIZ(view.getContext(), this.LIZ.LLILZIL.LJII(str2, str, null), linkedHashMap, false).open();
    }
}
