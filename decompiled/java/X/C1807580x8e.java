package X;

import com.bytedance.android.live.wallet.model.IapProductBuyParam;
import com.bytedance.android.live.wallet.model.IapProductBuyResult;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0x8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807580x8e extends AbstractC1835360xrS<IapProductBuyParam, Object> implements InterfaceC1807590x8f {
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 158));

    @Override // X.InterfaceC1807590x8f
    public final void L0() {
    }

    @Override // X.InterfaceC1807590x8f
    public final void LIZIZ() {
    }

    @Override // X.AbstractC1835360xrS
    public final void LJIIIZ() {
        ((InterfaceC1807610x8h) this.LLILZIL.getValue()).onDestroy();
    }

    @Override // X.InterfaceC1807590x8f
    public final void LIZ(IapProductBuyResult iapProductBuyResult) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 0);
        jSONObject2.put("data", jSONObject);
        jSONObject.put("error_code", iapProductBuyResult.errorCode);
        jSONObject.put("detail_code", iapProductBuyResult.detailCode);
        jSONObject.put("error_msg", iapProductBuyResult.errorMsg);
        if (LJ()) {
            this.LLILLL.LIZIZ(jSONObject2);
            LJIIIIZZ();
        }
        ((InterfaceC1807610x8h) this.LLILZIL.getValue()).onDestroy();
    }

    @Override // X.InterfaceC1807590x8f
    public final void LIZLLL(IapProductBuyResult iapProductBuyResult) throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("data", jSONObject);
        IapProductBuyResult.Item item = iapProductBuyResult.data;
        String str3 = "";
        if (item == null || (str = item.productId) == null) {
            str = "";
        }
        jSONObject.put("product_id", str);
        IapProductBuyResult.Item item2 = iapProductBuyResult.data;
        if (item2 != null && (str2 = item2.orderId) != null) {
            str3 = str2;
        }
        jSONObject.put("order_id", str3);
        if (LJ()) {
            this.LLILLL.LIZIZ(jSONObject2);
            LJIIIIZZ();
        }
        ((InterfaceC1807610x8h) this.LLILZIL.getValue()).onDestroy();
    }

    @Override // X.AbstractC1835360xrS
    public final void LJII(IapProductBuyParam iapProductBuyParam, C2204771BQt c2204771BQt) {
        ((InterfaceC1807610x8h) this.LLILZIL.getValue()).Q72(c2204771BQt.LIZ, iapProductBuyParam);
    }
}
