package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS279S0300000_35;

/* JADX INFO: renamed from: X.1E9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276601E9a extends AbstractC2276631E9d {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1E9Z c1e9z = (C1E9Z) xBaseParamModel;
        C914530ZuF c914530ZuF = new C914530ZuF(c1e9z.getBattleInviteType());
        String userID = c1e9z.getUserID();
        String roomID = c1e9z.getRoomID();
        String actionType = c1e9z.getActionType();
        String innerChannelID = c1e9z.getInnerChannelID();
        String groupChannelID = c1e9z.getGroupChannelID();
        String secUserID = c1e9z.getSecUserID();
        List<String> avatarURLList = c1e9z.getAvatarURLList();
        String nickName = c1e9z.getNickName();
        Number listType = c1e9z.getListType();
        Map<String, Object> extra = c1e9z.getExtra();
        Number inviteBlockReason = c1e9z.getInviteBlockReason();
        Number detailBlockReason = c1e9z.getDetailBlockReason();
        c1e9z.getDisplayID();
        C176600m4.LIZJ(new AwS279S0300000_35(c1e9z, new C2276661E9g(this, completionBlock, c1e9z), new C914280Ztq(userID, roomID, actionType, innerChannelID, groupChannelID, secUserID, avatarURLList, nickName, listType, extra, inviteBlockReason, detailBlockReason, c914530ZuF), 4));
    }
}
