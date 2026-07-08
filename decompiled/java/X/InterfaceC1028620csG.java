package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0csG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1028620csG extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "contactInfo", required = true)
    Map<String, Object> getContactInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableAutofillV2", required = true)
    Boolean getEnableAutofillV2();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "contactInfo", required = true)
    void setContactInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enableAutofillV2", required = true)
    void setEnableAutofillV2(Boolean bool);
}
