package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Rb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698840Rb8 {
    public static final C698840Rb8 LIZ = new C698840Rb8();

    public static boolean LIZ(Aweme aweme, boolean z) {
        String uid;
        User author;
        if (!z) {
            return false;
        }
        if (aweme == null || !aweme.getIsTikTokStory()) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            if (((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(uid)) {
                return true;
            }
        }
        return false;
    }
}
