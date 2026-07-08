package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0urE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1719900urE extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "category", required = true)
    String getCategory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "context", nestedClassType = InterfaceC1719920urG.class, required = true)
    InterfaceC1719920urG getContext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fpSessionId", required = true)
    String getFpSessionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mid", required = true)
    String getMid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "muid", required = true)
    String getMuid();
}
