package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1065340dpU {
    public static final C1065340dpU LIZ = new C1065340dpU();

    public static Integer LIZ(Aweme aweme) {
        String authorUid;
        int followStatus;
        User author;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (Intrinsics.LJFF(authorUid, ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            return null;
        }
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            followStatus = author.getFollowStatus();
        } else {
            followStatus = -1;
        }
        return Integer.valueOf(followStatus);
    }
}
