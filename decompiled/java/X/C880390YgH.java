package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0YgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880390YgH {
    public static final boolean LIZ(IMUser iMUser, int i, Integer num) {
        int followerCount;
        if (iMUser != null) {
            followerCount = iMUser.getFollowerCount();
        } else {
            followerCount = 0;
        }
        if (num == null) {
            if (followerCount < i) {
                return false;
            }
        } else if (followerCount < i || followerCount >= num.intValue()) {
            return false;
        }
        return true;
    }
}
