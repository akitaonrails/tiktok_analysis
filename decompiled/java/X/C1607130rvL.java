package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.List;

/* JADX INFO: renamed from: X.0rvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607130rvL implements InterfaceC1608870ry9<AbstractC427610Gpj, C1606300ru0>, InterfaceC1608830ry5<AbstractC427610Gpj, C1606300ru0> {
    @Override // X.InterfaceC1608830ry5
    public final InterfaceC1606880ruw LIZLLL(Object obj) {
        User user;
        UrlModel urlModel;
        List<Integer> list = null;
        if (!(obj instanceof User) || (user = (User) obj) == null) {
            return null;
        }
        UserAllStoryMetadata allStoryMetadata = user.getAllStoryMetadata();
        if (allStoryMetadata != null) {
            list = allStoryMetadata.storyCelebrationList;
        }
        UserAllStoryMetadata allStoryMetadata2 = user.getAllStoryMetadata();
        if (allStoryMetadata2 != null && (urlModel = allStoryMetadata2.storyBadgeUrl) != null) {
            return new C427600Gpi(list, urlModel);
        }
        return new AbstractC427610Gpj() { // from class: X.0Gpk
            public final String LL = "no_story_celebration";

            @Override // X.InterfaceC1606880ruw
            public final String getString() {
                return this.LL;
            }
        };
    }
}
