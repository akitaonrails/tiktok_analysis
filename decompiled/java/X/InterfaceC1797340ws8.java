package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import tikcast.api.wallet.tiktok.DiamondBuyRequestParams;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* JADX INFO: renamed from: X.0ws8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1797340ws8 {
    void LIZ(String str, BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse);

    void LIZIZ(DiamondBuyRequestParams diamondBuyRequestParams, BaseResponse<DiamondBuyResult, CreateOrderExtra> baseResponse);

    C1797350ws9 LIZJ(String str);
}
