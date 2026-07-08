package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedDBEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource$updateDBUserFeeds$2$1", f = "FriendsV3DBSource.kt", l = {82}, m = "invokeSuspend")
public final class C804820Vhg extends C09AX implements Function2<C0VM7, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FriendsV3FeedDBEntity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804820Vhg(FriendsV3FeedDBEntity friendsV3FeedDBEntity, InterfaceC1364105Vn<? super C804820Vhg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = friendsV3FeedDBEntity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C804820Vhg c804820Vhg = new C804820Vhg(this.LLILLL, interfaceC1364105Vn);
        c804820Vhg.LLILLJJLI = obj;
        return c804820Vhg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3DBSource@5913.updateDBUserFeeds$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0VM7 c0vm7 = (C0VM7) this.LLILLJJLI;
            FriendsV3FeedDBEntity friendsV3FeedDBEntity = this.LLILLL;
            this.LL = 1;
            if (c0vm7.LIZJ(friendsV3FeedDBEntity, this) == objLJFF) {
                C1C7U.LIZIZ("FriendsV3DBSource@5913.updateDBUserFeeds$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3DBSource@5913.updateDBUserFeeds$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0VM7 c0vm7, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0vm7, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
