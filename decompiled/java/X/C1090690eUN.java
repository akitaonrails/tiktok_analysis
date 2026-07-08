package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeEcomLiveParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeGiftGalleryParam;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import qo2.w;

/* JADX INFO: renamed from: X.0eUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090690eUN {
    public static void LIZ(BarrageMessage barrageMessage, DataChannel dataChannel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (dataChannel != null && barrageMessage.msgType == 100) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_activity_message");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            if (Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class))) {
                str = "anchor";
            } else {
                str = "user";
            }
            c474500IjALIZ.LJJII(str, "user_type");
            c474500IjALIZ.LJJII("show", "action_position");
            c474500IjALIZ.LJJII("barrageMessage", "message_type");
            c474500IjALIZ.LJJII(Long.valueOf(barrageMessage.getMessageId()), "message_id");
            PrivilegeLogExtra privilegeLogExtra = barrageMessage.privilegeLogExtra;
            String str6 = "";
            if (privilegeLogExtra == null) {
                str2 = "";
            } else {
                str2 = privilegeLogExtra.privilege_id;
            }
            c474500IjALIZ.LJJII(str2, "privilege_id");
            PrivilegeLogExtra privilegeLogExtra2 = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra2 == null) {
                str3 = "";
            } else {
                str3 = privilegeLogExtra2.privilege_order_id;
            }
            c474500IjALIZ.LJJII(str3, "privilege_order_id");
            PrivilegeLogExtra privilegeLogExtra3 = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra3 == null) {
                str4 = "";
            } else {
                str4 = privilegeLogExtra3.privilege_version;
            }
            c474500IjALIZ.LJJII(str4, "privilege_version_id");
            PrivilegeLogExtra privilegeLogExtra4 = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra4 != null) {
                str6 = privilegeLogExtra4.data_version;
            }
            c474500IjALIZ.LJJII(str6, "data_version_id");
            if (barrageMessage.displayConfig > 0) {
                str5 = "strong";
            } else {
                str5 = "normal";
            }
            c474500IjALIZ.LJJII(str5, "show_type");
            c474500IjALIZ.LJJII(barrageMessage.scene, Scene.SCENE_SERVICE);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZIZ(BarrageMessage barrageMessage, DataChannel dataChannel) {
        Room room;
        boolean z;
        HashMap map = new HashMap();
        if (dataChannel == null) {
            room = null;
        } else {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        }
        w.LIZ.getClass();
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("enter_method", w.LJIIL());
        map.put("room_id", String.valueOf(w.LJIJJ()));
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        map.put("action_type", w.LIZLLL());
        BarrageTypeEcomLiveParam barrageTypeEcomLiveParam = barrageMessage.ecomLiveParam;
        if (barrageTypeEcomLiveParam != null && !TextUtils.isEmpty(barrageTypeEcomLiveParam.entranceForm)) {
            map.put("barrage_type", barrageMessage.ecomLiveParam.entranceForm);
        } else {
            int i = barrageMessage.msgType;
            if (i == 2) {
                map.put("barrage_type", "ec_buying_barrage");
            } else if (i == 14) {
                map.put("barrage_type", "ec_bought_barrage");
            }
        }
        if (dataChannel != null && Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class))) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZ = C01C5.LIZ(dataChannel);
        if (z) {
            map.put("user_type", "anchor");
        } else if (zLIZ) {
            map.put("user_type", "admin");
            map.put("moderator_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        } else {
            map.put("user_type", "user");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_barrage_show");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(BarrageMessage barrageMessage, DataChannel dataChannel) {
        String str;
        long battleId;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        String strUq0 = iInteractService.Uq0(currentUserId);
        if (strUq0.equals("audience")) {
            strUq0 = "user";
        }
        BarrageTypeGiftGalleryParam barrageTypeGiftGalleryParam = barrageMessage.giftGalleryParams;
        if (barrageTypeGiftGalleryParam != null) {
            if (currentUserId == barrageTypeGiftGalleryParam.toUserId) {
                str = "gift_recipient";
            } else if (currentUserId == barrageTypeGiftGalleryParam.fromUserId) {
                str = "title_gifter";
            } else {
                str = "overtaken_gifter";
            }
        } else {
            str = "";
        }
        boolean zKz = iInteractService.Kz();
        boolean zW9 = iInteractService.w9();
        boolean zVp0 = iInteractService.vp0();
        if (iInteractService.vp0()) {
            battleId = iInteractService.getBattleId();
        } else {
            battleId = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_announcement_receive");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJII(strUq0, "user_type");
        c474500IjALIZ.LJJII(str, "gallery_interaction_type");
        c474500IjALIZ.LJJII("title_overtake", "msg_type");
        c474500IjALIZ.LJJII(Long.valueOf(barrageMessage.galleryGiftId), "gift_id");
        c474500IjALIZ.LJJII(Integer.valueOf(zKz ? 1 : 0), "is_multiguest");
        c474500IjALIZ.LJJII(Integer.valueOf(zW9 ? 1 : 0), "is_cohost");
        c474500IjALIZ.LJJII(Integer.valueOf(zVp0 ? 1 : 0), "is_pk");
        c474500IjALIZ.LJJII(Long.valueOf(battleId), "pk_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(BarrageMessage barrageMessage, DataChannel dataChannel) {
        int iLJI;
        int iLJII;
        Room room;
        String strLJIIIZ;
        int iLJI2;
        int iLJI3;
        String str;
        long messageId;
        String str2 = "";
        long jLIZIZ = 0;
        String str3 = "fans_club_level";
        switch (barrageMessage.msgType) {
            case 8:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                try {
                    if (!C1090780eUW.LJ(barrageMessage)) {
                        str3 = "user_level";
                    }
                    if (C1090780eUW.LJIIL(barrageMessage)) {
                        iLJI = C1090780eUW.LJI(barrageMessage);
                        jLIZIZ = C0IZJ.LIZIZ(C1090780eUW.LJIIIZ(barrageMessage));
                        iLJII = C1090780eUW.LJII(barrageMessage);
                    } else {
                        iLJI = 0;
                        iLJII = 0;
                    }
                    int iLJI4 = C1090780eUW.LJI(barrageMessage);
                    C1090650eUJ c1090650eUJLIZ = C1090700eUO.LIZ(barrageMessage);
                    if (c1090650eUJLIZ != null) {
                        str3 = c1090650eUJLIZ.LIZ;
                        str2 = c1090650eUJLIZ.LIZIZ;
                    }
                    LJ(dataChannel, jLIZIZ, iLJI, "enter", barrageMessage.isLocalInsertMsg, iLJII, str3, barrageMessage.getMessageId(), iLJI4, C1090780eUW.LJI(barrageMessage), str2, System.currentTimeMillis() - barrageMessage.receiveTime);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1CC2.LIZ("sendUpgradeMsgShow log failed", e);
                    return;
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (dataChannel == null) {
                    room = null;
                } else {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                }
                HashMap map = new HashMap();
                if (room != null) {
                    jLIZIZ = room.getOwnerUserId();
                }
                if (!C1090780eUW.LJIIL(barrageMessage)) {
                    strLJIIIZ = "";
                    iLJI2 = -1;
                    iLJI3 = -1;
                } else {
                    strLJIIIZ = C1090780eUW.LJIIIZ(barrageMessage);
                    iLJI2 = C1090780eUW.LJI(barrageMessage);
                    iLJI3 = C1090780eUW.LJI(barrageMessage);
                }
                int i = barrageMessage.msgType;
                if (i == 9) {
                    if (iLJI2 > -1) {
                        map.put("user_level", Long.valueOf(iLJI2));
                        str2 = "user_level";
                    }
                } else if (i == 11) {
                    map.put("fans_club_level", Long.valueOf(iLJI3));
                    str2 = "fans_club_level";
                }
                String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                boolean zEquals = strValueOf.equals(C1090780eUW.LJIIIZ(barrageMessage));
                map.put("anchor_id", Long.valueOf(jLIZIZ));
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_enter_room_message", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
                c474500IjALIZIZ.LJIJJLI(dataChannel);
                w.LIZ.getClass();
                c474500IjALIZIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
                c474500IjALIZIZ.LJJII(strValueOf, "user_id");
                c474500IjALIZIZ.LJJII(strLJIIIZ, "from_user_id");
                c474500IjALIZIZ.LJJII(str2, "privilege_type");
                c474500IjALIZIZ.LJJII(Integer.valueOf(barrageMessage.isLocalInsertMsg ? 1 : 0), "is_fake_message");
                c474500IjALIZIZ.LJJII(Integer.valueOf(zEquals ? 1 : 0), "is_own_send");
                if (strValueOf.equals(strLJIIIZ)) {
                    str = "self";
                } else if (String.valueOf(jLIZIZ).equals(strValueOf)) {
                    str = "anchor_to_audience";
                } else {
                    str = "audience_to_audience";
                }
                c474500IjALIZIZ.LJJII(str, "show_from");
                if (barrageMessage.isLocalInsertMsg) {
                    messageId = -1;
                } else {
                    messageId = barrageMessage.getMessageId();
                }
                c474500IjALIZIZ.LJJII(Long.valueOf(messageId), "message_id");
                c474500IjALIZIZ.LJJIJ(map);
                c474500IjALIZIZ.LIZ();
                break;
        }
    }

    public static void LJ(DataChannel dataChannel, long j, int i, String str, boolean z, int i2, String str2, long j2, int i3, int i4, String str3, long j3) {
        long ownerUserId;
        int i5;
        String str4;
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        HashMap map = new HashMap();
        if (i2 > 0) {
            map.put("display_config", Long.valueOf(i2));
        }
        if (UserService.getInstance().user().getCurrentUserId() == j) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (ownerUserId == j) {
            str4 = "anchor";
        } else {
            str4 = "user";
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_barrage_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJIJJLI(dataChannel);
        w.LIZ.getClass();
        c474500IjALIZIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "user_id");
        c474500IjALIZIZ.LJJII(str, "message_position");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i5), "is_own_send");
        c474500IjALIZIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_fake_message");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "user_level");
        c474500IjALIZIZ.LJJII(str2, "privilege_type");
        if (z) {
            j2 = -1;
        }
        c474500IjALIZIZ.LJJII(Long.valueOf(j2), "message_id");
        c474500IjALIZIZ.LJJII(str4, "user_type");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i4), "barrage_grade");
        c474500IjALIZIZ.LJJII(str3, "privilege_scenario");
        c474500IjALIZIZ.LJJII(Long.valueOf(j3), "duration");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i3), "fans_club_level");
        c474500IjALIZIZ.LJJIJ(map);
        c474500IjALIZIZ.LIZ();
    }
}
