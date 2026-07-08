package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0TDE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TDE {
    public static final Keva LIZ = Keva.getRepo("gift_toolbar");

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("match_gifts_bubble_");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
