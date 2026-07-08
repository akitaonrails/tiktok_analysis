package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.repository.CustomDotApi;

/* JADX INFO: renamed from: X.0w84, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768780w84 implements InterfaceC1768760w82 {
    @Override // X.InterfaceC1768760w82
    public final Object LLLZI(CustomDotGetParamsV2 customDotGetParamsV2, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137982);
        boolean zLJI2 = MethodIDManager.LJI(137328);
        if (customDotGetParamsV2.reqState == EnumC1768950w8L.UG_BACK_FYP_SHOW_BUBBLE.getValue()) {
            CustomDotApi.LIZ.getClass();
            Object objShopDeliveryLandingGet = C1768840w8A.LIZIZ.shopDeliveryLandingGet(customDotGetParamsV2, null, null, null, interfaceC1364105Vn);
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return objShopDeliveryLandingGet;
        }
        if (((Number) C268980AgS.LIZ.getValue()).intValue() == 1) {
            CustomDotApi.LIZ.getClass();
            Object objShopAlgorithmReachGet = C1768840w8A.LIZIZ.shopAlgorithmReachGet(customDotGetParamsV2, null, null, null, interfaceC1364105Vn);
            if (zLJI2) {
                MethodIDManager.LJ();
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return objShopAlgorithmReachGet;
        }
        CustomDotApi.LIZ.getClass();
        Object objShopReachGetV2 = C1768840w8A.LIZIZ.shopReachGetV2(customDotGetParamsV2, null, null, null, interfaceC1364105Vn);
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objShopReachGetV2;
    }

    @Override // X.InterfaceC1768760w82
    public final Object shopReachControlGet(ShopReachControlGetParams shopReachControlGetParams, InterfaceC1364105Vn<? super C0X52<Response<ShopReachControlResponse>>> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137779);
        CustomDotApi.LIZ.getClass();
        Object objShopReachControlGet = C1768840w8A.LIZIZ.shopReachControlGet(shopReachControlGetParams, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objShopReachControlGet;
    }

    @Override // X.InterfaceC1768760w82
    public final Object shopReachUpdateV2(CustomDotUpdateParamsV2 customDotUpdateParamsV2, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn) {
        if (((Number) C268980AgS.LIZ.getValue()).intValue() == 1) {
            CustomDotApi.LIZ.getClass();
            return C1768840w8A.LIZIZ.shopAlgorithmReachUpdate(customDotUpdateParamsV2, interfaceC1364105Vn);
        }
        CustomDotApi.LIZ.getClass();
        return C1768840w8A.LIZIZ.shopReachUpdateV2(customDotUpdateParamsV2, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1768760w82
    public final Object shopTabRecImpression(n nVar, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn) {
        CustomDotApi.LIZ.getClass();
        return C1768840w8A.LIZIZ.shopTabRecImpression(nVar, interfaceC1364105Vn);
    }
}
