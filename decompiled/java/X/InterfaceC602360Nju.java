package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Nju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC602360Nju extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "action_type", required = true)
    Number getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchor_source_type", required = true)
    String getAnchorSourceType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "client_key", required = false)
    String getClientKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = true)
    String getExtra();
}
