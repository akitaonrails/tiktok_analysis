package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0KTP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KTP extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizLine", required = true)
    Number getBizLine();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fromUserID", required = true)
    String getFromUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantId", required = false)
    String getMerchantId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productIDs", primitiveClassType = String.class, required = true)
    List<String> getProductIDs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subMerchantID", required = false)
    String getSubMerchantID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toUserID", required = true)
    String getToUserID();
}
