package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0OXC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface C0OXC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionType", required = true)
    Number getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinBoardId", required = true)
    String getBulletinBoardId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    String getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "itemId", required = true)
    String getItemId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "liveEventId", required = false)
    String getLiveEventId();
}
