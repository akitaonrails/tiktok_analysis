package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Oi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626710Oi5 {
    public static final C626710Oi5 LIZ = new C626710Oi5();

    public static void LIZ(C626710Oi5 c626710Oi5, String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i) {
        LinkedHashMap linkedHashMap;
        String string = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        c626710Oi5.getClass();
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("enter_from", "topic_detail");
        pairArr[1] = new Pair("enter_method", str);
        pairArr[2] = new Pair("previous_page", str2);
        pairArr[3] = new Pair("category", str3);
        pairArr[4] = new Pair("topic_id", str4);
        pairArr[5] = new Pair("topic_title", str5);
        if (num != null) {
            string = num.toString();
        }
        pairArr[6] = new Pair("topic_rate", string);
        pairArr[7] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str6);
        C20684815ws.LJIILLIIL("post_topic_review", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), linkedHashMap));
    }
}
