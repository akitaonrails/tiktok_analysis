package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0dHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1044300dHY extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "event", required = true)
    String getEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", nestedClassType = InterfaceC1044310dHZ.class, required = true)
    InterfaceC1044310dHZ getMessage();
}
