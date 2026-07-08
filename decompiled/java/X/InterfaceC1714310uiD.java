package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0uiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040D
public interface InterfaceC1714310uiD extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "category", required = true)
    String getCategory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "context", nestedClassType = InterfaceC1714320uiE.class, required = true)
    InterfaceC1714320uiE getContext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "mid", required = true)
    String getMid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "muid", required = true)
    String getMuid();
}
