package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.RegionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.ShippingAddressLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.ShippingAddressLocationRequest;

/* JADX INFO: renamed from: X.0vUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1744330vUd {
    public static final C1744340vUe LIZ = C1744340vUe.LIZ;

    @InterfaceC1501240pAY("/api/v1/logistics/district/search")
    C11NZ<Response<SearchDistrictsData>> LIZ(@C040I SearchDistrictRequest searchDistrictRequest);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/location")
    C11NZ<Response<ShippingAddressLocationData>> LIZIZ(@C040I ShippingAddressLocationRequest shippingAddressLocationRequest);

    @InterfaceC1501240pAY("/api/v1/shop/district/locate")
    C11NZ<Response<LocateDistrictData>> LIZJ(@C040I LocateDistrictRequest locateDistrictRequest);

    @InterfaceC1501240pAY("/api/v1/logistics/district/list?tlb_swimlane=address_api")
    C11NZ<Response<DistrictData>> LIZLLL(@C040I RegionRequest regionRequest);
}
