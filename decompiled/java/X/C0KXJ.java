package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0KXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXJ {
    public static UserAttr LIZ() {
        User userLIZIZ = LIZIZ();
        if (userLIZIZ == null) {
            return null;
        }
        if (userLIZIZ.userAttr == null) {
            userLIZIZ.userAttr = new UserAttr();
        }
        return userLIZIZ.userAttr;
    }

    public static User LIZIZ() {
        return UserService.getInstance().user().LJIJJLI();
    }
}
