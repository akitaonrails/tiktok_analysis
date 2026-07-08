package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0NBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589910NBt {
    public static final C589910NBt LIZ = new C589910NBt();

    public static void LIZ(int i, String str) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"), new Pair("action_type", str), new Pair("cell_cnt", String.valueOf(i)));
        String str2 = C0NBD.LIZ;
        if (str2 != null) {
            mapLJIIJ.put("inbox_session_id", str2);
        }
        C20684815ws.LJIILLIIL("inbox_topwindow_preview_icon", mapLJIIJ);
    }
}
