package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPublishPermissionResponse;
import com.ss.android.ugc.aweme.ecommerce.model.DynamicPhotoEcommerceDataRequest;
import com.ss.android.ugc.aweme.ecommerce.model.DynamicPhotoEcommerceDataResponse;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponse;

/* JADX INFO: renamed from: X.0O4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC613620O4y {
    @InterfaceC1501200pAU("/aweme/v1/oec/content/anchors/publish_permission")
    Object LIZ(@InterfaceC1501120pAM("version") int i, InterfaceC1364105Vn<? super AnchorPublishPermissionResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/item/product_info/get")
    C15O7<GetItemProductInfoResponse> LIZIZ(@C040I GetItemProductInfoRequest getItemProductInfoRequest);

    @InterfaceC1501240pAY("/api/v1/shop/dynamic_photo_text/ecommerce_data/get")
    Object LIZJ(@C040I DynamicPhotoEcommerceDataRequest dynamicPhotoEcommerceDataRequest, InterfaceC1364105Vn<? super Response<DynamicPhotoEcommerceDataResponse>> interfaceC1364105Vn);
}
