package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0wI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775030wI9 extends AbstractC1771870wD3 {
    public ShopMallMixViewModel LLILLL;

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        Object obj = LIZIZ().LIZLLL().LJIIIZ.get("shop_mix_mall_vm");
        this.LLILLL = obj instanceof ShopMallMixViewModel ? (ShopMallMixViewModel) obj : null;
        LIZIZ().getEventCenter().LJIIIIZZ("ec_mix_mall_cart_card_change", new InterfaceC606370NqN() { // from class: X.0wIA
            @Override // X.InterfaceC606370NqN
            public final void LIZ(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
                String str;
                ShopMallMixViewModel shopMallMixViewModel;
                Object obj2 = null;
                if (map != null) {
                    obj2 = map.get("mallCartCard");
                }
                if ((obj2 instanceof String) && (str = (String) obj2) != null && (shopMallMixViewModel = this.LIZ.LLILLL) != null) {
                    shopMallMixViewModel.yQ2(str);
                }
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallSetBcmParams", new InterfaceC1775150wIL() { // from class: X.0wI8
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                Map map3;
                Object obj2 = map.get("bcmParams");
                if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map3.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                    C2211631BhB.LIZ(this.LIZ.LIZIZ().LIZLLL().LJ, linkedHashMap);
                    c21175917tt.LIZ(1, "success", null);
                }
            }
        });
    }
}
