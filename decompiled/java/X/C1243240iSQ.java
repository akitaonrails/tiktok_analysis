package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0iSQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243240iSQ {
    public static final C1243240iSQ LIZ = new C1243240iSQ();

    public static String LIZ(User user, boolean z) {
        if (z && C343230Dcv.LIZ()) {
            String strLIZIZ = C1247000iYU.LIZIZ(user);
            if (strLIZIZ == null) {
                String nickname = user.getNickname();
                if (nickname == null) {
                    return "";
                }
                return nickname;
            }
            return strLIZIZ;
        }
        String nickname2 = user.getNickname();
        if (nickname2 == null) {
            return "";
        }
        return nickname2;
    }

    public static String LIZLLL(String str, String str2) {
        User user = new User();
        user.setNickname(str);
        user.setUniqueId(str2);
        String nickname = user.getNickname();
        if (nickname == null) {
            return "";
        }
        return nickname;
    }

    public static String LJ(C1243240iSQ c1243240iSQ, User user) {
        c1243240iSQ.getClass();
        String nickname = user.getNickname();
        if (nickname == null) {
            return "";
        }
        return nickname;
    }

    public static String LIZJ(C1243240iSQ c1243240iSQ, IMUser iMUser, String str) {
        String strLIZ;
        c1243240iSQ.getClass();
        if (C343230Dcv.LIZ() && (strLIZ = C1247000iYU.LIZ(iMUser)) != null) {
            return strLIZ;
        }
        return str;
    }
}
