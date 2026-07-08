package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ext, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1108990ext extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "closeTime", required = true)
    Number getCloseTime();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contentInfo", required = false)
    String getContentInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "height", required = true)
    Number getHeight();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomId", required = true)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
