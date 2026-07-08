package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0l12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341580l12 {
    public static final String LIZ(User user) {
        if (user == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (C10EU.LJIILLIIL(user)) {
            return "-1";
        }
        if (user.isAccuratePrivateAccount()) {
            return "4";
        }
        if (user.getFollowStatus() == 2) {
            return "2";
        }
        if (user.getFollowStatus() != 1) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return "1";
    }
}
