package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0w5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1767280w5e extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageSourceList", nestedClassType = InterfaceC849080XSo.class, required = false)
    List<InterfaceC849080XSo> getPageSourceList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pdp_template", required = false)
    String getPdpTemplate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "productIdList", primitiveClassType = String.class, required = true)
    List<String> getProductIdList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourcePageType", required = true)
    String getSourcePageType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trafficSourceList", primitiveClassType = Number.class, required = false)
    List<Number> getTrafficSourceList();
}
