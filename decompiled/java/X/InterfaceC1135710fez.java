package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0fez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040E
public interface InterfaceC1135710fez extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "comboCount", required = false)
    Number getComboCount();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupId", required = false)
    String getGroupId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "comboCount", required = false)
    void setComboCount(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "groupId", required = false)
    void setGroupId(String str);
}
