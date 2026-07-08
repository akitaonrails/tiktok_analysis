package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0vQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1741910vQj extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "attach_products", required = false)
    String getAttachProducts();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra_request_params", required = false)
    Map<String, Object> getExtraRequestParams();
}
