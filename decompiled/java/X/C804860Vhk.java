package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedDBEntity;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource$updateDBUserFeeds$2", f = "FriendsV3DBSource.kt", l = {81}, m = "invokeSuspend")
public final class C804860Vhk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FriendsV3FeedResponse LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804860Vhk(FriendsV3FeedResponse friendsV3FeedResponse, String str, InterfaceC1364105Vn<? super C804860Vhk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3FeedResponse;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C804860Vhk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        FriendsV3FeedDBEntity friendsV3FeedDBEntity;
        List<FriendsV3FeedModel> list;
        LogPbBean logPbBean;
        List<FriendsV3FeedModel> listSubList;
        LogPbBean logPbBean2;
        List<FriendsV3FeedModel> list2;
        List<FriendsV3FeedModel> list3;
        Object objLIZIZ = obj;
        C1C7U.LIZ("FriendsV3DBSource@5913.updateDBUserFeeds$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            FriendsV3FeedResponse friendsV3FeedResponse = this.LLILLJJLI;
            boolean zBooleanValue = false;
            if (friendsV3FeedResponse != null && (list3 = friendsV3FeedResponse.friendsV3Feeds) != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            int i2 = C806500VkO.LJFF;
            String str = "";
            if (size > i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateFeedsDB, list size over length, limit=");
                sbLIZ.append(i2);
                C0W17.LIZJ("DB", C2188811AlT.LIZIZ(sbLIZ));
                String str2 = this.LLILLL;
                if (str2 != null) {
                    str = str2;
                }
                FriendsV3FeedResponse friendsV3FeedResponse2 = this.LLILLJJLI;
                if (friendsV3FeedResponse2 != null && (list2 = friendsV3FeedResponse2.friendsV3Feeds) != null) {
                    listSubList = list2.subList(0, i2);
                } else {
                    listSubList = null;
                }
                FriendsV3FeedResponse friendsV3FeedResponse3 = this.LLILLJJLI;
                if (friendsV3FeedResponse3 != null) {
                    logPbBean2 = friendsV3FeedResponse3.logPb;
                } else {
                    logPbBean2 = null;
                }
                friendsV3FeedDBEntity = new FriendsV3FeedDBEntity(str, listSubList, true, logPbBean2, System.currentTimeMillis());
            } else {
                String str3 = this.LLILLL;
                if (str3 != null) {
                    str = str3;
                }
                FriendsV3FeedResponse friendsV3FeedResponse4 = this.LLILLJJLI;
                if (friendsV3FeedResponse4 != null) {
                    list = friendsV3FeedResponse4.friendsV3Feeds;
                    Boolean bool = friendsV3FeedResponse4.hasMore;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                } else {
                    list = null;
                }
                FriendsV3FeedResponse friendsV3FeedResponse5 = this.LLILLJJLI;
                if (friendsV3FeedResponse5 != null) {
                    logPbBean = friendsV3FeedResponse5.logPb;
                } else {
                    logPbBean = null;
                }
                friendsV3FeedDBEntity = new FriendsV3FeedDBEntity(str, list, zBooleanValue, logPbBean, System.currentTimeMillis());
            }
            C806500VkO c806500VkO = C806500VkO.LIZ;
            c806500VkO.getClass();
            C0VM7 c0vm7 = (C0VM7) C806500VkO.LIZLLL.getValue();
            C804820Vhg c804820Vhg = new C804820Vhg(friendsV3FeedDBEntity, null);
            this.LL = 1;
            objLIZIZ = c806500VkO.LIZIZ(c0vm7, c804820Vhg, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("FriendsV3DBSource@5913.updateDBUserFeeds$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FriendsV3DBSource@5913.updateDBUserFeeds$2");
        return objLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
