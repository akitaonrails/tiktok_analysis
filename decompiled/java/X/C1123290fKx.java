package X;

import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.0fKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123290fKx {
    public static final C1132880faQ LIZ(User user) {
        String displayId;
        String nickName = user.getNickName();
        if (nickName == null || nickName.length() == 0 || (displayId = user.getDisplayId()) == null || displayId.length() == 0) {
            C20441214yg.LJ("GiftUser", "nickName or DisplayId null !!!");
        }
        long id = user.getId();
        String secUid = user.getSecUid();
        String str = "";
        if (secUid == null) {
            secUid = "";
        }
        String nickName2 = user.getNickName();
        if (nickName2 == null) {
            nickName2 = "";
        }
        String displayId2 = user.getDisplayId();
        if (displayId2 != null) {
            str = displayId2;
        }
        return new C1132880faQ(id, secUid, nickName2, str, user.getAvatarThumb());
    }
}
