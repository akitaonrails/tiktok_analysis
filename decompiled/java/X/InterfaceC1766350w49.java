package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0w49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1766350w49 extends XBaseResultModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "action", required = true)
    @InterfaceC1909307dr(option = {"select", "dismiss"})
    String getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "detail", nestedClassType = InterfaceC1766360w4A.class, required = false)
    InterfaceC1766360w4A getDetail();

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "action", required = true)
    @InterfaceC1909307dr(option = {"select", "dismiss"})
    void setAction(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "detail", nestedClassType = InterfaceC1766360w4A.class, required = false)
    void setDetail(InterfaceC1766360w4A interfaceC1766360w4A);
}
