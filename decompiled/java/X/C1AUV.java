package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1AUV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AUV extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "subType", required = false)
    Number getSubType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "subType", required = false)
    void setSubType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "type", required = true)
    void setType(Number number);
}
