package X;

import com.bytedance.android.livesdk.userservice.UserService;
import tikcast.api.wallet.tiktok.CheckEmailNotificationEligibilityResult;

/* JADX INFO: renamed from: X.0x5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805760x5i {
    public static Long LIZ;
    public static CheckEmailNotificationEligibilityResult.Data LIZIZ;
    public static long LIZJ;

    public static CheckEmailNotificationEligibilityResult.Data LIZ() {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Long l = LIZ;
        if (l != null && currentUserId == l.longValue()) {
            return LIZIZ;
        }
        LIZ = null;
        LIZIZ = null;
        LIZJ = 0L;
        return null;
    }
}
