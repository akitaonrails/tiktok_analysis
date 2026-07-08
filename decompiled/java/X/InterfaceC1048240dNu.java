package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0dNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1048240dNu extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = false)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extJson", required = true)
    Map<String, Object> getExtJson();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extValue", required = true)
    String getExtValue();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "labelName", required = false)
    String getLabelName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = false)
    String getValue();
}
