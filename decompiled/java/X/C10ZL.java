package X;

import android.app.Activity;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZL {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("a2270.b0.c0.d0", ""), new Pair("a2270.b6880.c0.d0", "general_search"), new Pair("a2270.b7715.c0.d0", "music_favourite"), new Pair("a2270.b7790.c0.d0", "music_daily"), new Pair("a2270.b2981.c0.d0", "login_vcode"), new Pair("a2270.b2863.c0.d0", "homepage_friends"), new Pair("a2270.b2706.c0.d0", "profile_unlogin"), new Pair("a2270.b3426.c0.d0", "inbox_unlogin"), new Pair("a2270.b2878.c0.d0", "feed_detail"), new Pair("a2270.b7200.c0.d0", "follow_detail"), new Pair("a2270.b9018.c0.d0", "music_new_notification"), new Pair("a2270.b8727.c0.d0", "personal_homepage"), new Pair("a2270.b9081.c0.d0", "inbox_new"), new Pair("a2270.b8003.c0.d0", "inbox_msg"), new Pair("a2270.b5131.c0.d0", "discovery"), new Pair("a2270.b5836.c0.d0", "profile_from_feed"), new Pair("a2270.b2001.c0.d0", "homepage_hot"), new Pair("a2270.b7464.c0.d0", "homepage_follow"), new Pair("a2270.b0226.c0.d0", "new_user_journey"), new Pair("a2270.b5346.c0.d0", "login_register"), new Pair("a2270.b8778.c0.d0", "login_mail"), new Pair("a2270.b2190.c0.d0", "login_phone"), new Pair("a2270.b1865.c0.d0", "create_password"), new Pair("a2270.b3144.c0.d0", "register_username"), new Pair("a2270.b0442.c0.d0", "register_vcode"), new Pair("a2270.b2325.c0.d0", "register_email"), new Pair("a2270.b9472.c0.d0", "register_phone"), new Pair("a2270.b4816.c0.d0", "register_birth"), new Pair("a2270.b6234.c0.d0", "invite_friend"), new Pair("a2270.b2474.c0.d0", "friend_address_book"), new Pair("a2270.b2793.c0.d0", "friends_find"), new Pair("a2270.b4771.c0.d0", "chat"), new Pair("a2270.b8245.c0.d0", "video_shot"), new Pair("a2270.b4180.c0.d0", "tt_live_play"), new Pair("a2270.b2185.c0.d0", "video_publish"), new Pair("a2270.b9224.c0.d0", "chat_group_detail"), new Pair("a2270.b4519.c0.d0", "chat_page"), new Pair("a2270.b3772.c0.d0", "my_qa"), new Pair("a2270.b0022.c0.d0", "video_draft"), new Pair("a2270.b1030.c0.d0", "sticker_detail"), new Pair("a2270.b5171.c0.d0", "music_detail"), new Pair("a2270.b1146.c0.d0", "question_detail"), new Pair("a2270.b3953.c0.d0", "challenge_detail"), new Pair("a2270.b5726.c0.d0", "video_editor"), new Pair("a2270.b9734.c0.d0", "search_middle"));

    public static final String LIZ(String str) {
        String simpleName;
        String str2 = LIZ.get(str);
        if (str2 == null) {
            if (str == null) {
                str = "";
            }
        } else {
            str = str2;
        }
        if (a0.LJJJIL(str)) {
            C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
            Activity currentActivity = c2213981Bky.getCurrentActivity();
            if (currentActivity != null && (simpleName = currentActivity.getClass().getSimpleName()) != null && simpleName.length() != 0) {
                return String.valueOf(simpleName);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("background:");
            sbLIZ.append(c2213981Bky.isAppBackground());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }
}
