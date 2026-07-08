package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1503330pDv extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "templateInfo", required = false)
    Map<String, Object> getTemplateInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "templateInfo", required = false)
    void setTemplateInfo(Map<String, ? extends Object> map);
}
