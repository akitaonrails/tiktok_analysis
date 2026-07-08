package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0v9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1731330v9f extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authorId", required = true)
    String getAuthorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomId", required = true)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isNewUser", required = false)
    Number isNewUser();
}
