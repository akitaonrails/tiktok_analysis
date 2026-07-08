package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicAudienceMultiGuestReservationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestOptGetSettingsSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: renamed from: X.0Zzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917860Zzc {
    public static C11JF LIZ;
    public static long LIZIZ = -1;

    public static final boolean LIZIZ() {
        return LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_anchor_co_host_multi_guest_reservation") == 1 && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS();
    }

    public static final boolean LIZJ() {
        Integer numLJ = C931820aM8.LJ("linkmic_anchor_co_host_multi_guest_reservation");
        return numLJ != null && numLJ.intValue() == 1 && LinkmicAudienceMultiGuestReservationSetting.INSTANCE.isReserve() && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS();
    }

    public static final boolean LIZLLL(boolean z) {
        if (z) {
            if (LIZIZ() && InterfaceC1104970erP.I2.LIZIZ().booleanValue()) {
                return true;
            }
            return false;
        }
        if (LIZJ() && LIZIZ == 10003) {
            return true;
        }
        return false;
    }

    public static final void LIZ(Room room, InterfaceC917770ZzT interfaceC917770ZzT) {
        String str;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        if (MultiGuestOptGetSettingsSetting.INSTANCE.isEnable()) {
            if (room != null) {
                MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
                if (multiLiveUserSettings2 != null && multiLiveUserSettings2.isRoomPackSucAbSettings()) {
                    C1AZW.LIZ.getClass();
                    C1AZW.LIZ("LinkMicReservationSettingHelper", "requestGuestLinkHintSetting abParam by RoomInfo", null, null);
                    if (room != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) != null) {
                        str = roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam;
                    } else {
                        str = null;
                    }
                    String idStr = room.getIdStr();
                    if (idStr == null) {
                        idStr = "";
                    }
                    C931820aM8.LJI(str, idStr);
                    interfaceC917770ZzT.LIZ();
                    C11JF c11jf = LIZ;
                    if (c11jf != null) {
                        c11jf.dispose();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } else if (room == null) {
            return;
        }
        if (room.getOwner() == null) {
            return;
        }
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("LinkMicReservationSettingHelper", "requestGuestLinkHintSetting abParam by LinkApi", null, null);
        C480460Ism.LIZ().getClass();
        LIZ = (C11JF) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).isShowGuestLinkHint(room.getId(), room.getOwner().getId(), room.getOwner().getSecUid(), true).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS151S0200000_15(room, interfaceC917770ZzT, 32), new C09JN() { // from class: X.0ZxL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LinkMicReservationSettingHelper@8789.getSettingForGuest$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
                sbLIZ.append("_LinkMicReservationSettingHelper_");
                sbLIZ.append(85);
                C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "isShowGuestLinkHint request failed:", ((Throwable) obj).getMessage(), null);
                C11JF c11jf2 = C917860Zzc.LIZ;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                C1C7U.LIZIZ("LinkMicReservationSettingHelper@8789.getSettingForGuest$2");
            }
        });
    }
}
