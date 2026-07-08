package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0grw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040E
public interface InterfaceC1182180grw extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "attached_data_map", required = false)
    Map<String, Object> getAttachedDataMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "business_data", required = true)
    String getBusinessData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "attached_data_map", required = false)
    void setAttachedDataMap(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "business_data", required = true)
    void setBusinessData(String str);
}
