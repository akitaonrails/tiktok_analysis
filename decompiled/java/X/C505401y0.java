package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01y0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C505401y0 {
    public static final /* synthetic */ int LIZ = 0;

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

    public static void LIZJ(String str, boolean z) {
        int i;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_badge_load_result", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()));
        LIZ(c474500IjALIZIZ);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZIZ.LJJII(str, "uri");
        c474500IjALIZIZ.LJJII("user_level_avatar", Scene.SCENE_SERVICE);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJJIJL();
        }
    }

    public static void LIZIZ(Integer num, Integer num2, Long l, Integer num3, Long l2, Boolean bool, Integer num4) {
        int i;
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_view_grade_updated", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJIL();
            LIZ(c474500IjALIZIZ);
            c474500IjALIZIZ.LJJII(num, "current_grade");
            c474500IjALIZIZ.LJJII(num2, "grade");
            c474500IjALIZIZ.LJJII(l, "score");
            c474500IjALIZIZ.LJJII(num3, "grade_mode");
            c474500IjALIZIZ.LJJII(l2, "time_to_sleep");
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_animating");
            c474500IjALIZIZ.LJJII(num4, "grade_upgrade_type");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
