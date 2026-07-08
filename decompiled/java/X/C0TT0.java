package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0TT0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface C0TT0 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = true)
    String getKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();
}
