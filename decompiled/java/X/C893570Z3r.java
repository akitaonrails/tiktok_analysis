package X;

import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893570Z3r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, String str, String str2, List list) {
        String str3;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        if (z) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        c830490Whz.put("chat_type", str3);
        c830490Whz.put("message_type", str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                c830490Whz.put(pair.getFirst(), pair.getSecond());
            }
        }
        if (str2 != null) {
            c830490Whz.put("sticker_id", str2);
        }
        C20684815ws.LJIILLIIL("delete_message", c830490Whz);
    }

    public static void LIZIZ(C869590Y9l c869590Y9l, boolean z, String str, Map map, String str2) {
        String strLJ;
        C892320YzW c892320YzWLJIIIIZZ;
        C0I0B.LJFF.LIZIZ();
        if (str2 == null) {
            if (z) {
                str2 = "group";
            } else {
                str2 = "private";
            }
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("chat_type", str2);
        c830490Whz.put("conversation_id", c869590Y9l.getConversationId());
        String uuid = c869590Y9l.getUuid();
        uuid.toString();
        c830490Whz.put("message_id", uuid);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        String string = null;
        if (iMessageAnalyticsUtilsLIZ != null) {
            strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l);
        } else {
            strLJ = null;
        }
        c830490Whz.put("message_type", strLJ);
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ2 = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ2 != null && (c892320YzWLJIIIIZZ = iMessageAnalyticsUtilsLIZ2.LJIIIIZZ(c869590Y9l, null)) != null) {
            c830490Whz.put("message_type_v2", c892320YzWLJIIIIZZ.LIZ);
        }
        c830490Whz.put("real_message_type", String.valueOf(c869590Y9l.getMsgType()));
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ3 = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ3 != null) {
            string = Integer.valueOf(iMessageAnalyticsUtilsLIZ3.LJI(c869590Y9l)).toString();
        }
        c830490Whz.put("awe_type", string);
        if (str != null) {
            c830490Whz.put("target", str);
        }
        c830490Whz.putAll(map);
        C20684815ws.LJIILLIIL("message_long_press_feedback", c830490Whz);
    }

    public static void LIZLLL(C869590Y9l c869590Y9l, boolean z, String str, String str2, boolean z2) {
        String str3;
        List<Pair<String, String>> listLJIIIZ;
        C0I0B.LJFF.LIZIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("conversation_id", c869590Y9l.getConversationId());
        if (z) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        c2344009Gk.LJFF("chat_type", str3);
        c2344009Gk.LIZLLL(c869590Y9l.getSender(), "quote_user_id");
        c2344009Gk.LIZJ(C0ZDX.LJJJJIZL(c869590Y9l) ? 1 : 0, "is_self");
        c2344009Gk.LJFF("message_type", str);
        IMessageAnalyticsUtils.LIZ.getClass();
        IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
        if (iMessageAnalyticsUtilsLIZ != null && (listLJIIIZ = iMessageAnalyticsUtilsLIZ.LJIIIZ(c869590Y9l)) != null) {
            for (Pair<String, String> pair : listLJIIIZ) {
                c2344009Gk.LJFF(pair.getFirst(), pair.getSecond());
            }
        }
        c2344009Gk.LJFF("enter_method", str2);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "is_quick_reply");
        String strLIZJ = C453750Hqn.LIZJ(c869590Y9l);
        if (strLIZJ != null) {
            c2344009Gk.LJFF("sticker_type", strLIZJ);
        }
        String strLIZIZ = C453750Hqn.LIZIZ(c869590Y9l);
        if (strLIZIZ != null) {
            c2344009Gk.LJFF("sticker_id", strLIZIZ);
        }
        C20684815ws.LJIILLIIL("quote_message", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, Map map, String str8) {
        C0I0B.LJFF.LIZIZ();
        if (str8 == null) {
            if (z) {
                str8 = "group";
            } else {
                str8 = "private";
            }
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("chat_type", str8);
        c830490Whz.put("message_type", str2);
        c830490Whz.put("message_type_v2", str3);
        c830490Whz.put("real_message_type", str4);
        c830490Whz.put("icon_type", str);
        c830490Whz.put("event_type", str5);
        c830490Whz.put("conversation_id", str6);
        c830490Whz.put("message_id", str7);
        c830490Whz.putAll(map);
        C20684815ws.LJIILLIIL("message_long_press", c830490Whz);
    }
}
