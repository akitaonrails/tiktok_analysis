package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Stg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735820Stg {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -2026708222:
                if (!str.equals("follow_rec")) {
                    return 0;
                }
                return 12;
            case -1286505224:
                if (!str.equals("message_fans")) {
                    return 0;
                }
                return 7;
            case -1165154881:
                if (!str.equals("face_to_face")) {
                    return 0;
                }
                return 201901;
            case -710131922:
                if (!str.equals("search_sug")) {
                    return 0;
                }
                return 14;
            case -667094460:
                if (!str.equals("homepage_friends")) {
                    return 0;
                }
                return 30;
            case -612351174:
                if (!str.equals("phone_number")) {
                    return 0;
                }
                return 4;
            case -196922769:
                if (!str.equals("share_user_info_popup")) {
                    return 0;
                }
                return 21;
            case -182649969:
                if (!str.equals("other_fans")) {
                    return 0;
                }
                return 11;
            case -121207376:
                if (!str.equals("discovery")) {
                    return 0;
                }
                return 14;
            case -6753043:
                if (!str.equals("share_user_info_card")) {
                    return 0;
                }
                return 21;
            case 3052376:
                if (!str.equals("chat")) {
                    return 0;
                }
                return 8;
            case 3135424:
                if (!str.equals("fans")) {
                    return 0;
                }
                return 9;
            case 3322092:
                if (!str.equals("live")) {
                    return 0;
                }
                return 16;
            case 3524221:
                if (!str.equals("scan")) {
                    return 0;
                }
                return 17;
            case 110541305:
                if (!str.equals("token")) {
                    return 0;
                }
                return 6;
            case 673697727:
                if (!str.equals("find_friends_page")) {
                    return 0;
                }
                return 3;
            case 809483594:
                if (!str.equals("others_homepage")) {
                    return 0;
                }
                return 19;
            case 954925063:
                if (!str.equals("message")) {
                    return 0;
                }
                return 8;
            case 998835423:
                if (!str.equals("general_search")) {
                    return 0;
                }
                return 14;
            case 1234580717:
                if (!str.equals("discovery_recommend")) {
                    return 0;
                }
                return 12;
            case 1425879700:
                if (!str.equals("search_result")) {
                    return 0;
                }
                return 14;
            case 1605556258:
                if (!str.equals("other_following")) {
                    return 0;
                }
                return 10;
            case 1691937916:
                if (!str.equals("homepage_hot")) {
                    return 0;
                }
                return 13;
            case 1839865103:
                if (!str.equals("find_friends")) {
                    return 0;
                }
                return 12;
            case 1989451056:
                if (!str.equals("share_profile_link")) {
                    return 0;
                }
                return 50;
            default:
                return 0;
        }
    }

    public static int LIZIZ(Aweme aweme, String str) {
        User author;
        if (!Intrinsics.LJFF(str, "share_user_info_card")) {
            if (aweme != null && AwemeBizExtKt.getSharer(aweme) != null) {
                return 21;
            }
            if (Intrinsics.LJFF(str, "others_homepage")) {
                return 19;
            }
            if (aweme != null && (author = aweme.getAuthor()) != null && C736550Sur.LIZIZ(author)) {
                return 20;
            }
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                return 13;
            }
            return 18;
        }
        return 21;
    }
}
