package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0xvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837740xvI {
    public static HashMap<String, String> LIZ(InterfaceC1837810xvP interfaceC1837810xvP) {
        HashMap<String, String> map = new HashMap<>();
        map.put("iap_id", interfaceC1837810xvP.getIapId());
        map.put("usd_price_micros", String.valueOf(interfaceC1837810xvP.LIZIZ()));
        map.put("currency", interfaceC1837810xvP.getCurrencyCode());
        map.put("template_id", interfaceC1837810xvP.getTemplateId());
        interfaceC1837810xvP.LJ();
        map.put("has_offer", String.valueOf(false));
        map.put("payment_type", interfaceC1837810xvP.LIZ().getLogValue());
        interfaceC1837810xvP.LIZLLL();
        map.put("is_common_sku", String.valueOf(false));
        return map;
    }
}
