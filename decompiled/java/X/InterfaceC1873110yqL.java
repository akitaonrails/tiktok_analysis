package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0yqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1873110yqL extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "biz", required = false)
    String getBiz();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = true)
    String getKey();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "type", required = false)
    @InterfaceC1909307dr(option = {"array", "bool", "double", "float", "int32", "long", "number", "object", "string"})
    String getType();
}
