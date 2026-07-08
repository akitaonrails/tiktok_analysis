package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC606310NqH extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "config", required = false)
    Map<String, Object> getConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "perfParams", required = false)
    Map<String, Object> getPerfParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    String getType();
}
