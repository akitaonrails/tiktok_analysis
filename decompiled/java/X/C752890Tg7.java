package X;

import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.0Tg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752890Tg7 {
    public static final C752860Tg4 LIZ(C750550TcL c750550TcL, boolean z) {
        long jLongValue;
        User user = new User();
        Long l = c750550TcL.LIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        user.setId(jLongValue);
        user.setSecUid(c750550TcL.LIZIZ);
        user.setDisplayId(c750550TcL.LIZLLL);
        user.setNickName(c750550TcL.LIZJ);
        user.setAvatarThumb(c750550TcL.LJ);
        user.isAnchorMarked = z;
        return new C752860Tg4(user, "");
    }
}
