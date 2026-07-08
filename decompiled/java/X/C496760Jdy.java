package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496760Jdy {
    public static String LIZ = "";

    public static void LIZ(C474500IjA c474500IjA) {
        long id;
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
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        c474500IjA.LJJII(Long.valueOf(id), "room_id");
        c474500IjA.LJJII(Long.valueOf(id2), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(currentUserId), "user_id");
    }

    public static int LIZIZ(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static int LIZJ(Integer num) {
        int iIntValue;
        if (num == null || (iIntValue = num.intValue()) < 0) {
            return 0;
        }
        return iIntValue;
    }

    public static int LIZLLL(List list) {
        Object next;
        PrivilegeLogExtra privilegeLogExtra;
        String str;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((BadgeStruct) next).badgeScene == 8) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BadgeStruct badgeStruct = (BadgeStruct) next;
            if (badgeStruct != null && (privilegeLogExtra = badgeStruct.logExtra) != null && (str = privilegeLogExtra.level) != null) {
                return C0IZJ.LIZ(str);
            }
        }
        return 0;
    }

    public static Number LJIIJ(Number number) {
        if (number == null) {
            return -1;
        }
        return number;
    }

    public static void LJ(String str, boolean z) {
        if (Intrinsics.LJFF(str, "gift")) {
            str = "gift_panel";
        }
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_api_info_event", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            LIZ(c474500IjALIZIZ);
            c474500IjALIZIZ.LJJII(Integer.valueOf(LIZIZ(Boolean.valueOf(z))), "need_config");
            c474500IjALIZIZ.LJJII(str, Scene.SCENE_SERVICE);
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJFF(Integer num, Long l, Integer num2, Long l2, Integer num3) {
        int iIntValue;
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_api_info_error", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
            c474500IjALIZIZ.LJIL();
            LIZ(c474500IjALIZIZ);
            c474500IjALIZIZ.LJJII(LJIIJ(num), "current_grade");
            c474500IjALIZIZ.LJJII(LJIIJ(l), "current_score");
            c474500IjALIZIZ.LJJII(LJIIJ(num2), "grade");
            c474500IjALIZIZ.LJJII(LJIIJ(l2), "score");
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = -3;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(iIntValue), "error_code");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJI(Boolean bool, Long l, Long l2, Integer num, String str, long j) {
        int i;
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_opt_api");
            c474500IjALIZ.LJIL();
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "result");
            c474500IjALIZ.LJJII(l, "from_status");
            c474500IjALIZ.LJJII(l2, "to_status");
            c474500IjALIZ.LJJII(num, "current_level");
            c474500IjALIZ.LJJII(str, "error_msg");
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIIZZ(Integer num, Integer num2, Integer num3, Long l, Long l2, Integer num4) {
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_opt_status_changed", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
            c474500IjALIZIZ.LJIL();
            LIZ(c474500IjALIZIZ);
            c474500IjALIZIZ.LJJII(num, "current_grade");
            c474500IjALIZIZ.LJJII(l, "current_score");
            c474500IjALIZIZ.LJJII(num2, "current_grade_mode");
            c474500IjALIZIZ.LJJII(num3, "grade");
            c474500IjALIZIZ.LJJII(l2, "score");
            c474500IjALIZIZ.LJJII(num4, "grade_mode");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIIZ(DataChannel dataChannel, String str, int i, int i2, boolean z, long j, int i3, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        String str2;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (j < 0) {
            j = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i == i2) {
            z4 = true;
        } else {
            z4 = false;
        }
        int iLIZIZ = LIZIZ(Boolean.valueOf(z4));
        int iLIZIZ2 = LIZIZ(Boolean.valueOf(z));
        if (j == i3) {
            z5 = true;
        } else {
            z5 = false;
        }
        int iLIZIZ3 = LIZIZ(Boolean.valueOf(z5));
        int iLIZIZ4 = LIZIZ(Boolean.valueOf(z2));
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_system_user_and_level_cache_monitor");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ), "is_user_level_same");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "user_user_level");
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "contrast_user_level");
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ2), "contrast_user_mode");
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ3), "is_fans_club_level_same");
            c474500IjALIZ.LJJII(Long.valueOf(j), "user_fans_level");
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "contrast_fans_level");
            c474500IjALIZ.LJJII(Integer.valueOf(iLIZIZ4), "contrast_fans_mode");
            c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ(Boolean.valueOf(z3))), "is_contrast_fans_badge_exist");
            if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            c474500IjALIZ.LJJII(str2, "user_type");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJII(boolean z, String str, long j, boolean z2, Integer num, Integer num2, Long l, Integer num3, Long l2, Long l3, String str2) {
        if (Intrinsics.LJFF(str, "gift")) {
            str = "gift_panel";
        }
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_level_api_info_result");
            LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ(Boolean.valueOf(z))), "need_config");
            c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ(Boolean.valueOf(z2))), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LJJII(num, "error_code");
            c474500IjALIZ.LJJII(LJIIJ(num2), "grade");
            c474500IjALIZ.LJJII(LJIIJ(l), "score");
            c474500IjALIZ.LJJII(LJIIJ(num3), "cache_grade");
            c474500IjALIZ.LJJII(LJIIJ(l2), "cache_score");
            c474500IjALIZ.LJJII(LJIIJ(l3), "cache_version");
            c474500IjALIZ.LJJII(str2, "log_id");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
