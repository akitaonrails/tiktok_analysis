package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352310lIL {
    public static final boolean LIZ(Aweme aweme) {
        boolean z;
        User author;
        User author2;
        User author3 = aweme.getAuthor();
        if (author3 != null && author3.getCommentSetting() == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((z && AwemeExtKt.getFollowStatus(aweme) == 2) || (((author = aweme.getAuthor()) != null && author.getCommentSetting() == 2 && AwemeExtKt.getFollowStatus(aweme) >= 1) || (((author2 = aweme.getAuthor()) != null && author2.getCommentSetting() == 0) || LIZJ(aweme)))) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        boolean z;
        User author = aweme.getAuthor();
        if (author != null && author.getCommentSetting() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (LIZJ(aweme) && z) {
            return z;
        }
        if (aweme.getCommentSetting() == 3 || z) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        String uid;
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        return Intrinsics.LJFF(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
    }
}
