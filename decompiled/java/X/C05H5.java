package X;

import com.ss.android.ugc.aweme.ecommerce.ug.landing.GetLandingShopTabResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05H5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C05H5 {
    @InterfaceC1501240pAY("/api/v1/shop_tab/landing/get")
    Object LIZ(InterfaceC1364105Vn<? super GetLandingShopTabResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop_tab/landing/update")
    Object LIZIZ(@InterfaceC1501120pAM("update_props") int i, @InterfaceC1501120pAM("current_timestamp") String str, @InterfaceC1501120pAM("bring_back_info") String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
