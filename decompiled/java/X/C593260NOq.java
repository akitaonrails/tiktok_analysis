package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C593260NOq {
    public static void LIZ(String str, Map map) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("action_type", str));
        mapLJIIJ.putAll(map);
        String str2 = C0NBD.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        mapLJIIJ.put("inbox_session_id", str2);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("inbox_message_cell", mapLJIIJ);
    }
}
