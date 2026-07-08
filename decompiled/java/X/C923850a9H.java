package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0a9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923850a9H {
    public static long LIZ;
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static final void LIZ(String str) throws JSONException {
        String strLIZ;
        if (LIZ > 0) {
            HashMap map = new HashMap();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                map.put("guest_id", LIZLLL);
                map.put("room_id", room.getIdStr());
                map.put("duration", String.valueOf(System.currentTimeMillis() - LIZ));
                LiveMode streamType = room.getStreamType();
                if (streamType != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                } else {
                    strLIZ = "live_studio";
                }
                map.put("live_type", strLIZ);
                map.put("connection_over_type", str);
                map.put("anchor_relationship", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
                map.put("guest_invite_type", LIZIZ);
                w.LIZ.getClass();
                map.put("enter_method", w.LJIIL());
                map.put("enter_from_merge", w.LJIIIZ());
                map.put("action_type", w.LIZLLL());
                map.put("layout_setting", "floating");
                map.put("window_setting", "unfixed");
                map.put("camera_status", "off");
                map.put("permission_type", C925050aBD.LJ());
                map.put("link_id", LIZJ);
                C923860a9I.LIZJ(map);
                map.put("enhance_level", CardStruct.IStatusCode.DEFAULT);
                C923860a9I.LIZIZ(map);
                map.put("guest_permission", C924250a9v.LIZ().LJIILJJIL());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_over");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
            LIZ = 0L;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_name", "ttlive_multilive_guest_end");
            jSONObject.put("way", str);
            C20441214yg.LJIIIZ("GameLinkGuestEnd", C786410Ut5.J3(jSONObject));
        }
    }
}
