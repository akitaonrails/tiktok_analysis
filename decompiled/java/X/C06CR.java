package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.06CR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface C06CR extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = true)
    String getCid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clickTimestamp", required = false)
    Number getClickTimestamp();

    @InterfaceC1909207dq(option = {1, 2})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "clickType", required = true)
    Number getClickType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "invitationPanelSource", required = false)
    String getInvitationPanelSource();
}
