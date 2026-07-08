package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0eDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080370eDj {
    public static void LIZ(Room room, DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        RoomLinkInfo linkMicInfo;
        List<Long> list;
        EnumC1090760eUU unAvailableClickReason;
        RoomLinkInfo linkMicInfo2;
        List<Long> list2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        RoomAuthStatus roomAuthStatus2;
        boolean z2 = true;
        int size = 0;
        if (room != null && (roomAuthStatus2 = room.getRoomAuthStatus()) != null && roomAuthStatus2.isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        } else {
            bool = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(bool);
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() <= 0) {
            z2 = false;
        }
        EnumC1118300fCu enumC1118300fCuLIZIZ = C1118310fCv.LIZIZ(false, z2, z);
        String str = "anchor";
        if (enumC1118300fCuLIZIZ == EnumC1118300fCu.GREY) {
            IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
            if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (unAvailableClickReason = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                unAvailableClickReason = EnumC1090760eUU.UNKNOWN;
            }
            if (!zLJJJI) {
                str = "user";
            }
            if (room != null && (linkMicInfo2 = room.getLinkMicInfo()) != null && (list2 = linkMicInfo2.audienceIdList) != null) {
                size = list2.size();
            }
            iGiftService.monitorGiftIconShow(dataChannel, false, unAvailableClickReason, str, "icon", size);
            return;
        }
        if (enumC1118300fCuLIZIZ != EnumC1118300fCu.SHOW) {
            return;
        }
        IGiftService iGiftService2 = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        EnumC1090760eUU enumC1090760eUU = EnumC1090760eUU.UNKNOWN;
        if (!zLJJJI) {
            str = "user";
        }
        if (room != null && (linkMicInfo = room.getLinkMicInfo()) != null && (list = linkMicInfo.audienceIdList) != null) {
            size = list.size();
        }
        iGiftService2.monitorGiftIconShow(dataChannel, true, enumC1090760eUU, str, "icon", size);
    }
}
