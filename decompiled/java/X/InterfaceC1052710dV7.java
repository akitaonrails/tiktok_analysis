package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0dV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1052710dV7 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientKey", required = false)
    String getClientKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "getFriendCloudStorageRequest", nestedClassType = InterfaceC1052720dV8.class, required = false)
    InterfaceC1052720dV8 getGetFriendCloudStorageRequest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "getUserCloudStorageRequest", nestedClassType = InterfaceC1052730dV9.class, required = false)
    InterfaceC1052730dV9 getGetUserCloudStorageRequest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "removeUserCloudStorageRequest", nestedClassType = InterfaceC1052740dVA.class, required = false)
    InterfaceC1052740dVA getRemoveUserCloudStorageRequest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "setUserCloudStorageRequest", nestedClassType = InterfaceC1052700dV6.class, required = false)
    InterfaceC1052700dV6 getSetUserCloudStorageRequest();
}
