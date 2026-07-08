package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771050wBj implements InterfaceC331400Cyw {
    @Override // X.InterfaceC331400Cyw
    public final Object reportImpression(n nVar, InterfaceC1364105Vn<? super C0X52<Response<Map<String, Object>>>> interfaceC1364105Vn) {
        ShopMallApiWithPreload.LIZ.getClass();
        return C1771330wCB.LIZIZ.reportImpression(nVar, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC331400Cyw
    public final C15O7 LJLILLLLZI(n nVar, List list, Map map) {
        ShopMallApiWithPreload.LIZ.getClass();
        return C1771330wCB.LIZIZ.getShopBffStreamData(list, nVar, map, null);
    }

    @Override // X.InterfaceC331400Cyw
    public final Object v(List<C080U> list, n nVar, InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn) {
        ShopMallApiWithPreload.LIZ.getClass();
        return C1771330wCB.LIZIZ.getShopFeedBffData(list, nVar, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC331400Cyw
    public final Object LLLLILI(List<C080U> list, n nVar, Map<String, String> map, InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn) {
        ShopMallApiWithPreload.LIZ.getClass();
        return C1771330wCB.LIZIZ.getShopBffData(list, nVar, map, interfaceC1364105Vn);
    }
}
