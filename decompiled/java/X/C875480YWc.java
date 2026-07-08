package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C875480YWc {
    public static int LIZ;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("type");
        if (!Intrinsics.LJFF(str, "user_enter_time") && !Intrinsics.LJFF(str, "invite_comment")) {
            String str2 = c869590Y9l.getExt().get("visibility_type");
            if (str2 == null) {
                str2 = "3";
            }
            if (!Intrinsics.LJFF(str2, "-1") && !Intrinsics.LJFF(str2, "1")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZ(C869590Y9l c869590Y9l, Map map) {
        String string;
        String conversationId;
        String str;
        Map<String, String> localExt;
        Map<String, String> ext;
        String str2 = null;
        if (c869590Y9l != null) {
            string = Long.valueOf(c869590Y9l.getMsgId()).toString();
        } else {
            string = null;
        }
        map.put("message_id", string);
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        } else {
            conversationId = null;
        }
        map.put("conversation_id", conversationId);
        if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null) {
            str = ext.get("type");
        } else {
            str = null;
        }
        map.put("content_type", str);
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null) {
            str2 = localExt.get("s:send_response_extra_code");
        }
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
    }
}
