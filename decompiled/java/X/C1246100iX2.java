package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0iX2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246100iX2 {
    public static final C1246110iX3 LIZ(MutualStruct mutualStruct) {
        int i;
        UrlModel avatarThumb;
        ArrayList arrayList = new ArrayList();
        List<MutualUser> list = mutualStruct.userList;
        if (list != null) {
            for (MutualUser mutualUser : list) {
                if (mutualUser != null && ((avatarThumb = mutualUser.getAvatarThumb()) != null || (avatarThumb = mutualUser.getAvatarMedium()) != null)) {
                    arrayList.add(avatarThumb);
                }
            }
        }
        if (arrayList.isEmpty() || (i = mutualStruct.total) <= 0) {
            return null;
        }
        return new C1246110iX3(arrayList, i);
    }

    public static final C1246110iX3 LIZIZ(MatchedFriendStruct matchedFriendStruct) {
        MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
        if (mutualStruct != null) {
            return LIZ(mutualStruct);
        }
        return null;
    }
}
