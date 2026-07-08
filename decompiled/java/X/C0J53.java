package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0J53, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J53 {
    public static String LIZ(String str) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(currentUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
