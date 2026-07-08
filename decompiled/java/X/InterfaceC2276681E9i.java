package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1E9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C040E
public interface InterfaceC2276681E9i extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomID", required = true)
    String getRoomID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userID", required = true)
    String getUserID();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = true)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "roomID", required = true)
    void setRoomID(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userID", required = true)
    void setUserID(String str);
}
