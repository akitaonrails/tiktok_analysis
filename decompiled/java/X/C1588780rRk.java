package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.cache.FollowingFeedAssem;
import com.ss.android.ugc.aweme.cache.FollowingFeedCacheService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588780rRk extends C09AY implements Function1<List<? extends FollowFeedApiV2.FollowingFeedCheckModel>, Unit> {
    public final /* synthetic */ FollowingFeedAssem LL;
    public final /* synthetic */ List<FollowFeed> LLILLJJLI;
    public final /* synthetic */ FollowingFeedCacheService.FollowingCache LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1588780rRk(FollowingFeedAssem followingFeedAssem, List<? extends FollowFeed> list, FollowingFeedCacheService.FollowingCache followingCache) {
        super(1);
        this.LL = followingFeedAssem;
        this.LLILLJJLI = list;
        this.LLILLL = followingCache;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends FollowFeedApiV2.FollowingFeedCheckModel> list) {
        String str;
        List<? extends FollowFeedApiV2.FollowingFeedCheckModel> list2 = list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends FollowFeedApiV2.FollowingFeedCheckModel> it2 = list2.iterator();
        while (true) {
            String str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            FollowFeedApiV2.FollowingFeedCheckModel next = it2.next();
            if (next != null && (str = next.itemId) != null) {
                str2 = str;
            }
            arrayList.add(str2);
        }
        if (arrayList.isEmpty()) {
            FollowingFeedCacheService.LIZIZ = null;
            this.LL.LLILLJJLI.invoke("check_invalid");
        } else {
            List<FollowFeed> list3 = this.LLILLJJLI;
            ArrayList arrayList2 = new ArrayList();
            for (FollowFeed followFeed : list3) {
                if (Intrinsics.LJFF(followFeed.getAweme().getAid(), C13LP.LJJJJZI(arrayList))) {
                    arrayList2.add(followFeed);
                }
            }
            Aweme aweme = ((C0PLT) ListProtector.get(arrayList2, 0)).getAweme();
            this.LLILLL.data.setItems(arrayList2);
            this.LLILLL.setHasCacheCheckedByServer(true);
            AtomicBoolean atomicBoolean = FollowingFeedCacheService.LIZ;
            FollowingFeedCacheService.LIZIZ = this.LLILLL;
            C1588800rRm.LIZIZ = "check_success";
            C1588800rRm.LIZIZ("check_success", "", true, false);
            C1483340ohg.LJIL(0, aweme);
            C20673215v0.LJI(R.layout.c7v, C724240Sb0.LIZ(this.LL));
        }
        return Unit.LIZ;
    }
}
