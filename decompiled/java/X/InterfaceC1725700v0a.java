package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0v0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1725700v0a extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "contactName", required = true)
    String getContactName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "phoneNumber", required = true)
    String getPhoneNumber();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "contactName", required = true)
    void setContactName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "phoneNumber", required = true)
    void setPhoneNumber(String str);
}
