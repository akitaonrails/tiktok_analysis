package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.feed.CollectProfileListFragment;

/* JADX INFO: renamed from: X.0ipe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257640ipe {
    public static CollectProfileListFragment LIZ(User user, String str, boolean z, boolean z2) {
        CollectProfileListFragment collectProfileListFragment = new CollectProfileListFragment();
        collectProfileListFragment.LLIZ = user;
        collectProfileListFragment.LLIZLLLIL = z;
        collectProfileListFragment.LLILLL = str;
        collectProfileListFragment.LLJ = z2;
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) collectProfileListFragment.LLJJI.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectProfileListFragment instance user: ");
        sbLIZ.append(user);
        sbLIZ.append(", isMyProfile: ");
        sbLIZ.append(z);
        sbLIZ.append(", isFromMain: ");
        sbLIZ.append(z2);
        abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ));
        return collectProfileListFragment;
    }
}
