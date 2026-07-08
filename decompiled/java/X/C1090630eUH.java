package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090630eUH {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId();
    }

    public static void LJ(BarrageMessage barrageMessage) {
        String str;
        long j;
        long messageId;
        int i;
        if (barrageMessage == null) {
            return;
        }
        try {
            double sample_10 = LiveLogSampleConfigSetting.getSAMPLE_10();
            C1090650eUJ c1090650eUJLIZ = C1090700eUO.LIZ(barrageMessage);
            int iLJI = C1090780eUW.LJI(barrageMessage);
            boolean zLJFF = Intrinsics.LJFF(String.valueOf(UserService.getInstance().user().getCurrentUserId()), C1090780eUW.LJIIIZ(barrageMessage));
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_barrage_receive_im", Double.valueOf(sample_10));
            c474500IjALIZIZ.LJIL();
            LIZ(c474500IjALIZIZ, barrageMessage, c1090650eUJLIZ);
            if (LIZIZ()) {
                str = "anchor";
            } else {
                str = "user";
            }
            c474500IjALIZIZ.LJJII(str, "user_type");
            long jCurrentTimeMillis = System.currentTimeMillis();
            CommonMessageData commonMessageData = barrageMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.createTime;
            } else {
                j = 0;
            }
            c474500IjALIZIZ.LJJII(Long.valueOf(jCurrentTimeMillis - j), "duration");
            if (barrageMessage.isLocalInsertMsg) {
                messageId = -1;
            } else {
                messageId = barrageMessage.getMessageId();
            }
            c474500IjALIZIZ.LJJII(Long.valueOf(messageId), "message_id");
            int i2 = 1;
            if (barrageMessage.isLocalInsertMsg) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_fake_message");
            if (!zLJFF) {
                i2 = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "is_own_send");
            c474500IjALIZIZ.LJJII(Integer.valueOf(iLJI), "barrage_grade");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("monitorIMReceive log failed", e);
        }
    }

    public static void LIZLLL(BarrageMessage barrageMessage, String str) {
        if (barrageMessage == null) {
            return;
        }
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_barrage_interupt", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIL();
            LIZ(c474500IjALIZIZ, barrageMessage, C1090700eUO.LIZ(barrageMessage));
            c474500IjALIZIZ.LJJII(str, "interupt_reason");
            c474500IjALIZIZ.LJJII(Integer.valueOf(barrageMessage.msgType), "barrage_type");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(C474500IjA c474500IjA, BarrageMessage barrageMessage, C1090650eUJ c1090650eUJ) {
        long id;
        Boolean boolValueOf;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            id = room.getId();
            if (room.getOwner() != null) {
                id2 = room.getOwner().getId();
            }
        } else {
            id = 0;
        }
        c474500IjA.LJJII(Long.valueOf(id), "room_id");
        c474500IjA.LJJII(Long.valueOf(id2), "anchor_id");
        if (barrageMessage != null) {
            c474500IjA.LJJII(Integer.valueOf(barrageMessage.renderType), "render_type");
            c474500IjA.LJJII(Integer.valueOf(barrageMessage.msgType), "msg_type");
            c474500IjA.LJJII(barrageMessage.subType, "sub_type");
            c474500IjA.LJJII(Integer.valueOf(barrageMessage.getPriority()), "priority");
            String str = barrageMessage.schema;
            if (str != null) {
                boolValueOf = Boolean.valueOf(C500260Jjc.LJJIIZ(str));
            } else {
                boolValueOf = null;
            }
            c474500IjA.LJJII(boolValueOf, "has_schema");
            c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis() - barrageMessage.baseMessage.createTime), "duration_from_sent");
            c474500IjA.LJJII(Long.valueOf(System.currentTimeMillis() - barrageMessage.receiveTime), "duration_from_receive");
        }
        if (c1090650eUJ != null) {
            c474500IjA.LJJII(c1090650eUJ.LIZ, "privilege_type");
            c474500IjA.LJJII(c1090650eUJ.LIZIZ, "privilege_scenario");
        }
    }

    public static void LIZJ(BarrageMessage barrageMessage, String str, int i, long j) {
        String str2;
        int i2;
        String str3;
        try {
            int iLJI = C1090780eUW.LJI(barrageMessage);
            C1090650eUJ c1090650eUJLIZ = C1090700eUO.LIZ(barrageMessage);
            boolean zLJFF = Intrinsics.LJFF(String.valueOf(UserService.getInstance().user().getCurrentUserId()), C1090780eUW.LJIIIZ(barrageMessage));
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_barrage_animation_download_finish", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIL();
            String str4 = null;
            LIZ(c474500IjALIZIZ, null, null);
            if (LIZIZ()) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            c474500IjALIZIZ.LJJII(str2, "user_type");
            if (zLJFF) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "is_own_send");
            c474500IjALIZIZ.LJJII(Integer.valueOf(iLJI), "barrage_grade");
            if (c1090650eUJLIZ != null) {
                str3 = c1090650eUJLIZ.LIZIZ;
            } else {
                str3 = null;
            }
            c474500IjALIZIZ.LJJII(str3, "privilege_scenario");
            if (c1090650eUJLIZ != null) {
                str4 = c1090650eUJLIZ.LIZ;
            }
            c474500IjALIZIZ.LJJII(str4, "privilege_type");
            c474500IjALIZIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZIZ.LJJII(str, "channel");
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "error_code");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("monitorBarrageAnimationDownloadFinish log failed", e);
        }
    }

    public static void LJFF(String str, String str2, Integer num, Integer num2, Boolean bool) {
        int i;
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_resource_exist_when_use");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "access_key");
            c474500IjALIZ.LJJII(str2, "channel");
            c474500IjALIZ.LJJII(num, "barrage_grade");
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_exist");
            c474500IjALIZ.LJJII(num2, "barrage_msg_type");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJI(String str, String str2, Integer num, Integer num2, Boolean bool, Boolean bool2, String str3) {
        int i;
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_sync_resource_result", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJJII(str, "access_key");
            c474500IjALIZIZ.LJJII(str2, "channel");
            c474500IjALIZIZ.LJJII(num, "barrage_grade");
            c474500IjALIZIZ.LJJII(num2, "barrage_msg_type");
            Boolean bool3 = Boolean.TRUE;
            int i2 = 1;
            if (Intrinsics.LJFF(bool, bool3)) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "success");
            if (!Intrinsics.LJFF(bool2, bool3)) {
                i2 = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "call_back_state");
            c474500IjALIZIZ.LJJII(str3, "error_msg");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJIIIIZZ();
                c474500IjALIZIZ.LJJIJL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
