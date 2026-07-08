package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1AIK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1AIK extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "entrance", required = true)
    String getEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "saveType", required = true)
    String getSaveType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "templateId", required = false)
    Number getTemplateId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "templateName", required = false)
    String getTemplateName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "wishItems", required = true)
    List<Map<String, Object>> getWishItems();
}
