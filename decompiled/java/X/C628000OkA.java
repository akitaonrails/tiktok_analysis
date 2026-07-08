package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0OkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628000OkA {
    public static final C628000OkA LIZ = new C628000OkA();
    public static final C2344009Gk LIZIZ = new C2344009Gk();

    public static boolean LIZ(User user) {
        String uri;
        List<String> urlList;
        if (user.getAvatarThumb() != null && (uri = user.getAvatarThumb().getUri()) != null && uri.length() != 0 && (urlList = user.getAvatarThumb().getUrlList()) != null && !urlList.isEmpty()) {
            List<String> urlList2 = user.getAvatarThumb().getUrlList();
            ArrayList arrayList = new ArrayList();
            for (String str : urlList2) {
                if (str.length() == 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() != user.getAvatarThumb().getUrlList().size()) {
                return false;
            }
        }
        return true;
    }

    public static void LIZIZ(Aweme aweme) {
        C2344009Gk c2344009Gk = LIZIZ;
        if (aweme == null) {
            c2344009Gk.getClass();
            c2344009Gk.LJIIIIZZ("feed_miss_type", "-1");
            return;
        }
        if (aweme.getAuthor() != null && AwemeExtKt.getAuthorUid(aweme).length() != 0 && !aweme.getAuthor().isUserDataMiss) {
            String nickname = aweme.getAuthor().getNickname();
            if ((nickname == null || nickname.length() == 0) && LIZ(aweme.getAuthor())) {
                c2344009Gk.LIZJ(2, "feed_miss_type");
                return;
            }
            String nickname2 = aweme.getAuthor().getNickname();
            if (nickname2 != null && nickname2.length() != 0) {
                if (LIZ(aweme.getAuthor())) {
                    c2344009Gk.LIZJ(4, "feed_miss_type");
                    return;
                } else {
                    c2344009Gk.LIZJ(0, "feed_miss_type");
                    return;
                }
            }
            c2344009Gk.LIZJ(3, "feed_miss_type");
            return;
        }
        c2344009Gk.LIZJ(1, "feed_miss_type");
    }

    public static void LIZJ(User user) {
        String uid;
        C2344009Gk c2344009Gk = LIZIZ;
        if (user != null && (uid = user.getUid()) != null && uid.length() != 0) {
            String nickname = user.getNickname();
            if ((nickname == null || nickname.length() == 0) && LIZ(user)) {
                c2344009Gk.LIZJ(2, "profile_miss_type");
                return;
            }
            String nickname2 = user.getNickname();
            if (nickname2 != null && nickname2.length() != 0) {
                if (LIZ(user)) {
                    c2344009Gk.LIZJ(4, "profile_miss_type");
                    return;
                } else {
                    c2344009Gk.LIZJ(0, "profile_miss_type");
                    return;
                }
            }
            c2344009Gk.LIZJ(3, "profile_miss_type");
            return;
        }
        c2344009Gk.LIZJ(1, "profile_miss_type");
    }
}
