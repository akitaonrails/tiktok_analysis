package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC601550Nib extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientDBData", required = false)
    Map<String, Object> getClientDBData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientRAMData", required = false)
    Map<String, Object> getClientRAMData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientDBData", required = false)
    void setClientDBData(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientRAMData", required = false)
    void setClientRAMData(Map<String, ? extends Object> map);
}
