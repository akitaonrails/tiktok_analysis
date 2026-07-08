package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1E9X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C040D
public interface C1E9X extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionType", required = true)
    String getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarURLList", primitiveClassType = String.class, required = false)
    List<String> getAvatarURLList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "detailBlockReason", required = false)
    Number getDetailBlockReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "displayID", required = false)
    String getDisplayID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = true)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupChannelID", required = false)
    String getGroupChannelID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "innerChannelID", required = false)
    String getInnerChannelID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "inviteBlockReason", required = false)
    Number getInviteBlockReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "listType", required = true)
    Number getListType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nickName", required = false)
    String getNickName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomID", required = true)
    String getRoomID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secUserID", required = false)
    String getSecUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userID", required = true)
    String getUserID();
}
