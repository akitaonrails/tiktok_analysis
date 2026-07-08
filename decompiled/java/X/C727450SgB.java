package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727450SgB {
    public static final boolean LIZ(User user) {
        return Intrinsics.LJFF(user.getUid(), "reveal_story");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final User LIZIZ(List<? extends User> list) {
        User user = new User();
        user.setUid("reveal_story");
        if (!Boolean.valueOf(!list.isEmpty()).booleanValue()) {
            list = null;
        }
        user.setRevealDisplayUsers(list);
        return user;
    }
}
