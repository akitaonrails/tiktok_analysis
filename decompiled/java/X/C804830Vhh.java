package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedDBEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.repo.FriendsV3DBSource$loadCacheAsync$2$entity$1", f = "FriendsV3DBSource.kt", l = {125}, m = "invokeSuspend")
public final class C804830Vhh extends C09AX implements Function2<C0VM7, InterfaceC1364105Vn<? super List<? extends FriendsV3FeedDBEntity>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C804830Vhh(String str, InterfaceC1364105Vn<? super C804830Vhh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C804830Vhh c804830Vhh = new C804830Vhh(this.LLILLL, interfaceC1364105Vn);
        c804830Vhh.LLILLJJLI = obj;
        return c804830Vhh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3DBSource@5913.loadCacheAsync$2$entity$1");
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
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0vm7.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FriendsV3DBSource@5913.loadCacheAsync$2$entity$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FriendsV3DBSource@5913.loadCacheAsync$2$entity$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0VM7 c0vm7, InterfaceC1364105Vn<? super List<? extends FriendsV3FeedDBEntity>> interfaceC1364105Vn) {
        return ((a) create(c0vm7, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
