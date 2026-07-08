package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.0Tg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752860Tg4 {
    public final User LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final ImageModel LJI;
    public final User.EnigmaInfo LJII;

    public C752860Tg4(User user, String str) {
        long id;
        ImageModel avatarThumb;
        String nickName;
        String displayId;
        String secUid;
        this.LIZ = user;
        this.LIZIZ = str;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        this.LIZJ = id;
        String str2 = "";
        this.LIZLLL = (user == null || (secUid = user.getSecUid()) == null) ? "" : secUid;
        this.LJ = (user == null || (displayId = user.getDisplayId()) == null) ? "" : displayId;
        if (user != null && (nickName = user.getNickName()) != null) {
            str2 = nickName;
        }
        this.LJFF = str2;
        if (user != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        this.LJI = avatarThumb;
        this.LJII = user != null ? user.enigmaInfo : null;
    }
}
