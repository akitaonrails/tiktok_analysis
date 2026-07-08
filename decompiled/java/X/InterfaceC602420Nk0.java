package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC602420Nk0 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "rawData", required = true)
    Map<String, Object> getRawData();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "rawData", required = true)
    void setRawData(Map<String, ? extends Object> map);
}
