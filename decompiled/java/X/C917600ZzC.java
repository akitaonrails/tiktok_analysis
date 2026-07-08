package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917600ZzC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, boolean z2) {
        String str2;
        Object obj;
        if (str == null) {
            return;
        }
        HashMap map = new HashMap();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map.put("room_id", room.getIdStr());
            if (z) {
                str2 = "click";
            } else {
                str2 = "show";
            }
            map.put("action_type", str2);
            String str3 = "1";
            if (C924810aAp.LJ().LJJII != 0) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_guest_connection", obj);
            map.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
            map.put("user_id", str);
            if (!z2) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_mutal", str3);
            C917520Zz4.LIZ(map);
            C474500IjA c474500IjALIZ = C0KX4.LIZ("livesdk_anchor_guest_connection_animation", map, null, false);
            Pair[] pairArr = {new Pair("anchorLiveHome", "multiguestBtnAnimShow")};
            C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
            c945340ahw.LIZ((Pair[]) Arrays.copyOf(pairArr, 1));
            c945340ahw.LIZIZ();
        }
    }
}
