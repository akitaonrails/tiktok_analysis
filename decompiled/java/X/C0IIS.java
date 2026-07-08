package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IIS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIS {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static final void LIZIZ(String str) {
        EnterRoomConfig enterRoomConfig;
        if (!LIZ && !LIZIZ && !LIZJ) {
            EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
            if (enterRoomLinkSessionLIZ != null) {
                enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig;
            } else {
                enterRoomConfig = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (enterRoomConfig != null) {
                linkedHashMap.putAll(C2097608Jq.LJIIJ(new Pair("enter_from_merge", String.valueOf(enterRoomConfig.mRoomsData.enterFromMerge)), new Pair("enter_method", String.valueOf(enterRoomConfig.mRoomsData.enterMethod)), new Pair("action_type", String.valueOf(enterRoomConfig.mRoomsData.actionType)), new Pair("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new Pair("anchor_id", String.valueOf(enterRoomConfig.mRoomsData.userId))));
            }
            LJ(linkedHashMap, C0II1.ENTER_ROOM_FAIL_OTHER, 401, str);
        }
    }

    public static final void LIZJ(EnterRoomConfig enterRoomConfig, C0II1 c0ii1) {
        LIZLLL(enterRoomConfig, c0ii1, "exit_room_container", null);
    }

    public static final void LIZ(EnterRoomConfig enterRoomConfig, C0II1 c0ii1, String str) {
        LIZJ = true;
        if (enterRoomConfig != null) {
            LJ(C2097608Jq.LJIIJ(new Pair("enter_from_merge", String.valueOf(enterRoomConfig.mRoomsData.enterFromMerge)), new Pair("enter_method", String.valueOf(enterRoomConfig.mRoomsData.enterMethod)), new Pair("action_type", String.valueOf(enterRoomConfig.mRoomsData.actionType)), new Pair("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new Pair("anchor_id", String.valueOf(enterRoomConfig.mRoomsData.userId))), c0ii1, 402, str);
        }
    }

    public static final void LIZLLL(EnterRoomConfig enterRoomConfig, C0II1 c0ii1, String str, Integer num) {
        LIZJ = true;
        if (enterRoomConfig != null) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from_merge", String.valueOf(enterRoomConfig.mRoomsData.enterFromMerge)), new Pair("enter_method", String.valueOf(enterRoomConfig.mRoomsData.enterMethod)), new Pair("action_type", String.valueOf(enterRoomConfig.mRoomsData.actionType)), new Pair("room_id", String.valueOf(enterRoomConfig.mRoomsData.roomId)), new Pair("anchor_id", String.valueOf(enterRoomConfig.mRoomsData.userId)));
            if (num != null) {
                num.intValue();
                mapLJIIJ.put("server_error_code", num.toString());
            }
            LJ(mapLJIIJ, c0ii1, 401, str);
        }
    }

    public static final void LJ(Map<String, String> map, C0II1 c0ii1, int i, String str) {
        map.put("error_code", String.valueOf(i));
        map.put("detail_error_code", String.valueOf(c0ii1.getDetailCode()));
        map.put("error_msg", c0ii1.name());
        map.put("error_action", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_abnormal_live_play");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
