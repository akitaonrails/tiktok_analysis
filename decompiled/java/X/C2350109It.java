package X;

import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cache.FollowingCacheHelper$removeFeedForHasRead$1", f = "FollowingCacheHelper.kt", l = {}, m = "invokeSuspend")
public final class C2350109It extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2350109It(String str, InterfaceC1364105Vn<? super C2350109It> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2350109It(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FollowFeedList followFeedListLIZIZ;
        C1C7U.LIZ("FollowingCacheHelper@7e7c.removeFeedForHasRead$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        synchronized (C2349909Ir.LIZ) {
            followFeedListLIZIZ = C2349909Ir.LIZIZ();
        }
        if (followFeedListLIZIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowingCacheHelper@7e7c.removeFeedForHasRead$1");
            return unit;
        }
        List<FollowFeed> items = followFeedListLIZIZ.getItems();
        String str = this.LL;
        Iterator<FollowFeed> it2 = items.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            FollowFeed next = it2.next();
            FollowFeed followFeed = next;
            if (followFeed != null && followFeed.getAweme() != null && Intrinsics.LJFF(followFeed.getAweme().getAid(), str)) {
                if (next != null) {
                    followFeedListLIZIZ.getItems().remove(next);
                    C2349909Ir.LIZ.LIZLLL(followFeedListLIZIZ);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("FollowingCacheHelper@7e7c.removeFeedForHasRead$1");
                    return unit2;
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("FollowingCacheHelper@7e7c.removeFeedForHasRead$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
