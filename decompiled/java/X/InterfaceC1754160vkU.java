package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryResponseData;

/* JADX INFO: renamed from: X.0vkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1754160vkU {
    public static final C1754110vkP LIZ = C1754110vkP.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/cart/get_entry")
    Object LIZ(@C040I GetCartEntryRequest getCartEntryRequest, InterfaceC1364105Vn<? super Response<GetCartEntryResponseData>> interfaceC1364105Vn);
}
