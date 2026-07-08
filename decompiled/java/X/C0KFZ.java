package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0KFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0KFZ extends XBaseModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = true)
    @InterfaceC1909307dr(option = {"text", "new_line", "item"})
    String getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "value", required = false)
    String getValue();
}
