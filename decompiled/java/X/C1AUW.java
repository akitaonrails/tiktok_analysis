package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1AUW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AUW extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "inAppIsNotReduced", required = true)
    Boolean getInAppIsNotReduced();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "systemIsNotReduced", required = true)
    Boolean getSystemIsNotReduced();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "inAppIsNotReduced", required = true)
    void setInAppIsNotReduced(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "systemIsNotReduced", required = true)
    void setSystemIsNotReduced(Boolean bool);
}
