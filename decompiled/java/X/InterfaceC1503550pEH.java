package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0pEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1503550pEH extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "addCommonParams", required = false)
    Boolean getAddCommonParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = false)
    Map<String, Object> getParams();
}
