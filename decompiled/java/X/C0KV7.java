package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KV7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040D
public interface C0KV7 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "config", required = false)
    Map<String, Object> getConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = false)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();
}
