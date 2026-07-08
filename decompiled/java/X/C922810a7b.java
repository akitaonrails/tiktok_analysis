package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922810a7b {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str) {
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        C924620aAW.LJIIJJI(map);
        map.put("event_action_type", str);
        map.put("list_ucnt", String.valueOf(i));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_quick_connect_invite_panel");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(Boolean bool, String str) {
        String str2;
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        C924620aAW.LJIIJJI(map);
        map.put("link_reason", "quick_connect");
        map.put("event_action_type", str);
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_in_quick_connect", str2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_quick_connect");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        C924620aAW.LJIIJJI(map);
        map.put("action_type", str);
        map.put("link_reason", str2);
        map.put("multi_request_id", str4);
        map.put("remote_link_id", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_quick_connect_invite_panel_user_action");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
