package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: renamed from: X.0faQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132880faQ {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;

    public final User LIZ() {
        User user = new User();
        user.setId(this.LIZ);
        user.setSecUid(this.LIZIZ);
        user.setNickName(this.LIZJ);
        user.setDisplayId(this.LIZLLL);
        user.setAvatarThumb(this.LJ);
        return user;
    }

    public C1132880faQ(long j, String str, String str2, String str3, ImageModel imageModel) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = imageModel;
    }
}
