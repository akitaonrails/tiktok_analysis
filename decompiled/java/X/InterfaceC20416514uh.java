package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.14uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C040E
public interface InterfaceC20416514uh extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enableOpen", required = true)
    Boolean getEnableOpen();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "failReason", required = false)
    String getFailReason();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enableOpen", required = true)
    void setEnableOpen(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "failReason", required = false)
    void setFailReason(String str);
}
