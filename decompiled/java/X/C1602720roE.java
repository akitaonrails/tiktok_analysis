package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0roE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602720roE {
    public static boolean LIZ(String str) {
        if (C1568260que.LIZ().followingHeadEnable) {
            if (!Intrinsics.LJFF(str, "homepage_hot") && !Intrinsics.LJFF(str, "homepage_follow")) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(str, "homepage_hot");
    }

    public static boolean LIZIZ(Aweme aweme, User user) {
        if (aweme == null || !C1260740iue.LIZ()) {
            return false;
        }
        if (C1017070cZd.LLJIJIL(aweme)) {
            return true;
        }
        if (((user == null || Intrinsics.LJFF(user.getUid(), AwemeExtKt.getAuthorUid(aweme))) && (user = aweme.getAuthor()) == null) || !user.isLive() || user.isBlock() || C10EU.LJIIIIZZ() || C1017070cZd.LJIIIIZZ(aweme)) {
            return false;
        }
        return true;
    }
}
