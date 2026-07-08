package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1048250dNv extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extJson", required = true)
    Map<String, Object> getExtJson();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extValue", required = true)
    String getExtValue();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "labelName", required = true)
    String getLabelName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = true)
    String getValue();
}
