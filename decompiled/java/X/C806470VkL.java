package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.repo.FeedPageToken;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedDBEntity;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3RepostModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0VkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource$loadCacheAsync$2", f = "FriendsV3DBSource.kt", l = {125}, m = "invokeSuspend")
public final class C806470VkL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super FriendsV3FeedResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806470VkL(String str, InterfaceC1364105Vn<? super C806470VkL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C806470VkL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FriendsV3FeedDBEntity friendsV3FeedDBEntity;
        FriendsV3FeedModel friendsV3FeedModel;
        FeedPageToken feedPageToken;
        Aweme aweme;
        Long lLJIILIIL;
        MatchedFriendStruct matchedFriendStruct;
        Object c098200Yq;
        FriendsV3RepostModel friendsV3RepostModel;
        long jLongValue;
        Long lLJIILIIL2;
        MatchedFriendStruct matchedFriendStruct2;
        User author;
        boolean z;
        User author2;
        C806600VkY c806600VkY;
        C806600VkY c806600VkY2;
        Object next;
        boolean z2;
        Object objLIZIZ = obj;
        C1C7U.LIZ("FriendsV3DBSource@5913.loadCacheAsync$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        String str = null;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C806500VkO c806500VkO = C806500VkO.LIZ;
            c806500VkO.getClass();
            C0VM7 c0vm7 = (C0VM7) C806500VkO.LIZLLL.getValue();
            C804830Vhh c804830Vhh = new C804830Vhh(this.LLILLJJLI, null);
            this.LL = 1;
            objLIZIZ = c806500VkO.LIZIZ(c0vm7, c804830Vhh, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("FriendsV3DBSource@5913.loadCacheAsync$2");
                return objLJFF;
            }
        }
        List list = (List) objLIZIZ;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((FriendsV3FeedDBEntity) next).LIZIZ != null && (!r1.isEmpty())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            friendsV3FeedDBEntity = (FriendsV3FeedDBEntity) next;
        } else {
            friendsV3FeedDBEntity = null;
        }
        if (friendsV3FeedDBEntity == null) {
            C01GW c01gw = C806480VkM.LIZ;
            if (C1206704np.LIZ()) {
                Object obj3 = C806480VkM.LIZ().get(C13LE.LIZ(C806600VkY.class));
                if (!(obj3 instanceof C806600VkY)) {
                    obj3 = null;
                }
                c806600VkY2 = (C806600VkY) obj3;
            } else {
                c806600VkY2 = null;
            }
            if (c806600VkY2 != null) {
                c806600VkY2.LIZLLL(0);
            }
            C0W17.LIZJ("DB", "getDBFeeds, empty result from db");
            C1C7U.LIZIZ("FriendsV3DBSource@5913.loadCacheAsync$2");
            return null;
        }
        List<FriendsV3FeedModel> list2 = friendsV3FeedDBEntity.LIZIZ;
        if (list2 != null) {
            friendsV3FeedModel = (FriendsV3FeedModel) C13LP.LJJLIIIJL(list2);
        } else {
            friendsV3FeedModel = null;
        }
        if (friendsV3FeedModel == null) {
            C01GW c01gw2 = C806480VkM.LIZ;
            if (C1206704np.LIZ()) {
                Object obj4 = C806480VkM.LIZ().get(C13LE.LIZ(C806600VkY.class));
                if (!(obj4 instanceof C806600VkY)) {
                    obj4 = null;
                }
                c806600VkY = (C806600VkY) obj4;
            } else {
                c806600VkY = null;
            }
            if (c806600VkY != null) {
                c806600VkY.LIZLLL(-1);
            }
            C0W17.LIZ("DB", "getDBFeeds, invalid lastItem in PO");
            C1C7U.LIZIZ("FriendsV3DBSource@5913.loadCacheAsync$2");
            return null;
        }
        List<FriendsV3FeedModel> list3 = friendsV3FeedDBEntity.LIZIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<FriendsV3FeedModel> it3 = list3.iterator();
        while (it3.hasNext()) {
            Aweme aweme2 = it3.next().aweme;
            if (aweme2 != null) {
                author2 = aweme2.getAuthor();
            } else {
                author2 = null;
            }
            if (author2 != null) {
                arrayList.add(author2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (((User) obj5).getMatchedFriendStruct() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(obj5);
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Pair pair = new Pair(((User) it4.next()).getUid(), true);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        if (friendsV3FeedModel.feedType == EnumC806560VkU.REPOST.getType() && (friendsV3RepostModel = friendsV3FeedModel.repostItem) != null) {
            Long l = friendsV3RepostModel.repostTime;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            String str2 = friendsV3FeedModel.repostItem.repostId;
            if (str2 != null) {
                lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
            } else {
                lLJIILIIL2 = null;
            }
            Integer numLJ = C2286608xc.LJ(friendsV3FeedDBEntity.LIZIZ.size());
            int size = linkedHashMap.size();
            Aweme aweme3 = friendsV3FeedModel.aweme;
            if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                matchedFriendStruct2 = author.getMatchedFriendStruct();
            } else {
                matchedFriendStruct2 = null;
            }
            if (matchedFriendStruct2 != null) {
                z3 = false;
            }
            feedPageToken = new FeedPageToken(jLongValue, lLJIILIIL2, numLJ, Boolean.TRUE, linkedHashMap, size, Boolean.valueOf(z3));
        } else if (friendsV3FeedModel.feedType == EnumC806560VkU.AWEME.getType() && (aweme = friendsV3FeedModel.aweme) != null) {
            long createTime = aweme.getCreateTime();
            String aid = friendsV3FeedModel.aweme.getAid();
            if (aid != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(aid);
            } else {
                lLJIILIIL = null;
            }
            Integer numLJ2 = C2286608xc.LJ(friendsV3FeedDBEntity.LIZIZ.size());
            int size2 = linkedHashMap.size();
            User author3 = friendsV3FeedModel.aweme.getAuthor();
            if (author3 != null) {
                matchedFriendStruct = author3.getMatchedFriendStruct();
            } else {
                matchedFriendStruct = null;
            }
            if (matchedFriendStruct != null) {
                z3 = false;
            }
            feedPageToken = new FeedPageToken(createTime, lLJIILIIL, numLJ2, Boolean.TRUE, linkedHashMap, size2, Boolean.valueOf(z3));
        } else {
            C0W17.LIZ("DB", "getDBFeeds, invalid lastItem");
            feedPageToken = null;
        }
        if (feedPageToken != null) {
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = C1227904rF.LJI(feedPageToken);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            str = (String) obj2;
        }
        FriendsV3FeedResponse friendsV3FeedResponse = new FriendsV3FeedResponse(friendsV3FeedDBEntity.LIZIZ, Boolean.valueOf(friendsV3FeedDBEntity.LIZJ), str, Boolean.FALSE, null, null, null, null, EnumC1586890rOh.UNKNOWN.getDataLevel(), 0, friendsV3FeedDBEntity.logPb);
        C1C7U.LIZIZ("FriendsV3DBSource@5913.loadCacheAsync$2");
        return friendsV3FeedResponse;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super FriendsV3FeedResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
