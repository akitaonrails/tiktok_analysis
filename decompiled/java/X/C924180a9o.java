package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0a9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924180a9o {
    public static long LIZ;
    public static long LIZIZ;
    public static boolean LIZJ;

    public static void LIZ(Map map) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
        }
    }

    public static void LIZIZ(String str) {
        HashMap map = new HashMap();
        w.LIZ.getClass();
        map.put("enter_method", w.LJIIL());
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("action_type", w.LIZLLL());
        LIZ(map);
        map.put("popup_action_type", str);
        LIZLLL("livesdk_guest_connection_ops_material_popup", map);
    }

    public static void LIZJ(boolean z) {
        if (LIZIZ <= 0) {
            return;
        }
        LIZJ = z;
        if (z) {
            LIZ += System.currentTimeMillis() - LIZIZ;
        } else {
            LIZIZ = System.currentTimeMillis();
        }
    }

    public static void LIZLLL(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
