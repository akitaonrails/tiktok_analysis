package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlResponse;

/* JADX INFO: renamed from: X.0w82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1768760w82 extends InterfaceC149400hg {
    Object LLLZI(CustomDotGetParamsV2 customDotGetParamsV2, InterfaceC1364105Vn interfaceC1364105Vn);

    Object shopReachControlGet(ShopReachControlGetParams shopReachControlGetParams, InterfaceC1364105Vn<? super C0X52<Response<ShopReachControlResponse>>> interfaceC1364105Vn);

    Object shopReachUpdateV2(CustomDotUpdateParamsV2 customDotUpdateParamsV2, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn);

    Object shopTabRecImpression(n nVar, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
