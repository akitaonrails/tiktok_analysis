package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.03Ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C040D
public interface InterfaceC843603Ri extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizType", required = false)
    Number getBizType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clearCache", required = false)
    Boolean getClearCache();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageName", required = true)
    String getPageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "source", required = false)
    String getSource();
}
