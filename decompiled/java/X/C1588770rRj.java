package X;

import Y.ARunnableS93S0200000_24;
import com.ss.android.ugc.aweme.cache.FollowingFeedCacheService;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588770rRj implements Function1<List<FollowFeedApiV2.FollowingFeedCheckModel>, Unit> {
    public final /* synthetic */ FollowFeed LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1588840rRq LLILLL;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<FollowFeedApiV2.FollowingFeedCheckModel> list) {
        List<FollowFeedApiV2.FollowingFeedCheckModel> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            C1588800rRm.LIZ(this.LL.getAweme().getAwemeType(), "check_success", true, false, this.LL.isFromPreload(), this.LLILLJJLI);
            return null;
        }
        this.LLILLL.LLJILLL = false;
        r1.LLIZLLLIL--;
        FollowingFeedCacheService.LIZIZ = null;
        C786410Ut5.LJLIIL(1000L, C799570VYd.LIZJ(), new ARunnableS93S0200000_24(this, this.LL, 11));
        C1588800rRm.LIZ(this.LL.getAweme().getAwemeType(), "check_invalid", true, true, this.LL.isFromPreload(), this.LLILLJJLI);
        return null;
    }

    public C1588770rRj(C1588840rRq c1588840rRq, FollowFeed followFeed, boolean z) {
        this.LLILLL = c1588840rRq;
        this.LL = followFeed;
        this.LLILLJJLI = z;
    }
}
