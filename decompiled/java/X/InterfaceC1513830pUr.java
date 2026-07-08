package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1513830pUr extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "entrance", required = true)
    String getEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "event_name", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();
}
