package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0TSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040E
public interface InterfaceC747210TSt extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = false)
    void setData(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "timestamp", required = false)
    void setTimestamp(Number number);
}
