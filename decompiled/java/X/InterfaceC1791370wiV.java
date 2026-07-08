package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0wiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1791370wiV extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "merchantId", required = true)
    String getMerchantId();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "productType", required = true)
    @InterfaceC1909307dr(option = {"inapp", "subs"})
    String getProductType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "products", primitiveClassType = String.class, required = true)
    List<String> getProducts();
}
