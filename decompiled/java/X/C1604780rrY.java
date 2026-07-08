package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.SocPubStatus;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0rrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604780rrY {
    public static final C1604780rrY LIZ = new C1604780rrY();

    public static void LIZ(StoryStatusResponse storyStatusResponse, String str) {
        UserAllStoryMetadata userAllStoryMetadata;
        int iIntValue;
        List<SocPubStatus> list = storyStatusResponse.statusList;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            SocPubStatus socPubStatus = (SocPubStatus) ListProtector.get(list, i3);
            List<UserAllStoryMetadata> list2 = storyStatusResponse.allStoryMetadata;
            if (list2 != null) {
                userAllStoryMetadata = (UserAllStoryMetadata) C13LP.LJJJLZIJ(i3, list2);
            } else {
                userAllStoryMetadata = null;
            }
            User user = new User();
            user.setUid(socPubStatus.uid);
            Integer num = socPubStatus.status;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            user.setStoryStatus(iIntValue);
            user.setAllStoryMetadata(userAllStoryMetadata);
            arrayList.add(user);
            Integer num2 = socPubStatus.status;
            if (num2 != null && num2.intValue() == 0) {
                i2++;
            } else {
                i++;
            }
        }
        C1606010rtX.LIZIZ.LIZLLL(EnumC1615506Uf.STORY, EnumC1606080rte.FEED, arrayList, storyStatusResponse.filterStoryInfo, AnonymousClass0207.get$arr$(157));
        if (i == 0 && i2 == 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "match_count");
        c2344009Gk.LIZJ(i2, "unmatch_count");
        C20684815ws.LJIILLIIL("feed_avatar_ring_verify_check", c2344009Gk.LIZ);
    }
}
