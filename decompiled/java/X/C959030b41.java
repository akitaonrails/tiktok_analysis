package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeTrackingSetting;
import com.bytedance.android.livesdk.model.message.CohostPlatformMessage;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS66S1000000_15;
import tikcast.linkmic.common.GroupPlayer;

/* JADX INFO: renamed from: X.0b41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C959030b41 implements InterfaceC959160b4E<CohostPlatformMessage> {
    public void LIZIZ(Context context, CohostPlatformMessage cohostPlatformMessage) {
        CohostPlatformMessage.CohostInviteInfo cohostInviteInfo;
        String str;
        if (context != null && (cohostInviteInfo = cohostPlatformMessage.inviteInfo) != null && (str = cohostInviteInfo.popUpUrl) != null && str.length() != 0) {
            InterfaceC954910axN.LIZ.getClass();
            C958790b3d.LIZ("CohostInvitePlatformAction", "operation_platform_cohost").LJIILLIIL("showOpPopup", new AwS66S1000000_15(str, 6));
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, new AwS594S0100000_15(cohostPlatformMessage, 1221));
        }
    }

    @Override // X.InterfaceC959160b4E
    public final void LIZ(Context context, DataChannel dataChannel, CohostPlatformMessage cohostPlatformMessage) {
        List<GroupPlayer> list;
        Map<Long, CohostPlatformMessage.InviteeInfo> map;
        CohostPlatformMessage.InviteeInfo inviteeInfo;
        List listLIZ;
        ImageModel imageModel;
        Long lValueOf;
        CohostPlatformMessage cohostPlatformMessage2 = cohostPlatformMessage;
        CohostPlatformMessage.CohostInviteInfo cohostInviteInfo = cohostPlatformMessage2.inviteInfo;
        if (cohostInviteInfo != null && (list = cohostInviteInfo.anchorList) != null && !list.isEmpty()) {
            int i = (int) cohostPlatformMessage2.sourceType;
            CohostPlatformMessage.CohostInviteInfo cohostInviteInfo2 = cohostPlatformMessage2.inviteInfo;
            if (cohostInviteInfo2 != null) {
                map = cohostInviteInfo2.inviteeInfos;
            } else {
                map = null;
            }
            for (GroupPlayer groupPlayer : list) {
                if (map != null) {
                    Player player = groupPlayer.user;
                    if (player != null) {
                        lValueOf = Long.valueOf(player.uid);
                    } else {
                        lValueOf = null;
                    }
                    inviteeInfo = map.get(lValueOf);
                } else {
                    inviteeInfo = null;
                }
                Player player2 = groupPlayer.user;
                if (player2 != null) {
                    String enterFromForSourceType = InteractionSourceTypeTrackingSetting.INSTANCE.getEnterFromForSourceType(Integer.valueOf(i));
                    if (enterFromForSourceType != null && enterFromForSourceType.length() > 0) {
                        C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ(enterFromForSourceType));
                    }
                    C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                    String strValueOf = String.valueOf(player2.uid);
                    String strValueOf2 = String.valueOf(player2.roomId);
                    C955540ayO c955540ayOLIZ = C915200ZvK.LIZ(60);
                    if (inviteeInfo == null || (imageModel = inviteeInfo.displayAvatar) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null) {
                        listLIZ = C13BV.INSTANCE;
                    }
                    c784440UpuLIZ.LIZIZ(new C944610agl(new C950360aq2(strValueOf, "", strValueOf2, c955540ayOLIZ, listLIZ, null, null, false, "operation_platform", String.valueOf(groupPlayer.channelId), 0, null, null, null, null, null, 259008)));
                }
            }
            LIZIZ(context, cohostPlatformMessage2);
        }
    }
}
