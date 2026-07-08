package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC601860Nj6 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "risk_info", required = true)
    Map<String, Object> getRiskInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_supported", required = true)
    Boolean isSupported();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "risk_info", required = true)
    void setRiskInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_supported", required = true)
    void setSupported(Boolean bool);
}
