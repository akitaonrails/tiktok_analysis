package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.06SI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface C06SI extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "includeGroupChat", required = true)
    boolean getIncludeGroupChat();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "maxSelectCount", required = true)
    Number getMaxSelectCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionId", required = false)
    String getSessionId();
}
