package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.044b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10379044b {
    public final Map<String, Object> LIZ = new ConcurrentHashMap();
    public final Map<String, Object> LIZIZ;
    public final Map<String, Map<String, Object>> LIZJ;

    public final Map<String, Object> LIZ() {
        if (((ConcurrentHashMap) this.LIZ).isEmpty() && ((ConcurrentHashMap) this.LIZIZ).isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZ);
        linkedHashMap.putAll(this.LIZIZ);
        Iterator it2 = ((ConcurrentHashMap) this.LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashMap.putAll((Map) ((Map.Entry) it2.next()).getValue());
        }
        return linkedHashMap;
    }

    public C10379044b() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZIZ = concurrentHashMap;
        this.LIZJ = new ConcurrentHashMap();
        concurrentHashMap.put("rd_pdp_monitor_version", "v4190");
    }

    public final void LIZIZ(Map<String, ? extends Object> map) {
        ((ConcurrentHashMap) this.LIZIZ).putAll(map);
    }

    public final void LIZJ(String str, Map<String, ? extends Object> map) {
        if (map != null && !map.isEmpty()) {
            ((ConcurrentHashMap) this.LIZJ).put(str, map);
        } else {
            ((ConcurrentHashMap) this.LIZJ).remove(str);
        }
    }

    public final void LJ(C10380044c c10380044c, ProductPackStruct productPackStruct) {
        String str;
        String str2;
        HashMap<String, Object> mapLJIIJ = null;
        if (c10380044c != null) {
            PdpPaymentModule pdpPaymentModule = c10380044c.LJ;
            if (pdpPaymentModule != null && (str2 = pdpPaymentModule.pdpDaInfo) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str2);
            }
            LIZJ("key_pdp_payment_module", mapLJIIJ);
            return;
        }
        if (productPackStruct == null) {
            return;
        }
        PdpPaymentModule pdpPaymentModule2 = productPackStruct.pdpPaymentModule;
        if (pdpPaymentModule2 != null && (str = pdpPaymentModule2.pdpDaInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        }
        LIZJ("key_pdp_payment_module", mapLJIIJ);
    }

    public final void LIZLLL(C10380044c c10380044c, SkuPanelState skuPanelState, ProductPackStruct productPackStruct) {
        String str;
        PdpPaymentModule pdpPaymentModule;
        String str2;
        Map<String, PdpPaymentModule> map;
        PdpPaymentModule pdpPaymentModule2;
        HashMap<String, Object> mapLJIIJ = null;
        if (c10380044c != null) {
            if ((skuPanelState != null && (map = skuPanelState.paymentModuleCache) != null && (pdpPaymentModule2 = map.get(skuPanelState.skuId)) != null && (str2 = pdpPaymentModule2.pdpDaInfo) != null) || ((pdpPaymentModule = c10380044c.LJ) != null && (str2 = pdpPaymentModule.pdpDaInfo) != null)) {
                mapLJIIJ = C1741890vQh.LJIIJ(str2);
            }
            LIZJ("key_pdp_payment_module", mapLJIIJ);
            return;
        }
        if (productPackStruct == null) {
            return;
        }
        PdpPaymentModule pdpPaymentModule3 = productPackStruct.pdpPaymentModule;
        if (pdpPaymentModule3 != null && (str = pdpPaymentModule3.pdpDaInfo) != null) {
            mapLJIIJ = C1741890vQh.LJIIJ(str);
        }
        LIZJ("key_pdp_payment_module", mapLJIIJ);
    }
}
