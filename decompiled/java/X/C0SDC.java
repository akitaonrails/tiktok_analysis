package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SDC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDC {
    public static final C0SDC LIZ = new C0SDC();

    public static String LIZ(Context context, User user) {
        if (user == null) {
            return null;
        }
        int followStatus = user.getFollowStatus();
        if (followStatus != 0) {
            if (followStatus != 1) {
                if (followStatus != 2) {
                    return null;
                }
                if (!C1336205Ku.LIZJ().LIZJ() && context != null) {
                    String strLJFF = C1336205Ku.LIZ(false).getImSayHiService().LJFF(Integer.MAX_VALUE, context, user.getUid(), true, false);
                    if (strLJFF != null && !Intrinsics.LJFF(strLJFF, context.getResources().getString(2131837236))) {
                        return "sayhi";
                    }
                    return "message";
                }
                return "friend";
            }
            return "following";
        }
        if (user.getFollowerStatus() == 1) {
            return "follow_back";
        }
        return "follow";
    }
}
