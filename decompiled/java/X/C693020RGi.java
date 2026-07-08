package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0RGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693020RGi {
    public static final User LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() == 13 && aweme.getForwardItem() != null) {
            return aweme.getForwardItem().getAuthor();
        }
        return aweme.getAuthor();
    }
}
