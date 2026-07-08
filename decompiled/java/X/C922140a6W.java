package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import qo2.w;

/* JADX INFO: renamed from: X.0a6W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922140a6W {
    public static Map LIZ(String str) {
        String idStr;
        HashMap map = new HashMap();
        Pair pairLJII = C917520Zz4.LJII(C917520Zz4.LJIILIIL());
        map.put("connection_over_type", str);
        map.put("layout_setting", pairLJII.getFirst());
        map.put("window_setting", pairLJII.getSecond());
        map.put("link_id", C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
        map.put("link_duration", String.valueOf(System.currentTimeMillis() - C920830a4P.LIZJ));
        map.put("live_type", C917520Zz4.LJIIL());
        w.LIZ.getClass();
        map.put("enter_method", w.LJIIL());
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("anchor_id", String.valueOf(C950220apo.LJIILLIIL(PlaybookUtilKt.LJJIII())));
        Room roomLJJIII = PlaybookUtilKt.LJJIII();
        if (roomLJJIII == null || (idStr = roomLJJIII.getIdStr()) == null) {
            idStr = "";
        }
        map.put("room_id", idStr);
        return map;
    }
}
