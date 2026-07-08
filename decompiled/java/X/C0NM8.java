package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabLocalCacheConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NM8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.cache.FriendsFeedRespCacheManager$insertFriendsFeed$2$1", f = "FriendsFeedRespCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C0NM8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ FriendsFeedResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NM8(int i, int i2, FriendsFeedResponse friendsFeedResponse, InterfaceC1364105Vn<? super C0NM8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = friendsFeedResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NM8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        FriendsFeedResponse friendsFeedResponse;
        int size;
        ?? arrayList;
        List<FriendsFeed> listSubList;
        String aid;
        String aid2;
        List<FriendsFeed> listSubList2;
        C1C7U.LIZ("FriendsFeedRespCacheManager@9ed8.insertFriendsFeed$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i2 = this.LL;
        int i3 = this.LLILLJJLI;
        FriendsFeedResponse friendsFeedResponse2 = this.LLILLL;
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i4 = ((FriendsTabLocalCacheConfig) C310660CFs.LIZIZ.getValue()).cachedFeedSize;
            if (i2 > i4) {
                i = i4;
            } else {
                i = i2;
            }
            if (i3 == C0NMC.REFRESH.getType()) {
                C0NMA.LIZ.getClass();
                C01GW c01gw = C0NMA.LIZIZ;
                ((C0NM9) c01gw.getValue()).LIZJ(curUserId);
                ArrayList arrayList2 = new ArrayList();
                List<FriendsFeed> list = friendsFeedResponse2.friendFeedData;
                if (list != null && (listSubList2 = list.subList(0, i)) != null) {
                    Boolean.valueOf(arrayList2.addAll(listSubList2));
                }
                friendsFeedResponse2.friendFeedData = arrayList2;
                ((C0NM9) c01gw.getValue()).LIZ(new C0NMB(curUserId, friendsFeedResponse2, jCurrentTimeMillis));
            } else if (i3 == C0NMC.LOADMORE.getType()) {
                C0NMA.LIZ.getClass();
                C0NMB c0nmbLIZ = C0NMA.LIZ();
                if (c0nmbLIZ != null && (friendsFeedResponse = c0nmbLIZ.LIZIZ) != null) {
                    List<FriendsFeed> list2 = friendsFeedResponse.friendFeedData;
                    if (list2 != null) {
                        size = list2.size();
                    } else {
                        size = 0;
                    }
                    if (friendsFeedResponse.friendFeedData != null) {
                        if (size < i4) {
                            int i5 = i4 - size;
                            if (i2 > i5) {
                                i2 = i5;
                            }
                            List<FriendsFeed> list3 = friendsFeedResponse.friendFeedData;
                            if (list3 != null) {
                                arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                                Iterator<FriendsFeed> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    Aweme aweme = it2.next().getAweme();
                                    if (aweme == null || (aid2 = aweme.getAid()) == null) {
                                        aid2 = "";
                                    }
                                    arrayList.add(aid2);
                                }
                            } else {
                                arrayList = C13BV.INSTANCE;
                            }
                            List<FriendsFeed> list4 = friendsFeedResponse2.friendFeedData;
                            if (list4 != null && (listSubList = list4.subList(0, i2)) != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (FriendsFeed friendsFeed : listSubList) {
                                    Aweme aweme2 = friendsFeed.getAweme();
                                    if (aweme2 != null) {
                                        aid = aweme2.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (!C13LP.LJJJJ(aid, arrayList)) {
                                        arrayList3.add(friendsFeed);
                                    }
                                }
                                List<FriendsFeed> list5 = friendsFeedResponse.friendFeedData;
                                if (list5 != null) {
                                    Boolean.valueOf(list5.addAll(arrayList3));
                                }
                            }
                            friendsFeedResponse.hasMore = friendsFeedResponse2.hasMore;
                            C0NMA.LIZ.getClass();
                            ((C0NM9) C0NMA.LIZIZ.getValue()).LIZ(new C0NMB(curUserId, friendsFeedResponse, jCurrentTimeMillis));
                        } else {
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("FriendsFeedRespCacheManager@9ed8.insertFriendsFeed$2$1");
                            return unit;
                        }
                    }
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FriendsFeedRespCacheManager@9ed8.insertFriendsFeed$2$1");
                return unit2;
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "FriendsFeedCache");
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("FriendsFeedRespCacheManager@9ed8.insertFriendsFeed$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
