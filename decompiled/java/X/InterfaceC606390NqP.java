package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC606390NqP extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();

    @InterfaceC1549470qQL(defaultValue = @InterfaceC1549510qQP(boolValue = true, type = DefaultType.BOOL), isGetter = true, keyPath = "isSticky", required = false)
    boolean isSticky();
}
