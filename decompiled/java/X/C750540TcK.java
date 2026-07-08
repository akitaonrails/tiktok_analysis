package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.Map;

/* JADX INFO: renamed from: X.0TcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750540TcK {
    public static C750740Tce LIZIZ(User user) {
        Boolean boolValueOf;
        Map<Integer, Integer> map;
        C750740Tce c750740Tce = new C750740Tce(user.getId(), user.getSecUid(), C0KVU.LIZLLL(user), C0KVU.LJ(user), user.getAvatarThumb(), user.getUserHonor());
        UserAttr userAttr = user.getUserAttr();
        Boolean boolValueOf2 = null;
        if (userAttr != null) {
            boolValueOf = Boolean.valueOf(userAttr.isAdmin);
        } else {
            boolValueOf = null;
        }
        c750740Tce.LJII = C500260Jjc.LJJJI(boolValueOf);
        UserAttr userAttr2 = user.getUserAttr();
        if (userAttr2 != null) {
            map = userAttr2.adminPermissions;
        } else {
            map = null;
        }
        c750740Tce.LJIIIZ = map;
        UserAttr userAttr3 = user.getUserAttr();
        if (userAttr3 != null) {
            boolValueOf2 = Boolean.valueOf(userAttr3.isChannelAdmin);
        }
        c750740Tce.LJIIIIZZ = C500260Jjc.LJJJI(boolValueOf2);
        return c750740Tce;
    }

    public static C750740Tce LIZJ(User user, String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C750740Tce c750740Tce = new C750740Tce(user.getId(), user.getSecUid(), C0KVU.LIZLLL(user), C0KVU.LJ(user), user.getAvatarThumb(), user.getUserHonor());
        UserAttr userAttr = user.getUserAttr();
        Map<Integer, Integer> map = null;
        if (userAttr != null) {
            boolValueOf = Boolean.valueOf(userAttr.isAdmin);
        } else {
            boolValueOf = null;
        }
        c750740Tce.LJII = C500260Jjc.LJJJI(boolValueOf);
        UserAttr userAttr2 = user.getUserAttr();
        if (userAttr2 != null) {
            boolValueOf2 = Boolean.valueOf(userAttr2.isChannelAdmin);
        } else {
            boolValueOf2 = null;
        }
        c750740Tce.LJIIIIZZ = C500260Jjc.LJJJI(boolValueOf2);
        UserAttr userAttr3 = user.getUserAttr();
        if (userAttr3 != null) {
            map = userAttr3.adminPermissions;
        }
        c750740Tce.LJIIIZ = map;
        c750740Tce.LJIIJ = str;
        return c750740Tce;
    }

    public static C750740Tce LIZ(C750550TcL c750550TcL, boolean z, boolean z2) {
        long jLongValue;
        Long l = c750550TcL.LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String str = c750550TcL.LIZIZ;
        if (str == null) {
            str = "";
        }
        C750740Tce c750740Tce = new C750740Tce(jLongValue, str, c750550TcL.LIZJ, c750550TcL.LIZLLL, c750550TcL.LJ, null);
        c750740Tce.LJII = z;
        c750740Tce.LJIIIIZZ = z2;
        return c750740Tce;
    }
}
