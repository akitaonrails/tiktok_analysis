package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344730l67 {
    public static final boolean LIZ(Aweme aweme) {
        User author;
        if (aweme.getCommentSetting() == 3 || ((author = aweme.getAuthor()) != null && author.getCommentSetting() == 3)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        String uid;
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        return Intrinsics.LJFF(uid, C0XQ7.LJFF().getCurUserId());
    }
}
