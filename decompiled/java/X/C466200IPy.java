package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.livesetting.performance.LiveQuickReturnLogSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveQuickReturnOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466200IPy {
    public static boolean LIZ;
    public static volatile C466190IPx LIZIZ;

    public static final void LIZ(BaseResponse<Room, EnterRoomExtra> baseResponse) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addRoomCache: ");
        Room room = baseResponse.data;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = new C466190IPx(System.currentTimeMillis(), baseResponse);
    }

    public static final BaseResponse<Room, EnterRoomExtra> LIZIZ(long j, boolean z) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3 = null;
        if (!LIZ) {
            return null;
        }
        if (z) {
            LIZ = false;
        }
        C466190IPx c466190IPx = LIZIZ;
        if (c466190IPx == null) {
            if (z) {
                LIZJ(1, -1L, "miss_no_cache");
            }
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c466190IPx.LIZIZ;
        Room room = c466190IPx.LIZ.data;
        if (room != null && room.getId() == j) {
            if (jCurrentTimeMillis >= LiveQuickReturnOptSetting.getExpireTime()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getRoomCacheInfo fail: ");
                Room room2 = c466190IPx.LIZ.data;
                if (room2 != null) {
                    lValueOf2 = Long.valueOf(room2.getId());
                } else {
                    lValueOf2 = null;
                }
                sbLIZ.append(lValueOf2);
                sbLIZ.append(" expire");
                C2188811AlT.LIZIZ(sbLIZ);
                if (z) {
                    LIZJ(1, jCurrentTimeMillis, "miss_expired");
                }
                return null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getRoomCacheInfo success: ");
            Room room3 = c466190IPx.LIZ.data;
            if (room3 != null) {
                lValueOf3 = Long.valueOf(room3.getId());
            }
            sbLIZ2.append(lValueOf3);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (z) {
                LIZJ(0, jCurrentTimeMillis, "hit");
            }
            return c466190IPx.LIZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getRoomCacheInfo fail: target is ");
        sbLIZ3.append(j);
        sbLIZ3.append(" but find ");
        Room room4 = c466190IPx.LIZ.data;
        if (room4 != null) {
            lValueOf = Long.valueOf(room4.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ3.append(lValueOf);
        sbLIZ3.append(" not match");
        C2188811AlT.LIZIZ(sbLIZ3);
        if (z) {
            LIZJ(1, jCurrentTimeMillis, "miss_mismatch");
        }
        return null;
    }

    public static void LIZJ(int i, long j, String str) {
        if (Math.random() > LiveQuickReturnLogSetting.INSTANCE.getValue()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cache_status", str);
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("expire_time_ms", LiveQuickReturnOptSetting.getExpireTime());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cache_age_ms", j);
            C1CC2.LJ("live_quick_return_cache_new", jSONObject, jSONObject2, new JSONObject());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
