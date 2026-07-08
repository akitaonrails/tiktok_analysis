package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140410fmZ {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(C1135280feI c1135280feI) {
        ImageModel avatarThumb;
        User user;
        User user2;
        ArrayList arrayList = new ArrayList();
        ImageModel avatarThumb2 = null;
        if (c1135280feI != null && (user2 = c1135280feI.LJIIIZ) != null) {
            avatarThumb = user2.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        arrayList.add(avatarThumb);
        if (c1135280feI != null && (user = c1135280feI.LJIIJJI) != null) {
            avatarThumb2 = user.getAvatarThumb();
        }
        arrayList.add(avatarThumb2);
        return arrayList;
    }
}
