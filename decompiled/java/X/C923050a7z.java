package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0a7z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923050a7z {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;

    public static Map LIZ(Room room) {
        HashMap map = new HashMap();
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 == null) {
            if (room != null) {
            }
            map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
            return map;
        }
        room = room2;
        map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        map.put("room_id", room.getIdStr());
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("live_room_mode", String.valueOf(room.liveRoomMode));
        w.LIZ.getClass();
        map.put("enter_method", w.LJIIL());
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("action_type", w.LIZLLL());
        map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        return map;
    }

    public static final void LIZJ(String str) {
        int i;
        LIZIZ = SystemClock.uptimeMillis();
        Map mapLIZ = LIZ(null);
        HashMap map = (HashMap) mapLIZ;
        map.put("trigger", str);
        LJI(null);
        C924650aAZ.LIZIZ(mapLIZ);
        GameLinkDataHolder gameLinkDataHolderLIZLLL = C924650aAZ.LIZLLL();
        if (gameLinkDataHolderLIZLLL != null) {
            i = gameLinkDataHolderLIZLLL.LJJIFFI;
        } else {
            i = 0;
        }
        map.put("guest_cnt", String.valueOf(i));
        LJ("livesdk_guest_connection_status_view_start", null, mapLIZ);
    }

    public static void LJFF(String str) {
        if (str == null) {
            LIZLLL = null;
        } else {
            if (Intrinsics.LJFF(LIZLLL, "live_over")) {
                return;
            }
            LIZLLL = str;
        }
    }

    public static void LJI(String str) {
        if (str == null) {
            LJ = null;
        } else {
            if (Intrinsics.LJFF(LJ, "live_over")) {
                return;
            }
            LJ = str;
        }
    }

    public static final void LIZLLL(Room room, String str) {
        HashMap map = new HashMap();
        map.put("action_type", str);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
        }
        LJ("livesdk_multi_guest_to_portrait_popup", null, map);
    }

    public static void LIZIZ(Integer num, Room room, int i) {
        String strValueOf;
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            room = null;
        }
        if (LIZIZ > 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - LIZIZ;
            Map mapLIZ = LIZ(room);
            String str = LJ;
            if (str == null) {
                str = "live_over";
            }
            HashMap map = (HashMap) mapLIZ;
            map.put("trigger", str);
            LJI(null);
            C924650aAZ.LIZIZ(mapLIZ);
            map.put("duration", String.valueOf(jUptimeMillis));
            if (num == null || (strValueOf = num.toString()) == null) {
                strValueOf = String.valueOf(C924810aAp.LJ().LJJII);
            }
            map.put("guest_cnt", strValueOf);
            LJ("livesdk_guest_connection_status_view_duration", null, mapLIZ);
            LIZIZ = 0L;
        }
    }

    public static void LJ(String str, Double d, Map map) {
        if (Intrinsics.LJFF("livesdk_guest_connection_mode_view_start", str)) {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ(str, d);
            c474500IjALIZIZ.LJJIIZI(map);
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
