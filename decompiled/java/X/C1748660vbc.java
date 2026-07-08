package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0vbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748660vbc {
    public static final HashMap<String, Class<? extends AbstractC1748750vbl>> LIZ;

    static {
        HashMap<String, Class<? extends AbstractC1748750vbl>> map = new HashMap<>();
        map.put("tiktokec_product_show", C049K.class);
        map.put("tiktokec_banner_show", C049G.class);
        map.put("tiktokec_button_click", C049Y.class);
        map.put("tiktokec_cart_entrance_click", C10483048b.class);
        map.put("tiktokec_enter_page", C049Z.class);
        map.put("tiktokec_stay_page", C10508049a.class);
        map.put("tiktokec_input_click", C10510049c.class);
        map.put("tiktokec_input_staytime", C10511049d.class);
        map.put("tiktokec_module_click", C10516049i.class);
        map.put("tiktokec_module_show", C10515049h.class);
        map.put("tiktokec_module_staytime", C1747860vaK.class);
        map.put("tiktokec_notice_show", C1748680vbe.class);
        map.put("tiktokec_page_show", C048P.class);
        map.put("tiktokec_product_click", C049O.class);
        map.put("tiktokec_product_entrance_click", C1747890vaN.class);
        map.put("tiktokec_product_entrance_show", C1747900vaO.class);
        map.put("tiktokec_search_entrance_show", C1748670vbd.class);
        map.put("tiktokec_search_entrance_click", C1748700vbg.class);
        map.put("show_search", C1748690vbf.class);
        map.put("tiktokec_guide_show", C1748040vac.class);
        map.put("tiktokec_button_show", C049X.class);
        map.put("tiktokec_enter_actionsheet", C10513049f.class);
        map.put("tiktokec_stay_actionsheet", C10512049e.class);
        map.put("tiktokec_campaign_show", C048X.class);
        map.put("tiktokec_shop_entrance_show", AnonymousClass0497.class);
        map.put("tiktokec_toast_show", AnonymousClass0481.class);
        LIZ = map;
    }

    public static AbstractC1748750vbl LIZ(String str) {
        Class<? extends AbstractC1748750vbl> cls = LIZ.get(str);
        if (cls == null) {
            return null;
        }
        try {
            AbstractC1748750vbl abstractC1748750vblNewInstance = cls.newInstance();
            abstractC1748750vblNewInstance.LJ = true;
            return abstractC1748750vblNewInstance;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
