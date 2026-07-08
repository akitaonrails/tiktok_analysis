package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0hCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1195050hCh extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isSticky", required = false)
    Boolean isSticky();
}
