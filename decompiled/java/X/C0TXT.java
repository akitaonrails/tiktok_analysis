package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TXT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface C0TXT extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionType", required = true)
    Number getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeId", required = true)
    String getAwemeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cardType", required = true)
    Number getCardType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subCardType", required = false)
    String getSubCardType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = true)
    Number getTimestamp();
}
