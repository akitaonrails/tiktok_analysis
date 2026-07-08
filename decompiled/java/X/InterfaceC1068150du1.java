package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0du1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1068150du1 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "autofillFields", primitiveClassType = String.class, required = false)
    List<String> getAutofillFields();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autofillSessionId", required = false)
    String getAutofillSessionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "currentKey", required = false)
    String getCurrentKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "disShowDialog", required = false)
    Number getDisShowDialog();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hasMessage", required = false)
    Number getHasMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "identify", required = true)
    Number getIdentify();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "messageField", required = false)
    String getMessageField();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "messageType", required = false)
    Number getMessageType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "noKeyReason", required = false)
    Number getNoKeyReason();
}
