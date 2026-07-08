package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.19vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21697519vp {
    public static String LIZ(InterfaceC1588310rQz interfaceC1588310rQz) {
        Aweme aweme;
        User author;
        String nickname;
        if (interfaceC1588310rQz == null || (aweme = interfaceC1588310rQz.getAweme()) == null || (author = aweme.getAuthor()) == null || (nickname = author.getNickname()) == null) {
            return "";
        }
        return nickname;
    }
}
