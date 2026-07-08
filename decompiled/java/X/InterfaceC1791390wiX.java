package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0wiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1791390wiX extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = FollowStatusChangeMethod.PARAM_UID, required = false)
    String getId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantId", required = false)
    String getMerchantId();

    @InterfaceC1909207dq(option = {0, 1, 2, 3, 4})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "paymentChannel", required = true)
    Number getPaymentChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scenario", required = true)
    String getScenario();
}
