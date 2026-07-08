package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0a7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922760a7W {
    public static int LIZ() {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null) {
            return 0;
        }
        return (int) multiLiveUserApplySettings.hostGifterLinkmicEnum;
    }

    public static boolean LIZIZ() {
        if (C924230a9t.LIZ(8)) {
            return false;
        }
        return (LIZ() == 1 || (LIZ() == 0 && LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_gifter_priority") == 1 && !C930540aK4.LJJIJ())) && !C930540aK4.LJJIJ();
    }

    public static boolean LIZJ() {
        if (C924230a9t.LIZ(8)) {
            return false;
        }
        return (LIZ() == 2 || (LIZ() == 0 && LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_gifter_priority") == 2 && !C930540aK4.LJJIJ())) && !C930540aK4.LJJIJ();
    }

    public static boolean LIZLLL() {
        Room room;
        Integer numLJ;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserSettings multiLiveUserSettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        if (C924230a9t.LIZ(8)) {
            return false;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        return (((room2 == null || (multiLiveUserSettings2 = room2.multiLiveUserSettings) == null || (multiLiveUserApplySettings2 = multiLiveUserSettings2.multiLiveUserApplySettings) == null) ? 0 : (int) multiLiveUserApplySettings2.viewerGifterLinkmicEnum) == 1 || (((room = (Room) dataChannelGlobal.gg0(C930940aKi.class)) == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || ((int) multiLiveUserApplySettings.viewerGifterLinkmicEnum) == 0) && (numLJ = C931820aM8.LJ("multi_guest_gifter_priority")) != null && numLJ.intValue() == 1 && !C930540aK4.LJJIJ())) && !C930540aK4.LJJIJ();
    }

    public static boolean LJ() {
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        return (multiGuestDataHolderLIZJ2 == null || (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ2.LIZIZ()) == null || multiLiveAnchorPanelSettingsLIZIZ2.allowViewerReq != 4) && ((multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) == null || multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold <= 0) && C922770a7X.LIZ();
    }
}
