package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.net.URL;
import java.util.Collections;

/* JADX INFO: renamed from: X.0OD6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OD6 {
    public static final int LIZ(User user) {
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (user != null) {
            numValueOf = Integer.valueOf(user.getFollowStatus());
            numValueOf2 = Integer.valueOf(user.getFollowerStatus());
        } else {
            numValueOf = null;
        }
        return LIZIZ(numValueOf, numValueOf2);
    }

    public static final UserInvitee LIZJ(User user) {
        if (user == null) {
            return null;
        }
        return new UserInvitee(user.getUid(), user.getNickname(), null, user.getAvatarThumb(), Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()), user.getAddYoursInvited().booleanValue(), false);
    }

    public static final UrlModel LIZLLL(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null) {
            return null;
        }
        try {
            String path = new URL(str).getPath();
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(path);
            urlModel.setUrlList(Collections.singletonList(str));
            C189200o6.m2constructorimpl(urlModel);
            obj = urlModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (UrlModel) obj2;
    }

    public static final int LIZIZ(Integer num, Integer num2) {
        if (num == null) {
            return -1;
        }
        if (num.intValue() == 2) {
            return 2;
        }
        if (num.intValue() == 1) {
            return 1;
        }
        if (num2 != null && num2.intValue() == 1) {
            return 3;
        }
        return 0;
    }
}
