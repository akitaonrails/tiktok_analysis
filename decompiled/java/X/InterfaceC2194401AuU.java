package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1AuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040E
public interface InterfaceC2194401AuU extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "errorMsg", required = false)
    String getErrorMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "getFriendCloudStorageResponse", nestedClassType = InterfaceC2194431AuX.class, required = false)
    InterfaceC2194431AuX getGetFriendCloudStorageResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "getUserCloudStorageResponse", nestedClassType = InterfaceC2194441AuY.class, required = false)
    InterfaceC2194441AuY getGetUserCloudStorageResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "removeUserCloudStorageResponse", nestedClassType = InterfaceC2194451AuZ.class, required = false)
    InterfaceC2194451AuZ getRemoveUserCloudStorageResponse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "setUserCloudStorageResponse", nestedClassType = InterfaceC2194461Aua.class, required = false)
    InterfaceC2194461Aua getSetUserCloudStorageResponse();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errorMsg", required = false)
    void setErrorMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "getFriendCloudStorageResponse", nestedClassType = InterfaceC2194431AuX.class, required = false)
    void setGetFriendCloudStorageResponse(InterfaceC2194431AuX interfaceC2194431AuX);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "getUserCloudStorageResponse", nestedClassType = InterfaceC2194441AuY.class, required = false)
    void setGetUserCloudStorageResponse(InterfaceC2194441AuY interfaceC2194441AuY);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "removeUserCloudStorageResponse", nestedClassType = InterfaceC2194451AuZ.class, required = false)
    void setRemoveUserCloudStorageResponse(InterfaceC2194451AuZ interfaceC2194451AuZ);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "setUserCloudStorageResponse", nestedClassType = InterfaceC2194461Aua.class, required = false)
    void setSetUserCloudStorageResponse(InterfaceC2194461Aua interfaceC2194461Aua);
}
