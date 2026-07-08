package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.gamelink.utils.DisableGuestCameraSettingChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multihost.event.MultiLivePermitChannel;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorPanelSettingChangeAllTheTime;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorPanelSettingChangeFromIMEvent;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.room.GlobalMultiLiveSettingChangeEvent;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.MultiGuestContinuousTypeData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TopLiveHangoutFeedRoomTypeData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkReuseOldDisplayEmptySeatValueSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MulitGuestAudienceShoppingMode;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevertExpHideBtnSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUpdateSettingFromImSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSdkMicCountToLayoutIdMap;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFixedLayoutBtnMappingSwitch;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.k;
import com.google.gson.n;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common.AnchorLayoutStyleSetting;
import webcast.data.MultiGuestLinkmicInfo;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: renamed from: X.0aBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925150aBN {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;
    public static final String LJIIIZ;

    public static boolean LJJII(int i) {
        return i == 2;
    }

    static {
        MultiGuestFixedLayoutBtnMappingSwitch multiGuestFixedLayoutBtnMappingSwitch = MultiGuestFixedLayoutBtnMappingSwitch.INSTANCE;
        LIZJ = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid2UiBtnLayoutId() : "1016";
        LIZLLL = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid3UiBtnLayoutId() : "1015";
        LJ = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid4UiBtnLayoutId() : "1017";
        LJFF = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid5UiBtnLayoutId() : "1006";
        LJI = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixGrid8UiBtnLayoutId() : "1014";
        LJII = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixPanel4UiBtnLayoutId() : "1002";
        LJIIIIZZ = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixPanel6UiBtnLayoutId() : "1012";
        LJIIIZ = multiGuestFixedLayoutBtnMappingSwitch.isOn() ? LiveSdkMicCountToLayoutIdMap.INSTANCE.getFixPanel8UiBtnLayoutId() : "1022";
    }

    public static final MultiLiveAnchorPanelSettings LJFF() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        return (multiGuestDataHolder == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ()) == null) ? C924810aAp.LJ().LJJIII : multiLiveAnchorPanelSettingsLIZIZ;
    }

    public static boolean LJIILIIL() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return false;
        }
        return ((int) room.getOwner().getFollowInfo().getFollowStatus()) == 3 || ((int) room.getOwner().getFollowInfo().getFollowStatus()) == 2;
    }

    public static boolean LJIJJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && ((int) room.getOwner().getFollowInfo().getFollowStatus()) == 1;
    }

    public static boolean LJJ() {
        User owner;
        FollowInfo followInfo;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || ((int) followInfo.getFollowStatus()) != 2) ? false : true;
    }

    public static boolean LJJIJIL() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return true;
        }
        return (LJJI(room) || LJIJJLI(room)) ? false : true;
    }

    public static int LIZJ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (multiLiveAnchorPanelSettingsLJFF == null) {
            return 0;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 4) {
            return 0;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 4) {
            if (multiLiveAnchorPanelSettingsLJFF == null) {
                return 0;
            }
            if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 3) {
                return 1;
            }
        } else if (multiLiveAnchorPanelSettingsLJFF == null) {
            return 0;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 4) {
            return 2;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 3) {
            return 3;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 4) {
            return 4;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 3) {
            return 5;
        }
        if (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 4) {
            return 6;
        }
        return (multiLiveAnchorPanelSettingsLJFF.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettingsLJFF.allowRequestFromOthers == 3) ? 7 : 0;
    }

    public static final String LIZLLL() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        String layoutId;
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = C921180a4y.LJIIIIZZ(C915980Zwa.LJIIIIZZ());
        if (interfaceC937900aVwLJIIIIZZ != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLJIIIIZZ.LJJJJZ()) != null && (layoutId = interfaceC937820aVoLJJJJZ.getLayoutId()) != null) {
            return layoutId;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (multiLiveAnchorPanelSettingsLJFF != null) {
            return C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLJFF);
        }
        return null;
    }

    public static final String LJ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (!LJJIII()) {
            if (multiLiveAnchorPanelSettingsLJFF == null) {
                return "error";
            }
            if (multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3) {
                if (multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 4) {
                    return "all_viewers";
                }
            } else if (multiLiveAnchorPanelSettingsLJFF == null) {
                return "error";
            }
            return (multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 3 && multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 3) ? "only_followers" : (multiLiveAnchorPanelSettingsLJFF.allowViewerReq == 4 && multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq == 4) ? "none" : "error";
        }
        switch (LIZJ()) {
            case 0:
                return "none";
            case 1:
                return "only_other_viewers";
            case 2:
                return "only_followers";
            case 3:
                return "only_no_friends";
            case 4:
                return "only_friends";
            case 5:
                return "only_no_followers";
            case 6:
                return "only_no_other_viewers";
            case 7:
                return "all_viewers";
            default:
                return "error";
        }
    }

    public static final boolean LJJIII() {
        k kVarLJJIIZ;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        if (C930540aK4.LIZJ()) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_anchor_setting_ab_key") < 1) {
                return false;
            }
        } else if (C931820aM8.LIZ("multi_guest_anchor_setting_ab_key")) {
            Integer numLJ = C931820aM8.LJ("multi_guest_anchor_setting_ab_key");
            if (numLJ == null || numLJ.intValue() < 1) {
                return false;
            }
        } else {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null) {
                return false;
            }
            MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
            n nVarLJFF = C2348809Ig.LJFF((multiLiveUserSettings == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) == null) ? null : roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam);
            if (nVarLJFF == null || (kVarLJJIIZ = nVarLJFF.LJJIIZ("multi_guest_anchor_setting_ab_key")) == null || kVarLJJIIZ.LJIIJJI() < 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJJIIJ() {
        k kVarLJJIIZ;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        if (C930540aK4.LIZJ()) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_anchor_setting_ab_key") != 1) {
                return false;
            }
        } else if (C931820aM8.LIZ("multi_guest_anchor_setting_ab_key")) {
            Integer numLJ = C931820aM8.LJ("multi_guest_anchor_setting_ab_key");
            if (numLJ == null || numLJ.intValue() != 1) {
                return false;
            }
        } else {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null) {
                return false;
            }
            MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
            n nVarLJFF = C2348809Ig.LJFF((multiLiveUserSettings == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) == null) ? null : roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam);
            if (nVarLJFF == null || (kVarLJJIIZ = nVarLJFF.LJJIIZ("multi_guest_anchor_setting_ab_key")) == null || kVarLJJIIZ.LJIIJJI() != 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJIIJZLJL() {
        k kVarLJJIIZ;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        if (C930540aK4.LIZJ()) {
            if (LiveAbLabelSetting.INSTANCE.getIntValue("multi_guest_anchor_setting_ab_key") != 2) {
                return false;
            }
        } else if (C931820aM8.LIZ("multi_guest_anchor_setting_ab_key")) {
            Integer numLJ = C931820aM8.LJ("multi_guest_anchor_setting_ab_key");
            if (numLJ == null || numLJ.intValue() != 2) {
                return false;
            }
        } else {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null) {
                return false;
            }
            MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
            n nVarLJFF = C2348809Ig.LJFF((multiLiveUserSettings == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) == null) ? null : roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam);
            if (nVarLJFF == null || (kVarLJJIIZ = nVarLJFF.LJJIIZ("multi_guest_anchor_setting_ab_key")) == null || kVarLJJIIZ.LJIIJJI() != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJIIZI() {
        if (!LJJIII()) {
            return false;
        }
        int iLIZJ = LIZJ();
        return iLIZJ != 0 ? iLIZJ != 1 ? iLIZJ != 2 ? iLIZJ != 3 ? iLIZJ != 4 ? iLIZJ == 5 && LJIJJ() && LJJIIJZLJL() && LJJIJIIJI() : !LJJ() && LJJIIJZLJL() && LJJIJIIJI() : LJJ() && LJJIIJZLJL() && LJJIJIIJI() : (LJJ() || LJIILIIL()) && LJJIIJZLJL() && LJJIJIIJI() : !LJJIJIL() && LJJIIJZLJL() && LJJIJIIJI() : LJJIIJZLJL() && LJJIJIIJI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJJIJIIJI() {
        if (C924810aAp.LJ().LJIIIZ) {
            return false;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && num.intValue() == 2) {
            return false;
        }
        Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num2 == null || num2.intValue() != 1) {
            return C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) < 2 || C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) >= 6;
        }
        return false;
    }

    public static boolean LJJJJIZL() {
        int iLIZJ = LIZJ();
        if (iLIZJ == 2) {
            return LJJIJIL();
        }
        if (iLIZJ != 6) {
            return false;
        }
        return LJJIJIL();
    }

    public static void LJJJJJL() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
        if ((multiLiveAnchorPanelSettings != null ? multiLiveAnchorPanelSettings.applierSortSetting : 0) > 0) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZ("gift_priority_link");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "gift_priority_link");
            }
        } else {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ2 != null) {
                interfaceC924740aAiLIZ2.LIZIZ("gift_priority_link");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ2 != null) {
                interfaceC941720ac6LIZIZ2.LJIL(C01EL.END, "gift_priority_link");
            }
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = C924810aAp.LJ().LJJIII;
        if ((multiLiveAnchorPanelSettings2 != null ? multiLiveAnchorPanelSettings2.applierSortGiftScoreThreshold : 0L) > 0) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ3 = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ3 != null) {
                interfaceC924740aAiLIZ3.LIZ("gift_threshold_link");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ3 = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ3 != null) {
                interfaceC941720ac6LIZIZ3.LJIL(C01EL.START, "gift_threshold_link");
                return;
            }
            return;
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ4 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ4 != null) {
            interfaceC924740aAiLIZ4.LIZIZ("gift_threshold_link");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ4 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ4 != null) {
            interfaceC941720ac6LIZIZ4.LJIL(C01EL.END, "gift_threshold_link");
        }
    }

    public static final void LIZ(DataChannel dataChannel) {
        Room room;
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
        if (LJJIIZ(dataChannel)) {
            if (interfaceC1088880eRSMn1 != null) {
                interfaceC1088880eRSMn1.LJIL(EnumC1102750enp.MULTIGUEST, dataChannel, false);
            }
            C20441214yg.LJIIIZ("multi_icon", "set gone 449");
            return;
        }
        if ((interfaceC1088880eRSMn1 == null || !interfaceC1088880eRSMn1.LJIIL(dataChannel, EnumC1102750enp.MULTIGUEST) || !LIZ) && dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C924640aAY.LIZIZ(room.getOwner().getFollowInfo().getFollowStatus(), dataChannel, "connection_button", true);
        }
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.LJFF(EnumC1102750enp.MULTIGUEST, dataChannel, false);
            interfaceC1088880eRSMn1.LJIILL(dataChannel, EnumC1102750enp.MULTIGUEST);
        }
        if (dataChannel != null) {
            dataChannel.zW(MultiLiveUIChangeEvent.class, 3);
        }
        LIZ = true;
        C20441214yg.LJIIIZ("multi_icon", "set visible 473");
    }

    public static final void LIZIZ(DataChannel dataChannel) {
        boolean zLJIJI;
        boolean z;
        Room room;
        long followStatus;
        FollowInfo followInfo;
        C930510aK1 c930510aK1;
        Room room2;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(MultiGuestContinuousTypeData.class), Boolean.TRUE)) {
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(TopLiveHangoutFeedRoomTypeData.class), Boolean.TRUE)) {
                return;
            }
            LIZIZ = true;
            InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
            if (LJJIIZ(dataChannel)) {
                if (interfaceC1088880eRSMn1 != null) {
                    interfaceC1088880eRSMn1.LJIL(EnumC1102750enp.MULTIGUEST, dataChannel, false);
                }
                C20441214yg.LJIIIZ("multi_icon", "set gone 489");
                return;
            }
            if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() && C500260Jjc.LJJIFFI(Boolean.valueOf(C917140ZyS.LJIIJ(dataChannel)))) {
                LJIIZILJ(dataChannel);
                return;
            }
            if (dataChannel != null) {
                zLJIJI = C500260Jjc.LJIJI(dataChannel);
            } else {
                zLJIJI = false;
            }
            if (MulitGuestAudienceShoppingMode.isEnabled() && dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && C781520UlC.LJIIIIZZ(room2)) {
                z = true;
            } else {
                z = false;
            }
            if (z && zLJIJI) {
                C20441214yg.LJIIIZ("MultiGuestPermissionSettingUtil", "in shopping mode");
                if (dataChannel != null) {
                    dataChannel.zW(MultiLiveUIChangeEvent.class, 4);
                }
                C20441214yg.LJIIIZ("multi_icon", "set visible shoppingMode 509");
                return;
            }
            C20441214yg.LJIIIZ("MultiGuestPermissionSettingUtil", "enableInteractionUI");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("button = ");
            EnumC1102750enp enumC1102750enp = EnumC1102750enp.MULTIGUEST;
            sbLIZ.append(enumC1102750enp);
            C20441214yg.LJIIIZ("FindCrashLog#MultiGuestPermissionSettingUtil#enableInteractionUI", C2188811AlT.LIZIZ(sbLIZ));
            if (!C951390arh.LJII) {
                if ((interfaceC1088880eRSMn1 == null || !interfaceC1088880eRSMn1.LJIIL(dataChannel, enumC1102750enp) || LIZ) && dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    User owner = room.getOwner();
                    if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                        followStatus = followInfo.getFollowStatus();
                    } else {
                        followStatus = 0;
                    }
                    C924640aAY.LIZIZ(followStatus, dataChannel, "connection_button", false);
                }
                if (interfaceC1088880eRSMn1 != null) {
                    interfaceC1088880eRSMn1.LJFF(enumC1102750enp, dataChannel, false);
                    interfaceC1088880eRSMn1.LIZLLL(dataChannel, enumC1102750enp);
                }
                if (dataChannel != null) {
                    dataChannel.zW(MultiLiveUIChangeEvent.class, 2);
                }
                C20441214yg.LJIIIZ("multi_icon", "set visible 546");
                if (dataChannel != null && (c930510aK1 = (C930510aK1) dataChannel.gg0(MultiLivePermitChannel.class)) != null && c930510aK1.LIZ) {
                    LIZ(dataChannel);
                }
            }
            LIZ = false;
        }
    }

    public static final void LJII(DataChannel dataChannel) {
        C930510aK1 c930510aK1;
        if (LJJIII()) {
            switch (LIZJ()) {
                case 0:
                    if (LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 1:
                    if (LJJIJLIJ(dataChannel)) {
                        LIZIZ(dataChannel);
                    } else if (LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 2:
                    if (LJJIFFI(dataChannel)) {
                        if (LJJIJIIJI()) {
                            LJIIZILJ(dataChannel);
                        } else {
                            LIZIZ(dataChannel);
                        }
                    } else if (!LJIL(dataChannel) && LJIILL(dataChannel)) {
                        if (LJJIJIIJI()) {
                            LJIIZILJ(dataChannel);
                        } else {
                            LIZIZ(dataChannel);
                        }
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 3:
                    if (LJJIFFI(dataChannel)) {
                        if (LJJIJIIJI()) {
                            LJIIZILJ(dataChannel);
                        } else {
                            LIZIZ(dataChannel);
                        }
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 4:
                    if (LJJIFFI(dataChannel)) {
                        LIZIZ(dataChannel);
                    } else if (LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 5:
                    if (LJIL(dataChannel)) {
                        if (LJJIJIIJI()) {
                            LJIIZILJ(dataChannel);
                        } else {
                            LIZIZ(dataChannel);
                        }
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 6:
                    LIZIZ(dataChannel);
                    break;
                case 7:
                    LIZIZ(dataChannel);
                    break;
            }
            return;
        }
        if (LJJIL(false, false, 3) && !C930540aK4.LIZJ()) {
            LJIIZILJ(dataChannel);
            return;
        }
        if (dataChannel != null && (c930510aK1 = (C930510aK1) dataChannel.gg0(MultiLivePermitChannel.class)) != null && c930510aK1.LIZ) {
            LIZ(dataChannel);
        } else if (LJJIIZI() && LJJIJIIJI()) {
            LIZ(dataChannel);
        } else {
            LIZIZ(dataChannel);
        }
    }

    public static final void LJIIJ(DataChannel dataChannel) {
        if (!LJJIII()) {
            if (LJJIZ(LJFF())) {
                return;
            }
            LJIIZILJ(dataChannel);
            C917720ZzO.LIZ.getClass();
            C917720ZzO.LJIIIZ(dataChannel, 1);
            return;
        }
        switch (LIZJ()) {
            case 0:
                LJIIZILJ(dataChannel);
                C917720ZzO.LIZ.getClass();
                C917720ZzO.LJIIIZ(dataChannel, 1);
                break;
            case 1:
                if (LJJIJLIJ(dataChannel)) {
                    LIZIZ(dataChannel);
                } else {
                    LJIIZILJ(dataChannel);
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJIIIZ(dataChannel, 1);
                }
                break;
            case 2:
                if (LJJIFFI(dataChannel)) {
                    LJIIZILJ(dataChannel);
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJIIIZ(dataChannel, 1);
                } else if (!LJIL(dataChannel) && LJIILL(dataChannel)) {
                    LJIIZILJ(dataChannel);
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJIIIZ(dataChannel, 1);
                } else {
                    LIZIZ(dataChannel);
                }
                break;
            case 3:
                if (LJJIFFI(dataChannel)) {
                    LJIIZILJ(dataChannel);
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJIIIZ(dataChannel, 1);
                } else {
                    LIZIZ(dataChannel);
                }
                break;
            case 4:
                if (LJJIFFI(dataChannel)) {
                    LIZIZ(dataChannel);
                } else {
                    LJIIZILJ(dataChannel);
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJIIIZ(dataChannel, 1);
                }
                break;
            case 5:
                if (LJIL(dataChannel)) {
                    LJIIZILJ(dataChannel);
                    C917720ZzO.LIZ.getClass();
                    C917720ZzO.LJIIIZ(dataChannel, 1);
                } else {
                    LIZIZ(dataChannel);
                }
                break;
            case 6:
                LIZIZ(dataChannel);
                break;
            case 7:
                LIZIZ(dataChannel);
                break;
        }
    }

    public static boolean LJIILJJIL(Room room) {
        if (room == null) {
            return false;
        }
        if (((int) room.getOwner().getFollowInfo().getFollowStatus()) != 3 && ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static boolean LJIILL(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room == null) {
            return false;
        }
        if (((int) room.getOwner().getFollowInfo().getFollowStatus()) != 3 && ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static void LJIILLIIL(DataChannel dataChannel) {
        C20441214yg.LJIIIZ("MultiGuestPermissionSettingUtil", "toolbarManager.hide");
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel);
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.LJIL(EnumC1102750enp.MULTIGUEST, dataChannel, false);
        }
        if (dataChannel != null) {
            dataChannel.zW(MultiLiveUIChangeEvent.class, 3);
        }
        LIZ = false;
        C924630aAX.LIZ.LJJIJLIJ(false, null, false);
        C20441214yg.LJIIIZ("multi_icon", "set gone 435");
    }

    public static final void LJIIZILJ(DataChannel dataChannel) {
        Boolean bool;
        C20441214yg.LJIIIZ("MultiGuestPermissionSettingUtil", "hideOrEnableMultiGuestUIWithModeratorCheck");
        DataChannel dataChannel2 = C923330a8R.LIZIZ;
        if (dataChannel2 != null) {
            bool = (Boolean) dataChannel2.gg0(HasMultiGuestV3GuestModeratorWidget.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            C20441214yg.LJIIIZ("MultiGuestPermissionSettingUtil", "hasMultiGuestV3GuestModeratorWidget -> hideOrEnableMultiGuestUIWithModeratorCheck");
            LIZIZ(dataChannel);
            if (dataChannel != null) {
                dataChannel.zW(MultiLiveUIChangeEvent.class, 3);
                return;
            }
            return;
        }
        if (LJJIIJZLJL()) {
            C20441214yg.LJIIIZ("MultiGuestPermissionSettingUtil", "toolbarManager.disable");
            LIZ(dataChannel);
        } else {
            LJIILLIIL(dataChannel);
        }
    }

    public static final boolean LJIJ(DataChannel dataChannel) {
        int iLIZJ = LIZJ();
        if (iLIZJ != 0) {
            if (iLIZJ != 1) {
                if (iLIZJ != 2) {
                    if (iLIZJ != 3) {
                        if (iLIZJ != 4) {
                            if (iLIZJ == 5 && LJIL(dataChannel) && LJJIJIIJI()) {
                                LJJJJJ(5, "isFollowersV2(dataChannel) and not in linkMic Progress");
                                return true;
                            }
                            return false;
                        }
                        if (!LJJIFFI(dataChannel) && LJJIJIIJI()) {
                            LJJJJJ(4, "!isFriends(dataChannel) and not in linkMic Progress");
                            return true;
                        }
                        return false;
                    }
                    if (LJJIFFI(dataChannel) && LJJIJIIJI()) {
                        LJJJJJ(3, "isFriends(dataChannel) and not in linkMic Progress");
                        return true;
                    }
                    return false;
                }
                if ((LJJIFFI(dataChannel) || LJIILL(dataChannel)) && LJJIJIIJI()) {
                    LJJJJJ(2, "(isFriends(dataChannel) || hasFollowedByAnchor(dataChannel)) and not in linkMic Progress");
                    return true;
                }
                return false;
            }
            if (!LJJIJLIJ(dataChannel) && LJJIJIIJI()) {
                LJJJJJ(1, "!isOtherViewers(dataChannel) and not in linkMic Progress");
                return true;
            }
            return false;
        }
        if (LJJIJIIJI()) {
            LJJJJJ(0, "not in linkMic Progress");
            return true;
        }
        return false;
    }

    public static final boolean LJIJI(Room room) {
        if (room == null) {
            return false;
        }
        if (((int) room.getOwner().getFollowInfo().getFollowStatus()) != 1 && ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJLI(Room room) {
        if (room == null || ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room == null || ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(Room room) {
        User owner;
        FollowInfo followInfo;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || ((int) followInfo.getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static boolean LJJIFFI(DataChannel dataChannel) {
        Room room;
        User owner;
        FollowInfo followInfo;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || ((int) followInfo.getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIZ(DataChannel dataChannel) {
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long lValueOf;
        if (dataChannel == null) {
            room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        } else {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        }
        if (room == null || (multiLiveUserSettings = room.multiLiveUserSettings) == null || (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || (lValueOf = Long.valueOf(multiGuestPermissionInfo.errCode)) == null || ((int) lValueOf.longValue()) != 4004515 || !MultiGuestRevertExpHideBtnSetting.INSTANCE.enable()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(Room room) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (!LJJIZ(multiLiveAnchorPanelSettingsLJFF)) {
            return true;
        }
        if (LJJIJIIJIL(multiLiveAnchorPanelSettingsLJFF) && !LJIJI(room)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIIJIL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.onlyAllowFollowerReq == 3 && multiLiveAnchorPanelSettings.allowViewerReq == 3) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJL(Room room) {
        if (room == null) {
            return true;
        }
        if (!LJJI(room) && !LJIJJLI(room)) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJLIJ(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room == null) {
            return true;
        }
        if (!LJJI(room) && !LJIJJLI(room)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.allowViewerReq == 3) {
            return true;
        }
        return false;
    }

    public static void LJJJIL(MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent) {
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        AnchorLayoutSetting anchorLayoutSetting;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        int i2;
        int i3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3;
        Integer numValueOf;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings5 = null;
        if (LiveSdkReuseOldDisplayEmptySeatValueSetting.INSTANCE.isEnable() && (multiLiveAnchorPanelSettings3 = C924810aAp.LJ().LJJIII) != null && (numValueOf = Integer.valueOf(multiLiveAnchorPanelSettings3.LIZLLL)) != null) {
            int iIntValue = numValueOf.intValue();
            if (multiLiveUpdateUserSettingContent != null && (multiLiveAnchorPanelSettings4 = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings) != null) {
                multiLiveAnchorPanelSettings4.LIZLLL = iIntValue;
            }
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            if (multiLiveUpdateUserSettingContent != null && (multiLiveAnchorPanelSettings2 = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings) != null) {
                long j = 0;
                boolean z = false;
                if (multiGuestDataHolder.LIZIZ() != null) {
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ();
                    if (multiLiveAnchorPanelSettingsLIZIZ != null) {
                        i2 = multiLiveAnchorPanelSettingsLIZIZ.LIZ;
                    } else {
                        i2 = 0;
                    }
                    multiLiveAnchorPanelSettings2.LIZ = i2;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ();
                    if (multiLiveAnchorPanelSettingsLIZIZ2 != null) {
                        i3 = multiLiveAnchorPanelSettingsLIZIZ2.LIZIZ;
                    } else {
                        i3 = 0;
                    }
                    multiLiveAnchorPanelSettings2.LIZIZ = i3;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ3 = multiGuestDataHolder.LIZIZ();
                    if (multiLiveAnchorPanelSettingsLIZIZ3 != null) {
                        z = multiLiveAnchorPanelSettingsLIZIZ3.LIZJ;
                    }
                    multiLiveAnchorPanelSettings2.LIZJ = z;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ4 = multiGuestDataHolder.LIZIZ();
                    if (multiLiveAnchorPanelSettingsLIZIZ4 != null) {
                        j = multiLiveAnchorPanelSettingsLIZIZ4.multiGuestShareRevenueInfoVersion;
                    }
                    multiLiveAnchorPanelSettings2.multiGuestShareRevenueInfoVersion = j;
                } else {
                    multiLiveAnchorPanelSettings2.LIZ = 0;
                    multiLiveAnchorPanelSettings2.LIZIZ = 0;
                    multiLiveAnchorPanelSettings2.LIZJ = false;
                    multiLiveAnchorPanelSettings2.multiGuestShareRevenueInfoVersion = 0L;
                }
                if (multiLiveAnchorPanelSettings2.enableShowMultiGuestLayout != 3) {
                    multiLiveAnchorPanelSettings2.enableShowMultiGuestLayout = 4;
                }
            }
            if (MultiGuestUpdateSettingFromImSetting.INSTANCE.enable(C930540aK4.LIZJ())) {
                if (multiLiveUpdateUserSettingContent != null) {
                    multiLiveAnchorPanelSettings = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings;
                } else {
                    multiLiveAnchorPanelSettings = null;
                }
                multiGuestDataHolder.LJJ(multiLiveAnchorPanelSettings);
                if (multiLiveUpdateUserSettingContent != null) {
                    anchorLayoutSetting = multiLiveUpdateUserSettingContent.anchorLayoutSetting;
                } else {
                    anchorLayoutSetting = null;
                }
                boolean z2 = !Intrinsics.LJFF(multiGuestDataHolder.LJJI.getValue(), anchorLayoutSetting);
                multiGuestDataHolder.LJIJJ = anchorLayoutSetting;
                if (z2) {
                    multiGuestDataHolder.LJJI.setValue(multiGuestDataHolder.LJIJJ);
                }
            }
        }
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        if (multiLiveUpdateUserSettingContent != null) {
            i = multiLiveUpdateUserSettingContent.resetPointAfterLeave;
        } else {
            i = 2;
        }
        c924810aApLJ.LJJIIJ = i;
        C924810aAp c924810aApLJ2 = C924810aAp.LJ();
        if (multiLiveUpdateUserSettingContent != null) {
            multiLiveAnchorPanelSettings5 = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings;
        }
        c924810aApLJ2.LJJIII = multiLiveAnchorPanelSettings5;
        LJJJJJL();
    }

    public static final void LJJJJI(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        MultiGuestDataHolder multiGuestDataHolder;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
        if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
            multiGuestDataHolder.LJJ(multiLiveAnchorPanelSettings);
        }
        C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
        LJJJJJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJJJJLI(com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r4) {
        /*
            boolean r0 = LJJIII()
            if (r0 != 0) goto Le
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r1)
            return r0
        Le:
            int r0 = r4.allowRequestFromFriends
            r3 = 1
            if (r0 != 0) goto L60
            int r0 = r4.allowRequestFromFollowers
            if (r0 != 0) goto L60
            int r0 = r4.allowRequestFromOthers
            if (r0 != 0) goto L60
            boolean r0 = X.C930540aK4.LIZJ()
            if (r0 == 0) goto L60
            int r0 = r4.allowViewerReq
            r2 = 4
            r1 = 3
            if (r0 != r2) goto L3d
            r4.allowRequestFromFriends = r1
            r4.allowRequestFromFollowers = r2
            r4.allowRequestFromOthers = r2
            r4.allowViewerReq = r1
            r4.onlyAllowFollowerReq = r2
        L31:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L3d:
            if (r0 != r1) goto L4f
            int r0 = r4.onlyAllowFollowerReq
            if (r0 != r1) goto L51
            r4.allowRequestFromFriends = r1
            r4.allowRequestFromFollowers = r1
            r4.allowRequestFromOthers = r2
            r4.allowViewerReq = r1
            r4.onlyAllowFollowerReq = r1
        L4d:
            r3 = 0
            goto L31
        L4f:
            if (r0 != r1) goto L4d
        L51:
            int r0 = r4.onlyAllowFollowerReq
            if (r0 != r2) goto L4d
            r4.allowRequestFromFriends = r1
            r4.allowRequestFromFollowers = r1
            r4.allowRequestFromOthers = r1
            r4.allowViewerReq = r1
            r4.onlyAllowFollowerReq = r2
            goto L4d
        L60:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C925150aBN.LJJJJLI(com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings):kotlin.Pair");
    }

    public static final void LJI(DataChannel dataChannel, int i) {
        if (LJJIII()) {
            switch (LIZJ()) {
                case 1:
                    if (!LJJII(i) && i != 1) {
                        LIZIZ(dataChannel);
                    } else if (LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    }
                    break;
                case 2:
                    if (LJJII(i) && LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    } else if (i != 1 && (i == 3 || i == 2)) {
                        LJIIZILJ(dataChannel);
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 3:
                    if (LJJII(i) && LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 4:
                    if (LJJII(i)) {
                        LIZIZ(dataChannel);
                    } else if (LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    }
                    break;
                case 5:
                    if (i == 1 && LJJIJIIJI()) {
                        LJIIZILJ(dataChannel);
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 6:
                    LIZIZ(dataChannel);
                    break;
                case 7:
                    LIZIZ(dataChannel);
                    break;
            }
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if ((i != 1 && i != 2) || !LJJIJIIJIL(multiLiveAnchorPanelSettingsLJFF) || !LJJIJIIJI()) {
            return;
        }
        LIZIZ(dataChannel);
    }

    public static final void LJIIIZ(InterfaceC925160aBO interfaceC925160aBO, DataChannel dataChannel) {
        if (LJJIII()) {
            switch (LIZJ()) {
                case 0:
                    if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.z31(true);
                    }
                    break;
                case 1:
                    if (LJJIJLIJ(dataChannel)) {
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                    } else if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.z31(true);
                    }
                    break;
                case 2:
                    if (LJJIFFI(dataChannel)) {
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(true);
                        }
                    } else if (!LJIL(dataChannel) && LJIILL(dataChannel)) {
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(true);
                        }
                    } else if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.DT0();
                    }
                    break;
                case 3:
                    if (LJJIFFI(dataChannel)) {
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(true);
                        }
                    } else if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.DT0();
                    }
                    break;
                case 4:
                    if (LJJIFFI(dataChannel)) {
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                    } else if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.z31(true);
                    }
                    break;
                case 5:
                    if (LJIL(dataChannel)) {
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(true);
                        }
                    } else if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.DT0();
                    }
                    break;
                case 6:
                    if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.DT0();
                    }
                    break;
                case 7:
                    if (interfaceC925160aBO != null) {
                        interfaceC925160aBO.DT0();
                    }
                    break;
            }
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (LJJIZ(multiLiveAnchorPanelSettingsLJFF)) {
            if (LJJIJIIJIL(multiLiveAnchorPanelSettingsLJFF) || interfaceC925160aBO == null) {
                return;
            }
            interfaceC925160aBO.DT0();
            return;
        }
        if (interfaceC925160aBO == null) {
            return;
        }
        interfaceC925160aBO.z31(true);
    }

    public static final void LJJJ(Room room, DataChannel dataChannel) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        Number numberValueOf;
        Number numberValueOf2;
        Number numberValueOf3;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        MultiLiveUserApplySettings multiLiveUserApplySettings3;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        MultiGuestLinkmicInfo multiGuestLinkmicInfo;
        MultiGuestLinkmicInfo.HostDisplayInfo hostDisplayInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings4;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission2;
        MultiLiveUserApplySettings multiLiveUserApplySettings5;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission3;
        MultiLiveUserApplySettings multiLiveUserApplySettings6;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission4;
        MultiLiveUserApplySettings multiLiveUserApplySettings7;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission5;
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = new MultiLiveAnchorPanelSettings(0, 0, 0, 0, null, 0, 0L, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0);
            MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
            boolean z = false;
            Number numberValueOf4 = 0;
            if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings7 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission5 = multiLiveUserApplySettings7.multiLiveUserApplyPermission) != null) {
                numberValueOf = Long.valueOf(multiLiveUserApplyPermission5.multiGuestAllowRequestFromFriends);
            } else {
                numberValueOf = numberValueOf4;
            }
            multiLiveAnchorPanelSettings.allowRequestFromFriends = numberValueOf.intValue();
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 != null && (multiLiveUserApplySettings6 = multiLiveUserSettings3.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission4 = multiLiveUserApplySettings6.multiLiveUserApplyPermission) != null) {
                numberValueOf2 = Long.valueOf(multiLiveUserApplyPermission4.multiGuestAllowRequestFromFollowers);
            } else {
                numberValueOf2 = numberValueOf4;
            }
            multiLiveAnchorPanelSettings.allowRequestFromFollowers = numberValueOf2.intValue();
            MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
            if (multiLiveUserSettings4 != null && (multiLiveUserApplySettings5 = multiLiveUserSettings4.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission3 = multiLiveUserApplySettings5.multiLiveUserApplyPermission) != null) {
                numberValueOf3 = Long.valueOf(multiLiveUserApplyPermission3.multiGuestAllowRequestFromOthers);
            } else {
                numberValueOf3 = numberValueOf4;
            }
            multiLiveAnchorPanelSettings.allowRequestFromOthers = numberValueOf3.intValue();
            MultiLiveUserSettings multiLiveUserSettings5 = room.multiLiveUserSettings;
            if (multiLiveUserSettings5 != null && (multiLiveUserApplySettings4 = multiLiveUserSettings5.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission2 = multiLiveUserApplySettings4.multiLiveUserApplyPermission) != null) {
                numberValueOf4 = Long.valueOf(multiLiveUserApplyPermission2.multiGuestApplyAutoApprove);
            }
            multiLiveAnchorPanelSettings.multiGuestApplyAutoApprove = numberValueOf4.intValue();
            int i = multiLiveUserApplyPermission.multiLiveApplyPermission;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        multiLiveAnchorPanelSettings.allowViewerReq = 4;
                        multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                        C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
                        LJJJJJL();
                    }
                } else {
                    multiLiveAnchorPanelSettings.allowViewerReq = 3;
                    multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 3;
                    C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
                    LJJJJJL();
                }
            } else {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
                LJJJJJL();
            }
            multiLiveAnchorPanelSettings.disableVideoLinkmic = (int) multiLiveUserApplyPermission.multiGuestDisableVideoLinkmic;
            C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
            MultiLiveUserSettings multiLiveUserSettings6 = room.multiLiveUserSettings;
            if (multiLiveUserSettings6 != null && (multiLiveUserApplySettings3 = multiLiveUserSettings6.multiLiveUserApplySettings) != null && (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings3.roomMultiGuestLinkmicInfo) != null && (multiGuestLinkmicInfo = roomMultiGuestLinkmicInfo.multiGuestLinkmicInfo) != null && (hostDisplayInfo = multiGuestLinkmicInfo.hostDisplayInfo) != null) {
                HostDisplayResponse.DisplayInfo displayInfo = new HostDisplayResponse.DisplayInfo();
                displayInfo.hostIconBackgroundUrl = hostDisplayInfo.hostIconBackgroundUrl;
                displayInfo.hostIconUrl = hostDisplayInfo.hostIconUrl;
                displayInfo.hostColor = hostDisplayInfo.hostColor;
                displayInfo.iconLinkUrl = hostDisplayInfo.iconLinkUrl;
                displayInfo.hostType = hostDisplayInfo.hostType;
                C923450a8d.LIZLLL(dataChannel, displayInfo);
            }
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            MultiLiveUserSettings multiLiveUserSettings7 = room.multiLiveUserSettings;
            if (multiLiveUserSettings7 != null && (multiLiveUserApplySettings2 = multiLiveUserSettings7.multiLiveUserApplySettings) != null) {
                z = multiLiveUserApplySettings2.isEligibleForApplyAutoApprove;
            }
            c924810aApLJ.LJIIJ(z);
            multiLiveAnchorPanelSettings.disableGuestOpenCamera = (int) multiLiveUserApplyPermission.multiGuestDisableGuestOpenCamera;
            C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettings;
            C924630aAX.LIZ.LJJI(null, multiLiveAnchorPanelSettings, "enter_room");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LJJJI(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, EnumC925190aBR enumC925190aBR) {
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal.gg0(C930910aKf.class) != null && EnumC925190aBR.ACTIVITY_PAGE_OPEN == enumC925190aBR) {
            C772560USg c772560USg = (C772560USg) dataChannelGlobal.gg0(C930910aKf.class);
            if (c772560USg != null && (str = c772560USg.LIZ) != null) {
                switch (str.hashCode()) {
                    case -2111025230:
                        if (str.equals("float_fix") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 1;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 0;
                        }
                        break;
                    case -1039745817:
                        str.equals("normal");
                        break;
                    case 3181382:
                        if (str.equals("grid") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 0;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 1;
                        }
                        break;
                    case 97526364:
                        if (str.equals("float") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 1;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 1;
                        }
                        break;
                    case 318387100:
                        if (str.equals("grid_fix") && multiLiveAnchorPanelSettings != null) {
                            multiLiveAnchorPanelSettings.layoutType = 0;
                            multiLiveAnchorPanelSettings.fixMicNumAction = 0;
                        }
                        break;
                }
            }
            LJJJJI(multiLiveAnchorPanelSettings);
            if (multiLiveAnchorPanelSettings != null) {
                dataChannelGlobal.FQ2(GlobalMultiLiveSettingChangeEvent.class, new Pair(multiLiveAnchorPanelSettings, null));
            }
        }
    }

    public static final void LJJJJ(AnchorLayoutSetting anchorLayoutSetting, String str) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("source = ");
        sbLIZ.append(str);
        sbLIZ.append(", setAnchorLayoutSettings = ");
        if (anchorLayoutSetting != null) {
            List<AnchorLayoutStyleSetting> list = anchorLayoutSetting.layoutStyleSettings;
            String strLIZIZ2 = "layoutStyleSettings = ";
            if (list != null) {
                for (AnchorLayoutStyleSetting anchorLayoutStyleSetting : list) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ2);
                    sbLIZ2.append("(layoutStyle");
                    sbLIZ2.append(anchorLayoutStyleSetting.layoutStyle);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZIZ3);
                    sbLIZ3.append("maxPosition");
                    sbLIZ3.append(anchorLayoutStyleSetting.maxPosition);
                    sbLIZ3.append(')');
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("latestLayoutStyle:");
            sbLIZ4.append(Integer.valueOf(anchorLayoutSetting.latestLayoutStyle));
            sbLIZ4.append(',');
            sbLIZ4.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        } else {
            strLIZIZ = null;
        }
        sbLIZ.append(strLIZIZ);
        C20441214yg.LIZIZ("MultiGuestPermissionSettingUtil", C2188811AlT.LIZIZ(sbLIZ));
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
        if (multiGuestDataHolderLJJIFFI != null) {
            boolean z = !Intrinsics.LJFF(multiGuestDataHolderLJJIFFI.LJJI.getValue(), anchorLayoutSetting);
            multiGuestDataHolderLJJIFFI.LJIJJ = anchorLayoutSetting;
            if (z) {
                multiGuestDataHolderLJJIFFI.LJJI.setValue(multiGuestDataHolderLJJIFFI.LJIJJ);
            }
        }
    }

    public static void LJJJJJ(int i, String str) {
        String strLJIJI = C497740JfY.LJIJI(2131854217);
        C930480aJy.LJJIJIL(strLJIJI, "ttlive_multiRequestSettings_viewerScreen_requestFailedToast");
        C920390a3h.LIZ(strLJIJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current settingVal:");
        sbLIZ.append(i);
        sbLIZ.append(", user condition:");
        sbLIZ.append(str);
        C927960aFu.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJJJL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i) {
        boolean z;
        if (!LJJIII()) {
            return;
        }
        if ((i == 7 || i == 8 || i == 9) && multiLiveAnchorPanelSettings != null) {
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                multiLiveAnchorPanelSettings.allowViewerReq = 4;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                return;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (multiLiveAnchorPanelSettings == null) {
                    return;
                }
                if (multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                    multiLiveAnchorPanelSettings.allowViewerReq = 3;
                    multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                    return;
                }
            } else if (multiLiveAnchorPanelSettings == null) {
                return;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 3;
                return;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 4 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                return;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                return;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 4 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 3) {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
                return;
            }
            if (multiLiveAnchorPanelSettings.allowRequestFromFriends == 3 && multiLiveAnchorPanelSettings.allowRequestFromFollowers == 3 && multiLiveAnchorPanelSettings.allowRequestFromOthers == 4) {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 3;
            } else {
                if (multiLiveAnchorPanelSettings.allowRequestFromFriends != 3 || multiLiveAnchorPanelSettings.allowRequestFromFollowers != 3 || multiLiveAnchorPanelSettings.allowRequestFromOthers != 3) {
                    return;
                }
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 4;
            }
        }
    }

    public static final int LJIIIIZZ(InterfaceC925160aBO interfaceC925160aBO, Room room, boolean z) {
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiLiveUserApplyPermission multiLiveUserApplyPermission;
        if (LJJIII()) {
            if (z) {
                switch (LIZJ()) {
                    case 0:
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        if (LJJIIJ()) {
                            interfaceC925160aBO.z31(false);
                            return 3;
                        }
                        if (!LJJIIJZLJL()) {
                            return 3;
                        }
                        interfaceC925160aBO.bl1();
                        return 2;
                    case 1:
                        if (LJJIJL(room)) {
                            if (interfaceC925160aBO == null) {
                                return 3;
                            }
                            interfaceC925160aBO.DT0();
                            return 1;
                        }
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        if (LJJIIJ()) {
                            interfaceC925160aBO.z31(false);
                            return 3;
                        }
                        if (!LJJIIJZLJL()) {
                            return 3;
                        }
                        interfaceC925160aBO.bl1();
                        return 2;
                    case 2:
                        if (LJJI(room)) {
                            if (interfaceC925160aBO == null) {
                                return 3;
                            }
                            if (LJJIIJ()) {
                                interfaceC925160aBO.z31(false);
                                return 3;
                            }
                            if (!LJJIIJZLJL()) {
                                return 3;
                            }
                            interfaceC925160aBO.bl1();
                            return 2;
                        }
                        if (!LJIJJLI(room) && LJIILJJIL(room)) {
                            if (interfaceC925160aBO == null) {
                                return 3;
                            }
                            if (LJJIIJ()) {
                                interfaceC925160aBO.z31(false);
                                return 3;
                            }
                            if (!LJJIIJZLJL()) {
                                return 3;
                            }
                            interfaceC925160aBO.bl1();
                            return 2;
                        }
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        interfaceC925160aBO.DT0();
                        return 1;
                    case 3:
                        if (LJJI(room)) {
                            if (interfaceC925160aBO == null) {
                                return 3;
                            }
                            if (LJJIIJ()) {
                                interfaceC925160aBO.z31(false);
                                return 3;
                            }
                            if (!LJJIIJZLJL()) {
                                return 3;
                            }
                            interfaceC925160aBO.bl1();
                            return 2;
                        }
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        interfaceC925160aBO.DT0();
                        return 1;
                    case 4:
                        if (LJJI(room)) {
                            if (interfaceC925160aBO == null) {
                                return 3;
                            }
                            interfaceC925160aBO.DT0();
                            return 1;
                        }
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        if (LJJIIJ()) {
                            interfaceC925160aBO.z31(false);
                            return 3;
                        }
                        if (!LJJIIJZLJL()) {
                            return 3;
                        }
                        interfaceC925160aBO.bl1();
                        return 2;
                    case 5:
                        if (!LJJI(room) && !LJJIJL(room)) {
                            if (interfaceC925160aBO == null) {
                                return 3;
                            }
                            if (LJJIIJ()) {
                                interfaceC925160aBO.z31(false);
                                return 3;
                            }
                            if (!LJJIIJZLJL()) {
                                return 3;
                            }
                            interfaceC925160aBO.bl1();
                            return 2;
                        }
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        interfaceC925160aBO.DT0();
                        return 1;
                    case 6:
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        interfaceC925160aBO.DT0();
                        return 1;
                    case 7:
                        if (interfaceC925160aBO == null) {
                            return 3;
                        }
                        interfaceC925160aBO.DT0();
                        return 1;
                    default:
                        return 3;
                }
            }
        } else {
            if (z && room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiLiveUserApplyPermission = multiLiveUserApplySettings.multiLiveUserApplyPermission) != null) {
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
                if (multiLiveAnchorPanelSettingsLJFF == null) {
                    multiLiveAnchorPanelSettingsLJFF = new MultiLiveAnchorPanelSettings(0, 0, 0, 0, null, 0, 0L, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0);
                }
                int i = multiLiveUserApplyPermission.multiLiveApplyPermission;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            multiLiveAnchorPanelSettingsLJFF.allowViewerReq = 4;
                            multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq = 4;
                            C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettingsLJFF;
                            LJJJJJL();
                            if (LJJIJIIJI() && interfaceC925160aBO != null) {
                                interfaceC925160aBO.z31(false);
                                return 3;
                            }
                            return 3;
                        }
                        return 3;
                    }
                    multiLiveAnchorPanelSettingsLJFF.allowViewerReq = 3;
                    multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq = 3;
                    C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettingsLJFF;
                    LJJJJJL();
                    if (interfaceC925160aBO == null) {
                        return 3;
                    }
                    interfaceC925160aBO.DT0();
                    return 1;
                }
                multiLiveAnchorPanelSettingsLJFF.allowViewerReq = 3;
                multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq = 4;
                C924810aAp.LJ().LJJIII = multiLiveAnchorPanelSettingsLJFF;
                LJJJJJL();
                if (interfaceC925160aBO == null) {
                    return 3;
                }
                interfaceC925160aBO.DT0();
                return 1;
            }
            return 3;
        }
        return 3;
    }

    public static final void LJIIJJI(Room room, DataChannel dataChannel, boolean z) {
        if (LJJIII()) {
            if (room == null) {
                return;
            }
            switch (LIZJ()) {
                case 0:
                    if (z) {
                        LIZIZ(dataChannel);
                    } else {
                        LJIIZILJ(dataChannel);
                    }
                    break;
                case 1:
                    if (LJJIJL(room)) {
                        LIZIZ(dataChannel);
                    } else if (z) {
                        LIZIZ(dataChannel);
                    } else {
                        LJIIZILJ(dataChannel);
                    }
                    break;
                case 2:
                    if (LJJI(room)) {
                        if (z) {
                            LIZIZ(dataChannel);
                        } else {
                            LJIIZILJ(dataChannel);
                        }
                    } else if (!LJIJJLI(room) && LJIILJJIL(room)) {
                        if (z) {
                            LIZIZ(dataChannel);
                        } else {
                            LJIIZILJ(dataChannel);
                        }
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 3:
                    if (LJJI(room)) {
                        if (z) {
                            LIZIZ(dataChannel);
                        } else {
                            LJIIZILJ(dataChannel);
                        }
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 4:
                    if (LJJI(room)) {
                        LIZIZ(dataChannel);
                    } else if (z) {
                        LIZIZ(dataChannel);
                    } else {
                        LJIIZILJ(dataChannel);
                    }
                    break;
                case 5:
                    if (LJIJJLI(room)) {
                        if (z) {
                            LIZIZ(dataChannel);
                        } else {
                            LJIIZILJ(dataChannel);
                        }
                    } else {
                        LIZIZ(dataChannel);
                    }
                    break;
                case 6:
                    LIZIZ(dataChannel);
                    break;
                case 7:
                    LIZIZ(dataChannel);
                    break;
            }
            return;
        }
        if (room == null) {
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (LJJIZ(multiLiveAnchorPanelSettingsLJFF)) {
            if (!LJJIJIIJIL(multiLiveAnchorPanelSettingsLJFF)) {
                return;
            }
            LIZIZ(dataChannel);
        } else if (z) {
            LIZIZ(dataChannel);
        } else {
            LJIIZILJ(dataChannel);
        }
    }

    public static boolean LJJIL(boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if (LJJIII()) {
            if (!LJJIJIIJI()) {
                return false;
            }
            int iLIZJ = LIZJ();
            if (iLIZJ != 0) {
                if (iLIZJ != 1) {
                    if (iLIZJ != 2) {
                        if (iLIZJ != 3) {
                            if (iLIZJ != 4) {
                                if (iLIZJ != 5 || !LJIJJ()) {
                                    return false;
                                }
                                if (!z) {
                                    if (z2) {
                                        return LJJIJIIJI();
                                    }
                                    if (!LJJIJIIJI() || !LJJIIJ()) {
                                        return false;
                                    }
                                    return true;
                                }
                                return LJJIJIIJI();
                            }
                            if (LJJ()) {
                                return false;
                            }
                            if (!z) {
                                if (z2) {
                                    return LJJIJIIJI();
                                }
                                if (!LJJIJIIJI() || !LJJIIJ()) {
                                    return false;
                                }
                                return true;
                            }
                            return LJJIJIIJI();
                        }
                        if (!LJJ()) {
                            return false;
                        }
                        if (!z) {
                            if (z2) {
                                return LJJIJIIJI();
                            }
                            if (!LJJIJIIJI() || !LJJIIJ()) {
                                return false;
                            }
                            return true;
                        }
                        return LJJIJIIJI();
                    }
                    if (!LJJ() && !LJIILIIL()) {
                        return false;
                    }
                    if (!z) {
                        if (z2) {
                            return LJJIJIIJI();
                        }
                        if (!LJJIJIIJI() || !LJJIIJ()) {
                            return false;
                        }
                        return true;
                    }
                    return LJJIJIIJI();
                }
                if (LJJIJIL()) {
                    return false;
                }
                if (!z) {
                    if (z2) {
                        return LJJIJIIJI();
                    }
                    if (!LJJIJIIJI() || !LJJIIJ()) {
                        return false;
                    }
                    return true;
                }
                return LJJIJIIJI();
            }
            if (!z) {
                if (z2) {
                    return LJJIJIIJI();
                }
                if (!LJJIJIIJI() || !LJJIIJ()) {
                    return false;
                }
                return true;
            }
            return LJJIJIIJI();
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (multiLiveAnchorPanelSettingsLJFF == null || multiLiveAnchorPanelSettingsLJFF.allowViewerReq != 4 || !LJJIJIIJI()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LJIIL(LinkMessage linkMessage, InterfaceC925160aBO interfaceC925160aBO, DataChannel dataChannel, boolean z) {
        Integer numValueOf;
        Integer numValueOf2 = null;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = null;
        if (LJJIII()) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
            if (multiLiveAnchorPanelSettings != null) {
                multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings, 0, 0, 0, 8388607);
            }
            LJJJIL(linkMessage.multiLiveUpdateUserSettingContent);
            C917720ZzO.LIZ.getClass();
            C917720ZzO.LJIIIZ(dataChannel, 1);
            if (z) {
                if (dataChannel != null) {
                    dataChannel.FQ2(MultiGuestAnchorPanelSettingChangeAllTheTime.class);
                }
                if (!LJJIJIIJI()) {
                    return;
                }
                switch (LIZJ()) {
                    case 0:
                        if (LJJIJIIJI() && interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(false);
                        }
                        break;
                    case 1:
                        if (LJJIJLIJ(dataChannel)) {
                            if (interfaceC925160aBO != null) {
                                interfaceC925160aBO.DT0();
                            }
                        } else if (LJJIJIIJI() && interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(false);
                        }
                        break;
                    case 2:
                        if (LJJIFFI(dataChannel) && LJJIJIIJI()) {
                            if (interfaceC925160aBO != null) {
                                interfaceC925160aBO.z31(false);
                            }
                        } else if (!LJIL(dataChannel) && LJIILL(dataChannel)) {
                            if (interfaceC925160aBO != null) {
                                interfaceC925160aBO.z31(false);
                            }
                        } else if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                        break;
                    case 3:
                        if (LJJIFFI(dataChannel) && LJJIJIIJI()) {
                            if (interfaceC925160aBO != null) {
                                interfaceC925160aBO.z31(false);
                            }
                        } else if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                        break;
                    case 4:
                        if (LJJIFFI(dataChannel)) {
                            if (interfaceC925160aBO != null) {
                                interfaceC925160aBO.DT0();
                            }
                        } else if (LJJIJIIJI() && interfaceC925160aBO != null) {
                            interfaceC925160aBO.z31(false);
                        }
                        break;
                    case 5:
                        if (LJIL(dataChannel) && LJJIJIIJI()) {
                            if (interfaceC925160aBO != null) {
                                interfaceC925160aBO.z31(false);
                            }
                        } else if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                        break;
                    case 6:
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                        break;
                    case 7:
                        if (interfaceC925160aBO != null) {
                            interfaceC925160aBO.DT0();
                        }
                        break;
                }
                if (dataChannel != null) {
                    dataChannel.FQ2(MultiGuestAnchorPanelSettingChangeFromIMEvent.class);
                }
                C924630aAX.LIZ.LJJI(multiLiveAnchorPanelSettingsLIZ, C924810aAp.LJ().LJJIII, "im_update");
                return;
            }
            return;
        }
        MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent = linkMessage.multiLiveUpdateUserSettingContent;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = LJFF();
        if (multiLiveAnchorPanelSettingsLJFF != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLJFF.disableGuestOpenCamera);
        } else {
            numValueOf = null;
        }
        LJJJIL(multiLiveUpdateUserSettingContent);
        C917720ZzO.LIZ.getClass();
        C917720ZzO.LJIIIZ(dataChannel, 1);
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestAnchorPanelSettingChangeAllTheTime.class);
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings;
        if (multiLiveAnchorPanelSettings2 != null) {
            numValueOf2 = Integer.valueOf(multiLiveAnchorPanelSettings2.disableGuestOpenCamera);
        }
        if (dataChannel != null) {
            dataChannel.zW(DisableGuestCameraSettingChangeChannel.class, numValueOf2);
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2) && numValueOf2 != null && numValueOf2.intValue() == 2) {
            C766270U4b.LIZLLL(2131854372);
        }
        if (!z) {
            return;
        }
        if (LJJIZ(multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings)) {
            if (LJJIJIIJIL(multiLiveUpdateUserSettingContent.multiLiveAnchorPanelSettings)) {
                if (interfaceC925160aBO != null) {
                    interfaceC925160aBO.DT0();
                }
            } else if (interfaceC925160aBO != null) {
                interfaceC925160aBO.DT0();
            }
        } else if (LJJIJIIJI() && interfaceC925160aBO != null) {
            interfaceC925160aBO.z31(false);
        }
        if (dataChannel == null) {
            return;
        }
        dataChannel.FQ2(MultiGuestAnchorPanelSettingChangeFromIMEvent.class);
    }
}
