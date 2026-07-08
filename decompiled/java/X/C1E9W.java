package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostJsbViewerWishesInterceptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeWhiteList;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS279S0300000_35;

/* JADX INFO: renamed from: X.1E9W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9W extends AbstractC2276641E9e {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1E9X c1e9x = (C1E9X) xBaseParamModel;
        String userID = c1e9x.getUserID();
        String roomID = c1e9x.getRoomID();
        String actionType = c1e9x.getActionType();
        String innerChannelID = c1e9x.getInnerChannelID();
        String groupChannelID = c1e9x.getGroupChannelID();
        String secUserID = c1e9x.getSecUserID();
        List<String> avatarURLList = c1e9x.getAvatarURLList();
        String nickName = c1e9x.getNickName();
        Number listType = c1e9x.getListType();
        Map<String, Object> extra = c1e9x.getExtra();
        Number inviteBlockReason = c1e9x.getInviteBlockReason();
        Number detailBlockReason = c1e9x.getDetailBlockReason();
        c1e9x.getDisplayID();
        C914280Ztq c914280Ztq = new C914280Ztq(userID, roomID, actionType, innerChannelID, groupChannelID, secUserID, avatarURLList, nickName, listType, extra, inviteBlockReason, detailBlockReason, null);
        C2276671E9h c2276671E9h = new C2276671E9h(this, completionBlock, c1e9x);
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isOffline() && !InteractionSourceTypeWhiteList.INSTANCE.isNormalCohostAllowed(c1e9x.getListType().intValue())) {
            c2276671E9h.LIZ(1, "source type is not allowed, please contact client dev to configure", null);
        }
        if (!CohostJsbViewerWishesInterceptSetting.enabled()) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Qu2(c914280Ztq, c2276671E9h);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS279S0300000_35(this, c2276671E9h, c914280Ztq, 6));
        }
    }
}
