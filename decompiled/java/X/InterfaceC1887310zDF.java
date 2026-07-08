package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0zDF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1887310zDF extends XBaseResultModel {
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "action", required = true)
    @InterfaceC1909307dr(option = {"cancel", "confirm", "mask"})
    String getAction();

    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "action", required = true)
    @InterfaceC1909307dr(option = {"cancel", "confirm", "mask"})
    void setAction(String str);
}
