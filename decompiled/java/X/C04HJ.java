package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartPreloadRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetCartRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddRequest;
import java.util.Map;

/* JADX INFO: renamed from: X.04HJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public interface C04HJ {
    public static final C04HK LIZ = C04HK.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/cart/get_cart")
    Object LIZ(@C040I GetCartRequest getCartRequest, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/cart/preload")
    Object LIZIZ(@C040I GetCartPreloadRequest getCartPreloadRequest, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/cart/add_item_to_cart")
    Object LIZJ(@C040I Map<String, Object> map, InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/cart/preload_cart_info")
    Object LIZLLL(@C040I GetPreloadCartInfoRequest getPreloadCartInfoRequest, InterfaceC1364105Vn<? super C04HP> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/cart/recommend_after_add")
    C11NZ<C938503lf> LJ(@C040I RecommendAfterAddRequest recommendAfterAddRequest);

    @InterfaceC1501240pAY("/api/v1/shop/cart/add_item_to_cart")
    C11NZ<C10367043p> LJFF(@C040I AddItemToCartRequest addItemToCartRequest);

    @InterfaceC1501240pAY("/api/v1/shop/cart/madd_items_to_cart")
    C11NZ<C04HH> LJI(@C040I BundleAddItemsToCartRequest bundleAddItemsToCartRequest);
}
