package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0UKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770630UKv {
    public static final String LIZ() {
        return String.valueOf(UserService.getInstance().user().getCurrentUserId());
    }
}
